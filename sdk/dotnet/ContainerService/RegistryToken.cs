// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService
{
    /// <summary>
    /// Manages an Azure Container Registry token. Tokens are a preview feature only available in Premium SKU Container registries.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleRegistry = new Azure.ContainerService.Registry("exampleRegistry", new Azure.ContainerService.RegistryArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             Sku = "Premium",
    ///             AdminEnabled = false,
    ///             GeoreplicationLocations = 
    ///             {
    ///                 "East US",
    ///                 "West Europe",
    ///             },
    ///         });
    ///         var exampleRegistryScopeMap = new Azure.ContainerService.RegistryScopeMap("exampleRegistryScopeMap", new Azure.ContainerService.RegistryScopeMapArgs
    ///         {
    ///             ContainerRegistryName = azurerm_container_registry.Acr.Name,
    ///             ResourceGroupName = azurerm_resource_group.Rg.Name,
    ///             Actions = 
    ///             {
    ///                 "repositories/repo1/content/read",
    ///                 "repositories/repo1/content/create",
    ///             },
    ///         });
    ///         var exampleRegistryToken = new Azure.ContainerService.RegistryToken("exampleRegistryToken", new Azure.ContainerService.RegistryTokenArgs
    ///         {
    ///             ContainerRegistryName = azurerm_container_registry.Acr.Name,
    ///             ResourceGroupName = azurerm_resource_group.Rg.Name,
    ///             ScopeMapId = azurerm_container_registry_scope_map.Map.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Container Registries can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:containerservice/registryToken:RegistryToken example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/mygroup1/providers/Microsoft.ContainerRegistry/registries/myregistry1/tokens/token1
    /// ```
    /// </summary>
    [AzureResourceType("azure:containerservice/registryToken:RegistryToken")]
    public partial class RegistryToken : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the Container Registry. Changing this forces a new resource to be created.
        /// </summary>
        [Output("containerRegistryName")]
        public Output<string> ContainerRegistryName { get; private set; } = null!;

        /// <summary>
        /// Should the Container Registry token be enabled? Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the token. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which to create the Container Registry token. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The ID of the Container Registry Scope Map associated with the token.
        /// </summary>
        [Output("scopeMapId")]
        public Output<string> ScopeMapId { get; private set; } = null!;


        /// <summary>
        /// Create a RegistryToken resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegistryToken(string name, RegistryTokenArgs args, CustomResourceOptions? options = null)
            : base("azure:containerservice/registryToken:RegistryToken", name, args ?? new RegistryTokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegistryToken(string name, Input<string> id, RegistryTokenState? state = null, CustomResourceOptions? options = null)
            : base("azure:containerservice/registryToken:RegistryToken", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RegistryToken resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegistryToken Get(string name, Input<string> id, RegistryTokenState? state = null, CustomResourceOptions? options = null)
        {
            return new RegistryToken(name, id, state, options);
        }
    }

    public sealed class RegistryTokenArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Container Registry. Changing this forces a new resource to be created.
        /// </summary>
        [Input("containerRegistryName", required: true)]
        public Input<string> ContainerRegistryName { get; set; } = null!;

        /// <summary>
        /// Should the Container Registry token be enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the name of the token. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the Container Registry token. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The ID of the Container Registry Scope Map associated with the token.
        /// </summary>
        [Input("scopeMapId", required: true)]
        public Input<string> ScopeMapId { get; set; } = null!;

        public RegistryTokenArgs()
        {
        }
    }

    public sealed class RegistryTokenState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Container Registry. Changing this forces a new resource to be created.
        /// </summary>
        [Input("containerRegistryName")]
        public Input<string>? ContainerRegistryName { get; set; }

        /// <summary>
        /// Should the Container Registry token be enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the name of the token. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the Container Registry token. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The ID of the Container Registry Scope Map associated with the token.
        /// </summary>
        [Input("scopeMapId")]
        public Input<string>? ScopeMapId { get; set; }

        public RegistryTokenState()
        {
        }
    }
}