// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SoftwareUpdateConfigurationTargetAzureQueryTag {
    /**
     * @return Specifies the name of the tag to filter.
     * 
     */
    private String tag;
    /**
     * @return Specifies a list of values for this tag key.
     * 
     */
    private List<String> values;

    private SoftwareUpdateConfigurationTargetAzureQueryTag() {}
    /**
     * @return Specifies the name of the tag to filter.
     * 
     */
    public String tag() {
        return this.tag;
    }
    /**
     * @return Specifies a list of values for this tag key.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareUpdateConfigurationTargetAzureQueryTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String tag;
        private List<String> values;
        public Builder() {}
        public Builder(SoftwareUpdateConfigurationTargetAzureQueryTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tag = defaults.tag;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public SoftwareUpdateConfigurationTargetAzureQueryTag build() {
            final var o = new SoftwareUpdateConfigurationTargetAzureQueryTag();
            o.tag = tag;
            o.values = values;
            return o;
        }
    }
}