// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datashare.outputs;

import com.pulumi.azure.datashare.outputs.GetDatasetBlobStorageStorageAccount;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatasetBlobStorageResult {
    /**
     * @return The name of the storage account container to be shared with the receiver.
     * 
     */
    private final String containerName;
    private final String dataShareId;
    /**
     * @return The name of the Data Share Dataset.
     * 
     */
    private final String displayName;
    /**
     * @return The path of the file in the storage container to be shared with the receiver.
     * 
     */
    private final String filePath;
    /**
     * @return The folder path of the file in the storage container to be shared with the receiver.
     * 
     */
    private final String folderPath;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The name of the storage account to be shared with the receiver.
     * 
     */
    private final String name;
    /**
     * @return A `storage_account` block as defined below.
     * 
     */
    private final List<GetDatasetBlobStorageStorageAccount> storageAccounts;

    @CustomType.Constructor
    private GetDatasetBlobStorageResult(
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("dataShareId") String dataShareId,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("filePath") String filePath,
        @CustomType.Parameter("folderPath") String folderPath,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("storageAccounts") List<GetDatasetBlobStorageStorageAccount> storageAccounts) {
        this.containerName = containerName;
        this.dataShareId = dataShareId;
        this.displayName = displayName;
        this.filePath = filePath;
        this.folderPath = folderPath;
        this.id = id;
        this.name = name;
        this.storageAccounts = storageAccounts;
    }

    /**
     * @return The name of the storage account container to be shared with the receiver.
     * 
     */
    public String containerName() {
        return this.containerName;
    }
    public String dataShareId() {
        return this.dataShareId;
    }
    /**
     * @return The name of the Data Share Dataset.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The path of the file in the storage container to be shared with the receiver.
     * 
     */
    public String filePath() {
        return this.filePath;
    }
    /**
     * @return The folder path of the file in the storage container to be shared with the receiver.
     * 
     */
    public String folderPath() {
        return this.folderPath;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the storage account to be shared with the receiver.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A `storage_account` block as defined below.
     * 
     */
    public List<GetDatasetBlobStorageStorageAccount> storageAccounts() {
        return this.storageAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetBlobStorageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private String dataShareId;
        private String displayName;
        private String filePath;
        private String folderPath;
        private String id;
        private String name;
        private List<GetDatasetBlobStorageStorageAccount> storageAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetBlobStorageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.dataShareId = defaults.dataShareId;
    	      this.displayName = defaults.displayName;
    	      this.filePath = defaults.filePath;
    	      this.folderPath = defaults.folderPath;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.storageAccounts = defaults.storageAccounts;
        }

        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder dataShareId(String dataShareId) {
            this.dataShareId = Objects.requireNonNull(dataShareId);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder filePath(String filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }
        public Builder folderPath(String folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder storageAccounts(List<GetDatasetBlobStorageStorageAccount> storageAccounts) {
            this.storageAccounts = Objects.requireNonNull(storageAccounts);
            return this;
        }
        public Builder storageAccounts(GetDatasetBlobStorageStorageAccount... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }        public GetDatasetBlobStorageResult build() {
            return new GetDatasetBlobStorageResult(containerName, dataShareId, displayName, filePath, folderPath, id, name, storageAccounts);
        }
    }
}