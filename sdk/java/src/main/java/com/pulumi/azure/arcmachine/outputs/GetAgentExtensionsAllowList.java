// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.arcmachine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAgentExtensionsAllowList {
    /**
     * @return Publisher of the extension.
     * 
     */
    private String publisher;
    /**
     * @return The identity type.
     * 
     */
    private String type;

    private GetAgentExtensionsAllowList() {}
    /**
     * @return Publisher of the extension.
     * 
     */
    public String publisher() {
        return this.publisher;
    }
    /**
     * @return The identity type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAgentExtensionsAllowList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String publisher;
        private String type;
        public Builder() {}
        public Builder(GetAgentExtensionsAllowList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publisher = defaults.publisher;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAgentExtensionsAllowList build() {
            final var o = new GetAgentExtensionsAllowList();
            o.publisher = publisher;
            o.type = type;
            return o;
        }
    }
}