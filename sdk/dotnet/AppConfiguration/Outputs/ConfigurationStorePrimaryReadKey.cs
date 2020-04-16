// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppConfiguration.Outputs
{

    [OutputType]
    public sealed class ConfigurationStorePrimaryReadKey
    {
        /// <summary>
        /// The Connection String for this Access Key - comprising of the Endpoint, ID and Secret.
        /// </summary>
        public readonly string? ConnectionString;
        /// <summary>
        /// The ID of the Access Key.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The Secret of the Access Key.
        /// </summary>
        public readonly string? Secret;

        [OutputConstructor]
        private ConfigurationStorePrimaryReadKey(
            string? connectionString,

            string? id,

            string? secret)
        {
            ConnectionString = connectionString;
            Id = id;
            Secret = secret;
        }
    }
}