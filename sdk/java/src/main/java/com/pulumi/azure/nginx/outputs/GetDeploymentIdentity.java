// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.nginx.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentIdentity {
    /**
     * @return List of identities attached to the Nginx Deployment.
     * 
     */
    private List<String> identityIds;
    private String principalId;
    private String tenantId;
    /**
     * @return Type of identity attached to the Nginx Deployment.
     * 
     */
    private String type;

    private GetDeploymentIdentity() {}
    /**
     * @return List of identities attached to the Nginx Deployment.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds;
    }
    public String principalId() {
        return this.principalId;
    }
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return Type of identity attached to the Nginx Deployment.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> identityIds;
        private String principalId;
        private String tenantId;
        private String type;
        public Builder() {}
        public Builder(GetDeploymentIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder identityIds(List<String> identityIds) {
            if (identityIds == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIdentity", "identityIds");
            }
            this.identityIds = identityIds;
            return this;
        }
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }
        @CustomType.Setter
        public Builder principalId(String principalId) {
            if (principalId == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIdentity", "principalId");
            }
            this.principalId = principalId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            if (tenantId == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIdentity", "tenantId");
            }
            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIdentity", "type");
            }
            this.type = type;
            return this;
        }
        public GetDeploymentIdentity build() {
            final var _resultValue = new GetDeploymentIdentity();
            _resultValue.identityIds = identityIds;
            _resultValue.principalId = principalId;
            _resultValue.tenantId = tenantId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
