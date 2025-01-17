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
    public sealed class StreamingPolicyCommonEncryptionCencDrmPlayready
    {
        /// <summary>
        /// Custom attributes for PlayReady. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        public readonly string? CustomAttributes;
        /// <summary>
        /// The URL template for the custom service that delivers licenses to the end user. This is not required when using Azure Media Services for issuing licenses. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        public readonly string? CustomLicenseAcquisitionUrlTemplate;

        [OutputConstructor]
        private StreamingPolicyCommonEncryptionCencDrmPlayready(
            string? customAttributes,

            string? customLicenseAcquisitionUrlTemplate)
        {
            CustomAttributes = customAttributes;
            CustomLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
        }
    }
}
