// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetVirtualHubRouteTableRoute;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualHubRouteTableResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of labels associated with this route table.
     * 
     */
    private List<String> labels;
    /**
     * @return The name which is used for this route.
     * 
     */
    private String name;
    private String resourceGroupName;
    /**
     * @return A `route` block as defined below.
     * 
     */
    private List<GetVirtualHubRouteTableRoute> routes;
    /**
     * @return The ID of the Virtual Hub within which this route table is created
     * 
     */
    private String virtualHubId;
    private String virtualHubName;

    private GetVirtualHubRouteTableResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of labels associated with this route table.
     * 
     */
    public List<String> labels() {
        return this.labels;
    }
    /**
     * @return The name which is used for this route.
     * 
     */
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A `route` block as defined below.
     * 
     */
    public List<GetVirtualHubRouteTableRoute> routes() {
        return this.routes;
    }
    /**
     * @return The ID of the Virtual Hub within which this route table is created
     * 
     */
    public String virtualHubId() {
        return this.virtualHubId;
    }
    public String virtualHubName() {
        return this.virtualHubName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualHubRouteTableResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> labels;
        private String name;
        private String resourceGroupName;
        private List<GetVirtualHubRouteTableRoute> routes;
        private String virtualHubId;
        private String virtualHubName;
        public Builder() {}
        public Builder(GetVirtualHubRouteTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routes = defaults.routes;
    	      this.virtualHubId = defaults.virtualHubId;
    	      this.virtualHubName = defaults.virtualHubName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder labels(List<String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder routes(List<GetVirtualHubRouteTableRoute> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }
        public Builder routes(GetVirtualHubRouteTableRoute... routes) {
            return routes(List.of(routes));
        }
        @CustomType.Setter
        public Builder virtualHubId(String virtualHubId) {
            this.virtualHubId = Objects.requireNonNull(virtualHubId);
            return this;
        }
        @CustomType.Setter
        public Builder virtualHubName(String virtualHubName) {
            this.virtualHubName = Objects.requireNonNull(virtualHubName);
            return this;
        }
        public GetVirtualHubRouteTableResult build() {
            final var o = new GetVirtualHubRouteTableResult();
            o.id = id;
            o.labels = labels;
            o.name = name;
            o.resourceGroupName = resourceGroupName;
            o.routes = routes;
            o.virtualHubId = virtualHubId;
            o.virtualHubName = virtualHubName;
            return o;
        }
    }
}