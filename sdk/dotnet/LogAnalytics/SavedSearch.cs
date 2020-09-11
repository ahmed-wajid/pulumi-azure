// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogAnalytics
{
    /// <summary>
    /// Manages a Log Analytics (formally Operational Insights) Saved Search.
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
    ///             Location = "East US",
    ///         });
    ///         var exampleAnalyticsWorkspace = new Azure.OperationalInsights.AnalyticsWorkspace("exampleAnalyticsWorkspace", new Azure.OperationalInsights.AnalyticsWorkspaceArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Sku = "PerGB2018",
    ///             RetentionInDays = 30,
    ///         });
    ///         var exampleSavedSearch = new Azure.LogAnalytics.SavedSearch("exampleSavedSearch", new Azure.LogAnalytics.SavedSearchArgs
    ///         {
    ///             LogAnalyticsWorkspaceId = azurerm_log_analytics_workspace.Test.Id,
    ///             Category = "exampleCategory",
    ///             DisplayName = "exampleDisplayName",
    ///             Query = "exampleQuery",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class SavedSearch : Pulumi.CustomResource
    {
        /// <summary>
        /// The category that the Saved Search will be listed under. Changing this forces a new resource to be created.
        /// </summary>
        [Output("category")]
        public Output<string> Category { get; private set; } = null!;

        /// <summary>
        /// The name that Saved Search will be displayed as. Changing this forces a new resource to be created.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The function alias if the query serves as a function. Changing this forces a new resource to be created.
        /// </summary>
        [Output("functionAlias")]
        public Output<string?> FunctionAlias { get; private set; } = null!;

        /// <summary>
        /// The function parameters if the query serves as a function. Changing this forces a new resource to be created.
        /// </summary>
        [Output("functionParameters")]
        public Output<ImmutableArray<string>> FunctionParameters { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the Log Analytics Workspace that the Saved Search will be associated with. Changing this forces a new resource to be created.
        /// </summary>
        [Output("logAnalyticsWorkspaceId")]
        public Output<string> LogAnalyticsWorkspaceId { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Log Analytics Saved Search. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The query expression for the saved search. Changing this forces a new resource to be created.
        /// </summary>
        [Output("query")]
        public Output<string> Query { get; private set; } = null!;


        /// <summary>
        /// Create a SavedSearch resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SavedSearch(string name, SavedSearchArgs args, CustomResourceOptions? options = null)
            : base("azure:loganalytics/savedSearch:SavedSearch", name, args ?? new SavedSearchArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SavedSearch(string name, Input<string> id, SavedSearchState? state = null, CustomResourceOptions? options = null)
            : base("azure:loganalytics/savedSearch:SavedSearch", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SavedSearch resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SavedSearch Get(string name, Input<string> id, SavedSearchState? state = null, CustomResourceOptions? options = null)
        {
            return new SavedSearch(name, id, state, options);
        }
    }

    public sealed class SavedSearchArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The category that the Saved Search will be listed under. Changing this forces a new resource to be created.
        /// </summary>
        [Input("category", required: true)]
        public Input<string> Category { get; set; } = null!;

        /// <summary>
        /// The name that Saved Search will be displayed as. Changing this forces a new resource to be created.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The function alias if the query serves as a function. Changing this forces a new resource to be created.
        /// </summary>
        [Input("functionAlias")]
        public Input<string>? FunctionAlias { get; set; }

        [Input("functionParameters")]
        private InputList<string>? _functionParameters;

        /// <summary>
        /// The function parameters if the query serves as a function. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<string> FunctionParameters
        {
            get => _functionParameters ?? (_functionParameters = new InputList<string>());
            set => _functionParameters = value;
        }

        /// <summary>
        /// Specifies the ID of the Log Analytics Workspace that the Saved Search will be associated with. Changing this forces a new resource to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId", required: true)]
        public Input<string> LogAnalyticsWorkspaceId { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Log Analytics Saved Search. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The query expression for the saved search. Changing this forces a new resource to be created.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        public SavedSearchArgs()
        {
        }
    }

    public sealed class SavedSearchState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The category that the Saved Search will be listed under. Changing this forces a new resource to be created.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// The name that Saved Search will be displayed as. Changing this forces a new resource to be created.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The function alias if the query serves as a function. Changing this forces a new resource to be created.
        /// </summary>
        [Input("functionAlias")]
        public Input<string>? FunctionAlias { get; set; }

        [Input("functionParameters")]
        private InputList<string>? _functionParameters;

        /// <summary>
        /// The function parameters if the query serves as a function. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<string> FunctionParameters
        {
            get => _functionParameters ?? (_functionParameters = new InputList<string>());
            set => _functionParameters = value;
        }

        /// <summary>
        /// Specifies the ID of the Log Analytics Workspace that the Saved Search will be associated with. Changing this forces a new resource to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId")]
        public Input<string>? LogAnalyticsWorkspaceId { get; set; }

        /// <summary>
        /// Specifies the name of the Log Analytics Saved Search. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The query expression for the saved search. Changing this forces a new resource to be created.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        public SavedSearchState()
        {
        }
    }
}