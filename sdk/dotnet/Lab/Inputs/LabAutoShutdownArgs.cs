// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Lab.Inputs
{

    public sealed class LabAutoShutdownArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The amount of time a VM will stay running after a user disconnects if this behavior is enabled. This value must be formatted as an ISO 8601 string.
        /// 
        /// &gt; **NOTE:** The `shutdownOnDisconnect` is `Disabled` when `disconnect_delay` isn't specified.
        /// </summary>
        [Input("disconnectDelay")]
        public Input<string>? DisconnectDelay { get; set; }

        /// <summary>
        /// The amount of time a VM will idle before it is shutdown if this behavior is enabled. This value must be formatted as an ISO 8601 string.
        /// </summary>
        [Input("idleDelay")]
        public Input<string>? IdleDelay { get; set; }

        /// <summary>
        /// The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled. This value must be formatted as an ISO 8601 string.
        /// 
        /// &gt; **NOTE:** The `shutdownWhenNotConnected` is `Disabled` when `no_connect_delay` isn't specified.
        /// </summary>
        [Input("noConnectDelay")]
        public Input<string>? NoConnectDelay { get; set; }

        /// <summary>
        /// A VM will get shutdown when it has idled for a period of time. Possible values are `LowUsage` and `UserAbsence`.
        /// 
        /// &gt; **NOTE:** This property is `None` when it isn't specified. No need to set `idle_delay` when `shutdown_on_idle` isn't specified.
        /// </summary>
        [Input("shutdownOnIdle")]
        public Input<string>? ShutdownOnIdle { get; set; }

        public LabAutoShutdownArgs()
        {
        }
        public static new LabAutoShutdownArgs Empty => new LabAutoShutdownArgs();
    }
}
