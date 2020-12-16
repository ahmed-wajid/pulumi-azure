// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Outputs
{

    [OutputType]
    public sealed class SmartDetectorAlertRuleActionGroup
    {
        /// <summary>
        /// Specifies a custom email subject if Email Receiver is specified in Monitor Action Group resource.
        /// </summary>
        public readonly string? EmailSubject;
        /// <summary>
        /// Specifies the action group ids.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// A JSON String which Specifies the custom webhook payload if Webhook Receiver is specified in Monitor Action Group resource.
        /// </summary>
        public readonly string? WebhookPayload;

        [OutputConstructor]
        private SmartDetectorAlertRuleActionGroup(
            string? emailSubject,

            ImmutableArray<string> ids,

            string? webhookPayload)
        {
            EmailSubject = emailSubject;
            Ids = ids;
            WebhookPayload = webhookPayload;
        }
    }
}