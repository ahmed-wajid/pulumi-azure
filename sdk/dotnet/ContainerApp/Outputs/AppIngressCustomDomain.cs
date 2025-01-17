// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Outputs
{

    [OutputType]
    public sealed class AppIngressCustomDomain
    {
        /// <summary>
        /// The Binding type. Possible values include `Disabled` and `SniEnabled`. Defaults to `Disabled`.
        /// </summary>
        public readonly string? CertificateBindingType;
        /// <summary>
        /// The ID of the Container App Environment Certificate.
        /// </summary>
        public readonly string CertificateId;
        /// <summary>
        /// The hostname of the Certificate. Must be the CN or a named SAN in the certificate.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private AppIngressCustomDomain(
            string? certificateBindingType,

            string certificateId,

            string name)
        {
            CertificateBindingType = certificateBindingType;
            CertificateId = certificateId;
            Name = name;
        }
    }
}
