// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyDns {
    /**
     * @return Whether to enable DNS proxy on Firewalls attached to this Firewall Policy? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean proxyEnabled;
    /**
     * @return A list of custom DNS servers&#39; IP addresses.
     * 
     */
    private final @Nullable List<String> servers;

    @CustomType.Constructor
    private FirewallPolicyDns(
        @CustomType.Parameter("proxyEnabled") @Nullable Boolean proxyEnabled,
        @CustomType.Parameter("servers") @Nullable List<String> servers) {
        this.proxyEnabled = proxyEnabled;
        this.servers = servers;
    }

    /**
     * @return Whether to enable DNS proxy on Firewalls attached to this Firewall Policy? Defaults to `false`.
     * 
     */
    public Optional<Boolean> proxyEnabled() {
        return Optional.ofNullable(this.proxyEnabled);
    }
    /**
     * @return A list of custom DNS servers&#39; IP addresses.
     * 
     */
    public List<String> servers() {
        return this.servers == null ? List.of() : this.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyDns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean proxyEnabled;
        private @Nullable List<String> servers;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyDns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.proxyEnabled = defaults.proxyEnabled;
    	      this.servers = defaults.servers;
        }

        public Builder proxyEnabled(@Nullable Boolean proxyEnabled) {
            this.proxyEnabled = proxyEnabled;
            return this;
        }
        public Builder servers(@Nullable List<String> servers) {
            this.servers = servers;
            return this;
        }
        public Builder servers(String... servers) {
            return servers(List.of(servers));
        }        public FirewallPolicyDns build() {
            return new FirewallPolicyDns(proxyEnabled, servers);
        }
    }
}