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
    public sealed class ScalingPlanSchedule
    {
        /// <summary>
        /// A list of Days of the Week on which this schedule will be used..Possible values are `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`
        /// </summary>
        public readonly ImmutableArray<string> DaysOfWeeks;
        /// <summary>
        /// The name of the schedule.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The load Balancing Algorithm to use during Off-Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
        /// </summary>
        public readonly string OffPeakLoadBalancingAlgorithm;
        /// <summary>
        /// The time at which Off-Peak scaling will begin. This is also the end-time for the Ramp-Down period. The time must be specified in "HH:MM" format.
        /// </summary>
        public readonly string OffPeakStartTime;
        /// <summary>
        /// The load Balancing Algorithm to use during Peak Hours. Possible values are `DepthFirst` and `BreadthFirst`.
        /// </summary>
        public readonly string PeakLoadBalancingAlgorithm;
        /// <summary>
        /// The time at which Peak scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in "HH:MM" format.
        /// </summary>
        public readonly string PeakStartTime;
        /// <summary>
        /// This is the value in percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-down and off-peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
        /// </summary>
        public readonly int RampDownCapacityThresholdPercent;
        /// <summary>
        /// Whether users will be forced to log-off session hosts once the `ramp_down_wait_time_minutes` value has been exceeded during the Ramp-Down period. Possible
        /// </summary>
        public readonly bool RampDownForceLogoffUsers;
        /// <summary>
        /// The load Balancing Algorithm to use during the Ramp-Down period. Possible values are `DepthFirst` and `BreadthFirst`.
        /// </summary>
        public readonly string RampDownLoadBalancingAlgorithm;
        /// <summary>
        /// The minimum percentage of session host virtual machines that you would like to get to for ramp-down and off-peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
        /// </summary>
        public readonly int RampDownMinimumHostsPercent;
        /// <summary>
        /// The notification message to send to users during Ramp-Down period when they are required to log-off.
        /// </summary>
        public readonly string RampDownNotificationMessage;
        /// <summary>
        /// The time at which Ramp-Down scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in "HH:MM" format.
        /// </summary>
        public readonly string RampDownStartTime;
        /// <summary>
        /// Controls Session Host shutdown behaviour during Ramp-Down period. Session Hosts can either be shutdown when all sessions on the Session Host have ended, or when there are no Active sessions left on the Session Host. Possible values are `ZeroSessions` and `ZeroActiveSessions`.
        /// </summary>
        public readonly string RampDownStopHostsWhen;
        /// <summary>
        /// The number of minutes during Ramp-Down period that autoscale will wait after setting the session host VMs to drain mode, notifying any currently signed in users to save their work before forcing the users to logoff. Once all user sessions on the session host VM have been logged off, Autoscale will shut down the VM.
        /// </summary>
        public readonly int RampDownWaitTimeMinutes;
        /// <summary>
        /// Specify minimum percentage of session host virtual machines to start for ramp-up and peak hours. For example, if Minimum percentage of hosts is specified as 10% and total number of session hosts in your host pool is 10, autoscale will ensure a minimum of 1 session host is available to take user connections.
        /// </summary>
        public readonly int? RampUpCapacityThresholdPercent;
        /// <summary>
        /// The load Balancing Algorithm to use during the Ramp-Up period. Possible values are `DepthFirst` and `BreadthFirst`.
        /// </summary>
        public readonly string RampUpLoadBalancingAlgorithm;
        /// <summary>
        /// This is the value of percentage of used host pool capacity that will be considered to evaluate whether to turn on/off virtual machines during the ramp-up and peak hours. For example, if capacity threshold is specified as 60% and your total host pool capacity is 100 sessions, autoscale will turn on additional session hosts once the host pool exceeds a load of 60 sessions.
        /// </summary>
        public readonly int? RampUpMinimumHostsPercent;
        /// <summary>
        /// The time at which Ramp-Up scaling will begin. This is also the end-time for the Ramp-Up period. The time must be specified in "HH:MM" format.
        /// </summary>
        public readonly string RampUpStartTime;

        [OutputConstructor]
        private ScalingPlanSchedule(
            ImmutableArray<string> daysOfWeeks,

            string name,

            string offPeakLoadBalancingAlgorithm,

            string offPeakStartTime,

            string peakLoadBalancingAlgorithm,

            string peakStartTime,

            int rampDownCapacityThresholdPercent,

            bool rampDownForceLogoffUsers,

            string rampDownLoadBalancingAlgorithm,

            int rampDownMinimumHostsPercent,

            string rampDownNotificationMessage,

            string rampDownStartTime,

            string rampDownStopHostsWhen,

            int rampDownWaitTimeMinutes,

            int? rampUpCapacityThresholdPercent,

            string rampUpLoadBalancingAlgorithm,

            int? rampUpMinimumHostsPercent,

            string rampUpStartTime)
        {
            DaysOfWeeks = daysOfWeeks;
            Name = name;
            OffPeakLoadBalancingAlgorithm = offPeakLoadBalancingAlgorithm;
            OffPeakStartTime = offPeakStartTime;
            PeakLoadBalancingAlgorithm = peakLoadBalancingAlgorithm;
            PeakStartTime = peakStartTime;
            RampDownCapacityThresholdPercent = rampDownCapacityThresholdPercent;
            RampDownForceLogoffUsers = rampDownForceLogoffUsers;
            RampDownLoadBalancingAlgorithm = rampDownLoadBalancingAlgorithm;
            RampDownMinimumHostsPercent = rampDownMinimumHostsPercent;
            RampDownNotificationMessage = rampDownNotificationMessage;
            RampDownStartTime = rampDownStartTime;
            RampDownStopHostsWhen = rampDownStopHostsWhen;
            RampDownWaitTimeMinutes = rampDownWaitTimeMinutes;
            RampUpCapacityThresholdPercent = rampUpCapacityThresholdPercent;
            RampUpLoadBalancingAlgorithm = rampUpLoadBalancingAlgorithm;
            RampUpMinimumHostsPercent = rampUpMinimumHostsPercent;
            RampUpStartTime = rampUpStartTime;
        }
    }
}