// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IoTHubEndpoint {
    /**
     * @return The type used to authenticate against the endpoint. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * @return Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds. This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`.
     * 
     */
    private final @Nullable Integer batchFrequencyInSeconds;
    /**
     * @return The connection string for the endpoint. This attribute is mandatory and can only be specified when `authentication_type` is `keyBased`.
     * 
     */
    private final @Nullable String connectionString;
    /**
     * @return The name of storage container in the storage account. This attribute is mandatory for endpoint type `AzureIotHub.StorageContainer`.
     * 
     */
    private final @Nullable String containerName;
    /**
     * @return Encoding that is used to serialize messages to blobs. Supported values are `Avro`, `AvroDeflate` and `JSON`. Default value is `Avro`. This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String encoding;
    /**
     * @return URI of the Service Bus or Event Hubs Namespace endpoint. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased` for endpoint type `AzureIotHub.ServiceBusQueue`, `AzureIotHub.ServiceBusTopic` or `AzureIotHub.EventHub`.
     * 
     */
    private final @Nullable String endpointUri;
    /**
     * @return Name of the Service Bus Queue/Topic or Event Hub. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased` for endpoint type `AzureIotHub.ServiceBusQueue`, `AzureIotHub.ServiceBusTopic` or `AzureIotHub.EventHub`.
     * 
     */
    private final @Nullable String entityPath;
    /**
     * @return File name format for the blob. Default format is ``{iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}``. All parameters are mandatory but can be reordered. This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`.
     * 
     */
    private final @Nullable String fileNameFormat;
    /**
     * @return The ID of the User Managed Identity used to authenticate against the endpoint.
     * 
     */
    private final @Nullable String identityId;
    /**
     * @return Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB). This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`.
     * 
     */
    private final @Nullable Integer maxChunkSizeInBytes;
    /**
     * @return The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
     * 
     */
    private final String name;
    /**
     * @return The resource group in which the endpoint will be created.
     * 
     */
    private final @Nullable String resourceGroupName;
    /**
     * @return The type of the endpoint. Possible values are `AzureIotHub.StorageContainer`, `AzureIotHub.ServiceBusQueue`, `AzureIotHub.ServiceBusTopic` or `AzureIotHub.EventHub`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private IoTHubEndpoint(
        @CustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @CustomType.Parameter("batchFrequencyInSeconds") @Nullable Integer batchFrequencyInSeconds,
        @CustomType.Parameter("connectionString") @Nullable String connectionString,
        @CustomType.Parameter("containerName") @Nullable String containerName,
        @CustomType.Parameter("encoding") @Nullable String encoding,
        @CustomType.Parameter("endpointUri") @Nullable String endpointUri,
        @CustomType.Parameter("entityPath") @Nullable String entityPath,
        @CustomType.Parameter("fileNameFormat") @Nullable String fileNameFormat,
        @CustomType.Parameter("identityId") @Nullable String identityId,
        @CustomType.Parameter("maxChunkSizeInBytes") @Nullable Integer maxChunkSizeInBytes,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") @Nullable String resourceGroupName,
        @CustomType.Parameter("type") String type) {
        this.authenticationType = authenticationType;
        this.batchFrequencyInSeconds = batchFrequencyInSeconds;
        this.connectionString = connectionString;
        this.containerName = containerName;
        this.encoding = encoding;
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
        this.fileNameFormat = fileNameFormat;
        this.identityId = identityId;
        this.maxChunkSizeInBytes = maxChunkSizeInBytes;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.type = type;
    }

    /**
     * @return The type used to authenticate against the endpoint. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
     * 
     */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * @return Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds. This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`.
     * 
     */
    public Optional<Integer> batchFrequencyInSeconds() {
        return Optional.ofNullable(this.batchFrequencyInSeconds);
    }
    /**
     * @return The connection string for the endpoint. This attribute is mandatory and can only be specified when `authentication_type` is `keyBased`.
     * 
     */
    public Optional<String> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * @return The name of storage container in the storage account. This attribute is mandatory for endpoint type `AzureIotHub.StorageContainer`.
     * 
     */
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * @return Encoding that is used to serialize messages to blobs. Supported values are `Avro`, `AvroDeflate` and `JSON`. Default value is `Avro`. This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> encoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * @return URI of the Service Bus or Event Hubs Namespace endpoint. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased` for endpoint type `AzureIotHub.ServiceBusQueue`, `AzureIotHub.ServiceBusTopic` or `AzureIotHub.EventHub`.
     * 
     */
    public Optional<String> endpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }
    /**
     * @return Name of the Service Bus Queue/Topic or Event Hub. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased` for endpoint type `AzureIotHub.ServiceBusQueue`, `AzureIotHub.ServiceBusTopic` or `AzureIotHub.EventHub`.
     * 
     */
    public Optional<String> entityPath() {
        return Optional.ofNullable(this.entityPath);
    }
    /**
     * @return File name format for the blob. Default format is ``{iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}``. All parameters are mandatory but can be reordered. This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`.
     * 
     */
    public Optional<String> fileNameFormat() {
        return Optional.ofNullable(this.fileNameFormat);
    }
    /**
     * @return The ID of the User Managed Identity used to authenticate against the endpoint.
     * 
     */
    public Optional<String> identityId() {
        return Optional.ofNullable(this.identityId);
    }
    /**
     * @return Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB). This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`.
     * 
     */
    public Optional<Integer> maxChunkSizeInBytes() {
        return Optional.ofNullable(this.maxChunkSizeInBytes);
    }
    /**
     * @return The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource group in which the endpoint will be created.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return The type of the endpoint. Possible values are `AzureIotHub.StorageContainer`, `AzureIotHub.ServiceBusQueue`, `AzureIotHub.ServiceBusTopic` or `AzureIotHub.EventHub`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTHubEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private @Nullable Integer batchFrequencyInSeconds;
        private @Nullable String connectionString;
        private @Nullable String containerName;
        private @Nullable String encoding;
        private @Nullable String endpointUri;
        private @Nullable String entityPath;
        private @Nullable String fileNameFormat;
        private @Nullable String identityId;
        private @Nullable Integer maxChunkSizeInBytes;
        private String name;
        private @Nullable String resourceGroupName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTHubEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.batchFrequencyInSeconds = defaults.batchFrequencyInSeconds;
    	      this.connectionString = defaults.connectionString;
    	      this.containerName = defaults.containerName;
    	      this.encoding = defaults.encoding;
    	      this.endpointUri = defaults.endpointUri;
    	      this.entityPath = defaults.entityPath;
    	      this.fileNameFormat = defaults.fileNameFormat;
    	      this.identityId = defaults.identityId;
    	      this.maxChunkSizeInBytes = defaults.maxChunkSizeInBytes;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.type = defaults.type;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder batchFrequencyInSeconds(@Nullable Integer batchFrequencyInSeconds) {
            this.batchFrequencyInSeconds = batchFrequencyInSeconds;
            return this;
        }
        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder encoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }
        public Builder entityPath(@Nullable String entityPath) {
            this.entityPath = entityPath;
            return this;
        }
        public Builder fileNameFormat(@Nullable String fileNameFormat) {
            this.fileNameFormat = fileNameFormat;
            return this;
        }
        public Builder identityId(@Nullable String identityId) {
            this.identityId = identityId;
            return this;
        }
        public Builder maxChunkSizeInBytes(@Nullable Integer maxChunkSizeInBytes) {
            this.maxChunkSizeInBytes = maxChunkSizeInBytes;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public IoTHubEndpoint build() {
            return new IoTHubEndpoint(authenticationType, batchFrequencyInSeconds, connectionString, containerName, encoding, endpointUri, entityPath, fileNameFormat, identityId, maxChunkSizeInBytes, name, resourceGroupName, type);
        }
    }
}