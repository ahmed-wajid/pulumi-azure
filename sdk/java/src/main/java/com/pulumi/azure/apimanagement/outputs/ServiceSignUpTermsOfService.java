// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceSignUpTermsOfService {
    /**
     * @return Should the user be asked for consent during sign up?
     * 
     */
    private final Boolean consentRequired;
    /**
     * @return Should Terms of Service be displayed during sign up?.
     * 
     */
    private final Boolean enabled;
    /**
     * @return The Terms of Service which users are required to agree to in order to sign up.
     * 
     */
    private final @Nullable String text;

    @CustomType.Constructor
    private ServiceSignUpTermsOfService(
        @CustomType.Parameter("consentRequired") Boolean consentRequired,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("text") @Nullable String text) {
        this.consentRequired = consentRequired;
        this.enabled = enabled;
        this.text = text;
    }

    /**
     * @return Should the user be asked for consent during sign up?
     * 
     */
    public Boolean consentRequired() {
        return this.consentRequired;
    }
    /**
     * @return Should Terms of Service be displayed during sign up?.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The Terms of Service which users are required to agree to in order to sign up.
     * 
     */
    public Optional<String> text() {
        return Optional.ofNullable(this.text);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSignUpTermsOfService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean consentRequired;
        private Boolean enabled;
        private @Nullable String text;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSignUpTermsOfService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentRequired = defaults.consentRequired;
    	      this.enabled = defaults.enabled;
    	      this.text = defaults.text;
        }

        public Builder consentRequired(Boolean consentRequired) {
            this.consentRequired = Objects.requireNonNull(consentRequired);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder text(@Nullable String text) {
            this.text = text;
            return this;
        }        public ServiceSignUpTermsOfService build() {
            return new ServiceSignUpTermsOfService(consentRequired, enabled, text);
        }
    }
}