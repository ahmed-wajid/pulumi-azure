// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RunBookJobSchedule {
    private final @Nullable String jobScheduleId;
    private final @Nullable Map<String,String> parameters;
    private final @Nullable String runOn;
    private final String scheduleName;

    @CustomType.Constructor
    private RunBookJobSchedule(
        @CustomType.Parameter("jobScheduleId") @Nullable String jobScheduleId,
        @CustomType.Parameter("parameters") @Nullable Map<String,String> parameters,
        @CustomType.Parameter("runOn") @Nullable String runOn,
        @CustomType.Parameter("scheduleName") String scheduleName) {
        this.jobScheduleId = jobScheduleId;
        this.parameters = parameters;
        this.runOn = runOn;
        this.scheduleName = scheduleName;
    }

    public Optional<String> jobScheduleId() {
        return Optional.ofNullable(this.jobScheduleId);
    }
    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<String> runOn() {
        return Optional.ofNullable(this.runOn);
    }
    public String scheduleName() {
        return this.scheduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunBookJobSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String jobScheduleId;
        private @Nullable Map<String,String> parameters;
        private @Nullable String runOn;
        private String scheduleName;

        public Builder() {
    	      // Empty
        }

        public Builder(RunBookJobSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobScheduleId = defaults.jobScheduleId;
    	      this.parameters = defaults.parameters;
    	      this.runOn = defaults.runOn;
    	      this.scheduleName = defaults.scheduleName;
        }

        public Builder jobScheduleId(@Nullable String jobScheduleId) {
            this.jobScheduleId = jobScheduleId;
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder runOn(@Nullable String runOn) {
            this.runOn = runOn;
            return this;
        }
        public Builder scheduleName(String scheduleName) {
            this.scheduleName = Objects.requireNonNull(scheduleName);
            return this;
        }        public RunBookJobSchedule build() {
            return new RunBookJobSchedule(jobScheduleId, parameters, runOn, scheduleName);
        }
    }
}