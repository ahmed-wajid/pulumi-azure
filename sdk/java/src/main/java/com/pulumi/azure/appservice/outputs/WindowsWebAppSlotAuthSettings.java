// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotAuthSettingsActiveDirectory;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotAuthSettingsFacebook;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotAuthSettingsGithub;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotAuthSettingsGoogle;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotAuthSettingsMicrosoft;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotAuthSettingsTwitter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSlotAuthSettings {
    /**
     * @return An `active_directory` block as defined above.
     * 
     */
    private final @Nullable WindowsWebAppSlotAuthSettingsActiveDirectory activeDirectory;
    /**
     * @return Specifies a map of login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
     * 
     */
    private final @Nullable Map<String,String> additionalLoginParameters;
    /**
     * @return Specifies a list of External URLs that can be redirected to as part of logging in or logging out of the Windows Web App Slot.
     * 
     */
    private final @Nullable List<String> allowedExternalRedirectUrls;
    /**
     * @return The default authentication provider to use when multiple providers are configured. Possible values include: `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount`, `Twitter`, `Github`.
     * 
     */
    private final @Nullable String defaultProvider;
    /**
     * @return Should the Authentication / Authorization feature be enabled for the Windows Web App?
     * 
     */
    private final Boolean enabled;
    /**
     * @return A `facebook` block as defined below.
     * 
     */
    private final @Nullable WindowsWebAppSlotAuthSettingsFacebook facebook;
    /**
     * @return A `github` block as defined below.
     * 
     */
    private final @Nullable WindowsWebAppSlotAuthSettingsGithub github;
    /**
     * @return A `google` block as defined below.
     * 
     */
    private final @Nullable WindowsWebAppSlotAuthSettingsGoogle google;
    /**
     * @return The OpenID Connect Issuer URI that represents the entity which issues access tokens for this Windows Web App Slot.
     * 
     */
    private final @Nullable String issuer;
    /**
     * @return A `microsoft` block as defined below.
     * 
     */
    private final @Nullable WindowsWebAppSlotAuthSettingsMicrosoft microsoft;
    /**
     * @return The RuntimeVersion of the Authentication / Authorization feature in use for the Windows Web App Slot.
     * 
     */
    private final @Nullable String runtimeVersion;
    /**
     * @return The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
     * 
     */
    private final @Nullable Double tokenRefreshExtensionHours;
    /**
     * @return Should the Windows Web App Slot durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean tokenStoreEnabled;
    /**
     * @return A `twitter` block as defined below.
     * 
     */
    private final @Nullable WindowsWebAppSlotAuthSettingsTwitter twitter;
    /**
     * @return The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
     * 
     */
    private final @Nullable String unauthenticatedClientAction;

    @CustomType.Constructor
    private WindowsWebAppSlotAuthSettings(
        @CustomType.Parameter("activeDirectory") @Nullable WindowsWebAppSlotAuthSettingsActiveDirectory activeDirectory,
        @CustomType.Parameter("additionalLoginParameters") @Nullable Map<String,String> additionalLoginParameters,
        @CustomType.Parameter("allowedExternalRedirectUrls") @Nullable List<String> allowedExternalRedirectUrls,
        @CustomType.Parameter("defaultProvider") @Nullable String defaultProvider,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("facebook") @Nullable WindowsWebAppSlotAuthSettingsFacebook facebook,
        @CustomType.Parameter("github") @Nullable WindowsWebAppSlotAuthSettingsGithub github,
        @CustomType.Parameter("google") @Nullable WindowsWebAppSlotAuthSettingsGoogle google,
        @CustomType.Parameter("issuer") @Nullable String issuer,
        @CustomType.Parameter("microsoft") @Nullable WindowsWebAppSlotAuthSettingsMicrosoft microsoft,
        @CustomType.Parameter("runtimeVersion") @Nullable String runtimeVersion,
        @CustomType.Parameter("tokenRefreshExtensionHours") @Nullable Double tokenRefreshExtensionHours,
        @CustomType.Parameter("tokenStoreEnabled") @Nullable Boolean tokenStoreEnabled,
        @CustomType.Parameter("twitter") @Nullable WindowsWebAppSlotAuthSettingsTwitter twitter,
        @CustomType.Parameter("unauthenticatedClientAction") @Nullable String unauthenticatedClientAction) {
        this.activeDirectory = activeDirectory;
        this.additionalLoginParameters = additionalLoginParameters;
        this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
        this.defaultProvider = defaultProvider;
        this.enabled = enabled;
        this.facebook = facebook;
        this.github = github;
        this.google = google;
        this.issuer = issuer;
        this.microsoft = microsoft;
        this.runtimeVersion = runtimeVersion;
        this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
        this.tokenStoreEnabled = tokenStoreEnabled;
        this.twitter = twitter;
        this.unauthenticatedClientAction = unauthenticatedClientAction;
    }

    /**
     * @return An `active_directory` block as defined above.
     * 
     */
    public Optional<WindowsWebAppSlotAuthSettingsActiveDirectory> activeDirectory() {
        return Optional.ofNullable(this.activeDirectory);
    }
    /**
     * @return Specifies a map of login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
     * 
     */
    public Map<String,String> additionalLoginParameters() {
        return this.additionalLoginParameters == null ? Map.of() : this.additionalLoginParameters;
    }
    /**
     * @return Specifies a list of External URLs that can be redirected to as part of logging in or logging out of the Windows Web App Slot.
     * 
     */
    public List<String> allowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls == null ? List.of() : this.allowedExternalRedirectUrls;
    }
    /**
     * @return The default authentication provider to use when multiple providers are configured. Possible values include: `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount`, `Twitter`, `Github`.
     * 
     */
    public Optional<String> defaultProvider() {
        return Optional.ofNullable(this.defaultProvider);
    }
    /**
     * @return Should the Authentication / Authorization feature be enabled for the Windows Web App?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return A `facebook` block as defined below.
     * 
     */
    public Optional<WindowsWebAppSlotAuthSettingsFacebook> facebook() {
        return Optional.ofNullable(this.facebook);
    }
    /**
     * @return A `github` block as defined below.
     * 
     */
    public Optional<WindowsWebAppSlotAuthSettingsGithub> github() {
        return Optional.ofNullable(this.github);
    }
    /**
     * @return A `google` block as defined below.
     * 
     */
    public Optional<WindowsWebAppSlotAuthSettingsGoogle> google() {
        return Optional.ofNullable(this.google);
    }
    /**
     * @return The OpenID Connect Issuer URI that represents the entity which issues access tokens for this Windows Web App Slot.
     * 
     */
    public Optional<String> issuer() {
        return Optional.ofNullable(this.issuer);
    }
    /**
     * @return A `microsoft` block as defined below.
     * 
     */
    public Optional<WindowsWebAppSlotAuthSettingsMicrosoft> microsoft() {
        return Optional.ofNullable(this.microsoft);
    }
    /**
     * @return The RuntimeVersion of the Authentication / Authorization feature in use for the Windows Web App Slot.
     * 
     */
    public Optional<String> runtimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }
    /**
     * @return The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
     * 
     */
    public Optional<Double> tokenRefreshExtensionHours() {
        return Optional.ofNullable(this.tokenRefreshExtensionHours);
    }
    /**
     * @return Should the Windows Web App Slot durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
     * 
     */
    public Optional<Boolean> tokenStoreEnabled() {
        return Optional.ofNullable(this.tokenStoreEnabled);
    }
    /**
     * @return A `twitter` block as defined below.
     * 
     */
    public Optional<WindowsWebAppSlotAuthSettingsTwitter> twitter() {
        return Optional.ofNullable(this.twitter);
    }
    /**
     * @return The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
     * 
     */
    public Optional<String> unauthenticatedClientAction() {
        return Optional.ofNullable(this.unauthenticatedClientAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSlotAuthSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WindowsWebAppSlotAuthSettingsActiveDirectory activeDirectory;
        private @Nullable Map<String,String> additionalLoginParameters;
        private @Nullable List<String> allowedExternalRedirectUrls;
        private @Nullable String defaultProvider;
        private Boolean enabled;
        private @Nullable WindowsWebAppSlotAuthSettingsFacebook facebook;
        private @Nullable WindowsWebAppSlotAuthSettingsGithub github;
        private @Nullable WindowsWebAppSlotAuthSettingsGoogle google;
        private @Nullable String issuer;
        private @Nullable WindowsWebAppSlotAuthSettingsMicrosoft microsoft;
        private @Nullable String runtimeVersion;
        private @Nullable Double tokenRefreshExtensionHours;
        private @Nullable Boolean tokenStoreEnabled;
        private @Nullable WindowsWebAppSlotAuthSettingsTwitter twitter;
        private @Nullable String unauthenticatedClientAction;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsWebAppSlotAuthSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectory = defaults.activeDirectory;
    	      this.additionalLoginParameters = defaults.additionalLoginParameters;
    	      this.allowedExternalRedirectUrls = defaults.allowedExternalRedirectUrls;
    	      this.defaultProvider = defaults.defaultProvider;
    	      this.enabled = defaults.enabled;
    	      this.facebook = defaults.facebook;
    	      this.github = defaults.github;
    	      this.google = defaults.google;
    	      this.issuer = defaults.issuer;
    	      this.microsoft = defaults.microsoft;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.tokenRefreshExtensionHours = defaults.tokenRefreshExtensionHours;
    	      this.tokenStoreEnabled = defaults.tokenStoreEnabled;
    	      this.twitter = defaults.twitter;
    	      this.unauthenticatedClientAction = defaults.unauthenticatedClientAction;
        }

        public Builder activeDirectory(@Nullable WindowsWebAppSlotAuthSettingsActiveDirectory activeDirectory) {
            this.activeDirectory = activeDirectory;
            return this;
        }
        public Builder additionalLoginParameters(@Nullable Map<String,String> additionalLoginParameters) {
            this.additionalLoginParameters = additionalLoginParameters;
            return this;
        }
        public Builder allowedExternalRedirectUrls(@Nullable List<String> allowedExternalRedirectUrls) {
            this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
            return this;
        }
        public Builder allowedExternalRedirectUrls(String... allowedExternalRedirectUrls) {
            return allowedExternalRedirectUrls(List.of(allowedExternalRedirectUrls));
        }
        public Builder defaultProvider(@Nullable String defaultProvider) {
            this.defaultProvider = defaultProvider;
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder facebook(@Nullable WindowsWebAppSlotAuthSettingsFacebook facebook) {
            this.facebook = facebook;
            return this;
        }
        public Builder github(@Nullable WindowsWebAppSlotAuthSettingsGithub github) {
            this.github = github;
            return this;
        }
        public Builder google(@Nullable WindowsWebAppSlotAuthSettingsGoogle google) {
            this.google = google;
            return this;
        }
        public Builder issuer(@Nullable String issuer) {
            this.issuer = issuer;
            return this;
        }
        public Builder microsoft(@Nullable WindowsWebAppSlotAuthSettingsMicrosoft microsoft) {
            this.microsoft = microsoft;
            return this;
        }
        public Builder runtimeVersion(@Nullable String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public Builder tokenRefreshExtensionHours(@Nullable Double tokenRefreshExtensionHours) {
            this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
            return this;
        }
        public Builder tokenStoreEnabled(@Nullable Boolean tokenStoreEnabled) {
            this.tokenStoreEnabled = tokenStoreEnabled;
            return this;
        }
        public Builder twitter(@Nullable WindowsWebAppSlotAuthSettingsTwitter twitter) {
            this.twitter = twitter;
            return this;
        }
        public Builder unauthenticatedClientAction(@Nullable String unauthenticatedClientAction) {
            this.unauthenticatedClientAction = unauthenticatedClientAction;
            return this;
        }        public WindowsWebAppSlotAuthSettings build() {
            return new WindowsWebAppSlotAuthSettings(activeDirectory, additionalLoginParameters, allowedExternalRedirectUrls, defaultProvider, enabled, facebook, github, google, issuer, microsoft, runtimeVersion, tokenRefreshExtensionHours, tokenStoreEnabled, twitter, unauthenticatedClientAction);
        }
    }
}