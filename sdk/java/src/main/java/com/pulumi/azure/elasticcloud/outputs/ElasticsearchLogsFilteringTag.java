// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.elasticcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElasticsearchLogsFilteringTag {
    /**
     * @return Specifies the type of action which should be taken when the Tag matches the `name` and `value`. Possible values are `Exclude` and `Include`.
     * 
     */
    private final String action;
    /**
     * @return Specifies the name (key) of the Tag which should be filtered.
     * 
     */
    private final String name;
    /**
     * @return Specifies the value of the Tag which should be filtered.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ElasticsearchLogsFilteringTag(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.action = action;
        this.name = name;
        this.value = value;
    }

    /**
     * @return Specifies the type of action which should be taken when the Tag matches the `name` and `value`. Possible values are `Exclude` and `Include`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Specifies the name (key) of the Tag which should be filtered.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the value of the Tag which should be filtered.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticsearchLogsFilteringTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ElasticsearchLogsFilteringTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ElasticsearchLogsFilteringTag build() {
            return new ElasticsearchLogsFilteringTag(action, name, value);
        }
    }
}