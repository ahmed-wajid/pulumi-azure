// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationGatewayWafConfigurationDisabledRuleGroup {
    /**
     * @return The rule group where specific rules are disabled.
     * 
     */
    private String ruleGroupName;
    /**
     * @return A list of rules which will be disabled in that group.
     * 
     */
    private List<Integer> rules;

    private GetApplicationGatewayWafConfigurationDisabledRuleGroup() {}
    /**
     * @return The rule group where specific rules are disabled.
     * 
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }
    /**
     * @return A list of rules which will be disabled in that group.
     * 
     */
    public List<Integer> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationGatewayWafConfigurationDisabledRuleGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ruleGroupName;
        private List<Integer> rules;
        public Builder() {}
        public Builder(GetApplicationGatewayWafConfigurationDisabledRuleGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder ruleGroupName(String ruleGroupName) {
            this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<Integer> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(Integer... rules) {
            return rules(List.of(rules));
        }
        public GetApplicationGatewayWafConfigurationDisabledRuleGroup build() {
            final var _resultValue = new GetApplicationGatewayWafConfigurationDisabledRuleGroup();
            _resultValue.ruleGroupName = ruleGroupName;
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}