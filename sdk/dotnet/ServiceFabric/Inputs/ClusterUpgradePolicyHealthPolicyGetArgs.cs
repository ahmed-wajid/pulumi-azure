// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ServiceFabric.Inputs
{

    public sealed class ClusterUpgradePolicyHealthPolicyGetArgs : Pulumi.ResourceArgs
    {
        [Input("maxUnhealthyApplicationsPercent")]
        public Input<int>? MaxUnhealthyApplicationsPercent { get; set; }

        [Input("maxUnhealthyNodesPercent")]
        public Input<int>? MaxUnhealthyNodesPercent { get; set; }

        public ClusterUpgradePolicyHealthPolicyGetArgs()
        {
        }
    }
}