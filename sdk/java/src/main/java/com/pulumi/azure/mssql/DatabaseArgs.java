// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.mssql.inputs.DatabaseLongTermRetentionPolicyArgs;
import com.pulumi.azure.mssql.inputs.DatabaseShortTermRetentionPolicyArgs;
import com.pulumi.azure.mssql.inputs.DatabaseThreatDetectionPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * Time in minutes after which database is automatically paused. A value of `-1` means that automatic pause is disabled. This property is only settable for General Purpose Serverless databases.
     * 
     */
    @Import(name="autoPauseDelayInMinutes")
    private @Nullable Output<Integer> autoPauseDelayInMinutes;

    /**
     * @return Time in minutes after which database is automatically paused. A value of `-1` means that automatic pause is disabled. This property is only settable for General Purpose Serverless databases.
     * 
     */
    public Optional<Output<Integer>> autoPauseDelayInMinutes() {
        return Optional.ofNullable(this.autoPauseDelayInMinutes);
    }

    /**
     * Specifies the collation of the database. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="collation")
    private @Nullable Output<String> collation;

    /**
     * @return Specifies the collation of the database. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> collation() {
        return Optional.ofNullable(this.collation);
    }

    /**
     * The create mode of the database. Possible values are `Copy`, `Default`, `OnlineSecondary`, `PointInTimeRestore`, `Recovery`, `Restore`, `RestoreExternalBackup`, `RestoreExternalBackupSecondary`, `RestoreLongTermRetentionBackup` and `Secondary`.
     * 
     */
    @Import(name="createMode")
    private @Nullable Output<String> createMode;

    /**
     * @return The create mode of the database. Possible values are `Copy`, `Default`, `OnlineSecondary`, `PointInTimeRestore`, `Recovery`, `Restore`, `RestoreExternalBackup`, `RestoreExternalBackupSecondary`, `RestoreLongTermRetentionBackup` and `Secondary`.
     * 
     */
    public Optional<Output<String>> createMode() {
        return Optional.ofNullable(this.createMode);
    }

    /**
     * The ID of the source database from which to create the new database. This should only be used for databases with `create_mode` values that use another database as reference. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="creationSourceDatabaseId")
    private @Nullable Output<String> creationSourceDatabaseId;

    /**
     * @return The ID of the source database from which to create the new database. This should only be used for databases with `create_mode` values that use another database as reference. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> creationSourceDatabaseId() {
        return Optional.ofNullable(this.creationSourceDatabaseId);
    }

    /**
     * Specifies the ID of the elastic pool containing this database.
     * 
     */
    @Import(name="elasticPoolId")
    private @Nullable Output<String> elasticPoolId;

    /**
     * @return Specifies the ID of the elastic pool containing this database.
     * 
     */
    public Optional<Output<String>> elasticPoolId() {
        return Optional.ofNullable(this.elasticPoolId);
    }

    /**
     * A boolean that specifies if the Geo Backup Policy is enabled.
     * 
     */
    @Import(name="geoBackupEnabled")
    private @Nullable Output<Boolean> geoBackupEnabled;

    /**
     * @return A boolean that specifies if the Geo Backup Policy is enabled.
     * 
     */
    public Optional<Output<Boolean>> geoBackupEnabled() {
        return Optional.ofNullable(this.geoBackupEnabled);
    }

    /**
     * A boolean that specifies if this is a ledger database. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="ledgerEnabled")
    private @Nullable Output<Boolean> ledgerEnabled;

    /**
     * @return A boolean that specifies if this is a ledger database. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> ledgerEnabled() {
        return Optional.ofNullable(this.ledgerEnabled);
    }

    /**
     * Specifies the license type applied to this database. Possible values are `LicenseIncluded` and `BasePrice`.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<String> licenseType;

    /**
     * @return Specifies the license type applied to this database. Possible values are `LicenseIncluded` and `BasePrice`.
     * 
     */
    public Optional<Output<String>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * A `long_term_retention_policy` block as defined below.
     * 
     */
    @Import(name="longTermRetentionPolicy")
    private @Nullable Output<DatabaseLongTermRetentionPolicyArgs> longTermRetentionPolicy;

    /**
     * @return A `long_term_retention_policy` block as defined below.
     * 
     */
    public Optional<Output<DatabaseLongTermRetentionPolicyArgs>> longTermRetentionPolicy() {
        return Optional.ofNullable(this.longTermRetentionPolicy);
    }

    /**
     * The max size of the database in gigabytes.
     * 
     */
    @Import(name="maxSizeGb")
    private @Nullable Output<Integer> maxSizeGb;

    /**
     * @return The max size of the database in gigabytes.
     * 
     */
    public Optional<Output<Integer>> maxSizeGb() {
        return Optional.ofNullable(this.maxSizeGb);
    }

    /**
     * Minimal capacity that database will always have allocated, if not paused. This property is only settable for General Purpose Serverless databases.
     * 
     */
    @Import(name="minCapacity")
    private @Nullable Output<Double> minCapacity;

    /**
     * @return Minimal capacity that database will always have allocated, if not paused. This property is only settable for General Purpose Serverless databases.
     * 
     */
    public Optional<Output<Double>> minCapacity() {
        return Optional.ofNullable(this.minCapacity);
    }

    /**
     * The name of the MS SQL Database. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the MS SQL Database. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The number of readonly secondary replicas associated with the database to which readonly application intent connections may be routed. This property is only settable for Hyperscale edition databases.
     * 
     */
    @Import(name="readReplicaCount")
    private @Nullable Output<Integer> readReplicaCount;

    /**
     * @return The number of readonly secondary replicas associated with the database to which readonly application intent connections may be routed. This property is only settable for Hyperscale edition databases.
     * 
     */
    public Optional<Output<Integer>> readReplicaCount() {
        return Optional.ofNullable(this.readReplicaCount);
    }

    /**
     * If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica. This property is only settable for Premium and Business Critical databases.
     * 
     */
    @Import(name="readScale")
    private @Nullable Output<Boolean> readScale;

    /**
     * @return If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica. This property is only settable for Premium and Business Critical databases.
     * 
     */
    public Optional<Output<Boolean>> readScale() {
        return Optional.ofNullable(this.readScale);
    }

    /**
     * The ID of the database to be recovered. This property is only applicable when the `create_mode` is `Recovery`.
     * 
     */
    @Import(name="recoverDatabaseId")
    private @Nullable Output<String> recoverDatabaseId;

    /**
     * @return The ID of the database to be recovered. This property is only applicable when the `create_mode` is `Recovery`.
     * 
     */
    public Optional<Output<String>> recoverDatabaseId() {
        return Optional.ofNullable(this.recoverDatabaseId);
    }

    /**
     * The ID of the database to be restored. This property is only applicable when the `create_mode` is `Restore`.
     * 
     */
    @Import(name="restoreDroppedDatabaseId")
    private @Nullable Output<String> restoreDroppedDatabaseId;

    /**
     * @return The ID of the database to be restored. This property is only applicable when the `create_mode` is `Restore`.
     * 
     */
    public Optional<Output<String>> restoreDroppedDatabaseId() {
        return Optional.ofNullable(this.restoreDroppedDatabaseId);
    }

    /**
     * Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database. This property is only settable for `create_mode`= `PointInTimeRestore`  databases.
     * 
     */
    @Import(name="restorePointInTime")
    private @Nullable Output<String> restorePointInTime;

    /**
     * @return Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database. This property is only settable for `create_mode`= `PointInTimeRestore`  databases.
     * 
     */
    public Optional<Output<String>> restorePointInTime() {
        return Optional.ofNullable(this.restorePointInTime);
    }

    /**
     * Specifies the name of the sample schema to apply when creating this database. Possible value is `AdventureWorksLT`.
     * 
     */
    @Import(name="sampleName")
    private @Nullable Output<String> sampleName;

    /**
     * @return Specifies the name of the sample schema to apply when creating this database. Possible value is `AdventureWorksLT`.
     * 
     */
    public Optional<Output<String>> sampleName() {
        return Optional.ofNullable(this.sampleName);
    }

    /**
     * The id of the MS SQL Server on which to create the database. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serverId", required=true)
    private Output<String> serverId;

    /**
     * @return The id of the MS SQL Server on which to create the database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }

    /**
     * A `short_term_retention_policy` block as defined below.
     * 
     */
    @Import(name="shortTermRetentionPolicy")
    private @Nullable Output<DatabaseShortTermRetentionPolicyArgs> shortTermRetentionPolicy;

    /**
     * @return A `short_term_retention_policy` block as defined below.
     * 
     */
    public Optional<Output<DatabaseShortTermRetentionPolicyArgs>> shortTermRetentionPolicy() {
        return Optional.ofNullable(this.shortTermRetentionPolicy);
    }

    /**
     * Specifies the name of the SKU used by the database. For example, `GP_S_Gen5_2`,`HS_Gen4_1`,`BC_Gen5_2`, `ElasticPool`, `Basic`,`S0`, `P2` ,`DW100c`, `DS100`. Changing this from the HyperScale service tier to another service tier will force a new resource to be created.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return Specifies the name of the SKU used by the database. For example, `GP_S_Gen5_2`,`HS_Gen4_1`,`BC_Gen5_2`, `ElasticPool`, `Basic`,`S0`, `P2` ,`DW100c`, `DS100`. Changing this from the HyperScale service tier to another service tier will force a new resource to be created.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * Specifies the storage account type used to store backups for this database. Possible values are `Geo`, `GeoZone`, `Local` and `Zone`.  The default value is `Geo`.
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable Output<String> storageAccountType;

    /**
     * @return Specifies the storage account type used to store backups for this database. Possible values are `Geo`, `GeoZone`, `Local` and `Zone`.  The default value is `Geo`.
     * 
     */
    public Optional<Output<String>> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
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
     * Threat detection policy configuration. The `threat_detection_policy` block supports fields documented below.
     * 
     */
    @Import(name="threatDetectionPolicy")
    private @Nullable Output<DatabaseThreatDetectionPolicyArgs> threatDetectionPolicy;

    /**
     * @return Threat detection policy configuration. The `threat_detection_policy` block supports fields documented below.
     * 
     */
    public Optional<Output<DatabaseThreatDetectionPolicyArgs>> threatDetectionPolicy() {
        return Optional.ofNullable(this.threatDetectionPolicy);
    }

    /**
     * If set to true, Transparent Data Encryption will be enabled on the database. Defaults to `true`.
     * 
     */
    @Import(name="transparentDataEncryptionEnabled")
    private @Nullable Output<Boolean> transparentDataEncryptionEnabled;

    /**
     * @return If set to true, Transparent Data Encryption will be enabled on the database. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> transparentDataEncryptionEnabled() {
        return Optional.ofNullable(this.transparentDataEncryptionEnabled);
    }

    /**
     * Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones. This property is only settable for Premium and Business Critical databases.
     * 
     */
    @Import(name="zoneRedundant")
    private @Nullable Output<Boolean> zoneRedundant;

    /**
     * @return Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones. This property is only settable for Premium and Business Critical databases.
     * 
     */
    public Optional<Output<Boolean>> zoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    private DatabaseArgs() {}

    private DatabaseArgs(DatabaseArgs $) {
        this.autoPauseDelayInMinutes = $.autoPauseDelayInMinutes;
        this.collation = $.collation;
        this.createMode = $.createMode;
        this.creationSourceDatabaseId = $.creationSourceDatabaseId;
        this.elasticPoolId = $.elasticPoolId;
        this.geoBackupEnabled = $.geoBackupEnabled;
        this.ledgerEnabled = $.ledgerEnabled;
        this.licenseType = $.licenseType;
        this.longTermRetentionPolicy = $.longTermRetentionPolicy;
        this.maxSizeGb = $.maxSizeGb;
        this.minCapacity = $.minCapacity;
        this.name = $.name;
        this.readReplicaCount = $.readReplicaCount;
        this.readScale = $.readScale;
        this.recoverDatabaseId = $.recoverDatabaseId;
        this.restoreDroppedDatabaseId = $.restoreDroppedDatabaseId;
        this.restorePointInTime = $.restorePointInTime;
        this.sampleName = $.sampleName;
        this.serverId = $.serverId;
        this.shortTermRetentionPolicy = $.shortTermRetentionPolicy;
        this.skuName = $.skuName;
        this.storageAccountType = $.storageAccountType;
        this.tags = $.tags;
        this.threatDetectionPolicy = $.threatDetectionPolicy;
        this.transparentDataEncryptionEnabled = $.transparentDataEncryptionEnabled;
        this.zoneRedundant = $.zoneRedundant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseArgs $;

        public Builder() {
            $ = new DatabaseArgs();
        }

        public Builder(DatabaseArgs defaults) {
            $ = new DatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoPauseDelayInMinutes Time in minutes after which database is automatically paused. A value of `-1` means that automatic pause is disabled. This property is only settable for General Purpose Serverless databases.
         * 
         * @return builder
         * 
         */
        public Builder autoPauseDelayInMinutes(@Nullable Output<Integer> autoPauseDelayInMinutes) {
            $.autoPauseDelayInMinutes = autoPauseDelayInMinutes;
            return this;
        }

        /**
         * @param autoPauseDelayInMinutes Time in minutes after which database is automatically paused. A value of `-1` means that automatic pause is disabled. This property is only settable for General Purpose Serverless databases.
         * 
         * @return builder
         * 
         */
        public Builder autoPauseDelayInMinutes(Integer autoPauseDelayInMinutes) {
            return autoPauseDelayInMinutes(Output.of(autoPauseDelayInMinutes));
        }

        /**
         * @param collation Specifies the collation of the database. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder collation(@Nullable Output<String> collation) {
            $.collation = collation;
            return this;
        }

        /**
         * @param collation Specifies the collation of the database. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder collation(String collation) {
            return collation(Output.of(collation));
        }

        /**
         * @param createMode The create mode of the database. Possible values are `Copy`, `Default`, `OnlineSecondary`, `PointInTimeRestore`, `Recovery`, `Restore`, `RestoreExternalBackup`, `RestoreExternalBackupSecondary`, `RestoreLongTermRetentionBackup` and `Secondary`.
         * 
         * @return builder
         * 
         */
        public Builder createMode(@Nullable Output<String> createMode) {
            $.createMode = createMode;
            return this;
        }

        /**
         * @param createMode The create mode of the database. Possible values are `Copy`, `Default`, `OnlineSecondary`, `PointInTimeRestore`, `Recovery`, `Restore`, `RestoreExternalBackup`, `RestoreExternalBackupSecondary`, `RestoreLongTermRetentionBackup` and `Secondary`.
         * 
         * @return builder
         * 
         */
        public Builder createMode(String createMode) {
            return createMode(Output.of(createMode));
        }

        /**
         * @param creationSourceDatabaseId The ID of the source database from which to create the new database. This should only be used for databases with `create_mode` values that use another database as reference. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder creationSourceDatabaseId(@Nullable Output<String> creationSourceDatabaseId) {
            $.creationSourceDatabaseId = creationSourceDatabaseId;
            return this;
        }

        /**
         * @param creationSourceDatabaseId The ID of the source database from which to create the new database. This should only be used for databases with `create_mode` values that use another database as reference. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder creationSourceDatabaseId(String creationSourceDatabaseId) {
            return creationSourceDatabaseId(Output.of(creationSourceDatabaseId));
        }

        /**
         * @param elasticPoolId Specifies the ID of the elastic pool containing this database.
         * 
         * @return builder
         * 
         */
        public Builder elasticPoolId(@Nullable Output<String> elasticPoolId) {
            $.elasticPoolId = elasticPoolId;
            return this;
        }

        /**
         * @param elasticPoolId Specifies the ID of the elastic pool containing this database.
         * 
         * @return builder
         * 
         */
        public Builder elasticPoolId(String elasticPoolId) {
            return elasticPoolId(Output.of(elasticPoolId));
        }

        /**
         * @param geoBackupEnabled A boolean that specifies if the Geo Backup Policy is enabled.
         * 
         * @return builder
         * 
         */
        public Builder geoBackupEnabled(@Nullable Output<Boolean> geoBackupEnabled) {
            $.geoBackupEnabled = geoBackupEnabled;
            return this;
        }

        /**
         * @param geoBackupEnabled A boolean that specifies if the Geo Backup Policy is enabled.
         * 
         * @return builder
         * 
         */
        public Builder geoBackupEnabled(Boolean geoBackupEnabled) {
            return geoBackupEnabled(Output.of(geoBackupEnabled));
        }

        /**
         * @param ledgerEnabled A boolean that specifies if this is a ledger database. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ledgerEnabled(@Nullable Output<Boolean> ledgerEnabled) {
            $.ledgerEnabled = ledgerEnabled;
            return this;
        }

        /**
         * @param ledgerEnabled A boolean that specifies if this is a ledger database. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ledgerEnabled(Boolean ledgerEnabled) {
            return ledgerEnabled(Output.of(ledgerEnabled));
        }

        /**
         * @param licenseType Specifies the license type applied to this database. Possible values are `LicenseIncluded` and `BasePrice`.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<String> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType Specifies the license type applied to this database. Possible values are `LicenseIncluded` and `BasePrice`.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param longTermRetentionPolicy A `long_term_retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder longTermRetentionPolicy(@Nullable Output<DatabaseLongTermRetentionPolicyArgs> longTermRetentionPolicy) {
            $.longTermRetentionPolicy = longTermRetentionPolicy;
            return this;
        }

        /**
         * @param longTermRetentionPolicy A `long_term_retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder longTermRetentionPolicy(DatabaseLongTermRetentionPolicyArgs longTermRetentionPolicy) {
            return longTermRetentionPolicy(Output.of(longTermRetentionPolicy));
        }

        /**
         * @param maxSizeGb The max size of the database in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder maxSizeGb(@Nullable Output<Integer> maxSizeGb) {
            $.maxSizeGb = maxSizeGb;
            return this;
        }

        /**
         * @param maxSizeGb The max size of the database in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder maxSizeGb(Integer maxSizeGb) {
            return maxSizeGb(Output.of(maxSizeGb));
        }

        /**
         * @param minCapacity Minimal capacity that database will always have allocated, if not paused. This property is only settable for General Purpose Serverless databases.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(@Nullable Output<Double> minCapacity) {
            $.minCapacity = minCapacity;
            return this;
        }

        /**
         * @param minCapacity Minimal capacity that database will always have allocated, if not paused. This property is only settable for General Purpose Serverless databases.
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(Double minCapacity) {
            return minCapacity(Output.of(minCapacity));
        }

        /**
         * @param name The name of the MS SQL Database. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the MS SQL Database. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param readReplicaCount The number of readonly secondary replicas associated with the database to which readonly application intent connections may be routed. This property is only settable for Hyperscale edition databases.
         * 
         * @return builder
         * 
         */
        public Builder readReplicaCount(@Nullable Output<Integer> readReplicaCount) {
            $.readReplicaCount = readReplicaCount;
            return this;
        }

        /**
         * @param readReplicaCount The number of readonly secondary replicas associated with the database to which readonly application intent connections may be routed. This property is only settable for Hyperscale edition databases.
         * 
         * @return builder
         * 
         */
        public Builder readReplicaCount(Integer readReplicaCount) {
            return readReplicaCount(Output.of(readReplicaCount));
        }

        /**
         * @param readScale If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica. This property is only settable for Premium and Business Critical databases.
         * 
         * @return builder
         * 
         */
        public Builder readScale(@Nullable Output<Boolean> readScale) {
            $.readScale = readScale;
            return this;
        }

        /**
         * @param readScale If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica. This property is only settable for Premium and Business Critical databases.
         * 
         * @return builder
         * 
         */
        public Builder readScale(Boolean readScale) {
            return readScale(Output.of(readScale));
        }

        /**
         * @param recoverDatabaseId The ID of the database to be recovered. This property is only applicable when the `create_mode` is `Recovery`.
         * 
         * @return builder
         * 
         */
        public Builder recoverDatabaseId(@Nullable Output<String> recoverDatabaseId) {
            $.recoverDatabaseId = recoverDatabaseId;
            return this;
        }

        /**
         * @param recoverDatabaseId The ID of the database to be recovered. This property is only applicable when the `create_mode` is `Recovery`.
         * 
         * @return builder
         * 
         */
        public Builder recoverDatabaseId(String recoverDatabaseId) {
            return recoverDatabaseId(Output.of(recoverDatabaseId));
        }

        /**
         * @param restoreDroppedDatabaseId The ID of the database to be restored. This property is only applicable when the `create_mode` is `Restore`.
         * 
         * @return builder
         * 
         */
        public Builder restoreDroppedDatabaseId(@Nullable Output<String> restoreDroppedDatabaseId) {
            $.restoreDroppedDatabaseId = restoreDroppedDatabaseId;
            return this;
        }

        /**
         * @param restoreDroppedDatabaseId The ID of the database to be restored. This property is only applicable when the `create_mode` is `Restore`.
         * 
         * @return builder
         * 
         */
        public Builder restoreDroppedDatabaseId(String restoreDroppedDatabaseId) {
            return restoreDroppedDatabaseId(Output.of(restoreDroppedDatabaseId));
        }

        /**
         * @param restorePointInTime Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database. This property is only settable for `create_mode`= `PointInTimeRestore`  databases.
         * 
         * @return builder
         * 
         */
        public Builder restorePointInTime(@Nullable Output<String> restorePointInTime) {
            $.restorePointInTime = restorePointInTime;
            return this;
        }

        /**
         * @param restorePointInTime Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database. This property is only settable for `create_mode`= `PointInTimeRestore`  databases.
         * 
         * @return builder
         * 
         */
        public Builder restorePointInTime(String restorePointInTime) {
            return restorePointInTime(Output.of(restorePointInTime));
        }

        /**
         * @param sampleName Specifies the name of the sample schema to apply when creating this database. Possible value is `AdventureWorksLT`.
         * 
         * @return builder
         * 
         */
        public Builder sampleName(@Nullable Output<String> sampleName) {
            $.sampleName = sampleName;
            return this;
        }

        /**
         * @param sampleName Specifies the name of the sample schema to apply when creating this database. Possible value is `AdventureWorksLT`.
         * 
         * @return builder
         * 
         */
        public Builder sampleName(String sampleName) {
            return sampleName(Output.of(sampleName));
        }

        /**
         * @param serverId The id of the MS SQL Server on which to create the database. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Output<String> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId The id of the MS SQL Server on which to create the database. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverId(String serverId) {
            return serverId(Output.of(serverId));
        }

        /**
         * @param shortTermRetentionPolicy A `short_term_retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder shortTermRetentionPolicy(@Nullable Output<DatabaseShortTermRetentionPolicyArgs> shortTermRetentionPolicy) {
            $.shortTermRetentionPolicy = shortTermRetentionPolicy;
            return this;
        }

        /**
         * @param shortTermRetentionPolicy A `short_term_retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder shortTermRetentionPolicy(DatabaseShortTermRetentionPolicyArgs shortTermRetentionPolicy) {
            return shortTermRetentionPolicy(Output.of(shortTermRetentionPolicy));
        }

        /**
         * @param skuName Specifies the name of the SKU used by the database. For example, `GP_S_Gen5_2`,`HS_Gen4_1`,`BC_Gen5_2`, `ElasticPool`, `Basic`,`S0`, `P2` ,`DW100c`, `DS100`. Changing this from the HyperScale service tier to another service tier will force a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName Specifies the name of the SKU used by the database. For example, `GP_S_Gen5_2`,`HS_Gen4_1`,`BC_Gen5_2`, `ElasticPool`, `Basic`,`S0`, `P2` ,`DW100c`, `DS100`. Changing this from the HyperScale service tier to another service tier will force a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param storageAccountType Specifies the storage account type used to store backups for this database. Possible values are `Geo`, `GeoZone`, `Local` and `Zone`.  The default value is `Geo`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(@Nullable Output<String> storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        /**
         * @param storageAccountType Specifies the storage account type used to store backups for this database. Possible values are `Geo`, `GeoZone`, `Local` and `Zone`.  The default value is `Geo`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(String storageAccountType) {
            return storageAccountType(Output.of(storageAccountType));
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
         * @param threatDetectionPolicy Threat detection policy configuration. The `threat_detection_policy` block supports fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder threatDetectionPolicy(@Nullable Output<DatabaseThreatDetectionPolicyArgs> threatDetectionPolicy) {
            $.threatDetectionPolicy = threatDetectionPolicy;
            return this;
        }

        /**
         * @param threatDetectionPolicy Threat detection policy configuration. The `threat_detection_policy` block supports fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder threatDetectionPolicy(DatabaseThreatDetectionPolicyArgs threatDetectionPolicy) {
            return threatDetectionPolicy(Output.of(threatDetectionPolicy));
        }

        /**
         * @param transparentDataEncryptionEnabled If set to true, Transparent Data Encryption will be enabled on the database. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder transparentDataEncryptionEnabled(@Nullable Output<Boolean> transparentDataEncryptionEnabled) {
            $.transparentDataEncryptionEnabled = transparentDataEncryptionEnabled;
            return this;
        }

        /**
         * @param transparentDataEncryptionEnabled If set to true, Transparent Data Encryption will be enabled on the database. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder transparentDataEncryptionEnabled(Boolean transparentDataEncryptionEnabled) {
            return transparentDataEncryptionEnabled(Output.of(transparentDataEncryptionEnabled));
        }

        /**
         * @param zoneRedundant Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones. This property is only settable for Premium and Business Critical databases.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundant(@Nullable Output<Boolean> zoneRedundant) {
            $.zoneRedundant = zoneRedundant;
            return this;
        }

        /**
         * @param zoneRedundant Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones. This property is only settable for Premium and Business Critical databases.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundant(Boolean zoneRedundant) {
            return zoneRedundant(Output.of(zoneRedundant));
        }

        public DatabaseArgs build() {
            $.serverId = Objects.requireNonNull($.serverId, "expected parameter 'serverId' to be non-null");
            return $;
        }
    }

}