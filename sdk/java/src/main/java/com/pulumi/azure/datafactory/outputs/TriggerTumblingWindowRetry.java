// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerTumblingWindowRetry {
    /**
     * @return The maximum retry attempts if the pipeline run failed.
     * 
     */
    private final Integer count;
    /**
     * @return The Interval in seconds between each retry if the pipeline run failed.
     * 
     */
    private final @Nullable Integer interval;

    @CustomType.Constructor
    private TriggerTumblingWindowRetry(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("interval") @Nullable Integer interval) {
        this.count = count;
        this.interval = interval;
    }

    /**
     * @return The maximum retry attempts if the pipeline run failed.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The Interval in seconds between each retry if the pipeline run failed.
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerTumblingWindowRetry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private @Nullable Integer interval;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerTumblingWindowRetry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.interval = defaults.interval;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }        public TriggerTumblingWindowRetry build() {
            return new TriggerTumblingWindowRetry(count, interval);
        }
    }
}