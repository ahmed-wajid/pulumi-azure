// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobFsLocationArgs;
import com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextAzureBlobStorageLocationArgs;
import com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextHttpServerLocationArgs;
import com.pulumi.azure.datafactory.inputs.DatasetDelimitedTextSchemaColumnArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetDelimitedTextArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetDelimitedTextArgs Empty = new DatasetDelimitedTextArgs();

    /**
     * A map of additional properties to associate with the Data Factory Dataset.
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Dataset.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Data Factory Dataset.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Dataset.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * An `azure_blob_fs_location` block as defined below.
     * 
     */
    @Import(name="azureBlobFsLocation")
    private @Nullable Output<DatasetDelimitedTextAzureBlobFsLocationArgs> azureBlobFsLocation;

    /**
     * @return An `azure_blob_fs_location` block as defined below.
     * 
     */
    public Optional<Output<DatasetDelimitedTextAzureBlobFsLocationArgs>> azureBlobFsLocation() {
        return Optional.ofNullable(this.azureBlobFsLocation);
    }

    /**
     * An `azure_blob_storage_location` block as defined below.
     * 
     */
    @Import(name="azureBlobStorageLocation")
    private @Nullable Output<DatasetDelimitedTextAzureBlobStorageLocationArgs> azureBlobStorageLocation;

    /**
     * @return An `azure_blob_storage_location` block as defined below.
     * 
     */
    public Optional<Output<DatasetDelimitedTextAzureBlobStorageLocationArgs>> azureBlobStorageLocation() {
        return Optional.ofNullable(this.azureBlobStorageLocation);
    }

    /**
     * The column delimiter. Defaults to `,`.
     * 
     */
    @Import(name="columnDelimiter")
    private @Nullable Output<String> columnDelimiter;

    /**
     * @return The column delimiter. Defaults to `,`.
     * 
     */
    public Optional<Output<String>> columnDelimiter() {
        return Optional.ofNullable(this.columnDelimiter);
    }

    /**
     * The compression codec used to read/write text files. Valid values are `bzip2`, `gzip`, `deflate`, `ZipDeflate`, `TarGzip`, `Tar`, `snappy`, or `lz4`. Please note these values are case sensitive.
     * 
     */
    @Import(name="compressionCodec")
    private @Nullable Output<String> compressionCodec;

    /**
     * @return The compression codec used to read/write text files. Valid values are `bzip2`, `gzip`, `deflate`, `ZipDeflate`, `TarGzip`, `Tar`, `snappy`, or `lz4`. Please note these values are case sensitive.
     * 
     */
    public Optional<Output<String>> compressionCodec() {
        return Optional.ofNullable(this.compressionCodec);
    }

    /**
     * The compression ratio for the Data Factory Dataset. Valid values are `Fastest` or `Optimal`. Please note these values are case sensitive.
     * 
     */
    @Import(name="compressionLevel")
    private @Nullable Output<String> compressionLevel;

    /**
     * @return The compression ratio for the Data Factory Dataset. Valid values are `Fastest` or `Optimal`. Please note these values are case sensitive.
     * 
     */
    public Optional<Output<String>> compressionLevel() {
        return Optional.ofNullable(this.compressionLevel);
    }

    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId", required=true)
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }

    /**
     * The description for the Data Factory Dataset.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Dataset.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encoding format for the file.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    /**
     * @return The encoding format for the file.
     * 
     */
    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * The escape character. Defaults to `\`.
     * 
     */
    @Import(name="escapeCharacter")
    private @Nullable Output<String> escapeCharacter;

    /**
     * @return The escape character. Defaults to `\`.
     * 
     */
    public Optional<Output<String>> escapeCharacter() {
        return Optional.ofNullable(this.escapeCharacter);
    }

    /**
     * When used as input, treat the first row of data as headers. When used as output, write the headers into the output as the first row of data. Defaults to `false`.
     * 
     */
    @Import(name="firstRowAsHeader")
    private @Nullable Output<Boolean> firstRowAsHeader;

    /**
     * @return When used as input, treat the first row of data as headers. When used as output, write the headers into the output as the first row of data. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> firstRowAsHeader() {
        return Optional.ofNullable(this.firstRowAsHeader);
    }

    /**
     * The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * A `http_server_location` block as defined below.
     * 
     */
    @Import(name="httpServerLocation")
    private @Nullable Output<DatasetDelimitedTextHttpServerLocationArgs> httpServerLocation;

    /**
     * @return A `http_server_location` block as defined below.
     * 
     */
    public Optional<Output<DatasetDelimitedTextHttpServerLocationArgs>> httpServerLocation() {
        return Optional.ofNullable(this.httpServerLocation);
    }

    /**
     * The Data Factory Linked Service name in which to associate the Dataset with.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private Output<String> linkedServiceName;

    /**
     * @return The Data Factory Linked Service name in which to associate the Dataset with.
     * 
     */
    public Output<String> linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The null value string. Defaults to an empty string.
     * 
     */
    @Import(name="nullValue")
    private @Nullable Output<String> nullValue;

    /**
     * @return The null value string. Defaults to an empty string.
     * 
     */
    public Optional<Output<String>> nullValue() {
        return Optional.ofNullable(this.nullValue);
    }

    /**
     * A map of parameters to associate with the Data Factory Dataset.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Dataset.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The quote character. Defaults to `&#34;`.
     * 
     */
    @Import(name="quoteCharacter")
    private @Nullable Output<String> quoteCharacter;

    /**
     * @return The quote character. Defaults to `&#34;`.
     * 
     */
    public Optional<Output<String>> quoteCharacter() {
        return Optional.ofNullable(this.quoteCharacter);
    }

    /**
     * The row delimiter. Defaults to any of the following values on read: `\r\n`, `\r`, `\n`, and `\n` or `\r\n` on write by mapping data flow and Copy activity respectively.
     * 
     */
    @Import(name="rowDelimiter")
    private @Nullable Output<String> rowDelimiter;

    /**
     * @return The row delimiter. Defaults to any of the following values on read: `\r\n`, `\r`, `\n`, and `\n` or `\r\n` on write by mapping data flow and Copy activity respectively.
     * 
     */
    public Optional<Output<String>> rowDelimiter() {
        return Optional.ofNullable(this.rowDelimiter);
    }

    /**
     * A `schema_column` block as defined below.
     * 
     */
    @Import(name="schemaColumns")
    private @Nullable Output<List<DatasetDelimitedTextSchemaColumnArgs>> schemaColumns;

    /**
     * @return A `schema_column` block as defined below.
     * 
     */
    public Optional<Output<List<DatasetDelimitedTextSchemaColumnArgs>>> schemaColumns() {
        return Optional.ofNullable(this.schemaColumns);
    }

    private DatasetDelimitedTextArgs() {}

    private DatasetDelimitedTextArgs(DatasetDelimitedTextArgs $) {
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.azureBlobFsLocation = $.azureBlobFsLocation;
        this.azureBlobStorageLocation = $.azureBlobStorageLocation;
        this.columnDelimiter = $.columnDelimiter;
        this.compressionCodec = $.compressionCodec;
        this.compressionLevel = $.compressionLevel;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.encoding = $.encoding;
        this.escapeCharacter = $.escapeCharacter;
        this.firstRowAsHeader = $.firstRowAsHeader;
        this.folder = $.folder;
        this.httpServerLocation = $.httpServerLocation;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.nullValue = $.nullValue;
        this.parameters = $.parameters;
        this.quoteCharacter = $.quoteCharacter;
        this.rowDelimiter = $.rowDelimiter;
        this.schemaColumns = $.schemaColumns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetDelimitedTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetDelimitedTextArgs $;

        public Builder() {
            $ = new DatasetDelimitedTextArgs();
        }

        public Builder(DatasetDelimitedTextArgs defaults) {
            $ = new DatasetDelimitedTextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param azureBlobFsLocation An `azure_blob_fs_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobFsLocation(@Nullable Output<DatasetDelimitedTextAzureBlobFsLocationArgs> azureBlobFsLocation) {
            $.azureBlobFsLocation = azureBlobFsLocation;
            return this;
        }

        /**
         * @param azureBlobFsLocation An `azure_blob_fs_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobFsLocation(DatasetDelimitedTextAzureBlobFsLocationArgs azureBlobFsLocation) {
            return azureBlobFsLocation(Output.of(azureBlobFsLocation));
        }

        /**
         * @param azureBlobStorageLocation An `azure_blob_storage_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorageLocation(@Nullable Output<DatasetDelimitedTextAzureBlobStorageLocationArgs> azureBlobStorageLocation) {
            $.azureBlobStorageLocation = azureBlobStorageLocation;
            return this;
        }

        /**
         * @param azureBlobStorageLocation An `azure_blob_storage_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorageLocation(DatasetDelimitedTextAzureBlobStorageLocationArgs azureBlobStorageLocation) {
            return azureBlobStorageLocation(Output.of(azureBlobStorageLocation));
        }

        /**
         * @param columnDelimiter The column delimiter. Defaults to `,`.
         * 
         * @return builder
         * 
         */
        public Builder columnDelimiter(@Nullable Output<String> columnDelimiter) {
            $.columnDelimiter = columnDelimiter;
            return this;
        }

        /**
         * @param columnDelimiter The column delimiter. Defaults to `,`.
         * 
         * @return builder
         * 
         */
        public Builder columnDelimiter(String columnDelimiter) {
            return columnDelimiter(Output.of(columnDelimiter));
        }

        /**
         * @param compressionCodec The compression codec used to read/write text files. Valid values are `bzip2`, `gzip`, `deflate`, `ZipDeflate`, `TarGzip`, `Tar`, `snappy`, or `lz4`. Please note these values are case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder compressionCodec(@Nullable Output<String> compressionCodec) {
            $.compressionCodec = compressionCodec;
            return this;
        }

        /**
         * @param compressionCodec The compression codec used to read/write text files. Valid values are `bzip2`, `gzip`, `deflate`, `ZipDeflate`, `TarGzip`, `Tar`, `snappy`, or `lz4`. Please note these values are case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder compressionCodec(String compressionCodec) {
            return compressionCodec(Output.of(compressionCodec));
        }

        /**
         * @param compressionLevel The compression ratio for the Data Factory Dataset. Valid values are `Fastest` or `Optimal`. Please note these values are case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder compressionLevel(@Nullable Output<String> compressionLevel) {
            $.compressionLevel = compressionLevel;
            return this;
        }

        /**
         * @param compressionLevel The compression ratio for the Data Factory Dataset. Valid values are `Fastest` or `Optimal`. Please note these values are case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder compressionLevel(String compressionLevel) {
            return compressionLevel(Output.of(compressionLevel));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(String dataFactoryId) {
            return dataFactoryId(Output.of(dataFactoryId));
        }

        /**
         * @param description The description for the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param encoding The encoding format for the file.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding The encoding format for the file.
         * 
         * @return builder
         * 
         */
        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        /**
         * @param escapeCharacter The escape character. Defaults to `\`.
         * 
         * @return builder
         * 
         */
        public Builder escapeCharacter(@Nullable Output<String> escapeCharacter) {
            $.escapeCharacter = escapeCharacter;
            return this;
        }

        /**
         * @param escapeCharacter The escape character. Defaults to `\`.
         * 
         * @return builder
         * 
         */
        public Builder escapeCharacter(String escapeCharacter) {
            return escapeCharacter(Output.of(escapeCharacter));
        }

        /**
         * @param firstRowAsHeader When used as input, treat the first row of data as headers. When used as output, write the headers into the output as the first row of data. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder firstRowAsHeader(@Nullable Output<Boolean> firstRowAsHeader) {
            $.firstRowAsHeader = firstRowAsHeader;
            return this;
        }

        /**
         * @param firstRowAsHeader When used as input, treat the first row of data as headers. When used as output, write the headers into the output as the first row of data. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder firstRowAsHeader(Boolean firstRowAsHeader) {
            return firstRowAsHeader(Output.of(firstRowAsHeader));
        }

        /**
         * @param folder The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param httpServerLocation A `http_server_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder httpServerLocation(@Nullable Output<DatasetDelimitedTextHttpServerLocationArgs> httpServerLocation) {
            $.httpServerLocation = httpServerLocation;
            return this;
        }

        /**
         * @param httpServerLocation A `http_server_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder httpServerLocation(DatasetDelimitedTextHttpServerLocationArgs httpServerLocation) {
            return httpServerLocation(Output.of(httpServerLocation));
        }

        /**
         * @param linkedServiceName The Data Factory Linked Service name in which to associate the Dataset with.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(Output<String> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName The Data Factory Linked Service name in which to associate the Dataset with.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(String linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param name Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nullValue The null value string. Defaults to an empty string.
         * 
         * @return builder
         * 
         */
        public Builder nullValue(@Nullable Output<String> nullValue) {
            $.nullValue = nullValue;
            return this;
        }

        /**
         * @param nullValue The null value string. Defaults to an empty string.
         * 
         * @return builder
         * 
         */
        public Builder nullValue(String nullValue) {
            return nullValue(Output.of(nullValue));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param quoteCharacter The quote character. Defaults to `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder quoteCharacter(@Nullable Output<String> quoteCharacter) {
            $.quoteCharacter = quoteCharacter;
            return this;
        }

        /**
         * @param quoteCharacter The quote character. Defaults to `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder quoteCharacter(String quoteCharacter) {
            return quoteCharacter(Output.of(quoteCharacter));
        }

        /**
         * @param rowDelimiter The row delimiter. Defaults to any of the following values on read: `\r\n`, `\r`, `\n`, and `\n` or `\r\n` on write by mapping data flow and Copy activity respectively.
         * 
         * @return builder
         * 
         */
        public Builder rowDelimiter(@Nullable Output<String> rowDelimiter) {
            $.rowDelimiter = rowDelimiter;
            return this;
        }

        /**
         * @param rowDelimiter The row delimiter. Defaults to any of the following values on read: `\r\n`, `\r`, `\n`, and `\n` or `\r\n` on write by mapping data flow and Copy activity respectively.
         * 
         * @return builder
         * 
         */
        public Builder rowDelimiter(String rowDelimiter) {
            return rowDelimiter(Output.of(rowDelimiter));
        }

        /**
         * @param schemaColumns A `schema_column` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schemaColumns(@Nullable Output<List<DatasetDelimitedTextSchemaColumnArgs>> schemaColumns) {
            $.schemaColumns = schemaColumns;
            return this;
        }

        /**
         * @param schemaColumns A `schema_column` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schemaColumns(List<DatasetDelimitedTextSchemaColumnArgs> schemaColumns) {
            return schemaColumns(Output.of(schemaColumns));
        }

        /**
         * @param schemaColumns A `schema_column` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schemaColumns(DatasetDelimitedTextSchemaColumnArgs... schemaColumns) {
            return schemaColumns(List.of(schemaColumns));
        }

        public DatasetDelimitedTextArgs build() {
            $.dataFactoryId = Objects.requireNonNull($.dataFactoryId, "expected parameter 'dataFactoryId' to be non-null");
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            return $;
        }
    }

}