// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.azure.eventhub.outputs.EventHubCaptureDescriptionDestination;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventHubCaptureDescription {
    /**
     * @return A `destination` block as defined below.
     * 
     */
    private final EventHubCaptureDescriptionDestination destination;
    /**
     * @return Specifies if the Capture Description is Enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * @return Specifies the Encoding used for the Capture Description. Possible values are `Avro` and `AvroDeflate`.
     * 
     */
    private final String encoding;
    /**
     * @return Specifies the time interval in seconds at which the capture will happen. Values can be between `60` and `900` seconds. Defaults to `300` seconds.
     * 
     */
    private final @Nullable Integer intervalInSeconds;
    /**
     * @return Specifies the amount of data built up in your EventHub before a Capture Operation occurs. Value should be between `10485760` and `524288000`  bytes. Defaults to `314572800` bytes.
     * 
     */
    private final @Nullable Integer sizeLimitInBytes;
    /**
     * @return Specifies if empty files should not be emitted if no events occur during the Capture time window.  Defaults to `false`.
     * 
     */
    private final @Nullable Boolean skipEmptyArchives;

    @CustomType.Constructor
    private EventHubCaptureDescription(
        @CustomType.Parameter("destination") EventHubCaptureDescriptionDestination destination,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("encoding") String encoding,
        @CustomType.Parameter("intervalInSeconds") @Nullable Integer intervalInSeconds,
        @CustomType.Parameter("sizeLimitInBytes") @Nullable Integer sizeLimitInBytes,
        @CustomType.Parameter("skipEmptyArchives") @Nullable Boolean skipEmptyArchives) {
        this.destination = destination;
        this.enabled = enabled;
        this.encoding = encoding;
        this.intervalInSeconds = intervalInSeconds;
        this.sizeLimitInBytes = sizeLimitInBytes;
        this.skipEmptyArchives = skipEmptyArchives;
    }

    /**
     * @return A `destination` block as defined below.
     * 
     */
    public EventHubCaptureDescriptionDestination destination() {
        return this.destination;
    }
    /**
     * @return Specifies if the Capture Description is Enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Specifies the Encoding used for the Capture Description. Possible values are `Avro` and `AvroDeflate`.
     * 
     */
    public String encoding() {
        return this.encoding;
    }
    /**
     * @return Specifies the time interval in seconds at which the capture will happen. Values can be between `60` and `900` seconds. Defaults to `300` seconds.
     * 
     */
    public Optional<Integer> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }
    /**
     * @return Specifies the amount of data built up in your EventHub before a Capture Operation occurs. Value should be between `10485760` and `524288000`  bytes. Defaults to `314572800` bytes.
     * 
     */
    public Optional<Integer> sizeLimitInBytes() {
        return Optional.ofNullable(this.sizeLimitInBytes);
    }
    /**
     * @return Specifies if empty files should not be emitted if no events occur during the Capture time window.  Defaults to `false`.
     * 
     */
    public Optional<Boolean> skipEmptyArchives() {
        return Optional.ofNullable(this.skipEmptyArchives);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubCaptureDescription defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventHubCaptureDescriptionDestination destination;
        private Boolean enabled;
        private String encoding;
        private @Nullable Integer intervalInSeconds;
        private @Nullable Integer sizeLimitInBytes;
        private @Nullable Boolean skipEmptyArchives;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubCaptureDescription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
    	      this.encoding = defaults.encoding;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.sizeLimitInBytes = defaults.sizeLimitInBytes;
    	      this.skipEmptyArchives = defaults.skipEmptyArchives;
        }

        public Builder destination(EventHubCaptureDescriptionDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }
        public Builder intervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }
        public Builder sizeLimitInBytes(@Nullable Integer sizeLimitInBytes) {
            this.sizeLimitInBytes = sizeLimitInBytes;
            return this;
        }
        public Builder skipEmptyArchives(@Nullable Boolean skipEmptyArchives) {
            this.skipEmptyArchives = skipEmptyArchives;
            return this;
        }        public EventHubCaptureDescription build() {
            return new EventHubCaptureDescription(destination, enabled, encoding, intervalInSeconds, sizeLimitInBytes, skipEmptyArchives);
        }
    }
}