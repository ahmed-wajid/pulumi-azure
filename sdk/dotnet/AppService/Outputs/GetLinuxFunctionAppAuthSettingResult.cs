// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class GetLinuxFunctionAppAuthSettingResult
    {
        /// <summary>
        /// An `active_directory` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingActiveDirectoryResult> ActiveDirectories;
        /// <summary>
        /// A map of login parameters sent to the OpenID Connect authorization endpoint when a user logs in.
        /// </summary>
        public readonly ImmutableDictionary<string, string> AdditionalLoginParameters;
        /// <summary>
        /// A list of External URLs that can be redirected to as part of logging in or logging out of the Linux Web App.
        /// </summary>
        public readonly ImmutableArray<string> AllowedExternalRedirectUrls;
        /// <summary>
        /// The default authentication provider used when multiple providers are configured.
        /// </summary>
        public readonly string DefaultProvider;
        /// <summary>
        /// Is this backup job enabled?
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// A `facebook` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingFacebookResult> Facebooks;
        /// <summary>
        /// A `github` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingGithubResult> Githubs;
        /// <summary>
        /// A `google` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingGoogleResult> Googles;
        /// <summary>
        /// The OpenID Connect Issuer URI that represents the entity which issues access tokens for this Linux Web App.
        /// </summary>
        public readonly string Issuer;
        /// <summary>
        /// A `microsoft` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingMicrosoftResult> Microsofts;
        /// <summary>
        /// The RuntimeVersion of the Authentication / Authorization feature in use for the Linux Web App.
        /// </summary>
        public readonly string RuntimeVersion;
        /// <summary>
        /// The number of hours after session token expiration that a session token can be used to call the token refresh API.
        /// </summary>
        public readonly double TokenRefreshExtensionHours;
        /// <summary>
        /// Does the Linux Web App durably store platform-specific security tokens that are obtained during login flows?
        /// </summary>
        public readonly bool TokenStoreEnabled;
        /// <summary>
        /// A `twitter` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingTwitterResult> Twitters;
        /// <summary>
        /// The action to taken when an unauthenticated client attempts to access the app.
        /// </summary>
        public readonly string UnauthenticatedClientAction;

        [OutputConstructor]
        private GetLinuxFunctionAppAuthSettingResult(
            ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingActiveDirectoryResult> activeDirectories,

            ImmutableDictionary<string, string> additionalLoginParameters,

            ImmutableArray<string> allowedExternalRedirectUrls,

            string defaultProvider,

            bool enabled,

            ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingFacebookResult> facebooks,

            ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingGithubResult> githubs,

            ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingGoogleResult> googles,

            string issuer,

            ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingMicrosoftResult> microsofts,

            string runtimeVersion,

            double tokenRefreshExtensionHours,

            bool tokenStoreEnabled,

            ImmutableArray<Outputs.GetLinuxFunctionAppAuthSettingTwitterResult> twitters,

            string unauthenticatedClientAction)
        {
            ActiveDirectories = activeDirectories;
            AdditionalLoginParameters = additionalLoginParameters;
            AllowedExternalRedirectUrls = allowedExternalRedirectUrls;
            DefaultProvider = defaultProvider;
            Enabled = enabled;
            Facebooks = facebooks;
            Githubs = githubs;
            Googles = googles;
            Issuer = issuer;
            Microsofts = microsofts;
            RuntimeVersion = runtimeVersion;
            TokenRefreshExtensionHours = tokenRefreshExtensionHours;
            TokenStoreEnabled = tokenStoreEnabled;
            Twitters = twitters;
            UnauthenticatedClientAction = unauthenticatedClientAction;
        }
    }
}