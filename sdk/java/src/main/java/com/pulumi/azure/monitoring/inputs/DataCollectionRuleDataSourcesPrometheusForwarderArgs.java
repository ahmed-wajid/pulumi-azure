// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.azure.monitoring.inputs.DataCollectionRuleDataSourcesPrometheusForwarderLabelIncludeFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataCollectionRuleDataSourcesPrometheusForwarderArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataCollectionRuleDataSourcesPrometheusForwarderArgs Empty = new DataCollectionRuleDataSourcesPrometheusForwarderArgs();

    /**
     * One or more `label_include_filter` blocks as defined above.
     * 
     */
    @Import(name="labelIncludeFilters")
    private @Nullable Output<List<DataCollectionRuleDataSourcesPrometheusForwarderLabelIncludeFilterArgs>> labelIncludeFilters;

    /**
     * @return One or more `label_include_filter` blocks as defined above.
     * 
     */
    public Optional<Output<List<DataCollectionRuleDataSourcesPrometheusForwarderLabelIncludeFilterArgs>>> labelIncludeFilters() {
        return Optional.ofNullable(this.labelIncludeFilters);
    }

    /**
     * The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible value is `Microsoft-PrometheusMetrics`.
     * 
     */
    @Import(name="streams", required=true)
    private Output<List<String>> streams;

    /**
     * @return Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible value is `Microsoft-PrometheusMetrics`.
     * 
     */
    public Output<List<String>> streams() {
        return this.streams;
    }

    private DataCollectionRuleDataSourcesPrometheusForwarderArgs() {}

    private DataCollectionRuleDataSourcesPrometheusForwarderArgs(DataCollectionRuleDataSourcesPrometheusForwarderArgs $) {
        this.labelIncludeFilters = $.labelIncludeFilters;
        this.name = $.name;
        this.streams = $.streams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCollectionRuleDataSourcesPrometheusForwarderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCollectionRuleDataSourcesPrometheusForwarderArgs $;

        public Builder() {
            $ = new DataCollectionRuleDataSourcesPrometheusForwarderArgs();
        }

        public Builder(DataCollectionRuleDataSourcesPrometheusForwarderArgs defaults) {
            $ = new DataCollectionRuleDataSourcesPrometheusForwarderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labelIncludeFilters One or more `label_include_filter` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder labelIncludeFilters(@Nullable Output<List<DataCollectionRuleDataSourcesPrometheusForwarderLabelIncludeFilterArgs>> labelIncludeFilters) {
            $.labelIncludeFilters = labelIncludeFilters;
            return this;
        }

        /**
         * @param labelIncludeFilters One or more `label_include_filter` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder labelIncludeFilters(List<DataCollectionRuleDataSourcesPrometheusForwarderLabelIncludeFilterArgs> labelIncludeFilters) {
            return labelIncludeFilters(Output.of(labelIncludeFilters));
        }

        /**
         * @param labelIncludeFilters One or more `label_include_filter` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder labelIncludeFilters(DataCollectionRuleDataSourcesPrometheusForwarderLabelIncludeFilterArgs... labelIncludeFilters) {
            return labelIncludeFilters(List.of(labelIncludeFilters));
        }

        /**
         * @param name The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param streams Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible value is `Microsoft-PrometheusMetrics`.
         * 
         * @return builder
         * 
         */
        public Builder streams(Output<List<String>> streams) {
            $.streams = streams;
            return this;
        }

        /**
         * @param streams Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible value is `Microsoft-PrometheusMetrics`.
         * 
         * @return builder
         * 
         */
        public Builder streams(List<String> streams) {
            return streams(Output.of(streams));
        }

        /**
         * @param streams Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible value is `Microsoft-PrometheusMetrics`.
         * 
         * @return builder
         * 
         */
        public Builder streams(String... streams) {
            return streams(List.of(streams));
        }

        public DataCollectionRuleDataSourcesPrometheusForwarderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.streams = Objects.requireNonNull($.streams, "expected parameter 'streams' to be non-null");
            return $;
        }
    }

}