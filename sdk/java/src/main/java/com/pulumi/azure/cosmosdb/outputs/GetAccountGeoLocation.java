// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccountGeoLocation {
    private final Integer failoverPriority;
    /**
     * @return The ID of the virtual network subnet.
     * 
     */
    private final String id;
    /**
     * @return The name of the Azure region hosting replicated data.
     * 
     */
    private final String location;

    @CustomType.Constructor
    private GetAccountGeoLocation(
        @CustomType.Parameter("failoverPriority") Integer failoverPriority,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location) {
        this.failoverPriority = failoverPriority;
        this.id = id;
        this.location = location;
    }

    public Integer failoverPriority() {
        return this.failoverPriority;
    }
    /**
     * @return The ID of the virtual network subnet.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the Azure region hosting replicated data.
     * 
     */
    public String location() {
        return this.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountGeoLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer failoverPriority;
        private String id;
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountGeoLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPriority = defaults.failoverPriority;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
        }

        public Builder failoverPriority(Integer failoverPriority) {
            this.failoverPriority = Objects.requireNonNull(failoverPriority);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }        public GetAccountGeoLocation build() {
            return new GetAccountGeoLocation(failoverPriority, id, location);
        }
    }
}