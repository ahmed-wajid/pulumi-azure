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
    public sealed class LinuxWebAppAuthSettings
    {
        /// <summary>
        /// An `active_directory` block as defined above.
        /// </summary>
        public readonly Outputs.LinuxWebAppAuthSettingsActiveDirectory? ActiveDirectory;
        /// <summary>
        /// Specifies a map of login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? AdditionalLoginParameters;
        /// <summary>
        /// Specifies a list of External URLs that can be redirected to as part of logging in or logging out of the Linux Web App.
        /// </summary>
        public readonly ImmutableArray<string> AllowedExternalRedirectUrls;
        /// <summary>
        /// The default authentication provider to use when multiple providers are configured. Possible values include: `BuiltInAuthenticationProviderAzureActiveDirectory`, `BuiltInAuthenticationProviderFacebook`, `BuiltInAuthenticationProviderGoogle`, `BuiltInAuthenticationProviderMicrosoftAccount`, `BuiltInAuthenticationProviderTwitter`, `BuiltInAuthenticationProviderGithub`
        /// </summary>
        public readonly string? DefaultProvider;
        /// <summary>
        /// Should the Authentication / Authorization feature be enabled for the Linux Web App?
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// A `facebook` block as defined below.
        /// </summary>
        public readonly Outputs.LinuxWebAppAuthSettingsFacebook? Facebook;
        /// <summary>
        /// A `github` block as defined below.
        /// </summary>
        public readonly Outputs.LinuxWebAppAuthSettingsGithub? Github;
        /// <summary>
        /// A `google` block as defined below.
        /// </summary>
        public readonly Outputs.LinuxWebAppAuthSettingsGoogle? Google;
        /// <summary>
        /// The OpenID Connect Issuer URI that represents the entity which issues access tokens for this Linux Web App.
        /// </summary>
        public readonly string? Issuer;
        /// <summary>
        /// A `microsoft` block as defined below.
        /// </summary>
        public readonly Outputs.LinuxWebAppAuthSettingsMicrosoft? Microsoft;
        /// <summary>
        /// The RuntimeVersion of the Authentication / Authorization feature in use for the Linux Web App.
        /// </summary>
        public readonly string? RuntimeVersion;
        /// <summary>
        /// The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
        /// </summary>
        public readonly double? TokenRefreshExtensionHours;
        /// <summary>
        /// Should the Linux Web App durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
        /// </summary>
        public readonly bool? TokenStoreEnabled;
        /// <summary>
        /// A `twitter` block as defined below.
        /// </summary>
        public readonly Outputs.LinuxWebAppAuthSettingsTwitter? Twitter;
        /// <summary>
        /// The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
        /// </summary>
        public readonly string? UnauthenticatedClientAction;

        [OutputConstructor]
        private LinuxWebAppAuthSettings(
            Outputs.LinuxWebAppAuthSettingsActiveDirectory? activeDirectory,

            ImmutableDictionary<string, string>? additionalLoginParameters,

            ImmutableArray<string> allowedExternalRedirectUrls,

            string? defaultProvider,

            bool enabled,

            Outputs.LinuxWebAppAuthSettingsFacebook? facebook,

            Outputs.LinuxWebAppAuthSettingsGithub? github,

            Outputs.LinuxWebAppAuthSettingsGoogle? google,

            string? issuer,

            Outputs.LinuxWebAppAuthSettingsMicrosoft? microsoft,

            string? runtimeVersion,

            double? tokenRefreshExtensionHours,

            bool? tokenStoreEnabled,

            Outputs.LinuxWebAppAuthSettingsTwitter? twitter,

            string? unauthenticatedClientAction)
        {
            ActiveDirectory = activeDirectory;
            AdditionalLoginParameters = additionalLoginParameters;
            AllowedExternalRedirectUrls = allowedExternalRedirectUrls;
            DefaultProvider = defaultProvider;
            Enabled = enabled;
            Facebook = facebook;
            Github = github;
            Google = google;
            Issuer = issuer;
            Microsoft = microsoft;
            RuntimeVersion = runtimeVersion;
            TokenRefreshExtensionHours = tokenRefreshExtensionHours;
            TokenStoreEnabled = tokenStoreEnabled;
            Twitter = twitter;
            UnauthenticatedClientAction = unauthenticatedClientAction;
        }
    }
}