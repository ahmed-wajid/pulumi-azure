// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DataFlowSinkRejectedLinkedService {
    /**
     * @return The name for the Data Factory Linked Service with schema.
     * 
     */
    private String name;
    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    private @Nullable Map<String,String> parameters;

    private DataFlowSinkRejectedLinkedService() {}
    /**
     * @return The name for the Data Factory Linked Service with schema.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFlowSinkRejectedLinkedService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable Map<String,String> parameters;
        public Builder() {}
        public Builder(DataFlowSinkRejectedLinkedService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public DataFlowSinkRejectedLinkedService build() {
            final var o = new DataFlowSinkRejectedLinkedService();
            o.name = name;
            o.parameters = parameters;
            return o;
        }
    }
}