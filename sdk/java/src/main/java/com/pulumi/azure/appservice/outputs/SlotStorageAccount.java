// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SlotStorageAccount {
    /**
     * @return The access key for the storage account.
     * 
     */
    private final String accessKey;
    /**
     * @return The name of the storage account.
     * 
     */
    private final String accountName;
    /**
     * @return The path to mount the storage within the site&#39;s runtime environment.
     * 
     */
    private final @Nullable String mountPath;
    /**
     * @return The name of the storage account identifier.
     * 
     */
    private final String name;
    /**
     * @return The name of the file share (container name, for Blob storage).
     * 
     */
    private final String shareName;
    /**
     * @return The type of storage. Possible values are `AzureBlob` and `AzureFiles`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SlotStorageAccount(
        @CustomType.Parameter("accessKey") String accessKey,
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("mountPath") @Nullable String mountPath,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("shareName") String shareName,
        @CustomType.Parameter("type") String type) {
        this.accessKey = accessKey;
        this.accountName = accountName;
        this.mountPath = mountPath;
        this.name = name;
        this.shareName = shareName;
        this.type = type;
    }

    /**
     * @return The access key for the storage account.
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return The name of the storage account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The path to mount the storage within the site&#39;s runtime environment.
     * 
     */
    public Optional<String> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }
    /**
     * @return The name of the storage account identifier.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the file share (container name, for Blob storage).
     * 
     */
    public String shareName() {
        return this.shareName;
    }
    /**
     * @return The type of storage. Possible values are `AzureBlob` and `AzureFiles`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlotStorageAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKey;
        private String accountName;
        private @Nullable String mountPath;
        private String name;
        private String shareName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SlotStorageAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.accountName = defaults.accountName;
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.shareName = defaults.shareName;
    	      this.type = defaults.type;
        }

        public Builder accessKey(String accessKey) {
            this.accessKey = Objects.requireNonNull(accessKey);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder shareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SlotStorageAccount build() {
            return new SlotStorageAccount(accessKey, accountName, mountPath, name, shareName, type);
        }
    }
}