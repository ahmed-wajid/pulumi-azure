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
    public sealed class GetApplicationGatewayGlobalResult
    {
        /// <summary>
        /// Whether Application Gateway's Request buffer is enabled.
        /// </summary>
        public readonly bool RequestBufferingEnabled;
        /// <summary>
        /// Whether Application Gateway's Response buffer is enabled.
        /// </summary>
        public readonly bool ResponseBufferingEnabled;

        [OutputConstructor]
        private GetApplicationGatewayGlobalResult(
            bool requestBufferingEnabled,

            bool responseBufferingEnabled)
        {
            RequestBufferingEnabled = requestBufferingEnabled;
            ResponseBufferingEnabled = responseBufferingEnabled;
        }
    }
}