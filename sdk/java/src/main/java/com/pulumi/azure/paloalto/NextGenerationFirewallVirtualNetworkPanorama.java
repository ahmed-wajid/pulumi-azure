// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanoramaArgs;
import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaState;
import com.pulumi.azure.paloalto.outputs.NextGenerationFirewallVirtualNetworkPanoramaDestinationNat;
import com.pulumi.azure.paloalto.outputs.NextGenerationFirewallVirtualNetworkPanoramaDnsSettings;
import com.pulumi.azure.paloalto.outputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfile;
import com.pulumi.azure.paloalto.outputs.NextGenerationFirewallVirtualNetworkPanoramaPanorama;
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
 * Manages a Palo Alto Next Generation Firewall Virtual Network Panorama.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.network.PublicIp;
 * import com.pulumi.azure.network.PublicIpArgs;
 * import com.pulumi.azure.network.NetworkSecurityGroup;
 * import com.pulumi.azure.network.NetworkSecurityGroupArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
 * import com.pulumi.azure.network.SubnetNetworkSecurityGroupAssociation;
 * import com.pulumi.azure.network.SubnetNetworkSecurityGroupAssociationArgs;
 * import com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanorama;
 * import com.pulumi.azure.paloalto.NextGenerationFirewallVirtualNetworkPanoramaArgs;
 * import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs;
 * import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileVnetConfigurationArgs;
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
 *             .location(&#34;westeurope&#34;)
 *             .build());
 * 
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .allocationMethod(&#34;Static&#34;)
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var exampleNetworkSecurityGroup = new NetworkSecurityGroup(&#34;exampleNetworkSecurityGroup&#34;, NetworkSecurityGroupArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *         var trustSubnet = new Subnet(&#34;trustSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.1.0/24&#34;)
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name(&#34;trusted&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name(&#34;PaloAltoNetworks.Cloudngfw/firewalls&#34;)
 *                     .actions(&#34;Microsoft.Network/virtualNetworks/subnets/join/action&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var trustSubnetNetworkSecurityGroupAssociation = new SubnetNetworkSecurityGroupAssociation(&#34;trustSubnetNetworkSecurityGroupAssociation&#34;, SubnetNetworkSecurityGroupAssociationArgs.builder()        
 *             .subnetId(trustSubnet.id())
 *             .networkSecurityGroupId(exampleNetworkSecurityGroup.id())
 *             .build());
 * 
 *         var untrustSubnet = new Subnet(&#34;untrustSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name(&#34;untrusted&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name(&#34;PaloAltoNetworks.Cloudngfw/firewalls&#34;)
 *                     .actions(&#34;Microsoft.Network/virtualNetworks/subnets/join/action&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var untrustSubnetNetworkSecurityGroupAssociation = new SubnetNetworkSecurityGroupAssociation(&#34;untrustSubnetNetworkSecurityGroupAssociation&#34;, SubnetNetworkSecurityGroupAssociationArgs.builder()        
 *             .subnetId(untrustSubnet.id())
 *             .networkSecurityGroupId(exampleNetworkSecurityGroup.id())
 *             .build());
 * 
 *         var exampleNextGenerationFirewallVirtualNetworkPanorama = new NextGenerationFirewallVirtualNetworkPanorama(&#34;exampleNextGenerationFirewallVirtualNetworkPanorama&#34;, NextGenerationFirewallVirtualNetworkPanoramaArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .panoramaBase64Config(&#34;e2RnbmFtZTogY25nZnctYXotZXhhbXBsZSwgdHBsbmFtZTogY25nZnctZXhhbXBsZS10ZW1wbGF0ZS1zdGFjaywgZXhhbXBsZS1wYW5vcmFtYS1zZXJ2ZXI6IDE5Mi4xNjguMC4xLCB2bS1hdXRoLWtleTogMDAwMDAwMDAwMDAwMDAwLCBleHBpcnk6IDIwMjQvMDcvMzF9Cg==&#34;)
 *             .networkProfile(NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileArgs.builder()
 *                 .publicIpAddressIds(examplePublicIp.id())
 *                 .vnetConfiguration(NextGenerationFirewallVirtualNetworkPanoramaNetworkProfileVnetConfigurationArgs.builder()
 *                     .virtualNetworkId(exampleVirtualNetwork.id())
 *                     .trustedSubnetId(trustSubnet.id())
 *                     .untrustedSubnetId(untrustSubnet.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Palo Alto Next Generation Firewall Virtual Network Panoramas can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:paloalto/nextGenerationFirewallVirtualNetworkPanorama:NextGenerationFirewallVirtualNetworkPanorama example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/firewalls/myVNetPanoramaFW
 * ```
 * 
 */
@ResourceType(type="azure:paloalto/nextGenerationFirewallVirtualNetworkPanorama:NextGenerationFirewallVirtualNetworkPanorama")
public class NextGenerationFirewallVirtualNetworkPanorama extends com.pulumi.resources.CustomResource {
    /**
     * One or more `destination_nat` blocks as defined below.
     * 
     */
    @Export(name="destinationNats", refs={List.class,NextGenerationFirewallVirtualNetworkPanoramaDestinationNat.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NextGenerationFirewallVirtualNetworkPanoramaDestinationNat>> destinationNats;

    /**
     * @return One or more `destination_nat` blocks as defined below.
     * 
     */
    public Output<Optional<List<NextGenerationFirewallVirtualNetworkPanoramaDestinationNat>>> destinationNats() {
        return Codegen.optional(this.destinationNats);
    }
    /**
     * A `dns_settings` block as defined below.
     * 
     */
    @Export(name="dnsSettings", refs={NextGenerationFirewallVirtualNetworkPanoramaDnsSettings.class}, tree="[0]")
    private Output</* @Nullable */ NextGenerationFirewallVirtualNetworkPanoramaDnsSettings> dnsSettings;

    /**
     * @return A `dns_settings` block as defined below.
     * 
     */
    public Output<Optional<NextGenerationFirewallVirtualNetworkPanoramaDnsSettings>> dnsSettings() {
        return Codegen.optional(this.dnsSettings);
    }
    /**
     * The Azure Region where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Panorama. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Panorama. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `network_profile` block as defined below.
     * 
     */
    @Export(name="networkProfile", refs={NextGenerationFirewallVirtualNetworkPanoramaNetworkProfile.class}, tree="[0]")
    private Output<NextGenerationFirewallVirtualNetworkPanoramaNetworkProfile> networkProfile;

    /**
     * @return A `network_profile` block as defined below.
     * 
     */
    public Output<NextGenerationFirewallVirtualNetworkPanoramaNetworkProfile> networkProfile() {
        return this.networkProfile;
    }
    /**
     * The base64 encoded configuration registration string as defined by your Panorama Server for your Cloud Device Group.
     * 
     */
    @Export(name="panoramaBase64Config", refs={String.class}, tree="[0]")
    private Output<String> panoramaBase64Config;

    /**
     * @return The base64 encoded configuration registration string as defined by your Panorama Server for your Cloud Device Group.
     * 
     */
    public Output<String> panoramaBase64Config() {
        return this.panoramaBase64Config;
    }
    /**
     * A `panorama` block as defined below.
     * 
     */
    @Export(name="panoramas", refs={List.class,NextGenerationFirewallVirtualNetworkPanoramaPanorama.class}, tree="[0,1]")
    private Output<List<NextGenerationFirewallVirtualNetworkPanoramaPanorama>> panoramas;

    /**
     * @return A `panorama` block as defined below.
     * 
     */
    public Output<List<NextGenerationFirewallVirtualNetworkPanoramaPanorama>> panoramas() {
        return this.panoramas;
    }
    /**
     * The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Panorama.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Panorama.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NextGenerationFirewallVirtualNetworkPanorama(String name) {
        this(name, NextGenerationFirewallVirtualNetworkPanoramaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NextGenerationFirewallVirtualNetworkPanorama(String name, NextGenerationFirewallVirtualNetworkPanoramaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NextGenerationFirewallVirtualNetworkPanorama(String name, NextGenerationFirewallVirtualNetworkPanoramaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:paloalto/nextGenerationFirewallVirtualNetworkPanorama:NextGenerationFirewallVirtualNetworkPanorama", name, args == null ? NextGenerationFirewallVirtualNetworkPanoramaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NextGenerationFirewallVirtualNetworkPanorama(String name, Output<String> id, @Nullable NextGenerationFirewallVirtualNetworkPanoramaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:paloalto/nextGenerationFirewallVirtualNetworkPanorama:NextGenerationFirewallVirtualNetworkPanorama", name, state, makeResourceOptions(options, id));
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
    public static NextGenerationFirewallVirtualNetworkPanorama get(String name, Output<String> id, @Nullable NextGenerationFirewallVirtualNetworkPanoramaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NextGenerationFirewallVirtualNetworkPanorama(name, id, state, options);
    }
}
