// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile.Outputs
{

    [OutputType]
    public sealed class NetworkServicePccRule
    {
        /// <summary>
        /// Specifies the name of the rule. This must be unique within the parent service. You must not use any of the following reserved strings - `default`, `requested` or `service`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A precedence value that is used to decide between data flow policy rules when identifying the QoS values to use for a particular SIM. A lower value means a higher priority. This value should be unique among all data flow policy rules configured in the mobile network. Must be between `0` and `255`.
        /// </summary>
        public readonly int Precedence;
        /// <summary>
        /// A `qos_policy` block as defined below. The QoS policy to use for packets matching this rule. If this field is not specified then the Service will define the QoS settings.
        /// </summary>
        public readonly Outputs.NetworkServicePccRuleQosPolicy? QosPolicy;
        /// <summary>
        /// A `service_data_flow_template` block as defined below. The set of service data flow templates to use for this PCC rule.
        /// </summary>
        public readonly ImmutableArray<Outputs.NetworkServicePccRuleServiceDataFlowTemplate> ServiceDataFlowTemplates;
        /// <summary>
        /// Determines whether flows that match this data flow policy rule are permitted. Defaults to `true`.
        /// </summary>
        public readonly bool? TrafficControlEnabled;

        [OutputConstructor]
        private NetworkServicePccRule(
            string name,

            int precedence,

            Outputs.NetworkServicePccRuleQosPolicy? qosPolicy,

            ImmutableArray<Outputs.NetworkServicePccRuleServiceDataFlowTemplate> serviceDataFlowTemplates,

            bool? trafficControlEnabled)
        {
            Name = name;
            Precedence = precedence;
            QosPolicy = qosPolicy;
            ServiceDataFlowTemplates = serviceDataFlowTemplates;
            TrafficControlEnabled = trafficControlEnabled;
        }
    }
}