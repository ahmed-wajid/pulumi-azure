// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IotHubDpsIpFilterRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final IotHubDpsIpFilterRuleArgs Empty = new IotHubDpsIpFilterRuleArgs();

    /**
     * The desired action for requests captured by this rule. Possible values are  `Accept`, `Reject`
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The desired action for requests captured by this rule. Possible values are  `Accept`, `Reject`
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The IP address range in CIDR notation for the rule.
     * 
     */
    @Import(name="ipMask", required=true)
    private Output<String> ipMask;

    /**
     * @return The IP address range in CIDR notation for the rule.
     * 
     */
    public Output<String> ipMask() {
        return this.ipMask;
    }

    /**
     * The name of the filter.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the filter.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Target for requests captured by this rule. Possible values are `All`, `DeviceApi` and `ServiceApi`.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return Target for requests captured by this rule. Possible values are `All`, `DeviceApi` and `ServiceApi`.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    private IotHubDpsIpFilterRuleArgs() {}

    private IotHubDpsIpFilterRuleArgs(IotHubDpsIpFilterRuleArgs $) {
        this.action = $.action;
        this.ipMask = $.ipMask;
        this.name = $.name;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotHubDpsIpFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotHubDpsIpFilterRuleArgs $;

        public Builder() {
            $ = new IotHubDpsIpFilterRuleArgs();
        }

        public Builder(IotHubDpsIpFilterRuleArgs defaults) {
            $ = new IotHubDpsIpFilterRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The desired action for requests captured by this rule. Possible values are  `Accept`, `Reject`
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The desired action for requests captured by this rule. Possible values are  `Accept`, `Reject`
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param ipMask The IP address range in CIDR notation for the rule.
         * 
         * @return builder
         * 
         */
        public Builder ipMask(Output<String> ipMask) {
            $.ipMask = ipMask;
            return this;
        }

        /**
         * @param ipMask The IP address range in CIDR notation for the rule.
         * 
         * @return builder
         * 
         */
        public Builder ipMask(String ipMask) {
            return ipMask(Output.of(ipMask));
        }

        /**
         * @param name The name of the filter.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the filter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param target Target for requests captured by this rule. Possible values are `All`, `DeviceApi` and `ServiceApi`.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Target for requests captured by this rule. Possible values are `All`, `DeviceApi` and `ServiceApi`.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        public IotHubDpsIpFilterRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.ipMask = Objects.requireNonNull($.ipMask, "expected parameter 'ipMask' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}