// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterWindowsProfile {
    /**
     * @return The Admin Password for Windows VMs. Length must be between 14 and 123 characters.
     * 
     */
    private final @Nullable String adminPassword;
    /**
     * @return The Admin Username for Windows VMs.
     * 
     */
    private final String adminUsername;
    /**
     * @return Specifies the type of on-premise license which should be used for Node Pool Windows Virtual Machine. At this time the only possible value is `Windows_Server`.
     * 
     */
    private final @Nullable String license;

    @CustomType.Constructor
    private KubernetesClusterWindowsProfile(
        @CustomType.Parameter("adminPassword") @Nullable String adminPassword,
        @CustomType.Parameter("adminUsername") String adminUsername,
        @CustomType.Parameter("license") @Nullable String license) {
        this.adminPassword = adminPassword;
        this.adminUsername = adminUsername;
        this.license = license;
    }

    /**
     * @return The Admin Password for Windows VMs. Length must be between 14 and 123 characters.
     * 
     */
    public Optional<String> adminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }
    /**
     * @return The Admin Username for Windows VMs.
     * 
     */
    public String adminUsername() {
        return this.adminUsername;
    }
    /**
     * @return Specifies the type of on-premise license which should be used for Node Pool Windows Virtual Machine. At this time the only possible value is `Windows_Server`.
     * 
     */
    public Optional<String> license() {
        return Optional.ofNullable(this.license);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterWindowsProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminPassword;
        private String adminUsername;
        private @Nullable String license;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterWindowsProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.license = defaults.license;
        }

        public Builder adminPassword(@Nullable String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }
        public Builder adminUsername(String adminUsername) {
            this.adminUsername = Objects.requireNonNull(adminUsername);
            return this;
        }
        public Builder license(@Nullable String license) {
            this.license = license;
            return this;
        }        public KubernetesClusterWindowsProfile build() {
            return new KubernetesClusterWindowsProfile(adminPassword, adminUsername, license);
        }
    }
}