// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkGatewayBgpSettingsPeeringAddress {
    /**
     * @return A list of Azure custom APIPA addresses assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    private final @Nullable List<String> apipaAddresses;
    /**
     * @return A list of peering address assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    private final @Nullable List<String> defaultAddresses;
    /**
     * @return The name of the IP configuration of this Virtual Network Gateway. In case there are multiple `ip_configuration` blocks defined, this property is **required** to specify.
     * 
     */
    private final @Nullable String ipConfigurationName;
    /**
     * @return A list of tunnel IP addresses assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    private final @Nullable List<String> tunnelIpAddresses;

    @CustomType.Constructor
    private VirtualNetworkGatewayBgpSettingsPeeringAddress(
        @CustomType.Parameter("apipaAddresses") @Nullable List<String> apipaAddresses,
        @CustomType.Parameter("defaultAddresses") @Nullable List<String> defaultAddresses,
        @CustomType.Parameter("ipConfigurationName") @Nullable String ipConfigurationName,
        @CustomType.Parameter("tunnelIpAddresses") @Nullable List<String> tunnelIpAddresses) {
        this.apipaAddresses = apipaAddresses;
        this.defaultAddresses = defaultAddresses;
        this.ipConfigurationName = ipConfigurationName;
        this.tunnelIpAddresses = tunnelIpAddresses;
    }

    /**
     * @return A list of Azure custom APIPA addresses assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    public List<String> apipaAddresses() {
        return this.apipaAddresses == null ? List.of() : this.apipaAddresses;
    }
    /**
     * @return A list of peering address assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    public List<String> defaultAddresses() {
        return this.defaultAddresses == null ? List.of() : this.defaultAddresses;
    }
    /**
     * @return The name of the IP configuration of this Virtual Network Gateway. In case there are multiple `ip_configuration` blocks defined, this property is **required** to specify.
     * 
     */
    public Optional<String> ipConfigurationName() {
        return Optional.ofNullable(this.ipConfigurationName);
    }
    /**
     * @return A list of tunnel IP addresses assigned to the BGP peer of the Virtual Network Gateway.
     * 
     */
    public List<String> tunnelIpAddresses() {
        return this.tunnelIpAddresses == null ? List.of() : this.tunnelIpAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayBgpSettingsPeeringAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> apipaAddresses;
        private @Nullable List<String> defaultAddresses;
        private @Nullable String ipConfigurationName;
        private @Nullable List<String> tunnelIpAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewayBgpSettingsPeeringAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apipaAddresses = defaults.apipaAddresses;
    	      this.defaultAddresses = defaults.defaultAddresses;
    	      this.ipConfigurationName = defaults.ipConfigurationName;
    	      this.tunnelIpAddresses = defaults.tunnelIpAddresses;
        }

        public Builder apipaAddresses(@Nullable List<String> apipaAddresses) {
            this.apipaAddresses = apipaAddresses;
            return this;
        }
        public Builder apipaAddresses(String... apipaAddresses) {
            return apipaAddresses(List.of(apipaAddresses));
        }
        public Builder defaultAddresses(@Nullable List<String> defaultAddresses) {
            this.defaultAddresses = defaultAddresses;
            return this;
        }
        public Builder defaultAddresses(String... defaultAddresses) {
            return defaultAddresses(List.of(defaultAddresses));
        }
        public Builder ipConfigurationName(@Nullable String ipConfigurationName) {
            this.ipConfigurationName = ipConfigurationName;
            return this;
        }
        public Builder tunnelIpAddresses(@Nullable List<String> tunnelIpAddresses) {
            this.tunnelIpAddresses = tunnelIpAddresses;
            return this;
        }
        public Builder tunnelIpAddresses(String... tunnelIpAddresses) {
            return tunnelIpAddresses(List.of(tunnelIpAddresses));
        }        public VirtualNetworkGatewayBgpSettingsPeeringAddress build() {
            return new VirtualNetworkGatewayBgpSettingsPeeringAddress(apipaAddresses, defaultAddresses, ipConfigurationName, tunnelIpAddresses);
        }
    }
}