// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Outputs
{

    [OutputType]
    public sealed class AccountFilterTrackSelection
    {
        /// <summary>
        /// One or more `selection` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.AccountFilterTrackSelectionCondition> Conditions;

        [OutputConstructor]
        private AccountFilterTrackSelection(ImmutableArray<Outputs.AccountFilterTrackSelectionCondition> conditions)
        {
            Conditions = conditions;
        }
    }
}