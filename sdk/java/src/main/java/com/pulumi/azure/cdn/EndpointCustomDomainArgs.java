// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn;

import com.pulumi.azure.cdn.inputs.EndpointCustomDomainCdnManagedHttpsArgs;
import com.pulumi.azure.cdn.inputs.EndpointCustomDomainUserManagedHttpsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointCustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointCustomDomainArgs Empty = new EndpointCustomDomainArgs();

    /**
     * The ID of the CDN Endpoint. Changing this forces a new CDN Endpoint Custom Domain to be created.
     * 
     */
    @Import(name="cdnEndpointId", required=true)
    private Output<String> cdnEndpointId;

    /**
     * @return The ID of the CDN Endpoint. Changing this forces a new CDN Endpoint Custom Domain to be created.
     * 
     */
    public Output<String> cdnEndpointId() {
        return this.cdnEndpointId;
    }

    /**
     * A `cdn_managed_https` block as defined below.
     * 
     */
    @Import(name="cdnManagedHttps")
    private @Nullable Output<EndpointCustomDomainCdnManagedHttpsArgs> cdnManagedHttps;

    /**
     * @return A `cdn_managed_https` block as defined below.
     * 
     */
    public Optional<Output<EndpointCustomDomainCdnManagedHttpsArgs>> cdnManagedHttps() {
        return Optional.ofNullable(this.cdnManagedHttps);
    }

    /**
     * The host name of the custom domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
     * 
     */
    @Import(name="hostName", required=true)
    private Output<String> hostName;

    /**
     * @return The host name of the custom domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }

    /**
     * The name which should be used for this CDN Endpoint Custom Domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this CDN Endpoint Custom Domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `user_managed_https` block as defined below.
     * 
     */
    @Import(name="userManagedHttps")
    private @Nullable Output<EndpointCustomDomainUserManagedHttpsArgs> userManagedHttps;

    /**
     * @return A `user_managed_https` block as defined below.
     * 
     */
    public Optional<Output<EndpointCustomDomainUserManagedHttpsArgs>> userManagedHttps() {
        return Optional.ofNullable(this.userManagedHttps);
    }

    private EndpointCustomDomainArgs() {}

    private EndpointCustomDomainArgs(EndpointCustomDomainArgs $) {
        this.cdnEndpointId = $.cdnEndpointId;
        this.cdnManagedHttps = $.cdnManagedHttps;
        this.hostName = $.hostName;
        this.name = $.name;
        this.userManagedHttps = $.userManagedHttps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointCustomDomainArgs $;

        public Builder() {
            $ = new EndpointCustomDomainArgs();
        }

        public Builder(EndpointCustomDomainArgs defaults) {
            $ = new EndpointCustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cdnEndpointId The ID of the CDN Endpoint. Changing this forces a new CDN Endpoint Custom Domain to be created.
         * 
         * @return builder
         * 
         */
        public Builder cdnEndpointId(Output<String> cdnEndpointId) {
            $.cdnEndpointId = cdnEndpointId;
            return this;
        }

        /**
         * @param cdnEndpointId The ID of the CDN Endpoint. Changing this forces a new CDN Endpoint Custom Domain to be created.
         * 
         * @return builder
         * 
         */
        public Builder cdnEndpointId(String cdnEndpointId) {
            return cdnEndpointId(Output.of(cdnEndpointId));
        }

        /**
         * @param cdnManagedHttps A `cdn_managed_https` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder cdnManagedHttps(@Nullable Output<EndpointCustomDomainCdnManagedHttpsArgs> cdnManagedHttps) {
            $.cdnManagedHttps = cdnManagedHttps;
            return this;
        }

        /**
         * @param cdnManagedHttps A `cdn_managed_https` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder cdnManagedHttps(EndpointCustomDomainCdnManagedHttpsArgs cdnManagedHttps) {
            return cdnManagedHttps(Output.of(cdnManagedHttps));
        }

        /**
         * @param hostName The host name of the custom domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
         * 
         * @return builder
         * 
         */
        public Builder hostName(Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName The host name of the custom domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param name The name which should be used for this CDN Endpoint Custom Domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this CDN Endpoint Custom Domain. Changing this forces a new CDN Endpoint Custom Domain to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param userManagedHttps A `user_managed_https` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder userManagedHttps(@Nullable Output<EndpointCustomDomainUserManagedHttpsArgs> userManagedHttps) {
            $.userManagedHttps = userManagedHttps;
            return this;
        }

        /**
         * @param userManagedHttps A `user_managed_https` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder userManagedHttps(EndpointCustomDomainUserManagedHttpsArgs userManagedHttps) {
            return userManagedHttps(Output.of(userManagedHttps));
        }

        public EndpointCustomDomainArgs build() {
            $.cdnEndpointId = Objects.requireNonNull($.cdnEndpointId, "expected parameter 'cdnEndpointId' to be non-null");
            $.hostName = Objects.requireNonNull($.hostName, "expected parameter 'hostName' to be non-null");
            return $;
        }
    }

}