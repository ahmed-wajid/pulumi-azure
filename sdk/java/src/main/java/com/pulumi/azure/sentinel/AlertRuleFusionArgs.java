// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertRuleFusionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleFusionArgs Empty = new AlertRuleFusionArgs();

    /**
     * The GUID of the alert rule template which is used for this Sentinel Fusion Alert Rule. Changing this forces a new Sentinel Fusion Alert Rule to be created.
     * 
     */
    @Import(name="alertRuleTemplateGuid", required=true)
    private Output<String> alertRuleTemplateGuid;

    /**
     * @return The GUID of the alert rule template which is used for this Sentinel Fusion Alert Rule. Changing this forces a new Sentinel Fusion Alert Rule to be created.
     * 
     */
    public Output<String> alertRuleTemplateGuid() {
        return this.alertRuleTemplateGuid;
    }

    /**
     * Should this Sentinel Fusion Alert Rule be enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Should this Sentinel Fusion Alert Rule be enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The ID of the Log Analytics Workspace this Sentinel Fusion Alert Rule belongs to. Changing this forces a new Sentinel Fusion Alert Rule to be created.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId", required=true)
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace this Sentinel Fusion Alert Rule belongs to. Changing this forces a new Sentinel Fusion Alert Rule to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * The name which should be used for this Sentinel Fusion Alert Rule. Changing this forces a new Sentinel Fusion Alert Rule to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Sentinel Fusion Alert Rule. Changing this forces a new Sentinel Fusion Alert Rule to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AlertRuleFusionArgs() {}

    private AlertRuleFusionArgs(AlertRuleFusionArgs $) {
        this.alertRuleTemplateGuid = $.alertRuleTemplateGuid;
        this.enabled = $.enabled;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleFusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleFusionArgs $;

        public Builder() {
            $ = new AlertRuleFusionArgs();
        }

        public Builder(AlertRuleFusionArgs defaults) {
            $ = new AlertRuleFusionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertRuleTemplateGuid The GUID of the alert rule template which is used for this Sentinel Fusion Alert Rule. Changing this forces a new Sentinel Fusion Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleTemplateGuid(Output<String> alertRuleTemplateGuid) {
            $.alertRuleTemplateGuid = alertRuleTemplateGuid;
            return this;
        }

        /**
         * @param alertRuleTemplateGuid The GUID of the alert rule template which is used for this Sentinel Fusion Alert Rule. Changing this forces a new Sentinel Fusion Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder alertRuleTemplateGuid(String alertRuleTemplateGuid) {
            return alertRuleTemplateGuid(Output.of(alertRuleTemplateGuid));
        }

        /**
         * @param enabled Should this Sentinel Fusion Alert Rule be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should this Sentinel Fusion Alert Rule be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace this Sentinel Fusion Alert Rule belongs to. Changing this forces a new Sentinel Fusion Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace this Sentinel Fusion Alert Rule belongs to. Changing this forces a new Sentinel Fusion Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param name The name which should be used for this Sentinel Fusion Alert Rule. Changing this forces a new Sentinel Fusion Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Sentinel Fusion Alert Rule. Changing this forces a new Sentinel Fusion Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AlertRuleFusionArgs build() {
            $.alertRuleTemplateGuid = Objects.requireNonNull($.alertRuleTemplateGuid, "expected parameter 'alertRuleTemplateGuid' to be non-null");
            $.logAnalyticsWorkspaceId = Objects.requireNonNull($.logAnalyticsWorkspaceId, "expected parameter 'logAnalyticsWorkspaceId' to be non-null");
            return $;
        }
    }

}