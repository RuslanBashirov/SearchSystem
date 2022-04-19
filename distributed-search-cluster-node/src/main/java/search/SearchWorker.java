package search;

import model.DocumentData;
import model.Result;
import model.SerializationUtils;
import model.Task;
import networking.OnRequestCallback;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SearchWorker implements OnRequestCallback {
    private static final String ENDPOINT = "/task";

    public byte[] handleRequest(byte[] requestPayload) {
        Task task = (Task) SerializationUtils.deserialize(requestPayload);
        System.out.println("!!!!urls to process = " + task.getDocuments());
        Result result = createResult(task);
        return SerializationUtils.serialize(result);
    }

    @Override
    public String getEndpoint() {
        return ENDPOINT;
    }

    private Result createResult(Task task) {
        List<String> documents = task.getDocuments();
        System.out.println(String.format("Received %d documents to process", documents.size()));
        Result result = new Result();

        for (String document : documents) {
            System.out.println("processing url = " + document);
            List<String> words = parseWordsFromDocument(document);
            DocumentData documentData = TFIDF.createDocumentData(words, task.getSearchTerms());
            result.addDocumentData(document, documentData);
        }
        return result;
    }

//    private List<String> parseWordsFromDocument(String document) {
//        FileReader fileReader = null;
//        try {
//            fileReader = new FileReader(document);
//        } catch (FileNotFoundException e) {
//            return Collections.emptyList();
//        }
//
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
//        List<String> words = TFIDF.getWordsFromDocument(lines);
//        return words;
//    }

    public List<String> parseWordsFromDocument(String url) {
        Document document = null;
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            System.out.println("Exception in getting document from url");
        }
        List<String> text = Arrays.stream(document.body().text().split(" ")).collect(Collectors.toList());

        return text;
    }
}
