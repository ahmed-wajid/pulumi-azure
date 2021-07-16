// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class ExpressRouteConnectionRoutingArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Virtual Hub Route Table associated with this Express Route Connection.
        /// </summary>
        [Input("associatedRouteTableId")]
        public Input<string>? AssociatedRouteTableId { get; set; }

        /// <summary>
        /// A `propagated_route_table` block as defined below.
        /// </summary>
        [Input("propagatedRouteTable")]
        public Input<Inputs.ExpressRouteConnectionRoutingPropagatedRouteTableArgs>? PropagatedRouteTable { get; set; }

        public ExpressRouteConnectionRoutingArgs()
        {
        }
    }
}