// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.appservice.inputs.FunctionAppFunctionFileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionAppFunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionAppFunctionArgs Empty = new FunctionAppFunctionArgs();

    /**
     * The config for this Function in JSON format.
     * 
     */
    @Import(name="configJson", required=true)
    private Output<String> configJson;

    /**
     * @return The config for this Function in JSON format.
     * 
     */
    public Output<String> configJson() {
        return this.configJson;
    }

    /**
     * Should this function be enabled. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Should this function be enabled. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * A `file` block as detailed below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="files")
    private @Nullable Output<List<FunctionAppFunctionFileArgs>> files;

    /**
     * @return A `file` block as detailed below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<FunctionAppFunctionFileArgs>>> files() {
        return Optional.ofNullable(this.files);
    }

    /**
     * The ID of the Function App in which this function should reside. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="functionAppId", required=true)
    private Output<String> functionAppId;

    /**
     * @return The ID of the Function App in which this function should reside. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> functionAppId() {
        return this.functionAppId;
    }

    /**
     * The language the Function is written in. Possible values are `CSharp`, `Custom`, `Java`, `Javascript`, `Python`, `PowerShell`, and `TypeScript`.
     * 
     */
    @Import(name="language")
    private @Nullable Output<String> language;

    /**
     * @return The language the Function is written in. Possible values are `CSharp`, `Custom`, `Java`, `Javascript`, `Python`, `PowerShell`, and `TypeScript`.
     * 
     */
    public Optional<Output<String>> language() {
        return Optional.ofNullable(this.language);
    }

    /**
     * The name of the function. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the function. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The test data for the function.
     * 
     */
    @Import(name="testData")
    private @Nullable Output<String> testData;

    /**
     * @return The test data for the function.
     * 
     */
    public Optional<Output<String>> testData() {
        return Optional.ofNullable(this.testData);
    }

    private FunctionAppFunctionArgs() {}

    private FunctionAppFunctionArgs(FunctionAppFunctionArgs $) {
        this.configJson = $.configJson;
        this.enabled = $.enabled;
        this.files = $.files;
        this.functionAppId = $.functionAppId;
        this.language = $.language;
        this.name = $.name;
        this.testData = $.testData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionAppFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionAppFunctionArgs $;

        public Builder() {
            $ = new FunctionAppFunctionArgs();
        }

        public Builder(FunctionAppFunctionArgs defaults) {
            $ = new FunctionAppFunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configJson The config for this Function in JSON format.
         * 
         * @return builder
         * 
         */
        public Builder configJson(Output<String> configJson) {
            $.configJson = configJson;
            return this;
        }

        /**
         * @param configJson The config for this Function in JSON format.
         * 
         * @return builder
         * 
         */
        public Builder configJson(String configJson) {
            return configJson(Output.of(configJson));
        }

        /**
         * @param enabled Should this function be enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should this function be enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param files A `file` block as detailed below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder files(@Nullable Output<List<FunctionAppFunctionFileArgs>> files) {
            $.files = files;
            return this;
        }

        /**
         * @param files A `file` block as detailed below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder files(List<FunctionAppFunctionFileArgs> files) {
            return files(Output.of(files));
        }

        /**
         * @param files A `file` block as detailed below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder files(FunctionAppFunctionFileArgs... files) {
            return files(List.of(files));
        }

        /**
         * @param functionAppId The ID of the Function App in which this function should reside. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder functionAppId(Output<String> functionAppId) {
            $.functionAppId = functionAppId;
            return this;
        }

        /**
         * @param functionAppId The ID of the Function App in which this function should reside. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder functionAppId(String functionAppId) {
            return functionAppId(Output.of(functionAppId));
        }

        /**
         * @param language The language the Function is written in. Possible values are `CSharp`, `Custom`, `Java`, `Javascript`, `Python`, `PowerShell`, and `TypeScript`.
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable Output<String> language) {
            $.language = language;
            return this;
        }

        /**
         * @param language The language the Function is written in. Possible values are `CSharp`, `Custom`, `Java`, `Javascript`, `Python`, `PowerShell`, and `TypeScript`.
         * 
         * @return builder
         * 
         */
        public Builder language(String language) {
            return language(Output.of(language));
        }

        /**
         * @param name The name of the function. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the function. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param testData The test data for the function.
         * 
         * @return builder
         * 
         */
        public Builder testData(@Nullable Output<String> testData) {
            $.testData = testData;
            return this;
        }

        /**
         * @param testData The test data for the function.
         * 
         * @return builder
         * 
         */
        public Builder testData(String testData) {
            return testData(Output.of(testData));
        }

        public FunctionAppFunctionArgs build() {
            $.configJson = Objects.requireNonNull($.configJson, "expected parameter 'configJson' to be non-null");
            $.functionAppId = Objects.requireNonNull($.functionAppId, "expected parameter 'functionAppId' to be non-null");
            return $;
        }
    }

}