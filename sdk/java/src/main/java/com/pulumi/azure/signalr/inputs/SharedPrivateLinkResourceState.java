// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.signalr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedPrivateLinkResourceState extends com.pulumi.resources.ResourceArgs {

    public static final SharedPrivateLinkResourceState Empty = new SharedPrivateLinkResourceState();

    /**
     * The name of the Signalr Shared Private Link Resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Signalr Shared Private Link Resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The request message for requesting approval of the Shared Private Link Enabled Remote Resource.
     * 
     */
    @Import(name="requestMessage")
    private @Nullable Output<String> requestMessage;

    /**
     * @return The request message for requesting approval of the Shared Private Link Enabled Remote Resource.
     * 
     */
    public Optional<Output<String>> requestMessage() {
        return Optional.ofNullable(this.requestMessage);
    }

    /**
     * The id of the Signalr Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="signalrServiceId")
    private @Nullable Output<String> signalrServiceId;

    /**
     * @return The id of the Signalr Service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> signalrServiceId() {
        return Optional.ofNullable(this.signalrServiceId);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The sub resource name which the Signalr Private Endpoint can connect to. Possible values are `sites`, `vault`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subResourceName")
    private @Nullable Output<String> subResourceName;

    /**
     * @return The sub resource name which the Signalr Private Endpoint can connect to. Possible values are `sites`, `vault`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> subResourceName() {
        return Optional.ofNullable(this.subResourceName);
    }

    /**
     * The ID of the Shared Private Link Enabled Remote Resource which this Signalr Private Endpoint should be connected to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="targetResourceId")
    private @Nullable Output<String> targetResourceId;

    /**
     * @return The ID of the Shared Private Link Enabled Remote Resource which this Signalr Private Endpoint should be connected to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> targetResourceId() {
        return Optional.ofNullable(this.targetResourceId);
    }

    private SharedPrivateLinkResourceState() {}

    private SharedPrivateLinkResourceState(SharedPrivateLinkResourceState $) {
        this.name = $.name;
        this.requestMessage = $.requestMessage;
        this.signalrServiceId = $.signalrServiceId;
        this.status = $.status;
        this.subResourceName = $.subResourceName;
        this.targetResourceId = $.targetResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedPrivateLinkResourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedPrivateLinkResourceState $;

        public Builder() {
            $ = new SharedPrivateLinkResourceState();
        }

        public Builder(SharedPrivateLinkResourceState defaults) {
            $ = new SharedPrivateLinkResourceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Signalr Shared Private Link Resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Signalr Shared Private Link Resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param requestMessage The request message for requesting approval of the Shared Private Link Enabled Remote Resource.
         * 
         * @return builder
         * 
         */
        public Builder requestMessage(@Nullable Output<String> requestMessage) {
            $.requestMessage = requestMessage;
            return this;
        }

        /**
         * @param requestMessage The request message for requesting approval of the Shared Private Link Enabled Remote Resource.
         * 
         * @return builder
         * 
         */
        public Builder requestMessage(String requestMessage) {
            return requestMessage(Output.of(requestMessage));
        }

        /**
         * @param signalrServiceId The id of the Signalr Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder signalrServiceId(@Nullable Output<String> signalrServiceId) {
            $.signalrServiceId = signalrServiceId;
            return this;
        }

        /**
         * @param signalrServiceId The id of the Signalr Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder signalrServiceId(String signalrServiceId) {
            return signalrServiceId(Output.of(signalrServiceId));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param subResourceName The sub resource name which the Signalr Private Endpoint can connect to. Possible values are `sites`, `vault`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subResourceName(@Nullable Output<String> subResourceName) {
            $.subResourceName = subResourceName;
            return this;
        }

        /**
         * @param subResourceName The sub resource name which the Signalr Private Endpoint can connect to. Possible values are `sites`, `vault`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subResourceName(String subResourceName) {
            return subResourceName(Output.of(subResourceName));
        }

        /**
         * @param targetResourceId The ID of the Shared Private Link Enabled Remote Resource which this Signalr Private Endpoint should be connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(@Nullable Output<String> targetResourceId) {
            $.targetResourceId = targetResourceId;
            return this;
        }

        /**
         * @param targetResourceId The ID of the Shared Private Link Enabled Remote Resource which this Signalr Private Endpoint should be connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetResourceId(String targetResourceId) {
            return targetResourceId(Output.of(targetResourceId));
        }

        public SharedPrivateLinkResourceState build() {
            return $;
        }
    }

}