// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.azure.cosmosdb.inputs.TableAutoscaleSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableState extends com.pulumi.resources.ResourceArgs {

    public static final TableState Empty = new TableState();

    /**
     * The name of the Cosmos DB Table to create the table within. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    /**
     * @return The name of the Cosmos DB Table to create the table within. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * An `autoscale_settings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     */
    @Import(name="autoscaleSettings")
    private @Nullable Output<TableAutoscaleSettingsArgs> autoscaleSettings;

    /**
     * @return An `autoscale_settings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     */
    public Optional<Output<TableAutoscaleSettingsArgs>> autoscaleSettings() {
        return Optional.ofNullable(this.autoscaleSettings);
    }

    /**
     * Specifies the name of the Cosmos DB Table. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Cosmos DB Table. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which the Cosmos DB Table is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Cosmos DB Table is created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The throughput of Table (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
     * 
     */
    @Import(name="throughput")
    private @Nullable Output<Integer> throughput;

    /**
     * @return The throughput of Table (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
     * 
     */
    public Optional<Output<Integer>> throughput() {
        return Optional.ofNullable(this.throughput);
    }

    private TableState() {}

    private TableState(TableState $) {
        this.accountName = $.accountName;
        this.autoscaleSettings = $.autoscaleSettings;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.throughput = $.throughput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableState $;

        public Builder() {
            $ = new TableState();
        }

        public Builder(TableState defaults) {
            $ = new TableState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Cosmos DB Table to create the table within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the Cosmos DB Table to create the table within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param autoscaleSettings An `autoscale_settings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleSettings(@Nullable Output<TableAutoscaleSettingsArgs> autoscaleSettings) {
            $.autoscaleSettings = autoscaleSettings;
            return this;
        }

        /**
         * @param autoscaleSettings An `autoscale_settings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleSettings(TableAutoscaleSettingsArgs autoscaleSettings) {
            return autoscaleSettings(Output.of(autoscaleSettings));
        }

        /**
         * @param name Specifies the name of the Cosmos DB Table. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Cosmos DB Table. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Cosmos DB Table is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Cosmos DB Table is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param throughput The throughput of Table (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
         * 
         * @return builder
         * 
         */
        public Builder throughput(@Nullable Output<Integer> throughput) {
            $.throughput = throughput;
            return this;
        }

        /**
         * @param throughput The throughput of Table (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
         * 
         * @return builder
         * 
         */
        public Builder throughput(Integer throughput) {
            return throughput(Output.of(throughput));
        }

        public TableState build() {
            return $;
        }
    }

}