// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetExpressRouteCircuitPeering;
import com.pulumi.azure.network.outputs.GetExpressRouteCircuitServiceProviderProperty;
import com.pulumi.azure.network.outputs.GetExpressRouteCircuitSku;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetExpressRouteCircuitResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Azure location where the ExpressRoute circuit exists
     * 
     */
    private final String location;
    private final String name;
    /**
     * @return A `peerings` block for the ExpressRoute circuit as documented below
     * 
     */
    private final List<GetExpressRouteCircuitPeering> peerings;
    private final String resourceGroupName;
    /**
     * @return The string needed by the service provider to provision the ExpressRoute circuit.
     * 
     */
    private final String serviceKey;
    /**
     * @return A `service_provider_properties` block for the ExpressRoute circuit as documented below
     * 
     */
    private final List<GetExpressRouteCircuitServiceProviderProperty> serviceProviderProperties;
    /**
     * @return The ExpressRoute circuit provisioning state from your chosen service provider. Possible values are `NotProvisioned`, `Provisioning`, `Provisioned`, and `Deprovisioning`.
     * 
     */
    private final String serviceProviderProvisioningState;
    /**
     * @return A `sku` block for the ExpressRoute circuit as documented below.
     * 
     */
    private final GetExpressRouteCircuitSku sku;

    @CustomType.Constructor
    private GetExpressRouteCircuitResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("peerings") List<GetExpressRouteCircuitPeering> peerings,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("serviceKey") String serviceKey,
        @CustomType.Parameter("serviceProviderProperties") List<GetExpressRouteCircuitServiceProviderProperty> serviceProviderProperties,
        @CustomType.Parameter("serviceProviderProvisioningState") String serviceProviderProvisioningState,
        @CustomType.Parameter("sku") GetExpressRouteCircuitSku sku) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.peerings = peerings;
        this.resourceGroupName = resourceGroupName;
        this.serviceKey = serviceKey;
        this.serviceProviderProperties = serviceProviderProperties;
        this.serviceProviderProvisioningState = serviceProviderProvisioningState;
        this.sku = sku;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure location where the ExpressRoute circuit exists
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return A `peerings` block for the ExpressRoute circuit as documented below
     * 
     */
    public List<GetExpressRouteCircuitPeering> peerings() {
        return this.peerings;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The string needed by the service provider to provision the ExpressRoute circuit.
     * 
     */
    public String serviceKey() {
        return this.serviceKey;
    }
    /**
     * @return A `service_provider_properties` block for the ExpressRoute circuit as documented below
     * 
     */
    public List<GetExpressRouteCircuitServiceProviderProperty> serviceProviderProperties() {
        return this.serviceProviderProperties;
    }
    /**
     * @return The ExpressRoute circuit provisioning state from your chosen service provider. Possible values are `NotProvisioned`, `Provisioning`, `Provisioned`, and `Deprovisioning`.
     * 
     */
    public String serviceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }
    /**
     * @return A `sku` block for the ExpressRoute circuit as documented below.
     * 
     */
    public GetExpressRouteCircuitSku sku() {
        return this.sku;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExpressRouteCircuitResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private List<GetExpressRouteCircuitPeering> peerings;
        private String resourceGroupName;
        private String serviceKey;
        private List<GetExpressRouteCircuitServiceProviderProperty> serviceProviderProperties;
        private String serviceProviderProvisioningState;
        private GetExpressRouteCircuitSku sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExpressRouteCircuitResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.peerings = defaults.peerings;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceKey = defaults.serviceKey;
    	      this.serviceProviderProperties = defaults.serviceProviderProperties;
    	      this.serviceProviderProvisioningState = defaults.serviceProviderProvisioningState;
    	      this.sku = defaults.sku;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder peerings(List<GetExpressRouteCircuitPeering> peerings) {
            this.peerings = Objects.requireNonNull(peerings);
            return this;
        }
        public Builder peerings(GetExpressRouteCircuitPeering... peerings) {
            return peerings(List.of(peerings));
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceKey(String serviceKey) {
            this.serviceKey = Objects.requireNonNull(serviceKey);
            return this;
        }
        public Builder serviceProviderProperties(List<GetExpressRouteCircuitServiceProviderProperty> serviceProviderProperties) {
            this.serviceProviderProperties = Objects.requireNonNull(serviceProviderProperties);
            return this;
        }
        public Builder serviceProviderProperties(GetExpressRouteCircuitServiceProviderProperty... serviceProviderProperties) {
            return serviceProviderProperties(List.of(serviceProviderProperties));
        }
        public Builder serviceProviderProvisioningState(String serviceProviderProvisioningState) {
            this.serviceProviderProvisioningState = Objects.requireNonNull(serviceProviderProvisioningState);
            return this;
        }
        public Builder sku(GetExpressRouteCircuitSku sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }        public GetExpressRouteCircuitResult build() {
            return new GetExpressRouteCircuitResult(id, location, name, peerings, resourceGroupName, serviceKey, serviceProviderProperties, serviceProviderProvisioningState, sku);
        }
    }
}