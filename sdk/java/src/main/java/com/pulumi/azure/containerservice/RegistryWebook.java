// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.containerservice.RegistryWebookArgs;
import com.pulumi.azure.containerservice.inputs.RegistryWebookState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Container Registry Webhook.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ResourceGroup(&#34;example&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var acr = new Registry(&#34;acr&#34;, RegistryArgs.builder()        
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .sku(&#34;Standard&#34;)
 *             .adminEnabled(false)
 *             .build());
 * 
 *         var webhook = new RegistryWebhook(&#34;webhook&#34;, RegistryWebhookArgs.builder()        
 *             .resourceGroupName(example.name())
 *             .registryName(acr.name())
 *             .location(example.location())
 *             .serviceUri(&#34;https://mywebhookreceiver.example/mytag&#34;)
 *             .status(&#34;enabled&#34;)
 *             .scope(&#34;mytag:*&#34;)
 *             .actions(&#34;push&#34;)
 *             .customHeaders(Map.of(&#34;Content-Type&#34;, &#34;application/json&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Container Registry Webhooks can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:containerservice/registryWebook:RegistryWebook example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/mygroup1/providers/Microsoft.ContainerRegistry/registries/myregistry1/webhooks/mywebhook1
 * ```
 * 
 * @deprecated
 * azure.containerservice.RegistryWebook has been deprecated in favor of azure.containerservice.RegistryWebhook
 * 
 */
@Deprecated /* azure.containerservice.RegistryWebook has been deprecated in favor of azure.containerservice.RegistryWebhook */
@ResourceType(type="azure:containerservice/registryWebook:RegistryWebook")
public class RegistryWebook extends com.pulumi.resources.CustomResource {
    /**
     * A list of actions that trigger the Webhook to post notifications. At least one action needs to be specified. Valid values are: `push`, `delete`, `quarantine`, `chart_push`, `chart_delete`
     * 
     */
    @Export(name="actions", type=List.class, parameters={String.class})
    private Output<List<String>> actions;

    /**
     * @return A list of actions that trigger the Webhook to post notifications. At least one action needs to be specified. Valid values are: `push`, `delete`, `quarantine`, `chart_push`, `chart_delete`
     * 
     */
    public Output<List<String>> actions() {
        return this.actions;
    }
    /**
     * Custom headers that will be added to the webhook notifications request.
     * 
     */
    @Export(name="customHeaders", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> customHeaders;

    /**
     * @return Custom headers that will be added to the webhook notifications request.
     * 
     */
    public Output<Optional<Map<String,String>>> customHeaders() {
        return Codegen.optional(this.customHeaders);
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Container Registry Webhook. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Container Registry Webhook. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Name of Container registry this Webhook belongs to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="registryName", type=String.class, parameters={})
    private Output<String> registryName;

    /**
     * @return The Name of Container registry this Webhook belongs to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> registryName() {
        return this.registryName;
    }
    /**
     * The name of the resource group in which to create the Container Registry Webhook. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Container Registry Webhook. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies the scope of repositories that can trigger an event. For example, `foo:*` means events for all tags under repository `foo`. `foo:bar` means events for &#39;foo:bar&#39; only. `foo` is equivalent to `foo:latest`. Empty means all events.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return Specifies the scope of repositories that can trigger an event. For example, `foo:*` means events for all tags under repository `foo`. `foo:bar` means events for &#39;foo:bar&#39; only. `foo` is equivalent to `foo:latest`. Empty means all events.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * Specifies the service URI for the Webhook to post notifications.
     * 
     */
    @Export(name="serviceUri", type=String.class, parameters={})
    private Output<String> serviceUri;

    /**
     * @return Specifies the service URI for the Webhook to post notifications.
     * 
     */
    public Output<String> serviceUri() {
        return this.serviceUri;
    }
    /**
     * Specifies if this Webhook triggers notifications or not. Valid values: `enabled` and `disabled`. Default is `enabled`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Specifies if this Webhook triggers notifications or not. Valid values: `enabled` and `disabled`. Default is `enabled`.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryWebook(String name) {
        this(name, RegistryWebookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryWebook(String name, RegistryWebookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryWebook(String name, RegistryWebookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/registryWebook:RegistryWebook", name, args == null ? RegistryWebookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegistryWebook(String name, Output<String> id, @Nullable RegistryWebookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/registryWebook:RegistryWebook", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegistryWebook get(String name, Output<String> id, @Nullable RegistryWebookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegistryWebook(name, id, state, options);
    }
}