// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Inputs
{

    public sealed class ManagedInstanceFailoverGroupPartnerRegionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Azure Region where the Managed Instance Failover Group should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The partner replication role of the Managed Instance Failover Group.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public ManagedInstanceFailoverGroupPartnerRegionGetArgs()
        {
        }
    }
}