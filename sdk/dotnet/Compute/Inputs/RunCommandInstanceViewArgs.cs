// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class RunCommandInstanceViewArgs : global::Pulumi.ResourceArgs
    {
        [Input("endTime")]
        public Input<string>? EndTime { get; set; }

        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        [Input("executionMessage")]
        public Input<string>? ExecutionMessage { get; set; }

        [Input("executionState")]
        public Input<string>? ExecutionState { get; set; }

        [Input("exitCode")]
        public Input<int>? ExitCode { get; set; }

        [Input("output")]
        public Input<string>? Output { get; set; }

        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        public RunCommandInstanceViewArgs()
        {
        }
        public static new RunCommandInstanceViewArgs Empty => new RunCommandInstanceViewArgs();
    }
}