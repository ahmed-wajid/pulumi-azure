// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.ApplicationGatewayHttpListenerCustomErrorConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayHttpListenerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayHttpListenerArgs Empty = new ApplicationGatewayHttpListenerArgs();

    /**
     * One or more `custom_error_configuration` blocks as defined below.
     * 
     */
    @Import(name="customErrorConfigurations")
    private @Nullable Output<List<ApplicationGatewayHttpListenerCustomErrorConfigurationArgs>> customErrorConfigurations;

    /**
     * @return One or more `custom_error_configuration` blocks as defined below.
     * 
     */
    public Optional<Output<List<ApplicationGatewayHttpListenerCustomErrorConfigurationArgs>>> customErrorConfigurations() {
        return Optional.ofNullable(this.customErrorConfigurations);
    }

    /**
     * The ID of the Web Application Firewall Policy which should be used for this HTTP Listener.
     * 
     */
    @Import(name="firewallPolicyId")
    private @Nullable Output<String> firewallPolicyId;

    /**
     * @return The ID of the Web Application Firewall Policy which should be used for this HTTP Listener.
     * 
     */
    public Optional<Output<String>> firewallPolicyId() {
        return Optional.ofNullable(this.firewallPolicyId);
    }

    /**
     * The ID of the associated Frontend Configuration.
     * 
     */
    @Import(name="frontendIpConfigurationId")
    private @Nullable Output<String> frontendIpConfigurationId;

    /**
     * @return The ID of the associated Frontend Configuration.
     * 
     */
    public Optional<Output<String>> frontendIpConfigurationId() {
        return Optional.ofNullable(this.frontendIpConfigurationId);
    }

    /**
     * The Name of the Frontend IP Configuration used for this HTTP Listener.
     * 
     */
    @Import(name="frontendIpConfigurationName", required=true)
    private Output<String> frontendIpConfigurationName;

    /**
     * @return The Name of the Frontend IP Configuration used for this HTTP Listener.
     * 
     */
    public Output<String> frontendIpConfigurationName() {
        return this.frontendIpConfigurationName;
    }

    /**
     * The ID of the associated Frontend Port.
     * 
     */
    @Import(name="frontendPortId")
    private @Nullable Output<String> frontendPortId;

    /**
     * @return The ID of the associated Frontend Port.
     * 
     */
    public Optional<Output<String>> frontendPortId() {
        return Optional.ofNullable(this.frontendPortId);
    }

    /**
     * The Name of the Frontend Port use for this HTTP Listener.
     * 
     */
    @Import(name="frontendPortName", required=true)
    private Output<String> frontendPortName;

    /**
     * @return The Name of the Frontend Port use for this HTTP Listener.
     * 
     */
    public Output<String> frontendPortName() {
        return this.frontendPortName;
    }

    /**
     * The Hostname which should be used for this HTTP Listener. Setting this value changes Listener Type to &#39;Multi site&#39;.
     * 
     */
    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    /**
     * @return The Hostname which should be used for this HTTP Listener. Setting this value changes Listener Type to &#39;Multi site&#39;.
     * 
     */
    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * A list of Hostname(s) should be used for this HTTP Listener. It allows special wildcard characters.
     * 
     */
    @Import(name="hostNames")
    private @Nullable Output<List<String>> hostNames;

    /**
     * @return A list of Hostname(s) should be used for this HTTP Listener. It allows special wildcard characters.
     * 
     */
    public Optional<Output<List<String>>> hostNames() {
        return Optional.ofNullable(this.hostNames);
    }

    /**
     * The ID of the Rewrite Rule Set
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The Name of the HTTP Listener.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Name of the HTTP Listener.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Protocol to use for this HTTP Listener. Possible values are `Http` and `Https`.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The Protocol to use for this HTTP Listener. Possible values are `Http` and `Https`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * Should Server Name Indication be Required? Defaults to `false`.
     * 
     */
    @Import(name="requireSni")
    private @Nullable Output<Boolean> requireSni;

    /**
     * @return Should Server Name Indication be Required? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> requireSni() {
        return Optional.ofNullable(this.requireSni);
    }

    /**
     * The ID of the associated SSL Certificate.
     * 
     */
    @Import(name="sslCertificateId")
    private @Nullable Output<String> sslCertificateId;

    /**
     * @return The ID of the associated SSL Certificate.
     * 
     */
    public Optional<Output<String>> sslCertificateId() {
        return Optional.ofNullable(this.sslCertificateId);
    }

    /**
     * The name of the associated SSL Certificate which should be used for this HTTP Listener.
     * 
     */
    @Import(name="sslCertificateName")
    private @Nullable Output<String> sslCertificateName;

    /**
     * @return The name of the associated SSL Certificate which should be used for this HTTP Listener.
     * 
     */
    public Optional<Output<String>> sslCertificateName() {
        return Optional.ofNullable(this.sslCertificateName);
    }

    /**
     * The ID of the associated SSL Certificate.
     * 
     */
    @Import(name="sslProfileId")
    private @Nullable Output<String> sslProfileId;

    /**
     * @return The ID of the associated SSL Certificate.
     * 
     */
    public Optional<Output<String>> sslProfileId() {
        return Optional.ofNullable(this.sslProfileId);
    }

    /**
     * The name of the associated SSL Profile which should be used for this HTTP Listener.
     * 
     */
    @Import(name="sslProfileName")
    private @Nullable Output<String> sslProfileName;

    /**
     * @return The name of the associated SSL Profile which should be used for this HTTP Listener.
     * 
     */
    public Optional<Output<String>> sslProfileName() {
        return Optional.ofNullable(this.sslProfileName);
    }

    private ApplicationGatewayHttpListenerArgs() {}

    private ApplicationGatewayHttpListenerArgs(ApplicationGatewayHttpListenerArgs $) {
        this.customErrorConfigurations = $.customErrorConfigurations;
        this.firewallPolicyId = $.firewallPolicyId;
        this.frontendIpConfigurationId = $.frontendIpConfigurationId;
        this.frontendIpConfigurationName = $.frontendIpConfigurationName;
        this.frontendPortId = $.frontendPortId;
        this.frontendPortName = $.frontendPortName;
        this.hostName = $.hostName;
        this.hostNames = $.hostNames;
        this.id = $.id;
        this.name = $.name;
        this.protocol = $.protocol;
        this.requireSni = $.requireSni;
        this.sslCertificateId = $.sslCertificateId;
        this.sslCertificateName = $.sslCertificateName;
        this.sslProfileId = $.sslProfileId;
        this.sslProfileName = $.sslProfileName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayHttpListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayHttpListenerArgs $;

        public Builder() {
            $ = new ApplicationGatewayHttpListenerArgs();
        }

        public Builder(ApplicationGatewayHttpListenerArgs defaults) {
            $ = new ApplicationGatewayHttpListenerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customErrorConfigurations One or more `custom_error_configuration` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customErrorConfigurations(@Nullable Output<List<ApplicationGatewayHttpListenerCustomErrorConfigurationArgs>> customErrorConfigurations) {
            $.customErrorConfigurations = customErrorConfigurations;
            return this;
        }

        /**
         * @param customErrorConfigurations One or more `custom_error_configuration` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customErrorConfigurations(List<ApplicationGatewayHttpListenerCustomErrorConfigurationArgs> customErrorConfigurations) {
            return customErrorConfigurations(Output.of(customErrorConfigurations));
        }

        /**
         * @param customErrorConfigurations One or more `custom_error_configuration` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customErrorConfigurations(ApplicationGatewayHttpListenerCustomErrorConfigurationArgs... customErrorConfigurations) {
            return customErrorConfigurations(List.of(customErrorConfigurations));
        }

        /**
         * @param firewallPolicyId The ID of the Web Application Firewall Policy which should be used for this HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyId(@Nullable Output<String> firewallPolicyId) {
            $.firewallPolicyId = firewallPolicyId;
            return this;
        }

        /**
         * @param firewallPolicyId The ID of the Web Application Firewall Policy which should be used for this HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyId(String firewallPolicyId) {
            return firewallPolicyId(Output.of(firewallPolicyId));
        }

        /**
         * @param frontendIpConfigurationId The ID of the associated Frontend Configuration.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurationId(@Nullable Output<String> frontendIpConfigurationId) {
            $.frontendIpConfigurationId = frontendIpConfigurationId;
            return this;
        }

        /**
         * @param frontendIpConfigurationId The ID of the associated Frontend Configuration.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurationId(String frontendIpConfigurationId) {
            return frontendIpConfigurationId(Output.of(frontendIpConfigurationId));
        }

        /**
         * @param frontendIpConfigurationName The Name of the Frontend IP Configuration used for this HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurationName(Output<String> frontendIpConfigurationName) {
            $.frontendIpConfigurationName = frontendIpConfigurationName;
            return this;
        }

        /**
         * @param frontendIpConfigurationName The Name of the Frontend IP Configuration used for this HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurationName(String frontendIpConfigurationName) {
            return frontendIpConfigurationName(Output.of(frontendIpConfigurationName));
        }

        /**
         * @param frontendPortId The ID of the associated Frontend Port.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortId(@Nullable Output<String> frontendPortId) {
            $.frontendPortId = frontendPortId;
            return this;
        }

        /**
         * @param frontendPortId The ID of the associated Frontend Port.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortId(String frontendPortId) {
            return frontendPortId(Output.of(frontendPortId));
        }

        /**
         * @param frontendPortName The Name of the Frontend Port use for this HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortName(Output<String> frontendPortName) {
            $.frontendPortName = frontendPortName;
            return this;
        }

        /**
         * @param frontendPortName The Name of the Frontend Port use for this HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortName(String frontendPortName) {
            return frontendPortName(Output.of(frontendPortName));
        }

        /**
         * @param hostName The Hostname which should be used for this HTTP Listener. Setting this value changes Listener Type to &#39;Multi site&#39;.
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName The Hostname which should be used for this HTTP Listener. Setting this value changes Listener Type to &#39;Multi site&#39;.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param hostNames A list of Hostname(s) should be used for this HTTP Listener. It allows special wildcard characters.
         * 
         * @return builder
         * 
         */
        public Builder hostNames(@Nullable Output<List<String>> hostNames) {
            $.hostNames = hostNames;
            return this;
        }

        /**
         * @param hostNames A list of Hostname(s) should be used for this HTTP Listener. It allows special wildcard characters.
         * 
         * @return builder
         * 
         */
        public Builder hostNames(List<String> hostNames) {
            return hostNames(Output.of(hostNames));
        }

        /**
         * @param hostNames A list of Hostname(s) should be used for this HTTP Listener. It allows special wildcard characters.
         * 
         * @return builder
         * 
         */
        public Builder hostNames(String... hostNames) {
            return hostNames(List.of(hostNames));
        }

        /**
         * @param id The ID of the Rewrite Rule Set
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Rewrite Rule Set
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The Name of the HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name of the HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocol The Protocol to use for this HTTP Listener. Possible values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The Protocol to use for this HTTP Listener. Possible values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param requireSni Should Server Name Indication be Required? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireSni(@Nullable Output<Boolean> requireSni) {
            $.requireSni = requireSni;
            return this;
        }

        /**
         * @param requireSni Should Server Name Indication be Required? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireSni(Boolean requireSni) {
            return requireSni(Output.of(requireSni));
        }

        /**
         * @param sslCertificateId The ID of the associated SSL Certificate.
         * 
         * @return builder
         * 
         */
        public Builder sslCertificateId(@Nullable Output<String> sslCertificateId) {
            $.sslCertificateId = sslCertificateId;
            return this;
        }

        /**
         * @param sslCertificateId The ID of the associated SSL Certificate.
         * 
         * @return builder
         * 
         */
        public Builder sslCertificateId(String sslCertificateId) {
            return sslCertificateId(Output.of(sslCertificateId));
        }

        /**
         * @param sslCertificateName The name of the associated SSL Certificate which should be used for this HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder sslCertificateName(@Nullable Output<String> sslCertificateName) {
            $.sslCertificateName = sslCertificateName;
            return this;
        }

        /**
         * @param sslCertificateName The name of the associated SSL Certificate which should be used for this HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder sslCertificateName(String sslCertificateName) {
            return sslCertificateName(Output.of(sslCertificateName));
        }

        /**
         * @param sslProfileId The ID of the associated SSL Certificate.
         * 
         * @return builder
         * 
         */
        public Builder sslProfileId(@Nullable Output<String> sslProfileId) {
            $.sslProfileId = sslProfileId;
            return this;
        }

        /**
         * @param sslProfileId The ID of the associated SSL Certificate.
         * 
         * @return builder
         * 
         */
        public Builder sslProfileId(String sslProfileId) {
            return sslProfileId(Output.of(sslProfileId));
        }

        /**
         * @param sslProfileName The name of the associated SSL Profile which should be used for this HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder sslProfileName(@Nullable Output<String> sslProfileName) {
            $.sslProfileName = sslProfileName;
            return this;
        }

        /**
         * @param sslProfileName The name of the associated SSL Profile which should be used for this HTTP Listener.
         * 
         * @return builder
         * 
         */
        public Builder sslProfileName(String sslProfileName) {
            return sslProfileName(Output.of(sslProfileName));
        }

        public ApplicationGatewayHttpListenerArgs build() {
            $.frontendIpConfigurationName = Objects.requireNonNull($.frontendIpConfigurationName, "expected parameter 'frontendIpConfigurationName' to be non-null");
            $.frontendPortName = Objects.requireNonNull($.frontendPortName, "expected parameter 'frontendPortName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}