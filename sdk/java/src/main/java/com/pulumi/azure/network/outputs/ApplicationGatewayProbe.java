// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.ApplicationGatewayProbeMatch;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayProbe {
    /**
     * @return The Hostname used for this Probe. If the Application Gateway is configured for a single site, by default the Host name should be specified as ‘127.0.0.1’, unless otherwise configured in custom probe. Cannot be set if `pick_host_name_from_backend_http_settings` is set to `true`.
     * 
     */
    private final @Nullable String host;
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private final @Nullable String id;
    /**
     * @return The Interval between two consecutive probes in seconds. Possible values range from 1 second to a maximum of 86,400 seconds.
     * 
     */
    private final Integer interval;
    /**
     * @return A `match` block as defined above.
     * 
     */
    private final @Nullable ApplicationGatewayProbeMatch match;
    /**
     * @return The minimum number of servers that are always marked as healthy. Defaults to `0`.
     * 
     */
    private final @Nullable Integer minimumServers;
    /**
     * @return The Name of the Probe.
     * 
     */
    private final String name;
    /**
     * @return The Path used for this Probe.
     * 
     */
    private final String path;
    /**
     * @return Whether the host header should be picked from the backend HTTP settings. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean pickHostNameFromBackendHttpSettings;
    /**
     * @return Custom port which will be used for probing the backend servers. The valid value ranges from 1 to 65535. In case not set, port from HTTP settings will be used. This property is valid for Standard_v2 and WAF_v2 only.
     * 
     */
    private final @Nullable Integer port;
    /**
     * @return The Protocol used for this Probe. Possible values are `Http` and `Https`.
     * 
     */
    private final String protocol;
    /**
     * @return The Timeout used for this Probe, which indicates when a probe becomes unhealthy. Possible values range from 1 second to a maximum of 86,400 seconds.
     * 
     */
    private final Integer timeout;
    /**
     * @return The Unhealthy Threshold for this Probe, which indicates the amount of retries which should be attempted before a node is deemed unhealthy. Possible values are from 1 - 20 seconds.
     * 
     */
    private final Integer unhealthyThreshold;

    @CustomType.Constructor
    private ApplicationGatewayProbe(
        @CustomType.Parameter("host") @Nullable String host,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("interval") Integer interval,
        @CustomType.Parameter("match") @Nullable ApplicationGatewayProbeMatch match,
        @CustomType.Parameter("minimumServers") @Nullable Integer minimumServers,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("pickHostNameFromBackendHttpSettings") @Nullable Boolean pickHostNameFromBackendHttpSettings,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("timeout") Integer timeout,
        @CustomType.Parameter("unhealthyThreshold") Integer unhealthyThreshold) {
        this.host = host;
        this.id = id;
        this.interval = interval;
        this.match = match;
        this.minimumServers = minimumServers;
        this.name = name;
        this.path = path;
        this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
        this.port = port;
        this.protocol = protocol;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * @return The Hostname used for this Probe. If the Application Gateway is configured for a single site, by default the Host name should be specified as ‘127.0.0.1’, unless otherwise configured in custom probe. Cannot be set if `pick_host_name_from_backend_http_settings` is set to `true`.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The Interval between two consecutive probes in seconds. Possible values range from 1 second to a maximum of 86,400 seconds.
     * 
     */
    public Integer interval() {
        return this.interval;
    }
    /**
     * @return A `match` block as defined above.
     * 
     */
    public Optional<ApplicationGatewayProbeMatch> match() {
        return Optional.ofNullable(this.match);
    }
    /**
     * @return The minimum number of servers that are always marked as healthy. Defaults to `0`.
     * 
     */
    public Optional<Integer> minimumServers() {
        return Optional.ofNullable(this.minimumServers);
    }
    /**
     * @return The Name of the Probe.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Path used for this Probe.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Whether the host header should be picked from the backend HTTP settings. Defaults to `false`.
     * 
     */
    public Optional<Boolean> pickHostNameFromBackendHttpSettings() {
        return Optional.ofNullable(this.pickHostNameFromBackendHttpSettings);
    }
    /**
     * @return Custom port which will be used for probing the backend servers. The valid value ranges from 1 to 65535. In case not set, port from HTTP settings will be used. This property is valid for Standard_v2 and WAF_v2 only.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The Protocol used for this Probe. Possible values are `Http` and `Https`.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The Timeout used for this Probe, which indicates when a probe becomes unhealthy. Possible values range from 1 second to a maximum of 86,400 seconds.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }
    /**
     * @return The Unhealthy Threshold for this Probe, which indicates the amount of retries which should be attempted before a node is deemed unhealthy. Possible values are from 1 - 20 seconds.
     * 
     */
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayProbe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String host;
        private @Nullable String id;
        private Integer interval;
        private @Nullable ApplicationGatewayProbeMatch match;
        private @Nullable Integer minimumServers;
        private String name;
        private String path;
        private @Nullable Boolean pickHostNameFromBackendHttpSettings;
        private @Nullable Integer port;
        private String protocol;
        private Integer timeout;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayProbe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.id = defaults.id;
    	      this.interval = defaults.interval;
    	      this.match = defaults.match;
    	      this.minimumServers = defaults.minimumServers;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.pickHostNameFromBackendHttpSettings = defaults.pickHostNameFromBackendHttpSettings;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder match(@Nullable ApplicationGatewayProbeMatch match) {
            this.match = match;
            return this;
        }
        public Builder minimumServers(@Nullable Integer minimumServers) {
            this.minimumServers = minimumServers;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder pickHostNameFromBackendHttpSettings(@Nullable Boolean pickHostNameFromBackendHttpSettings) {
            this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }        public ApplicationGatewayProbe build() {
            return new ApplicationGatewayProbe(host, id, interval, match, minimumServers, name, path, pickHostNameFromBackendHttpSettings, port, protocol, timeout, unhealthyThreshold);
        }
    }
}