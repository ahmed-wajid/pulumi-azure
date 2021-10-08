// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.VideoAnalyzer
{
    /// <summary>
    /// Manages a Video Analyzer.
    /// 
    /// ## Example Usage
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
    ///         var exampleAccount = new Azure.Storage.Account("exampleAccount", new Azure.Storage.AccountArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             AccountTier = "Standard",
    ///             AccountReplicationType = "GRS",
    ///         });
    ///         var exampleUserAssignedIdentity = new Azure.Authorization.UserAssignedIdentity("exampleUserAssignedIdentity", new Azure.Authorization.UserAssignedIdentityArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///         });
    ///         var contributor = new Azure.Authorization.Assignment("contributor", new Azure.Authorization.AssignmentArgs
    ///         {
    ///             Scope = exampleAccount.Id,
    ///             RoleDefinitionName = "Storage Blob Data Contributor",
    ///             PrincipalId = exampleUserAssignedIdentity.PrincipalId,
    ///         });
    ///         var reader = new Azure.Authorization.Assignment("reader", new Azure.Authorization.AssignmentArgs
    ///         {
    ///             Scope = exampleAccount.Id,
    ///             RoleDefinitionName = "Reader",
    ///             PrincipalId = exampleUserAssignedIdentity.PrincipalId,
    ///         });
    ///         var exampleAnalyzer = new Azure.VideoAnalyzer.Analyzer("exampleAnalyzer", new Azure.VideoAnalyzer.AnalyzerArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             StorageAccount = new Azure.VideoAnalyzer.Inputs.AnalyzerStorageAccountArgs
    ///             {
    ///                 Id = exampleAccount.Id,
    ///                 UserAssignedIdentityId = exampleUserAssignedIdentity.Id,
    ///             },
    ///             Identity = new Azure.VideoAnalyzer.Inputs.AnalyzerIdentityArgs
    ///             {
    ///                 Type = "UserAssigned",
    ///                 IdentityIds = 
    ///                 {
    ///                     exampleUserAssignedIdentity.Id,
    ///                 },
    ///             },
    ///             Tags = 
    ///             {
    ///                 { "environment", "staging" },
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 contributor,
    ///                 reader,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Video Analyzer can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:videoanalyzer/analyzer:Analyzer analyzer /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Media/videoAnalyzers/analyzer1
    /// ```
    /// </summary>
    [AzureResourceType("azure:videoanalyzer/analyzer:Analyzer")]
    public partial class Analyzer : Pulumi.CustomResource
    {
        /// <summary>
        /// An `identity` block is defined below.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.AnalyzerIdentity> Identity { get; private set; } = null!;

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Video Analyzer. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which to create the Video Analyzer. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// An `storage_account` blocks is defined below.
        /// </summary>
        [Output("storageAccount")]
        public Output<Outputs.AnalyzerStorageAccount> StorageAccount { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags assigned to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Analyzer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Analyzer(string name, AnalyzerArgs args, CustomResourceOptions? options = null)
            : base("azure:videoanalyzer/analyzer:Analyzer", name, args ?? new AnalyzerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Analyzer(string name, Input<string> id, AnalyzerState? state = null, CustomResourceOptions? options = null)
            : base("azure:videoanalyzer/analyzer:Analyzer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Analyzer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Analyzer Get(string name, Input<string> id, AnalyzerState? state = null, CustomResourceOptions? options = null)
        {
            return new Analyzer(name, id, state, options);
        }
    }

    public sealed class AnalyzerArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `identity` block is defined below.
        /// </summary>
        [Input("identity", required: true)]
        public Input<Inputs.AnalyzerIdentityArgs> Identity { get; set; } = null!;

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Video Analyzer. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the Video Analyzer. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// An `storage_account` blocks is defined below.
        /// </summary>
        [Input("storageAccount", required: true)]
        public Input<Inputs.AnalyzerStorageAccountArgs> StorageAccount { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags assigned to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public AnalyzerArgs()
        {
        }
    }

    public sealed class AnalyzerState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `identity` block is defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.AnalyzerIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Video Analyzer. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the Video Analyzer. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// An `storage_account` blocks is defined below.
        /// </summary>
        [Input("storageAccount")]
        public Input<Inputs.AnalyzerStorageAccountGetArgs>? StorageAccount { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags assigned to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public AnalyzerState()
        {
        }
    }
}