// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Outputs
{

    [OutputType]
    public sealed class IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPassword
    {
        /// <summary>
        /// Specifies the name of an existing Key Vault Data Factory Linked Service.
        /// </summary>
        public readonly string LinkedServiceName;
        /// <summary>
        /// A map of parameters to associate with the Key Vault Data Factory Linked Service.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Parameters;
        /// <summary>
        /// Specifies the secret name in Azure Key Vault.
        /// </summary>
        public readonly string SecretName;
        /// <summary>
        /// Specifies the secret version in Azure Key Vault.
        /// </summary>
        public readonly string? SecretVersion;

        [OutputConstructor]
        private IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPassword(
            string linkedServiceName,

            ImmutableDictionary<string, string>? parameters,

            string secretName,

            string? secretVersion)
        {
            LinkedServiceName = linkedServiceName;
            Parameters = parameters;
            SecretName = secretName;
            SecretVersion = secretVersion;
        }
    }
}