// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseLongTermRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseLongTermRetentionPolicyArgs Empty = new DatabaseLongTermRetentionPolicyArgs();

    /**
     * The monthly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 120 months. e.g. `P1Y`, `P1M`, `P4W` or `P30D`.
     * 
     */
    @Import(name="monthlyRetention")
    private @Nullable Output<String> monthlyRetention;

    /**
     * @return The monthly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 120 months. e.g. `P1Y`, `P1M`, `P4W` or `P30D`.
     * 
     */
    public Optional<Output<String>> monthlyRetention() {
        return Optional.ofNullable(this.monthlyRetention);
    }

    /**
     * The week of year to take the yearly backup. Value has to be between `1` and `52`.
     * 
     */
    @Import(name="weekOfYear")
    private @Nullable Output<Integer> weekOfYear;

    /**
     * @return The week of year to take the yearly backup. Value has to be between `1` and `52`.
     * 
     */
    public Optional<Output<Integer>> weekOfYear() {
        return Optional.ofNullable(this.weekOfYear);
    }

    /**
     * The weekly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 520 weeks. e.g. `P1Y`, `P1M`, `P1W` or `P7D`.
     * 
     */
    @Import(name="weeklyRetention")
    private @Nullable Output<String> weeklyRetention;

    /**
     * @return The weekly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 520 weeks. e.g. `P1Y`, `P1M`, `P1W` or `P7D`.
     * 
     */
    public Optional<Output<String>> weeklyRetention() {
        return Optional.ofNullable(this.weeklyRetention);
    }

    /**
     * The yearly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 10 years. e.g. `P1Y`, `P12M`, `P52W` or `P365D`.
     * 
     */
    @Import(name="yearlyRetention")
    private @Nullable Output<String> yearlyRetention;

    /**
     * @return The yearly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 10 years. e.g. `P1Y`, `P12M`, `P52W` or `P365D`.
     * 
     */
    public Optional<Output<String>> yearlyRetention() {
        return Optional.ofNullable(this.yearlyRetention);
    }

    private DatabaseLongTermRetentionPolicyArgs() {}

    private DatabaseLongTermRetentionPolicyArgs(DatabaseLongTermRetentionPolicyArgs $) {
        this.monthlyRetention = $.monthlyRetention;
        this.weekOfYear = $.weekOfYear;
        this.weeklyRetention = $.weeklyRetention;
        this.yearlyRetention = $.yearlyRetention;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseLongTermRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseLongTermRetentionPolicyArgs $;

        public Builder() {
            $ = new DatabaseLongTermRetentionPolicyArgs();
        }

        public Builder(DatabaseLongTermRetentionPolicyArgs defaults) {
            $ = new DatabaseLongTermRetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param monthlyRetention The monthly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 120 months. e.g. `P1Y`, `P1M`, `P4W` or `P30D`.
         * 
         * @return builder
         * 
         */
        public Builder monthlyRetention(@Nullable Output<String> monthlyRetention) {
            $.monthlyRetention = monthlyRetention;
            return this;
        }

        /**
         * @param monthlyRetention The monthly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 120 months. e.g. `P1Y`, `P1M`, `P4W` or `P30D`.
         * 
         * @return builder
         * 
         */
        public Builder monthlyRetention(String monthlyRetention) {
            return monthlyRetention(Output.of(monthlyRetention));
        }

        /**
         * @param weekOfYear The week of year to take the yearly backup. Value has to be between `1` and `52`.
         * 
         * @return builder
         * 
         */
        public Builder weekOfYear(@Nullable Output<Integer> weekOfYear) {
            $.weekOfYear = weekOfYear;
            return this;
        }

        /**
         * @param weekOfYear The week of year to take the yearly backup. Value has to be between `1` and `52`.
         * 
         * @return builder
         * 
         */
        public Builder weekOfYear(Integer weekOfYear) {
            return weekOfYear(Output.of(weekOfYear));
        }

        /**
         * @param weeklyRetention The weekly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 520 weeks. e.g. `P1Y`, `P1M`, `P1W` or `P7D`.
         * 
         * @return builder
         * 
         */
        public Builder weeklyRetention(@Nullable Output<String> weeklyRetention) {
            $.weeklyRetention = weeklyRetention;
            return this;
        }

        /**
         * @param weeklyRetention The weekly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 520 weeks. e.g. `P1Y`, `P1M`, `P1W` or `P7D`.
         * 
         * @return builder
         * 
         */
        public Builder weeklyRetention(String weeklyRetention) {
            return weeklyRetention(Output.of(weeklyRetention));
        }

        /**
         * @param yearlyRetention The yearly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 10 years. e.g. `P1Y`, `P12M`, `P52W` or `P365D`.
         * 
         * @return builder
         * 
         */
        public Builder yearlyRetention(@Nullable Output<String> yearlyRetention) {
            $.yearlyRetention = yearlyRetention;
            return this;
        }

        /**
         * @param yearlyRetention The yearly retention policy for an LTR backup in an ISO 8601 format. Valid value is between 1 to 10 years. e.g. `P1Y`, `P12M`, `P52W` or `P365D`.
         * 
         * @return builder
         * 
         */
        public Builder yearlyRetention(String yearlyRetention) {
            return yearlyRetention(Output.of(yearlyRetention));
        }

        public DatabaseLongTermRetentionPolicyArgs build() {
            return $;
        }
    }

}