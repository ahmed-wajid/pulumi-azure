// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.EnvironmentClusterSettingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentState extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentState Empty = new EnvironmentState();

    /**
     * Allowed user added IP ranges on the ASE database. Use the addresses you want to set as the explicit egress address ranges.
     * 
     */
    @Import(name="allowedUserIpCidrs")
    private @Nullable Output<List<String>> allowedUserIpCidrs;

    /**
     * @return Allowed user added IP ranges on the ASE database. Use the addresses you want to set as the explicit egress address ranges.
     * 
     */
    public Optional<Output<List<String>>> allowedUserIpCidrs() {
        return Optional.ofNullable(this.allowedUserIpCidrs);
    }

    /**
     * Zero or more `cluster_setting` blocks as defined below.
     * 
     */
    @Import(name="clusterSettings")
    private @Nullable Output<List<EnvironmentClusterSettingArgs>> clusterSettings;

    /**
     * @return Zero or more `cluster_setting` blocks as defined below.
     * 
     */
    public Optional<Output<List<EnvironmentClusterSettingArgs>>> clusterSettings() {
        return Optional.ofNullable(this.clusterSettings);
    }

    /**
     * Scale factor for front end instances. Possible values are between `5` and `15`. Defaults to `15`.
     * 
     */
    @Import(name="frontEndScaleFactor")
    private @Nullable Output<Integer> frontEndScaleFactor;

    /**
     * @return Scale factor for front end instances. Possible values are between `5` and `15`. Defaults to `15`.
     * 
     */
    public Optional<Output<Integer>> frontEndScaleFactor() {
        return Optional.ofNullable(this.frontEndScaleFactor);
    }

    /**
     * IP address of internal load balancer of the App Service Environment.
     * 
     */
    @Import(name="internalIpAddress")
    private @Nullable Output<String> internalIpAddress;

    /**
     * @return IP address of internal load balancer of the App Service Environment.
     * 
     */
    public Optional<Output<String>> internalIpAddress() {
        return Optional.ofNullable(this.internalIpAddress);
    }

    /**
     * Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment. Possible values are `None`, `Web`, `Publishing` and combined value `&#34;Web, Publishing&#34;`. Defaults to `None`.
     * 
     */
    @Import(name="internalLoadBalancingMode")
    private @Nullable Output<String> internalLoadBalancingMode;

    /**
     * @return Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment. Possible values are `None`, `Web`, `Publishing` and combined value `&#34;Web, Publishing&#34;`. Defaults to `None`.
     * 
     */
    public Optional<Output<String>> internalLoadBalancingMode() {
        return Optional.ofNullable(this.internalLoadBalancingMode);
    }

    /**
     * The location where the App Service Environment exists.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location where the App Service Environment exists.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the App Service Environment. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the App Service Environment. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of outbound IP addresses of the App Service Environment.
     * 
     */
    @Import(name="outboundIpAddresses")
    private @Nullable Output<List<String>> outboundIpAddresses;

    /**
     * @return List of outbound IP addresses of the App Service Environment.
     * 
     */
    public Optional<Output<List<String>>> outboundIpAddresses() {
        return Optional.ofNullable(this.outboundIpAddresses);
    }

    /**
     * Pricing tier for the front end instances. Possible values are `I1`, `I2` and `I3`. Defaults to `I1`.
     * 
     */
    @Import(name="pricingTier")
    private @Nullable Output<String> pricingTier;

    /**
     * @return Pricing tier for the front end instances. Possible values are `I1`, `I2` and `I3`. Defaults to `I1`.
     * 
     */
    public Optional<Output<String>> pricingTier() {
        return Optional.ofNullable(this.pricingTier);
    }

    /**
     * The name of the Resource Group where the App Service Environment exists. Defaults to the Resource Group of the Subnet (specified by `subnet_id`).
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the App Service Environment exists. Defaults to the Resource Group of the Subnet (specified by `subnet_id`).
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * IP address of service endpoint of the App Service Environment.
     * 
     */
    @Import(name="serviceIpAddress")
    private @Nullable Output<String> serviceIpAddress;

    /**
     * @return IP address of service endpoint of the App Service Environment.
     * 
     */
    public Optional<Output<String>> serviceIpAddress() {
        return Optional.ofNullable(this.serviceIpAddress);
    }

    /**
     * The ID of the Subnet which the App Service Environment should be connected to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet which the App Service Environment should be connected to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private EnvironmentState() {}

    private EnvironmentState(EnvironmentState $) {
        this.allowedUserIpCidrs = $.allowedUserIpCidrs;
        this.clusterSettings = $.clusterSettings;
        this.frontEndScaleFactor = $.frontEndScaleFactor;
        this.internalIpAddress = $.internalIpAddress;
        this.internalLoadBalancingMode = $.internalLoadBalancingMode;
        this.location = $.location;
        this.name = $.name;
        this.outboundIpAddresses = $.outboundIpAddresses;
        this.pricingTier = $.pricingTier;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceIpAddress = $.serviceIpAddress;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentState $;

        public Builder() {
            $ = new EnvironmentState();
        }

        public Builder(EnvironmentState defaults) {
            $ = new EnvironmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedUserIpCidrs Allowed user added IP ranges on the ASE database. Use the addresses you want to set as the explicit egress address ranges.
         * 
         * @return builder
         * 
         */
        public Builder allowedUserIpCidrs(@Nullable Output<List<String>> allowedUserIpCidrs) {
            $.allowedUserIpCidrs = allowedUserIpCidrs;
            return this;
        }

        /**
         * @param allowedUserIpCidrs Allowed user added IP ranges on the ASE database. Use the addresses you want to set as the explicit egress address ranges.
         * 
         * @return builder
         * 
         */
        public Builder allowedUserIpCidrs(List<String> allowedUserIpCidrs) {
            return allowedUserIpCidrs(Output.of(allowedUserIpCidrs));
        }

        /**
         * @param allowedUserIpCidrs Allowed user added IP ranges on the ASE database. Use the addresses you want to set as the explicit egress address ranges.
         * 
         * @return builder
         * 
         */
        public Builder allowedUserIpCidrs(String... allowedUserIpCidrs) {
            return allowedUserIpCidrs(List.of(allowedUserIpCidrs));
        }

        /**
         * @param clusterSettings Zero or more `cluster_setting` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder clusterSettings(@Nullable Output<List<EnvironmentClusterSettingArgs>> clusterSettings) {
            $.clusterSettings = clusterSettings;
            return this;
        }

        /**
         * @param clusterSettings Zero or more `cluster_setting` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder clusterSettings(List<EnvironmentClusterSettingArgs> clusterSettings) {
            return clusterSettings(Output.of(clusterSettings));
        }

        /**
         * @param clusterSettings Zero or more `cluster_setting` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder clusterSettings(EnvironmentClusterSettingArgs... clusterSettings) {
            return clusterSettings(List.of(clusterSettings));
        }

        /**
         * @param frontEndScaleFactor Scale factor for front end instances. Possible values are between `5` and `15`. Defaults to `15`.
         * 
         * @return builder
         * 
         */
        public Builder frontEndScaleFactor(@Nullable Output<Integer> frontEndScaleFactor) {
            $.frontEndScaleFactor = frontEndScaleFactor;
            return this;
        }

        /**
         * @param frontEndScaleFactor Scale factor for front end instances. Possible values are between `5` and `15`. Defaults to `15`.
         * 
         * @return builder
         * 
         */
        public Builder frontEndScaleFactor(Integer frontEndScaleFactor) {
            return frontEndScaleFactor(Output.of(frontEndScaleFactor));
        }

        /**
         * @param internalIpAddress IP address of internal load balancer of the App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder internalIpAddress(@Nullable Output<String> internalIpAddress) {
            $.internalIpAddress = internalIpAddress;
            return this;
        }

        /**
         * @param internalIpAddress IP address of internal load balancer of the App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder internalIpAddress(String internalIpAddress) {
            return internalIpAddress(Output.of(internalIpAddress));
        }

        /**
         * @param internalLoadBalancingMode Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment. Possible values are `None`, `Web`, `Publishing` and combined value `&#34;Web, Publishing&#34;`. Defaults to `None`.
         * 
         * @return builder
         * 
         */
        public Builder internalLoadBalancingMode(@Nullable Output<String> internalLoadBalancingMode) {
            $.internalLoadBalancingMode = internalLoadBalancingMode;
            return this;
        }

        /**
         * @param internalLoadBalancingMode Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment. Possible values are `None`, `Web`, `Publishing` and combined value `&#34;Web, Publishing&#34;`. Defaults to `None`.
         * 
         * @return builder
         * 
         */
        public Builder internalLoadBalancingMode(String internalLoadBalancingMode) {
            return internalLoadBalancingMode(Output.of(internalLoadBalancingMode));
        }

        /**
         * @param location The location where the App Service Environment exists.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location where the App Service Environment exists.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the App Service Environment. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the App Service Environment. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outboundIpAddresses List of outbound IP addresses of the App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder outboundIpAddresses(@Nullable Output<List<String>> outboundIpAddresses) {
            $.outboundIpAddresses = outboundIpAddresses;
            return this;
        }

        /**
         * @param outboundIpAddresses List of outbound IP addresses of the App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder outboundIpAddresses(List<String> outboundIpAddresses) {
            return outboundIpAddresses(Output.of(outboundIpAddresses));
        }

        /**
         * @param outboundIpAddresses List of outbound IP addresses of the App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder outboundIpAddresses(String... outboundIpAddresses) {
            return outboundIpAddresses(List.of(outboundIpAddresses));
        }

        /**
         * @param pricingTier Pricing tier for the front end instances. Possible values are `I1`, `I2` and `I3`. Defaults to `I1`.
         * 
         * @return builder
         * 
         */
        public Builder pricingTier(@Nullable Output<String> pricingTier) {
            $.pricingTier = pricingTier;
            return this;
        }

        /**
         * @param pricingTier Pricing tier for the front end instances. Possible values are `I1`, `I2` and `I3`. Defaults to `I1`.
         * 
         * @return builder
         * 
         */
        public Builder pricingTier(String pricingTier) {
            return pricingTier(Output.of(pricingTier));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the App Service Environment exists. Defaults to the Resource Group of the Subnet (specified by `subnet_id`).
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the App Service Environment exists. Defaults to the Resource Group of the Subnet (specified by `subnet_id`).
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceIpAddress IP address of service endpoint of the App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder serviceIpAddress(@Nullable Output<String> serviceIpAddress) {
            $.serviceIpAddress = serviceIpAddress;
            return this;
        }

        /**
         * @param serviceIpAddress IP address of service endpoint of the App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder serviceIpAddress(String serviceIpAddress) {
            return serviceIpAddress(Output.of(serviceIpAddress));
        }

        /**
         * @param subnetId The ID of the Subnet which the App Service Environment should be connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet which the App Service Environment should be connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public EnvironmentState build() {
            return $;
        }
    }

}