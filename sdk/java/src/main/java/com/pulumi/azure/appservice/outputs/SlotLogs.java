// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.SlotLogsApplicationLogs;
import com.pulumi.azure.appservice.outputs.SlotLogsHttpLogs;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SlotLogs {
    /**
     * @return An `application_logs` block as defined below.
     * 
     */
    private final @Nullable SlotLogsApplicationLogs applicationLogs;
    /**
     * @return Should `Detailed error messages` be enabled on this App Service slot? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean detailedErrorMessagesEnabled;
    /**
     * @return Should `Failed request tracing` be enabled on this App Service slot? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean failedRequestTracingEnabled;
    /**
     * @return An `http_logs` block as defined below.
     * 
     */
    private final @Nullable SlotLogsHttpLogs httpLogs;

    @CustomType.Constructor
    private SlotLogs(
        @CustomType.Parameter("applicationLogs") @Nullable SlotLogsApplicationLogs applicationLogs,
        @CustomType.Parameter("detailedErrorMessagesEnabled") @Nullable Boolean detailedErrorMessagesEnabled,
        @CustomType.Parameter("failedRequestTracingEnabled") @Nullable Boolean failedRequestTracingEnabled,
        @CustomType.Parameter("httpLogs") @Nullable SlotLogsHttpLogs httpLogs) {
        this.applicationLogs = applicationLogs;
        this.detailedErrorMessagesEnabled = detailedErrorMessagesEnabled;
        this.failedRequestTracingEnabled = failedRequestTracingEnabled;
        this.httpLogs = httpLogs;
    }

    /**
     * @return An `application_logs` block as defined below.
     * 
     */
    public Optional<SlotLogsApplicationLogs> applicationLogs() {
        return Optional.ofNullable(this.applicationLogs);
    }
    /**
     * @return Should `Detailed error messages` be enabled on this App Service slot? Defaults to `false`.
     * 
     */
    public Optional<Boolean> detailedErrorMessagesEnabled() {
        return Optional.ofNullable(this.detailedErrorMessagesEnabled);
    }
    /**
     * @return Should `Failed request tracing` be enabled on this App Service slot? Defaults to `false`.
     * 
     */
    public Optional<Boolean> failedRequestTracingEnabled() {
        return Optional.ofNullable(this.failedRequestTracingEnabled);
    }
    /**
     * @return An `http_logs` block as defined below.
     * 
     */
    public Optional<SlotLogsHttpLogs> httpLogs() {
        return Optional.ofNullable(this.httpLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlotLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SlotLogsApplicationLogs applicationLogs;
        private @Nullable Boolean detailedErrorMessagesEnabled;
        private @Nullable Boolean failedRequestTracingEnabled;
        private @Nullable SlotLogsHttpLogs httpLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(SlotLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationLogs = defaults.applicationLogs;
    	      this.detailedErrorMessagesEnabled = defaults.detailedErrorMessagesEnabled;
    	      this.failedRequestTracingEnabled = defaults.failedRequestTracingEnabled;
    	      this.httpLogs = defaults.httpLogs;
        }

        public Builder applicationLogs(@Nullable SlotLogsApplicationLogs applicationLogs) {
            this.applicationLogs = applicationLogs;
            return this;
        }
        public Builder detailedErrorMessagesEnabled(@Nullable Boolean detailedErrorMessagesEnabled) {
            this.detailedErrorMessagesEnabled = detailedErrorMessagesEnabled;
            return this;
        }
        public Builder failedRequestTracingEnabled(@Nullable Boolean failedRequestTracingEnabled) {
            this.failedRequestTracingEnabled = failedRequestTracingEnabled;
            return this;
        }
        public Builder httpLogs(@Nullable SlotLogsHttpLogs httpLogs) {
            this.httpLogs = httpLogs;
            return this;
        }        public SlotLogs build() {
            return new SlotLogs(applicationLogs, detailedErrorMessagesEnabled, failedRequestTracingEnabled, httpLogs);
        }
    }
}