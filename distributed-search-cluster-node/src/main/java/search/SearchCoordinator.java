package search;

import cluster.management.ServiceRegistry;
import com.google.protobuf.InvalidProtocolBufferException;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ReadPreference;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import model.DocumentData;
import model.Result;
import model.SerializationUtils;
import model.Task;
import model.proto.SearchModel;
import networking.OnRequestCallback;
import networking.WebClient;
import org.apache.kafka.common.protocol.types.Field;
import org.apache.zookeeper.KeeperException;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import static com.mongodb.client.model.Filters.eq;

public class SearchCoordinator implements OnRequestCallback {
    private static final String ENDPOINT = "/search";
    private static final String URL = "https://moz.com/top500";
    private static final String MONGO_DB_URL = "mongodb://127.0.0.1:9099,127.0.0.1:9100/?replicaSet=rs0";
    private static final String DB_NAME = "terms";
    private final ServiceRegistry workersServiceRegistry;
    private final WebClient client;
    private List<String> documents = null;

    public SearchCoordinator(ServiceRegistry workersServiceRegistry, WebClient client) {
        this.workersServiceRegistry = workersServiceRegistry;
        this.client = client;
        this.documents = getListOfWebsites(URL);

    }

    public byte[] handleRequest(byte[] requestPayload) {
        try {
            SearchModel.Request request = SearchModel.Request.parseFrom(requestPayload);
            SearchModel.Response response = createResponse(request);

            return response.toByteArray();
        } catch (InvalidProtocolBufferException | KeeperException | InterruptedException e) {
            e.printStackTrace();
            return SearchModel.Response.getDefaultInstance().toByteArray();
        }
    }

    @Override
    public String getEndpoint() {
        return ENDPOINT;
    }

    private SearchModel.Response createResponse(SearchModel.Request searchRequest) throws KeeperException, InterruptedException {
        SearchModel.Response.Builder searchResponse = SearchModel.Response.newBuilder();

        System.out.println("Received search query: " + searchRequest.getSearchQuery());

        List<String> searchTerms = TFIDF.getWordsFromLine(searchRequest.getSearchQuery());

        //saveTermsInDb(searchTerms);

        List<String> workers = workersServiceRegistry.getAllServiceAddresses();

        if (workers.isEmpty()) {
            System.out.println("No search workers currently available");
            return searchResponse.build();
        }

        List<Task> tasks = createTasks(workers.size(), searchTerms);
        List<Result> results = sendTasksToWorkers(workers, tasks);

        List<SearchModel.Response.DocumentStats> sortedDocuments = aggregateResults(results, searchTerms);
        searchResponse.addAllRelevantDocuments(sortedDocuments);

        return searchResponse.build();
    }

    private List<SearchModel.Response.DocumentStats> aggregateResults(List<Result> results, List<String> terms) {
        Map<String, DocumentData> allDocumentsResults = new HashMap<>();

        for (Result result : results) {
            allDocumentsResults.putAll(result.getDocumentToDocumentData());
        }

        System.out.println("Calculating score for all the documents");
        Map<Double, List<String>> scoreToDocuments = TFIDF.getDocumentsScores(terms, allDocumentsResults);

        return sortDocumentsByScore(scoreToDocuments);
    }

    private List<SearchModel.Response.DocumentStats> sortDocumentsByScore(Map<Double, List<String>> scoreToDocuments) {
        List<SearchModel.Response.DocumentStats> sortedDocumentsStatsList = new ArrayList<>();

        for (Map.Entry<Double, List<String>> docScorePair : scoreToDocuments.entrySet()) {
            double score = docScorePair.getKey();

            for (String document : docScorePair.getValue()) {
                File documentPath = new File(document);

                SearchModel.Response.DocumentStats documentStats = SearchModel.Response.DocumentStats.newBuilder()
                        .setScore(score)
                        .setDocumentName(documentPath.getName())
                        .setDocumentSize(documentPath.length())
                        .build();

                sortedDocumentsStatsList.add(documentStats);
            }
        }

        return sortedDocumentsStatsList;
    }

