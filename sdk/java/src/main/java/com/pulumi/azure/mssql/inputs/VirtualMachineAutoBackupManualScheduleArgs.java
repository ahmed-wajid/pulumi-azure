// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class VirtualMachineAutoBackupManualScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineAutoBackupManualScheduleArgs Empty = new VirtualMachineAutoBackupManualScheduleArgs();

    /**
     * Frequency of full backups. Valid values include `Daily` or `Weekly`. Required when `backup_schedule_automated` is false.
     * 
     */
    @Import(name="fullBackupFrequency", required=true)
    private Output<String> fullBackupFrequency;

    /**
     * @return Frequency of full backups. Valid values include `Daily` or `Weekly`. Required when `backup_schedule_automated` is false.
     * 
     */
    public Output<String> fullBackupFrequency() {
        return this.fullBackupFrequency;
    }

    /**
     * Start hour of a given day during which full backups can take place. Valid values are from `0` to `23`. Required when `backup_schedule_automated` is false.
     * 
     */
    @Import(name="fullBackupStartHour", required=true)
    private Output<Integer> fullBackupStartHour;

    /**
     * @return Start hour of a given day during which full backups can take place. Valid values are from `0` to `23`. Required when `backup_schedule_automated` is false.
     * 
     */
    public Output<Integer> fullBackupStartHour() {
        return this.fullBackupStartHour;
    }

    /**
     * Duration of the time window of a given day during which full backups can take place, in hours. Valid values are between `1` and `23`. Required when `backup_schedule_automated` is false.
     * 
     */
    @Import(name="fullBackupWindowInHours", required=true)
    private Output<Integer> fullBackupWindowInHours;

    /**
     * @return Duration of the time window of a given day during which full backups can take place, in hours. Valid values are between `1` and `23`. Required when `backup_schedule_automated` is false.
     * 
     */
    public Output<Integer> fullBackupWindowInHours() {
        return this.fullBackupWindowInHours;
    }

    /**
     * Frequency of log backups, in minutes. Valid values are from `5` to `60`. Required when `backup_schedule_automated` is false.
     * 
     */
    @Import(name="logBackupFrequencyInMinutes", required=true)
    private Output<Integer> logBackupFrequencyInMinutes;

    /**
     * @return Frequency of log backups, in minutes. Valid values are from `5` to `60`. Required when `backup_schedule_automated` is false.
     * 
     */
    public Output<Integer> logBackupFrequencyInMinutes() {
        return this.logBackupFrequencyInMinutes;
    }

    private VirtualMachineAutoBackupManualScheduleArgs() {}

    private VirtualMachineAutoBackupManualScheduleArgs(VirtualMachineAutoBackupManualScheduleArgs $) {
        this.fullBackupFrequency = $.fullBackupFrequency;
        this.fullBackupStartHour = $.fullBackupStartHour;
        this.fullBackupWindowInHours = $.fullBackupWindowInHours;
        this.logBackupFrequencyInMinutes = $.logBackupFrequencyInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineAutoBackupManualScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineAutoBackupManualScheduleArgs $;

        public Builder() {
            $ = new VirtualMachineAutoBackupManualScheduleArgs();
        }

        public Builder(VirtualMachineAutoBackupManualScheduleArgs defaults) {
            $ = new VirtualMachineAutoBackupManualScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fullBackupFrequency Frequency of full backups. Valid values include `Daily` or `Weekly`. Required when `backup_schedule_automated` is false.
         * 
         * @return builder
         * 
         */
        public Builder fullBackupFrequency(Output<String> fullBackupFrequency) {
            $.fullBackupFrequency = fullBackupFrequency;
            return this;
        }

        /**
         * @param fullBackupFrequency Frequency of full backups. Valid values include `Daily` or `Weekly`. Required when `backup_schedule_automated` is false.
         * 
         * @return builder
         * 
         */
        public Builder fullBackupFrequency(String fullBackupFrequency) {
            return fullBackupFrequency(Output.of(fullBackupFrequency));
        }

        /**
         * @param fullBackupStartHour Start hour of a given day during which full backups can take place. Valid values are from `0` to `23`. Required when `backup_schedule_automated` is false.
         * 
         * @return builder
         * 
         */
        public Builder fullBackupStartHour(Output<Integer> fullBackupStartHour) {
            $.fullBackupStartHour = fullBackupStartHour;
            return this;
        }

        /**
         * @param fullBackupStartHour Start hour of a given day during which full backups can take place. Valid values are from `0` to `23`. Required when `backup_schedule_automated` is false.
         * 
         * @return builder
         * 
         */
        public Builder fullBackupStartHour(Integer fullBackupStartHour) {
            return fullBackupStartHour(Output.of(fullBackupStartHour));
        }

        /**
         * @param fullBackupWindowInHours Duration of the time window of a given day during which full backups can take place, in hours. Valid values are between `1` and `23`. Required when `backup_schedule_automated` is false.
         * 
         * @return builder
         * 
         */
        public Builder fullBackupWindowInHours(Output<Integer> fullBackupWindowInHours) {
            $.fullBackupWindowInHours = fullBackupWindowInHours;
            return this;
        }

        /**
         * @param fullBackupWindowInHours Duration of the time window of a given day during which full backups can take place, in hours. Valid values are between `1` and `23`. Required when `backup_schedule_automated` is false.
         * 
         * @return builder
         * 
         */
        public Builder fullBackupWindowInHours(Integer fullBackupWindowInHours) {
            return fullBackupWindowInHours(Output.of(fullBackupWindowInHours));
        }

        /**
         * @param logBackupFrequencyInMinutes Frequency of log backups, in minutes. Valid values are from `5` to `60`. Required when `backup_schedule_automated` is false.
         * 
         * @return builder
         * 
         */
        public Builder logBackupFrequencyInMinutes(Output<Integer> logBackupFrequencyInMinutes) {
            $.logBackupFrequencyInMinutes = logBackupFrequencyInMinutes;
            return this;
        }

        /**
         * @param logBackupFrequencyInMinutes Frequency of log backups, in minutes. Valid values are from `5` to `60`. Required when `backup_schedule_automated` is false.
         * 
         * @return builder
         * 
         */
        public Builder logBackupFrequencyInMinutes(Integer logBackupFrequencyInMinutes) {
            return logBackupFrequencyInMinutes(Output.of(logBackupFrequencyInMinutes));
        }

        public VirtualMachineAutoBackupManualScheduleArgs build() {
            $.fullBackupFrequency = Objects.requireNonNull($.fullBackupFrequency, "expected parameter 'fullBackupFrequency' to be non-null");
            $.fullBackupStartHour = Objects.requireNonNull($.fullBackupStartHour, "expected parameter 'fullBackupStartHour' to be non-null");
            $.fullBackupWindowInHours = Objects.requireNonNull($.fullBackupWindowInHours, "expected parameter 'fullBackupWindowInHours' to be non-null");
            $.logBackupFrequencyInMinutes = Objects.requireNonNull($.logBackupFrequencyInMinutes, "expected parameter 'logBackupFrequencyInMinutes' to be non-null");
            return $;
        }
    }

}