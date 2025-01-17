// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection;

import com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPolicyPostgresqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupPolicyPostgresqlArgs Empty = new BackupPolicyPostgresqlArgs();

    /**
     * Specifies a list of repeating time interval. It supports weekly back. It should follow `ISO 8601` repeating time interval. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    @Import(name="backupRepeatingTimeIntervals", required=true)
    private Output<List<String>> backupRepeatingTimeIntervals;

    /**
     * @return Specifies a list of repeating time interval. It supports weekly back. It should follow `ISO 8601` repeating time interval. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    public Output<List<String>> backupRepeatingTimeIntervals() {
        return this.backupRepeatingTimeIntervals;
    }

    /**
     * The duration of default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    @Import(name="defaultRetentionDuration", required=true)
    private Output<String> defaultRetentionDuration;

    /**
     * @return The duration of default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    public Output<String> defaultRetentionDuration() {
        return this.defaultRetentionDuration;
    }

    /**
     * The name which should be used for this Backup Policy PostgreSQL. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Backup Policy PostgreSQL. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Backup Policy PostgreSQL should exist. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Backup Policy PostgreSQL should exist. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    @Import(name="retentionRules")
    private @Nullable Output<List<BackupPolicyPostgresqlRetentionRuleArgs>> retentionRules;

    /**
     * @return One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    public Optional<Output<List<BackupPolicyPostgresqlRetentionRuleArgs>>> retentionRules() {
        return Optional.ofNullable(this.retentionRules);
    }

    /**
     * Specifies the Time Zone which should be used by the backup schedule. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return Specifies the Time Zone which should be used by the backup schedule. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    /**
     * The name of the Backup Vault where the Backup Policy PostgreSQL should exist. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    @Import(name="vaultName", required=true)
    private Output<String> vaultName;

    /**
     * @return The name of the Backup Vault where the Backup Policy PostgreSQL should exist. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    public Output<String> vaultName() {
        return this.vaultName;
    }

    private BackupPolicyPostgresqlArgs() {}

    private BackupPolicyPostgresqlArgs(BackupPolicyPostgresqlArgs $) {
        this.backupRepeatingTimeIntervals = $.backupRepeatingTimeIntervals;
        this.defaultRetentionDuration = $.defaultRetentionDuration;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.retentionRules = $.retentionRules;
        this.timeZone = $.timeZone;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyPostgresqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyPostgresqlArgs $;

        public Builder() {
            $ = new BackupPolicyPostgresqlArgs();
        }

        public Builder(BackupPolicyPostgresqlArgs defaults) {
            $ = new BackupPolicyPostgresqlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupRepeatingTimeIntervals Specifies a list of repeating time interval. It supports weekly back. It should follow `ISO 8601` repeating time interval. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder backupRepeatingTimeIntervals(Output<List<String>> backupRepeatingTimeIntervals) {
            $.backupRepeatingTimeIntervals = backupRepeatingTimeIntervals;
            return this;
        }

        /**
         * @param backupRepeatingTimeIntervals Specifies a list of repeating time interval. It supports weekly back. It should follow `ISO 8601` repeating time interval. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder backupRepeatingTimeIntervals(List<String> backupRepeatingTimeIntervals) {
            return backupRepeatingTimeIntervals(Output.of(backupRepeatingTimeIntervals));
        }

        /**
         * @param backupRepeatingTimeIntervals Specifies a list of repeating time interval. It supports weekly back. It should follow `ISO 8601` repeating time interval. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder backupRepeatingTimeIntervals(String... backupRepeatingTimeIntervals) {
            return backupRepeatingTimeIntervals(List.of(backupRepeatingTimeIntervals));
        }

        /**
         * @param defaultRetentionDuration The duration of default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder defaultRetentionDuration(Output<String> defaultRetentionDuration) {
            $.defaultRetentionDuration = defaultRetentionDuration;
            return this;
        }

        /**
         * @param defaultRetentionDuration The duration of default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder defaultRetentionDuration(String defaultRetentionDuration) {
            return defaultRetentionDuration(Output.of(defaultRetentionDuration));
        }

        /**
         * @param name The name which should be used for this Backup Policy PostgreSQL. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Backup Policy PostgreSQL. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Backup Policy PostgreSQL should exist. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Backup Policy PostgreSQL should exist. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param retentionRules One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder retentionRules(@Nullable Output<List<BackupPolicyPostgresqlRetentionRuleArgs>> retentionRules) {
            $.retentionRules = retentionRules;
            return this;
        }

        /**
         * @param retentionRules One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder retentionRules(List<BackupPolicyPostgresqlRetentionRuleArgs> retentionRules) {
            return retentionRules(Output.of(retentionRules));
        }

        /**
         * @param retentionRules One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder retentionRules(BackupPolicyPostgresqlRetentionRuleArgs... retentionRules) {
            return retentionRules(List.of(retentionRules));
        }

        /**
         * @param timeZone Specifies the Time Zone which should be used by the backup schedule. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone Specifies the Time Zone which should be used by the backup schedule. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        /**
         * @param vaultName The name of the Backup Vault where the Backup Policy PostgreSQL should exist. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(Output<String> vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        /**
         * @param vaultName The name of the Backup Vault where the Backup Policy PostgreSQL should exist. Changing this forces a new Backup Policy PostgreSQL to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            return vaultName(Output.of(vaultName));
        }

        public BackupPolicyPostgresqlArgs build() {
            if ($.backupRepeatingTimeIntervals == null) {
                throw new MissingRequiredPropertyException("BackupPolicyPostgresqlArgs", "backupRepeatingTimeIntervals");
            }
            if ($.defaultRetentionDuration == null) {
                throw new MissingRequiredPropertyException("BackupPolicyPostgresqlArgs", "defaultRetentionDuration");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("BackupPolicyPostgresqlArgs", "resourceGroupName");
            }
            if ($.vaultName == null) {
                throw new MissingRequiredPropertyException("BackupPolicyPostgresqlArgs", "vaultName");
            }
            return $;
        }
    }

}
