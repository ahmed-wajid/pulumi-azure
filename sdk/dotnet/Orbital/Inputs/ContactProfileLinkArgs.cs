// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Orbital.Inputs
{

    public sealed class ContactProfileLinkArgs : global::Pulumi.ResourceArgs
    {
        [Input("channels", required: true)]
        private InputList<Inputs.ContactProfileLinkChannelArgs>? _channels;

        /// <summary>
        /// A list of contact profile link channels. A `channel` block as defined below.
        /// </summary>
        public InputList<Inputs.ContactProfileLinkChannelArgs> Channels
        {
            get => _channels ?? (_channels = new InputList<Inputs.ContactProfileLinkChannelArgs>());
            set => _channels = value;
        }

        /// <summary>
        /// Direction of the link. Possible values are `Uplink` and `Downlink`.
        /// </summary>
        [Input("direction", required: true)]
        public Input<string> Direction { get; set; } = null!;

        /// <summary>
        /// Name of the link.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Polarization of the link. Possible values are `RHCP`, `LHCP`, `linearVertical` and `linearHorizonal`.
        /// </summary>
        [Input("polarization", required: true)]
        public Input<string> Polarization { get; set; } = null!;

        public ContactProfileLinkArgs()
        {
        }
        public static new ContactProfileLinkArgs Empty => new ContactProfileLinkArgs();
    }
}