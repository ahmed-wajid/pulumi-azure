// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.eventhub.ConsumerGroupArgs;
import com.pulumi.azure.eventhub.inputs.ConsumerGroupState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Event Hubs Consumer Group as a nested resource within an Event Hub.
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
 *         var exampleEventHubNamespace = new EventHubNamespace(&#34;exampleEventHubNamespace&#34;, EventHubNamespaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Basic&#34;)
 *             .capacity(2)
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *         var exampleEventHub = new EventHub(&#34;exampleEventHub&#34;, EventHubArgs.builder()        
 *             .namespaceName(exampleEventHubNamespace.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .partitionCount(2)
 *             .messageRetention(2)
 *             .build());
 * 
 *         var exampleConsumerGroup = new ConsumerGroup(&#34;exampleConsumerGroup&#34;, ConsumerGroupArgs.builder()        
 *             .namespaceName(exampleEventHubNamespace.name())
 *             .eventhubName(exampleEventHub.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .userMetadata(&#34;some-meta-data&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * EventHub Consumer Groups can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:eventhub/consumerGroup:ConsumerGroup consumerGroup1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventHub/namespaces/namespace1/eventhubs/eventhub1/consumerGroups/consumerGroup1
 * ```
 * 
 */
@ResourceType(type="azure:eventhub/consumerGroup:ConsumerGroup")
public class ConsumerGroup extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the name of the EventHub. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="eventhubName", type=String.class, parameters={})
    private Output<String> eventhubName;

    /**
     * @return Specifies the name of the EventHub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> eventhubName() {
        return this.eventhubName;
    }
    /**
     * Specifies the name of the EventHub Consumer Group resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the EventHub Consumer Group resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of the grandparent EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="namespaceName", type=String.class, parameters={})
    private Output<String> namespaceName;

    /**
     * @return Specifies the name of the grandparent EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies the user metadata.
     * 
     */
    @Export(name="userMetadata", type=String.class, parameters={})
    private Output</* @Nullable */ String> userMetadata;

    /**
     * @return Specifies the user metadata.
     * 
     */
    public Output<Optional<String>> userMetadata() {
        return Codegen.optional(this.userMetadata);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConsumerGroup(String name) {
        this(name, ConsumerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConsumerGroup(String name, ConsumerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConsumerGroup(String name, ConsumerGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/consumerGroup:ConsumerGroup", name, args == null ? ConsumerGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConsumerGroup(String name, Output<String> id, @Nullable ConsumerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/consumerGroup:ConsumerGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure:eventhub/eventHubConsumerGroup:EventHubConsumerGroup").build())
            ))
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
    public static ConsumerGroup get(String name, Output<String> id, @Nullable ConsumerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConsumerGroup(name, id, state, options);
    }
}