// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Outputs
{

    [OutputType]
    public sealed class StreamingPolicyCommonEncryptionCencClearKeyEncryption
    {
        /// <summary>
        /// The URL template for the custom service that delivers content keys to the end user. This is not required when using Azure Media Services for issuing keys. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        public readonly string CustomKeysAcquisitionUrlTemplate;

        [OutputConstructor]
        private StreamingPolicyCommonEncryptionCencClearKeyEncryption(string customKeysAcquisitionUrlTemplate)
        {
            CustomKeysAcquisitionUrlTemplate = customKeysAcquisitionUrlTemplate;
        }
    }
}