package model.proto;

public final class SearchModel {
    private SearchModel() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface RequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:distributed.search.Request)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string search_query = 1;</code>
         */
        boolean hasSearchQuery();

        /**
         * <code>required string search_query = 1;</code>
         */
        String getSearchQuery();

        /**
         * <code>required string search_query = 1;</code>
         */
        com.google.protobuf.ByteString
        getSearchQueryBytes();
    }

    /**
     * <pre>
     * request from front end to search coordinator
     * </pre>
     * <p>
     * Protobuf type {@code distributed.search.Request}
     */
    public static final class Request extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:distributed.search.Request)
            RequestOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use Request.newBuilder() to construct.
        private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Request() {
            searchQuery_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private Request(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            searchQuery_ = bs;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return model.proto.SearchModel.internal_static_distributed_search_Request_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return model.proto.SearchModel.internal_static_distributed_search_Request_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            model.proto.SearchModel.Request.class, model.proto.SearchModel.Request.Builder.class);
        }

        private int bitField0_;
        public static final int SEARCH_QUERY_FIELD_NUMBER = 1;
        private volatile Object searchQuery_;

        /**
         * <code>required string search_query = 1;</code>
         */
        public boolean hasSearchQuery() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
         * <code>required string search_query = 1;</code>
         */
        public String getSearchQuery() {
            Object ref = searchQuery_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    searchQuery_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string search_query = 1;</code>
         */
        public com.google.protobuf.ByteString
        getSearchQueryBytes() {
            Object ref = searchQuery_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                searchQuery_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;

        @Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasSearchQuery()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) != 0)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, searchQuery_);
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) != 0)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, searchQuery_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof model.proto.SearchModel.Request)) {
                return super.equals(obj);
            }
            model.proto.SearchModel.Request other = (model.proto.SearchModel.Request) obj;

            if (hasSearchQuery() != other.hasSearchQuery()) return false;
            if (hasSearchQuery()) {
                if (!getSearchQuery()
                        .equals(other.getSearchQuery())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasSearchQuery()) {
                hash = (37 * hash) + SEARCH_QUERY_FIELD_NUMBER;
                hash = (53 * hash) + getSearchQuery().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static model.proto.SearchModel.Request parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static model.proto.SearchModel.Request parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static model.proto.SearchModel.Request parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static model.proto.SearchModel.Request parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static model.proto.SearchModel.Request parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static model.proto.SearchModel.Request parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static model.proto.SearchModel.Request parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static model.proto.SearchModel.Request parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static model.proto.SearchModel.Request parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static model.proto.SearchModel.Request parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static model.proto.SearchModel.Request parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static model.proto.SearchModel.Request parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(model.proto.SearchModel.Request prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * <pre>
         * request from front end to search coordinator
         * </pre>
         * <p>
         * Protobuf type {@code distributed.search.Request}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:distributed.search.Request)
                model.proto.SearchModel.RequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return model.proto.SearchModel.internal_static_distributed_search_Request_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return model.proto.SearchModel.internal_static_distributed_search_Request_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                model.proto.SearchModel.Request.class, model.proto.SearchModel.Request.Builder.class);
            }

            // Construct using model.proto.SearchModel.Request.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @Override
            public Builder clear() {
                super.clear();
                searchQuery_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return model.proto.SearchModel.internal_static_distributed_search_Request_descriptor;
            }

            @Override
            public model.proto.SearchModel.Request getDefaultInstanceForType() {
                return model.proto.SearchModel.Request.getDefaultInstance();
            }

            @Override
            public model.proto.SearchModel.Request build() {
                model.proto.SearchModel.Request result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public model.proto.SearchModel.Request buildPartial() {
                model.proto.SearchModel.Request result = new model.proto.SearchModel.Request(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.searchQuery_ = searchQuery_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return super.clone();
            }

            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.setField(field, value);
            }

            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof model.proto.SearchModel.Request) {
                    return mergeFrom((model.proto.SearchModel.Request) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(model.proto.SearchModel.Request other) {
                if (other == model.proto.SearchModel.Request.getDefaultInstance()) return this;
                if (other.hasSearchQuery()) {
                    bitField0_ |= 0x00000001;
                    searchQuery_ = other.searchQuery_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override
            public final boolean isInitialized() {
                if (!hasSearchQuery()) {
                    return false;
                }
                return true;
            }

            @Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                model.proto.SearchModel.Request parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (model.proto.SearchModel.Request) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private Object searchQuery_ = "";

            /**
             * <code>required string search_query = 1;</code>
             */
            public boolean hasSearchQuery() {
                return ((bitField0_ & 0x00000001) != 0);
            }

            /**
             * <code>required string search_query = 1;</code>
             */
            public String getSearchQuery() {
                Object ref = searchQuery_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        searchQuery_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>required string search_query = 1;</code>
             */
            public com.google.protobuf.ByteString
            getSearchQueryBytes() {
                Object ref = searchQuery_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    searchQuery_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string search_query = 1;</code>
             */
            public Builder setSearchQuery(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                searchQuery_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string search_query = 1;</code>
             */
            public Builder clearSearchQuery() {
                bitField0_ = (bitField0_ & ~0x00000001);
                searchQuery_ = getDefaultInstance().getSearchQuery();
                onChanged();
                return this;
            }

            /**
             * <code>required string search_query = 1;</code>
             */
            public Builder setSearchQueryBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                searchQuery_ = value;
                onChanged();
                return this;
            }

            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:distributed.search.Request)
        }

        // @@protoc_insertion_point(class_scope:distributed.search.Request)
        private static final model.proto.SearchModel.Request DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new model.proto.SearchModel.Request();
        }

        public static model.proto.SearchModel.Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated
        public static final com.google.protobuf.Parser<Request>
                PARSER = new com.google.protobuf.AbstractParser<Request>() {
            @Override
            public Request parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Request(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Request> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<Request> getParserForType() {
            return PARSER;
        }

        @Override
        public model.proto.SearchModel.Request getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface ResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:distributed.search.Response)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
         */
        java.util.List<Response.DocumentStats>
        getRelevantDocumentsList();

        /**
         * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
         */
        model.proto.SearchModel.Response.DocumentStats getRelevantDocuments(int index);

        /**
         * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
         */
        int getRelevantDocumentsCount();

        /**
         * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
         */
        java.util.List<? extends Response.DocumentStatsOrBuilder>
        getRelevantDocumentsOrBuilderList();

        /**
         * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
         */
        model.proto.SearchModel.Response.DocumentStatsOrBuilder getRelevantDocumentsOrBuilder(
                int index);
    }

    /**
     * <pre>
     * response from search coordinator to frontend
     * </pre>
     * <p>
     * Protobuf type {@code distributed.search.Response}
     */
    public static final class Response extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:distributed.search.Response)
            ResponseOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use Response.newBuilder() to construct.
        private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Response() {
            relevantDocuments_ = java.util.Collections.emptyList();
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private Response(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                relevantDocuments_ = new java.util.ArrayList<DocumentStats>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            relevantDocuments_.add(
                                    input.readMessage(model.proto.SearchModel.Response.DocumentStats.PARSER, extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    relevantDocuments_ = java.util.Collections.unmodifiableList(relevantDocuments_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return model.proto.SearchModel.internal_static_distributed_search_Response_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return model.proto.SearchModel.internal_static_distributed_search_Response_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            model.proto.SearchModel.Response.class, model.proto.SearchModel.Response.Builder.class);
        }

        public interface DocumentStatsOrBuilder extends
                // @@protoc_insertion_point(interface_extends:distributed.search.Response.DocumentStats)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>required string document_name = 1;</code>
             */
            boolean hasDocumentName();

            /**
             * <code>required string document_name = 1;</code>
             */
            String getDocumentName();

            /**
             * <code>required string document_name = 1;</code>
             */
            com.google.protobuf.ByteString
            getDocumentNameBytes();

            /**
             * <code>optional double score = 2;</code>
             */
            boolean hasScore();

            /**
             * <code>optional double score = 2;</code>
             */
            double getScore();

            /**
             * <code>optional int64 document_size = 3;</code>
             */
            boolean hasDocumentSize();

            /**
             * <code>optional int64 document_size = 3;</code>
             */
            long getDocumentSize();

            /**
             * <code>optional string author = 4;</code>
             */
            boolean hasAuthor();

            /**
             * <code>optional string author = 4;</code>
             */
            String getAuthor();

            /**
             * <code>optional string author = 4;</code>
             */
            com.google.protobuf.ByteString
            getAuthorBytes();
        }

        /**
         * Protobuf type {@code distributed.search.Response.DocumentStats}
         */
        public static final class DocumentStats extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:distributed.search.Response.DocumentStats)
                DocumentStatsOrBuilder {
            private static final long serialVersionUID = 0L;

            // Use DocumentStats.newBuilder() to construct.
            private DocumentStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }

            private DocumentStats() {
                documentName_ = "";
                author_ = "";
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }

            private DocumentStats(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
                }
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 10: {
                                com.google.protobuf.ByteString bs = input.readBytes();
                                bitField0_ |= 0x00000001;
                                documentName_ = bs;
                                break;
                            }
                            case 17: {
                                bitField0_ |= 0x00000002;
                                score_ = input.readDouble();
                                break;
                            }
                            case 24: {
                                bitField0_ |= 0x00000004;
                                documentSize_ = input.readInt64();
                                break;
                            }
                            case 34: {
                                com.google.protobuf.ByteString bs = input.readBytes();
                                bitField0_ |= 0x00000008;
                                author_ = bs;
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
                                        input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return model.proto.SearchModel.internal_static_distributed_search_Response_DocumentStats_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return model.proto.SearchModel.internal_static_distributed_search_Response_DocumentStats_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                model.proto.SearchModel.Response.DocumentStats.class, model.proto.SearchModel.Response.DocumentStats.Builder.class);
            }

            private int bitField0_;
            public static final int DOCUMENT_NAME_FIELD_NUMBER = 1;
            private volatile Object documentName_;

            /**
             * <code>required string document_name = 1;</code>
             */
            public boolean hasDocumentName() {
                return ((bitField0_ & 0x00000001) != 0);
            }

            /**
             * <code>required string document_name = 1;</code>
             */
            public String getDocumentName() {
                Object ref = documentName_;
                if (ref instanceof String) {
                    return (String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        documentName_ = s;
                    }
                    return s;
                }
            }

            /**
             * <code>required string document_name = 1;</code>
             */
            public com.google.protobuf.ByteString
            getDocumentNameBytes() {
                Object ref = documentName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    documentName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            public static final int SCORE_FIELD_NUMBER = 2;
            private double score_;

            /**
             * <code>optional double score = 2;</code>
             */
            public boolean hasScore() {
                return ((bitField0_ & 0x00000002) != 0);
            }

            /**
             * <code>optional double score = 2;</code>
             */
            public double getScore() {
                return score_;
            }

            public static final int DOCUMENT_SIZE_FIELD_NUMBER = 3;
            private long documentSize_;

            /**
             * <code>optional int64 document_size = 3;</code>
             */
            public boolean hasDocumentSize() {
                return ((bitField0_ & 0x00000004) != 0);
            }

            /**
             * <code>optional int64 document_size = 3;</code>
             */
            public long getDocumentSize() {
                return documentSize_;
            }

            public static final int AUTHOR_FIELD_NUMBER = 4;
            private volatile Object author_;

            /**
             * <code>optional string author = 4;</code>
             */
            public boolean hasAuthor() {
                return ((bitField0_ & 0x00000008) != 0);
            }

            /**
             * <code>optional string author = 4;</code>
             */
            public String getAuthor() {
                Object ref = author_;
                if (ref instanceof String) {
                    return (String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        author_ = s;
                    }
                    return s;
                }
            }

            /**
             * <code>optional string author = 4;</code>
             */
            public com.google.protobuf.ByteString
            getAuthorBytes() {
                Object ref = author_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    author_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            private byte memoizedIsInitialized = -1;

            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                if (!hasDocumentName()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (((bitField0_ & 0x00000001) != 0)) {
                    com.google.protobuf.GeneratedMessageV3.writeString(output, 1, documentName_);
                }
                if (((bitField0_ & 0x00000002) != 0)) {
                    output.writeDouble(2, score_);
                }
                if (((bitField0_ & 0x00000004) != 0)) {
                    output.writeInt64(3, documentSize_);
                }
                if (((bitField0_ & 0x00000008) != 0)) {
                    com.google.protobuf.GeneratedMessageV3.writeString(output, 4, author_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) != 0)) {
                    size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, documentName_);
                }
                if (((bitField0_ & 0x00000002) != 0)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeDoubleSize(2, score_);
                }
                if (((bitField0_ & 0x00000004) != 0)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt64Size(3, documentSize_);
                }
                if (((bitField0_ & 0x00000008) != 0)) {
                    size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, author_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof model.proto.SearchModel.Response.DocumentStats)) {
                    return super.equals(obj);
                }
                model.proto.SearchModel.Response.DocumentStats other = (model.proto.SearchModel.Response.DocumentStats) obj;

                if (hasDocumentName() != other.hasDocumentName()) return false;
                if (hasDocumentName()) {
                    if (!getDocumentName()
                            .equals(other.getDocumentName())) return false;
                }
                if (hasScore() != other.hasScore()) return false;
                if (hasScore()) {
                    if (Double.doubleToLongBits(getScore())
                            != Double.doubleToLongBits(
                            other.getScore())) return false;
                }
                if (hasDocumentSize() != other.hasDocumentSize()) return false;
                if (hasDocumentSize()) {
                    if (getDocumentSize()
                            != other.getDocumentSize()) return false;
                }
                if (hasAuthor() != other.hasAuthor()) return false;
                if (hasAuthor()) {
                    if (!getAuthor()
                            .equals(other.getAuthor())) return false;
                }
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                if (hasDocumentName()) {
                    hash = (37 * hash) + DOCUMENT_NAME_FIELD_NUMBER;
                    hash = (53 * hash) + getDocumentName().hashCode();
                }
                if (hasScore()) {
                    hash = (37 * hash) + SCORE_FIELD_NUMBER;
                    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                            Double.doubleToLongBits(getScore()));
                }
                if (hasDocumentSize()) {
                    hash = (37 * hash) + DOCUMENT_SIZE_FIELD_NUMBER;
                    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                            getDocumentSize());
                }
                if (hasAuthor()) {
                    hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
                    hash = (53 * hash) + getAuthor().hashCode();
                }
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static model.proto.SearchModel.Response.DocumentStats parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static model.proto.SearchModel.Response.DocumentStats parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static model.proto.SearchModel.Response.DocumentStats parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static model.proto.SearchModel.Response.DocumentStats parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static model.proto.SearchModel.Response.DocumentStats parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static model.proto.SearchModel.Response.DocumentStats parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static model.proto.SearchModel.Response.DocumentStats parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }

            public static model.proto.SearchModel.Response.DocumentStats parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            public static model.proto.SearchModel.Response.DocumentStats parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }

            public static model.proto.SearchModel.Response.DocumentStats parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }

            public static model.proto.SearchModel.Response.DocumentStats parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }

            public static model.proto.SearchModel.Response.DocumentStats parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(model.proto.SearchModel.Response.DocumentStats prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }

            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }

            /**
             * Protobuf type {@code distributed.search.Response.DocumentStats}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:distributed.search.Response.DocumentStats)
                    model.proto.SearchModel.Response.DocumentStatsOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return model.proto.SearchModel.internal_static_distributed_search_Response_DocumentStats_descriptor;
                }

                @Override
                protected FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return model.proto.SearchModel.internal_static_distributed_search_Response_DocumentStats_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    model.proto.SearchModel.Response.DocumentStats.class, model.proto.SearchModel.Response.DocumentStats.Builder.class);
                }

                // Construct using model.proto.SearchModel.Response.DocumentStats.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }

                @Override
                public Builder clear() {
                    super.clear();
                    documentName_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    score_ = 0D;
                    bitField0_ = (bitField0_ & ~0x00000002);
                    documentSize_ = 0L;
                    bitField0_ = (bitField0_ & ~0x00000004);
                    author_ = "";
                    bitField0_ = (bitField0_ & ~0x00000008);
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return model.proto.SearchModel.internal_static_distributed_search_Response_DocumentStats_descriptor;
                }

                @Override
                public model.proto.SearchModel.Response.DocumentStats getDefaultInstanceForType() {
                    return model.proto.SearchModel.Response.DocumentStats.getDefaultInstance();
                }

                @Override
                public model.proto.SearchModel.Response.DocumentStats build() {
                    model.proto.SearchModel.Response.DocumentStats result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public model.proto.SearchModel.Response.DocumentStats buildPartial() {
                    model.proto.SearchModel.Response.DocumentStats result = new model.proto.SearchModel.Response.DocumentStats(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) != 0)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.documentName_ = documentName_;
                    if (((from_bitField0_ & 0x00000002) != 0)) {
                        result.score_ = score_;
                        to_bitField0_ |= 0x00000002;
                    }
                    if (((from_bitField0_ & 0x00000004) != 0)) {
                        result.documentSize_ = documentSize_;
                        to_bitField0_ |= 0x00000004;
                    }
                    if (((from_bitField0_ & 0x00000008) != 0)) {
                        to_bitField0_ |= 0x00000008;
                    }
                    result.author_ = author_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }

                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }

                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }

                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }

                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }

                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }

                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof model.proto.SearchModel.Response.DocumentStats) {
                        return mergeFrom((model.proto.SearchModel.Response.DocumentStats) other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(model.proto.SearchModel.Response.DocumentStats other) {
                    if (other == model.proto.SearchModel.Response.DocumentStats.getDefaultInstance()) return this;
                    if (other.hasDocumentName()) {
                        bitField0_ |= 0x00000001;
                        documentName_ = other.documentName_;
                        onChanged();
                    }
                    if (other.hasScore()) {
                        setScore(other.getScore());
                    }
                    if (other.hasDocumentSize()) {
                        setDocumentSize(other.getDocumentSize());
                    }
                    if (other.hasAuthor()) {
                        bitField0_ |= 0x00000008;
                        author_ = other.author_;
                        onChanged();
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    if (!hasDocumentName()) {
                        return false;
                    }
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    model.proto.SearchModel.Response.DocumentStats parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (model.proto.SearchModel.Response.DocumentStats) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int bitField0_;

                private Object documentName_ = "";

                /**
                 * <code>required string document_name = 1;</code>
                 */
                public boolean hasDocumentName() {
                    return ((bitField0_ & 0x00000001) != 0);
                }

                /**
                 * <code>required string document_name = 1;</code>
                 */
                public String getDocumentName() {
                    Object ref = documentName_;
                    if (!(ref instanceof String)) {
                        com.google.protobuf.ByteString bs =
                                (com.google.protobuf.ByteString) ref;
                        String s = bs.toStringUtf8();
                        if (bs.isValidUtf8()) {
                            documentName_ = s;
                        }
                        return s;
                    } else {
                        return (String) ref;
                    }
                }

                /**
                 * <code>required string document_name = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getDocumentNameBytes() {
                    Object ref = documentName_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (String) ref);
                        documentName_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }

                /**
                 * <code>required string document_name = 1;</code>
                 */
                public Builder setDocumentName(
                        String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    documentName_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>required string document_name = 1;</code>
                 */
                public Builder clearDocumentName() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    documentName_ = getDefaultInstance().getDocumentName();
                    onChanged();
                    return this;
                }

                /**
                 * <code>required string document_name = 1;</code>
                 */
                public Builder setDocumentNameBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    documentName_ = value;
                    onChanged();
                    return this;
                }

                private double score_;

                /**
                 * <code>optional double score = 2;</code>
                 */
                public boolean hasScore() {
                    return ((bitField0_ & 0x00000002) != 0);
                }

                /**
                 * <code>optional double score = 2;</code>
                 */
                public double getScore() {
                    return score_;
                }

                /**
                 * <code>optional double score = 2;</code>
                 */
                public Builder setScore(double value) {
                    bitField0_ |= 0x00000002;
                    score_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional double score = 2;</code>
                 */
                public Builder clearScore() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    score_ = 0D;
                    onChanged();
                    return this;
                }

                private long documentSize_;

                /**
                 * <code>optional int64 document_size = 3;</code>
                 */
                public boolean hasDocumentSize() {
                    return ((bitField0_ & 0x00000004) != 0);
                }

                /**
                 * <code>optional int64 document_size = 3;</code>
                 */
                public long getDocumentSize() {
                    return documentSize_;
                }

                /**
                 * <code>optional int64 document_size = 3;</code>
                 */
                public Builder setDocumentSize(long value) {
                    bitField0_ |= 0x00000004;
                    documentSize_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional int64 document_size = 3;</code>
                 */
                public Builder clearDocumentSize() {
                    bitField0_ = (bitField0_ & ~0x00000004);
                    documentSize_ = 0L;
                    onChanged();
                    return this;
                }

                private Object author_ = "";

                /**
                 * <code>optional string author = 4;</code>
                 */
                public boolean hasAuthor() {
                    return ((bitField0_ & 0x00000008) != 0);
                }

                /**
                 * <code>optional string author = 4;</code>
                 */
                public String getAuthor() {
                    Object ref = author_;
                    if (!(ref instanceof String)) {
                        com.google.protobuf.ByteString bs =
                                (com.google.protobuf.ByteString) ref;
                        String s = bs.toStringUtf8();
                        if (bs.isValidUtf8()) {
                            author_ = s;
                        }
                        return s;
                    } else {
                        return (String) ref;
                    }
                }

                /**
                 * <code>optional string author = 4;</code>
                 */
                public com.google.protobuf.ByteString
                getAuthorBytes() {
                    Object ref = author_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (String) ref);
                        author_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }

                /**
                 * <code>optional string author = 4;</code>
                 */
                public Builder setAuthor(
                        String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000008;
                    author_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional string author = 4;</code>
                 */
                public Builder clearAuthor() {
                    bitField0_ = (bitField0_ & ~0x00000008);
                    author_ = getDefaultInstance().getAuthor();
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional string author = 4;</code>
                 */
                public Builder setAuthorBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000008;
                    author_ = value;
                    onChanged();
                    return this;
                }

                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:distributed.search.Response.DocumentStats)
            }

            // @@protoc_insertion_point(class_scope:distributed.search.Response.DocumentStats)
            private static final model.proto.SearchModel.Response.DocumentStats DEFAULT_INSTANCE;

            static {
                DEFAULT_INSTANCE = new model.proto.SearchModel.Response.DocumentStats();
            }

            public static model.proto.SearchModel.Response.DocumentStats getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @Deprecated
            public static final com.google.protobuf.Parser<DocumentStats>
                    PARSER = new com.google.protobuf.AbstractParser<DocumentStats>() {
                @Override
                public DocumentStats parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new DocumentStats(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<DocumentStats> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<DocumentStats> getParserForType() {
                return PARSER;
            }

            @Override
            public model.proto.SearchModel.Response.DocumentStats getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        public static final int RELEVANT_DOCUMENTS_FIELD_NUMBER = 1;
        private java.util.List<DocumentStats> relevantDocuments_;

        /**
         * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
         */
        public java.util.List<DocumentStats> getRelevantDocumentsList() {
            return relevantDocuments_;
        }

        /**
         * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
         */
        public java.util.List<? extends DocumentStatsOrBuilder>
        getRelevantDocumentsOrBuilderList() {
            return relevantDocuments_;
        }

        /**
         * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
         */
        public int getRelevantDocumentsCount() {
            return relevantDocuments_.size();
        }

        /**
         * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
         */
        public model.proto.SearchModel.Response.DocumentStats getRelevantDocuments(int index) {
            return relevantDocuments_.get(index);
        }

        /**
         * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
         */
        public model.proto.SearchModel.Response.DocumentStatsOrBuilder getRelevantDocumentsOrBuilder(
                int index) {
            return relevantDocuments_.get(index);
        }

        private byte memoizedIsInitialized = -1;

        @Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            for (int i = 0; i < getRelevantDocumentsCount(); i++) {
                if (!getRelevantDocuments(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            for (int i = 0; i < relevantDocuments_.size(); i++) {
                output.writeMessage(1, relevantDocuments_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < relevantDocuments_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, relevantDocuments_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof model.proto.SearchModel.Response)) {
                return super.equals(obj);
            }
            model.proto.SearchModel.Response other = (model.proto.SearchModel.Response) obj;

            if (!getRelevantDocumentsList()
                    .equals(other.getRelevantDocumentsList())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getRelevantDocumentsCount() > 0) {
                hash = (37 * hash) + RELEVANT_DOCUMENTS_FIELD_NUMBER;
                hash = (53 * hash) + getRelevantDocumentsList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static model.proto.SearchModel.Response parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static model.proto.SearchModel.Response parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static model.proto.SearchModel.Response parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static model.proto.SearchModel.Response parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static model.proto.SearchModel.Response parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static model.proto.SearchModel.Response parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static model.proto.SearchModel.Response parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static model.proto.SearchModel.Response parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static model.proto.SearchModel.Response parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static model.proto.SearchModel.Response parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static model.proto.SearchModel.Response parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static model.proto.SearchModel.Response parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(model.proto.SearchModel.Response prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * <pre>
         * response from search coordinator to frontend
         * </pre>
         * <p>
         * Protobuf type {@code distributed.search.Response}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:distributed.search.Response)
                model.proto.SearchModel.ResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return model.proto.SearchModel.internal_static_distributed_search_Response_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return model.proto.SearchModel.internal_static_distributed_search_Response_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                model.proto.SearchModel.Response.class, model.proto.SearchModel.Response.Builder.class);
            }

            // Construct using model.proto.SearchModel.Response.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getRelevantDocumentsFieldBuilder();
                }
            }

            @Override
            public Builder clear() {
                super.clear();
                if (relevantDocumentsBuilder_ == null) {
                    relevantDocuments_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    relevantDocumentsBuilder_.clear();
                }
                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return model.proto.SearchModel.internal_static_distributed_search_Response_descriptor;
            }

            @Override
            public model.proto.SearchModel.Response getDefaultInstanceForType() {
                return model.proto.SearchModel.Response.getDefaultInstance();
            }

            @Override
            public model.proto.SearchModel.Response build() {
                model.proto.SearchModel.Response result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public model.proto.SearchModel.Response buildPartial() {
                model.proto.SearchModel.Response result = new model.proto.SearchModel.Response(this);
                int from_bitField0_ = bitField0_;
                if (relevantDocumentsBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        relevantDocuments_ = java.util.Collections.unmodifiableList(relevantDocuments_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.relevantDocuments_ = relevantDocuments_;
                } else {
                    result.relevantDocuments_ = relevantDocumentsBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return super.clone();
            }

            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.setField(field, value);
            }

            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof model.proto.SearchModel.Response) {
                    return mergeFrom((model.proto.SearchModel.Response) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(model.proto.SearchModel.Response other) {
                if (other == model.proto.SearchModel.Response.getDefaultInstance()) return this;
                if (relevantDocumentsBuilder_ == null) {
                    if (!other.relevantDocuments_.isEmpty()) {
                        if (relevantDocuments_.isEmpty()) {
                            relevantDocuments_ = other.relevantDocuments_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureRelevantDocumentsIsMutable();
                            relevantDocuments_.addAll(other.relevantDocuments_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.relevantDocuments_.isEmpty()) {
                        if (relevantDocumentsBuilder_.isEmpty()) {
                            relevantDocumentsBuilder_.dispose();
                            relevantDocumentsBuilder_ = null;
                            relevantDocuments_ = other.relevantDocuments_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            relevantDocumentsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getRelevantDocumentsFieldBuilder() : null;
                        } else {
                            relevantDocumentsBuilder_.addAllMessages(other.relevantDocuments_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override
            public final boolean isInitialized() {
                for (int i = 0; i < getRelevantDocumentsCount(); i++) {
                    if (!getRelevantDocuments(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                model.proto.SearchModel.Response parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (model.proto.SearchModel.Response) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private java.util.List<DocumentStats> relevantDocuments_ =
                    java.util.Collections.emptyList();

            private void ensureRelevantDocumentsIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    relevantDocuments_ = new java.util.ArrayList<DocumentStats>(relevantDocuments_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    DocumentStats, DocumentStats.Builder, DocumentStatsOrBuilder> relevantDocumentsBuilder_;

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public java.util.List<DocumentStats> getRelevantDocumentsList() {
                if (relevantDocumentsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(relevantDocuments_);
                } else {
                    return relevantDocumentsBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public int getRelevantDocumentsCount() {
                if (relevantDocumentsBuilder_ == null) {
                    return relevantDocuments_.size();
                } else {
                    return relevantDocumentsBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public model.proto.SearchModel.Response.DocumentStats getRelevantDocuments(int index) {
                if (relevantDocumentsBuilder_ == null) {
                    return relevantDocuments_.get(index);
                } else {
                    return relevantDocumentsBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public Builder setRelevantDocuments(
                    int index, model.proto.SearchModel.Response.DocumentStats value) {
                if (relevantDocumentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.set(index, value);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public Builder setRelevantDocuments(
                    int index, model.proto.SearchModel.Response.DocumentStats.Builder builderForValue) {
                if (relevantDocumentsBuilder_ == null) {
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public Builder addRelevantDocuments(model.proto.SearchModel.Response.DocumentStats value) {
                if (relevantDocumentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.add(value);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public Builder addRelevantDocuments(
                    int index, model.proto.SearchModel.Response.DocumentStats value) {
                if (relevantDocumentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.add(index, value);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public Builder addRelevantDocuments(
                    model.proto.SearchModel.Response.DocumentStats.Builder builderForValue) {
                if (relevantDocumentsBuilder_ == null) {
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.add(builderForValue.build());
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public Builder addRelevantDocuments(
                    int index, model.proto.SearchModel.Response.DocumentStats.Builder builderForValue) {
                if (relevantDocumentsBuilder_ == null) {
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public Builder addAllRelevantDocuments(
                    Iterable<? extends DocumentStats> values) {
                if (relevantDocumentsBuilder_ == null) {
                    ensureRelevantDocumentsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, relevantDocuments_);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public Builder clearRelevantDocuments() {
                if (relevantDocumentsBuilder_ == null) {
                    relevantDocuments_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public Builder removeRelevantDocuments(int index) {
                if (relevantDocumentsBuilder_ == null) {
                    ensureRelevantDocumentsIsMutable();
                    relevantDocuments_.remove(index);
                    onChanged();
                } else {
                    relevantDocumentsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public model.proto.SearchModel.Response.DocumentStats.Builder getRelevantDocumentsBuilder(
                    int index) {
                return getRelevantDocumentsFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public model.proto.SearchModel.Response.DocumentStatsOrBuilder getRelevantDocumentsOrBuilder(
                    int index) {
                if (relevantDocumentsBuilder_ == null) {
                    return relevantDocuments_.get(index);
                } else {
                    return relevantDocumentsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public java.util.List<? extends DocumentStatsOrBuilder>
            getRelevantDocumentsOrBuilderList() {
                if (relevantDocumentsBuilder_ != null) {
                    return relevantDocumentsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(relevantDocuments_);
                }
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public model.proto.SearchModel.Response.DocumentStats.Builder addRelevantDocumentsBuilder() {
                return getRelevantDocumentsFieldBuilder().addBuilder(
                        model.proto.SearchModel.Response.DocumentStats.getDefaultInstance());
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public model.proto.SearchModel.Response.DocumentStats.Builder addRelevantDocumentsBuilder(
                    int index) {
                return getRelevantDocumentsFieldBuilder().addBuilder(
                        index, model.proto.SearchModel.Response.DocumentStats.getDefaultInstance());
            }

            /**
             * <code>repeated .distributed.search.Response.DocumentStats relevant_documents = 1;</code>
             */
            public java.util.List<DocumentStats.Builder>
            getRelevantDocumentsBuilderList() {
                return getRelevantDocumentsFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    DocumentStats, DocumentStats.Builder, DocumentStatsOrBuilder>
            getRelevantDocumentsFieldBuilder() {
                if (relevantDocumentsBuilder_ == null) {
                    relevantDocumentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            DocumentStats, DocumentStats.Builder, DocumentStatsOrBuilder>(
                            relevantDocuments_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    relevantDocuments_ = null;
                }
                return relevantDocumentsBuilder_;
            }

            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:distributed.search.Response)
        }

        // @@protoc_insertion_point(class_scope:distributed.search.Response)
        private static final model.proto.SearchModel.Response DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new model.proto.SearchModel.Response();
        }

        public static model.proto.SearchModel.Response getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated
        public static final com.google.protobuf.Parser<Response>
                PARSER = new com.google.protobuf.AbstractParser<Response>() {
            @Override
            public Response parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Response(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Response> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<Response> getParserForType() {
            return PARSER;
        }

        @Override
        public model.proto.SearchModel.Response getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_distributed_search_Request_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_distributed_search_Request_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_distributed_search_Response_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_distributed_search_Response_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_distributed_search_Response_DocumentStats_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_distributed_search_Response_DocumentStats_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n5src/main/java/model/proto/search_clust" +
                        "er_protos.proto\022\022distributed.search\"\037\n\007R" +
                        "equest\022\024\n\014search_query\030\001 \002(\t\"\260\001\n\010Respons" +
                        "e\022F\n\022relevant_documents\030\001 \003(\0132*.distribu" +
                        "ted.search.Response.DocumentStats\032\\\n\rDoc" +
                        "umentStats\022\025\n\rdocument_name\030\001 \002(\t\022\r\n\005sco" +
                        "re\030\002 \001(\001\022\025\n\rdocument_size\030\003 \001(\003\022\016\n\006autho" +
                        "r\030\004 \001(\tB\032\n\013model.protoB\013SearchModel"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_distributed_search_Request_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_distributed_search_Request_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_distributed_search_Request_descriptor,
                new String[]{"SearchQuery",});
        internal_static_distributed_search_Response_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_distributed_search_Response_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_distributed_search_Response_descriptor,
                new String[]{"RelevantDocuments",});
        internal_static_distributed_search_Response_DocumentStats_descriptor =
                internal_static_distributed_search_Response_descriptor.getNestedTypes().get(0);
        internal_static_distributed_search_Response_DocumentStats_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_distributed_search_Response_DocumentStats_descriptor,
                new String[]{"DocumentName", "Score", "DocumentSize", "Author",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
