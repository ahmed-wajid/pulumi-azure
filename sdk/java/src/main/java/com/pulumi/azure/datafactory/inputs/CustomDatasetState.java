// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.azure.datafactory.inputs.CustomDatasetLinkedServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDatasetState extends com.pulumi.resources.ResourceArgs {

    public static final CustomDatasetState Empty = new CustomDatasetState();

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
     * The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId")
    private @Nullable Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> dataFactoryId() {
        return Optional.ofNullable(this.dataFactoryId);
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
     * A `linked_service` block as defined below.
     * 
     */
    @Import(name="linkedService")
    private @Nullable Output<CustomDatasetLinkedServiceArgs> linkedService;

    /**
     * @return A `linked_service` block as defined below.
     * 
     */
    public Optional<Output<CustomDatasetLinkedServiceArgs>> linkedService() {
        return Optional.ofNullable(this.linkedService);
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
     * A JSON object that contains the schema of the Data Factory Dataset.
     * 
     */
    @Import(name="schemaJson")
    private @Nullable Output<String> schemaJson;

    /**
     * @return A JSON object that contains the schema of the Data Factory Dataset.
     * 
     */
    public Optional<Output<String>> schemaJson() {
        return Optional.ofNullable(this.schemaJson);
    }

    /**
     * The type of dataset that will be associated with Data Factory.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of dataset that will be associated with Data Factory.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * A JSON object that contains the properties of the Data Factory Dataset.
     * 
     */
    @Import(name="typePropertiesJson")
    private @Nullable Output<String> typePropertiesJson;

    /**
     * @return A JSON object that contains the properties of the Data Factory Dataset.
     * 
     */
    public Optional<Output<String>> typePropertiesJson() {
        return Optional.ofNullable(this.typePropertiesJson);
    }

    private CustomDatasetState() {}

    private CustomDatasetState(CustomDatasetState $) {
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.folder = $.folder;
        this.linkedService = $.linkedService;
        this.name = $.name;
        this.parameters = $.parameters;
        this.schemaJson = $.schemaJson;
        this.type = $.type;
        this.typePropertiesJson = $.typePropertiesJson;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDatasetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDatasetState $;

        public Builder() {
            $ = new CustomDatasetState();
        }

        public Builder(CustomDatasetState defaults) {
            $ = new CustomDatasetState(Objects.requireNonNull(defaults));
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
         * @param dataFactoryId The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(@Nullable Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
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
         * @param linkedService A `linked_service` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder linkedService(@Nullable Output<CustomDatasetLinkedServiceArgs> linkedService) {
            $.linkedService = linkedService;
            return this;
        }

        /**
         * @param linkedService A `linked_service` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder linkedService(CustomDatasetLinkedServiceArgs linkedService) {
            return linkedService(Output.of(linkedService));
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
         * @param schemaJson A JSON object that contains the schema of the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder schemaJson(@Nullable Output<String> schemaJson) {
            $.schemaJson = schemaJson;
            return this;
        }

        /**
         * @param schemaJson A JSON object that contains the schema of the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder schemaJson(String schemaJson) {
            return schemaJson(Output.of(schemaJson));
        }

        /**
         * @param type The type of dataset that will be associated with Data Factory.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of dataset that will be associated with Data Factory.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typePropertiesJson A JSON object that contains the properties of the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder typePropertiesJson(@Nullable Output<String> typePropertiesJson) {
            $.typePropertiesJson = typePropertiesJson;
            return this;
        }

        /**
         * @param typePropertiesJson A JSON object that contains the properties of the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder typePropertiesJson(String typePropertiesJson) {
            return typePropertiesJson(Output.of(typePropertiesJson));
        }

        public CustomDatasetState build() {
            return $;
        }
    }

}