// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class GetNetworkManagerCrossTenantScopeResult
    {
        /// <summary>
        /// A list of management groups used as cross tenant scope for the Network Manager.
        /// </summary>
        public readonly ImmutableArray<string> ManagementGroups;
        /// <summary>
        /// A list of subscriptions used as cross tenant scope for the Network Manager.
        /// </summary>
        public readonly ImmutableArray<string> Subscriptions;
        /// <summary>
        /// The tenant ID of the cross tenant scope.
        /// </summary>
        public readonly string TenantId;

        [OutputConstructor]
        private GetNetworkManagerCrossTenantScopeResult(
            ImmutableArray<string> managementGroups,

            ImmutableArray<string> subscriptions,

            string tenantId)
        {
            ManagementGroups = managementGroups;
            Subscriptions = subscriptions;
            TenantId = tenantId;
        }
    }
}