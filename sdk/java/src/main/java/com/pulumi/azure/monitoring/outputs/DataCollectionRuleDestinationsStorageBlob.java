// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataCollectionRuleDestinationsStorageBlob {
    /**
     * @return The Storage Container name.
     * 
     */
    private String containerName;
    /**
     * @return The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
     * 
     */
    private String name;
    /**
     * @return The resource ID of the Storage Account.
     * 
     */
    private String storageAccountId;

    private DataCollectionRuleDestinationsStorageBlob() {}
    /**
     * @return The Storage Container name.
     * 
     */
    public String containerName() {
        return this.containerName;
    }
    /**
     * @return The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource ID of the Storage Account.
     * 
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleDestinationsStorageBlob defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String containerName;
        private String name;
        private String storageAccountId;
        public Builder() {}
        public Builder(DataCollectionRuleDestinationsStorageBlob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.name = defaults.name;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        @CustomType.Setter
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }
        public DataCollectionRuleDestinationsStorageBlob build() {
            final var o = new DataCollectionRuleDestinationsStorageBlob();
            o.containerName = containerName;
            o.name = name;
            o.storageAccountId = storageAccountId;
            return o;
        }
    }
}