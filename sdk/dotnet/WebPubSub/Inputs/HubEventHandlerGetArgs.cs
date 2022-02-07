// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.WebPubSub.Inputs
{

    public sealed class HubEventHandlerGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `auth` block as defined below.
        /// </summary>
        [Input("auth")]
        public Input<Inputs.HubEventHandlerAuthGetArgs>? Auth { get; set; }

        [Input("systemEvents")]
        private InputList<string>? _systemEvents;

        /// <summary>
        /// Specify the list of system events. Supported values are `connect`, `connected`
        /// and `disconnected`.
        /// </summary>
        public InputList<string> SystemEvents
        {
            get => _systemEvents ?? (_systemEvents = new InputList<string>());
            set => _systemEvents = value;
        }

        /// <summary>
        /// The Event Handler URL Template. Two predefined parameters `{hub}` and `{event}` are
        /// available to use in the template. The value of the EventHandler URL is dynamically calculated when the client request
        /// comes in. Example: `http://example.com/api/{hub}/{event}`.
        /// </summary>
        [Input("urlTemplate", required: true)]
        public Input<string> UrlTemplate { get; set; } = null!;

        /// <summary>
        /// Specify the matching event names. There are 3 kind of patterns supported:
        /// - `*` matches any event name
        /// - `,` Combine multiple events with `,` for example `event1,event2`, it matches event `event1` and `event2`
        /// - The single event name, for example `event1`, it matches `event1`.
        /// </summary>
        [Input("userEventPattern")]
        public Input<string>? UserEventPattern { get; set; }

        public HubEventHandlerGetArgs()
        {
        }
    }
}