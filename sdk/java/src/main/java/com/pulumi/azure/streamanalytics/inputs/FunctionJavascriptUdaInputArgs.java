// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionJavascriptUdaInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionJavascriptUdaInputArgs Empty = new FunctionJavascriptUdaInputArgs();

    /**
     * Is this input parameter a configuration parameter? Defaults to `false`.
     * 
     */
    @Import(name="configurationParameter")
    private @Nullable Output<Boolean> configurationParameter;

    /**
     * @return Is this input parameter a configuration parameter? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> configurationParameter() {
        return Optional.ofNullable(this.configurationParameter);
    }

    /**
     * The input data type of this JavaScript Function. Possible values include `any`, `array`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The input data type of this JavaScript Function. Possible values include `any`, `array`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FunctionJavascriptUdaInputArgs() {}

    private FunctionJavascriptUdaInputArgs(FunctionJavascriptUdaInputArgs $) {
        this.configurationParameter = $.configurationParameter;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionJavascriptUdaInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionJavascriptUdaInputArgs $;

        public Builder() {
            $ = new FunctionJavascriptUdaInputArgs();
        }

        public Builder(FunctionJavascriptUdaInputArgs defaults) {
            $ = new FunctionJavascriptUdaInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationParameter Is this input parameter a configuration parameter? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder configurationParameter(@Nullable Output<Boolean> configurationParameter) {
            $.configurationParameter = configurationParameter;
            return this;
        }

        /**
         * @param configurationParameter Is this input parameter a configuration parameter? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder configurationParameter(Boolean configurationParameter) {
            return configurationParameter(Output.of(configurationParameter));
        }

        /**
         * @param type The input data type of this JavaScript Function. Possible values include `any`, `array`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The input data type of this JavaScript Function. Possible values include `any`, `array`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FunctionJavascriptUdaInputArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("FunctionJavascriptUdaInputArgs", "type");
            }
            return $;
        }
    }

}
