// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkSitePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkSitePlainArgs Empty = new GetNetworkSitePlainArgs();

    /**
     * the ID of the Mobile Network which the Mobile Network Site belongs to.
     * 
     */
    @Import(name="mobileNetworkId", required=true)
    private String mobileNetworkId;

    /**
     * @return the ID of the Mobile Network which the Mobile Network Site belongs to.
     * 
     */
    public String mobileNetworkId() {
        return this.mobileNetworkId;
    }

    /**
     * The name which should be used for this Mobile Network Site.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name which should be used for this Mobile Network Site.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetNetworkSitePlainArgs() {}

    private GetNetworkSitePlainArgs(GetNetworkSitePlainArgs $) {
        this.mobileNetworkId = $.mobileNetworkId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkSitePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkSitePlainArgs $;

        public Builder() {
            $ = new GetNetworkSitePlainArgs();
        }

        public Builder(GetNetworkSitePlainArgs defaults) {
            $ = new GetNetworkSitePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mobileNetworkId the ID of the Mobile Network which the Mobile Network Site belongs to.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkId(String mobileNetworkId) {
            $.mobileNetworkId = mobileNetworkId;
            return this;
        }

        /**
         * @param name The name which should be used for this Mobile Network Site.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetNetworkSitePlainArgs build() {
            $.mobileNetworkId = Objects.requireNonNull($.mobileNetworkId, "expected parameter 'mobileNetworkId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}