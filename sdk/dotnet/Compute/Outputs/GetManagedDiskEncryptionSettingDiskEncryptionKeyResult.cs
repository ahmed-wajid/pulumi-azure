// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Outputs
{

    [OutputType]
    public sealed class GetManagedDiskEncryptionSettingDiskEncryptionKeyResult
    {
        /// <summary>
        /// The URL to the Key Vault Secret used as the Disk Encryption Key.
        /// </summary>
        public readonly string SecretUrl;
        /// <summary>
        /// The ID of the source Key Vault.
        /// </summary>
        public readonly string SourceVaultId;

        [OutputConstructor]
        private GetManagedDiskEncryptionSettingDiskEncryptionKeyResult(
            string secretUrl,

            string sourceVaultId)
        {
            SecretUrl = secretUrl;
            SourceVaultId = sourceVaultId;
        }
    }
}