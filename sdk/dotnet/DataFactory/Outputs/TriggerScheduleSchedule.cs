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
    public sealed class TriggerScheduleSchedule
    {
        /// <summary>
        /// Day(s) of the month on which the trigger is scheduled. This value can be specified with a monthly frequency only.
        /// </summary>
        public readonly ImmutableArray<int> DaysOfMonths;
        /// <summary>
        /// Days of the week on which the trigger is scheduled. This value can be specified only with a weekly frequency.
        /// </summary>
        public readonly ImmutableArray<string> DaysOfWeeks;
        /// <summary>
        /// Hours of the day on which the trigger is scheduled.
        /// </summary>
        public readonly ImmutableArray<int> Hours;
        /// <summary>
        /// Minutes of the hour on which the trigger is scheduled.
        /// </summary>
        public readonly ImmutableArray<int> Minutes;
        /// <summary>
        /// A `monthly` block as documented below, which specifies the days of the month on which the trigger is scheduled. The value can be specified only with a monthly frequency.
        /// </summary>
        public readonly ImmutableArray<Outputs.TriggerScheduleScheduleMonthly> Monthlies;

        [OutputConstructor]
        private TriggerScheduleSchedule(
            ImmutableArray<int> daysOfMonths,

            ImmutableArray<string> daysOfWeeks,

            ImmutableArray<int> hours,

            ImmutableArray<int> minutes,

            ImmutableArray<Outputs.TriggerScheduleScheduleMonthly> monthlies)
        {
            DaysOfMonths = daysOfMonths;
            DaysOfWeeks = daysOfWeeks;
            Hours = hours;
            Minutes = minutes;
            Monthlies = monthlies;
        }
    }
}