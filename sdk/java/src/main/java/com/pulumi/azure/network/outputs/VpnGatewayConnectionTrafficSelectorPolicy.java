// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VpnGatewayConnectionTrafficSelectorPolicy {
    /**
     * @return A list of local address spaces in CIDR format for this VPN Gateway Connection.
     * 
     */
    private final List<String> localAddressRanges;
    /**
     * @return A list of remote address spaces in CIDR format for this VPN Gateway Connection.
     * 
     */
    private final List<String> remoteAddressRanges;

    @CustomType.Constructor
    private VpnGatewayConnectionTrafficSelectorPolicy(
        @CustomType.Parameter("localAddressRanges") List<String> localAddressRanges,
        @CustomType.Parameter("remoteAddressRanges") List<String> remoteAddressRanges) {
        this.localAddressRanges = localAddressRanges;
        this.remoteAddressRanges = remoteAddressRanges;
    }

    /**
     * @return A list of local address spaces in CIDR format for this VPN Gateway Connection.
     * 
     */
    public List<String> localAddressRanges() {
        return this.localAddressRanges;
    }
    /**
     * @return A list of remote address spaces in CIDR format for this VPN Gateway Connection.
     * 
     */
    public List<String> remoteAddressRanges() {
        return this.remoteAddressRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayConnectionTrafficSelectorPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> localAddressRanges;
        private List<String> remoteAddressRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayConnectionTrafficSelectorPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localAddressRanges = defaults.localAddressRanges;
    	      this.remoteAddressRanges = defaults.remoteAddressRanges;
        }

        public Builder localAddressRanges(List<String> localAddressRanges) {
            this.localAddressRanges = Objects.requireNonNull(localAddressRanges);
            return this;
        }
        public Builder localAddressRanges(String... localAddressRanges) {
            return localAddressRanges(List.of(localAddressRanges));
        }
        public Builder remoteAddressRanges(List<String> remoteAddressRanges) {
            this.remoteAddressRanges = Objects.requireNonNull(remoteAddressRanges);
            return this;
        }
        public Builder remoteAddressRanges(String... remoteAddressRanges) {
            return remoteAddressRanges(List.of(remoteAddressRanges));
        }        public VpnGatewayConnectionTrafficSelectorPolicy build() {
            return new VpnGatewayConnectionTrafficSelectorPolicy(localAddressRanges, remoteAddressRanges);
        }
    }
}