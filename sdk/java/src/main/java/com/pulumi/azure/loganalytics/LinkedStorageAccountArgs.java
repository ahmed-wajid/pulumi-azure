// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loganalytics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LinkedStorageAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedStorageAccountArgs Empty = new LinkedStorageAccountArgs();

    /**
     * The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are `customlogs`, `azurewatson`, `query`, `ingestion` and `alerts`. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    @Import(name="dataSourceType", required=true)
    private Output<String> dataSourceType;

    /**
     * @return The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are `customlogs`, `azurewatson`, `query`, `ingestion` and `alerts`. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    public Output<String> dataSourceType() {
        return this.dataSourceType;
    }

    /**
     * The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The storage account resource ids to be linked.
     * 
     */
    @Import(name="storageAccountIds", required=true)
    private Output<List<String>> storageAccountIds;

    /**
     * @return The storage account resource ids to be linked.
     * 
     */
    public Output<List<String>> storageAccountIds() {
        return this.storageAccountIds;
    }

    /**
     * The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    @Import(name="workspaceResourceId", required=true)
    private Output<String> workspaceResourceId;

    /**
     * @return The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    public Output<String> workspaceResourceId() {
        return this.workspaceResourceId;
    }

    private LinkedStorageAccountArgs() {}

    private LinkedStorageAccountArgs(LinkedStorageAccountArgs $) {
        this.dataSourceType = $.dataSourceType;
        this.resourceGroupName = $.resourceGroupName;
        this.storageAccountIds = $.storageAccountIds;
        this.workspaceResourceId = $.workspaceResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedStorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedStorageAccountArgs $;

        public Builder() {
            $ = new LinkedStorageAccountArgs();
        }

        public Builder(LinkedStorageAccountArgs defaults) {
            $ = new LinkedStorageAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataSourceType The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are `customlogs`, `azurewatson`, `query`, `ingestion` and `alerts`. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceType(Output<String> dataSourceType) {
            $.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * @param dataSourceType The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are `customlogs`, `azurewatson`, `query`, `ingestion` and `alerts`. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceType(String dataSourceType) {
            return dataSourceType(Output.of(dataSourceType));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageAccountIds The storage account resource ids to be linked.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountIds(Output<List<String>> storageAccountIds) {
            $.storageAccountIds = storageAccountIds;
            return this;
        }

        /**
         * @param storageAccountIds The storage account resource ids to be linked.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountIds(List<String> storageAccountIds) {
            return storageAccountIds(Output.of(storageAccountIds));
        }

        /**
         * @param storageAccountIds The storage account resource ids to be linked.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountIds(String... storageAccountIds) {
            return storageAccountIds(List.of(storageAccountIds));
        }

        /**
         * @param workspaceResourceId The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceResourceId(Output<String> workspaceResourceId) {
            $.workspaceResourceId = workspaceResourceId;
            return this;
        }

        /**
         * @param workspaceResourceId The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceResourceId(String workspaceResourceId) {
            return workspaceResourceId(Output.of(workspaceResourceId));
        }

        public LinkedStorageAccountArgs build() {
            $.dataSourceType = Objects.requireNonNull($.dataSourceType, "expected parameter 'dataSourceType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageAccountIds = Objects.requireNonNull($.storageAccountIds, "expected parameter 'storageAccountIds' to be non-null");
            $.workspaceResourceId = Objects.requireNonNull($.workspaceResourceId, "expected parameter 'workspaceResourceId' to be non-null");
            return $;
        }
    }

}