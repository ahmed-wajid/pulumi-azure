// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Datadog.Outputs
{

    [OutputType]
    public sealed class MonitorTagRuleLog
    {
        /// <summary>
        /// Whether AAD logs should be sent for the Monitor resource?
        /// </summary>
        public readonly bool? AadLogEnabled;
        /// <summary>
        /// A `filter` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.MonitorTagRuleLogFilter> Filters;
        /// <summary>
        /// Whether Azure resource logs should be sent for the Monitor resource?
        /// </summary>
        public readonly bool? ResourceLogEnabled;
        /// <summary>
        /// Whether Azure subscription logs should be sent for the Monitor resource?
        /// </summary>
        public readonly bool? SubscriptionLogEnabled;

        [OutputConstructor]
        private MonitorTagRuleLog(
            bool? aadLogEnabled,

            ImmutableArray<Outputs.MonitorTagRuleLogFilter> filters,

            bool? resourceLogEnabled,

            bool? subscriptionLogEnabled)
        {
            AadLogEnabled = aadLogEnabled;
            Filters = filters;
            ResourceLogEnabled = resourceLogEnabled;
            SubscriptionLogEnabled = subscriptionLogEnabled;
        }
    }
}