    private List<Result> sendTasksToWorkers(List<String> workers, List<Task> tasks) {
        CompletableFuture<Result>[] futures = new CompletableFuture[workers.size()];
        for (int i = 0; i < workers.size(); i++) {
            String worker = workers.get(i);
            Task task = tasks.get(i);
            byte[] payload = SerializationUtils.serialize(task);

            futures[i] = client.sendTask(worker, payload);
        }

        List<Result> results = new ArrayList<>();
        for (CompletableFuture<Result> future : futures) {
            try {
                Result result = future.get();
                results.add(result);
            } catch (InterruptedException | ExecutionException e) {
            }
        }
        System.out.println(String.format("Received %d/%d results", results.size(), tasks.size()));
        return results;
    }

    public List<Task> createTasks(int numberOfWorkers, List<String> searchTerms) {
        //List<List<String>> workersDocuments = splitDocumentList(numberOfWorkers, documents);
        List<List<String>> websites = splitDocumentList(numberOfWorkers, documents);

        List<Task> tasks = new ArrayList<>();

        for (List<String> documentsForWorker : websites) {
            Task task = new Task(searchTerms, documentsForWorker);
            tasks.add(task);
        }

        return tasks;
    }

    private static List<List<String>> splitDocumentList(int numberOfWorkers, List<String> documents) {
        int numberOfDocumentsPerWorker = (documents.size() + numberOfWorkers - 1) / numberOfWorkers;

        List<List<String>> workersDocuments = new ArrayList<>();

        for (int i = 0; i < numberOfWorkers; i++) {
            int firstDocumentIndex = i * numberOfDocumentsPerWorker;
            int lastDocumentIndexExclusive = Math.min(firstDocumentIndex + numberOfDocumentsPerWorker, documents.size());

            if (firstDocumentIndex >= lastDocumentIndexExclusive) {
                break;
            }
            List<String> currentWorkerDocuments = new ArrayList<>(documents.subList(firstDocumentIndex, lastDocumentIndexExclusive));

            workersDocuments.add(currentWorkerDocuments);
        }
        return workersDocuments;
    }

//    private static List<String> readDocumentsList() {
//        File documentsDirectory = new File(BOOKS_DIRECTORY);
//        return Arrays.asList(documentsDirectory.list())
//                .stream()
//                .map(documentName -> BOOKS_DIRECTORY + "/" + documentName)
//                .collect(Collectors.toList());
//    }

    public static List<String> getListOfWebsites(String url){
        List<String> resultLinks = new ArrayList<>();
        resultLinks.add("https://www.foxnews.com");
        resultLinks.add("https://www.reuters.com");
        resultLinks.add("https://www.indiatoday.in");
        resultLinks.add("https://www.oneindia.com");
        resultLinks.add("https://www.latimes.com");
        resultLinks.add("https://www.usatoday.com");
        resultLinks.add("https://www.sputniknews.com");
//        Document document = null;
//        try {
//            document = Jsoup.connect(url).get();
//        } catch (IOException e) {
//
//        }
//        Elements links = document.select("a[href]");
//        List<String> linkHref=links.eachAttr("href");
//        for (String link: linkHref) {
//            if (link.startsWith("http://") || link.startsWith("https://")) {
//                resultLinks.add(link);
//            }
//        }

        return resultLinks;
    }

    private static void saveTermsInDb(List<String> terms) {
        MongoDatabase termsDb = connectToMongoDb(MONGO_DB_URL, DB_NAME);
        enrollTerms(termsDb, terms);
    }

    private static void enrollTerms(MongoDatabase database, List<String> terms) {
        MongoCollection<Document> termsCollection = database.getCollection("terms")
                .withWriteConcern(WriteConcern.MAJORITY)
                .withReadPreference(ReadPreference.primaryPreferred());
        for (String term: terms) {
            Document document = termsCollection.find(eq("term", term)).first();
            if (document != null) {
                Bson updates = Updates.combine(
                        Updates.set("counter", (int) document.get("counter") + 1)
                );
                termsCollection.updateOne(document, updates);
                int newNumOfTerms = (int) document.get("counter") + 1;
                System.out.println("updated number of counters for term = " + term + " new number of terms is " + newNumOfTerms);
            }
            else {
                termsCollection.insertOne(new Document("term", term).append("counter", 1));
                System.out.println("inserted term = " + term);
            }
        }
    }

    private static MongoDatabase connectToMongoDb(String url, String dbName) {
        MongoClient mongoClient = new MongoClient((new MongoClientURI(url)));
        return mongoClient.getDatabase(dbName);
    }
}
