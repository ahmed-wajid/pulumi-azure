// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceDisasterRecoveryConfigState extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceDisasterRecoveryConfigState Empty = new NamespaceDisasterRecoveryConfigState();

    /**
     * The primary access key for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    @Import(name="defaultPrimaryKey")
    private @Nullable Output<String> defaultPrimaryKey;

    /**
     * @return The primary access key for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    public Optional<Output<String>> defaultPrimaryKey() {
        return Optional.ofNullable(this.defaultPrimaryKey);
    }

    /**
     * The secondary access key for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    @Import(name="defaultSecondaryKey")
    private @Nullable Output<String> defaultSecondaryKey;

    /**
     * @return The secondary access key for the authorization rule `RootManageSharedAccessKey`.
     * 
     */
    public Optional<Output<String>> defaultSecondaryKey() {
        return Optional.ofNullable(this.defaultSecondaryKey);
    }

    /**
     * Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Service Bus Namespace to replicate to.
     * 
     */
    @Import(name="partnerNamespaceId")
    private @Nullable Output<String> partnerNamespaceId;

    /**
     * @return The ID of the Service Bus Namespace to replicate to.
     * 
     */
    public Optional<Output<String>> partnerNamespaceId() {
        return Optional.ofNullable(this.partnerNamespaceId);
    }

    /**
     * The alias Primary Connection String for the ServiceBus Namespace.
     * 
     */
    @Import(name="primaryConnectionStringAlias")
    private @Nullable Output<String> primaryConnectionStringAlias;

    /**
     * @return The alias Primary Connection String for the ServiceBus Namespace.
     * 
     */
    public Optional<Output<String>> primaryConnectionStringAlias() {
        return Optional.ofNullable(this.primaryConnectionStringAlias);
    }

    /**
     * The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="primaryNamespaceId")
    private @Nullable Output<String> primaryNamespaceId;

    /**
     * @return The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> primaryNamespaceId() {
        return Optional.ofNullable(this.primaryNamespaceId);
    }

    /**
     * The alias Secondary Connection String for the ServiceBus Namespace
     * 
     */
    @Import(name="secondaryConnectionStringAlias")
    private @Nullable Output<String> secondaryConnectionStringAlias;

    /**
     * @return The alias Secondary Connection String for the ServiceBus Namespace
     * 
     */
    public Optional<Output<String>> secondaryConnectionStringAlias() {
        return Optional.ofNullable(this.secondaryConnectionStringAlias);
    }

    private NamespaceDisasterRecoveryConfigState() {}

    private NamespaceDisasterRecoveryConfigState(NamespaceDisasterRecoveryConfigState $) {
        this.defaultPrimaryKey = $.defaultPrimaryKey;
        this.defaultSecondaryKey = $.defaultSecondaryKey;
        this.name = $.name;
        this.partnerNamespaceId = $.partnerNamespaceId;
        this.primaryConnectionStringAlias = $.primaryConnectionStringAlias;
        this.primaryNamespaceId = $.primaryNamespaceId;
        this.secondaryConnectionStringAlias = $.secondaryConnectionStringAlias;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceDisasterRecoveryConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceDisasterRecoveryConfigState $;

        public Builder() {
            $ = new NamespaceDisasterRecoveryConfigState();
        }

        public Builder(NamespaceDisasterRecoveryConfigState defaults) {
            $ = new NamespaceDisasterRecoveryConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultPrimaryKey The primary access key for the authorization rule `RootManageSharedAccessKey`.
         * 
         * @return builder
         * 
         */
        public Builder defaultPrimaryKey(@Nullable Output<String> defaultPrimaryKey) {
            $.defaultPrimaryKey = defaultPrimaryKey;
            return this;
        }

        /**
         * @param defaultPrimaryKey The primary access key for the authorization rule `RootManageSharedAccessKey`.
         * 
         * @return builder
         * 
         */
        public Builder defaultPrimaryKey(String defaultPrimaryKey) {
            return defaultPrimaryKey(Output.of(defaultPrimaryKey));
        }

        /**
         * @param defaultSecondaryKey The secondary access key for the authorization rule `RootManageSharedAccessKey`.
         * 
         * @return builder
         * 
         */
        public Builder defaultSecondaryKey(@Nullable Output<String> defaultSecondaryKey) {
            $.defaultSecondaryKey = defaultSecondaryKey;
            return this;
        }

        /**
         * @param defaultSecondaryKey The secondary access key for the authorization rule `RootManageSharedAccessKey`.
         * 
         * @return builder
         * 
         */
        public Builder defaultSecondaryKey(String defaultSecondaryKey) {
            return defaultSecondaryKey(Output.of(defaultSecondaryKey));
        }

        /**
         * @param name Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param partnerNamespaceId The ID of the Service Bus Namespace to replicate to.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceId(@Nullable Output<String> partnerNamespaceId) {
            $.partnerNamespaceId = partnerNamespaceId;
            return this;
        }

        /**
         * @param partnerNamespaceId The ID of the Service Bus Namespace to replicate to.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceId(String partnerNamespaceId) {
            return partnerNamespaceId(Output.of(partnerNamespaceId));
        }

        /**
         * @param primaryConnectionStringAlias The alias Primary Connection String for the ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionStringAlias(@Nullable Output<String> primaryConnectionStringAlias) {
            $.primaryConnectionStringAlias = primaryConnectionStringAlias;
            return this;
        }

        /**
         * @param primaryConnectionStringAlias The alias Primary Connection String for the ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionStringAlias(String primaryConnectionStringAlias) {
            return primaryConnectionStringAlias(Output.of(primaryConnectionStringAlias));
        }

        /**
         * @param primaryNamespaceId The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder primaryNamespaceId(@Nullable Output<String> primaryNamespaceId) {
            $.primaryNamespaceId = primaryNamespaceId;
            return this;
        }

        /**
         * @param primaryNamespaceId The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder primaryNamespaceId(String primaryNamespaceId) {
            return primaryNamespaceId(Output.of(primaryNamespaceId));
        }

        /**
         * @param secondaryConnectionStringAlias The alias Secondary Connection String for the ServiceBus Namespace
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionStringAlias(@Nullable Output<String> secondaryConnectionStringAlias) {
            $.secondaryConnectionStringAlias = secondaryConnectionStringAlias;
            return this;
        }

        /**
         * @param secondaryConnectionStringAlias The alias Secondary Connection String for the ServiceBus Namespace
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionStringAlias(String secondaryConnectionStringAlias) {
            return secondaryConnectionStringAlias(Output.of(secondaryConnectionStringAlias));
        }

        public NamespaceDisasterRecoveryConfigState build() {
            return $;
        }
    }

}