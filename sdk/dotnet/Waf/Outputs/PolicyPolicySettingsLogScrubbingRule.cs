// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Waf.Outputs
{

    [OutputType]
    public sealed class PolicyPolicySettingsLogScrubbingRule
    {
        /// <summary>
        /// Describes if the managed rule is in enabled state or disabled state.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The name of the Match Variable. Possible values: `RequestArgKeys`, `RequestArgNames`, `RequestArgValues`, `RequestCookieKeys`, `RequestCookieNames`, `RequestCookieValues`, `RequestHeaderKeys`, `RequestHeaderNames`, `RequestHeaderValues`.
        /// </summary>
        public readonly string MatchVariable;
        /// <summary>
        /// Describes field of the matchVariable collection.
        /// </summary>
        public readonly string? Selector;
        /// <summary>
        /// Describes operator to be matched. Possible values: `Contains`, `EndsWith`, `Equals`, `EqualsAny`, `StartsWith`.
        /// </summary>
        public readonly string? SelectorMatchOperator;

        [OutputConstructor]
        private PolicyPolicySettingsLogScrubbingRule(
            bool? enabled,

            string matchVariable,

            string? selector,

            string? selectorMatchOperator)
        {
            Enabled = enabled;
            MatchVariable = matchVariable;
            Selector = selector;
            SelectorMatchOperator = selectorMatchOperator;
        }
    }
}
