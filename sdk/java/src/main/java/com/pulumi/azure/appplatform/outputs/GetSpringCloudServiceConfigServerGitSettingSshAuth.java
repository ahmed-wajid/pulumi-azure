// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSpringCloudServiceConfigServerGitSettingSshAuth {
    /**
     * @return The host key of the Git repository server.
     * 
     */
    private final String hostKey;
    /**
     * @return The host key algorithm.
     * 
     */
    private final String hostKeyAlgorithm;
    /**
     * @return The SSH private key to access the Git repository, needed when the URI starts with `git@` or `ssh://`.
     * 
     */
    private final String privateKey;
    /**
     * @return Indicates whether the Config Server instance will fail to start if the host_key does not match.
     * 
     */
    private final Boolean strictHostKeyCheckingEnabled;

    @CustomType.Constructor
    private GetSpringCloudServiceConfigServerGitSettingSshAuth(
        @CustomType.Parameter("hostKey") String hostKey,
        @CustomType.Parameter("hostKeyAlgorithm") String hostKeyAlgorithm,
        @CustomType.Parameter("privateKey") String privateKey,
        @CustomType.Parameter("strictHostKeyCheckingEnabled") Boolean strictHostKeyCheckingEnabled) {
        this.hostKey = hostKey;
        this.hostKeyAlgorithm = hostKeyAlgorithm;
        this.privateKey = privateKey;
        this.strictHostKeyCheckingEnabled = strictHostKeyCheckingEnabled;
    }

    /**
     * @return The host key of the Git repository server.
     * 
     */
    public String hostKey() {
        return this.hostKey;
    }
    /**
     * @return The host key algorithm.
     * 
     */
    public String hostKeyAlgorithm() {
        return this.hostKeyAlgorithm;
    }
    /**
     * @return The SSH private key to access the Git repository, needed when the URI starts with `git@` or `ssh://`.
     * 
     */
    public String privateKey() {
        return this.privateKey;
    }
    /**
     * @return Indicates whether the Config Server instance will fail to start if the host_key does not match.
     * 
     */
    public Boolean strictHostKeyCheckingEnabled() {
        return this.strictHostKeyCheckingEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpringCloudServiceConfigServerGitSettingSshAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostKey;
        private String hostKeyAlgorithm;
        private String privateKey;
        private Boolean strictHostKeyCheckingEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpringCloudServiceConfigServerGitSettingSshAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostKey = defaults.hostKey;
    	      this.hostKeyAlgorithm = defaults.hostKeyAlgorithm;
    	      this.privateKey = defaults.privateKey;
    	      this.strictHostKeyCheckingEnabled = defaults.strictHostKeyCheckingEnabled;
        }

        public Builder hostKey(String hostKey) {
            this.hostKey = Objects.requireNonNull(hostKey);
            return this;
        }
        public Builder hostKeyAlgorithm(String hostKeyAlgorithm) {
            this.hostKeyAlgorithm = Objects.requireNonNull(hostKeyAlgorithm);
            return this;
        }
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        public Builder strictHostKeyCheckingEnabled(Boolean strictHostKeyCheckingEnabled) {
            this.strictHostKeyCheckingEnabled = Objects.requireNonNull(strictHostKeyCheckingEnabled);
            return this;
        }        public GetSpringCloudServiceConfigServerGitSettingSshAuth build() {
            return new GetSpringCloudServiceConfigServerGitSettingSshAuth(hostKey, hostKeyAlgorithm, privateKey, strictHostKeyCheckingEnabled);
        }
    }
}