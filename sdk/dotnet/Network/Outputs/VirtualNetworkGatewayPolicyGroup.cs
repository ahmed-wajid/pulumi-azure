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
    public sealed class VirtualNetworkGatewayPolicyGroup
    {
        /// <summary>
        /// Is this a Default Virtual Network Gateway Policy Group? Defaults to `false`.
        /// </summary>
        public readonly bool? IsDefault;
        /// <summary>
        /// The name of the Virtual Network Gateway Policy Group.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// One or more `policy_member` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.VirtualNetworkGatewayPolicyGroupPolicyMember> PolicyMembers;
        /// <summary>
        /// The priority for the Virtual Network Gateway Policy Group. Defaults to `0`.
        /// </summary>
        public readonly int? Priority;

        [OutputConstructor]
        private VirtualNetworkGatewayPolicyGroup(
            bool? isDefault,

            string name,

            ImmutableArray<Outputs.VirtualNetworkGatewayPolicyGroupPolicyMember> policyMembers,

            int? priority)
        {
            IsDefault = isDefault;
            Name = name;
            PolicyMembers = policyMembers;
            Priority = priority;
        }
    }
}