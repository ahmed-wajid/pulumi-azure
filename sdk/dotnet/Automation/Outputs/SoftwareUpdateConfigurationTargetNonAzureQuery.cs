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
    public sealed class SoftwareUpdateConfigurationTargetNonAzureQuery
    {
        /// <summary>
        /// Specifies the Log Analytics save search name.
        /// </summary>
        public readonly string? FunctionAlias;
        /// <summary>
        /// The workspace id for Log Analytics in which the saved search in.
        /// </summary>
        public readonly string? WorkspaceId;

        [OutputConstructor]
        private SoftwareUpdateConfigurationTargetNonAzureQuery(
            string? functionAlias,

            string? workspaceId)
        {
            FunctionAlias = functionAlias;
            WorkspaceId = workspaceId;
        }
    }
}