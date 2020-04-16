// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring
{
    public static class GetScheduledQueryRulesAlert
    {
        /// <summary>
        /// Use this data source to access the properties of an AlertingAction scheduled query rule.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetScheduledQueryRulesAlertResult> InvokeAsync(GetScheduledQueryRulesAlertArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetScheduledQueryRulesAlertResult>("azure:monitoring/getScheduledQueryRulesAlert:getScheduledQueryRulesAlert", args ?? new GetScheduledQueryRulesAlertArgs(), options.WithVersion());
    }


    public sealed class GetScheduledQueryRulesAlertArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the scheduled query rule.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the resource group where the scheduled query rule is located.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetScheduledQueryRulesAlertArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetScheduledQueryRulesAlertResult
    {
        /// <summary>
        /// An `action` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetScheduledQueryRulesAlertActionResult> Actions;
        /// <summary>
        /// List of Resource IDs referred into query.
        /// </summary>
        public readonly ImmutableArray<string> AuthorizedResourceIds;
        /// <summary>
        /// The resource URI over which log search query is to be run.
        /// </summary>
        public readonly string DataSourceId;
        /// <summary>
        /// The description of the scheduled query rule.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Whether this scheduled query rule is enabled.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Frequency at which rule condition should be evaluated.
        /// </summary>
        public readonly int Frequency;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Location;
        public readonly string Name;
        /// <summary>
        /// Log search query.
        /// </summary>
        public readonly string Query;
        public readonly string QueryType;
        public readonly string ResourceGroupName;
        /// <summary>
        /// Severity of the alert.
        /// </summary>
        public readonly int Severity;
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Time for which alerts should be throttled or suppressed.
        /// </summary>
        public readonly int Throttling;
        /// <summary>
        /// Time window for which data needs to be fetched for query.
        /// </summary>
        public readonly int TimeWindow;
        /// <summary>
        /// A `trigger` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetScheduledQueryRulesAlertTriggerResult> Triggers;

        [OutputConstructor]
        private GetScheduledQueryRulesAlertResult(
            ImmutableArray<Outputs.GetScheduledQueryRulesAlertActionResult> actions,

            ImmutableArray<string> authorizedResourceIds,

            string dataSourceId,

            string description,

            bool enabled,

            int frequency,

            string id,

            string location,

            string name,

            string query,

            string queryType,

            string resourceGroupName,

            int severity,

            ImmutableDictionary<string, string> tags,

            int throttling,

            int timeWindow,

            ImmutableArray<Outputs.GetScheduledQueryRulesAlertTriggerResult> triggers)
        {
            Actions = actions;
            AuthorizedResourceIds = authorizedResourceIds;
            DataSourceId = dataSourceId;
            Description = description;
            Enabled = enabled;
            Frequency = frequency;
            Id = id;
            Location = location;
            Name = name;
            Query = query;
            QueryType = queryType;
            ResourceGroupName = resourceGroupName;
            Severity = severity;
            Tags = tags;
            Throttling = throttling;
            TimeWindow = timeWindow;
            Triggers = triggers;
        }
    }
}