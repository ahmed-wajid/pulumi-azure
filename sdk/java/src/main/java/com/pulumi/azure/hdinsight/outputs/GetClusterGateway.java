// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterGateway {
    /**
     * @return Is the Ambari Portal enabled?
     * 
     */
    private final Boolean enabled;
    /**
     * @return The password used for the Ambari Portal.
     * 
     */
    private final String password;
    /**
     * @return The username used for the Ambari Portal.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private GetClusterGateway(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("username") String username) {
        this.enabled = enabled;
        this.password = password;
        this.username = username;
    }

    /**
     * @return Is the Ambari Portal enabled?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The password used for the Ambari Portal.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The username used for the Ambari Portal.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterGateway defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public GetClusterGateway build() {
            return new GetClusterGateway(enabled, password, username);
        }
    }
}