// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertRuleAnomalyDuplicateSingleSelectObservation {
    /**
     * @return The description of the single select observation.
     * 
     */
    private @Nullable String description;
    /**
     * @return The name of the single select observation.
     * 
     */
    private String name;
    /**
     * @return A list of supported values of the single select observation.
     * 
     */
    private @Nullable List<String> supportedValues;
    /**
     * @return The value of the multi select observation.
     * 
     */
    private String value;

    private AlertRuleAnomalyDuplicateSingleSelectObservation() {}
    /**
     * @return The description of the single select observation.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The name of the single select observation.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of supported values of the single select observation.
     * 
     */
    public List<String> supportedValues() {
        return this.supportedValues == null ? List.of() : this.supportedValues;
    }
    /**
     * @return The value of the multi select observation.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleAnomalyDuplicateSingleSelectObservation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String name;
        private @Nullable List<String> supportedValues;
        private String value;
        public Builder() {}
        public Builder(AlertRuleAnomalyDuplicateSingleSelectObservation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.supportedValues = defaults.supportedValues;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder supportedValues(@Nullable List<String> supportedValues) {
            this.supportedValues = supportedValues;
            return this;
        }
        public Builder supportedValues(String... supportedValues) {
            return supportedValues(List.of(supportedValues));
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public AlertRuleAnomalyDuplicateSingleSelectObservation build() {
            final var o = new AlertRuleAnomalyDuplicateSingleSelectObservation();
            o.description = description;
            o.name = name;
            o.supportedValues = supportedValues;
            o.value = value;
            return o;
        }
    }
}