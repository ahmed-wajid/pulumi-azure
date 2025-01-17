// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.azure.sentinel.outputs.AlertRuleScheduledIncidentConfigurationGrouping;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class AlertRuleScheduledIncidentConfiguration {
    /**
     * @return Whether to create an incident from alerts triggered by this Sentinel Scheduled Alert Rule?
     * 
     */
    private Boolean createIncident;
    /**
     * @return A `grouping` block as defined below.
     * 
     */
    private AlertRuleScheduledIncidentConfigurationGrouping grouping;

    private AlertRuleScheduledIncidentConfiguration() {}
    /**
     * @return Whether to create an incident from alerts triggered by this Sentinel Scheduled Alert Rule?
     * 
     */
    public Boolean createIncident() {
        return this.createIncident;
    }
    /**
     * @return A `grouping` block as defined below.
     * 
     */
    public AlertRuleScheduledIncidentConfigurationGrouping grouping() {
        return this.grouping;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleScheduledIncidentConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean createIncident;
        private AlertRuleScheduledIncidentConfigurationGrouping grouping;
        public Builder() {}
        public Builder(AlertRuleScheduledIncidentConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createIncident = defaults.createIncident;
    	      this.grouping = defaults.grouping;
        }

        @CustomType.Setter
        public Builder createIncident(Boolean createIncident) {
            if (createIncident == null) {
              throw new MissingRequiredPropertyException("AlertRuleScheduledIncidentConfiguration", "createIncident");
            }
            this.createIncident = createIncident;
            return this;
        }
        @CustomType.Setter
        public Builder grouping(AlertRuleScheduledIncidentConfigurationGrouping grouping) {
            if (grouping == null) {
              throw new MissingRequiredPropertyException("AlertRuleScheduledIncidentConfiguration", "grouping");
            }
            this.grouping = grouping;
            return this;
        }
        public AlertRuleScheduledIncidentConfiguration build() {
            final var _resultValue = new AlertRuleScheduledIncidentConfiguration();
            _resultValue.createIncident = createIncident;
            _resultValue.grouping = grouping;
            return _resultValue;
        }
    }
}
