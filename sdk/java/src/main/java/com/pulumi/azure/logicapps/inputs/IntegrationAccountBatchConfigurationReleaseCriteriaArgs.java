// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountBatchConfigurationReleaseCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountBatchConfigurationReleaseCriteriaArgs Empty = new IntegrationAccountBatchConfigurationReleaseCriteriaArgs();

    /**
     * The batch size in bytes for the Logic App Integration Batch Configuration.
     * 
     */
    @Import(name="batchSize")
    private @Nullable Output<Integer> batchSize;

    /**
     * @return The batch size in bytes for the Logic App Integration Batch Configuration.
     * 
     */
    public Optional<Output<Integer>> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }

    /**
     * The message count for the Logic App Integration Batch Configuration.
     * 
     */
    @Import(name="messageCount")
    private @Nullable Output<Integer> messageCount;

    /**
     * @return The message count for the Logic App Integration Batch Configuration.
     * 
     */
    public Optional<Output<Integer>> messageCount() {
        return Optional.ofNullable(this.messageCount);
    }

    /**
     * A `recurrence` block as documented below.
     * 
     */
    @Import(name="recurrence")
    private @Nullable Output<IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs> recurrence;

    /**
     * @return A `recurrence` block as documented below.
     * 
     */
    public Optional<Output<IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs>> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    private IntegrationAccountBatchConfigurationReleaseCriteriaArgs() {}

    private IntegrationAccountBatchConfigurationReleaseCriteriaArgs(IntegrationAccountBatchConfigurationReleaseCriteriaArgs $) {
        this.batchSize = $.batchSize;
        this.messageCount = $.messageCount;
        this.recurrence = $.recurrence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountBatchConfigurationReleaseCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountBatchConfigurationReleaseCriteriaArgs $;

        public Builder() {
            $ = new IntegrationAccountBatchConfigurationReleaseCriteriaArgs();
        }

        public Builder(IntegrationAccountBatchConfigurationReleaseCriteriaArgs defaults) {
            $ = new IntegrationAccountBatchConfigurationReleaseCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchSize The batch size in bytes for the Logic App Integration Batch Configuration.
         * 
         * @return builder
         * 
         */
        public Builder batchSize(@Nullable Output<Integer> batchSize) {
            $.batchSize = batchSize;
            return this;
        }

        /**
         * @param batchSize The batch size in bytes for the Logic App Integration Batch Configuration.
         * 
         * @return builder
         * 
         */
        public Builder batchSize(Integer batchSize) {
            return batchSize(Output.of(batchSize));
        }

        /**
         * @param messageCount The message count for the Logic App Integration Batch Configuration.
         * 
         * @return builder
         * 
         */
        public Builder messageCount(@Nullable Output<Integer> messageCount) {
            $.messageCount = messageCount;
            return this;
        }

        /**
         * @param messageCount The message count for the Logic App Integration Batch Configuration.
         * 
         * @return builder
         * 
         */
        public Builder messageCount(Integer messageCount) {
            return messageCount(Output.of(messageCount));
        }

        /**
         * @param recurrence A `recurrence` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(@Nullable Output<IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs> recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        /**
         * @param recurrence A `recurrence` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceArgs recurrence) {
            return recurrence(Output.of(recurrence));
        }

        public IntegrationAccountBatchConfigurationReleaseCriteriaArgs build() {
            return $;
        }
    }

}