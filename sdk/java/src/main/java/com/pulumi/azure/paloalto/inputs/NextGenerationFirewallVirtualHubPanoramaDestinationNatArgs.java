// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.inputs;

import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs;
import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs extends com.pulumi.resources.ResourceArgs {

    public static final NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs Empty = new NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs();

    @Import(name="backendConfig")
    private @Nullable Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs> backendConfig;

    public Optional<Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs>> backendConfig() {
        return Optional.ofNullable(this.backendConfig);
    }

    @Import(name="frontendConfig")
    private @Nullable Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs> frontendConfig;

    public Optional<Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs>> frontendConfig() {
        return Optional.ofNullable(this.frontendConfig);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="protocol", required=true)
    private Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol;
    }

    private NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs() {}

    private NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs(NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs $) {
        this.backendConfig = $.backendConfig;
        this.frontendConfig = $.frontendConfig;
        this.name = $.name;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs $;

        public Builder() {
            $ = new NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs();
        }

        public Builder(NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs defaults) {
            $ = new NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendConfig(@Nullable Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs> backendConfig) {
            $.backendConfig = backendConfig;
            return this;
        }

        public Builder backendConfig(NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs backendConfig) {
            return backendConfig(Output.of(backendConfig));
        }

        public Builder frontendConfig(@Nullable Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs> frontendConfig) {
            $.frontendConfig = frontendConfig;
            return this;
        }

        public Builder frontendConfig(NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs frontendConfig) {
            return frontendConfig(Output.of(frontendConfig));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}