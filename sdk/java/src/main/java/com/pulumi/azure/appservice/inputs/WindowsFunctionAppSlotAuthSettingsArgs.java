// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsActiveDirectoryArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsFacebookArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsGithubArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsGoogleArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsMicrosoftArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsTwitterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsFunctionAppSlotAuthSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsFunctionAppSlotAuthSettingsArgs Empty = new WindowsFunctionAppSlotAuthSettingsArgs();

    /**
     * an `active_directory` block as detailed below.
     * 
     */
    @Import(name="activeDirectory")
    private @Nullable Output<WindowsFunctionAppSlotAuthSettingsActiveDirectoryArgs> activeDirectory;

    /**
     * @return an `active_directory` block as detailed below.
     * 
     */
    public Optional<Output<WindowsFunctionAppSlotAuthSettingsActiveDirectoryArgs>> activeDirectory() {
        return Optional.ofNullable(this.activeDirectory);
    }

    /**
     * Specifies a map of login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
     * 
     */
    @Import(name="additionalLoginParameters")
    private @Nullable Output<Map<String,String>> additionalLoginParameters;

    /**
     * @return Specifies a map of login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalLoginParameters() {
        return Optional.ofNullable(this.additionalLoginParameters);
    }

    /**
     * an `allowed_external_redirect_urls` block as detailed below.
     * 
     */
    @Import(name="allowedExternalRedirectUrls")
    private @Nullable Output<List<String>> allowedExternalRedirectUrls;

    /**
     * @return an `allowed_external_redirect_urls` block as detailed below.
     * 
     */
    public Optional<Output<List<String>>> allowedExternalRedirectUrls() {
        return Optional.ofNullable(this.allowedExternalRedirectUrls);
    }

    /**
     * The default authentication provider to use when multiple providers are configured. Possible values include: `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount`, `Twitter`, `Github`.
     * 
     */
    @Import(name="defaultProvider")
    private @Nullable Output<String> defaultProvider;

    /**
     * @return The default authentication provider to use when multiple providers are configured. Possible values include: `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount`, `Twitter`, `Github`.
     * 
     */
    public Optional<Output<String>> defaultProvider() {
        return Optional.ofNullable(this.defaultProvider);
    }

    /**
     * Should the Authentication / Authorization feature be enabled?
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Should the Authentication / Authorization feature be enabled?
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * a `facebook` block as detailed below.
     * 
     */
    @Import(name="facebook")
    private @Nullable Output<WindowsFunctionAppSlotAuthSettingsFacebookArgs> facebook;

    /**
     * @return a `facebook` block as detailed below.
     * 
     */
    public Optional<Output<WindowsFunctionAppSlotAuthSettingsFacebookArgs>> facebook() {
        return Optional.ofNullable(this.facebook);
    }

    /**
     * a `github` block as detailed below.
     * 
     */
    @Import(name="github")
    private @Nullable Output<WindowsFunctionAppSlotAuthSettingsGithubArgs> github;

    /**
     * @return a `github` block as detailed below.
     * 
     */
    public Optional<Output<WindowsFunctionAppSlotAuthSettingsGithubArgs>> github() {
        return Optional.ofNullable(this.github);
    }

    /**
     * a `google` block as detailed below.
     * 
     */
    @Import(name="google")
    private @Nullable Output<WindowsFunctionAppSlotAuthSettingsGoogleArgs> google;

    /**
     * @return a `google` block as detailed below.
     * 
     */
    public Optional<Output<WindowsFunctionAppSlotAuthSettingsGoogleArgs>> google() {
        return Optional.ofNullable(this.google);
    }

    /**
     * The OpenID Connect Issuer URI that represents the entity which issues access tokens.
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    /**
     * @return The OpenID Connect Issuer URI that represents the entity which issues access tokens.
     * 
     */
    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * a `microsoft` block as detailed below.
     * 
     */
    @Import(name="microsoft")
    private @Nullable Output<WindowsFunctionAppSlotAuthSettingsMicrosoftArgs> microsoft;

    /**
     * @return a `microsoft` block as detailed below.
     * 
     */
    public Optional<Output<WindowsFunctionAppSlotAuthSettingsMicrosoftArgs>> microsoft() {
        return Optional.ofNullable(this.microsoft);
    }

    /**
     * The RuntimeVersion of the Authentication / Authorization feature in use.
     * 
     */
    @Import(name="runtimeVersion")
    private @Nullable Output<String> runtimeVersion;

    /**
     * @return The RuntimeVersion of the Authentication / Authorization feature in use.
     * 
     */
    public Optional<Output<String>> runtimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }

    /**
     * The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
     * 
     */
    @Import(name="tokenRefreshExtensionHours")
    private @Nullable Output<Double> tokenRefreshExtensionHours;

    /**
     * @return The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
     * 
     */
    public Optional<Output<Double>> tokenRefreshExtensionHours() {
        return Optional.ofNullable(this.tokenRefreshExtensionHours);
    }

    /**
     * Should the Windows Web App durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
     * 
     */
    @Import(name="tokenStoreEnabled")
    private @Nullable Output<Boolean> tokenStoreEnabled;

    /**
     * @return Should the Windows Web App durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tokenStoreEnabled() {
        return Optional.ofNullable(this.tokenStoreEnabled);
    }

    /**
     * a `twitter` block as detailed below.
     * 
     */
    @Import(name="twitter")
    private @Nullable Output<WindowsFunctionAppSlotAuthSettingsTwitterArgs> twitter;

    /**
     * @return a `twitter` block as detailed below.
     * 
     */
    public Optional<Output<WindowsFunctionAppSlotAuthSettingsTwitterArgs>> twitter() {
        return Optional.ofNullable(this.twitter);
    }

    /**
     * The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
     * 
     */
    @Import(name="unauthenticatedClientAction")
    private @Nullable Output<String> unauthenticatedClientAction;

    /**
     * @return The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
     * 
     */
    public Optional<Output<String>> unauthenticatedClientAction() {
        return Optional.ofNullable(this.unauthenticatedClientAction);
    }

    private WindowsFunctionAppSlotAuthSettingsArgs() {}

    private WindowsFunctionAppSlotAuthSettingsArgs(WindowsFunctionAppSlotAuthSettingsArgs $) {
        this.activeDirectory = $.activeDirectory;
        this.additionalLoginParameters = $.additionalLoginParameters;
        this.allowedExternalRedirectUrls = $.allowedExternalRedirectUrls;
        this.defaultProvider = $.defaultProvider;
        this.enabled = $.enabled;
        this.facebook = $.facebook;
        this.github = $.github;
        this.google = $.google;
        this.issuer = $.issuer;
        this.microsoft = $.microsoft;
        this.runtimeVersion = $.runtimeVersion;
        this.tokenRefreshExtensionHours = $.tokenRefreshExtensionHours;
        this.tokenStoreEnabled = $.tokenStoreEnabled;
        this.twitter = $.twitter;
        this.unauthenticatedClientAction = $.unauthenticatedClientAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsFunctionAppSlotAuthSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsFunctionAppSlotAuthSettingsArgs $;

        public Builder() {
            $ = new WindowsFunctionAppSlotAuthSettingsArgs();
        }

        public Builder(WindowsFunctionAppSlotAuthSettingsArgs defaults) {
            $ = new WindowsFunctionAppSlotAuthSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeDirectory an `active_directory` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectory(@Nullable Output<WindowsFunctionAppSlotAuthSettingsActiveDirectoryArgs> activeDirectory) {
            $.activeDirectory = activeDirectory;
            return this;
        }

        /**
         * @param activeDirectory an `active_directory` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectory(WindowsFunctionAppSlotAuthSettingsActiveDirectoryArgs activeDirectory) {
            return activeDirectory(Output.of(activeDirectory));
        }

        /**
         * @param additionalLoginParameters Specifies a map of login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
         * 
         * @return builder
         * 
         */
        public Builder additionalLoginParameters(@Nullable Output<Map<String,String>> additionalLoginParameters) {
            $.additionalLoginParameters = additionalLoginParameters;
            return this;
        }

        /**
         * @param additionalLoginParameters Specifies a map of login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
         * 
         * @return builder
         * 
         */
        public Builder additionalLoginParameters(Map<String,String> additionalLoginParameters) {
            return additionalLoginParameters(Output.of(additionalLoginParameters));
        }

        /**
         * @param allowedExternalRedirectUrls an `allowed_external_redirect_urls` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder allowedExternalRedirectUrls(@Nullable Output<List<String>> allowedExternalRedirectUrls) {
            $.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
            return this;
        }

        /**
         * @param allowedExternalRedirectUrls an `allowed_external_redirect_urls` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder allowedExternalRedirectUrls(List<String> allowedExternalRedirectUrls) {
            return allowedExternalRedirectUrls(Output.of(allowedExternalRedirectUrls));
        }

        /**
         * @param allowedExternalRedirectUrls an `allowed_external_redirect_urls` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder allowedExternalRedirectUrls(String... allowedExternalRedirectUrls) {
            return allowedExternalRedirectUrls(List.of(allowedExternalRedirectUrls));
        }

        /**
         * @param defaultProvider The default authentication provider to use when multiple providers are configured. Possible values include: `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount`, `Twitter`, `Github`.
         * 
         * @return builder
         * 
         */
        public Builder defaultProvider(@Nullable Output<String> defaultProvider) {
            $.defaultProvider = defaultProvider;
            return this;
        }

        /**
         * @param defaultProvider The default authentication provider to use when multiple providers are configured. Possible values include: `AzureActiveDirectory`, `Facebook`, `Google`, `MicrosoftAccount`, `Twitter`, `Github`.
         * 
         * @return builder
         * 
         */
        public Builder defaultProvider(String defaultProvider) {
            return defaultProvider(Output.of(defaultProvider));
        }

        /**
         * @param enabled Should the Authentication / Authorization feature be enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should the Authentication / Authorization feature be enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param facebook a `facebook` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder facebook(@Nullable Output<WindowsFunctionAppSlotAuthSettingsFacebookArgs> facebook) {
            $.facebook = facebook;
            return this;
        }

        /**
         * @param facebook a `facebook` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder facebook(WindowsFunctionAppSlotAuthSettingsFacebookArgs facebook) {
            return facebook(Output.of(facebook));
        }

        /**
         * @param github a `github` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder github(@Nullable Output<WindowsFunctionAppSlotAuthSettingsGithubArgs> github) {
            $.github = github;
            return this;
        }

        /**
         * @param github a `github` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder github(WindowsFunctionAppSlotAuthSettingsGithubArgs github) {
            return github(Output.of(github));
        }

        /**
         * @param google a `google` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder google(@Nullable Output<WindowsFunctionAppSlotAuthSettingsGoogleArgs> google) {
            $.google = google;
            return this;
        }

        /**
         * @param google a `google` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder google(WindowsFunctionAppSlotAuthSettingsGoogleArgs google) {
            return google(Output.of(google));
        }

        /**
         * @param issuer The OpenID Connect Issuer URI that represents the entity which issues access tokens.
         * 
         * @return builder
         * 
         */
        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer The OpenID Connect Issuer URI that represents the entity which issues access tokens.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param microsoft a `microsoft` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder microsoft(@Nullable Output<WindowsFunctionAppSlotAuthSettingsMicrosoftArgs> microsoft) {
            $.microsoft = microsoft;
            return this;
        }

        /**
         * @param microsoft a `microsoft` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder microsoft(WindowsFunctionAppSlotAuthSettingsMicrosoftArgs microsoft) {
            return microsoft(Output.of(microsoft));
        }

        /**
         * @param runtimeVersion The RuntimeVersion of the Authentication / Authorization feature in use.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(@Nullable Output<String> runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        /**
         * @param runtimeVersion The RuntimeVersion of the Authentication / Authorization feature in use.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(String runtimeVersion) {
            return runtimeVersion(Output.of(runtimeVersion));
        }

        /**
         * @param tokenRefreshExtensionHours The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
         * 
         * @return builder
         * 
         */
        public Builder tokenRefreshExtensionHours(@Nullable Output<Double> tokenRefreshExtensionHours) {
            $.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
            return this;
        }

        /**
         * @param tokenRefreshExtensionHours The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
         * 
         * @return builder
         * 
         */
        public Builder tokenRefreshExtensionHours(Double tokenRefreshExtensionHours) {
            return tokenRefreshExtensionHours(Output.of(tokenRefreshExtensionHours));
        }

        /**
         * @param tokenStoreEnabled Should the Windows Web App durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tokenStoreEnabled(@Nullable Output<Boolean> tokenStoreEnabled) {
            $.tokenStoreEnabled = tokenStoreEnabled;
            return this;
        }

        /**
         * @param tokenStoreEnabled Should the Windows Web App durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tokenStoreEnabled(Boolean tokenStoreEnabled) {
            return tokenStoreEnabled(Output.of(tokenStoreEnabled));
        }

        /**
         * @param twitter a `twitter` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder twitter(@Nullable Output<WindowsFunctionAppSlotAuthSettingsTwitterArgs> twitter) {
            $.twitter = twitter;
            return this;
        }

        /**
         * @param twitter a `twitter` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder twitter(WindowsFunctionAppSlotAuthSettingsTwitterArgs twitter) {
            return twitter(Output.of(twitter));
        }

        /**
         * @param unauthenticatedClientAction The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
         * 
         * @return builder
         * 
         */
        public Builder unauthenticatedClientAction(@Nullable Output<String> unauthenticatedClientAction) {
            $.unauthenticatedClientAction = unauthenticatedClientAction;
            return this;
        }

        /**
         * @param unauthenticatedClientAction The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
         * 
         * @return builder
         * 
         */
        public Builder unauthenticatedClientAction(String unauthenticatedClientAction) {
            return unauthenticatedClientAction(Output.of(unauthenticatedClientAction));
        }

        public WindowsFunctionAppSlotAuthSettingsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}