// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBudgetResourceGroupNotification {
    /**
     * @return A list of email addresses to send the budget notification to when the threshold is exceeded.
     * 
     */
    private final List<String> contactEmails;
    /**
     * @return A list of Action Group IDs to send the budget notification to when the threshold is exceeded.
     * 
     */
    private final List<String> contactGroups;
    /**
     * @return A list of contact roles to send the budget notification to when the threshold is exceeded.
     * 
     */
    private final List<String> contactRoles;
    /**
     * @return Whether the notification is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * @return The operator used for comparison.
     * 
     */
    private final String operator;
    /**
     * @return Threshold value associated with the notification.
     * 
     */
    private final Integer threshold;
    private final String thresholdType;

    @CustomType.Constructor
    private GetBudgetResourceGroupNotification(
        @CustomType.Parameter("contactEmails") List<String> contactEmails,
        @CustomType.Parameter("contactGroups") List<String> contactGroups,
        @CustomType.Parameter("contactRoles") List<String> contactRoles,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("threshold") Integer threshold,
        @CustomType.Parameter("thresholdType") String thresholdType) {
        this.contactEmails = contactEmails;
        this.contactGroups = contactGroups;
        this.contactRoles = contactRoles;
        this.enabled = enabled;
        this.operator = operator;
        this.threshold = threshold;
        this.thresholdType = thresholdType;
    }

    /**
     * @return A list of email addresses to send the budget notification to when the threshold is exceeded.
     * 
     */
    public List<String> contactEmails() {
        return this.contactEmails;
    }
    /**
     * @return A list of Action Group IDs to send the budget notification to when the threshold is exceeded.
     * 
     */
    public List<String> contactGroups() {
        return this.contactGroups;
    }
    /**
     * @return A list of contact roles to send the budget notification to when the threshold is exceeded.
     * 
     */
    public List<String> contactRoles() {
        return this.contactRoles;
    }
    /**
     * @return Whether the notification is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The operator used for comparison.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Threshold value associated with the notification.
     * 
     */
    public Integer threshold() {
        return this.threshold;
    }
    public String thresholdType() {
        return this.thresholdType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetResourceGroupNotification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> contactEmails;
        private List<String> contactGroups;
        private List<String> contactRoles;
        private Boolean enabled;
        private String operator;
        private Integer threshold;
        private String thresholdType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBudgetResourceGroupNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactEmails = defaults.contactEmails;
    	      this.contactGroups = defaults.contactGroups;
    	      this.contactRoles = defaults.contactRoles;
    	      this.enabled = defaults.enabled;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.thresholdType = defaults.thresholdType;
        }

        public Builder contactEmails(List<String> contactEmails) {
            this.contactEmails = Objects.requireNonNull(contactEmails);
            return this;
        }
        public Builder contactEmails(String... contactEmails) {
            return contactEmails(List.of(contactEmails));
        }
        public Builder contactGroups(List<String> contactGroups) {
            this.contactGroups = Objects.requireNonNull(contactGroups);
            return this;
        }
        public Builder contactGroups(String... contactGroups) {
            return contactGroups(List.of(contactGroups));
        }
        public Builder contactRoles(List<String> contactRoles) {
            this.contactRoles = Objects.requireNonNull(contactRoles);
            return this;
        }
        public Builder contactRoles(String... contactRoles) {
            return contactRoles(List.of(contactRoles));
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder threshold(Integer threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public Builder thresholdType(String thresholdType) {
            this.thresholdType = Objects.requireNonNull(thresholdType);
            return this;
        }        public GetBudgetResourceGroupNotification build() {
            return new GetBudgetResourceGroupNotification(contactEmails, contactGroups, contactRoles, enabled, operator, threshold, thresholdType);
        }
    }
}