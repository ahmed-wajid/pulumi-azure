// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IoTHubSharedAccessPolicy {
    /**
     * @return The name of the shared access policy.
     * 
     */
    private final @Nullable String keyName;
    /**
     * @return The permissions assigned to the shared access policy.
     * 
     */
    private final @Nullable String permissions;
    /**
     * @return The primary key.
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * @return The secondary key.
     * 
     */
    private final @Nullable String secondaryKey;

    @CustomType.Constructor
    private IoTHubSharedAccessPolicy(
        @CustomType.Parameter("keyName") @Nullable String keyName,
        @CustomType.Parameter("permissions") @Nullable String permissions,
        @CustomType.Parameter("primaryKey") @Nullable String primaryKey,
        @CustomType.Parameter("secondaryKey") @Nullable String secondaryKey) {
        this.keyName = keyName;
        this.permissions = permissions;
        this.primaryKey = primaryKey;
        this.secondaryKey = secondaryKey;
    }

    /**
     * @return The name of the shared access policy.
     * 
     */
    public Optional<String> keyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * @return The permissions assigned to the shared access policy.
     * 
     */
    public Optional<String> permissions() {
        return Optional.ofNullable(this.permissions);
    }
    /**
     * @return The primary key.
     * 
     */
    public Optional<String> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * @return The secondary key.
     * 
     */
    public Optional<String> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTHubSharedAccessPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String permissions;
        private @Nullable String primaryKey;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTHubSharedAccessPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.permissions = defaults.permissions;
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder permissions(@Nullable String permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }        public IoTHubSharedAccessPolicy build() {
            return new IoTHubSharedAccessPolicy(keyName, permissions, primaryKey, secondaryKey);
        }
    }
}