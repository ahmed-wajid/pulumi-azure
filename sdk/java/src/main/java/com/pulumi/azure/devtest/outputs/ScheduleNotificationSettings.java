// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduleNotificationSettings {
    /**
     * @return The status of the notification. Possible values are `Enabled` and `Disabled`. Defaults to `Disabled`
     * 
     */
    private final @Nullable String status;
    /**
     * @return Time in minutes before event at which notification will be sent.
     * 
     */
    private final @Nullable Integer timeInMinutes;
    /**
     * @return The webhook URL to which the notification will be sent.
     * 
     */
    private final @Nullable String webhookUrl;

    @CustomType.Constructor
    private ScheduleNotificationSettings(
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("timeInMinutes") @Nullable Integer timeInMinutes,
        @CustomType.Parameter("webhookUrl") @Nullable String webhookUrl) {
        this.status = status;
        this.timeInMinutes = timeInMinutes;
        this.webhookUrl = webhookUrl;
    }

    /**
     * @return The status of the notification. Possible values are `Enabled` and `Disabled`. Defaults to `Disabled`
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Time in minutes before event at which notification will be sent.
     * 
     */
    public Optional<Integer> timeInMinutes() {
        return Optional.ofNullable(this.timeInMinutes);
    }
    /**
     * @return The webhook URL to which the notification will be sent.
     * 
     */
    public Optional<String> webhookUrl() {
        return Optional.ofNullable(this.webhookUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleNotificationSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String status;
        private @Nullable Integer timeInMinutes;
        private @Nullable String webhookUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleNotificationSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.timeInMinutes = defaults.timeInMinutes;
    	      this.webhookUrl = defaults.webhookUrl;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder timeInMinutes(@Nullable Integer timeInMinutes) {
            this.timeInMinutes = timeInMinutes;
            return this;
        }
        public Builder webhookUrl(@Nullable String webhookUrl) {
            this.webhookUrl = webhookUrl;
            return this;
        }        public ScheduleNotificationSettings build() {
            return new ScheduleNotificationSettings(status, timeInMinutes, webhookUrl);
        }
    }
}