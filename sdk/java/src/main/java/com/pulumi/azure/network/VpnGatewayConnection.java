// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.VpnGatewayConnectionArgs;
import com.pulumi.azure.network.inputs.VpnGatewayConnectionState;
import com.pulumi.azure.network.outputs.VpnGatewayConnectionRouting;
import com.pulumi.azure.network.outputs.VpnGatewayConnectionTrafficSelectorPolicy;
import com.pulumi.azure.network.outputs.VpnGatewayConnectionVpnLink;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a VPN Gateway Connection.
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
 *             .addressPrefix(&#34;10.0.0.0/24&#34;)
 *             .build());
 * 
 *         var exampleVpnGateway = new VpnGateway(&#34;exampleVpnGateway&#34;, VpnGatewayArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualHubId(exampleVirtualHub.id())
 *             .build());
 * 
 *         var exampleVpnSite = new VpnSite(&#34;exampleVpnSite&#34;, VpnSiteArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualWanId(exampleVirtualWan.id())
 *             .links(            
 *                 VpnSiteLinkArgs.builder()
 *                     .name(&#34;link1&#34;)
 *                     .ipAddress(&#34;10.1.0.0&#34;)
 *                     .build(),
 *                 VpnSiteLinkArgs.builder()
 *                     .name(&#34;link2&#34;)
 *                     .ipAddress(&#34;10.2.0.0&#34;)
 *                     .build())
 *             .build());
 * 
 *         var exampleVpnGatewayConnection = new VpnGatewayConnection(&#34;exampleVpnGatewayConnection&#34;, VpnGatewayConnectionArgs.builder()        
 *             .vpnGatewayId(exampleVpnGateway.id())
 *             .remoteVpnSiteId(exampleVpnSite.id())
 *             .vpnLinks(            
 *                 VpnGatewayConnectionVpnLinkArgs.builder()
 *                     .name(&#34;link1&#34;)
 *                     .vpnSiteLinkId(exampleVpnSite.links().apply(links -&gt; links[0].id()))
 *                     .build(),
 *                 VpnGatewayConnectionVpnLinkArgs.builder()
 *                     .name(&#34;link2&#34;)
 *                     .vpnSiteLinkId(exampleVpnSite.links().apply(links -&gt; links[1].id()))
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * VPN Gateway Connections can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/vpnGatewayConnection:VpnGatewayConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/vpnGateways/gateway1/vpnConnections/conn1
 * ```
 * 
 */
@ResourceType(type="azure:network/vpnGatewayConnection:VpnGatewayConnection")
public class VpnGatewayConnection extends com.pulumi.resources.CustomResource {
    /**
     * Whether Internet Security is enabled for this VPN Connection. Defaults to `false`.
     * 
     */
    @Export(name="internetSecurityEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> internetSecurityEnabled;

    /**
     * @return Whether Internet Security is enabled for this VPN Connection. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> internetSecurityEnabled() {
        return Codegen.optional(this.internetSecurityEnabled);
    }
    /**
     * The name which should be used for this VPN Gateway Connection. Changing this forces a new VPN Gateway Connection to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this VPN Gateway Connection. Changing this forces a new VPN Gateway Connection to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the remote VPN Site, which will connect to the VPN Gateway. Changing this forces a new VPN Gateway Connection to be created.
     * 
     */
    @Export(name="remoteVpnSiteId", type=String.class, parameters={})
    private Output<String> remoteVpnSiteId;

    /**
     * @return The ID of the remote VPN Site, which will connect to the VPN Gateway. Changing this forces a new VPN Gateway Connection to be created.
     * 
     */
    public Output<String> remoteVpnSiteId() {
        return this.remoteVpnSiteId;
    }
    /**
     * A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
     * 
     */
    @Export(name="routing", type=VpnGatewayConnectionRouting.class, parameters={})
    private Output<VpnGatewayConnectionRouting> routing;

    /**
     * @return A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
     * 
     */
    public Output<VpnGatewayConnectionRouting> routing() {
        return this.routing;
    }
    /**
     * One or more `traffic_selector_policy` blocks as defined below.
     * 
     */
    @Export(name="trafficSelectorPolicies", type=List.class, parameters={VpnGatewayConnectionTrafficSelectorPolicy.class})
    private Output</* @Nullable */ List<VpnGatewayConnectionTrafficSelectorPolicy>> trafficSelectorPolicies;

    /**
     * @return One or more `traffic_selector_policy` blocks as defined below.
     * 
     */
    public Output<Optional<List<VpnGatewayConnectionTrafficSelectorPolicy>>> trafficSelectorPolicies() {
        return Codegen.optional(this.trafficSelectorPolicies);
    }
    /**
     * The ID of the VPN Gateway that this VPN Gateway Connection belongs to. Changing this forces a new VPN Gateway Connection to be created.
     * 
     */
    @Export(name="vpnGatewayId", type=String.class, parameters={})
    private Output<String> vpnGatewayId;

    /**
     * @return The ID of the VPN Gateway that this VPN Gateway Connection belongs to. Changing this forces a new VPN Gateway Connection to be created.
     * 
     */
    public Output<String> vpnGatewayId() {
        return this.vpnGatewayId;
    }
    /**
     * One or more `vpn_link` blocks as defined below.
     * 
     */
    @Export(name="vpnLinks", type=List.class, parameters={VpnGatewayConnectionVpnLink.class})
    private Output<List<VpnGatewayConnectionVpnLink>> vpnLinks;

    /**
     * @return One or more `vpn_link` blocks as defined below.
     * 
     */
    public Output<List<VpnGatewayConnectionVpnLink>> vpnLinks() {
        return this.vpnLinks;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpnGatewayConnection(String name) {
        this(name, VpnGatewayConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpnGatewayConnection(String name, VpnGatewayConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpnGatewayConnection(String name, VpnGatewayConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/vpnGatewayConnection:VpnGatewayConnection", name, args == null ? VpnGatewayConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpnGatewayConnection(String name, Output<String> id, @Nullable VpnGatewayConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/vpnGatewayConnection:VpnGatewayConnection", name, state, makeResourceOptions(options, id));
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
    public static VpnGatewayConnection get(String name, Output<String> id, @Nullable VpnGatewayConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpnGatewayConnection(name, id, state, options);
    }
}