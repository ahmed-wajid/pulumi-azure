// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.notificationhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.notificationhub.HubArgs;
import com.pulumi.azure.notificationhub.inputs.HubState;
import com.pulumi.azure.notificationhub.outputs.HubApnsCredential;
import com.pulumi.azure.notificationhub.outputs.HubGcmCredential;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Notification Hub within a Notification Hub Namespace.
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .namespaceType(&#34;NotificationHub&#34;)
 *             .skuName(&#34;Free&#34;)
 *             .build());
 * 
 *         var exampleHub = new Hub(&#34;exampleHub&#34;, HubArgs.builder()        
 *             .namespaceName(exampleNamespace.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Notification Hubs can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:notificationhub/hub:Hub hub1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.NotificationHubs/namespaces/namespace1/notificationHubs/hub1
 * ```
 * 
 */
@ResourceType(type="azure:notificationhub/hub:Hub")
public class Hub extends com.pulumi.resources.CustomResource {
    /**
     * A `apns_credential` block as defined below.
     * 
     */
    @Export(name="apnsCredential", type=HubApnsCredential.class, parameters={})
    private Output</* @Nullable */ HubApnsCredential> apnsCredential;

    /**
     * @return A `apns_credential` block as defined below.
     * 
     */
    public Output<Optional<HubApnsCredential>> apnsCredential() {
        return Codegen.optional(this.apnsCredential);
    }
    /**
     * A `gcm_credential` block as defined below.
     * 
     */
    @Export(name="gcmCredential", type=HubGcmCredential.class, parameters={})
    private Output</* @Nullable */ HubGcmCredential> gcmCredential;

    /**
     * @return A `gcm_credential` block as defined below.
     * 
     */
    public Output<Optional<HubGcmCredential>> gcmCredential() {
        return Codegen.optional(this.gcmCredential);
    }
    /**
     * The Azure Region in which this Notification Hub Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region in which this Notification Hub Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name to use for this Notification Hub. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name to use for this Notification Hub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Notification Hub Namespace in which to create this Notification Hub. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="namespaceName", type=String.class, parameters={})
    private Output<String> namespaceName;

    /**
     * @return The name of the Notification Hub Namespace in which to create this Notification Hub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * The name of the Resource Group in which the Notification Hub Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Notification Hub Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Hub(String name) {
        this(name, HubArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Hub(String name, HubArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Hub(String name, HubArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:notificationhub/hub:Hub", name, args == null ? HubArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Hub(String name, Output<String> id, @Nullable HubState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:notificationhub/hub:Hub", name, state, makeResourceOptions(options, id));
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
    public static Hub get(String name, Output<String> id, @Nullable HubState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Hub(name, id, state, options);
    }
}