// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection.outputs;

import com.pulumi.azure.dataprotection.outputs.BackupPolicyDiskRetentionRuleCriteria;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BackupPolicyDiskRetentionRule {
    /**
     * @return A `criteria` block as defined below. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    private final BackupPolicyDiskRetentionRuleCriteria criteria;
    /**
     * @return Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    private final String duration;
    /**
     * @return The name which should be used for this retention rule. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    private final String name;
    /**
     * @return Retention Tag priority. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    private final Integer priority;

    @CustomType.Constructor
    private BackupPolicyDiskRetentionRule(
        @CustomType.Parameter("criteria") BackupPolicyDiskRetentionRuleCriteria criteria,
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("priority") Integer priority) {
        this.criteria = criteria;
        this.duration = duration;
        this.name = name;
        this.priority = priority;
    }

    /**
     * @return A `criteria` block as defined below. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public BackupPolicyDiskRetentionRuleCriteria criteria() {
        return this.criteria;
    }
    /**
     * @return Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return The name which should be used for this retention rule. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Retention Tag priority. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Integer priority() {
        return this.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyDiskRetentionRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyDiskRetentionRuleCriteria criteria;
        private String duration;
        private String name;
        private Integer priority;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPolicyDiskRetentionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.duration = defaults.duration;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        public Builder criteria(BackupPolicyDiskRetentionRuleCriteria criteria) {
            this.criteria = Objects.requireNonNull(criteria);
            return this;
        }
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }        public BackupPolicyDiskRetentionRule build() {
            return new BackupPolicyDiskRetentionRule(criteria, duration, name, priority);
        }
    }
}