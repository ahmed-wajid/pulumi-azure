// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.ServiceSignUpTermsOfService;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ServiceSignUp {
    /**
     * @return Can users sign up on the development portal?
     * 
     */
    private final Boolean enabled;
    /**
     * @return A `terms_of_service` block as defined below.
     * 
     */
    private final ServiceSignUpTermsOfService termsOfService;

    @CustomType.Constructor
    private ServiceSignUp(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("termsOfService") ServiceSignUpTermsOfService termsOfService) {
        this.enabled = enabled;
        this.termsOfService = termsOfService;
    }

    /**
     * @return Can users sign up on the development portal?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return A `terms_of_service` block as defined below.
     * 
     */
    public ServiceSignUpTermsOfService termsOfService() {
        return this.termsOfService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSignUp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private ServiceSignUpTermsOfService termsOfService;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSignUp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.termsOfService = defaults.termsOfService;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder termsOfService(ServiceSignUpTermsOfService termsOfService) {
            this.termsOfService = Objects.requireNonNull(termsOfService);
            return this;
        }        public ServiceSignUp build() {
            return new ServiceSignUp(enabled, termsOfService);
        }
    }
}