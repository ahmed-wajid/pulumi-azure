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
    public sealed class GetNetworkPacketCoreControlPlaneIdentityResult
    {
        /// <summary>
        /// A list of User Assigned Managed Identity IDs assigned to this resource.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        /// <summary>
        /// The platform type where the packet core is deployed.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetNetworkPacketCoreControlPlaneIdentityResult(
            ImmutableArray<string> identityIds,

            string type)
        {
            IdentityIds = identityIds;
            Type = type;
        }
    }
}