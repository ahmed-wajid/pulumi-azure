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
    /// Manages a ServiceBus Namespace Network Rule Set Set.
    /// </summary>
    public partial class NamespaceNetworkRuleSet : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the default action for the ServiceBus Namespace Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        /// </summary>
        [Output("defaultAction")]
        public Output<string?> DefaultAction { get; private set; } = null!;

        /// <summary>
        /// One or more IP Addresses, or CIDR Blocks which should be able to access the ServiceBus Namespace.
        /// </summary>
        [Output("ipRules")]
        public Output<ImmutableArray<string>> IpRules { get; private set; } = null!;

        /// <summary>
        /// Specifies the ServiceBus Namespace name to which to attach the ServiceBus Namespace Network Rule Set. Changing this forces a new resource to be created.
        /// </summary>
        [Output("namespaceName")]
        public Output<string> NamespaceName { get; private set; } = null!;

        /// <summary>
        /// One or more `network_rules` blocks as defined below.
        /// </summary>
        [Output("networkRules")]
        public Output<ImmutableArray<Outputs.NamespaceNetworkRuleSetNetworkRule>> NetworkRules { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group where the ServiceBus Namespace Network Rule Set should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;


        /// <summary>
        /// Create a NamespaceNetworkRuleSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NamespaceNetworkRuleSet(string name, NamespaceNetworkRuleSetArgs args, CustomResourceOptions? options = null)
            : base("azure:servicebus/namespaceNetworkRuleSet:NamespaceNetworkRuleSet", name, args ?? new NamespaceNetworkRuleSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NamespaceNetworkRuleSet(string name, Input<string> id, NamespaceNetworkRuleSetState? state = null, CustomResourceOptions? options = null)
            : base("azure:servicebus/namespaceNetworkRuleSet:NamespaceNetworkRuleSet", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NamespaceNetworkRuleSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NamespaceNetworkRuleSet Get(string name, Input<string> id, NamespaceNetworkRuleSetState? state = null, CustomResourceOptions? options = null)
        {
            return new NamespaceNetworkRuleSet(name, id, state, options);
        }
    }

    public sealed class NamespaceNetworkRuleSetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the default action for the ServiceBus Namespace Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        /// </summary>
        [Input("defaultAction")]
        public Input<string>? DefaultAction { get; set; }

        [Input("ipRules")]
        private InputList<string>? _ipRules;

        /// <summary>
        /// One or more IP Addresses, or CIDR Blocks which should be able to access the ServiceBus Namespace.
        /// </summary>
        public InputList<string> IpRules
        {
            get => _ipRules ?? (_ipRules = new InputList<string>());
            set => _ipRules = value;
        }

        /// <summary>
        /// Specifies the ServiceBus Namespace name to which to attach the ServiceBus Namespace Network Rule Set. Changing this forces a new resource to be created.
        /// </summary>
        [Input("namespaceName", required: true)]
        public Input<string> NamespaceName { get; set; } = null!;

        [Input("networkRules")]
        private InputList<Inputs.NamespaceNetworkRuleSetNetworkRuleArgs>? _networkRules;

        /// <summary>
        /// One or more `network_rules` blocks as defined below.
        /// </summary>
        public InputList<Inputs.NamespaceNetworkRuleSetNetworkRuleArgs> NetworkRules
        {
            get => _networkRules ?? (_networkRules = new InputList<Inputs.NamespaceNetworkRuleSetNetworkRuleArgs>());
            set => _networkRules = value;
        }

        /// <summary>
        /// Specifies the name of the Resource Group where the ServiceBus Namespace Network Rule Set should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public NamespaceNetworkRuleSetArgs()
        {
        }
    }

    public sealed class NamespaceNetworkRuleSetState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the default action for the ServiceBus Namespace Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        /// </summary>
        [Input("defaultAction")]
        public Input<string>? DefaultAction { get; set; }

        [Input("ipRules")]
        private InputList<string>? _ipRules;

        /// <summary>
        /// One or more IP Addresses, or CIDR Blocks which should be able to access the ServiceBus Namespace.
        /// </summary>
        public InputList<string> IpRules
        {
            get => _ipRules ?? (_ipRules = new InputList<string>());
            set => _ipRules = value;
        }

        /// <summary>
        /// Specifies the ServiceBus Namespace name to which to attach the ServiceBus Namespace Network Rule Set. Changing this forces a new resource to be created.
        /// </summary>
        [Input("namespaceName")]
        public Input<string>? NamespaceName { get; set; }

        [Input("networkRules")]
        private InputList<Inputs.NamespaceNetworkRuleSetNetworkRuleGetArgs>? _networkRules;

        /// <summary>
        /// One or more `network_rules` blocks as defined below.
        /// </summary>
        public InputList<Inputs.NamespaceNetworkRuleSetNetworkRuleGetArgs> NetworkRules
        {
            get => _networkRules ?? (_networkRules = new InputList<Inputs.NamespaceNetworkRuleSetNetworkRuleGetArgs>());
            set => _networkRules = value;
        }

        /// <summary>
        /// Specifies the name of the Resource Group where the ServiceBus Namespace Network Rule Set should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        public NamespaceNetworkRuleSetState()
        {
        }
    }
}