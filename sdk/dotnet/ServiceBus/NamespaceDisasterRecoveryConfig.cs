// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ServiceBus
{
    /// <summary>
    /// Manages a Disaster Recovery Config for a Service Bus Namespace.
    /// 
    /// &gt; **NOTE:** Disaster Recovery Config is a Premium Sku only capability.
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
    ///         var primary = new Azure.ServiceBus.Namespace("primary", new Azure.ServiceBus.NamespaceArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Sku = "Premium",
    ///             Capacity = 1,
    ///         });
    ///         var secondary = new Azure.ServiceBus.Namespace("secondary", new Azure.ServiceBus.NamespaceArgs
    ///         {
    ///             Location = "West US",
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Sku = "Premium",
    ///             Capacity = 1,
    ///         });
    ///         var exampleNamespaceDisasterRecoveryConfig = new Azure.ServiceBus.NamespaceDisasterRecoveryConfig("exampleNamespaceDisasterRecoveryConfig", new Azure.ServiceBus.NamespaceDisasterRecoveryConfigArgs
    ///         {
    ///             PrimaryNamespaceId = primary.Id,
    ///             PartnerNamespaceId = azurerm_resource_group.Secondary.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Service Bus DR configs can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:servicebus/namespaceDisasterRecoveryConfig:NamespaceDisasterRecoveryConfig config1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ServiceBus/namespaces/namespace1/disasterRecoveryConfigs/config1
    /// ```
    /// </summary>
    [AzureResourceType("azure:servicebus/namespaceDisasterRecoveryConfig:NamespaceDisasterRecoveryConfig")]
    public partial class NamespaceDisasterRecoveryConfig : Pulumi.CustomResource
    {
        /// <summary>
        /// The alias Primary Connection String for the ServiceBus Namespace.
        /// </summary>
        [Output("aliasPrimaryConnectionString")]
        public Output<string> AliasPrimaryConnectionString { get; private set; } = null!;

        /// <summary>
        /// The alias Secondary Connection String for the ServiceBus Namespace
        /// </summary>
        [Output("aliasSecondaryConnectionString")]
        public Output<string> AliasSecondaryConnectionString { get; private set; } = null!;

        /// <summary>
        /// The primary access key for the authorization rule `RootManageSharedAccessKey`.
        /// </summary>
        [Output("defaultPrimaryKey")]
        public Output<string> DefaultPrimaryKey { get; private set; } = null!;

        /// <summary>
        /// The secondary access key for the authorization rule `RootManageSharedAccessKey`.
        /// </summary>
        [Output("defaultSecondaryKey")]
        public Output<string> DefaultSecondaryKey { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the Service Bus Namespace to replicate to.
        /// </summary>
        [Output("partnerNamespaceId")]
        public Output<string> PartnerNamespaceId { get; private set; } = null!;

        /// <summary>
        /// The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
        /// </summary>
        [Output("primaryNamespaceId")]
        public Output<string> PrimaryNamespaceId { get; private set; } = null!;


        /// <summary>
        /// Create a NamespaceDisasterRecoveryConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NamespaceDisasterRecoveryConfig(string name, NamespaceDisasterRecoveryConfigArgs args, CustomResourceOptions? options = null)
            : base("azure:servicebus/namespaceDisasterRecoveryConfig:NamespaceDisasterRecoveryConfig", name, args ?? new NamespaceDisasterRecoveryConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NamespaceDisasterRecoveryConfig(string name, Input<string> id, NamespaceDisasterRecoveryConfigState? state = null, CustomResourceOptions? options = null)
            : base("azure:servicebus/namespaceDisasterRecoveryConfig:NamespaceDisasterRecoveryConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NamespaceDisasterRecoveryConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NamespaceDisasterRecoveryConfig Get(string name, Input<string> id, NamespaceDisasterRecoveryConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new NamespaceDisasterRecoveryConfig(name, id, state, options);
        }
    }

    public sealed class NamespaceDisasterRecoveryConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Service Bus Namespace to replicate to.
        /// </summary>
        [Input("partnerNamespaceId", required: true)]
        public Input<string> PartnerNamespaceId { get; set; } = null!;

        /// <summary>
        /// The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
        /// </summary>
        [Input("primaryNamespaceId", required: true)]
        public Input<string> PrimaryNamespaceId { get; set; } = null!;

        public NamespaceDisasterRecoveryConfigArgs()
        {
        }
    }

    public sealed class NamespaceDisasterRecoveryConfigState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The alias Primary Connection String for the ServiceBus Namespace.
        /// </summary>
        [Input("aliasPrimaryConnectionString")]
        public Input<string>? AliasPrimaryConnectionString { get; set; }

        /// <summary>
        /// The alias Secondary Connection String for the ServiceBus Namespace
        /// </summary>
        [Input("aliasSecondaryConnectionString")]
        public Input<string>? AliasSecondaryConnectionString { get; set; }

        /// <summary>
        /// The primary access key for the authorization rule `RootManageSharedAccessKey`.
        /// </summary>
        [Input("defaultPrimaryKey")]
        public Input<string>? DefaultPrimaryKey { get; set; }

        /// <summary>
        /// The secondary access key for the authorization rule `RootManageSharedAccessKey`.
        /// </summary>
        [Input("defaultSecondaryKey")]
        public Input<string>? DefaultSecondaryKey { get; set; }

        /// <summary>
        /// Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Service Bus Namespace to replicate to.
        /// </summary>
        [Input("partnerNamespaceId")]
        public Input<string>? PartnerNamespaceId { get; set; }

        /// <summary>
        /// The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
        /// </summary>
        [Input("primaryNamespaceId")]
        public Input<string>? PrimaryNamespaceId { get; set; }

        public NamespaceDisasterRecoveryConfigState()
        {
        }
    }
}