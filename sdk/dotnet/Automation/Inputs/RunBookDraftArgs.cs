// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation.Inputs
{

    public sealed class RunBookDraftArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Draft Content Link defined as `publish_content_link` above.
        /// </summary>
        [Input("contentLink")]
        public Input<Inputs.RunBookDraftContentLinkArgs>? ContentLink { get; set; }

        [Input("creationTime")]
        public Input<string>? CreationTime { get; set; }

        /// <summary>
        /// Whether the draft in edit mode.
        /// </summary>
        [Input("editModeEnabled")]
        public Input<bool>? EditModeEnabled { get; set; }

        [Input("lastModifiedTime")]
        public Input<string>? LastModifiedTime { get; set; }

        [Input("outputTypes")]
        private InputList<string>? _outputTypes;

        /// <summary>
        /// Specifies the output types of the runbook.
        /// </summary>
        public InputList<string> OutputTypes
        {
            get => _outputTypes ?? (_outputTypes = new InputList<string>());
            set => _outputTypes = value;
        }

        [Input("parameters")]
        private InputList<Inputs.RunBookDraftParameterArgs>? _parameters;
        public InputList<Inputs.RunBookDraftParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.RunBookDraftParameterArgs>());
            set => _parameters = value;
        }

        public RunBookDraftArgs()
        {
        }
        public static new RunBookDraftArgs Empty => new RunBookDraftArgs();
    }
}