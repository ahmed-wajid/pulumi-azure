// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.LinuxFunctionAppSiteConfigAppServiceLogs;
import com.pulumi.azure.appservice.outputs.LinuxFunctionAppSiteConfigApplicationStack;
import com.pulumi.azure.appservice.outputs.LinuxFunctionAppSiteConfigCors;
import com.pulumi.azure.appservice.outputs.LinuxFunctionAppSiteConfigIpRestriction;
import com.pulumi.azure.appservice.outputs.LinuxFunctionAppSiteConfigScmIpRestriction;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxFunctionAppSiteConfig {
    /**
     * @return If this Linux Web App is Always On enabled. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean alwaysOn;
    /**
     * @return The URL of the API definition that describes this Linux Function App.
     * 
     */
    private final @Nullable String apiDefinitionUrl;
    /**
     * @return The ID of the API Management API for this Linux Function App.
     * 
     */
    private final @Nullable String apiManagementApiId;
    /**
     * @return The App command line to launch.
     * 
     */
    private final @Nullable String appCommandLine;
    /**
     * @return The number of workers this function app can scale out to. Only applicable to apps on the Consumption and Premium plan.
     * 
     */
    private final @Nullable Integer appScaleLimit;
    /**
     * @return An `app_service_logs` block as defined above.
     * 
     */
    private final @Nullable LinuxFunctionAppSiteConfigAppServiceLogs appServiceLogs;
    /**
     * @return The Connection String for linking the Linux Function App to Application Insights.
     * 
     */
    private final @Nullable String applicationInsightsConnectionString;
    /**
     * @return The Instrumentation Key for connecting the Linux Function App to Application Insights.
     * 
     */
    private final @Nullable String applicationInsightsKey;
    /**
     * @return An `application_stack` block as defined above.
     * 
     */
    private final @Nullable LinuxFunctionAppSiteConfigApplicationStack applicationStack;
    /**
     * @return The Client ID of the Managed Service Identity to use for connections to the Azure Container Registry.
     * 
     */
    private final @Nullable String containerRegistryManagedIdentityClientId;
    /**
     * @return Should connections for Azure Container Registry use Managed Identity.
     * 
     */
    private final @Nullable Boolean containerRegistryUseManagedIdentity;
    /**
     * @return A `cors` block as defined above.
     * 
     */
    private final @Nullable LinuxFunctionAppSiteConfigCors cors;
    /**
     * @return Specifies a list of Default Documents for the Linux Web App.
     * 
     */
    private final @Nullable List<String> defaultDocuments;
    private final @Nullable Boolean detailedErrorLoggingEnabled;
    /**
     * @return The number of minimum instances for this Linux Function App. Only affects apps on Elastic Premium plans.
     * 
     */
    private final @Nullable Integer elasticInstanceMinimum;
    /**
     * @return State of FTP / FTPS service for this function app. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`. Defaults to `Disabled`.
     * 
     */
    private final @Nullable String ftpsState;
    /**
     * @return The amount of time in minutes that a node can be unhealthy before being removed from the load balancer. Possible values are between `2` and `10`. Only valid in conjunction with `health_check_path`.
     * 
     */
    private final @Nullable Integer healthCheckEvictionTimeInMin;
    /**
     * @return The path to be checked for this function app health.
     * 
     */
    private final @Nullable String healthCheckPath;
    /**
     * @return Specifies if the HTTP2 protocol should be enabled. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean http2Enabled;
    /**
     * @return One or more `ip_restriction` blocks as defined above.
     * 
     */
    private final @Nullable List<LinuxFunctionAppSiteConfigIpRestriction> ipRestrictions;
    private final @Nullable String linuxFxVersion;
    /**
     * @return The Site load balancing mode. Possible values include: `WeightedRoundRobin`, `LeastRequests`, `LeastResponseTime`, `WeightedTotalTraffic`, `RequestHash`, `PerSiteRoundRobin`. Defaults to `LeastRequests` if omitted.
     * 
     */
    private final @Nullable String loadBalancingMode;
    /**
     * @return Managed pipeline mode. Possible values include: `Integrated`, `Classic`. Defaults to `Integrated`.
     * 
     */
    private final @Nullable String managedPipelineMode;
    /**
     * @return The configures the minimum version of TLS required for SSL requests. Possible values include: `1.0`, `1.1`, and  `1.2`. Defaults to `1.2`.
     * 
     */
    private final @Nullable String minimumTlsVersion;
    /**
     * @return The number of pre-warmed instances for this function app. Only affects apps on an Elastic Premium plan.
     * 
     */
    private final @Nullable Integer preWarmedInstanceCount;
    /**
     * @return Should Remote Debugging be enabled. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean remoteDebuggingEnabled;
    /**
     * @return The Remote Debugging Version. Possible values include `VS2017` and `VS2019`.
     * 
     */
    private final @Nullable String remoteDebuggingVersion;
    /**
     * @return Should Scale Monitoring of the Functions Runtime be enabled?
     * 
     */
    private final @Nullable Boolean runtimeScaleMonitoringEnabled;
    /**
     * @return One or more `scm_ip_restriction` blocks as defined above.
     * 
     */
    private final @Nullable List<LinuxFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions;
    /**
     * @return Configures the minimum version of TLS required for SSL requests to the SCM site Possible values include: `1.0`, `1.1`, and  `1.2`. Defaults to `1.2`.
     * 
     */
    private final @Nullable String scmMinimumTlsVersion;
    private final @Nullable String scmType;
    /**
     * @return Should the Linux Function App `ip_restriction` configuration be used for the SCM also.
     * 
     */
    private final @Nullable Boolean scmUseMainIpRestriction;
    /**
     * @return Should the Linux Web App use a 32-bit worker process. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean use32BitWorker;
    /**
     * @return Should all outbound traffic to have NAT Gateways, Network Security Groups and User Defined Routes applied? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean vnetRouteAllEnabled;
    /**
     * @return Should Web Sockets be enabled. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean websocketsEnabled;
    /**
     * @return The number of Workers for this Linux Function App.
     * 
     */
    private final @Nullable Integer workerCount;

    @CustomType.Constructor
    private LinuxFunctionAppSiteConfig(
        @CustomType.Parameter("alwaysOn") @Nullable Boolean alwaysOn,
        @CustomType.Parameter("apiDefinitionUrl") @Nullable String apiDefinitionUrl,
        @CustomType.Parameter("apiManagementApiId") @Nullable String apiManagementApiId,
        @CustomType.Parameter("appCommandLine") @Nullable String appCommandLine,
        @CustomType.Parameter("appScaleLimit") @Nullable Integer appScaleLimit,
        @CustomType.Parameter("appServiceLogs") @Nullable LinuxFunctionAppSiteConfigAppServiceLogs appServiceLogs,
        @CustomType.Parameter("applicationInsightsConnectionString") @Nullable String applicationInsightsConnectionString,
        @CustomType.Parameter("applicationInsightsKey") @Nullable String applicationInsightsKey,
        @CustomType.Parameter("applicationStack") @Nullable LinuxFunctionAppSiteConfigApplicationStack applicationStack,
        @CustomType.Parameter("containerRegistryManagedIdentityClientId") @Nullable String containerRegistryManagedIdentityClientId,
        @CustomType.Parameter("containerRegistryUseManagedIdentity") @Nullable Boolean containerRegistryUseManagedIdentity,
        @CustomType.Parameter("cors") @Nullable LinuxFunctionAppSiteConfigCors cors,
        @CustomType.Parameter("defaultDocuments") @Nullable List<String> defaultDocuments,
        @CustomType.Parameter("detailedErrorLoggingEnabled") @Nullable Boolean detailedErrorLoggingEnabled,
        @CustomType.Parameter("elasticInstanceMinimum") @Nullable Integer elasticInstanceMinimum,
        @CustomType.Parameter("ftpsState") @Nullable String ftpsState,
        @CustomType.Parameter("healthCheckEvictionTimeInMin") @Nullable Integer healthCheckEvictionTimeInMin,
        @CustomType.Parameter("healthCheckPath") @Nullable String healthCheckPath,
        @CustomType.Parameter("http2Enabled") @Nullable Boolean http2Enabled,
        @CustomType.Parameter("ipRestrictions") @Nullable List<LinuxFunctionAppSiteConfigIpRestriction> ipRestrictions,
        @CustomType.Parameter("linuxFxVersion") @Nullable String linuxFxVersion,
        @CustomType.Parameter("loadBalancingMode") @Nullable String loadBalancingMode,
        @CustomType.Parameter("managedPipelineMode") @Nullable String managedPipelineMode,
        @CustomType.Parameter("minimumTlsVersion") @Nullable String minimumTlsVersion,
        @CustomType.Parameter("preWarmedInstanceCount") @Nullable Integer preWarmedInstanceCount,
        @CustomType.Parameter("remoteDebuggingEnabled") @Nullable Boolean remoteDebuggingEnabled,
        @CustomType.Parameter("remoteDebuggingVersion") @Nullable String remoteDebuggingVersion,
        @CustomType.Parameter("runtimeScaleMonitoringEnabled") @Nullable Boolean runtimeScaleMonitoringEnabled,
        @CustomType.Parameter("scmIpRestrictions") @Nullable List<LinuxFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions,
        @CustomType.Parameter("scmMinimumTlsVersion") @Nullable String scmMinimumTlsVersion,
        @CustomType.Parameter("scmType") @Nullable String scmType,
        @CustomType.Parameter("scmUseMainIpRestriction") @Nullable Boolean scmUseMainIpRestriction,
        @CustomType.Parameter("use32BitWorker") @Nullable Boolean use32BitWorker,
        @CustomType.Parameter("vnetRouteAllEnabled") @Nullable Boolean vnetRouteAllEnabled,
        @CustomType.Parameter("websocketsEnabled") @Nullable Boolean websocketsEnabled,
        @CustomType.Parameter("workerCount") @Nullable Integer workerCount) {
        this.alwaysOn = alwaysOn;
        this.apiDefinitionUrl = apiDefinitionUrl;
        this.apiManagementApiId = apiManagementApiId;
        this.appCommandLine = appCommandLine;
        this.appScaleLimit = appScaleLimit;
        this.appServiceLogs = appServiceLogs;
        this.applicationInsightsConnectionString = applicationInsightsConnectionString;
        this.applicationInsightsKey = applicationInsightsKey;
        this.applicationStack = applicationStack;
        this.containerRegistryManagedIdentityClientId = containerRegistryManagedIdentityClientId;
        this.containerRegistryUseManagedIdentity = containerRegistryUseManagedIdentity;
        this.cors = cors;
        this.defaultDocuments = defaultDocuments;
        this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
        this.elasticInstanceMinimum = elasticInstanceMinimum;
        this.ftpsState = ftpsState;
        this.healthCheckEvictionTimeInMin = healthCheckEvictionTimeInMin;
        this.healthCheckPath = healthCheckPath;
        this.http2Enabled = http2Enabled;
        this.ipRestrictions = ipRestrictions;
        this.linuxFxVersion = linuxFxVersion;
        this.loadBalancingMode = loadBalancingMode;
        this.managedPipelineMode = managedPipelineMode;
        this.minimumTlsVersion = minimumTlsVersion;
        this.preWarmedInstanceCount = preWarmedInstanceCount;
        this.remoteDebuggingEnabled = remoteDebuggingEnabled;
        this.remoteDebuggingVersion = remoteDebuggingVersion;
        this.runtimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
        this.scmIpRestrictions = scmIpRestrictions;
        this.scmMinimumTlsVersion = scmMinimumTlsVersion;
        this.scmType = scmType;
        this.scmUseMainIpRestriction = scmUseMainIpRestriction;
        this.use32BitWorker = use32BitWorker;
        this.vnetRouteAllEnabled = vnetRouteAllEnabled;
        this.websocketsEnabled = websocketsEnabled;
        this.workerCount = workerCount;
    }

    /**
     * @return If this Linux Web App is Always On enabled. Defaults to `false`.
     * 
     */
    public Optional<Boolean> alwaysOn() {
        return Optional.ofNullable(this.alwaysOn);
    }
    /**
     * @return The URL of the API definition that describes this Linux Function App.
     * 
     */
    public Optional<String> apiDefinitionUrl() {
        return Optional.ofNullable(this.apiDefinitionUrl);
    }
    /**
     * @return The ID of the API Management API for this Linux Function App.
     * 
     */
    public Optional<String> apiManagementApiId() {
        return Optional.ofNullable(this.apiManagementApiId);
    }
    /**
     * @return The App command line to launch.
     * 
     */
    public Optional<String> appCommandLine() {
        return Optional.ofNullable(this.appCommandLine);
    }
    /**
     * @return The number of workers this function app can scale out to. Only applicable to apps on the Consumption and Premium plan.
     * 
     */
    public Optional<Integer> appScaleLimit() {
        return Optional.ofNullable(this.appScaleLimit);
    }
    /**
     * @return An `app_service_logs` block as defined above.
     * 
     */
    public Optional<LinuxFunctionAppSiteConfigAppServiceLogs> appServiceLogs() {
        return Optional.ofNullable(this.appServiceLogs);
    }
    /**
     * @return The Connection String for linking the Linux Function App to Application Insights.
     * 
     */
    public Optional<String> applicationInsightsConnectionString() {
        return Optional.ofNullable(this.applicationInsightsConnectionString);
    }
    /**
     * @return The Instrumentation Key for connecting the Linux Function App to Application Insights.
     * 
     */
    public Optional<String> applicationInsightsKey() {
        return Optional.ofNullable(this.applicationInsightsKey);
    }
    /**
     * @return An `application_stack` block as defined above.
     * 
     */
    public Optional<LinuxFunctionAppSiteConfigApplicationStack> applicationStack() {
        return Optional.ofNullable(this.applicationStack);
    }
    /**
     * @return The Client ID of the Managed Service Identity to use for connections to the Azure Container Registry.
     * 
     */
    public Optional<String> containerRegistryManagedIdentityClientId() {
        return Optional.ofNullable(this.containerRegistryManagedIdentityClientId);
    }
    /**
     * @return Should connections for Azure Container Registry use Managed Identity.
     * 
     */
    public Optional<Boolean> containerRegistryUseManagedIdentity() {
        return Optional.ofNullable(this.containerRegistryUseManagedIdentity);
    }
    /**
     * @return A `cors` block as defined above.
     * 
     */
    public Optional<LinuxFunctionAppSiteConfigCors> cors() {
        return Optional.ofNullable(this.cors);
    }
    /**
     * @return Specifies a list of Default Documents for the Linux Web App.
     * 
     */
    public List<String> defaultDocuments() {
        return this.defaultDocuments == null ? List.of() : this.defaultDocuments;
    }
    public Optional<Boolean> detailedErrorLoggingEnabled() {
        return Optional.ofNullable(this.detailedErrorLoggingEnabled);
    }
    /**
     * @return The number of minimum instances for this Linux Function App. Only affects apps on Elastic Premium plans.
     * 
     */
    public Optional<Integer> elasticInstanceMinimum() {
        return Optional.ofNullable(this.elasticInstanceMinimum);
    }
    /**
     * @return State of FTP / FTPS service for this function app. Possible values include: `AllAllowed`, `FtpsOnly` and `Disabled`. Defaults to `Disabled`.
     * 
     */
    public Optional<String> ftpsState() {
        return Optional.ofNullable(this.ftpsState);
    }
    /**
     * @return The amount of time in minutes that a node can be unhealthy before being removed from the load balancer. Possible values are between `2` and `10`. Only valid in conjunction with `health_check_path`.
     * 
     */
    public Optional<Integer> healthCheckEvictionTimeInMin() {
        return Optional.ofNullable(this.healthCheckEvictionTimeInMin);
    }
    /**
     * @return The path to be checked for this function app health.
     * 
     */
    public Optional<String> healthCheckPath() {
        return Optional.ofNullable(this.healthCheckPath);
    }
    /**
     * @return Specifies if the HTTP2 protocol should be enabled. Defaults to `false`.
     * 
     */
    public Optional<Boolean> http2Enabled() {
        return Optional.ofNullable(this.http2Enabled);
    }
    /**
     * @return One or more `ip_restriction` blocks as defined above.
     * 
     */
    public List<LinuxFunctionAppSiteConfigIpRestriction> ipRestrictions() {
        return this.ipRestrictions == null ? List.of() : this.ipRestrictions;
    }
    public Optional<String> linuxFxVersion() {
        return Optional.ofNullable(this.linuxFxVersion);
    }
    /**
     * @return The Site load balancing mode. Possible values include: `WeightedRoundRobin`, `LeastRequests`, `LeastResponseTime`, `WeightedTotalTraffic`, `RequestHash`, `PerSiteRoundRobin`. Defaults to `LeastRequests` if omitted.
     * 
     */
    public Optional<String> loadBalancingMode() {
        return Optional.ofNullable(this.loadBalancingMode);
    }
    /**
     * @return Managed pipeline mode. Possible values include: `Integrated`, `Classic`. Defaults to `Integrated`.
     * 
     */
    public Optional<String> managedPipelineMode() {
        return Optional.ofNullable(this.managedPipelineMode);
    }
    /**
     * @return The configures the minimum version of TLS required for SSL requests. Possible values include: `1.0`, `1.1`, and  `1.2`. Defaults to `1.2`.
     * 
     */
    public Optional<String> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }
    /**
     * @return The number of pre-warmed instances for this function app. Only affects apps on an Elastic Premium plan.
     * 
     */
    public Optional<Integer> preWarmedInstanceCount() {
        return Optional.ofNullable(this.preWarmedInstanceCount);
    }
    /**
     * @return Should Remote Debugging be enabled. Defaults to `false`.
     * 
     */
    public Optional<Boolean> remoteDebuggingEnabled() {
        return Optional.ofNullable(this.remoteDebuggingEnabled);
    }
    /**
     * @return The Remote Debugging Version. Possible values include `VS2017` and `VS2019`.
     * 
     */
    public Optional<String> remoteDebuggingVersion() {
        return Optional.ofNullable(this.remoteDebuggingVersion);
    }
    /**
     * @return Should Scale Monitoring of the Functions Runtime be enabled?
     * 
     */
    public Optional<Boolean> runtimeScaleMonitoringEnabled() {
        return Optional.ofNullable(this.runtimeScaleMonitoringEnabled);
    }
    /**
     * @return One or more `scm_ip_restriction` blocks as defined above.
     * 
     */
    public List<LinuxFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions() {
        return this.scmIpRestrictions == null ? List.of() : this.scmIpRestrictions;
    }
    /**
     * @return Configures the minimum version of TLS required for SSL requests to the SCM site Possible values include: `1.0`, `1.1`, and  `1.2`. Defaults to `1.2`.
     * 
     */
    public Optional<String> scmMinimumTlsVersion() {
        return Optional.ofNullable(this.scmMinimumTlsVersion);
    }
    public Optional<String> scmType() {
        return Optional.ofNullable(this.scmType);
    }
    /**
     * @return Should the Linux Function App `ip_restriction` configuration be used for the SCM also.
     * 
     */
    public Optional<Boolean> scmUseMainIpRestriction() {
        return Optional.ofNullable(this.scmUseMainIpRestriction);
    }
    /**
     * @return Should the Linux Web App use a 32-bit worker process. Defaults to `true`.
     * 
     */
    public Optional<Boolean> use32BitWorker() {
        return Optional.ofNullable(this.use32BitWorker);
    }
    /**
     * @return Should all outbound traffic to have NAT Gateways, Network Security Groups and User Defined Routes applied? Defaults to `false`.
     * 
     */
    public Optional<Boolean> vnetRouteAllEnabled() {
        return Optional.ofNullable(this.vnetRouteAllEnabled);
    }
    /**
     * @return Should Web Sockets be enabled. Defaults to `false`.
     * 
     */
    public Optional<Boolean> websocketsEnabled() {
        return Optional.ofNullable(this.websocketsEnabled);
    }
    /**
     * @return The number of Workers for this Linux Function App.
     * 
     */
    public Optional<Integer> workerCount() {
        return Optional.ofNullable(this.workerCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxFunctionAppSiteConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean alwaysOn;
        private @Nullable String apiDefinitionUrl;
        private @Nullable String apiManagementApiId;
        private @Nullable String appCommandLine;
        private @Nullable Integer appScaleLimit;
        private @Nullable LinuxFunctionAppSiteConfigAppServiceLogs appServiceLogs;
        private @Nullable String applicationInsightsConnectionString;
        private @Nullable String applicationInsightsKey;
        private @Nullable LinuxFunctionAppSiteConfigApplicationStack applicationStack;
        private @Nullable String containerRegistryManagedIdentityClientId;
        private @Nullable Boolean containerRegistryUseManagedIdentity;
        private @Nullable LinuxFunctionAppSiteConfigCors cors;
        private @Nullable List<String> defaultDocuments;
        private @Nullable Boolean detailedErrorLoggingEnabled;
        private @Nullable Integer elasticInstanceMinimum;
        private @Nullable String ftpsState;
        private @Nullable Integer healthCheckEvictionTimeInMin;
        private @Nullable String healthCheckPath;
        private @Nullable Boolean http2Enabled;
        private @Nullable List<LinuxFunctionAppSiteConfigIpRestriction> ipRestrictions;
        private @Nullable String linuxFxVersion;
        private @Nullable String loadBalancingMode;
        private @Nullable String managedPipelineMode;
        private @Nullable String minimumTlsVersion;
        private @Nullable Integer preWarmedInstanceCount;
        private @Nullable Boolean remoteDebuggingEnabled;
        private @Nullable String remoteDebuggingVersion;
        private @Nullable Boolean runtimeScaleMonitoringEnabled;
        private @Nullable List<LinuxFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions;
        private @Nullable String scmMinimumTlsVersion;
        private @Nullable String scmType;
        private @Nullable Boolean scmUseMainIpRestriction;
        private @Nullable Boolean use32BitWorker;
        private @Nullable Boolean vnetRouteAllEnabled;
        private @Nullable Boolean websocketsEnabled;
        private @Nullable Integer workerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxFunctionAppSiteConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysOn = defaults.alwaysOn;
    	      this.apiDefinitionUrl = defaults.apiDefinitionUrl;
    	      this.apiManagementApiId = defaults.apiManagementApiId;
    	      this.appCommandLine = defaults.appCommandLine;
    	      this.appScaleLimit = defaults.appScaleLimit;
    	      this.appServiceLogs = defaults.appServiceLogs;
    	      this.applicationInsightsConnectionString = defaults.applicationInsightsConnectionString;
    	      this.applicationInsightsKey = defaults.applicationInsightsKey;
    	      this.applicationStack = defaults.applicationStack;
    	      this.containerRegistryManagedIdentityClientId = defaults.containerRegistryManagedIdentityClientId;
    	      this.containerRegistryUseManagedIdentity = defaults.containerRegistryUseManagedIdentity;
    	      this.cors = defaults.cors;
    	      this.defaultDocuments = defaults.defaultDocuments;
    	      this.detailedErrorLoggingEnabled = defaults.detailedErrorLoggingEnabled;
    	      this.elasticInstanceMinimum = defaults.elasticInstanceMinimum;
    	      this.ftpsState = defaults.ftpsState;
    	      this.healthCheckEvictionTimeInMin = defaults.healthCheckEvictionTimeInMin;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.http2Enabled = defaults.http2Enabled;
    	      this.ipRestrictions = defaults.ipRestrictions;
    	      this.linuxFxVersion = defaults.linuxFxVersion;
    	      this.loadBalancingMode = defaults.loadBalancingMode;
    	      this.managedPipelineMode = defaults.managedPipelineMode;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.preWarmedInstanceCount = defaults.preWarmedInstanceCount;
    	      this.remoteDebuggingEnabled = defaults.remoteDebuggingEnabled;
    	      this.remoteDebuggingVersion = defaults.remoteDebuggingVersion;
    	      this.runtimeScaleMonitoringEnabled = defaults.runtimeScaleMonitoringEnabled;
    	      this.scmIpRestrictions = defaults.scmIpRestrictions;
    	      this.scmMinimumTlsVersion = defaults.scmMinimumTlsVersion;
    	      this.scmType = defaults.scmType;
    	      this.scmUseMainIpRestriction = defaults.scmUseMainIpRestriction;
    	      this.use32BitWorker = defaults.use32BitWorker;
    	      this.vnetRouteAllEnabled = defaults.vnetRouteAllEnabled;
    	      this.websocketsEnabled = defaults.websocketsEnabled;
    	      this.workerCount = defaults.workerCount;
        }

        public Builder alwaysOn(@Nullable Boolean alwaysOn) {
            this.alwaysOn = alwaysOn;
            return this;
        }
        public Builder apiDefinitionUrl(@Nullable String apiDefinitionUrl) {
            this.apiDefinitionUrl = apiDefinitionUrl;
            return this;
        }
        public Builder apiManagementApiId(@Nullable String apiManagementApiId) {
            this.apiManagementApiId = apiManagementApiId;
            return this;
        }
        public Builder appCommandLine(@Nullable String appCommandLine) {
            this.appCommandLine = appCommandLine;
            return this;
        }
        public Builder appScaleLimit(@Nullable Integer appScaleLimit) {
            this.appScaleLimit = appScaleLimit;
            return this;
        }
        public Builder appServiceLogs(@Nullable LinuxFunctionAppSiteConfigAppServiceLogs appServiceLogs) {
            this.appServiceLogs = appServiceLogs;
            return this;
        }
        public Builder applicationInsightsConnectionString(@Nullable String applicationInsightsConnectionString) {
            this.applicationInsightsConnectionString = applicationInsightsConnectionString;
            return this;
        }
        public Builder applicationInsightsKey(@Nullable String applicationInsightsKey) {
            this.applicationInsightsKey = applicationInsightsKey;
            return this;
        }
        public Builder applicationStack(@Nullable LinuxFunctionAppSiteConfigApplicationStack applicationStack) {
            this.applicationStack = applicationStack;
            return this;
        }
        public Builder containerRegistryManagedIdentityClientId(@Nullable String containerRegistryManagedIdentityClientId) {
            this.containerRegistryManagedIdentityClientId = containerRegistryManagedIdentityClientId;
            return this;
        }
        public Builder containerRegistryUseManagedIdentity(@Nullable Boolean containerRegistryUseManagedIdentity) {
            this.containerRegistryUseManagedIdentity = containerRegistryUseManagedIdentity;
            return this;
        }
        public Builder cors(@Nullable LinuxFunctionAppSiteConfigCors cors) {
            this.cors = cors;
            return this;
        }
        public Builder defaultDocuments(@Nullable List<String> defaultDocuments) {
            this.defaultDocuments = defaultDocuments;
            return this;
        }
        public Builder defaultDocuments(String... defaultDocuments) {
            return defaultDocuments(List.of(defaultDocuments));
        }
        public Builder detailedErrorLoggingEnabled(@Nullable Boolean detailedErrorLoggingEnabled) {
            this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
            return this;
        }
        public Builder elasticInstanceMinimum(@Nullable Integer elasticInstanceMinimum) {
            this.elasticInstanceMinimum = elasticInstanceMinimum;
            return this;
        }
        public Builder ftpsState(@Nullable String ftpsState) {
            this.ftpsState = ftpsState;
            return this;
        }
        public Builder healthCheckEvictionTimeInMin(@Nullable Integer healthCheckEvictionTimeInMin) {
            this.healthCheckEvictionTimeInMin = healthCheckEvictionTimeInMin;
            return this;
        }
        public Builder healthCheckPath(@Nullable String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public Builder http2Enabled(@Nullable Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Builder ipRestrictions(@Nullable List<LinuxFunctionAppSiteConfigIpRestriction> ipRestrictions) {
            this.ipRestrictions = ipRestrictions;
            return this;
        }
        public Builder ipRestrictions(LinuxFunctionAppSiteConfigIpRestriction... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }
        public Builder linuxFxVersion(@Nullable String linuxFxVersion) {
            this.linuxFxVersion = linuxFxVersion;
            return this;
        }
        public Builder loadBalancingMode(@Nullable String loadBalancingMode) {
            this.loadBalancingMode = loadBalancingMode;
            return this;
        }
        public Builder managedPipelineMode(@Nullable String managedPipelineMode) {
            this.managedPipelineMode = managedPipelineMode;
            return this;
        }
        public Builder minimumTlsVersion(@Nullable String minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }
        public Builder preWarmedInstanceCount(@Nullable Integer preWarmedInstanceCount) {
            this.preWarmedInstanceCount = preWarmedInstanceCount;
            return this;
        }
        public Builder remoteDebuggingEnabled(@Nullable Boolean remoteDebuggingEnabled) {
            this.remoteDebuggingEnabled = remoteDebuggingEnabled;
            return this;
        }
        public Builder remoteDebuggingVersion(@Nullable String remoteDebuggingVersion) {
            this.remoteDebuggingVersion = remoteDebuggingVersion;
            return this;
        }
        public Builder runtimeScaleMonitoringEnabled(@Nullable Boolean runtimeScaleMonitoringEnabled) {
            this.runtimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            return this;
        }
        public Builder scmIpRestrictions(@Nullable List<LinuxFunctionAppSiteConfigScmIpRestriction> scmIpRestrictions) {
            this.scmIpRestrictions = scmIpRestrictions;
            return this;
        }
        public Builder scmIpRestrictions(LinuxFunctionAppSiteConfigScmIpRestriction... scmIpRestrictions) {
            return scmIpRestrictions(List.of(scmIpRestrictions));
        }
        public Builder scmMinimumTlsVersion(@Nullable String scmMinimumTlsVersion) {
            this.scmMinimumTlsVersion = scmMinimumTlsVersion;
            return this;
        }
        public Builder scmType(@Nullable String scmType) {
            this.scmType = scmType;
            return this;
        }
        public Builder scmUseMainIpRestriction(@Nullable Boolean scmUseMainIpRestriction) {
            this.scmUseMainIpRestriction = scmUseMainIpRestriction;
            return this;
        }
        public Builder use32BitWorker(@Nullable Boolean use32BitWorker) {
            this.use32BitWorker = use32BitWorker;
            return this;
        }
        public Builder vnetRouteAllEnabled(@Nullable Boolean vnetRouteAllEnabled) {
            this.vnetRouteAllEnabled = vnetRouteAllEnabled;
            return this;
        }
        public Builder websocketsEnabled(@Nullable Boolean websocketsEnabled) {
            this.websocketsEnabled = websocketsEnabled;
            return this;
        }
        public Builder workerCount(@Nullable Integer workerCount) {
            this.workerCount = workerCount;
            return this;
        }        public LinuxFunctionAppSiteConfig build() {
            return new LinuxFunctionAppSiteConfig(alwaysOn, apiDefinitionUrl, apiManagementApiId, appCommandLine, appScaleLimit, appServiceLogs, applicationInsightsConnectionString, applicationInsightsKey, applicationStack, containerRegistryManagedIdentityClientId, containerRegistryUseManagedIdentity, cors, defaultDocuments, detailedErrorLoggingEnabled, elasticInstanceMinimum, ftpsState, healthCheckEvictionTimeInMin, healthCheckPath, http2Enabled, ipRestrictions, linuxFxVersion, loadBalancingMode, managedPipelineMode, minimumTlsVersion, preWarmedInstanceCount, remoteDebuggingEnabled, remoteDebuggingVersion, runtimeScaleMonitoringEnabled, scmIpRestrictions, scmMinimumTlsVersion, scmType, scmUseMainIpRestriction, use32BitWorker, vnetRouteAllEnabled, websocketsEnabled, workerCount);
        }
    }
}