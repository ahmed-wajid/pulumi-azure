// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.azure.apimanagement.inputs.ServiceSignUpTermsOfServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ServiceSignUpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceSignUpArgs Empty = new ServiceSignUpArgs();

    /**
     * Can users sign up on the development portal?
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Can users sign up on the development portal?
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * A `terms_of_service` block as defined below.
     * 
     */
    @Import(name="termsOfService", required=true)
    private Output<ServiceSignUpTermsOfServiceArgs> termsOfService;

    /**
     * @return A `terms_of_service` block as defined below.
     * 
     */
    public Output<ServiceSignUpTermsOfServiceArgs> termsOfService() {
        return this.termsOfService;
    }

    private ServiceSignUpArgs() {}

    private ServiceSignUpArgs(ServiceSignUpArgs $) {
        this.enabled = $.enabled;
        this.termsOfService = $.termsOfService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSignUpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSignUpArgs $;

        public Builder() {
            $ = new ServiceSignUpArgs();
        }

        public Builder(ServiceSignUpArgs defaults) {
            $ = new ServiceSignUpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Can users sign up on the development portal?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Can users sign up on the development portal?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param termsOfService A `terms_of_service` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder termsOfService(Output<ServiceSignUpTermsOfServiceArgs> termsOfService) {
            $.termsOfService = termsOfService;
            return this;
        }

        /**
         * @param termsOfService A `terms_of_service` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder termsOfService(ServiceSignUpTermsOfServiceArgs termsOfService) {
            return termsOfService(Output.of(termsOfService));
        }

        public ServiceSignUpArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.termsOfService = Objects.requireNonNull($.termsOfService, "expected parameter 'termsOfService' to be non-null");
            return $;
        }
    }

}