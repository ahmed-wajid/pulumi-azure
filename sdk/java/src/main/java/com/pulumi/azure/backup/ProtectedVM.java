// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.backup.ProtectedVMArgs;
import com.pulumi.azure.backup.inputs.ProtectedVMState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages Azure Backup for an Azure VM
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
 *         var exampleVault = new Vault(&#34;exampleVault&#34;, VaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var examplePolicyVM = new PolicyVM(&#34;examplePolicyVM&#34;, PolicyVMArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .recoveryVaultName(exampleVault.name())
 *             .backup(PolicyVMBackupArgs.builder()
 *                 .frequency(&#34;Daily&#34;)
 *                 .time(&#34;23:00&#34;)
 *                 .build())
 *             .build());
 * 
 *         final var exampleVirtualMachine = ComputeFunctions.getVirtualMachine(GetVirtualMachineArgs.builder()
 *             .name(&#34;production&#34;)
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var vm1 = new ProtectedVM(&#34;vm1&#34;, ProtectedVMArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .recoveryVaultName(exampleVault.name())
 *             .sourceVmId(exampleVirtualMachine.apply(getVirtualMachineResult -&gt; getVirtualMachineResult).apply(exampleVirtualMachine -&gt; exampleVirtualMachine.apply(getVirtualMachineResult -&gt; getVirtualMachineResult.id())))
 *             .backupPolicyId(examplePolicyVM.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Recovery Services Protected VMs can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:backup/protectedVM:ProtectedVM item1 &#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.RecoveryServices/vaults/example-recovery-vault/backupFabrics/Azure/protectionContainers/iaasvmcontainer;iaasvmcontainerv2;group1;vm1/protectedItems/vm;iaasvmcontainerv2;group1;vm1&#34;
 * ```
 * 
 *  Note the ID requires quoting as there are semicolons
 * 
 */
@ResourceType(type="azure:backup/protectedVM:ProtectedVM")
public class ProtectedVM extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the id of the backup policy to use.
     * 
     */
    @Export(name="backupPolicyId", type=String.class, parameters={})
    private Output<String> backupPolicyId;

    /**
     * @return Specifies the id of the backup policy to use.
     * 
     */
    public Output<String> backupPolicyId() {
        return this.backupPolicyId;
    }
    /**
     * A list of Disks&#39; Logical Unit Numbers(LUN) to be excluded for VM Protection.
     * 
     */
    @Export(name="excludeDiskLuns", type=List.class, parameters={Integer.class})
    private Output</* @Nullable */ List<Integer>> excludeDiskLuns;

    /**
     * @return A list of Disks&#39; Logical Unit Numbers(LUN) to be excluded for VM Protection.
     * 
     */
    public Output<Optional<List<Integer>>> excludeDiskLuns() {
        return Codegen.optional(this.excludeDiskLuns);
    }
    /**
     * A list of Disks&#39; Logical Unit Numbers(LUN) to be included for VM Protection.
     * 
     */
    @Export(name="includeDiskLuns", type=List.class, parameters={Integer.class})
    private Output</* @Nullable */ List<Integer>> includeDiskLuns;

    /**
     * @return A list of Disks&#39; Logical Unit Numbers(LUN) to be included for VM Protection.
     * 
     */
    public Output<Optional<List<Integer>>> includeDiskLuns() {
        return Codegen.optional(this.includeDiskLuns);
    }
    /**
     * Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="recoveryVaultName", type=String.class, parameters={})
    private Output<String> recoveryVaultName;

    /**
     * @return Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> recoveryVaultName() {
        return this.recoveryVaultName;
    }
    /**
     * The name of the resource group in which to create the Recovery Services Vault. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Recovery Services Vault. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies the ID of the VM to backup. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sourceVmId", type=String.class, parameters={})
    private Output<String> sourceVmId;

    /**
     * @return Specifies the ID of the VM to backup. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sourceVmId() {
        return this.sourceVmId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProtectedVM(String name) {
        this(name, ProtectedVMArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProtectedVM(String name, ProtectedVMArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProtectedVM(String name, ProtectedVMArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:backup/protectedVM:ProtectedVM", name, args == null ? ProtectedVMArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProtectedVM(String name, Output<String> id, @Nullable ProtectedVMState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:backup/protectedVM:ProtectedVM", name, state, makeResourceOptions(options, id));
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
    public static ProtectedVM get(String name, Output<String> id, @Nullable ProtectedVMState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProtectedVM(name, id, state, options);
    }
}