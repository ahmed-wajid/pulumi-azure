// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dashboard.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GrafanaAzureMonitorWorkspaceIntegration {
    /**
     * @return Specifies the resource ID of the connected Azure Monitor Workspace.
     * 
     */
    private String resourceId;

    private GrafanaAzureMonitorWorkspaceIntegration() {}
    /**
     * @return Specifies the resource ID of the connected Azure Monitor Workspace.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafanaAzureMonitorWorkspaceIntegration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceId;
        public Builder() {}
        public Builder(GrafanaAzureMonitorWorkspaceIntegration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        @CustomType.Setter
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public GrafanaAzureMonitorWorkspaceIntegration build() {
            final var o = new GrafanaAzureMonitorWorkspaceIntegration();
            o.resourceId = resourceId;
            return o;
        }
    }
}