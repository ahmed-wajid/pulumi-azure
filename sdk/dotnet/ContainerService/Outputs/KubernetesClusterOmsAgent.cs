// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class KubernetesClusterOmsAgent
    {
        /// <summary>
        /// The ID of the Log Analytics Workspace which the OMS Agent should send data to.
        /// </summary>
        public readonly string LogAnalyticsWorkspaceId;
        /// <summary>
        /// An `oms_agent_identity` block is exported. The exported attributes are defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.KubernetesClusterOmsAgentOmsAgentIdentity> OmsAgentIdentities;

        [OutputConstructor]
        private KubernetesClusterOmsAgent(
            string logAnalyticsWorkspaceId,

            ImmutableArray<Outputs.KubernetesClusterOmsAgentOmsAgentIdentity> omsAgentIdentities)
        {
            LogAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            OmsAgentIdentities = omsAgentIdentities;
        }
    }
}