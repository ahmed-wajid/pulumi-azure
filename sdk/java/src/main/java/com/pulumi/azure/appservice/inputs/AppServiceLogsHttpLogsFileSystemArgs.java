// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class AppServiceLogsHttpLogsFileSystemArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppServiceLogsHttpLogsFileSystemArgs Empty = new AppServiceLogsHttpLogsFileSystemArgs();

    /**
     * The number of days to retain logs for.
     * 
     */
    @Import(name="retentionInDays", required=true)
    private Output<Integer> retentionInDays;

    /**
     * @return The number of days to retain logs for.
     * 
     */
    public Output<Integer> retentionInDays() {
        return this.retentionInDays;
    }

    /**
     * The maximum size in megabytes that HTTP log files can use before being removed.
     * 
     */
    @Import(name="retentionInMb", required=true)
    private Output<Integer> retentionInMb;

    /**
     * @return The maximum size in megabytes that HTTP log files can use before being removed.
     * 
     */
    public Output<Integer> retentionInMb() {
        return this.retentionInMb;
    }

    private AppServiceLogsHttpLogsFileSystemArgs() {}

    private AppServiceLogsHttpLogsFileSystemArgs(AppServiceLogsHttpLogsFileSystemArgs $) {
        this.retentionInDays = $.retentionInDays;
        this.retentionInMb = $.retentionInMb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppServiceLogsHttpLogsFileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppServiceLogsHttpLogsFileSystemArgs $;

        public Builder() {
            $ = new AppServiceLogsHttpLogsFileSystemArgs();
        }

        public Builder(AppServiceLogsHttpLogsFileSystemArgs defaults) {
            $ = new AppServiceLogsHttpLogsFileSystemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param retentionInDays The number of days to retain logs for.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(Output<Integer> retentionInDays) {
            $.retentionInDays = retentionInDays;
            return this;
        }

        /**
         * @param retentionInDays The number of days to retain logs for.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(Integer retentionInDays) {
            return retentionInDays(Output.of(retentionInDays));
        }

        /**
         * @param retentionInMb The maximum size in megabytes that HTTP log files can use before being removed.
         * 
         * @return builder
         * 
         */
        public Builder retentionInMb(Output<Integer> retentionInMb) {
            $.retentionInMb = retentionInMb;
            return this;
        }

        /**
         * @param retentionInMb The maximum size in megabytes that HTTP log files can use before being removed.
         * 
         * @return builder
         * 
         */
        public Builder retentionInMb(Integer retentionInMb) {
            return retentionInMb(Output.of(retentionInMb));
        }

        public AppServiceLogsHttpLogsFileSystemArgs build() {
            $.retentionInDays = Objects.requireNonNull($.retentionInDays, "expected parameter 'retentionInDays' to be non-null");
            $.retentionInMb = Objects.requireNonNull($.retentionInMb, "expected parameter 'retentionInMb' to be non-null");
            return $;
        }
    }

}