// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ActionRuleActionGroupScope {
    /**
     * @return A list of resource IDs of the given scope type which will be the target of action rule.
     * 
     */
    private final List<String> resourceIds;
    /**
     * @return Specifies the type of target scope. Possible values are `ResourceGroup` and `Resource`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ActionRuleActionGroupScope(
        @CustomType.Parameter("resourceIds") List<String> resourceIds,
        @CustomType.Parameter("type") String type) {
        this.resourceIds = resourceIds;
        this.type = type;
    }

    /**
     * @return A list of resource IDs of the given scope type which will be the target of action rule.
     * 
     */
    public List<String> resourceIds() {
        return this.resourceIds;
    }
    /**
     * @return Specifies the type of target scope. Possible values are `ResourceGroup` and `Resource`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionRuleActionGroupScope defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> resourceIds;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionRuleActionGroupScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceIds = defaults.resourceIds;
    	      this.type = defaults.type;
        }

        public Builder resourceIds(List<String> resourceIds) {
            this.resourceIds = Objects.requireNonNull(resourceIds);
            return this;
        }
        public Builder resourceIds(String... resourceIds) {
            return resourceIds(List.of(resourceIds));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ActionRuleActionGroupScope build() {
            return new ActionRuleActionGroupScope(resourceIds, type);
        }
    }
}