// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core.Outputs
{

    [OutputType]
    public sealed class SubscriptionCostManagementViewDataset
    {
        /// <summary>
        /// One or more `aggregation` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.SubscriptionCostManagementViewDatasetAggregation> Aggregations;
        /// <summary>
        /// The granularity of rows in the report. Possible values are `Daily` and `Monthly`.
        /// </summary>
        public readonly string Granularity;
        /// <summary>
        /// One or more `grouping` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.SubscriptionCostManagementViewDatasetGrouping> Groupings;
        /// <summary>
        /// One or more `sorting` blocks as defined below, containing the order by expression to be used in the report
        /// </summary>
        public readonly ImmutableArray<Outputs.SubscriptionCostManagementViewDatasetSorting> Sortings;

        [OutputConstructor]
        private SubscriptionCostManagementViewDataset(
            ImmutableArray<Outputs.SubscriptionCostManagementViewDatasetAggregation> aggregations,

            string granularity,

            ImmutableArray<Outputs.SubscriptionCostManagementViewDatasetGrouping> groupings,

            ImmutableArray<Outputs.SubscriptionCostManagementViewDatasetSorting> sortings)
        {
            Aggregations = aggregations;
            Granularity = granularity;
            Groupings = groupings;
            Sortings = sortings;
        }
    }
}