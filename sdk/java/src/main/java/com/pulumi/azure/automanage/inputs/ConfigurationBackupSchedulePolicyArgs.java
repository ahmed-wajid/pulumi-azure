// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automanage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationBackupSchedulePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationBackupSchedulePolicyArgs Empty = new ConfigurationBackupSchedulePolicyArgs();

    /**
     * The schedule policy type of the backup policy. Possible value is `SimpleSchedulePolicy`.
     * 
     */
    @Import(name="schedulePolicyType")
    private @Nullable Output<String> schedulePolicyType;

    /**
     * @return The schedule policy type of the backup policy. Possible value is `SimpleSchedulePolicy`.
     * 
     */
    public Optional<Output<String>> schedulePolicyType() {
        return Optional.ofNullable(this.schedulePolicyType);
    }

    /**
     * The schedule run days of the backup policy. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
     * 
     */
    @Import(name="scheduleRunDays")
    private @Nullable Output<List<String>> scheduleRunDays;

    /**
     * @return The schedule run days of the backup policy. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
     * 
     */
    public Optional<Output<List<String>>> scheduleRunDays() {
        return Optional.ofNullable(this.scheduleRunDays);
    }

    /**
     * The schedule run frequency of the backup policy. Possible values are `Daily` and `Weekly`. Defaults to `Daily`.
     * 
     */
    @Import(name="scheduleRunFrequency")
    private @Nullable Output<String> scheduleRunFrequency;

    /**
     * @return The schedule run frequency of the backup policy. Possible values are `Daily` and `Weekly`. Defaults to `Daily`.
     * 
     */
    public Optional<Output<String>> scheduleRunFrequency() {
        return Optional.ofNullable(this.scheduleRunFrequency);
    }

    /**
     * The schedule run times of the backup policy.
     * 
     */
    @Import(name="scheduleRunTimes")
    private @Nullable Output<List<String>> scheduleRunTimes;

    /**
     * @return The schedule run times of the backup policy.
     * 
     */
    public Optional<Output<List<String>>> scheduleRunTimes() {
        return Optional.ofNullable(this.scheduleRunTimes);
    }

    private ConfigurationBackupSchedulePolicyArgs() {}

    private ConfigurationBackupSchedulePolicyArgs(ConfigurationBackupSchedulePolicyArgs $) {
        this.schedulePolicyType = $.schedulePolicyType;
        this.scheduleRunDays = $.scheduleRunDays;
        this.scheduleRunFrequency = $.scheduleRunFrequency;
        this.scheduleRunTimes = $.scheduleRunTimes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationBackupSchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationBackupSchedulePolicyArgs $;

        public Builder() {
            $ = new ConfigurationBackupSchedulePolicyArgs();
        }

        public Builder(ConfigurationBackupSchedulePolicyArgs defaults) {
            $ = new ConfigurationBackupSchedulePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param schedulePolicyType The schedule policy type of the backup policy. Possible value is `SimpleSchedulePolicy`.
         * 
         * @return builder
         * 
         */
        public Builder schedulePolicyType(@Nullable Output<String> schedulePolicyType) {
            $.schedulePolicyType = schedulePolicyType;
            return this;
        }

        /**
         * @param schedulePolicyType The schedule policy type of the backup policy. Possible value is `SimpleSchedulePolicy`.
         * 
         * @return builder
         * 
         */
        public Builder schedulePolicyType(String schedulePolicyType) {
            return schedulePolicyType(Output.of(schedulePolicyType));
        }

        /**
         * @param scheduleRunDays The schedule run days of the backup policy. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder scheduleRunDays(@Nullable Output<List<String>> scheduleRunDays) {
            $.scheduleRunDays = scheduleRunDays;
            return this;
        }

        /**
         * @param scheduleRunDays The schedule run days of the backup policy. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder scheduleRunDays(List<String> scheduleRunDays) {
            return scheduleRunDays(Output.of(scheduleRunDays));
        }

        /**
         * @param scheduleRunDays The schedule run days of the backup policy. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder scheduleRunDays(String... scheduleRunDays) {
            return scheduleRunDays(List.of(scheduleRunDays));
        }

        /**
         * @param scheduleRunFrequency The schedule run frequency of the backup policy. Possible values are `Daily` and `Weekly`. Defaults to `Daily`.
         * 
         * @return builder
         * 
         */
        public Builder scheduleRunFrequency(@Nullable Output<String> scheduleRunFrequency) {
            $.scheduleRunFrequency = scheduleRunFrequency;
            return this;
        }

        /**
         * @param scheduleRunFrequency The schedule run frequency of the backup policy. Possible values are `Daily` and `Weekly`. Defaults to `Daily`.
         * 
         * @return builder
         * 
         */
        public Builder scheduleRunFrequency(String scheduleRunFrequency) {
            return scheduleRunFrequency(Output.of(scheduleRunFrequency));
        }

        /**
         * @param scheduleRunTimes The schedule run times of the backup policy.
         * 
         * @return builder
         * 
         */
        public Builder scheduleRunTimes(@Nullable Output<List<String>> scheduleRunTimes) {
            $.scheduleRunTimes = scheduleRunTimes;
            return this;
        }

        /**
         * @param scheduleRunTimes The schedule run times of the backup policy.
         * 
         * @return builder
         * 
         */
        public Builder scheduleRunTimes(List<String> scheduleRunTimes) {
            return scheduleRunTimes(Output.of(scheduleRunTimes));
        }

        /**
         * @param scheduleRunTimes The schedule run times of the backup policy.
         * 
         * @return builder
         * 
         */
        public Builder scheduleRunTimes(String... scheduleRunTimes) {
            return scheduleRunTimes(List.of(scheduleRunTimes));
        }

        public ConfigurationBackupSchedulePolicyArgs build() {
            return $;
        }
    }

}