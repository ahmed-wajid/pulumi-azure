// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Nginx.Inputs
{

    public sealed class ConfigurationConfigFileGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the base-64 encoded contents of this config file.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        /// <summary>
        /// Specify the path of this config file.
        /// </summary>
        [Input("virtualPath", required: true)]
        public Input<string> VirtualPath { get; set; } = null!;

        public ConfigurationConfigFileGetArgs()
        {
        }
        public static new ConfigurationConfigFileGetArgs Empty => new ConfigurationConfigFileGetArgs();
    }
}