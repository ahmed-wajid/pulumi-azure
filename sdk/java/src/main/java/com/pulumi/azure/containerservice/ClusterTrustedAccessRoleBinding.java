// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.containerservice.ClusterTrustedAccessRoleBindingArgs;
import com.pulumi.azure.containerservice.inputs.ClusterTrustedAccessRoleBindingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * &lt;!-- Note: This documentation is generated. Any manual changes will be overwritten --&gt;
 * 
 * Manages a Kubernetes Cluster Trusted Access Role Binding
 * &gt; **Note:** This Resource is in **Preview** to use this you must be opted into the Preview. You can do this by running `az feature register --namespace Microsoft.ContainerService --name TrustedAccessPreview` and then `az provider register -n Microsoft.ContainerService`
 * .
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
 * import com.pulumi.azure.appinsights.Insights;
 * import com.pulumi.azure.appinsights.InsightsArgs;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.keyvault.AccessPolicy;
 * import com.pulumi.azure.keyvault.AccessPolicyArgs;
 * import com.pulumi.azure.containerservice.KubernetesCluster;
 * import com.pulumi.azure.containerservice.KubernetesClusterArgs;
 * import com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs;
 * import com.pulumi.azure.containerservice.inputs.KubernetesClusterIdentityArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.machinelearning.Workspace;
 * import com.pulumi.azure.machinelearning.WorkspaceArgs;
 * import com.pulumi.azure.machinelearning.inputs.WorkspaceIdentityArgs;
 * import com.pulumi.azure.containerservice.ClusterTrustedAccessRoleBinding;
 * import com.pulumi.azure.containerservice.ClusterTrustedAccessRoleBindingArgs;
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
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleInsights = new Insights(&#34;exampleInsights&#34;, InsightsArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .applicationType(&#34;example-value&#34;)
 *             .build());
 * 
 *         final var test = CoreFunctions.getClientConfig();
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .tenantId(data.azurerm_client_config().example().tenant_id())
 *             .skuName(&#34;example-value&#34;)
 *             .softDeleteRetentionDays(&#34;example-value&#34;)
 *             .build());
 * 
 *         var exampleAccessPolicy = new AccessPolicy(&#34;exampleAccessPolicy&#34;, AccessPolicyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.id())
 *             .tenantId(data.azurerm_client_config().example().tenant_id())
 *             .objectId(data.azurerm_client_config().example().object_id())
 *             .keyPermissions(&#34;example-value&#34;)
 *             .build());
 * 
 *         var exampleKubernetesCluster = new KubernetesCluster(&#34;exampleKubernetesCluster&#34;, KubernetesClusterArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .dnsPrefix(&#34;acctestaksexample&#34;)
 *             .defaultNodePool(KubernetesClusterDefaultNodePoolArgs.builder()
 *                 .name(&#34;example-value&#34;)
 *                 .nodeCount(&#34;example-value&#34;)
 *                 .vmSize(&#34;example-value&#34;)
 *                 .build())
 *             .identity(KubernetesClusterIdentityArgs.builder()
 *                 .type(&#34;example-value&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .accountTier(&#34;example-value&#34;)
 *             .accountReplicationType(&#34;example-value&#34;)
 *             .build());
 * 
 *         var exampleWorkspace = new Workspace(&#34;exampleWorkspace&#34;, WorkspaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .keyVaultId(exampleKeyVault.id())
 *             .storageAccountId(exampleAccount.id())
 *             .applicationInsightsId(exampleInsights.id())
 *             .identity(WorkspaceIdentityArgs.builder()
 *                 .type(&#34;example-value&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleClusterTrustedAccessRoleBinding = new ClusterTrustedAccessRoleBinding(&#34;exampleClusterTrustedAccessRoleBinding&#34;, ClusterTrustedAccessRoleBindingArgs.builder()        
 *             .kubernetesClusterId(exampleKubernetesCluster.id())
 *             .roles(&#34;example-value&#34;)
 *             .sourceResourceId(exampleWorkspace.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * An existing Kubernetes Cluster Trusted Access Role Binding can be imported into Terraform using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:containerservice/clusterTrustedAccessRoleBinding:ClusterTrustedAccessRoleBinding example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{managedClusterName}/trustedAccessRoleBindings/{trustedAccessRoleBindingName}
 * ```
 * 
 *  * Where `{subscriptionId}` is the ID of the Azure Subscription where the Kubernetes Cluster Trusted Access Role Binding exists. For example `12345678-1234-9876-4563-123456789012`. * Where `{resourceGroupName}` is the name of Resource Group where this Kubernetes Cluster Trusted Access Role Binding exists. For example `example-resource-group`. * Where `{managedClusterName}` is the name of the Managed Cluster. For example `managedClusterValue`. * Where `{trustedAccessRoleBindingName}` is the name of the Trusted Access Role Binding. For example `trustedAccessRoleBindingValue`.
 * 
 */
@ResourceType(type="azure:containerservice/clusterTrustedAccessRoleBinding:ClusterTrustedAccessRoleBinding")
public class ClusterTrustedAccessRoleBinding extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the Kubernetes Cluster Id within which this Kubernetes Cluster Trusted Access Role Binding should exist. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    @Export(name="kubernetesClusterId", refs={String.class}, tree="[0]")
    private Output<String> kubernetesClusterId;

    /**
     * @return Specifies the Kubernetes Cluster Id within which this Kubernetes Cluster Trusted Access Role Binding should exist. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    public Output<String> kubernetesClusterId() {
        return this.kubernetesClusterId;
    }
    /**
     * Specifies the name of this Kubernetes Cluster Trusted Access Role Binding. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of this Kubernetes Cluster Trusted Access Role Binding. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of roles to bind, each item is a resource type qualified role name.
     * 
     */
    @Export(name="roles", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> roles;

    /**
     * @return A list of roles to bind, each item is a resource type qualified role name.
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }
    /**
     * The ARM resource ID of source resource that trusted access is configured for. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    @Export(name="sourceResourceId", refs={String.class}, tree="[0]")
    private Output<String> sourceResourceId;

    /**
     * @return The ARM resource ID of source resource that trusted access is configured for. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    public Output<String> sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterTrustedAccessRoleBinding(String name) {
        this(name, ClusterTrustedAccessRoleBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterTrustedAccessRoleBinding(String name, ClusterTrustedAccessRoleBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterTrustedAccessRoleBinding(String name, ClusterTrustedAccessRoleBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/clusterTrustedAccessRoleBinding:ClusterTrustedAccessRoleBinding", name, args == null ? ClusterTrustedAccessRoleBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterTrustedAccessRoleBinding(String name, Output<String> id, @Nullable ClusterTrustedAccessRoleBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/clusterTrustedAccessRoleBinding:ClusterTrustedAccessRoleBinding", name, state, makeResourceOptions(options, id));
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
    public static ClusterTrustedAccessRoleBinding get(String name, Output<String> id, @Nullable ClusterTrustedAccessRoleBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterTrustedAccessRoleBinding(name, id, state, options);
    }
}