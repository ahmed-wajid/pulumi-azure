// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetAppServiceEnvironmentClusterSetting;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAppServiceEnvironmentResult {
    /**
     * @return Zero or more `cluster_setting` blocks as defined below.
     * 
     */
    private final List<GetAppServiceEnvironmentClusterSetting> clusterSettings;
    /**
     * @return The number of app instances per App Service Environment Front End.
     * 
     */
    private final Integer frontEndScaleFactor;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return IP address of internal load balancer of the App Service Environment.
     * 
     */
    private final String internalIpAddress;
    /**
     * @return The Azure Region where the App Service Environment exists.
     * 
     */
    private final String location;
    /**
     * @return The name of the Cluster Setting.
     * 
     */
    private final String name;
    /**
     * @return List of outbound IP addresses of the App Service Environment.
     * 
     */
    private final List<String> outboundIpAddresses;
    /**
     * @return The Pricing Tier (Isolated SKU) of the App Service Environment.
     * 
     */
    private final String pricingTier;
    private final String resourceGroupName;
    /**
     * @return IP address of service endpoint of the App Service Environment.
     * 
     */
    private final String serviceIpAddress;
    /**
     * @return A mapping of tags assigned to the App Service Environment.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetAppServiceEnvironmentResult(
        @CustomType.Parameter("clusterSettings") List<GetAppServiceEnvironmentClusterSetting> clusterSettings,
        @CustomType.Parameter("frontEndScaleFactor") Integer frontEndScaleFactor,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("internalIpAddress") String internalIpAddress,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outboundIpAddresses") List<String> outboundIpAddresses,
        @CustomType.Parameter("pricingTier") String pricingTier,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("serviceIpAddress") String serviceIpAddress,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.clusterSettings = clusterSettings;
        this.frontEndScaleFactor = frontEndScaleFactor;
        this.id = id;
        this.internalIpAddress = internalIpAddress;
        this.location = location;
        this.name = name;
        this.outboundIpAddresses = outboundIpAddresses;
        this.pricingTier = pricingTier;
        this.resourceGroupName = resourceGroupName;
        this.serviceIpAddress = serviceIpAddress;
        this.tags = tags;
    }

    /**
     * @return Zero or more `cluster_setting` blocks as defined below.
     * 
     */
    public List<GetAppServiceEnvironmentClusterSetting> clusterSettings() {
        return this.clusterSettings;
    }
    /**
     * @return The number of app instances per App Service Environment Front End.
     * 
     */
    public Integer frontEndScaleFactor() {
        return this.frontEndScaleFactor;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IP address of internal load balancer of the App Service Environment.
     * 
     */
    public String internalIpAddress() {
        return this.internalIpAddress;
    }
    /**
     * @return The Azure Region where the App Service Environment exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the Cluster Setting.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of outbound IP addresses of the App Service Environment.
     * 
     */
    public List<String> outboundIpAddresses() {
        return this.outboundIpAddresses;
    }
    /**
     * @return The Pricing Tier (Isolated SKU) of the App Service Environment.
     * 
     */
    public String pricingTier() {
        return this.pricingTier;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return IP address of service endpoint of the App Service Environment.
     * 
     */
    public String serviceIpAddress() {
        return this.serviceIpAddress;
    }
    /**
     * @return A mapping of tags assigned to the App Service Environment.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppServiceEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAppServiceEnvironmentClusterSetting> clusterSettings;
        private Integer frontEndScaleFactor;
        private String id;
        private String internalIpAddress;
        private String location;
        private String name;
        private List<String> outboundIpAddresses;
        private String pricingTier;
        private String resourceGroupName;
        private String serviceIpAddress;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppServiceEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSettings = defaults.clusterSettings;
    	      this.frontEndScaleFactor = defaults.frontEndScaleFactor;
    	      this.id = defaults.id;
    	      this.internalIpAddress = defaults.internalIpAddress;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outboundIpAddresses = defaults.outboundIpAddresses;
    	      this.pricingTier = defaults.pricingTier;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceIpAddress = defaults.serviceIpAddress;
    	      this.tags = defaults.tags;
        }

        public Builder clusterSettings(List<GetAppServiceEnvironmentClusterSetting> clusterSettings) {
            this.clusterSettings = Objects.requireNonNull(clusterSettings);
            return this;
        }
        public Builder clusterSettings(GetAppServiceEnvironmentClusterSetting... clusterSettings) {
            return clusterSettings(List.of(clusterSettings));
        }
        public Builder frontEndScaleFactor(Integer frontEndScaleFactor) {
            this.frontEndScaleFactor = Objects.requireNonNull(frontEndScaleFactor);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder internalIpAddress(String internalIpAddress) {
            this.internalIpAddress = Objects.requireNonNull(internalIpAddress);
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
        public Builder outboundIpAddresses(List<String> outboundIpAddresses) {
            this.outboundIpAddresses = Objects.requireNonNull(outboundIpAddresses);
            return this;
        }
        public Builder outboundIpAddresses(String... outboundIpAddresses) {
            return outboundIpAddresses(List.of(outboundIpAddresses));
        }
        public Builder pricingTier(String pricingTier) {
            this.pricingTier = Objects.requireNonNull(pricingTier);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceIpAddress(String serviceIpAddress) {
            this.serviceIpAddress = Objects.requireNonNull(serviceIpAddress);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetAppServiceEnvironmentResult build() {
            return new GetAppServiceEnvironmentResult(clusterSettings, frontEndScaleFactor, id, internalIpAddress, location, name, outboundIpAddresses, pricingTier, resourceGroupName, serviceIpAddress, tags);
        }
    }
}