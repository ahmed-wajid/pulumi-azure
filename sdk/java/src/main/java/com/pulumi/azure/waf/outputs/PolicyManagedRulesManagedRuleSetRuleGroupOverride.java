// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.waf.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PolicyManagedRulesManagedRuleSetRuleGroupOverride {
    /**
     * @return One or more Rule IDs
     * 
     */
    private final @Nullable List<String> disabledRules;
    /**
     * @return The name of the Rule Group
     * 
     */
    private final String ruleGroupName;

    @CustomType.Constructor
    private PolicyManagedRulesManagedRuleSetRuleGroupOverride(
        @CustomType.Parameter("disabledRules") @Nullable List<String> disabledRules,
        @CustomType.Parameter("ruleGroupName") String ruleGroupName) {
        this.disabledRules = disabledRules;
        this.ruleGroupName = ruleGroupName;
    }

    /**
     * @return One or more Rule IDs
     * 
     */
    public List<String> disabledRules() {
        return this.disabledRules == null ? List.of() : this.disabledRules;
    }
    /**
     * @return The name of the Rule Group
     * 
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyManagedRulesManagedRuleSetRuleGroupOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> disabledRules;
        private String ruleGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyManagedRulesManagedRuleSetRuleGroupOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabledRules = defaults.disabledRules;
    	      this.ruleGroupName = defaults.ruleGroupName;
        }

        public Builder disabledRules(@Nullable List<String> disabledRules) {
            this.disabledRules = disabledRules;
            return this;
        }
        public Builder disabledRules(String... disabledRules) {
            return disabledRules(List.of(disabledRules));
        }
        public Builder ruleGroupName(String ruleGroupName) {
            this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
            return this;
        }        public PolicyManagedRulesManagedRuleSetRuleGroupOverride build() {
            return new PolicyManagedRulesManagedRuleSetRuleGroupOverride(disabledRules, ruleGroupName);
        }
    }
}