// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VpnGatewayConnectionTrafficSelectorPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnGatewayConnectionTrafficSelectorPolicyArgs Empty = new VpnGatewayConnectionTrafficSelectorPolicyArgs();

    /**
     * A list of local address spaces in CIDR format for this VPN Gateway Connection.
     * 
     */
    @Import(name="localAddressRanges", required=true)
    private Output<List<String>> localAddressRanges;

    /**
     * @return A list of local address spaces in CIDR format for this VPN Gateway Connection.
     * 
     */
    public Output<List<String>> localAddressRanges() {
        return this.localAddressRanges;
    }

    /**
     * A list of remote address spaces in CIDR format for this VPN Gateway Connection.
     * 
     */
    @Import(name="remoteAddressRanges", required=true)
    private Output<List<String>> remoteAddressRanges;

    /**
     * @return A list of remote address spaces in CIDR format for this VPN Gateway Connection.
     * 
     */
    public Output<List<String>> remoteAddressRanges() {
        return this.remoteAddressRanges;
    }

    private VpnGatewayConnectionTrafficSelectorPolicyArgs() {}

    private VpnGatewayConnectionTrafficSelectorPolicyArgs(VpnGatewayConnectionTrafficSelectorPolicyArgs $) {
        this.localAddressRanges = $.localAddressRanges;
        this.remoteAddressRanges = $.remoteAddressRanges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnGatewayConnectionTrafficSelectorPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnGatewayConnectionTrafficSelectorPolicyArgs $;

        public Builder() {
            $ = new VpnGatewayConnectionTrafficSelectorPolicyArgs();
        }

        public Builder(VpnGatewayConnectionTrafficSelectorPolicyArgs defaults) {
            $ = new VpnGatewayConnectionTrafficSelectorPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localAddressRanges A list of local address spaces in CIDR format for this VPN Gateway Connection.
         * 
         * @return builder
         * 
         */
        public Builder localAddressRanges(Output<List<String>> localAddressRanges) {
            $.localAddressRanges = localAddressRanges;
            return this;
        }

        /**
         * @param localAddressRanges A list of local address spaces in CIDR format for this VPN Gateway Connection.
         * 
         * @return builder
         * 
         */
        public Builder localAddressRanges(List<String> localAddressRanges) {
            return localAddressRanges(Output.of(localAddressRanges));
        }

        /**
         * @param localAddressRanges A list of local address spaces in CIDR format for this VPN Gateway Connection.
         * 
         * @return builder
         * 
         */
        public Builder localAddressRanges(String... localAddressRanges) {
            return localAddressRanges(List.of(localAddressRanges));
        }

        /**
         * @param remoteAddressRanges A list of remote address spaces in CIDR format for this VPN Gateway Connection.
         * 
         * @return builder
         * 
         */
        public Builder remoteAddressRanges(Output<List<String>> remoteAddressRanges) {
            $.remoteAddressRanges = remoteAddressRanges;
            return this;
        }

        /**
         * @param remoteAddressRanges A list of remote address spaces in CIDR format for this VPN Gateway Connection.
         * 
         * @return builder
         * 
         */
        public Builder remoteAddressRanges(List<String> remoteAddressRanges) {
            return remoteAddressRanges(Output.of(remoteAddressRanges));
        }

        /**
         * @param remoteAddressRanges A list of remote address spaces in CIDR format for this VPN Gateway Connection.
         * 
         * @return builder
         * 
         */
        public Builder remoteAddressRanges(String... remoteAddressRanges) {
            return remoteAddressRanges(List.of(remoteAddressRanges));
        }

        public VpnGatewayConnectionTrafficSelectorPolicyArgs build() {
            $.localAddressRanges = Objects.requireNonNull($.localAddressRanges, "expected parameter 'localAddressRanges' to be non-null");
            $.remoteAddressRanges = Objects.requireNonNull($.remoteAddressRanges, "expected parameter 'remoteAddressRanges' to be non-null");
            return $;
        }
    }

}