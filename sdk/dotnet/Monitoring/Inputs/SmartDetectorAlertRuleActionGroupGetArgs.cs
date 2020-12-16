// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class SmartDetectorAlertRuleActionGroupGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a custom email subject if Email Receiver is specified in Monitor Action Group resource.
        /// </summary>
        [Input("emailSubject")]
        public Input<string>? EmailSubject { get; set; }

        [Input("ids", required: true)]
        private InputList<string>? _ids;

        /// <summary>
        /// Specifies the action group ids.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A JSON String which Specifies the custom webhook payload if Webhook Receiver is specified in Monitor Action Group resource.
        /// </summary>
        [Input("webhookPayload")]
        public Input<string>? WebhookPayload { get; set; }

        public SmartDetectorAlertRuleActionGroupGetArgs()
        {
        }
    }
}