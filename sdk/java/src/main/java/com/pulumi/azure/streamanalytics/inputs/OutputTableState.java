// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutputTableState extends com.pulumi.resources.ResourceArgs {

    public static final OutputTableState Empty = new OutputTableState();

    /**
     * The number of records for a batch operation. Must be between `1` and `100`.
     * 
     */
    @Import(name="batchSize")
    private @Nullable Output<Integer> batchSize;

    /**
     * @return The number of records for a batch operation. Must be between `1` and `100`.
     * 
     */
    public Optional<Output<Integer>> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }

    /**
     * A list of the column names to be removed from output event entities.
     * 
     */
    @Import(name="columnsToRemoves")
    private @Nullable Output<List<String>> columnsToRemoves;

    /**
     * @return A list of the column names to be removed from output event entities.
     * 
     */
    public Optional<Output<List<String>>> columnsToRemoves() {
        return Optional.ofNullable(this.columnsToRemoves);
    }

    /**
     * The name of the Stream Output. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Stream Output. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the output column that contains the partition key.
     * 
     */
    @Import(name="partitionKey")
    private @Nullable Output<String> partitionKey;

    /**
     * @return The name of the output column that contains the partition key.
     * 
     */
    public Optional<Output<String>> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }

    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The name of the output column that contains the row key.
     * 
     */
    @Import(name="rowKey")
    private @Nullable Output<String> rowKey;

    /**
     * @return The name of the output column that contains the row key.
     * 
     */
    public Optional<Output<String>> rowKey() {
        return Optional.ofNullable(this.rowKey);
    }

    /**
     * The Access Key which should be used to connect to this Storage Account.
     * 
     */
    @Import(name="storageAccountKey")
    private @Nullable Output<String> storageAccountKey;

    /**
     * @return The Access Key which should be used to connect to this Storage Account.
     * 
     */
    public Optional<Output<String>> storageAccountKey() {
        return Optional.ofNullable(this.storageAccountKey);
    }

    /**
     * The name of the Storage Account.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable Output<String> storageAccountName;

    /**
     * @return The name of the Storage Account.
     * 
     */
    public Optional<Output<String>> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobName")
    private @Nullable Output<String> streamAnalyticsJobName;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> streamAnalyticsJobName() {
        return Optional.ofNullable(this.streamAnalyticsJobName);
    }

    /**
     * The name of the table where the stream should be output to.
     * 
     */
    @Import(name="table")
    private @Nullable Output<String> table;

    /**
     * @return The name of the table where the stream should be output to.
     * 
     */
    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    private OutputTableState() {}

    private OutputTableState(OutputTableState $) {
        this.batchSize = $.batchSize;
        this.columnsToRemoves = $.columnsToRemoves;
        this.name = $.name;
        this.partitionKey = $.partitionKey;
        this.resourceGroupName = $.resourceGroupName;
        this.rowKey = $.rowKey;
        this.storageAccountKey = $.storageAccountKey;
        this.storageAccountName = $.storageAccountName;
        this.streamAnalyticsJobName = $.streamAnalyticsJobName;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputTableState $;

        public Builder() {
            $ = new OutputTableState();
        }

        public Builder(OutputTableState defaults) {
            $ = new OutputTableState(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchSize The number of records for a batch operation. Must be between `1` and `100`.
         * 
         * @return builder
         * 
         */
        public Builder batchSize(@Nullable Output<Integer> batchSize) {
            $.batchSize = batchSize;
            return this;
        }

        /**
         * @param batchSize The number of records for a batch operation. Must be between `1` and `100`.
         * 
         * @return builder
         * 
         */
        public Builder batchSize(Integer batchSize) {
            return batchSize(Output.of(batchSize));
        }

        /**
         * @param columnsToRemoves A list of the column names to be removed from output event entities.
         * 
         * @return builder
         * 
         */
        public Builder columnsToRemoves(@Nullable Output<List<String>> columnsToRemoves) {
            $.columnsToRemoves = columnsToRemoves;
            return this;
        }

        /**
         * @param columnsToRemoves A list of the column names to be removed from output event entities.
         * 
         * @return builder
         * 
         */
        public Builder columnsToRemoves(List<String> columnsToRemoves) {
            return columnsToRemoves(Output.of(columnsToRemoves));
        }

        /**
         * @param columnsToRemoves A list of the column names to be removed from output event entities.
         * 
         * @return builder
         * 
         */
        public Builder columnsToRemoves(String... columnsToRemoves) {
            return columnsToRemoves(List.of(columnsToRemoves));
        }

        /**
         * @param name The name of the Stream Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Stream Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param partitionKey The name of the output column that contains the partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(@Nullable Output<String> partitionKey) {
            $.partitionKey = partitionKey;
            return this;
        }

        /**
         * @param partitionKey The name of the output column that contains the partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(String partitionKey) {
            return partitionKey(Output.of(partitionKey));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param rowKey The name of the output column that contains the row key.
         * 
         * @return builder
         * 
         */
        public Builder rowKey(@Nullable Output<String> rowKey) {
            $.rowKey = rowKey;
            return this;
        }

        /**
         * @param rowKey The name of the output column that contains the row key.
         * 
         * @return builder
         * 
         */
        public Builder rowKey(String rowKey) {
            return rowKey(Output.of(rowKey));
        }

        /**
         * @param storageAccountKey The Access Key which should be used to connect to this Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(@Nullable Output<String> storageAccountKey) {
            $.storageAccountKey = storageAccountKey;
            return this;
        }

        /**
         * @param storageAccountKey The Access Key which should be used to connect to this Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(String storageAccountKey) {
            return storageAccountKey(Output.of(storageAccountKey));
        }

        /**
         * @param storageAccountName The name of the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName The name of the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(@Nullable Output<String> streamAnalyticsJobName) {
            $.streamAnalyticsJobName = streamAnalyticsJobName;
            return this;
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(String streamAnalyticsJobName) {
            return streamAnalyticsJobName(Output.of(streamAnalyticsJobName));
        }

        /**
         * @param table The name of the table where the stream should be output to.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table The name of the table where the stream should be output to.
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        public OutputTableState build() {
            return $;
        }
    }

}