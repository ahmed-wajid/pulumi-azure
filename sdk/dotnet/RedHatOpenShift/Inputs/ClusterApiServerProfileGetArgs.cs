// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.RedHatOpenShift.Inputs
{

    public sealed class ClusterApiServerProfileGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP Address the Ingress Profile is associated with.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The URL the API Server Profile is associated with.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// Cluster API server visibility. Supported values are `Public` and `Private`. Defaults to `Public`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("visibility", required: true)]
        public Input<string> Visibility { get; set; } = null!;

        public ClusterApiServerProfileGetArgs()
        {
        }
        public static new ClusterApiServerProfileGetArgs Empty => new ClusterApiServerProfileGetArgs();
    }
}