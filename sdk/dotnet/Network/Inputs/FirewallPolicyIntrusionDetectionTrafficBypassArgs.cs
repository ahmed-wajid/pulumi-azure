// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class FirewallPolicyIntrusionDetectionTrafficBypassArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description for this bypass traffic setting.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("destinationAddresses")]
        private InputList<string>? _destinationAddresses;

        /// <summary>
        /// Specifies a list of destination IP addresses that shall be bypassed by intrusion detection.
        /// </summary>
        public InputList<string> DestinationAddresses
        {
            get => _destinationAddresses ?? (_destinationAddresses = new InputList<string>());
            set => _destinationAddresses = value;
        }

        [Input("destinationIpGroups")]
        private InputList<string>? _destinationIpGroups;

        /// <summary>
        /// Specifies a list of destination IP groups that shall be bypassed by intrusion detection.
        /// </summary>
        public InputList<string> DestinationIpGroups
        {
            get => _destinationIpGroups ?? (_destinationIpGroups = new InputList<string>());
            set => _destinationIpGroups = value;
        }

        [Input("destinationPorts")]
        private InputList<string>? _destinationPorts;

        /// <summary>
        /// Specifies a list of destination IP ports that shall be bypassed by intrusion detection.
        /// </summary>
        public InputList<string> DestinationPorts
        {
            get => _destinationPorts ?? (_destinationPorts = new InputList<string>());
            set => _destinationPorts = value;
        }

        /// <summary>
        /// The name which should be used for this bypass traffic setting.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The protocols any of "ANY", "TCP", "ICMP", "UDP" that shall be bypassed by intrusion detection.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        [Input("sourceAddresses")]
        private InputList<string>? _sourceAddresses;

        /// <summary>
        /// Specifies a list of source addresses that shall be bypassed by intrusion detection.
        /// </summary>
        public InputList<string> SourceAddresses
        {
            get => _sourceAddresses ?? (_sourceAddresses = new InputList<string>());
            set => _sourceAddresses = value;
        }

        [Input("sourceIpGroups")]
        private InputList<string>? _sourceIpGroups;

        /// <summary>
        /// Specifies a list of source ip groups that shall be bypassed by intrusion detection.
        /// </summary>
        public InputList<string> SourceIpGroups
        {
            get => _sourceIpGroups ?? (_sourceIpGroups = new InputList<string>());
            set => _sourceIpGroups = value;
        }

        public FirewallPolicyIntrusionDetectionTrafficBypassArgs()
        {
        }
    }
}