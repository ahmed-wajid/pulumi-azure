// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.ProfileContainerNetworkInterfaceIpConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ProfileContainerNetworkInterface {
    /**
     * @return One or more `ip_configuration` blocks as documented below.
     * 
     */
    private final List<ProfileContainerNetworkInterfaceIpConfiguration> ipConfigurations;
    /**
     * @return Specifies the name of the IP Configuration.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ProfileContainerNetworkInterface(
        @CustomType.Parameter("ipConfigurations") List<ProfileContainerNetworkInterfaceIpConfiguration> ipConfigurations,
        @CustomType.Parameter("name") String name) {
        this.ipConfigurations = ipConfigurations;
        this.name = name;
    }

    /**
     * @return One or more `ip_configuration` blocks as documented below.
     * 
     */
    public List<ProfileContainerNetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * @return Specifies the name of the IP Configuration.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfileContainerNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ProfileContainerNetworkInterfaceIpConfiguration> ipConfigurations;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfileContainerNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
        }

        public Builder ipConfigurations(List<ProfileContainerNetworkInterfaceIpConfiguration> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(ProfileContainerNetworkInterfaceIpConfiguration... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ProfileContainerNetworkInterface build() {
            return new ProfileContainerNetworkInterface(ipConfigurations, name);
        }
    }
}