// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSourceControlTokenResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The GitHub Token value.
     * 
     */
    private final String token;
    private final String tokenSecret;
    private final String type;

    @CustomType.Constructor
    private GetSourceControlTokenResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("token") String token,
        @CustomType.Parameter("tokenSecret") String tokenSecret,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.token = token;
        this.tokenSecret = tokenSecret;
        this.type = type;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The GitHub Token value.
     * 
     */
    public String token() {
        return this.token;
    }
    public String tokenSecret() {
        return this.tokenSecret;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSourceControlTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String token;
        private String tokenSecret;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSourceControlTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.token = defaults.token;
    	      this.tokenSecret = defaults.tokenSecret;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public Builder tokenSecret(String tokenSecret) {
            this.tokenSecret = Objects.requireNonNull(tokenSecret);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSourceControlTokenResult build() {
            return new GetSourceControlTokenResult(id, token, tokenSecret, type);
        }
    }
}