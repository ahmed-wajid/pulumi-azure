// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetAppServiceConnectionString;
import com.pulumi.azure.appservice.outputs.GetAppServiceSiteConfig;
import com.pulumi.azure.appservice.outputs.GetAppServiceSiteCredential;
import com.pulumi.azure.appservice.outputs.GetAppServiceSourceControl;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAppServiceResult {
    /**
     * @return The ID of the App Service Plan within which the App Service exists.
     * 
     */
    private final String appServicePlanId;
    /**
     * @return A key-value pair of App Settings for the App Service.
     * 
     */
    private final Map<String,String> appSettings;
    /**
     * @return Does the App Service send session affinity cookies, which route client requests in the same session to the same instance?
     * 
     */
    private final Boolean clientAffinityEnabled;
    /**
     * @return Does the App Service require client certificates for incoming requests?
     * 
     */
    private final Boolean clientCertEnabled;
    /**
     * @return An `connection_string` block as defined below.
     * 
     */
    private final List<GetAppServiceConnectionString> connectionStrings;
    /**
     * @return An identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    private final String customDomainVerificationId;
    /**
     * @return The Default Hostname associated with the App Service - such as `mysite.azurewebsites.net`
     * 
     */
    private final String defaultSiteHostname;
    /**
     * @return Is the App Service Enabled?
     * 
     */
    private final Boolean enabled;
    /**
     * @return Can the App Service only be accessed via HTTPS?
     * 
     */
    private final Boolean httpsOnly;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Azure location where the App Service exists.
     * 
     */
    private final String location;
    /**
     * @return The name for this IP Restriction.
     * 
     */
    private final String name;
    /**
     * @return A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
     * 
     */
    private final List<String> outboundIpAddressLists;
    /**
     * @return A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`
     * 
     */
    private final String outboundIpAddresses;
    /**
     * @return A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;, &#34;52.143.43.17&#34;]` - not all of which are necessarily in use. Superset of `outbound_ip_address_list`.
     * 
     */
    private final List<String> possibleOutboundIpAddressLists;
    /**
     * @return A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
     * 
     */
    private final String possibleOutboundIpAddresses;
    private final String resourceGroupName;
    /**
     * @return A `site_config` block as defined below.
     * 
     */
    private final List<GetAppServiceSiteConfig> siteConfigs;
    private final List<GetAppServiceSiteCredential> siteCredentials;
    /**
     * @return A `source_control` block as defined below.
     * 
     */
    private final List<GetAppServiceSourceControl> sourceControls;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetAppServiceResult(
        @CustomType.Parameter("appServicePlanId") String appServicePlanId,
        @CustomType.Parameter("appSettings") Map<String,String> appSettings,
        @CustomType.Parameter("clientAffinityEnabled") Boolean clientAffinityEnabled,
        @CustomType.Parameter("clientCertEnabled") Boolean clientCertEnabled,
        @CustomType.Parameter("connectionStrings") List<GetAppServiceConnectionString> connectionStrings,
        @CustomType.Parameter("customDomainVerificationId") String customDomainVerificationId,
        @CustomType.Parameter("defaultSiteHostname") String defaultSiteHostname,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("httpsOnly") Boolean httpsOnly,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outboundIpAddressLists") List<String> outboundIpAddressLists,
        @CustomType.Parameter("outboundIpAddresses") String outboundIpAddresses,
        @CustomType.Parameter("possibleOutboundIpAddressLists") List<String> possibleOutboundIpAddressLists,
        @CustomType.Parameter("possibleOutboundIpAddresses") String possibleOutboundIpAddresses,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("siteConfigs") List<GetAppServiceSiteConfig> siteConfigs,
        @CustomType.Parameter("siteCredentials") List<GetAppServiceSiteCredential> siteCredentials,
        @CustomType.Parameter("sourceControls") List<GetAppServiceSourceControl> sourceControls,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.appServicePlanId = appServicePlanId;
        this.appSettings = appSettings;
        this.clientAffinityEnabled = clientAffinityEnabled;
        this.clientCertEnabled = clientCertEnabled;
        this.connectionStrings = connectionStrings;
        this.customDomainVerificationId = customDomainVerificationId;
        this.defaultSiteHostname = defaultSiteHostname;
        this.enabled = enabled;
        this.httpsOnly = httpsOnly;
        this.id = id;
        this.location = location;
        this.name = name;
        this.outboundIpAddressLists = outboundIpAddressLists;
        this.outboundIpAddresses = outboundIpAddresses;
        this.possibleOutboundIpAddressLists = possibleOutboundIpAddressLists;
        this.possibleOutboundIpAddresses = possibleOutboundIpAddresses;
        this.resourceGroupName = resourceGroupName;
        this.siteConfigs = siteConfigs;
        this.siteCredentials = siteCredentials;
        this.sourceControls = sourceControls;
        this.tags = tags;
    }

    /**
     * @return The ID of the App Service Plan within which the App Service exists.
     * 
     */
    public String appServicePlanId() {
        return this.appServicePlanId;
    }
    /**
     * @return A key-value pair of App Settings for the App Service.
     * 
     */
    public Map<String,String> appSettings() {
        return this.appSettings;
    }
    /**
     * @return Does the App Service send session affinity cookies, which route client requests in the same session to the same instance?
     * 
     */
    public Boolean clientAffinityEnabled() {
        return this.clientAffinityEnabled;
    }
    /**
     * @return Does the App Service require client certificates for incoming requests?
     * 
     */
    public Boolean clientCertEnabled() {
        return this.clientCertEnabled;
    }
    /**
     * @return An `connection_string` block as defined below.
     * 
     */
    public List<GetAppServiceConnectionString> connectionStrings() {
        return this.connectionStrings;
    }
    /**
     * @return An identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    public String customDomainVerificationId() {
        return this.customDomainVerificationId;
    }
    /**
     * @return The Default Hostname associated with the App Service - such as `mysite.azurewebsites.net`
     * 
     */
    public String defaultSiteHostname() {
        return this.defaultSiteHostname;
    }
    /**
     * @return Is the App Service Enabled?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Can the App Service only be accessed via HTTPS?
     * 
     */
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure location where the App Service exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name for this IP Restriction.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
     * 
     */
    public List<String> outboundIpAddressLists() {
        return this.outboundIpAddressLists;
    }
    /**
     * @return A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`
     * 
     */
    public String outboundIpAddresses() {
        return this.outboundIpAddresses;
    }
    /**
     * @return A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;, &#34;52.143.43.17&#34;]` - not all of which are necessarily in use. Superset of `outbound_ip_address_list`.
     * 
     */
    public List<String> possibleOutboundIpAddressLists() {
        return this.possibleOutboundIpAddressLists;
    }
    /**
     * @return A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
     * 
     */
    public String possibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A `site_config` block as defined below.
     * 
     */
    public List<GetAppServiceSiteConfig> siteConfigs() {
        return this.siteConfigs;
    }
    public List<GetAppServiceSiteCredential> siteCredentials() {
        return this.siteCredentials;
    }
    /**
     * @return A `source_control` block as defined below.
     * 
     */
    public List<GetAppServiceSourceControl> sourceControls() {
        return this.sourceControls;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appServicePlanId;
        private Map<String,String> appSettings;
        private Boolean clientAffinityEnabled;
        private Boolean clientCertEnabled;
        private List<GetAppServiceConnectionString> connectionStrings;
        private String customDomainVerificationId;
        private String defaultSiteHostname;
        private Boolean enabled;
        private Boolean httpsOnly;
        private String id;
        private String location;
        private String name;
        private List<String> outboundIpAddressLists;
        private String outboundIpAddresses;
        private List<String> possibleOutboundIpAddressLists;
        private String possibleOutboundIpAddresses;
        private String resourceGroupName;
        private List<GetAppServiceSiteConfig> siteConfigs;
        private List<GetAppServiceSiteCredential> siteCredentials;
        private List<GetAppServiceSourceControl> sourceControls;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appServicePlanId = defaults.appServicePlanId;
    	      this.appSettings = defaults.appSettings;
    	      this.clientAffinityEnabled = defaults.clientAffinityEnabled;
    	      this.clientCertEnabled = defaults.clientCertEnabled;
    	      this.connectionStrings = defaults.connectionStrings;
    	      this.customDomainVerificationId = defaults.customDomainVerificationId;
    	      this.defaultSiteHostname = defaults.defaultSiteHostname;
    	      this.enabled = defaults.enabled;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outboundIpAddressLists = defaults.outboundIpAddressLists;
    	      this.outboundIpAddresses = defaults.outboundIpAddresses;
    	      this.possibleOutboundIpAddressLists = defaults.possibleOutboundIpAddressLists;
    	      this.possibleOutboundIpAddresses = defaults.possibleOutboundIpAddresses;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteConfigs = defaults.siteConfigs;
    	      this.siteCredentials = defaults.siteCredentials;
    	      this.sourceControls = defaults.sourceControls;
    	      this.tags = defaults.tags;
        }

        public Builder appServicePlanId(String appServicePlanId) {
            this.appServicePlanId = Objects.requireNonNull(appServicePlanId);
            return this;
        }
        public Builder appSettings(Map<String,String> appSettings) {
            this.appSettings = Objects.requireNonNull(appSettings);
            return this;
        }
        public Builder clientAffinityEnabled(Boolean clientAffinityEnabled) {
            this.clientAffinityEnabled = Objects.requireNonNull(clientAffinityEnabled);
            return this;
        }
        public Builder clientCertEnabled(Boolean clientCertEnabled) {
            this.clientCertEnabled = Objects.requireNonNull(clientCertEnabled);
            return this;
        }
        public Builder connectionStrings(List<GetAppServiceConnectionString> connectionStrings) {
            this.connectionStrings = Objects.requireNonNull(connectionStrings);
            return this;
        }
        public Builder connectionStrings(GetAppServiceConnectionString... connectionStrings) {
            return connectionStrings(List.of(connectionStrings));
        }
        public Builder customDomainVerificationId(String customDomainVerificationId) {
            this.customDomainVerificationId = Objects.requireNonNull(customDomainVerificationId);
            return this;
        }
        public Builder defaultSiteHostname(String defaultSiteHostname) {
            this.defaultSiteHostname = Objects.requireNonNull(defaultSiteHostname);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder httpsOnly(Boolean httpsOnly) {
            this.httpsOnly = Objects.requireNonNull(httpsOnly);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outboundIpAddressLists(List<String> outboundIpAddressLists) {
            this.outboundIpAddressLists = Objects.requireNonNull(outboundIpAddressLists);
            return this;
        }
        public Builder outboundIpAddressLists(String... outboundIpAddressLists) {
            return outboundIpAddressLists(List.of(outboundIpAddressLists));
        }
        public Builder outboundIpAddresses(String outboundIpAddresses) {
            this.outboundIpAddresses = Objects.requireNonNull(outboundIpAddresses);
            return this;
        }
        public Builder possibleOutboundIpAddressLists(List<String> possibleOutboundIpAddressLists) {
            this.possibleOutboundIpAddressLists = Objects.requireNonNull(possibleOutboundIpAddressLists);
            return this;
        }
        public Builder possibleOutboundIpAddressLists(String... possibleOutboundIpAddressLists) {
            return possibleOutboundIpAddressLists(List.of(possibleOutboundIpAddressLists));
        }
        public Builder possibleOutboundIpAddresses(String possibleOutboundIpAddresses) {
            this.possibleOutboundIpAddresses = Objects.requireNonNull(possibleOutboundIpAddresses);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder siteConfigs(List<GetAppServiceSiteConfig> siteConfigs) {
            this.siteConfigs = Objects.requireNonNull(siteConfigs);
            return this;
        }
        public Builder siteConfigs(GetAppServiceSiteConfig... siteConfigs) {
            return siteConfigs(List.of(siteConfigs));
        }
        public Builder siteCredentials(List<GetAppServiceSiteCredential> siteCredentials) {
            this.siteCredentials = Objects.requireNonNull(siteCredentials);
            return this;
        }
        public Builder siteCredentials(GetAppServiceSiteCredential... siteCredentials) {
            return siteCredentials(List.of(siteCredentials));
        }
        public Builder sourceControls(List<GetAppServiceSourceControl> sourceControls) {
            this.sourceControls = Objects.requireNonNull(sourceControls);
            return this;
        }
        public Builder sourceControls(GetAppServiceSourceControl... sourceControls) {
            return sourceControls(List.of(sourceControls));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetAppServiceResult build() {
            return new GetAppServiceResult(appServicePlanId, appSettings, clientAffinityEnabled, clientCertEnabled, connectionStrings, customDomainVerificationId, defaultSiteHostname, enabled, httpsOnly, id, location, name, outboundIpAddressLists, outboundIpAddresses, possibleOutboundIpAddressLists, possibleOutboundIpAddresses, resourceGroupName, siteConfigs, siteCredentials, sourceControls, tags);
        }
    }
}