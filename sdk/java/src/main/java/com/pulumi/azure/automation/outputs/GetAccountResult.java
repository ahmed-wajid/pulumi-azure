// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccountResult {
    /**
     * @return The Endpoint for this Automation Account.
     * 
     */
    private final String endpoint;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return The Primary Access Key for the Automation Account.
     * 
     */
    private final String primaryKey;
    private final String resourceGroupName;
    /**
     * @return The Secondary Access Key for the Automation Account.
     * 
     */
    private final String secondaryKey;

    @CustomType.Constructor
    private GetAccountResult(
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("primaryKey") String primaryKey,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("secondaryKey") String secondaryKey) {
        this.endpoint = endpoint;
        this.id = id;
        this.name = name;
        this.primaryKey = primaryKey;
        this.resourceGroupName = resourceGroupName;
        this.secondaryKey = secondaryKey;
    }

    /**
     * @return The Endpoint for this Automation Account.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The Primary Access Key for the Automation Account.
     * 
     */
    public String primaryKey() {
        return this.primaryKey;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The Secondary Access Key for the Automation Account.
     * 
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String id;
        private String name;
        private String primaryKey;
        private String resourceGroupName;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.primaryKey = defaults.primaryKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
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
        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder secondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }        public GetAccountResult build() {
            return new GetAccountResult(endpoint, id, name, primaryKey, resourceGroupName, secondaryKey);
        }
    }
}