// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPoolStartTaskUserIdentityAutoUser {
    /**
     * @return The elevation level of the user identity under which the start task runs.
     * 
     */
    private final String elevationLevel;
    /**
     * @return The scope of the user identity under which the start task runs.
     * 
     */
    private final String scope;

    @CustomType.Constructor
    private GetPoolStartTaskUserIdentityAutoUser(
        @CustomType.Parameter("elevationLevel") String elevationLevel,
        @CustomType.Parameter("scope") String scope) {
        this.elevationLevel = elevationLevel;
        this.scope = scope;
    }

    /**
     * @return The elevation level of the user identity under which the start task runs.
     * 
     */
    public String elevationLevel() {
        return this.elevationLevel;
    }
    /**
     * @return The scope of the user identity under which the start task runs.
     * 
     */
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolStartTaskUserIdentityAutoUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String elevationLevel;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPoolStartTaskUserIdentityAutoUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elevationLevel = defaults.elevationLevel;
    	      this.scope = defaults.scope;
        }

        public Builder elevationLevel(String elevationLevel) {
            this.elevationLevel = Objects.requireNonNull(elevationLevel);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }        public GetPoolStartTaskUserIdentityAutoUser build() {
            return new GetPoolStartTaskUserIdentityAutoUser(elevationLevel, scope);
        }
    }
}