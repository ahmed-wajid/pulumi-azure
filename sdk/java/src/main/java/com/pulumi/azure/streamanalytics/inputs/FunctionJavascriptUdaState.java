// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.inputs;

import com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaInputArgs;
import com.pulumi.azure.streamanalytics.inputs.FunctionJavascriptUdaOutputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionJavascriptUdaState extends com.pulumi.resources.ResourceArgs {

    public static final FunctionJavascriptUdaState Empty = new FunctionJavascriptUdaState();

    /**
     * One or more `input` blocks as defined below.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<List<FunctionJavascriptUdaInputArgs>> inputs;

    /**
     * @return One or more `input` blocks as defined below.
     * 
     */
    public Optional<Output<List<FunctionJavascriptUdaInputArgs>>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * The name of the JavaScript UDA Function. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the JavaScript UDA Function. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An `output` block as defined below.
     * 
     */
    @Import(name="output")
    private @Nullable Output<FunctionJavascriptUdaOutputArgs> output;

    /**
     * @return An `output` block as defined below.
     * 
     */
    public Optional<Output<FunctionJavascriptUdaOutputArgs>> output() {
        return Optional.ofNullable(this.output);
    }

    /**
     * The JavaScript of this UDA Function.
     * 
     */
    @Import(name="script")
    private @Nullable Output<String> script;

    /**
     * @return The JavaScript of this UDA Function.
     * 
     */
    public Optional<Output<String>> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * The resource ID of the Stream Analytics Job where this Function should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobId")
    private @Nullable Output<String> streamAnalyticsJobId;

    /**
     * @return The resource ID of the Stream Analytics Job where this Function should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> streamAnalyticsJobId() {
        return Optional.ofNullable(this.streamAnalyticsJobId);
    }

    private FunctionJavascriptUdaState() {}

    private FunctionJavascriptUdaState(FunctionJavascriptUdaState $) {
        this.inputs = $.inputs;
        this.name = $.name;
        this.output = $.output;
        this.script = $.script;
        this.streamAnalyticsJobId = $.streamAnalyticsJobId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionJavascriptUdaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionJavascriptUdaState $;

        public Builder() {
            $ = new FunctionJavascriptUdaState();
        }

        public Builder(FunctionJavascriptUdaState defaults) {
            $ = new FunctionJavascriptUdaState(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputs One or more `input` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inputs(@Nullable Output<List<FunctionJavascriptUdaInputArgs>> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs One or more `input` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inputs(List<FunctionJavascriptUdaInputArgs> inputs) {
            return inputs(Output.of(inputs));
        }

        /**
         * @param inputs One or more `input` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inputs(FunctionJavascriptUdaInputArgs... inputs) {
            return inputs(List.of(inputs));
        }

        /**
         * @param name The name of the JavaScript UDA Function. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the JavaScript UDA Function. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param output An `output` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder output(@Nullable Output<FunctionJavascriptUdaOutputArgs> output) {
            $.output = output;
            return this;
        }

        /**
         * @param output An `output` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder output(FunctionJavascriptUdaOutputArgs output) {
            return output(Output.of(output));
        }

        /**
         * @param script The JavaScript of this UDA Function.
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script The JavaScript of this UDA Function.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        /**
         * @param streamAnalyticsJobId The resource ID of the Stream Analytics Job where this Function should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobId(@Nullable Output<String> streamAnalyticsJobId) {
            $.streamAnalyticsJobId = streamAnalyticsJobId;
            return this;
        }

        /**
         * @param streamAnalyticsJobId The resource ID of the Stream Analytics Job where this Function should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobId(String streamAnalyticsJobId) {
            return streamAnalyticsJobId(Output.of(streamAnalyticsJobId));
        }

        public FunctionJavascriptUdaState build() {
            return $;
        }
    }

}