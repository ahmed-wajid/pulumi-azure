// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * The ending IP address to allow through the firewall for this rule.
     * 
     */
    @Import(name="endIpAddress", required=true)
    private Output<String> endIpAddress;

    /**
     * @return The ending IP address to allow through the firewall for this rule.
     * 
     */
    public Output<String> endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * The Name of the firewall rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name of the firewall rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The starting IP address to allow through the firewall for this rule.
     * 
     */
    @Import(name="startIpAddress", required=true)
    private Output<String> startIpAddress;

    /**
     * @return The starting IP address to allow through the firewall for this rule.
     * 
     */
    public Output<String> startIpAddress() {
        return this.startIpAddress;
    }

    /**
     * The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="synapseWorkspaceId", required=true)
    private Output<String> synapseWorkspaceId;

    /**
     * @return The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> synapseWorkspaceId() {
        return this.synapseWorkspaceId;
    }

    private FirewallRuleArgs() {}

    private FirewallRuleArgs(FirewallRuleArgs $) {
        this.endIpAddress = $.endIpAddress;
        this.name = $.name;
        this.startIpAddress = $.startIpAddress;
        this.synapseWorkspaceId = $.synapseWorkspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRuleArgs $;

        public Builder() {
            $ = new FirewallRuleArgs();
        }

        public Builder(FirewallRuleArgs defaults) {
            $ = new FirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endIpAddress The ending IP address to allow through the firewall for this rule.
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(Output<String> endIpAddress) {
            $.endIpAddress = endIpAddress;
            return this;
        }

        /**
         * @param endIpAddress The ending IP address to allow through the firewall for this rule.
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(String endIpAddress) {
            return endIpAddress(Output.of(endIpAddress));
        }

        /**
         * @param name The Name of the firewall rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name of the firewall rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param startIpAddress The starting IP address to allow through the firewall for this rule.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(Output<String> startIpAddress) {
            $.startIpAddress = startIpAddress;
            return this;
        }

        /**
         * @param startIpAddress The starting IP address to allow through the firewall for this rule.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(String startIpAddress) {
            return startIpAddress(Output.of(startIpAddress));
        }

        /**
         * @param synapseWorkspaceId The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(Output<String> synapseWorkspaceId) {
            $.synapseWorkspaceId = synapseWorkspaceId;
            return this;
        }

        /**
         * @param synapseWorkspaceId The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(String synapseWorkspaceId) {
            return synapseWorkspaceId(Output.of(synapseWorkspaceId));
        }

        public FirewallRuleArgs build() {
            $.endIpAddress = Objects.requireNonNull($.endIpAddress, "expected parameter 'endIpAddress' to be non-null");
            $.startIpAddress = Objects.requireNonNull($.startIpAddress, "expected parameter 'startIpAddress' to be non-null");
            $.synapseWorkspaceId = Objects.requireNonNull($.synapseWorkspaceId, "expected parameter 'synapseWorkspaceId' to be non-null");
            return $;
        }
    }

}