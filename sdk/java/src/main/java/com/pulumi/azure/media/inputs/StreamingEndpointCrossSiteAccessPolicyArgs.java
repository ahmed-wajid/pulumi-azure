// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamingEndpointCrossSiteAccessPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamingEndpointCrossSiteAccessPolicyArgs Empty = new StreamingEndpointCrossSiteAccessPolicyArgs();

    /**
     * The content of clientaccesspolicy.xml used by Silverlight.
     * 
     */
    @Import(name="clientAccessPolicy")
    private @Nullable Output<String> clientAccessPolicy;

    /**
     * @return The content of clientaccesspolicy.xml used by Silverlight.
     * 
     */
    public Optional<Output<String>> clientAccessPolicy() {
        return Optional.ofNullable(this.clientAccessPolicy);
    }

    /**
     * The content of crossdomain.xml used by Silverlight.
     * 
     */
    @Import(name="crossDomainPolicy")
    private @Nullable Output<String> crossDomainPolicy;

    /**
     * @return The content of crossdomain.xml used by Silverlight.
     * 
     */
    public Optional<Output<String>> crossDomainPolicy() {
        return Optional.ofNullable(this.crossDomainPolicy);
    }

    private StreamingEndpointCrossSiteAccessPolicyArgs() {}

    private StreamingEndpointCrossSiteAccessPolicyArgs(StreamingEndpointCrossSiteAccessPolicyArgs $) {
        this.clientAccessPolicy = $.clientAccessPolicy;
        this.crossDomainPolicy = $.crossDomainPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingEndpointCrossSiteAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingEndpointCrossSiteAccessPolicyArgs $;

        public Builder() {
            $ = new StreamingEndpointCrossSiteAccessPolicyArgs();
        }

        public Builder(StreamingEndpointCrossSiteAccessPolicyArgs defaults) {
            $ = new StreamingEndpointCrossSiteAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientAccessPolicy The content of clientaccesspolicy.xml used by Silverlight.
         * 
         * @return builder
         * 
         */
        public Builder clientAccessPolicy(@Nullable Output<String> clientAccessPolicy) {
            $.clientAccessPolicy = clientAccessPolicy;
            return this;
        }

        /**
         * @param clientAccessPolicy The content of clientaccesspolicy.xml used by Silverlight.
         * 
         * @return builder
         * 
         */
        public Builder clientAccessPolicy(String clientAccessPolicy) {
            return clientAccessPolicy(Output.of(clientAccessPolicy));
        }

        /**
         * @param crossDomainPolicy The content of crossdomain.xml used by Silverlight.
         * 
         * @return builder
         * 
         */
        public Builder crossDomainPolicy(@Nullable Output<String> crossDomainPolicy) {
            $.crossDomainPolicy = crossDomainPolicy;
            return this;
        }

        /**
         * @param crossDomainPolicy The content of crossdomain.xml used by Silverlight.
         * 
         * @return builder
         * 
         */
        public Builder crossDomainPolicy(String crossDomainPolicy) {
            return crossDomainPolicy(Output.of(crossDomainPolicy));
        }

        public StreamingEndpointCrossSiteAccessPolicyArgs build() {
            return $;
        }
    }

}