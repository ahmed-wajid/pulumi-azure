// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.waf.inputs;

import com.pulumi.azure.waf.inputs.PolicyPolicySettingsLogScrubbingRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyPolicySettingsLogScrubbingArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyPolicySettingsLogScrubbingArgs Empty = new PolicyPolicySettingsLogScrubbingArgs();

    /**
     * Whether the log scrubbing is enabled or disabled. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the log scrubbing is enabled or disabled. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * One or more `scrubbing_rule` as define below.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<PolicyPolicySettingsLogScrubbingRuleArgs>> rules;

    /**
     * @return One or more `scrubbing_rule` as define below.
     * 
     */
    public Optional<Output<List<PolicyPolicySettingsLogScrubbingRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private PolicyPolicySettingsLogScrubbingArgs() {}

    private PolicyPolicySettingsLogScrubbingArgs(PolicyPolicySettingsLogScrubbingArgs $) {
        this.enabled = $.enabled;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyPolicySettingsLogScrubbingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyPolicySettingsLogScrubbingArgs $;

        public Builder() {
            $ = new PolicyPolicySettingsLogScrubbingArgs();
        }

        public Builder(PolicyPolicySettingsLogScrubbingArgs defaults) {
            $ = new PolicyPolicySettingsLogScrubbingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether the log scrubbing is enabled or disabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the log scrubbing is enabled or disabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param rules One or more `scrubbing_rule` as define below.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<PolicyPolicySettingsLogScrubbingRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules One or more `scrubbing_rule` as define below.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<PolicyPolicySettingsLogScrubbingRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules One or more `scrubbing_rule` as define below.
         * 
         * @return builder
         * 
         */
        public Builder rules(PolicyPolicySettingsLogScrubbingRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public PolicyPolicySettingsLogScrubbingArgs build() {
            return $;
        }
    }

}