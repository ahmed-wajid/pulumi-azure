// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * The name of the Bot Resource this connection will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="botName", required=true)
    private Output<String> botName;

    /**
     * @return The name of the Bot Resource this connection will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> botName() {
        return this.botName;
    }

    /**
     * The Client ID that will be used to authenticate with the service provider.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The Client ID that will be used to authenticate with the service provider.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The Client Secret that will be used to authenticate with the service provider.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The Client Secret that will be used to authenticate with the service provider.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Bot Connection. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Bot Connection. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of additional parameters to apply to the connection.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of additional parameters to apply to the connection.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The name of the resource group in which to create the Bot Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Bot Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Scopes at which the connection should be applied.
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<String> scopes;

    /**
     * @return The Scopes at which the connection should be applied.
     * 
     */
    public Optional<Output<String>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * The name of the service provider that will be associated with this connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serviceProviderName", required=true)
    private Output<String> serviceProviderName;

    /**
     * @return The name of the service provider that will be associated with this connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serviceProviderName() {
        return this.serviceProviderName;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     * @deprecated
     * This property has been deprecated as the API no longer supports tags and will be removed in version 4.0 of the provider.
     * 
     */
    @Deprecated /* This property has been deprecated as the API no longer supports tags and will be removed in version 4.0 of the provider. */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     * @deprecated
     * This property has been deprecated as the API no longer supports tags and will be removed in version 4.0 of the provider.
     * 
     */
    @Deprecated /* This property has been deprecated as the API no longer supports tags and will be removed in version 4.0 of the provider. */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ConnectionArgs() {}

    private ConnectionArgs(ConnectionArgs $) {
        this.botName = $.botName;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.location = $.location;
        this.name = $.name;
        this.parameters = $.parameters;
        this.resourceGroupName = $.resourceGroupName;
        this.scopes = $.scopes;
        this.serviceProviderName = $.serviceProviderName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionArgs $;

        public Builder() {
            $ = new ConnectionArgs();
        }

        public Builder(ConnectionArgs defaults) {
            $ = new ConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param botName The name of the Bot Resource this connection will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(Output<String> botName) {
            $.botName = botName;
            return this;
        }

        /**
         * @param botName The name of the Bot Resource this connection will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(String botName) {
            return botName(Output.of(botName));
        }

        /**
         * @param clientId The Client ID that will be used to authenticate with the service provider.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The Client ID that will be used to authenticate with the service provider.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The Client Secret that will be used to authenticate with the service provider.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The Client Secret that will be used to authenticate with the service provider.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Bot Connection. Changing this forces a new resource to be created. Must be globally unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Bot Connection. Changing this forces a new resource to be created. Must be globally unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of additional parameters to apply to the connection.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of additional parameters to apply to the connection.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bot Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bot Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scopes The Scopes at which the connection should be applied.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<String> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes The Scopes at which the connection should be applied.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param serviceProviderName The name of the service provider that will be associated with this connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serviceProviderName(Output<String> serviceProviderName) {
            $.serviceProviderName = serviceProviderName;
            return this;
        }

        /**
         * @param serviceProviderName The name of the service provider that will be associated with this connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serviceProviderName(String serviceProviderName) {
            return serviceProviderName(Output.of(serviceProviderName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * This property has been deprecated as the API no longer supports tags and will be removed in version 4.0 of the provider.
         * 
         */
        @Deprecated /* This property has been deprecated as the API no longer supports tags and will be removed in version 4.0 of the provider. */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * This property has been deprecated as the API no longer supports tags and will be removed in version 4.0 of the provider.
         * 
         */
        @Deprecated /* This property has been deprecated as the API no longer supports tags and will be removed in version 4.0 of the provider. */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ConnectionArgs build() {
            $.botName = Objects.requireNonNull($.botName, "expected parameter 'botName' to be non-null");
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceProviderName = Objects.requireNonNull($.serviceProviderName, "expected parameter 'serviceProviderName' to be non-null");
            return $;
        }
    }

}