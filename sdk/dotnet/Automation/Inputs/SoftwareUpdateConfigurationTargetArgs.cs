// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation.Inputs
{

    public sealed class SoftwareUpdateConfigurationTargetArgs : global::Pulumi.ResourceArgs
    {
        [Input("azureQueries")]
        private InputList<Inputs.SoftwareUpdateConfigurationTargetAzureQueryArgs>? _azureQueries;

        /// <summary>
        /// One or more `azure_query` blocks as defined above.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationTargetAzureQueryArgs> AzureQueries
        {
            get => _azureQueries ?? (_azureQueries = new InputList<Inputs.SoftwareUpdateConfigurationTargetAzureQueryArgs>());
            set => _azureQueries = value;
        }

        [Input("nonAzureQueries")]
        private InputList<Inputs.SoftwareUpdateConfigurationTargetNonAzureQueryArgs>? _nonAzureQueries;

        /// <summary>
        /// One or more `non_azure_query` blocks as defined above.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationTargetNonAzureQueryArgs> NonAzureQueries
        {
            get => _nonAzureQueries ?? (_nonAzureQueries = new InputList<Inputs.SoftwareUpdateConfigurationTargetNonAzureQueryArgs>());
            set => _nonAzureQueries = value;
        }

        public SoftwareUpdateConfigurationTargetArgs()
        {
        }
        public static new SoftwareUpdateConfigurationTargetArgs Empty => new SoftwareUpdateConfigurationTargetArgs();
    }
}