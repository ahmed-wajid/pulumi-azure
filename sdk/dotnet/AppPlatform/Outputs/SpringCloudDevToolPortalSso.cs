// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform.Outputs
{

    [OutputType]
    public sealed class SpringCloudDevToolPortalSso
    {
        /// <summary>
        /// Specifies the public identifier for the application.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// Specifies the secret known only to the application and the authorization server.
        /// </summary>
        public readonly string? ClientSecret;
        /// <summary>
        /// Specifies the URI of a JSON file with generic OIDC provider configuration.
        /// </summary>
        public readonly string? MetadataUrl;
        /// <summary>
        /// Specifies a list of specific actions applications can be allowed to do on a user's behalf.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;

        [OutputConstructor]
        private SpringCloudDevToolPortalSso(
            string? clientId,

            string? clientSecret,

            string? metadataUrl,

            ImmutableArray<string> scopes)
        {
            ClientId = clientId;
            ClientSecret = clientSecret;
            MetadataUrl = metadataUrl;
            Scopes = scopes;
        }
    }
}