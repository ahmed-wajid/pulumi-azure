// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VpnSiteLinkBgp {
    /**
     * @return The BGP speaker&#39;s ASN.
     * 
     */
    private final Integer asn;
    /**
     * @return The BGP peering IP address.
     * 
     */
    private final String peeringAddress;

    @CustomType.Constructor
    private VpnSiteLinkBgp(
        @CustomType.Parameter("asn") Integer asn,
        @CustomType.Parameter("peeringAddress") String peeringAddress) {
        this.asn = asn;
        this.peeringAddress = peeringAddress;
    }

    /**
     * @return The BGP speaker&#39;s ASN.
     * 
     */
    public Integer asn() {
        return this.asn;
    }
    /**
     * @return The BGP peering IP address.
     * 
     */
    public String peeringAddress() {
        return this.peeringAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnSiteLinkBgp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer asn;
        private String peeringAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnSiteLinkBgp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.peeringAddress = defaults.peeringAddress;
        }

        public Builder asn(Integer asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }
        public Builder peeringAddress(String peeringAddress) {
            this.peeringAddress = Objects.requireNonNull(peeringAddress);
            return this;
        }        public VpnSiteLinkBgp build() {
            return new VpnSiteLinkBgp(asn, peeringAddress);
        }
    }
}