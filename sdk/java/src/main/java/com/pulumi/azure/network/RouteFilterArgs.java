// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.network.inputs.RouteFilterRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteFilterArgs Empty = new RouteFilterArgs();

    /**
     * The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The Name which should be used for this Route Filter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name which should be used for this Route Filter.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A `rules` block as defined below.
     * 
     */
    @Import(name="rule")
    private @Nullable Output<RouteFilterRuleArgs> rule;

    /**
     * @return A `rules` block as defined below.
     * 
     */
    public Optional<Output<RouteFilterRuleArgs>> rule() {
        return Optional.ofNullable(this.rule);
    }

    /**
     * A mapping of tags which should be assigned to the Route Filter.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Route Filter.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private RouteFilterArgs() {}

    private RouteFilterArgs(RouteFilterArgs $) {
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.rule = $.rule;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteFilterArgs $;

        public Builder() {
            $ = new RouteFilterArgs();
        }

        public Builder(RouteFilterArgs defaults) {
            $ = new RouteFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The Name which should be used for this Route Filter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name which should be used for this Route Filter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param rule A `rules` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder rule(@Nullable Output<RouteFilterRuleArgs> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule A `rules` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder rule(RouteFilterRuleArgs rule) {
            return rule(Output.of(rule));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Route Filter.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Route Filter.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public RouteFilterArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}