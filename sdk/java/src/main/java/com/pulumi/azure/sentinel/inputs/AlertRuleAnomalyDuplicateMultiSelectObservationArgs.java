// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertRuleAnomalyDuplicateMultiSelectObservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleAnomalyDuplicateMultiSelectObservationArgs Empty = new AlertRuleAnomalyDuplicateMultiSelectObservationArgs();

    /**
     * The description of the multi select observation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the multi select observation.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the multi select observation.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the multi select observation.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A list of supported values of the multi select observation.
     * 
     */
    @Import(name="supportedValues")
    private @Nullable Output<List<String>> supportedValues;

    /**
     * @return A list of supported values of the multi select observation.
     * 
     */
    public Optional<Output<List<String>>> supportedValues() {
        return Optional.ofNullable(this.supportedValues);
    }

    /**
     * A list of values of the multi select observation.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return A list of values of the multi select observation.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private AlertRuleAnomalyDuplicateMultiSelectObservationArgs() {}

    private AlertRuleAnomalyDuplicateMultiSelectObservationArgs(AlertRuleAnomalyDuplicateMultiSelectObservationArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.supportedValues = $.supportedValues;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleAnomalyDuplicateMultiSelectObservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleAnomalyDuplicateMultiSelectObservationArgs $;

        public Builder() {
            $ = new AlertRuleAnomalyDuplicateMultiSelectObservationArgs();
        }

        public Builder(AlertRuleAnomalyDuplicateMultiSelectObservationArgs defaults) {
            $ = new AlertRuleAnomalyDuplicateMultiSelectObservationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param supportedValues A list of supported values of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder supportedValues(@Nullable Output<List<String>> supportedValues) {
            $.supportedValues = supportedValues;
            return this;
        }

        /**
         * @param supportedValues A list of supported values of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder supportedValues(List<String> supportedValues) {
            return supportedValues(Output.of(supportedValues));
        }

        /**
         * @param supportedValues A list of supported values of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder supportedValues(String... supportedValues) {
            return supportedValues(List.of(supportedValues));
        }

        /**
         * @param values A list of values of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values A list of values of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values A list of values of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public AlertRuleAnomalyDuplicateMultiSelectObservationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}