// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SiteRecovery.Outputs
{

    [OutputType]
    public sealed class ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey
    {
        /// <summary>
        /// The URL to the Key Vault Key used as the Key Encryption Key that the Managed Disk will be associated with. This can be found as `id` on the `azure.keyvault.Key` resource. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string KeyUrl;
        /// <summary>
        /// The ID of the Key Vault. This can be found as `id` on the `azure.keyvault.KeyVault` resource. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string VaultId;

        [OutputConstructor]
        private ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKey(
            string keyUrl,

            string vaultId)
        {
            KeyUrl = keyUrl;
            VaultId = vaultId;
        }
    }
}