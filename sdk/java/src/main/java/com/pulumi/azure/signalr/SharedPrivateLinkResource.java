// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.signalr;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.signalr.SharedPrivateLinkResourceArgs;
import com.pulumi.azure.signalr.inputs.SharedPrivateLinkResourceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the Shared Private Link Resource for a Signalr service.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs;
 * import com.pulumi.azure.signalr.Service;
 * import com.pulumi.azure.signalr.ServiceArgs;
 * import com.pulumi.azure.signalr.inputs.ServiceSkuArgs;
 * import com.pulumi.azure.signalr.SharedPrivateLinkResource;
 * import com.pulumi.azure.signalr.SharedPrivateLinkResourceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var current = CoreFunctions.getClientConfig();
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;east us&#34;)
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *             .skuName(&#34;standard&#34;)
 *             .softDeleteRetentionDays(7)
 *             .accessPolicies(KeyVaultAccessPolicyArgs.builder()
 *                 .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *                 .objectId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.objectId()))
 *                 .certificatePermissions(&#34;ManageContacts&#34;)
 *                 .keyPermissions(&#34;Create&#34;)
 *                 .secretPermissions(&#34;Set&#34;)
 *                 .build())
 *             .build());
 * 
 *         var test = new Service(&#34;test&#34;, ServiceArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .sku(ServiceSkuArgs.builder()
 *                 .name(&#34;Standard_S1&#34;)
 *                 .capacity(1)
 *                 .build())
 *             .build());
 * 
 *         var exampleSharedPrivateLinkResource = new SharedPrivateLinkResource(&#34;exampleSharedPrivateLinkResource&#34;, SharedPrivateLinkResourceArgs.builder()        
 *             .signalrServiceId(azurerm_signalr_service.example().id())
 *             .subResourceName(&#34;vault&#34;)
 *             .targetResourceId(exampleKeyVault.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Attributes Reference:
 * 
 * The following attributes are exported:
 * 
 * * `id` - The ID of the Signalr Shared Private Link resource.
 * 
 * * `status` - The status of a private endpoint connection. Possible values are `Pending`, `Approved`, `Rejected` or `Disconnected`.
 * 
 * ## Import
 * 
 * Signalr Shared Private Link Resource can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:signalr/sharedPrivateLinkResource:SharedPrivateLinkResource example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.SignalRService/signalR/signalr1/sharedPrivateLinkResources/resource1
 * ```
 * 
 */
@ResourceType(type="azure:signalr/sharedPrivateLinkResource:SharedPrivateLinkResource")
public class SharedPrivateLinkResource extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Signalr Shared Private Link Resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Signalr Shared Private Link Resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The request message for requesting approval of the Shared Private Link Enabled Remote Resource.
     * 
     */
    @Export(name="requestMessage", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestMessage;

    /**
     * @return The request message for requesting approval of the Shared Private Link Enabled Remote Resource.
     * 
     */
    public Output<Optional<String>> requestMessage() {
        return Codegen.optional(this.requestMessage);
    }
    /**
     * The id of the Signalr Service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="signalrServiceId", type=String.class, parameters={})
    private Output<String> signalrServiceId;

    /**
     * @return The id of the Signalr Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> signalrServiceId() {
        return this.signalrServiceId;
    }
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }
    /**
     * The sub resource name which the Signalr Private Endpoint can connect to. Possible values are `sites`, `vault`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="subResourceName", type=String.class, parameters={})
    private Output<String> subResourceName;

    /**
     * @return The sub resource name which the Signalr Private Endpoint can connect to. Possible values are `sites`, `vault`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> subResourceName() {
        return this.subResourceName;
    }
    /**
     * The ID of the Shared Private Link Enabled Remote Resource which this Signalr Private Endpoint should be connected to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="targetResourceId", type=String.class, parameters={})
    private Output<String> targetResourceId;

    /**
     * @return The ID of the Shared Private Link Enabled Remote Resource which this Signalr Private Endpoint should be connected to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> targetResourceId() {
        return this.targetResourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SharedPrivateLinkResource(String name) {
        this(name, SharedPrivateLinkResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SharedPrivateLinkResource(String name, SharedPrivateLinkResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SharedPrivateLinkResource(String name, SharedPrivateLinkResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:signalr/sharedPrivateLinkResource:SharedPrivateLinkResource", name, args == null ? SharedPrivateLinkResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SharedPrivateLinkResource(String name, Output<String> id, @Nullable SharedPrivateLinkResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:signalr/sharedPrivateLinkResource:SharedPrivateLinkResource", name, state, makeResourceOptions(options, id));
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
    public static SharedPrivateLinkResource get(String name, Output<String> id, @Nullable SharedPrivateLinkResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SharedPrivateLinkResource(name, id, state, options);
    }
}