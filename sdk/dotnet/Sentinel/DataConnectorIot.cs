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
    /// Manages an Iot Data Connector.
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
    ///         Sku = "PerGB2018",
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
    ///     var exampleDataConnectorIot = new Azure.Sentinel.DataConnectorIot("exampleDataConnectorIot", new()
    ///     {
    ///         LogAnalyticsWorkspaceId = exampleAnalyticsSolution.WorkspaceResourceId,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Iot Data Connectors can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:sentinel/dataConnectorIot:DataConnectorIot example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
    /// ```
    /// </summary>
    [AzureResourceType("azure:sentinel/dataConnectorIot:DataConnectorIot")]
    public partial class DataConnectorIot : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Log Analytics Workspace that this Iot Data Connector resides in. Changing this forces a new Iot Data Connector to be created.
        /// </summary>
        [Output("logAnalyticsWorkspaceId")]
        public Output<string> LogAnalyticsWorkspaceId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Iot Data Connector. Changing this forces a new Iot Data Connector to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the subscription that this Iot Data Connector connects to. Changing this forces a new Iot Data Connector to be created.
        /// </summary>
        [Output("subscriptionId")]
        public Output<string> SubscriptionId { get; private set; } = null!;


        /// <summary>
        /// Create a DataConnectorIot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataConnectorIot(string name, DataConnectorIotArgs args, CustomResourceOptions? options = null)
            : base("azure:sentinel/dataConnectorIot:DataConnectorIot", name, args ?? new DataConnectorIotArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataConnectorIot(string name, Input<string> id, DataConnectorIotState? state = null, CustomResourceOptions? options = null)
            : base("azure:sentinel/dataConnectorIot:DataConnectorIot", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataConnectorIot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataConnectorIot Get(string name, Input<string> id, DataConnectorIotState? state = null, CustomResourceOptions? options = null)
        {
            return new DataConnectorIot(name, id, state, options);
        }
    }

    public sealed class DataConnectorIotArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Log Analytics Workspace that this Iot Data Connector resides in. Changing this forces a new Iot Data Connector to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId", required: true)]
        public Input<string> LogAnalyticsWorkspaceId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Iot Data Connector. Changing this forces a new Iot Data Connector to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the subscription that this Iot Data Connector connects to. Changing this forces a new Iot Data Connector to be created.
        /// </summary>
        [Input("subscriptionId")]
        public Input<string>? SubscriptionId { get; set; }

        public DataConnectorIotArgs()
        {
        }
        public static new DataConnectorIotArgs Empty => new DataConnectorIotArgs();
    }

    public sealed class DataConnectorIotState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Log Analytics Workspace that this Iot Data Connector resides in. Changing this forces a new Iot Data Connector to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId")]
        public Input<string>? LogAnalyticsWorkspaceId { get; set; }

        /// <summary>
        /// The name which should be used for this Iot Data Connector. Changing this forces a new Iot Data Connector to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the subscription that this Iot Data Connector connects to. Changing this forces a new Iot Data Connector to be created.
        /// </summary>
        [Input("subscriptionId")]
        public Input<string>? SubscriptionId { get; set; }

        public DataConnectorIotState()
        {
        }
        public static new DataConnectorIotState Empty => new DataConnectorIotState();
    }
}