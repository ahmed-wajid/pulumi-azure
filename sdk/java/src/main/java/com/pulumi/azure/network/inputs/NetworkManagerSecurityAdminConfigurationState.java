// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkManagerSecurityAdminConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkManagerSecurityAdminConfigurationState Empty = new NetworkManagerSecurityAdminConfigurationState();

    /**
     * A list of network intent policy based services. Possible values are `All`, `None` and `AllowRulesOnly`. Exactly one value should be set. The `All` option requires `Microsoft.Network/AllowAdminRulesOnNipBasedServices` feature registration to Subscription. Please see [this document](https://learn.microsoft.com/en-us/azure/virtual-network-manager/concept-security-admins#network-intent-policies-and-security-admin-rules) for more information.
     * 
     */
    @Import(name="applyOnNetworkIntentPolicyBasedServices")
    private @Nullable Output<String> applyOnNetworkIntentPolicyBasedServices;

    /**
     * @return A list of network intent policy based services. Possible values are `All`, `None` and `AllowRulesOnly`. Exactly one value should be set. The `All` option requires `Microsoft.Network/AllowAdminRulesOnNipBasedServices` feature registration to Subscription. Please see [this document](https://learn.microsoft.com/en-us/azure/virtual-network-manager/concept-security-admins#network-intent-policies-and-security-admin-rules) for more information.
     * 
     */
    public Optional<Output<String>> applyOnNetworkIntentPolicyBasedServices() {
        return Optional.ofNullable(this.applyOnNetworkIntentPolicyBasedServices);
    }

    /**
     * A description of the Security Admin Configuration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the Security Admin Configuration.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the name which should be used for this Network Manager Security Admin Configuration. Changing this forces a new Network Manager Security Admin Configuration to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Network Manager Security Admin Configuration. Changing this forces a new Network Manager Security Admin Configuration to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the ID of the Network Manager Security Admin Configuration. Changing this forces a new Network Manager Security Admin Configuration to be created.
     * 
     */
    @Import(name="networkManagerId")
    private @Nullable Output<String> networkManagerId;

    /**
     * @return Specifies the ID of the Network Manager Security Admin Configuration. Changing this forces a new Network Manager Security Admin Configuration to be created.
     * 
     */
    public Optional<Output<String>> networkManagerId() {
        return Optional.ofNullable(this.networkManagerId);
    }

    private NetworkManagerSecurityAdminConfigurationState() {}

    private NetworkManagerSecurityAdminConfigurationState(NetworkManagerSecurityAdminConfigurationState $) {
        this.applyOnNetworkIntentPolicyBasedServices = $.applyOnNetworkIntentPolicyBasedServices;
        this.description = $.description;
        this.name = $.name;
        this.networkManagerId = $.networkManagerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkManagerSecurityAdminConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkManagerSecurityAdminConfigurationState $;

        public Builder() {
            $ = new NetworkManagerSecurityAdminConfigurationState();
        }

        public Builder(NetworkManagerSecurityAdminConfigurationState defaults) {
            $ = new NetworkManagerSecurityAdminConfigurationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applyOnNetworkIntentPolicyBasedServices A list of network intent policy based services. Possible values are `All`, `None` and `AllowRulesOnly`. Exactly one value should be set. The `All` option requires `Microsoft.Network/AllowAdminRulesOnNipBasedServices` feature registration to Subscription. Please see [this document](https://learn.microsoft.com/en-us/azure/virtual-network-manager/concept-security-admins#network-intent-policies-and-security-admin-rules) for more information.
         * 
         * @return builder
         * 
         */
        public Builder applyOnNetworkIntentPolicyBasedServices(@Nullable Output<String> applyOnNetworkIntentPolicyBasedServices) {
            $.applyOnNetworkIntentPolicyBasedServices = applyOnNetworkIntentPolicyBasedServices;
            return this;
        }

        /**
         * @param applyOnNetworkIntentPolicyBasedServices A list of network intent policy based services. Possible values are `All`, `None` and `AllowRulesOnly`. Exactly one value should be set. The `All` option requires `Microsoft.Network/AllowAdminRulesOnNipBasedServices` feature registration to Subscription. Please see [this document](https://learn.microsoft.com/en-us/azure/virtual-network-manager/concept-security-admins#network-intent-policies-and-security-admin-rules) for more information.
         * 
         * @return builder
         * 
         */
        public Builder applyOnNetworkIntentPolicyBasedServices(String applyOnNetworkIntentPolicyBasedServices) {
            return applyOnNetworkIntentPolicyBasedServices(Output.of(applyOnNetworkIntentPolicyBasedServices));
        }

        /**
         * @param description A description of the Security Admin Configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the Security Admin Configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Specifies the name which should be used for this Network Manager Security Admin Configuration. Changing this forces a new Network Manager Security Admin Configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Network Manager Security Admin Configuration. Changing this forces a new Network Manager Security Admin Configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkManagerId Specifies the ID of the Network Manager Security Admin Configuration. Changing this forces a new Network Manager Security Admin Configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerId(@Nullable Output<String> networkManagerId) {
            $.networkManagerId = networkManagerId;
            return this;
        }

        /**
         * @param networkManagerId Specifies the ID of the Network Manager Security Admin Configuration. Changing this forces a new Network Manager Security Admin Configuration to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerId(String networkManagerId) {
            return networkManagerId(Output.of(networkManagerId));
        }

        public NetworkManagerSecurityAdminConfigurationState build() {
            return $;
        }
    }

}