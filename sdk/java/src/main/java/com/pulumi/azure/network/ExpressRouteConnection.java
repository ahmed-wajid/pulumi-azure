// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.ExpressRouteConnectionArgs;
import com.pulumi.azure.network.inputs.ExpressRouteConnectionState;
import com.pulumi.azure.network.outputs.ExpressRouteConnectionRouting;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Express Route Connection.
 * 
 * &gt; **NOTE:** The provider status of the Express Route Circuit must be set as provisioned while creating the Express Route Connection. See more details [here](https://docs.microsoft.com/azure/expressroute/expressroute-howto-circuit-portal-resource-manager#send-the-service-key-to-your-connectivity-provider-for-provisioning).
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
 *         var exampleVirtualWan = new VirtualWan(&#34;exampleVirtualWan&#34;, VirtualWanArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .build());
 * 
 *         var exampleVirtualHub = new VirtualHub(&#34;exampleVirtualHub&#34;, VirtualHubArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .virtualWanId(exampleVirtualWan.id())
 *             .addressPrefix(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var exampleExpressRouteGateway = new ExpressRouteGateway(&#34;exampleExpressRouteGateway&#34;, ExpressRouteGatewayArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .virtualHubId(exampleVirtualHub.id())
 *             .scaleUnits(1)
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
 *             .bandwidthInGbps(5)
 *             .sku(ExpressRouteCircuitSkuArgs.builder()
 *                 .tier(&#34;Standard&#34;)
 *                 .family(&#34;MeteredData&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleExpressRouteCircuitPeering = new ExpressRouteCircuitPeering(&#34;exampleExpressRouteCircuitPeering&#34;, ExpressRouteCircuitPeeringArgs.builder()        
 *             .peeringType(&#34;AzurePrivatePeering&#34;)
 *             .expressRouteCircuitName(exampleExpressRouteCircuit.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sharedKey(&#34;ItsASecret&#34;)
 *             .peerAsn(100)
 *             .primaryPeerAddressPrefix(&#34;192.168.1.0/30&#34;)
 *             .secondaryPeerAddressPrefix(&#34;192.168.2.0/30&#34;)
 *             .vlanId(100)
 *             .build());
 * 
 *         var exampleExpressRouteConnection = new ExpressRouteConnection(&#34;exampleExpressRouteConnection&#34;, ExpressRouteConnectionArgs.builder()        
 *             .expressRouteGatewayId(exampleExpressRouteGateway.id())
 *             .expressRouteCircuitPeeringId(exampleExpressRouteCircuitPeering.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Express Route Connections can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/expressRouteConnection:ExpressRouteConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/expressRouteGateways/expressRouteGateway1/expressRouteConnections/connection1
 * ```
 * 
 */
@ResourceType(type="azure:network/expressRouteConnection:ExpressRouteConnection")
public class ExpressRouteConnection extends com.pulumi.resources.CustomResource {
    /**
     * The authorization key to establish the Express Route Connection.
     * 
     */
    @Export(name="authorizationKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizationKey;

    /**
     * @return The authorization key to establish the Express Route Connection.
     * 
     */
    public Output<Optional<String>> authorizationKey() {
        return Codegen.optional(this.authorizationKey);
    }
    /**
     * Is Internet security enabled for this Express Route Connection?
     * 
     */
    @Export(name="enableInternetSecurity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableInternetSecurity;

    /**
     * @return Is Internet security enabled for this Express Route Connection?
     * 
     */
    public Output<Optional<Boolean>> enableInternetSecurity() {
        return Codegen.optional(this.enableInternetSecurity);
    }
    /**
     * The ID of the Express Route Circuit Peering that this Express Route Connection connects with. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="expressRouteCircuitPeeringId", type=String.class, parameters={})
    private Output<String> expressRouteCircuitPeeringId;

    /**
     * @return The ID of the Express Route Circuit Peering that this Express Route Connection connects with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> expressRouteCircuitPeeringId() {
        return this.expressRouteCircuitPeeringId;
    }
    /**
     * The ID of the Express Route Gateway that this Express Route Connection connects with. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="expressRouteGatewayId", type=String.class, parameters={})
    private Output<String> expressRouteGatewayId;

    /**
     * @return The ID of the Express Route Gateway that this Express Route Connection connects with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> expressRouteGatewayId() {
        return this.expressRouteGatewayId;
    }
    /**
     * The name which should be used for this Express Route Connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Express Route Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `routing` block as defined below.
     * 
     */
    @Export(name="routing", type=ExpressRouteConnectionRouting.class, parameters={})
    private Output<ExpressRouteConnectionRouting> routing;

    /**
     * @return A `routing` block as defined below.
     * 
     */
    public Output<ExpressRouteConnectionRouting> routing() {
        return this.routing;
    }
    /**
     * The routing weight associated to the Express Route Connection. Possible value is between `0` and `32000`. Defaults to `0`.
     * 
     */
    @Export(name="routingWeight", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> routingWeight;

    /**
     * @return The routing weight associated to the Express Route Connection. Possible value is between `0` and `32000`. Defaults to `0`.
     * 
     */
    public Output<Optional<Integer>> routingWeight() {
        return Codegen.optional(this.routingWeight);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExpressRouteConnection(String name) {
        this(name, ExpressRouteConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExpressRouteConnection(String name, ExpressRouteConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExpressRouteConnection(String name, ExpressRouteConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/expressRouteConnection:ExpressRouteConnection", name, args == null ? ExpressRouteConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExpressRouteConnection(String name, Output<String> id, @Nullable ExpressRouteConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/expressRouteConnection:ExpressRouteConnection", name, state, makeResourceOptions(options, id));
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
    public static ExpressRouteConnection get(String name, Output<String> id, @Nullable ExpressRouteConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExpressRouteConnection(name, id, state, options);
    }
}