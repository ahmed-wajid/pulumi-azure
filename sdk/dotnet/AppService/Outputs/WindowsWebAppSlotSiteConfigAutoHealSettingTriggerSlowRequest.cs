// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest
    {
        /// <summary>
        /// The number of Slow Requests in the time `interval` to trigger this rule.
        /// </summary>
        public readonly int Count;
        /// <summary>
        /// The time interval in the form `hh:mm:ss`.
        /// </summary>
        public readonly string Interval;
        /// <summary>
        /// The path for which this slow request rule applies.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// The threshold of time passed to qualify as a Slow Request in `hh:mm:ss`.
        /// </summary>
        public readonly string TimeTaken;

        [OutputConstructor]
        private WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest(
            int count,

            string interval,

            string? path,

            string timeTaken)
        {
            Count = count;
            Interval = interval;
            Path = path;
            TimeTaken = timeTaken;
        }
    }
}