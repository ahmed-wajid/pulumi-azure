// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DesktopVirtualization.Outputs
{

    [OutputType]
    public sealed class HostPoolScheduledAgentUpdatesSchedule
    {
        /// <summary>
        /// The day of the week on which agent updates should be performed. Possible values are `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`
        /// </summary>
        public readonly string DayOfWeek;
        /// <summary>
        /// The hour of day the update window should start. The update is a 2 hour period following the hour provided. The value should be provided as a number between 0 and 23, with 0 being midnight and 23 being 11pm. A leading zero should not be used.
        /// </summary>
        public readonly int HourOfDay;

        [OutputConstructor]
        private HostPoolScheduledAgentUpdatesSchedule(
            string dayOfWeek,

            int hourOfDay)
        {
            DayOfWeek = dayOfWeek;
            HourOfDay = hourOfDay;
        }
    }
}