// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesClusterOmsAgentOmsAgentIdentity {
    /**
     * @return The Client ID of the user-defined Managed Identity assigned to the Kubelets.
     * 
     */
    private final String clientId;
    /**
     * @return The Object ID of the user-defined Managed Identity assigned to the Kubelets.
     * 
     */
    private final String objectId;
    /**
     * @return The ID of the User Assigned Identity assigned to the Kubelets.
     * 
     */
    private final String userAssignedIdentityId;

    @CustomType.Constructor
    private GetKubernetesClusterOmsAgentOmsAgentIdentity(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("objectId") String objectId,
        @CustomType.Parameter("userAssignedIdentityId") String userAssignedIdentityId) {
        this.clientId = clientId;
        this.objectId = objectId;
        this.userAssignedIdentityId = userAssignedIdentityId;
    }

    /**
     * @return The Client ID of the user-defined Managed Identity assigned to the Kubelets.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The Object ID of the user-defined Managed Identity assigned to the Kubelets.
     * 
     */
    public String objectId() {
        return this.objectId;
    }
    /**
     * @return The ID of the User Assigned Identity assigned to the Kubelets.
     * 
     */
    public String userAssignedIdentityId() {
        return this.userAssignedIdentityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterOmsAgentOmsAgentIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String objectId;
        private String userAssignedIdentityId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKubernetesClusterOmsAgentOmsAgentIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.objectId = defaults.objectId;
    	      this.userAssignedIdentityId = defaults.userAssignedIdentityId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder userAssignedIdentityId(String userAssignedIdentityId) {
            this.userAssignedIdentityId = Objects.requireNonNull(userAssignedIdentityId);
            return this;
        }        public GetKubernetesClusterOmsAgentOmsAgentIdentity build() {
            return new GetKubernetesClusterOmsAgentOmsAgentIdentity(clientId, objectId, userAssignedIdentityId);
        }
    }
}