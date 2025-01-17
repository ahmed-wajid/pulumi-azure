// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.siterecovery.VMWareReplicationPolicyArgs;
import com.pulumi.azure.siterecovery.inputs.VMWareReplicationPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a VMWare Replication Policy.
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
 * import com.pulumi.azure.recoveryservices.Vault;
 * import com.pulumi.azure.recoveryservices.VaultArgs;
 * import com.pulumi.azure.siterecovery.VMWareReplicationPolicy;
 * import com.pulumi.azure.siterecovery.VMWareReplicationPolicyArgs;
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
 *             .location(&#34;eastus&#34;)
 *             .build());
 * 
 *         var exampleVault = new Vault(&#34;exampleVault&#34;, VaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Standard&#34;)
 *             .classicVmwareReplicationEnabled(true)
 *             .softDeleteEnabled(false)
 *             .build());
 * 
 *         var exampleVMWareReplicationPolicy = new VMWareReplicationPolicy(&#34;exampleVMWareReplicationPolicy&#34;, VMWareReplicationPolicyArgs.builder()        
 *             .recoveryVaultId(exampleVault.id())
 *             .recoveryPointRetentionInMinutes(1440)
 *             .applicationConsistentSnapshotFrequencyInMinutes(240)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * VMWare Replication Policy can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:siterecovery/vMWareReplicationPolicy:VMWareReplicationPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/vault1/providers/Microsoft.RecoveryServices/vaults/vault1/replicationPolicies/policy1
 * ```
 * 
 */
@ResourceType(type="azure:siterecovery/vMWareReplicationPolicy:VMWareReplicationPolicy")
public class VMWareReplicationPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the frequency at which to create application consistent recovery points. Must between `0` to `720`.
     * 
     */
    @Export(name="applicationConsistentSnapshotFrequencyInMinutes", refs={Integer.class}, tree="[0]")
    private Output<Integer> applicationConsistentSnapshotFrequencyInMinutes;

    /**
     * @return Specifies the frequency at which to create application consistent recovery points. Must between `0` to `720`.
     * 
     */
    public Output<Integer> applicationConsistentSnapshotFrequencyInMinutes() {
        return this.applicationConsistentSnapshotFrequencyInMinutes;
    }
    /**
     * The name which should be used for this Classic Replication Policy. Changing this forces a new Replication Policy to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Classic Replication Policy. Changing this forces a new Replication Policy to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the period up to which the recovery points will be retained. Must between `0` to `21600`.
     * 
     */
    @Export(name="recoveryPointRetentionInMinutes", refs={Integer.class}, tree="[0]")
    private Output<Integer> recoveryPointRetentionInMinutes;

    /**
     * @return Specifies the period up to which the recovery points will be retained. Must between `0` to `21600`.
     * 
     */
    public Output<Integer> recoveryPointRetentionInMinutes() {
        return this.recoveryPointRetentionInMinutes;
    }
    /**
     * ID of the Recovery Services Vault. Changing this forces a new Replication Policy to be created.
     * 
     */
    @Export(name="recoveryVaultId", refs={String.class}, tree="[0]")
    private Output<String> recoveryVaultId;

    /**
     * @return ID of the Recovery Services Vault. Changing this forces a new Replication Policy to be created.
     * 
     */
    public Output<String> recoveryVaultId() {
        return this.recoveryVaultId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VMWareReplicationPolicy(String name) {
        this(name, VMWareReplicationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VMWareReplicationPolicy(String name, VMWareReplicationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VMWareReplicationPolicy(String name, VMWareReplicationPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/vMWareReplicationPolicy:VMWareReplicationPolicy", name, args == null ? VMWareReplicationPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VMWareReplicationPolicy(String name, Output<String> id, @Nullable VMWareReplicationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/vMWareReplicationPolicy:VMWareReplicationPolicy", name, state, makeResourceOptions(options, id));
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
    public static VMWareReplicationPolicy get(String name, Output<String> id, @Nullable VMWareReplicationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VMWareReplicationPolicy(name, id, state, options);
    }
}
