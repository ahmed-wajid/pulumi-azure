// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class GetApplicationGatewayRewriteRuleSetRewriteRuleResult
    {
        /// <summary>
        /// One or more `condition` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplicationGatewayRewriteRuleSetRewriteRuleConditionResult> Conditions;
        /// <summary>
        /// The name of this Application Gateway.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// One or more `request_header_configuration` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationResult> RequestHeaderConfigurations;
        /// <summary>
        /// One or more `response_header_configuration` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfigurationResult> ResponseHeaderConfigurations;
        /// <summary>
        /// Rule sequence of the Rewrite Rule that determines the order of execution in a set.
        /// </summary>
        public readonly int RuleSequence;
        /// <summary>
        /// One `url` block as defined below
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplicationGatewayRewriteRuleSetRewriteRuleUrlResult> Urls;

        [OutputConstructor]
        private GetApplicationGatewayRewriteRuleSetRewriteRuleResult(
            ImmutableArray<Outputs.GetApplicationGatewayRewriteRuleSetRewriteRuleConditionResult> conditions,

            string name,

            ImmutableArray<Outputs.GetApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfigurationResult> requestHeaderConfigurations,

            ImmutableArray<Outputs.GetApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfigurationResult> responseHeaderConfigurations,

            int ruleSequence,

            ImmutableArray<Outputs.GetApplicationGatewayRewriteRuleSetRewriteRuleUrlResult> urls)
        {
            Conditions = conditions;
            Name = name;
            RequestHeaderConfigurations = requestHeaderConfigurations;
            ResponseHeaderConfigurations = responseHeaderConfigurations;
            RuleSequence = ruleSequence;
            Urls = urls;
        }
    }
}