// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyncCloudEndpointState extends com.pulumi.resources.ResourceArgs {

    public static final SyncCloudEndpointState Empty = new SyncCloudEndpointState();

    /**
     * The Storage Share name to be synchronized in this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
     * 
     */
    @Import(name="fileShareName")
    private @Nullable Output<String> fileShareName;

    /**
     * @return The Storage Share name to be synchronized in this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
     * 
     */
    public Optional<Output<String>> fileShareName() {
        return Optional.ofNullable(this.fileShareName);
    }

    /**
     * The name which should be used for this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return The ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }

    /**
     * The Tenant ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created. Defaults to the current tenant id.
     * 
     */
    @Import(name="storageAccountTenantId")
    private @Nullable Output<String> storageAccountTenantId;

    /**
     * @return The Tenant ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created. Defaults to the current tenant id.
     * 
     */
    public Optional<Output<String>> storageAccountTenantId() {
        return Optional.ofNullable(this.storageAccountTenantId);
    }

    /**
     * The ID of the Storage Sync Group where this Cloud Endpoint should be created. Changing this forces a new Storage Sync Cloud Endpoint to be created.
     * 
     */
    @Import(name="storageSyncGroupId")
    private @Nullable Output<String> storageSyncGroupId;

    /**
     * @return The ID of the Storage Sync Group where this Cloud Endpoint should be created. Changing this forces a new Storage Sync Cloud Endpoint to be created.
     * 
     */
    public Optional<Output<String>> storageSyncGroupId() {
        return Optional.ofNullable(this.storageSyncGroupId);
    }

    private SyncCloudEndpointState() {}

    private SyncCloudEndpointState(SyncCloudEndpointState $) {
        this.fileShareName = $.fileShareName;
        this.name = $.name;
        this.storageAccountId = $.storageAccountId;
        this.storageAccountTenantId = $.storageAccountTenantId;
        this.storageSyncGroupId = $.storageSyncGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyncCloudEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyncCloudEndpointState $;

        public Builder() {
            $ = new SyncCloudEndpointState();
        }

        public Builder(SyncCloudEndpointState defaults) {
            $ = new SyncCloudEndpointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileShareName The Storage Share name to be synchronized in this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder fileShareName(@Nullable Output<String> fileShareName) {
            $.fileShareName = fileShareName;
            return this;
        }

        /**
         * @param fileShareName The Storage Share name to be synchronized in this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder fileShareName(String fileShareName) {
            return fileShareName(Output.of(fileShareName));
        }

        /**
         * @param name The name which should be used for this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageAccountId The ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        /**
         * @param storageAccountTenantId The Tenant ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created. Defaults to the current tenant id.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountTenantId(@Nullable Output<String> storageAccountTenantId) {
            $.storageAccountTenantId = storageAccountTenantId;
            return this;
        }

        /**
         * @param storageAccountTenantId The Tenant ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created. Defaults to the current tenant id.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountTenantId(String storageAccountTenantId) {
            return storageAccountTenantId(Output.of(storageAccountTenantId));
        }

        /**
         * @param storageSyncGroupId The ID of the Storage Sync Group where this Cloud Endpoint should be created. Changing this forces a new Storage Sync Cloud Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageSyncGroupId(@Nullable Output<String> storageSyncGroupId) {
            $.storageSyncGroupId = storageSyncGroupId;
            return this;
        }

        /**
         * @param storageSyncGroupId The ID of the Storage Sync Group where this Cloud Endpoint should be created. Changing this forces a new Storage Sync Cloud Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageSyncGroupId(String storageSyncGroupId) {
            return storageSyncGroupId(Output.of(storageSyncGroupId));
        }

        public SyncCloudEndpointState build() {
            return $;
        }
    }

}