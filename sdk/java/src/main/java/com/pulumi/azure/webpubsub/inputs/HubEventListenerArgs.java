// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.webpubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HubEventListenerArgs extends com.pulumi.resources.ResourceArgs {

    public static final HubEventListenerArgs Empty = new HubEventListenerArgs();

    /**
     * Specifies the event hub name to receive the events.
     * 
     */
    @Import(name="eventhubName", required=true)
    private Output<String> eventhubName;

    /**
     * @return Specifies the event hub name to receive the events.
     * 
     */
    public Output<String> eventhubName() {
        return this.eventhubName;
    }

    /**
     * Specifies the event hub namespace name to receive the events.
     * 
     */
    @Import(name="eventhubNamespaceName", required=true)
    private Output<String> eventhubNamespaceName;

    /**
     * @return Specifies the event hub namespace name to receive the events.
     * 
     */
    public Output<String> eventhubNamespaceName() {
        return this.eventhubNamespaceName;
    }

    /**
     * Specifies the list of system events. Supported values are `connected` and `disconnected`.
     * 
     */
    @Import(name="systemEventNameFilters")
    private @Nullable Output<List<String>> systemEventNameFilters;

    /**
     * @return Specifies the list of system events. Supported values are `connected` and `disconnected`.
     * 
     */
    public Optional<Output<List<String>>> systemEventNameFilters() {
        return Optional.ofNullable(this.systemEventNameFilters);
    }

    /**
     * Specifies the list of matching user event names. `[&#34;*&#34;]` can be used to match all events.
     * 
     */
    @Import(name="userEventNameFilters")
    private @Nullable Output<List<String>> userEventNameFilters;

    /**
     * @return Specifies the list of matching user event names. `[&#34;*&#34;]` can be used to match all events.
     * 
     */
    public Optional<Output<List<String>>> userEventNameFilters() {
        return Optional.ofNullable(this.userEventNameFilters);
    }

    private HubEventListenerArgs() {}

    private HubEventListenerArgs(HubEventListenerArgs $) {
        this.eventhubName = $.eventhubName;
        this.eventhubNamespaceName = $.eventhubNamespaceName;
        this.systemEventNameFilters = $.systemEventNameFilters;
        this.userEventNameFilters = $.userEventNameFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HubEventListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HubEventListenerArgs $;

        public Builder() {
            $ = new HubEventListenerArgs();
        }

        public Builder(HubEventListenerArgs defaults) {
            $ = new HubEventListenerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventhubName Specifies the event hub name to receive the events.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(Output<String> eventhubName) {
            $.eventhubName = eventhubName;
            return this;
        }

        /**
         * @param eventhubName Specifies the event hub name to receive the events.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(String eventhubName) {
            return eventhubName(Output.of(eventhubName));
        }

        /**
         * @param eventhubNamespaceName Specifies the event hub namespace name to receive the events.
         * 
         * @return builder
         * 
         */
        public Builder eventhubNamespaceName(Output<String> eventhubNamespaceName) {
            $.eventhubNamespaceName = eventhubNamespaceName;
            return this;
        }

        /**
         * @param eventhubNamespaceName Specifies the event hub namespace name to receive the events.
         * 
         * @return builder
         * 
         */
        public Builder eventhubNamespaceName(String eventhubNamespaceName) {
            return eventhubNamespaceName(Output.of(eventhubNamespaceName));
        }

        /**
         * @param systemEventNameFilters Specifies the list of system events. Supported values are `connected` and `disconnected`.
         * 
         * @return builder
         * 
         */
        public Builder systemEventNameFilters(@Nullable Output<List<String>> systemEventNameFilters) {
            $.systemEventNameFilters = systemEventNameFilters;
            return this;
        }

        /**
         * @param systemEventNameFilters Specifies the list of system events. Supported values are `connected` and `disconnected`.
         * 
         * @return builder
         * 
         */
        public Builder systemEventNameFilters(List<String> systemEventNameFilters) {
            return systemEventNameFilters(Output.of(systemEventNameFilters));
        }

        /**
         * @param systemEventNameFilters Specifies the list of system events. Supported values are `connected` and `disconnected`.
         * 
         * @return builder
         * 
         */
        public Builder systemEventNameFilters(String... systemEventNameFilters) {
            return systemEventNameFilters(List.of(systemEventNameFilters));
        }

        /**
         * @param userEventNameFilters Specifies the list of matching user event names. `[&#34;*&#34;]` can be used to match all events.
         * 
         * @return builder
         * 
         */
        public Builder userEventNameFilters(@Nullable Output<List<String>> userEventNameFilters) {
            $.userEventNameFilters = userEventNameFilters;
            return this;
        }

        /**
         * @param userEventNameFilters Specifies the list of matching user event names. `[&#34;*&#34;]` can be used to match all events.
         * 
         * @return builder
         * 
         */
        public Builder userEventNameFilters(List<String> userEventNameFilters) {
            return userEventNameFilters(Output.of(userEventNameFilters));
        }

        /**
         * @param userEventNameFilters Specifies the list of matching user event names. `[&#34;*&#34;]` can be used to match all events.
         * 
         * @return builder
         * 
         */
        public Builder userEventNameFilters(String... userEventNameFilters) {
            return userEventNameFilters(List.of(userEventNameFilters));
        }

        public HubEventListenerArgs build() {
            $.eventhubName = Objects.requireNonNull($.eventhubName, "expected parameter 'eventhubName' to be non-null");
            $.eventhubNamespaceName = Objects.requireNonNull($.eventhubNamespaceName, "expected parameter 'eventhubNamespaceName' to be non-null");
            return $;
        }
    }

}