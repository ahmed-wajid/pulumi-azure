// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation.Outputs
{

    [OutputType]
    public sealed class SoftwareUpdateConfigurationTargetAzureQuery
    {
        /// <summary>
        /// Specifies a list of locations to scope the query to.
        /// </summary>
        public readonly ImmutableArray<string> Locations;
        /// <summary>
        /// Specifies a list of Subscription or Resource Group ARM Ids to query.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;
        /// <summary>
        /// Specifies how the specified tags to filter VMs. Possible values are `Any` and `All`.
        /// </summary>
        public readonly string? TagFilter;
        /// <summary>
        /// A mapping of tags used for query filter.
        /// </summary>
        public readonly ImmutableArray<Outputs.SoftwareUpdateConfigurationTargetAzureQueryTag> Tags;

        [OutputConstructor]
        private SoftwareUpdateConfigurationTargetAzureQuery(
            ImmutableArray<string> locations,

            ImmutableArray<string> scopes,

            string? tagFilter,

            ImmutableArray<Outputs.SoftwareUpdateConfigurationTargetAzureQueryTag> tags)
        {
            Locations = locations;
            Scopes = scopes;
            TagFilter = tagFilter;
            Tags = tags;
        }
    }
}