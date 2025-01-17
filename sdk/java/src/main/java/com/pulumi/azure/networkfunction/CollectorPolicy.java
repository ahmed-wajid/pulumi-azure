// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.networkfunction;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.networkfunction.CollectorPolicyArgs;
import com.pulumi.azure.networkfunction.inputs.CollectorPolicyState;
import com.pulumi.azure.networkfunction.outputs.CollectorPolicyIpfxEmission;
import com.pulumi.azure.networkfunction.outputs.CollectorPolicyIpfxIngestion;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Network Function Collector Policy.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.network.ExpressRoutePort;
 * import com.pulumi.azure.network.ExpressRoutePortArgs;
 * import com.pulumi.azure.network.ExpressRouteCircuit;
 * import com.pulumi.azure.network.ExpressRouteCircuitArgs;
 * import com.pulumi.azure.network.inputs.ExpressRouteCircuitSkuArgs;
 * import com.pulumi.azure.network.ExpressRouteCircuitPeering;
 * import com.pulumi.azure.network.ExpressRouteCircuitPeeringArgs;
 * import com.pulumi.azure.network.inputs.ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs;
 * import com.pulumi.azure.networkfunction.AzureTrafficCollector;
 * import com.pulumi.azure.networkfunction.AzureTrafficCollectorArgs;
 * import com.pulumi.azure.networkfunction.CollectorPolicy;
 * import com.pulumi.azure.networkfunction.CollectorPolicyArgs;
 * import com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxEmissionArgs;
 * import com.pulumi.azure.networkfunction.inputs.CollectorPolicyIpfxIngestionArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West US 2&#34;)
 *             .build());
 * 
 *         var exampleExpressRoutePort = new ExpressRoutePort(&#34;exampleExpressRoutePort&#34;, ExpressRoutePortArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .peeringLocation(&#34;Equinix-Seattle-SE2&#34;)
 *             .bandwidthInGbps(10)
 *             .encapsulation(&#34;Dot1Q&#34;)
 *             .build());
 * 
 *         var exampleExpressRouteCircuit = new ExpressRouteCircuit(&#34;exampleExpressRouteCircuit&#34;, ExpressRouteCircuitArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .expressRoutePortId(exampleExpressRoutePort.id())
 *             .bandwidthInGbps(1)
 *             .sku(ExpressRouteCircuitSkuArgs.builder()
 *                 .tier(&#34;Standard&#34;)
 *                 .family(&#34;MeteredData&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleExpressRouteCircuitPeering = new ExpressRouteCircuitPeering(&#34;exampleExpressRouteCircuitPeering&#34;, ExpressRouteCircuitPeeringArgs.builder()        
 *             .peeringType(&#34;MicrosoftPeering&#34;)
 *             .expressRouteCircuitName(exampleExpressRouteCircuit.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .peerAsn(100)
 *             .primaryPeerAddressPrefix(&#34;192.168.199.0/30&#34;)
 *             .secondaryPeerAddressPrefix(&#34;192.168.200.0/30&#34;)
 *             .vlanId(300)
 *             .microsoftPeeringConfig(ExpressRouteCircuitPeeringMicrosoftPeeringConfigArgs.builder()
 *                 .advertisedPublicPrefixes(&#34;123.6.0.0/24&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleAzureTrafficCollector = new AzureTrafficCollector(&#34;exampleAzureTrafficCollector&#34;, AzureTrafficCollectorArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleExpressRouteCircuitPeering)
 *                 .build());
 * 
 *         var exampleCollectorPolicy = new CollectorPolicy(&#34;exampleCollectorPolicy&#34;, CollectorPolicyArgs.builder()        
 *             .trafficCollectorId(exampleAzureTrafficCollector.id())
 *             .location(exampleResourceGroup.location())
 *             .ipfxEmission(CollectorPolicyIpfxEmissionArgs.builder()
 *                 .destinationTypes(&#34;AzureMonitor&#34;)
 *                 .build())
 *             .ipfxIngestion(CollectorPolicyIpfxIngestionArgs.builder()
 *                 .sourceResourceIds(exampleExpressRouteCircuit.id())
 *                 .build())
 *             .tags(Map.of(&#34;key&#34;, &#34;value&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Network Function Collector Policy can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:networkfunction/collectorPolicy:CollectorPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.NetworkFunction/azureTrafficCollectors/azureTrafficCollector1/collectorPolicies/collectorPolicy1
 * ```
 * 
 */
@ResourceType(type="azure:networkfunction/collectorPolicy:CollectorPolicy")
public class CollectorPolicy extends com.pulumi.resources.CustomResource {
    /**
     * An `ipfx_emission` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    @Export(name="ipfxEmission", refs={CollectorPolicyIpfxEmission.class}, tree="[0]")
    private Output<CollectorPolicyIpfxEmission> ipfxEmission;

    /**
     * @return An `ipfx_emission` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    public Output<CollectorPolicyIpfxEmission> ipfxEmission() {
        return this.ipfxEmission;
    }
    /**
     * An `ipfx_ingestion` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    @Export(name="ipfxIngestion", refs={CollectorPolicyIpfxIngestion.class}, tree="[0]")
    private Output<CollectorPolicyIpfxIngestion> ipfxIngestion;

    /**
     * @return An `ipfx_ingestion` block as defined below. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    public Output<CollectorPolicyIpfxIngestion> ipfxIngestion() {
        return this.ipfxIngestion;
    }
    /**
     * Specifies the Azure Region where the Network Function Collector Policy should exist. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Network Function Collector Policy should exist. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name which should be used for this Network Function Collector Policy. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Network Function Collector Policy. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A mapping of tags which should be assigned to the Network Function Collector Policy.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Network Function Collector Policy.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the Azure Traffic Collector ID of the Network Function Collector Policy. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    @Export(name="trafficCollectorId", refs={String.class}, tree="[0]")
    private Output<String> trafficCollectorId;

    /**
     * @return Specifies the Azure Traffic Collector ID of the Network Function Collector Policy. Changing this forces a new Network Function Collector Policy to be created.
     * 
     */
    public Output<String> trafficCollectorId() {
        return this.trafficCollectorId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CollectorPolicy(String name) {
        this(name, CollectorPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CollectorPolicy(String name, CollectorPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CollectorPolicy(String name, CollectorPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:networkfunction/collectorPolicy:CollectorPolicy", name, args == null ? CollectorPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CollectorPolicy(String name, Output<String> id, @Nullable CollectorPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:networkfunction/collectorPolicy:CollectorPolicy", name, state, makeResourceOptions(options, id));
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
    public static CollectorPolicy get(String name, Output<String> id, @Nullable CollectorPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CollectorPolicy(name, id, state, options);
    }
}
