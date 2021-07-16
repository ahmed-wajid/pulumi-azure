// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Outputs
{

    [OutputType]
    public sealed class LinkedCustomServiceIntegrationRuntime
    {
        /// <summary>
        /// The integration runtime reference to associate with the Data Factory Linked Service.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A map of parameters to associate with the integration runtime.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Parameters;

        [OutputConstructor]
        private LinkedCustomServiceIntegrationRuntime(
            string name,

            ImmutableDictionary<string, string>? parameters)
        {
            Name = name;
            Parameters = parameters;
        }
    }
}