// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.containerservice.FluxConfigurationArgs;
import com.pulumi.azure.containerservice.inputs.FluxConfigurationState;
import com.pulumi.azure.containerservice.outputs.FluxConfigurationBlobStorage;
import com.pulumi.azure.containerservice.outputs.FluxConfigurationBucket;
import com.pulumi.azure.containerservice.outputs.FluxConfigurationGitRepository;
import com.pulumi.azure.containerservice.outputs.FluxConfigurationKustomization;
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
 * Manages a Kubernetes Flux Configuration.
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
 * import com.pulumi.azure.containerservice.KubernetesCluster;
 * import com.pulumi.azure.containerservice.KubernetesClusterArgs;
 * import com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs;
 * import com.pulumi.azure.containerservice.inputs.KubernetesClusterIdentityArgs;
 * import com.pulumi.azure.containerservice.KubernetesClusterExtension;
 * import com.pulumi.azure.containerservice.KubernetesClusterExtensionArgs;
 * import com.pulumi.azure.containerservice.FluxConfiguration;
 * import com.pulumi.azure.containerservice.FluxConfigurationArgs;
 * import com.pulumi.azure.containerservice.inputs.FluxConfigurationGitRepositoryArgs;
 * import com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationArgs;
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
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleKubernetesCluster = new KubernetesCluster(&#34;exampleKubernetesCluster&#34;, KubernetesClusterArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .dnsPrefix(&#34;example-aks&#34;)
 *             .defaultNodePool(KubernetesClusterDefaultNodePoolArgs.builder()
 *                 .name(&#34;default&#34;)
 *                 .nodeCount(1)
 *                 .vmSize(&#34;Standard_DS2_v2&#34;)
 *                 .build())
 *             .identity(KubernetesClusterIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleKubernetesClusterExtension = new KubernetesClusterExtension(&#34;exampleKubernetesClusterExtension&#34;, KubernetesClusterExtensionArgs.builder()        
 *             .clusterId(azurerm_kubernetes_cluster.test().id())
 *             .extensionType(&#34;microsoft.flux&#34;)
 *             .build());
 * 
 *         var exampleFluxConfiguration = new FluxConfiguration(&#34;exampleFluxConfiguration&#34;, FluxConfigurationArgs.builder()        
 *             .clusterId(azurerm_kubernetes_cluster.test().id())
 *             .namespace(&#34;flux&#34;)
 *             .gitRepository(FluxConfigurationGitRepositoryArgs.builder()
 *                 .url(&#34;https://github.com/Azure/arc-k8s-demo&#34;)
 *                 .referenceType(&#34;branch&#34;)
 *                 .referenceValue(&#34;main&#34;)
 *                 .build())
 *             .kustomizations(FluxConfigurationKustomizationArgs.builder()
 *                 .name(&#34;kustomization-1&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleKubernetesClusterExtension)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Kubernetes Flux Configuration can be imported using the `resource id` for different `cluster_resource_name`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:containerservice/fluxConfiguration:FluxConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.ContainerService/managedClusters/cluster1/providers/Microsoft.KubernetesConfiguration/fluxConfigurations/fluxConfiguration1
 * ```
 * 
 */
@ResourceType(type="azure:containerservice/fluxConfiguration:FluxConfiguration")
public class FluxConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * An `blob_storage` block as defined below.
     * 
     */
    @Export(name="blobStorage", refs={FluxConfigurationBlobStorage.class}, tree="[0]")
    private Output</* @Nullable */ FluxConfigurationBlobStorage> blobStorage;

    /**
     * @return An `blob_storage` block as defined below.
     * 
     */
    public Output<Optional<FluxConfigurationBlobStorage>> blobStorage() {
        return Codegen.optional(this.blobStorage);
    }
    /**
     * A `bucket` block as defined below.
     * 
     */
    @Export(name="bucket", refs={FluxConfigurationBucket.class}, tree="[0]")
    private Output</* @Nullable */ FluxConfigurationBucket> bucket;

    /**
     * @return A `bucket` block as defined below.
     * 
     */
    public Output<Optional<FluxConfigurationBucket>> bucket() {
        return Codegen.optional(this.bucket);
    }
    /**
     * Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
     * 
     */
    @Export(name="continuousReconciliationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> continuousReconciliationEnabled;

    /**
     * @return Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> continuousReconciliationEnabled() {
        return Codegen.optional(this.continuousReconciliationEnabled);
    }
    /**
     * A `git_repository` block as defined below.
     * 
     */
    @Export(name="gitRepository", refs={FluxConfigurationGitRepository.class}, tree="[0]")
    private Output</* @Nullable */ FluxConfigurationGitRepository> gitRepository;

    /**
     * @return A `git_repository` block as defined below.
     * 
     */
    public Output<Optional<FluxConfigurationGitRepository>> gitRepository() {
        return Codegen.optional(this.gitRepository);
    }
    /**
     * A `kustomizations` block as defined below.
     * 
     */
    @Export(name="kustomizations", refs={List.class,FluxConfigurationKustomization.class}, tree="[0,1]")
    private Output<List<FluxConfigurationKustomization>> kustomizations;

    /**
     * @return A `kustomizations` block as defined below.
     * 
     */
    public Output<List<FluxConfigurationKustomization>> kustomizations() {
        return this.kustomizations;
    }
    /**
     * Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output<String> namespace;

    /**
     * @return Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }
    /**
     * Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FluxConfiguration(String name) {
        this(name, FluxConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FluxConfiguration(String name, FluxConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FluxConfiguration(String name, FluxConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/fluxConfiguration:FluxConfiguration", name, args == null ? FluxConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FluxConfiguration(String name, Output<String> id, @Nullable FluxConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/fluxConfiguration:FluxConfiguration", name, state, makeResourceOptions(options, id));
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
    public static FluxConfiguration get(String name, Output<String> id, @Nullable FluxConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FluxConfiguration(name, id, state, options);
    }
}