// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs Empty = new HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs();

    /**
     * A list of `schedule` blocks as defined below.
     * 
     */
    @Import(name="schedules", required=true)
    private Output<List<HadoopClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs>> schedules;

    /**
     * @return A list of `schedule` blocks as defined below.
     * 
     */
    public Output<List<HadoopClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs>> schedules() {
        return this.schedules;
    }

    /**
     * The time zone for the autoscale schedule times.
     * 
     */
    @Import(name="timezone", required=true)
    private Output<String> timezone;

    /**
     * @return The time zone for the autoscale schedule times.
     * 
     */
    public Output<String> timezone() {
        return this.timezone;
    }

    private HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs() {}

    private HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs(HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs $) {
        this.schedules = $.schedules;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs $;

        public Builder() {
            $ = new HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs();
        }

        public Builder(HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs defaults) {
            $ = new HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param schedules A list of `schedule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schedules(Output<List<HadoopClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs>> schedules) {
            $.schedules = schedules;
            return this;
        }

        /**
         * @param schedules A list of `schedule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schedules(List<HadoopClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs> schedules) {
            return schedules(Output.of(schedules));
        }

        /**
         * @param schedules A list of `schedule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schedules(HadoopClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs... schedules) {
            return schedules(List.of(schedules));
        }

        /**
         * @param timezone The time zone for the autoscale schedule times.
         * 
         * @return builder
         * 
         */
        public Builder timezone(Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone The time zone for the autoscale schedule times.
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs build() {
            $.schedules = Objects.requireNonNull($.schedules, "expected parameter 'schedules' to be non-null");
            $.timezone = Objects.requireNonNull($.timezone, "expected parameter 'timezone' to be non-null");
            return $;
        }
    }

}