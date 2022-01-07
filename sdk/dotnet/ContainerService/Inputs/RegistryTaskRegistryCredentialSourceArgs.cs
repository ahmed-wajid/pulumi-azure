// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class RegistryTaskRegistryCredentialSourceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The login mode for the source registry. Possible values are `None` and `Default`.
        /// </summary>
        [Input("loginMode", required: true)]
        public Input<string> LoginMode { get; set; } = null!;

        public RegistryTaskRegistryCredentialSourceArgs()
        {
        }
    }
}