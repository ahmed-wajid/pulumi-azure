// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.inputs;

import com.pulumi.azure.mssql.inputs.ElasticPoolPerDatabaseSettingsArgs;
import com.pulumi.azure.mssql.inputs.ElasticPoolSkuArgs;
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


public final class ElasticPoolState extends com.pulumi.resources.ResourceArgs {

    public static final ElasticPoolState Empty = new ElasticPoolState();

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
     * The max data size of the elastic pool in bytes. Conflicts with `max_size_gb`.
     * 
     */
    @Import(name="maxSizeBytes")
    private @Nullable Output<Integer> maxSizeBytes;

    /**
     * @return The max data size of the elastic pool in bytes. Conflicts with `max_size_gb`.
     * 
     */
    public Optional<Output<Integer>> maxSizeBytes() {
        return Optional.ofNullable(this.maxSizeBytes);
    }

    /**
     * The max data size of the elastic pool in gigabytes. Conflicts with `max_size_bytes`.
     * 
     */
    @Import(name="maxSizeGb")
    private @Nullable Output<Double> maxSizeGb;

    /**
     * @return The max data size of the elastic pool in gigabytes. Conflicts with `max_size_bytes`.
     * 
     */
    public Optional<Output<Double>> maxSizeGb() {
        return Optional.ofNullable(this.maxSizeGb);
    }

    /**
     * The name of the elastic pool. This needs to be globally unique. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the elastic pool. This needs to be globally unique. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `per_database_settings` block as defined below.
     * 
     */
    @Import(name="perDatabaseSettings")
    private @Nullable Output<ElasticPoolPerDatabaseSettingsArgs> perDatabaseSettings;

    /**
     * @return A `per_database_settings` block as defined below.
     * 
     */
    public Optional<Output<ElasticPoolPerDatabaseSettingsArgs>> perDatabaseSettings() {
        return Optional.ofNullable(this.perDatabaseSettings);
    }

    /**
     * The name of the resource group in which to create the elastic pool. This must be the same as the resource group of the underlying SQL server.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the elastic pool. This must be the same as the resource group of the underlying SQL server.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The name of the SQL Server on which to create the elastic pool. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    /**
     * @return The name of the SQL Server on which to create the elastic pool. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    /**
     * A `sku` block as defined below.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<ElasticPoolSkuArgs> sku;

    /**
     * @return A `sku` block as defined below.
     * 
     */
    public Optional<Output<ElasticPoolSkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
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
     * Whether or not this elastic pool is zone redundant. `tier` needs to be `Premium` for `DTU` based  or `BusinessCritical` for `vCore` based `sku`. Defaults to `false`.
     * 
     */
    @Import(name="zoneRedundant")
    private @Nullable Output<Boolean> zoneRedundant;

    /**
     * @return Whether or not this elastic pool is zone redundant. `tier` needs to be `Premium` for `DTU` based  or `BusinessCritical` for `vCore` based `sku`. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> zoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    private ElasticPoolState() {}

    private ElasticPoolState(ElasticPoolState $) {
        this.licenseType = $.licenseType;
        this.location = $.location;
        this.maxSizeBytes = $.maxSizeBytes;
        this.maxSizeGb = $.maxSizeGb;
        this.name = $.name;
        this.perDatabaseSettings = $.perDatabaseSettings;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.sku = $.sku;
        this.tags = $.tags;
        this.zoneRedundant = $.zoneRedundant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElasticPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElasticPoolState $;

        public Builder() {
            $ = new ElasticPoolState();
        }

        public Builder(ElasticPoolState defaults) {
            $ = new ElasticPoolState(Objects.requireNonNull(defaults));
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
         * @param maxSizeBytes The max data size of the elastic pool in bytes. Conflicts with `max_size_gb`.
         * 
         * @return builder
         * 
         */
        public Builder maxSizeBytes(@Nullable Output<Integer> maxSizeBytes) {
            $.maxSizeBytes = maxSizeBytes;
            return this;
        }

        /**
         * @param maxSizeBytes The max data size of the elastic pool in bytes. Conflicts with `max_size_gb`.
         * 
         * @return builder
         * 
         */
        public Builder maxSizeBytes(Integer maxSizeBytes) {
            return maxSizeBytes(Output.of(maxSizeBytes));
        }

        /**
         * @param maxSizeGb The max data size of the elastic pool in gigabytes. Conflicts with `max_size_bytes`.
         * 
         * @return builder
         * 
         */
        public Builder maxSizeGb(@Nullable Output<Double> maxSizeGb) {
            $.maxSizeGb = maxSizeGb;
            return this;
        }

        /**
         * @param maxSizeGb The max data size of the elastic pool in gigabytes. Conflicts with `max_size_bytes`.
         * 
         * @return builder
         * 
         */
        public Builder maxSizeGb(Double maxSizeGb) {
            return maxSizeGb(Output.of(maxSizeGb));
        }

        /**
         * @param name The name of the elastic pool. This needs to be globally unique. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the elastic pool. This needs to be globally unique. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param perDatabaseSettings A `per_database_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder perDatabaseSettings(@Nullable Output<ElasticPoolPerDatabaseSettingsArgs> perDatabaseSettings) {
            $.perDatabaseSettings = perDatabaseSettings;
            return this;
        }

        /**
         * @param perDatabaseSettings A `per_database_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder perDatabaseSettings(ElasticPoolPerDatabaseSettingsArgs perDatabaseSettings) {
            return perDatabaseSettings(Output.of(perDatabaseSettings));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the elastic pool. This must be the same as the resource group of the underlying SQL server.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the elastic pool. This must be the same as the resource group of the underlying SQL server.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the SQL Server on which to create the elastic pool. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the SQL Server on which to create the elastic pool. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param sku A `sku` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<ElasticPoolSkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku A `sku` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sku(ElasticPoolSkuArgs sku) {
            return sku(Output.of(sku));
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
         * @param zoneRedundant Whether or not this elastic pool is zone redundant. `tier` needs to be `Premium` for `DTU` based  or `BusinessCritical` for `vCore` based `sku`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundant(@Nullable Output<Boolean> zoneRedundant) {
            $.zoneRedundant = zoneRedundant;
            return this;
        }

        /**
         * @param zoneRedundant Whether or not this elastic pool is zone redundant. `tier` needs to be `Premium` for `DTU` based  or `BusinessCritical` for `vCore` based `sku`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundant(Boolean zoneRedundant) {
            return zoneRedundant(Output.of(zoneRedundant));
        }

        public ElasticPoolState build() {
            return $;
        }
    }

}