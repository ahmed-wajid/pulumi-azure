// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterWebAppRoutingWebAppRoutingIdentity {
    /**
     * @return The Client ID of the user-defined Managed Identity to be assigned to the Kubelets. If not specified a Managed Identity is created automatically. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The Object ID of the user-defined Managed Identity assigned to the Kubelets.If not specified a Managed Identity is created automatically. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String objectId;
    /**
     * @return The ID of the User Assigned Identity assigned to the Kubelets. If not specified a Managed Identity is created automatically. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When `kubelet_identity` is enabled - The `type` field in the `identity` block must be set to `UserAssigned` and `identity_ids` must be set.
     * 
     */
    private @Nullable String userAssignedIdentityId;

    private KubernetesClusterWebAppRoutingWebAppRoutingIdentity() {}
    /**
     * @return The Client ID of the user-defined Managed Identity to be assigned to the Kubelets. If not specified a Managed Identity is created automatically. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The Object ID of the user-defined Managed Identity assigned to the Kubelets.If not specified a Managed Identity is created automatically. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * @return The ID of the User Assigned Identity assigned to the Kubelets. If not specified a Managed Identity is created automatically. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When `kubelet_identity` is enabled - The `type` field in the `identity` block must be set to `UserAssigned` and `identity_ids` must be set.
     * 
     */
    public Optional<String> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterWebAppRoutingWebAppRoutingIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String objectId;
        private @Nullable String userAssignedIdentityId;
        public Builder() {}
        public Builder(KubernetesClusterWebAppRoutingWebAppRoutingIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.objectId = defaults.objectId;
    	      this.userAssignedIdentityId = defaults.userAssignedIdentityId;
        }

        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        @CustomType.Setter
        public Builder userAssignedIdentityId(@Nullable String userAssignedIdentityId) {
            this.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }
        public KubernetesClusterWebAppRoutingWebAppRoutingIdentity build() {
            final var o = new KubernetesClusterWebAppRoutingWebAppRoutingIdentity();
            o.clientId = clientId;
            o.objectId = objectId;
            o.userAssignedIdentityId = userAssignedIdentityId;
            return o;
        }
    }
}