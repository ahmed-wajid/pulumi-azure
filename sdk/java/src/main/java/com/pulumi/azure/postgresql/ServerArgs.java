// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.postgresql;

import com.pulumi.azure.postgresql.inputs.ServerIdentityArgs;
import com.pulumi.azure.postgresql.inputs.ServerThreatDetectionPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerArgs Empty = new ServerArgs();

    /**
     * The Administrator login for the PostgreSQL Server. Required when `create_mode` is `Default`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="administratorLogin")
    private @Nullable Output<String> administratorLogin;

    /**
     * @return The Administrator login for the PostgreSQL Server. Required when `create_mode` is `Default`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> administratorLogin() {
        return Optional.ofNullable(this.administratorLogin);
    }

    /**
     * The Password associated with the `administrator_login` for the PostgreSQL Server. Required when `create_mode` is `Default`.
     * 
     */
    @Import(name="administratorLoginPassword")
    private @Nullable Output<String> administratorLoginPassword;

    /**
     * @return The Password associated with the `administrator_login` for the PostgreSQL Server. Required when `create_mode` is `Default`.
     * 
     */
    public Optional<Output<String>> administratorLoginPassword() {
        return Optional.ofNullable(this.administratorLoginPassword);
    }

    /**
     * Enable/Disable auto-growing of the storage. Storage auto-grow prevents your server from running out of storage and becoming read-only. If storage auto grow is enabled, the storage automatically grows without impacting the workload. The default value if not explicitly specified is `true`.
     * 
     */
    @Import(name="autoGrowEnabled")
    private @Nullable Output<Boolean> autoGrowEnabled;

    /**
     * @return Enable/Disable auto-growing of the storage. Storage auto-grow prevents your server from running out of storage and becoming read-only. If storage auto grow is enabled, the storage automatically grows without impacting the workload. The default value if not explicitly specified is `true`.
     * 
     */
    public Optional<Output<Boolean>> autoGrowEnabled() {
        return Optional.ofNullable(this.autoGrowEnabled);
    }

    /**
     * Backup retention days for the server, supported values are between `7` and `35` days.
     * 
     */
    @Import(name="backupRetentionDays")
    private @Nullable Output<Integer> backupRetentionDays;

    /**
     * @return Backup retention days for the server, supported values are between `7` and `35` days.
     * 
     */
    public Optional<Output<Integer>> backupRetentionDays() {
        return Optional.ofNullable(this.backupRetentionDays);
    }

    /**
     * The creation mode. Can be used to restore or replicate existing servers. Possible values are `Default`, `Replica`, `GeoRestore`, and `PointInTimeRestore`. Defaults to `Default.`
     * 
     */
    @Import(name="createMode")
    private @Nullable Output<String> createMode;

    /**
     * @return The creation mode. Can be used to restore or replicate existing servers. Possible values are `Default`, `Replica`, `GeoRestore`, and `PointInTimeRestore`. Defaults to `Default.`
     * 
     */
    public Optional<Output<String>> createMode() {
        return Optional.ofNullable(this.createMode);
    }

    /**
     * For creation modes other than `Default`, the source server ID to use.
     * 
     */
    @Import(name="creationSourceServerId")
    private @Nullable Output<String> creationSourceServerId;

    /**
     * @return For creation modes other than `Default`, the source server ID to use.
     * 
     */
    public Optional<Output<String>> creationSourceServerId() {
        return Optional.ofNullable(this.creationSourceServerId);
    }

    /**
     * Turn Geo-redundant server backups on/off. This allows you to choose between locally redundant or geo-redundant backup storage in the General Purpose and Memory Optimized tiers. When the backups are stored in geo-redundant backup storage, they are not only stored within the region in which your server is hosted, but are also replicated to a paired data center. This provides better protection and ability to restore your server in a different region in the event of a disaster. This is not support for the Basic tier. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="geoRedundantBackupEnabled")
    private @Nullable Output<Boolean> geoRedundantBackupEnabled;

    /**
     * @return Turn Geo-redundant server backups on/off. This allows you to choose between locally redundant or geo-redundant backup storage in the General Purpose and Memory Optimized tiers. When the backups are stored in geo-redundant backup storage, they are not only stored within the region in which your server is hosted, but are also replicated to a paired data center. This provides better protection and ability to restore your server in a different region in the event of a disaster. This is not support for the Basic tier. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> geoRedundantBackupEnabled() {
        return Optional.ofNullable(this.geoRedundantBackupEnabled);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ServerIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<ServerIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Whether or not infrastructure is encrypted for this server. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="infrastructureEncryptionEnabled")
    private @Nullable Output<Boolean> infrastructureEncryptionEnabled;

    /**
     * @return Whether or not infrastructure is encrypted for this server. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> infrastructureEncryptionEnabled() {
        return Optional.ofNullable(this.infrastructureEncryptionEnabled);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the PostgreSQL Server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the PostgreSQL Server. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether or not public network access is allowed for this server. Defaults to `true`.
     * 
     */
    @Import(name="publicNetworkAccessEnabled")
    private @Nullable Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether or not public network access is allowed for this server. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }

    /**
     * The name of the resource group in which to create the PostgreSQL Server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the PostgreSQL Server. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * When `create_mode` is `PointInTimeRestore` the point in time to restore from `creation_source_server_id`.
     * 
     */
    @Import(name="restorePointInTime")
    private @Nullable Output<String> restorePointInTime;

    /**
     * @return When `create_mode` is `PointInTimeRestore` the point in time to restore from `creation_source_server_id`.
     * 
     */
    public Optional<Output<String>> restorePointInTime() {
        return Optional.ofNullable(this.restorePointInTime);
    }

    /**
     * Specifies the SKU Name for this PostgreSQL Server. The name of the SKU, follows the `tier` + `family` + `cores` pattern (e.g. `B_Gen4_1`, `GP_Gen5_8`). For more information see the [product documentation](https://docs.microsoft.com/rest/api/postgresql/singleserver/servers/create#sku).
     * 
     */
    @Import(name="skuName", required=true)
    private Output<String> skuName;

    /**
     * @return Specifies the SKU Name for this PostgreSQL Server. The name of the SKU, follows the `tier` + `family` + `cores` pattern (e.g. `B_Gen4_1`, `GP_Gen5_8`). For more information see the [product documentation](https://docs.microsoft.com/rest/api/postgresql/singleserver/servers/create#sku).
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }

    /**
     * Specifies if SSL should be enforced on connections. Possible values are `true` and `false`.
     * 
     */
    @Import(name="sslEnforcementEnabled", required=true)
    private Output<Boolean> sslEnforcementEnabled;

    /**
     * @return Specifies if SSL should be enforced on connections. Possible values are `true` and `false`.
     * 
     */
    public Output<Boolean> sslEnforcementEnabled() {
        return this.sslEnforcementEnabled;
    }

    /**
     * The minimum TLS version to support on the sever. Possible values are `TLSEnforcementDisabled`, `TLS1_0`, `TLS1_1`, and `TLS1_2`. Defaults to `TLSEnforcementDisabled`.
     * 
     */
    @Import(name="sslMinimalTlsVersionEnforced")
    private @Nullable Output<String> sslMinimalTlsVersionEnforced;

    /**
     * @return The minimum TLS version to support on the sever. Possible values are `TLSEnforcementDisabled`, `TLS1_0`, `TLS1_1`, and `TLS1_2`. Defaults to `TLSEnforcementDisabled`.
     * 
     */
    public Optional<Output<String>> sslMinimalTlsVersionEnforced() {
        return Optional.ofNullable(this.sslMinimalTlsVersionEnforced);
    }

    /**
     * Max storage allowed for a server. Possible values are between `5120` MB(5GB) and `1048576` MB(1TB) for the Basic SKU and between `5120` MB(5GB) and `16777216` MB(16TB) for General Purpose/Memory Optimized SKUs. For more information see the [product documentation](https://docs.microsoft.com/azure/postgresql/concepts-pricing-tiers#storage).
     * 
     */
    @Import(name="storageMb")
    private @Nullable Output<Integer> storageMb;

    /**
     * @return Max storage allowed for a server. Possible values are between `5120` MB(5GB) and `1048576` MB(1TB) for the Basic SKU and between `5120` MB(5GB) and `16777216` MB(16TB) for General Purpose/Memory Optimized SKUs. For more information see the [product documentation](https://docs.microsoft.com/azure/postgresql/concepts-pricing-tiers#storage).
     * 
     */
    public Optional<Output<Integer>> storageMb() {
        return Optional.ofNullable(this.storageMb);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threat_detection_policy` block supports fields documented below.
     * 
     */
    @Import(name="threatDetectionPolicy")
    private @Nullable Output<ServerThreatDetectionPolicyArgs> threatDetectionPolicy;

    /**
     * @return Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threat_detection_policy` block supports fields documented below.
     * 
     */
    public Optional<Output<ServerThreatDetectionPolicyArgs>> threatDetectionPolicy() {
        return Optional.ofNullable(this.threatDetectionPolicy);
    }

    /**
     * Specifies the version of PostgreSQL to use. Valid values are `9.5`, `9.6`, `10`, `10.0`, and `11`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return Specifies the version of PostgreSQL to use. Valid values are `9.5`, `9.6`, `10`, `10.0`, and `11`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private ServerArgs() {}

    private ServerArgs(ServerArgs $) {
        this.administratorLogin = $.administratorLogin;
        this.administratorLoginPassword = $.administratorLoginPassword;
        this.autoGrowEnabled = $.autoGrowEnabled;
        this.backupRetentionDays = $.backupRetentionDays;
        this.createMode = $.createMode;
        this.creationSourceServerId = $.creationSourceServerId;
        this.geoRedundantBackupEnabled = $.geoRedundantBackupEnabled;
        this.identity = $.identity;
        this.infrastructureEncryptionEnabled = $.infrastructureEncryptionEnabled;
        this.location = $.location;
        this.name = $.name;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.restorePointInTime = $.restorePointInTime;
        this.skuName = $.skuName;
        this.sslEnforcementEnabled = $.sslEnforcementEnabled;
        this.sslMinimalTlsVersionEnforced = $.sslMinimalTlsVersionEnforced;
        this.storageMb = $.storageMb;
        this.tags = $.tags;
        this.threatDetectionPolicy = $.threatDetectionPolicy;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerArgs $;

        public Builder() {
            $ = new ServerArgs();
        }

        public Builder(ServerArgs defaults) {
            $ = new ServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param administratorLogin The Administrator login for the PostgreSQL Server. Required when `create_mode` is `Default`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(@Nullable Output<String> administratorLogin) {
            $.administratorLogin = administratorLogin;
            return this;
        }

        /**
         * @param administratorLogin The Administrator login for the PostgreSQL Server. Required when `create_mode` is `Default`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(String administratorLogin) {
            return administratorLogin(Output.of(administratorLogin));
        }

        /**
         * @param administratorLoginPassword The Password associated with the `administrator_login` for the PostgreSQL Server. Required when `create_mode` is `Default`.
         * 
         * @return builder
         * 
         */
        public Builder administratorLoginPassword(@Nullable Output<String> administratorLoginPassword) {
            $.administratorLoginPassword = administratorLoginPassword;
            return this;
        }

        /**
         * @param administratorLoginPassword The Password associated with the `administrator_login` for the PostgreSQL Server. Required when `create_mode` is `Default`.
         * 
         * @return builder
         * 
         */
        public Builder administratorLoginPassword(String administratorLoginPassword) {
            return administratorLoginPassword(Output.of(administratorLoginPassword));
        }

        /**
         * @param autoGrowEnabled Enable/Disable auto-growing of the storage. Storage auto-grow prevents your server from running out of storage and becoming read-only. If storage auto grow is enabled, the storage automatically grows without impacting the workload. The default value if not explicitly specified is `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoGrowEnabled(@Nullable Output<Boolean> autoGrowEnabled) {
            $.autoGrowEnabled = autoGrowEnabled;
            return this;
        }

        /**
         * @param autoGrowEnabled Enable/Disable auto-growing of the storage. Storage auto-grow prevents your server from running out of storage and becoming read-only. If storage auto grow is enabled, the storage automatically grows without impacting the workload. The default value if not explicitly specified is `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoGrowEnabled(Boolean autoGrowEnabled) {
            return autoGrowEnabled(Output.of(autoGrowEnabled));
        }

        /**
         * @param backupRetentionDays Backup retention days for the server, supported values are between `7` and `35` days.
         * 
         * @return builder
         * 
         */
        public Builder backupRetentionDays(@Nullable Output<Integer> backupRetentionDays) {
            $.backupRetentionDays = backupRetentionDays;
            return this;
        }

        /**
         * @param backupRetentionDays Backup retention days for the server, supported values are between `7` and `35` days.
         * 
         * @return builder
         * 
         */
        public Builder backupRetentionDays(Integer backupRetentionDays) {
            return backupRetentionDays(Output.of(backupRetentionDays));
        }

        /**
         * @param createMode The creation mode. Can be used to restore or replicate existing servers. Possible values are `Default`, `Replica`, `GeoRestore`, and `PointInTimeRestore`. Defaults to `Default.`
         * 
         * @return builder
         * 
         */
        public Builder createMode(@Nullable Output<String> createMode) {
            $.createMode = createMode;
            return this;
        }

        /**
         * @param createMode The creation mode. Can be used to restore or replicate existing servers. Possible values are `Default`, `Replica`, `GeoRestore`, and `PointInTimeRestore`. Defaults to `Default.`
         * 
         * @return builder
         * 
         */
        public Builder createMode(String createMode) {
            return createMode(Output.of(createMode));
        }

        /**
         * @param creationSourceServerId For creation modes other than `Default`, the source server ID to use.
         * 
         * @return builder
         * 
         */
        public Builder creationSourceServerId(@Nullable Output<String> creationSourceServerId) {
            $.creationSourceServerId = creationSourceServerId;
            return this;
        }

        /**
         * @param creationSourceServerId For creation modes other than `Default`, the source server ID to use.
         * 
         * @return builder
         * 
         */
        public Builder creationSourceServerId(String creationSourceServerId) {
            return creationSourceServerId(Output.of(creationSourceServerId));
        }

        /**
         * @param geoRedundantBackupEnabled Turn Geo-redundant server backups on/off. This allows you to choose between locally redundant or geo-redundant backup storage in the General Purpose and Memory Optimized tiers. When the backups are stored in geo-redundant backup storage, they are not only stored within the region in which your server is hosted, but are also replicated to a paired data center. This provides better protection and ability to restore your server in a different region in the event of a disaster. This is not support for the Basic tier. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder geoRedundantBackupEnabled(@Nullable Output<Boolean> geoRedundantBackupEnabled) {
            $.geoRedundantBackupEnabled = geoRedundantBackupEnabled;
            return this;
        }

        /**
         * @param geoRedundantBackupEnabled Turn Geo-redundant server backups on/off. This allows you to choose between locally redundant or geo-redundant backup storage in the General Purpose and Memory Optimized tiers. When the backups are stored in geo-redundant backup storage, they are not only stored within the region in which your server is hosted, but are also replicated to a paired data center. This provides better protection and ability to restore your server in a different region in the event of a disaster. This is not support for the Basic tier. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder geoRedundantBackupEnabled(Boolean geoRedundantBackupEnabled) {
            return geoRedundantBackupEnabled(Output.of(geoRedundantBackupEnabled));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ServerIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(ServerIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param infrastructureEncryptionEnabled Whether or not infrastructure is encrypted for this server. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder infrastructureEncryptionEnabled(@Nullable Output<Boolean> infrastructureEncryptionEnabled) {
            $.infrastructureEncryptionEnabled = infrastructureEncryptionEnabled;
            return this;
        }

        /**
         * @param infrastructureEncryptionEnabled Whether or not infrastructure is encrypted for this server. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder infrastructureEncryptionEnabled(Boolean infrastructureEncryptionEnabled) {
            return infrastructureEncryptionEnabled(Output.of(infrastructureEncryptionEnabled));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the PostgreSQL Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the PostgreSQL Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicNetworkAccessEnabled Whether or not public network access is allowed for this server. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(@Nullable Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @param publicNetworkAccessEnabled Whether or not public network access is allowed for this server. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the PostgreSQL Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the PostgreSQL Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param restorePointInTime When `create_mode` is `PointInTimeRestore` the point in time to restore from `creation_source_server_id`.
         * 
         * @return builder
         * 
         */
        public Builder restorePointInTime(@Nullable Output<String> restorePointInTime) {
            $.restorePointInTime = restorePointInTime;
            return this;
        }

        /**
         * @param restorePointInTime When `create_mode` is `PointInTimeRestore` the point in time to restore from `creation_source_server_id`.
         * 
         * @return builder
         * 
         */
        public Builder restorePointInTime(String restorePointInTime) {
            return restorePointInTime(Output.of(restorePointInTime));
        }

        /**
         * @param skuName Specifies the SKU Name for this PostgreSQL Server. The name of the SKU, follows the `tier` + `family` + `cores` pattern (e.g. `B_Gen4_1`, `GP_Gen5_8`). For more information see the [product documentation](https://docs.microsoft.com/rest/api/postgresql/singleserver/servers/create#sku).
         * 
         * @return builder
         * 
         */
        public Builder skuName(Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName Specifies the SKU Name for this PostgreSQL Server. The name of the SKU, follows the `tier` + `family` + `cores` pattern (e.g. `B_Gen4_1`, `GP_Gen5_8`). For more information see the [product documentation](https://docs.microsoft.com/rest/api/postgresql/singleserver/servers/create#sku).
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param sslEnforcementEnabled Specifies if SSL should be enforced on connections. Possible values are `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder sslEnforcementEnabled(Output<Boolean> sslEnforcementEnabled) {
            $.sslEnforcementEnabled = sslEnforcementEnabled;
            return this;
        }

        /**
         * @param sslEnforcementEnabled Specifies if SSL should be enforced on connections. Possible values are `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder sslEnforcementEnabled(Boolean sslEnforcementEnabled) {
            return sslEnforcementEnabled(Output.of(sslEnforcementEnabled));
        }

        /**
         * @param sslMinimalTlsVersionEnforced The minimum TLS version to support on the sever. Possible values are `TLSEnforcementDisabled`, `TLS1_0`, `TLS1_1`, and `TLS1_2`. Defaults to `TLSEnforcementDisabled`.
         * 
         * @return builder
         * 
         */
        public Builder sslMinimalTlsVersionEnforced(@Nullable Output<String> sslMinimalTlsVersionEnforced) {
            $.sslMinimalTlsVersionEnforced = sslMinimalTlsVersionEnforced;
            return this;
        }

        /**
         * @param sslMinimalTlsVersionEnforced The minimum TLS version to support on the sever. Possible values are `TLSEnforcementDisabled`, `TLS1_0`, `TLS1_1`, and `TLS1_2`. Defaults to `TLSEnforcementDisabled`.
         * 
         * @return builder
         * 
         */
        public Builder sslMinimalTlsVersionEnforced(String sslMinimalTlsVersionEnforced) {
            return sslMinimalTlsVersionEnforced(Output.of(sslMinimalTlsVersionEnforced));
        }

        /**
         * @param storageMb Max storage allowed for a server. Possible values are between `5120` MB(5GB) and `1048576` MB(1TB) for the Basic SKU and between `5120` MB(5GB) and `16777216` MB(16TB) for General Purpose/Memory Optimized SKUs. For more information see the [product documentation](https://docs.microsoft.com/azure/postgresql/concepts-pricing-tiers#storage).
         * 
         * @return builder
         * 
         */
        public Builder storageMb(@Nullable Output<Integer> storageMb) {
            $.storageMb = storageMb;
            return this;
        }

        /**
         * @param storageMb Max storage allowed for a server. Possible values are between `5120` MB(5GB) and `1048576` MB(1TB) for the Basic SKU and between `5120` MB(5GB) and `16777216` MB(16TB) for General Purpose/Memory Optimized SKUs. For more information see the [product documentation](https://docs.microsoft.com/azure/postgresql/concepts-pricing-tiers#storage).
         * 
         * @return builder
         * 
         */
        public Builder storageMb(Integer storageMb) {
            return storageMb(Output.of(storageMb));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param threatDetectionPolicy Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threat_detection_policy` block supports fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder threatDetectionPolicy(@Nullable Output<ServerThreatDetectionPolicyArgs> threatDetectionPolicy) {
            $.threatDetectionPolicy = threatDetectionPolicy;
            return this;
        }

        /**
         * @param threatDetectionPolicy Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threat_detection_policy` block supports fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder threatDetectionPolicy(ServerThreatDetectionPolicyArgs threatDetectionPolicy) {
            return threatDetectionPolicy(Output.of(threatDetectionPolicy));
        }

        /**
         * @param version Specifies the version of PostgreSQL to use. Valid values are `9.5`, `9.6`, `10`, `10.0`, and `11`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Specifies the version of PostgreSQL to use. Valid values are `9.5`, `9.6`, `10`, `10.0`, and `11`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ServerArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.skuName = Objects.requireNonNull($.skuName, "expected parameter 'skuName' to be non-null");
            $.sslEnforcementEnabled = Objects.requireNonNull($.sslEnforcementEnabled, "expected parameter 'sslEnforcementEnabled' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}