// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation
{
    /// <summary>
    /// Manages a Automation Hybrid Runbook Worker Group.
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
    ///     var example = new Azure.Automation.HybridRunbookWorkerGroup("example", new()
    ///     {
    ///         AutomationAccountName = "example",
    ///         ResourceGroupName = "example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Automations can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:automation/hybridRunbookWorkerGroup:HybridRunbookWorkerGroup example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/hybridRunbookWorkerGroups/grp1
    /// ```
    /// </summary>
    [AzureResourceType("azure:automation/hybridRunbookWorkerGroup:HybridRunbookWorkerGroup")]
    public partial class HybridRunbookWorkerGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the Automation Account in which the Runbook Worker Group is created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("automationAccountName")]
        public Output<string> AutomationAccountName { get; private set; } = null!;

        /// <summary>
        /// The name of resource type `azure.automation.Credential` to use for hybrid worker.
        /// </summary>
        [Output("credentialName")]
        public Output<string?> CredentialName { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Automation Account Runbook Worker Group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;


        /// <summary>
        /// Create a HybridRunbookWorkerGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HybridRunbookWorkerGroup(string name, HybridRunbookWorkerGroupArgs args, CustomResourceOptions? options = null)
            : base("azure:automation/hybridRunbookWorkerGroup:HybridRunbookWorkerGroup", name, args ?? new HybridRunbookWorkerGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HybridRunbookWorkerGroup(string name, Input<string> id, HybridRunbookWorkerGroupState? state = null, CustomResourceOptions? options = null)
            : base("azure:automation/hybridRunbookWorkerGroup:HybridRunbookWorkerGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HybridRunbookWorkerGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HybridRunbookWorkerGroup Get(string name, Input<string> id, HybridRunbookWorkerGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new HybridRunbookWorkerGroup(name, id, state, options);
        }
    }

    public sealed class HybridRunbookWorkerGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Automation Account in which the Runbook Worker Group is created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("automationAccountName", required: true)]
        public Input<string> AutomationAccountName { get; set; } = null!;

        /// <summary>
        /// The name of resource type `azure.automation.Credential` to use for hybrid worker.
        /// </summary>
        [Input("credentialName")]
        public Input<string>? CredentialName { get; set; }

        /// <summary>
        /// The name which should be used for this Automation Account Runbook Worker Group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public HybridRunbookWorkerGroupArgs()
        {
        }
        public static new HybridRunbookWorkerGroupArgs Empty => new HybridRunbookWorkerGroupArgs();
    }

    public sealed class HybridRunbookWorkerGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Automation Account in which the Runbook Worker Group is created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("automationAccountName")]
        public Input<string>? AutomationAccountName { get; set; }

        /// <summary>
        /// The name of resource type `azure.automation.Credential` to use for hybrid worker.
        /// </summary>
        [Input("credentialName")]
        public Input<string>? CredentialName { get; set; }

        /// <summary>
        /// The name which should be used for this Automation Account Runbook Worker Group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        public HybridRunbookWorkerGroupState()
        {
        }
        public static new HybridRunbookWorkerGroupState Empty => new HybridRunbookWorkerGroupState();
    }
}