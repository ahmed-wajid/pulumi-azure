// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedStorageAccountState extends com.pulumi.resources.ResourceArgs {

    public static final ManagedStorageAccountState Empty = new ManagedStorageAccountState();

    /**
     * The ID of the Key Vault where the Managed Storage Account should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="keyVaultId")
    private @Nullable Output<String> keyVaultId;

    /**
     * @return The ID of the Key Vault where the Managed Storage Account should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }

    /**
     * The name which should be used for this Key Vault Managed Storage Account. Changing this forces a new Key Vault Managed Storage Account to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Key Vault Managed Storage Account. Changing this forces a new Key Vault Managed Storage Account to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Should Storage Account access key be regenerated periodically?
     * 
     */
    @Import(name="regenerateKeyAutomatically")
    private @Nullable Output<Boolean> regenerateKeyAutomatically;

    /**
     * @return Should Storage Account access key be regenerated periodically?
     * 
     */
    public Optional<Output<Boolean>> regenerateKeyAutomatically() {
        return Optional.ofNullable(this.regenerateKeyAutomatically);
    }

    /**
     * How often Storage Account access key should be regenerated. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
     * 
     */
    @Import(name="regenerationPeriod")
    private @Nullable Output<String> regenerationPeriod;

    /**
     * @return How often Storage Account access key should be regenerated. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
     * 
     */
    public Optional<Output<String>> regenerationPeriod() {
        return Optional.ofNullable(this.regenerationPeriod);
    }

    /**
     * The ID of the Storage Account.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return The ID of the Storage Account.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }

    /**
     * Which Storage Account access key that is managed by Key Vault. Possible values are `key1` and `key2`.
     * 
     */
    @Import(name="storageAccountKey")
    private @Nullable Output<String> storageAccountKey;

    /**
     * @return Which Storage Account access key that is managed by Key Vault. Possible values are `key1` and `key2`.
     * 
     */
    public Optional<Output<String>> storageAccountKey() {
        return Optional.ofNullable(this.storageAccountKey);
    }

    /**
     * A mapping of tags which should be assigned to the Key Vault Managed Storage Account.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Key Vault Managed Storage Account.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ManagedStorageAccountState() {}

    private ManagedStorageAccountState(ManagedStorageAccountState $) {
        this.keyVaultId = $.keyVaultId;
        this.name = $.name;
        this.regenerateKeyAutomatically = $.regenerateKeyAutomatically;
        this.regenerationPeriod = $.regenerationPeriod;
        this.storageAccountId = $.storageAccountId;
        this.storageAccountKey = $.storageAccountKey;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedStorageAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedStorageAccountState $;

        public Builder() {
            $ = new ManagedStorageAccountState();
        }

        public Builder(ManagedStorageAccountState defaults) {
            $ = new ManagedStorageAccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyVaultId The ID of the Key Vault where the Managed Storage Account should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId The ID of the Key Vault where the Managed Storage Account should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        /**
         * @param name The name which should be used for this Key Vault Managed Storage Account. Changing this forces a new Key Vault Managed Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Key Vault Managed Storage Account. Changing this forces a new Key Vault Managed Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param regenerateKeyAutomatically Should Storage Account access key be regenerated periodically?
         * 
         * @return builder
         * 
         */
        public Builder regenerateKeyAutomatically(@Nullable Output<Boolean> regenerateKeyAutomatically) {
            $.regenerateKeyAutomatically = regenerateKeyAutomatically;
            return this;
        }

        /**
         * @param regenerateKeyAutomatically Should Storage Account access key be regenerated periodically?
         * 
         * @return builder
         * 
         */
        public Builder regenerateKeyAutomatically(Boolean regenerateKeyAutomatically) {
            return regenerateKeyAutomatically(Output.of(regenerateKeyAutomatically));
        }

        /**
         * @param regenerationPeriod How often Storage Account access key should be regenerated. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
         * 
         * @return builder
         * 
         */
        public Builder regenerationPeriod(@Nullable Output<String> regenerationPeriod) {
            $.regenerationPeriod = regenerationPeriod;
            return this;
        }

        /**
         * @param regenerationPeriod How often Storage Account access key should be regenerated. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
         * 
         * @return builder
         * 
         */
        public Builder regenerationPeriod(String regenerationPeriod) {
            return regenerationPeriod(Output.of(regenerationPeriod));
        }

        /**
         * @param storageAccountId The ID of the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The ID of the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        /**
         * @param storageAccountKey Which Storage Account access key that is managed by Key Vault. Possible values are `key1` and `key2`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(@Nullable Output<String> storageAccountKey) {
            $.storageAccountKey = storageAccountKey;
            return this;
        }

        /**
         * @param storageAccountKey Which Storage Account access key that is managed by Key Vault. Possible values are `key1` and `key2`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(String storageAccountKey) {
            return storageAccountKey(Output.of(storageAccountKey));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Key Vault Managed Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Key Vault Managed Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ManagedStorageAccountState build() {
            return $;
        }
    }

}