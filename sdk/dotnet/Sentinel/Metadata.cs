// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel
{
    /// <summary>
    /// Manages a Sentinel Metadata.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleAnalyticsWorkspace = new Azure.OperationalInsights.AnalyticsWorkspace("exampleAnalyticsWorkspace", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Sku = "pergb2018",
    ///     });
    /// 
    ///     var exampleAnalyticsSolution = new Azure.OperationalInsights.AnalyticsSolution("exampleAnalyticsSolution", new()
    ///     {
    ///         SolutionName = "SecurityInsights",
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         WorkspaceResourceId = exampleAnalyticsWorkspace.Id,
    ///         WorkspaceName = exampleAnalyticsWorkspace.Name,
    ///         Plan = new Azure.OperationalInsights.Inputs.AnalyticsSolutionPlanArgs
    ///         {
    ///             Publisher = "Microsoft",
    ///             Product = "OMSGallery/SecurityInsights",
    ///         },
    ///     });
    /// 
    ///     var exampleAlertRuleNrt = new Azure.Sentinel.AlertRuleNrt("exampleAlertRuleNrt", new()
    ///     {
    ///         LogAnalyticsWorkspaceId = exampleAnalyticsSolution.WorkspaceResourceId,
    ///         DisplayName = "example",
    ///         Severity = "High",
    ///         Query = @"AzureActivity |
    ///   where OperationName == ""Create or Update Virtual Machine"" or OperationName ==""Create Deployment"" |
    ///   where ActivityStatus == ""Succeeded"" |
    ///   make-series dcount(ResourceId) default=0 on EventSubmissionTimestamp in range(ago(7d), now(), 1d) by Caller
    /// ",
    ///     });
    /// 
    ///     var exampleMetadata = new Azure.Sentinel.Metadata("exampleMetadata", new()
    ///     {
    ///         WorkspaceId = exampleAnalyticsSolution.WorkspaceResourceId,
    ///         ContentId = exampleAlertRuleNrt.Name,
    ///         Kind = "AnalyticsRule",
    ///         ParentId = exampleAlertRuleNrt.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Sentinel Metadata can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:sentinel/metadata:Metadata example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/metadata/metadata1
    /// ```
    /// </summary>
    [AzureResourceType("azure:sentinel/metadata:Metadata")]
    public partial class Metadata : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An `author` blocks as defined below.
        /// </summary>
        [Output("author")]
        public Output<Outputs.MetadataAuthor?> Author { get; private set; } = null!;

        /// <summary>
        /// A `category` block as defined below.
        /// </summary>
        [Output("category")]
        public Output<Outputs.MetadataCategory?> Category { get; private set; } = null!;

        /// <summary>
        /// The ID of the content. Used to identify dependencies and content from solutions or community.
        /// </summary>
        [Output("contentId")]
        public Output<string> ContentId { get; private set; } = null!;

        /// <summary>
        /// Schema version of the content. Can be used to distinguish between flow based on the schema version.
        /// </summary>
        [Output("contentSchemaVersion")]
        public Output<string?> ContentSchemaVersion { get; private set; } = null!;

        /// <summary>
        /// The Custom version of the content.
        /// </summary>
        [Output("customVersion")]
        public Output<string?> CustomVersion { get; private set; } = null!;

        /// <summary>
        /// A JSON formatted `dependency` block as defined below. Dependency for the content item, what other content items it requires to work.
        /// </summary>
        [Output("dependency")]
        public Output<string?> Dependency { get; private set; } = null!;

        /// <summary>
        /// The first publish date of solution content item.
        /// </summary>
        [Output("firstPublishDate")]
        public Output<string?> FirstPublishDate { get; private set; } = null!;

        /// <summary>
        /// The ID of the icon, this id can be fetched from the solution template.
        /// </summary>
        [Output("iconId")]
        public Output<string?> IconId { get; private set; } = null!;

        /// <summary>
        /// The kind of content the metadata is for. Possible values are `AnalyticsRule`, `AnalyticsRuleTemplate`, `AutomationRule`, `AzureFunction`, `DataConnector`, `DataType`, `HuntingQuery`, `InvestigationQuery`, `LogicAppsCustomConnector`, `Parser`, `Playbook`, `PlaybookTemplate`, `Solution`, `Watchlist`, `WatchlistTemplate`, `Workbook` and `WorkbookTemplate`.
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// The last publish date of solution content item.
        /// </summary>
        [Output("lastPublishDate")]
        public Output<string?> LastPublishDate { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Sentinel Metadata. Changing this forces a new Sentinel Metadata to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the parent resource ID of the content item, which the metadata belongs to.
        /// </summary>
        [Output("parentId")]
        public Output<string> ParentId { get; private set; } = null!;

        [Output("previewImages")]
        public Output<ImmutableArray<string>> PreviewImages { get; private set; } = null!;

        [Output("previewImagesDarks")]
        public Output<ImmutableArray<string>> PreviewImagesDarks { get; private set; } = null!;

        /// <summary>
        /// Specifies a list of providers for the solution content item.
        /// </summary>
        [Output("providers")]
        public Output<ImmutableArray<string>> Providers { get; private set; } = null!;

        /// <summary>
        /// A `source` block as defined below.
        /// </summary>
        [Output("source")]
        public Output<Outputs.MetadataSource> Source { get; private set; } = null!;

        /// <summary>
        /// A `support` block as defined below.
        /// </summary>
        [Output("support")]
        public Output<Outputs.MetadataSupport?> Support { get; private set; } = null!;

        /// <summary>
        /// Specifies a list of tactics the resource covers.
        /// </summary>
        [Output("threatAnalysisTactics")]
        public Output<ImmutableArray<string>> ThreatAnalysisTactics { get; private set; } = null!;

        /// <summary>
        /// Specifies a list of techniques the resource covers.
        /// </summary>
        [Output("threatAnalysisTechniques")]
        public Output<ImmutableArray<string>> ThreatAnalysisTechniques { get; private set; } = null!;

        /// <summary>
        /// Version of the content.
        /// </summary>
        [Output("version")]
        public Output<string?> Version { get; private set; } = null!;

        /// <summary>
        /// The ID of the Log Analytics Workspace. Changing this forces a new Sentinel Metadata to be created.
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a Metadata resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Metadata(string name, MetadataArgs args, CustomResourceOptions? options = null)
            : base("azure:sentinel/metadata:Metadata", name, args ?? new MetadataArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Metadata(string name, Input<string> id, MetadataState? state = null, CustomResourceOptions? options = null)
            : base("azure:sentinel/metadata:Metadata", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Metadata resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Metadata Get(string name, Input<string> id, MetadataState? state = null, CustomResourceOptions? options = null)
        {
            return new Metadata(name, id, state, options);
        }
    }

    public sealed class MetadataArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `author` blocks as defined below.
        /// </summary>
        [Input("author")]
        public Input<Inputs.MetadataAuthorArgs>? Author { get; set; }

        /// <summary>
        /// A `category` block as defined below.
        /// </summary>
        [Input("category")]
        public Input<Inputs.MetadataCategoryArgs>? Category { get; set; }

        /// <summary>
        /// The ID of the content. Used to identify dependencies and content from solutions or community.
        /// </summary>
        [Input("contentId", required: true)]
        public Input<string> ContentId { get; set; } = null!;

        /// <summary>
        /// Schema version of the content. Can be used to distinguish between flow based on the schema version.
        /// </summary>
        [Input("contentSchemaVersion")]
        public Input<string>? ContentSchemaVersion { get; set; }

        /// <summary>
        /// The Custom version of the content.
        /// </summary>
        [Input("customVersion")]
        public Input<string>? CustomVersion { get; set; }

        /// <summary>
        /// A JSON formatted `dependency` block as defined below. Dependency for the content item, what other content items it requires to work.
        /// </summary>
        [Input("dependency")]
        public Input<string>? Dependency { get; set; }

        /// <summary>
        /// The first publish date of solution content item.
        /// </summary>
        [Input("firstPublishDate")]
        public Input<string>? FirstPublishDate { get; set; }

        /// <summary>
        /// The ID of the icon, this id can be fetched from the solution template.
        /// </summary>
        [Input("iconId")]
        public Input<string>? IconId { get; set; }

        /// <summary>
        /// The kind of content the metadata is for. Possible values are `AnalyticsRule`, `AnalyticsRuleTemplate`, `AutomationRule`, `AzureFunction`, `DataConnector`, `DataType`, `HuntingQuery`, `InvestigationQuery`, `LogicAppsCustomConnector`, `Parser`, `Playbook`, `PlaybookTemplate`, `Solution`, `Watchlist`, `WatchlistTemplate`, `Workbook` and `WorkbookTemplate`.
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        /// <summary>
        /// The last publish date of solution content item.
        /// </summary>
        [Input("lastPublishDate")]
        public Input<string>? LastPublishDate { get; set; }

        /// <summary>
        /// The name which should be used for this Sentinel Metadata. Changing this forces a new Sentinel Metadata to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the parent resource ID of the content item, which the metadata belongs to.
        /// </summary>
        [Input("parentId", required: true)]
        public Input<string> ParentId { get; set; } = null!;

        [Input("previewImages")]
        private InputList<string>? _previewImages;
        public InputList<string> PreviewImages
        {
            get => _previewImages ?? (_previewImages = new InputList<string>());
            set => _previewImages = value;
        }

        [Input("previewImagesDarks")]
        private InputList<string>? _previewImagesDarks;
        public InputList<string> PreviewImagesDarks
        {
            get => _previewImagesDarks ?? (_previewImagesDarks = new InputList<string>());
            set => _previewImagesDarks = value;
        }

        [Input("providers")]
        private InputList<string>? _providers;

        /// <summary>
        /// Specifies a list of providers for the solution content item.
        /// </summary>
        public InputList<string> Providers
        {
            get => _providers ?? (_providers = new InputList<string>());
            set => _providers = value;
        }

        /// <summary>
        /// A `source` block as defined below.
        /// </summary>
        [Input("source")]
        public Input<Inputs.MetadataSourceArgs>? Source { get; set; }

        /// <summary>
        /// A `support` block as defined below.
        /// </summary>
        [Input("support")]
        public Input<Inputs.MetadataSupportArgs>? Support { get; set; }

        [Input("threatAnalysisTactics")]
        private InputList<string>? _threatAnalysisTactics;

        /// <summary>
        /// Specifies a list of tactics the resource covers.
        /// </summary>
        public InputList<string> ThreatAnalysisTactics
        {
            get => _threatAnalysisTactics ?? (_threatAnalysisTactics = new InputList<string>());
            set => _threatAnalysisTactics = value;
        }

        [Input("threatAnalysisTechniques")]
        private InputList<string>? _threatAnalysisTechniques;

        /// <summary>
        /// Specifies a list of techniques the resource covers.
        /// </summary>
        public InputList<string> ThreatAnalysisTechniques
        {
            get => _threatAnalysisTechniques ?? (_threatAnalysisTechniques = new InputList<string>());
            set => _threatAnalysisTechniques = value;
        }

        /// <summary>
        /// Version of the content.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// The ID of the Log Analytics Workspace. Changing this forces a new Sentinel Metadata to be created.
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        public MetadataArgs()
        {
        }
        public static new MetadataArgs Empty => new MetadataArgs();
    }

    public sealed class MetadataState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `author` blocks as defined below.
        /// </summary>
        [Input("author")]
        public Input<Inputs.MetadataAuthorGetArgs>? Author { get; set; }

        /// <summary>
        /// A `category` block as defined below.
        /// </summary>
        [Input("category")]
        public Input<Inputs.MetadataCategoryGetArgs>? Category { get; set; }

        /// <summary>
        /// The ID of the content. Used to identify dependencies and content from solutions or community.
        /// </summary>
        [Input("contentId")]
        public Input<string>? ContentId { get; set; }

        /// <summary>
        /// Schema version of the content. Can be used to distinguish between flow based on the schema version.
        /// </summary>
        [Input("contentSchemaVersion")]
        public Input<string>? ContentSchemaVersion { get; set; }

        /// <summary>
        /// The Custom version of the content.
        /// </summary>
        [Input("customVersion")]
        public Input<string>? CustomVersion { get; set; }

        /// <summary>
        /// A JSON formatted `dependency` block as defined below. Dependency for the content item, what other content items it requires to work.
        /// </summary>
        [Input("dependency")]
        public Input<string>? Dependency { get; set; }

        /// <summary>
        /// The first publish date of solution content item.
        /// </summary>
        [Input("firstPublishDate")]
        public Input<string>? FirstPublishDate { get; set; }

        /// <summary>
        /// The ID of the icon, this id can be fetched from the solution template.
        /// </summary>
        [Input("iconId")]
        public Input<string>? IconId { get; set; }

        /// <summary>
        /// The kind of content the metadata is for. Possible values are `AnalyticsRule`, `AnalyticsRuleTemplate`, `AutomationRule`, `AzureFunction`, `DataConnector`, `DataType`, `HuntingQuery`, `InvestigationQuery`, `LogicAppsCustomConnector`, `Parser`, `Playbook`, `PlaybookTemplate`, `Solution`, `Watchlist`, `WatchlistTemplate`, `Workbook` and `WorkbookTemplate`.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// The last publish date of solution content item.
        /// </summary>
        [Input("lastPublishDate")]
        public Input<string>? LastPublishDate { get; set; }

        /// <summary>
        /// The name which should be used for this Sentinel Metadata. Changing this forces a new Sentinel Metadata to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the parent resource ID of the content item, which the metadata belongs to.
        /// </summary>
        [Input("parentId")]
        public Input<string>? ParentId { get; set; }

        [Input("previewImages")]
        private InputList<string>? _previewImages;
        public InputList<string> PreviewImages
        {
            get => _previewImages ?? (_previewImages = new InputList<string>());
            set => _previewImages = value;
        }

        [Input("previewImagesDarks")]
        private InputList<string>? _previewImagesDarks;
        public InputList<string> PreviewImagesDarks
        {
            get => _previewImagesDarks ?? (_previewImagesDarks = new InputList<string>());
            set => _previewImagesDarks = value;
        }

        [Input("providers")]
        private InputList<string>? _providers;

        /// <summary>
        /// Specifies a list of providers for the solution content item.
        /// </summary>
        public InputList<string> Providers
        {
            get => _providers ?? (_providers = new InputList<string>());
            set => _providers = value;
        }

        /// <summary>
        /// A `source` block as defined below.
        /// </summary>
        [Input("source")]
        public Input<Inputs.MetadataSourceGetArgs>? Source { get; set; }

        /// <summary>
        /// A `support` block as defined below.
        /// </summary>
        [Input("support")]
        public Input<Inputs.MetadataSupportGetArgs>? Support { get; set; }

        [Input("threatAnalysisTactics")]
        private InputList<string>? _threatAnalysisTactics;

        /// <summary>
        /// Specifies a list of tactics the resource covers.
        /// </summary>
        public InputList<string> ThreatAnalysisTactics
        {
            get => _threatAnalysisTactics ?? (_threatAnalysisTactics = new InputList<string>());
            set => _threatAnalysisTactics = value;
        }

        [Input("threatAnalysisTechniques")]
        private InputList<string>? _threatAnalysisTechniques;

        /// <summary>
        /// Specifies a list of techniques the resource covers.
        /// </summary>
        public InputList<string> ThreatAnalysisTechniques
        {
            get => _threatAnalysisTechniques ?? (_threatAnalysisTechniques = new InputList<string>());
            set => _threatAnalysisTechniques = value;
        }

        /// <summary>
        /// Version of the content.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// The ID of the Log Analytics Workspace. Changing this forces a new Sentinel Metadata to be created.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public MetadataState()
        {
        }
        public static new MetadataState Empty => new MetadataState();
    }
}