// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesExtensionArgs;
import com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPerformanceCounterArgs;
import com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesSyslogArgs;
import com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesWindowsEventLogArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataCollectionRuleDataSourcesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataCollectionRuleDataSourcesArgs Empty = new DataCollectionRuleDataSourcesArgs();

    /**
     * One or more `extension` blocks as defined below.
     * 
     */
    @Import(name="extensions")
    private @Nullable Output<List<DataCollectionRuleDataSourcesExtensionArgs>> extensions;

    /**
     * @return One or more `extension` blocks as defined below.
     * 
     */
    public Optional<Output<List<DataCollectionRuleDataSourcesExtensionArgs>>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    /**
     * One or more `performance_counter` blocks as defined below.
     * 
     */
    @Import(name="performanceCounters")
    private @Nullable Output<List<DataCollectionRuleDataSourcesPerformanceCounterArgs>> performanceCounters;

    /**
     * @return One or more `performance_counter` blocks as defined below.
     * 
     */
    public Optional<Output<List<DataCollectionRuleDataSourcesPerformanceCounterArgs>>> performanceCounters() {
        return Optional.ofNullable(this.performanceCounters);
    }

    /**
     * One or more `syslog` blocks as defined below.
     * 
     */
    @Import(name="syslogs")
    private @Nullable Output<List<DataCollectionRuleDataSourcesSyslogArgs>> syslogs;

    /**
     * @return One or more `syslog` blocks as defined below.
     * 
     */
    public Optional<Output<List<DataCollectionRuleDataSourcesSyslogArgs>>> syslogs() {
        return Optional.ofNullable(this.syslogs);
    }

    /**
     * One or more `windows_event_log` blocks as defined below.
     * 
     */
    @Import(name="windowsEventLogs")
    private @Nullable Output<List<DataCollectionRuleDataSourcesWindowsEventLogArgs>> windowsEventLogs;

    /**
     * @return One or more `windows_event_log` blocks as defined below.
     * 
     */
    public Optional<Output<List<DataCollectionRuleDataSourcesWindowsEventLogArgs>>> windowsEventLogs() {
        return Optional.ofNullable(this.windowsEventLogs);
    }

    private DataCollectionRuleDataSourcesArgs() {}

    private DataCollectionRuleDataSourcesArgs(DataCollectionRuleDataSourcesArgs $) {
        this.extensions = $.extensions;
        this.performanceCounters = $.performanceCounters;
        this.syslogs = $.syslogs;
        this.windowsEventLogs = $.windowsEventLogs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCollectionRuleDataSourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCollectionRuleDataSourcesArgs $;

        public Builder() {
            $ = new DataCollectionRuleDataSourcesArgs();
        }

        public Builder(DataCollectionRuleDataSourcesArgs defaults) {
            $ = new DataCollectionRuleDataSourcesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extensions One or more `extension` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder extensions(@Nullable Output<List<DataCollectionRuleDataSourcesExtensionArgs>> extensions) {
            $.extensions = extensions;
            return this;
        }

        /**
         * @param extensions One or more `extension` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder extensions(List<DataCollectionRuleDataSourcesExtensionArgs> extensions) {
            return extensions(Output.of(extensions));
        }

        /**
         * @param extensions One or more `extension` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder extensions(DataCollectionRuleDataSourcesExtensionArgs... extensions) {
            return extensions(List.of(extensions));
        }

        /**
         * @param performanceCounters One or more `performance_counter` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder performanceCounters(@Nullable Output<List<DataCollectionRuleDataSourcesPerformanceCounterArgs>> performanceCounters) {
            $.performanceCounters = performanceCounters;
            return this;
        }

        /**
         * @param performanceCounters One or more `performance_counter` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder performanceCounters(List<DataCollectionRuleDataSourcesPerformanceCounterArgs> performanceCounters) {
            return performanceCounters(Output.of(performanceCounters));
        }

        /**
         * @param performanceCounters One or more `performance_counter` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder performanceCounters(DataCollectionRuleDataSourcesPerformanceCounterArgs... performanceCounters) {
            return performanceCounters(List.of(performanceCounters));
        }

        /**
         * @param syslogs One or more `syslog` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder syslogs(@Nullable Output<List<DataCollectionRuleDataSourcesSyslogArgs>> syslogs) {
            $.syslogs = syslogs;
            return this;
        }

        /**
         * @param syslogs One or more `syslog` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder syslogs(List<DataCollectionRuleDataSourcesSyslogArgs> syslogs) {
            return syslogs(Output.of(syslogs));
        }

        /**
         * @param syslogs One or more `syslog` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder syslogs(DataCollectionRuleDataSourcesSyslogArgs... syslogs) {
            return syslogs(List.of(syslogs));
        }

        /**
         * @param windowsEventLogs One or more `windows_event_log` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder windowsEventLogs(@Nullable Output<List<DataCollectionRuleDataSourcesWindowsEventLogArgs>> windowsEventLogs) {
            $.windowsEventLogs = windowsEventLogs;
            return this;
        }

        /**
         * @param windowsEventLogs One or more `windows_event_log` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder windowsEventLogs(List<DataCollectionRuleDataSourcesWindowsEventLogArgs> windowsEventLogs) {
            return windowsEventLogs(Output.of(windowsEventLogs));
        }

        /**
         * @param windowsEventLogs One or more `windows_event_log` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder windowsEventLogs(DataCollectionRuleDataSourcesWindowsEventLogArgs... windowsEventLogs) {
            return windowsEventLogs(List.of(windowsEventLogs));
        }

        public DataCollectionRuleDataSourcesArgs build() {
            return $;
        }
    }

}