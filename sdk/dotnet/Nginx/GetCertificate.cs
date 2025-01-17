// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Nginx
{
    public static class GetCertificate
    {
        /// <summary>
        /// Use this data source to access information about an existing Nginx Certificate.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Nginx.GetCertificate.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         NginxDeploymentId = azurerm_nginx_deployment.Example.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getCertificateResult =&gt; getCertificateResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCertificateResult> InvokeAsync(GetCertificateArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCertificateResult>("azure:nginx/getCertificate:getCertificate", args ?? new GetCertificateArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Nginx Certificate.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Nginx.GetCertificate.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         NginxDeploymentId = azurerm_nginx_deployment.Example.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getCertificateResult =&gt; getCertificateResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCertificateResult> Invoke(GetCertificateInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCertificateResult>("azure:nginx/getCertificate:getCertificate", args ?? new GetCertificateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCertificateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of this Nginx Certificate.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The ID of the Nginx Deployment that this certificate is associated with.
        /// </summary>
        [Input("nginxDeploymentId", required: true)]
        public string NginxDeploymentId { get; set; } = null!;

        public GetCertificateArgs()
        {
        }
        public static new GetCertificateArgs Empty => new GetCertificateArgs();
    }

    public sealed class GetCertificateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of this Nginx Certificate.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The ID of the Nginx Deployment that this certificate is associated with.
        /// </summary>
        [Input("nginxDeploymentId", required: true)]
        public Input<string> NginxDeploymentId { get; set; } = null!;

        public GetCertificateInvokeArgs()
        {
        }
        public static new GetCertificateInvokeArgs Empty => new GetCertificateInvokeArgs();
    }


    [OutputType]
    public sealed class GetCertificateResult
    {
        /// <summary>
        /// The path to the certificate file of this certificate.
        /// </summary>
        public readonly string CertificateVirtualPath;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the Key Vault Secret for this certificate.
        /// </summary>
        public readonly string KeyVaultSecretId;
        /// <summary>
        /// The path to the key file of this certificate.
        /// </summary>
        public readonly string KeyVirtualPath;
        public readonly string Name;
        public readonly string NginxDeploymentId;

        [OutputConstructor]
        private GetCertificateResult(
            string certificateVirtualPath,

            string id,

            string keyVaultSecretId,

            string keyVirtualPath,

            string name,

            string nginxDeploymentId)
        {
            CertificateVirtualPath = certificateVirtualPath;
            Id = id;
            KeyVaultSecretId = keyVaultSecretId;
            KeyVirtualPath = keyVirtualPath;
            Name = name;
            NginxDeploymentId = nginxDeploymentId;
        }
    }
}
