// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.policy.VirtualMachineConfigurationAssignmentArgs;
import com.pulumi.azure.policy.inputs.VirtualMachineConfigurationAssignmentState;
import com.pulumi.azure.policy.outputs.VirtualMachineConfigurationAssignmentConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Applies a Guest Configuration Policy to a Virtual Machine.
 * 
 * &gt; **NOTE:** You can create Guest Configuration Policies without defining a `azure.compute.Extension` resource, however the policies will not be executed until a `azure.compute.Extension` has been provisioned to the virtual machine.
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
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var exampleNetworkInterface = new NetworkInterface(&#34;exampleNetworkInterface&#34;, NetworkInterfaceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .ipConfigurations(NetworkInterfaceIpConfigurationArgs.builder()
 *                 .name(&#34;internal&#34;)
 *                 .subnetId(exampleSubnet.id())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleWindowsVirtualMachine = new WindowsVirtualMachine(&#34;exampleWindowsVirtualMachine&#34;, WindowsVirtualMachineArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .size(&#34;Standard_F2&#34;)
 *             .adminUsername(&#34;adminuser&#34;)
 *             .adminPassword(&#34;P@$$w0rd1234!&#34;)
 *             .networkInterfaceIds(exampleNetworkInterface.id())
 *             .identity(WindowsVirtualMachineIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .osDisk(WindowsVirtualMachineOsDiskArgs.builder()
 *                 .caching(&#34;ReadWrite&#34;)
 *                 .storageAccountType(&#34;Standard_LRS&#34;)
 *                 .build())
 *             .sourceImageReference(WindowsVirtualMachineSourceImageReferenceArgs.builder()
 *                 .publisher(&#34;MicrosoftWindowsServer&#34;)
 *                 .offer(&#34;WindowsServer&#34;)
 *                 .sku(&#34;2019-Datacenter&#34;)
 *                 .version(&#34;latest&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleExtension = new Extension(&#34;exampleExtension&#34;, ExtensionArgs.builder()        
 *             .virtualMachineId(exampleWindowsVirtualMachine.id())
 *             .publisher(&#34;Microsoft.GuestConfiguration&#34;)
 *             .type(&#34;ConfigurationforWindows&#34;)
 *             .typeHandlerVersion(&#34;1.0&#34;)
 *             .autoUpgradeMinorVersion(&#34;true&#34;)
 *             .build());
 * 
 *         var exampleVirtualMachineConfigurationAssignment = new VirtualMachineConfigurationAssignment(&#34;exampleVirtualMachineConfigurationAssignment&#34;, VirtualMachineConfigurationAssignmentArgs.builder()        
 *             .location(exampleWindowsVirtualMachine.location())
 *             .virtualMachineId(exampleWindowsVirtualMachine.id())
 *             .configuration(VirtualMachineConfigurationAssignmentConfigurationArgs.builder()
 *                 .assignmentType(&#34;ApplyAndMonitor&#34;)
 *                 .version(&#34;1.*&#34;)
 *                 .parameters(                
 *                     VirtualMachineConfigurationAssignmentConfigurationParameterArgs.builder()
 *                         .name(&#34;Minimum Password Length;ExpectedValue&#34;)
 *                         .value(&#34;16&#34;)
 *                         .build(),
 *                     VirtualMachineConfigurationAssignmentConfigurationParameterArgs.builder()
 *                         .name(&#34;Minimum Password Age;ExpectedValue&#34;)
 *                         .value(&#34;0&#34;)
 *                         .build(),
 *                     VirtualMachineConfigurationAssignmentConfigurationParameterArgs.builder()
 *                         .name(&#34;Maximum Password Age;ExpectedValue&#34;)
 *                         .value(&#34;30,45&#34;)
 *                         .build(),
 *                     VirtualMachineConfigurationAssignmentConfigurationParameterArgs.builder()
 *                         .name(&#34;Enforce Password History;ExpectedValue&#34;)
 *                         .value(&#34;10&#34;)
 *                         .build(),
 *                     VirtualMachineConfigurationAssignmentConfigurationParameterArgs.builder()
 *                         .name(&#34;Password Must Meet Complexity Requirements;ExpectedValue&#34;)
 *                         .value(&#34;1&#34;)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Policy Virtual Machine Configuration Assignments can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:policy/virtualMachineConfigurationAssignment:VirtualMachineConfigurationAssignment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/virtualMachines/vm1/providers/Microsoft.GuestConfiguration/guestConfigurationAssignments/assignment1
 * ```
 * 
 */
@ResourceType(type="azure:policy/virtualMachineConfigurationAssignment:VirtualMachineConfigurationAssignment")
public class VirtualMachineConfigurationAssignment extends com.pulumi.resources.CustomResource {
    /**
     * A `configuration` block as defined below.
     * 
     */
    @Export(name="configuration", type=VirtualMachineConfigurationAssignmentConfiguration.class, parameters={})
    private Output<VirtualMachineConfigurationAssignmentConfiguration> configuration;

    /**
     * @return A `configuration` block as defined below.
     * 
     */
    public Output<VirtualMachineConfigurationAssignmentConfiguration> configuration() {
        return this.configuration;
    }
    /**
     * The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualMachineId", type=String.class, parameters={})
    private Output<String> virtualMachineId;

    /**
     * @return The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachineConfigurationAssignment(String name) {
        this(name, VirtualMachineConfigurationAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachineConfigurationAssignment(String name, VirtualMachineConfigurationAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachineConfigurationAssignment(String name, VirtualMachineConfigurationAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:policy/virtualMachineConfigurationAssignment:VirtualMachineConfigurationAssignment", name, args == null ? VirtualMachineConfigurationAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMachineConfigurationAssignment(String name, Output<String> id, @Nullable VirtualMachineConfigurationAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:policy/virtualMachineConfigurationAssignment:VirtualMachineConfigurationAssignment", name, state, makeResourceOptions(options, id));
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
    public static VirtualMachineConfigurationAssignment get(String name, Output<String> id, @Nullable VirtualMachineConfigurationAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineConfigurationAssignment(name, id, state, options);
    }
}