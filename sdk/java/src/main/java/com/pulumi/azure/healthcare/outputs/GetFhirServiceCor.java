// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFhirServiceCor {
    /**
     * @return The set of headers to be allowed via CORS.
     * 
     */
    private final List<String> allowedHeaders;
    /**
     * @return The methods to be allowed via CORS.
     * 
     */
    private final List<String> allowedMethods;
    /**
     * @return The set of origins to be allowed via CORS.
     * 
     */
    private final List<String> allowedOrigins;
    /**
     * @return Are credentials allowed via CORS?
     * 
     */
    private final Boolean credentialsAllowed;
    /**
     * @return The max age to be allowed via CORS.
     * 
     */
    private final Integer maxAgeInSeconds;

    @CustomType.Constructor
    private GetFhirServiceCor(
        @CustomType.Parameter("allowedHeaders") List<String> allowedHeaders,
        @CustomType.Parameter("allowedMethods") List<String> allowedMethods,
        @CustomType.Parameter("allowedOrigins") List<String> allowedOrigins,
        @CustomType.Parameter("credentialsAllowed") Boolean credentialsAllowed,
        @CustomType.Parameter("maxAgeInSeconds") Integer maxAgeInSeconds) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = allowedMethods;
        this.allowedOrigins = allowedOrigins;
        this.credentialsAllowed = credentialsAllowed;
        this.maxAgeInSeconds = maxAgeInSeconds;
    }

    /**
     * @return The set of headers to be allowed via CORS.
     * 
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders;
    }
    /**
     * @return The methods to be allowed via CORS.
     * 
     */
    public List<String> allowedMethods() {
        return this.allowedMethods;
    }
    /**
     * @return The set of origins to be allowed via CORS.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return Are credentials allowed via CORS?
     * 
     */
    public Boolean credentialsAllowed() {
        return this.credentialsAllowed;
    }
    /**
     * @return The max age to be allowed via CORS.
     * 
     */
    public Integer maxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFhirServiceCor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedHeaders;
        private List<String> allowedMethods;
        private List<String> allowedOrigins;
        private Boolean credentialsAllowed;
        private Integer maxAgeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFhirServiceCor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.credentialsAllowed = defaults.credentialsAllowed;
    	      this.maxAgeInSeconds = defaults.maxAgeInSeconds;
        }

        public Builder allowedHeaders(List<String> allowedHeaders) {
            this.allowedHeaders = Objects.requireNonNull(allowedHeaders);
            return this;
        }
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }
        public Builder allowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        public Builder credentialsAllowed(Boolean credentialsAllowed) {
            this.credentialsAllowed = Objects.requireNonNull(credentialsAllowed);
            return this;
        }
        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = Objects.requireNonNull(maxAgeInSeconds);
            return this;
        }        public GetFhirServiceCor build() {
            return new GetFhirServiceCor(allowedHeaders, allowedMethods, allowedOrigins, credentialsAllowed, maxAgeInSeconds);
        }
    }
}