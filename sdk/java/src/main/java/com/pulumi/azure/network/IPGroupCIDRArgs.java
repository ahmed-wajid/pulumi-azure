// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IPGroupCIDRArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPGroupCIDRArgs Empty = new IPGroupCIDRArgs();

    /**
     * The `CIDR` that should be added to the IP Group.
     * Changing this forces a new IP Group CIDR to be created.
     * 
     */
    @Import(name="cidr", required=true)
    private Output<String> cidr;

    /**
     * @return The `CIDR` that should be added to the IP Group.
     * Changing this forces a new IP Group CIDR to be created.
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }

    /**
     * The ID of the destination IP Group.
     * Changing this forces a new IP Group CIDR to be created.
     * 
     */
    @Import(name="ipGroupId", required=true)
    private Output<String> ipGroupId;

    /**
     * @return The ID of the destination IP Group.
     * Changing this forces a new IP Group CIDR to be created.
     * 
     */
    public Output<String> ipGroupId() {
        return this.ipGroupId;
    }

    private IPGroupCIDRArgs() {}

    private IPGroupCIDRArgs(IPGroupCIDRArgs $) {
        this.cidr = $.cidr;
        this.ipGroupId = $.ipGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPGroupCIDRArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPGroupCIDRArgs $;

        public Builder() {
            $ = new IPGroupCIDRArgs();
        }

        public Builder(IPGroupCIDRArgs defaults) {
            $ = new IPGroupCIDRArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr The `CIDR` that should be added to the IP Group.
         * Changing this forces a new IP Group CIDR to be created.
         * 
         * @return builder
         * 
         */
        public Builder cidr(Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr The `CIDR` that should be added to the IP Group.
         * Changing this forces a new IP Group CIDR to be created.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param ipGroupId The ID of the destination IP Group.
         * Changing this forces a new IP Group CIDR to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipGroupId(Output<String> ipGroupId) {
            $.ipGroupId = ipGroupId;
            return this;
        }

        /**
         * @param ipGroupId The ID of the destination IP Group.
         * Changing this forces a new IP Group CIDR to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipGroupId(String ipGroupId) {
            return ipGroupId(Output.of(ipGroupId));
        }

        public IPGroupCIDRArgs build() {
            $.cidr = Objects.requireNonNull($.cidr, "expected parameter 'cidr' to be non-null");
            $.ipGroupId = Objects.requireNonNull($.ipGroupId, "expected parameter 'ipGroupId' to be non-null");
            return $;
        }
    }

}