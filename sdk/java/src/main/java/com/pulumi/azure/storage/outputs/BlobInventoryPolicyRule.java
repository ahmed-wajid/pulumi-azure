// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.BlobInventoryPolicyRuleFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BlobInventoryPolicyRule {
    /**
     * @return A `filter` block as defined above. Can only be set when the `scope` is `Blob`.
     * 
     */
    private final @Nullable BlobInventoryPolicyRuleFilter filter;
    /**
     * @return The format of the inventory files. Possible values are `Csv` and `Parquet`.
     * 
     */
    private final String format;
    /**
     * @return The name which should be used for this Blob Inventory Policy Rule.
     * 
     */
    private final String name;
    /**
     * @return The inventory schedule applied by this rule. Possible values are `Daily` and `Weekly`.
     * 
     */
    private final String schedule;
    /**
     * @return A list of fields to be included in the inventory. See the [Azure API reference](https://docs.microsoft.com/rest/api/storagerp/blob-inventory-policies/create-or-update#blobinventorypolicydefinition) for all the supported fields.
     * 
     */
    private final List<String> schemaFields;
    /**
     * @return The scope of the inventory for this rule. Possible values are `Blob` and `Container`.
     * 
     */
    private final String scope;
    /**
     * @return The storage container name to store the blob inventory files for this rule.
     * 
     */
    private final String storageContainerName;

    @CustomType.Constructor
    private BlobInventoryPolicyRule(
        @CustomType.Parameter("filter") @Nullable BlobInventoryPolicyRuleFilter filter,
        @CustomType.Parameter("format") String format,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedule") String schedule,
        @CustomType.Parameter("schemaFields") List<String> schemaFields,
        @CustomType.Parameter("scope") String scope,
        @CustomType.Parameter("storageContainerName") String storageContainerName) {
        this.filter = filter;
        this.format = format;
        this.name = name;
        this.schedule = schedule;
        this.schemaFields = schemaFields;
        this.scope = scope;
        this.storageContainerName = storageContainerName;
    }

    /**
     * @return A `filter` block as defined above. Can only be set when the `scope` is `Blob`.
     * 
     */
    public Optional<BlobInventoryPolicyRuleFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return The format of the inventory files. Possible values are `Csv` and `Parquet`.
     * 
     */
    public String format() {
        return this.format;
    }
    /**
     * @return The name which should be used for this Blob Inventory Policy Rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The inventory schedule applied by this rule. Possible values are `Daily` and `Weekly`.
     * 
     */
    public String schedule() {
        return this.schedule;
    }
    /**
     * @return A list of fields to be included in the inventory. See the [Azure API reference](https://docs.microsoft.com/rest/api/storagerp/blob-inventory-policies/create-or-update#blobinventorypolicydefinition) for all the supported fields.
     * 
     */
    public List<String> schemaFields() {
        return this.schemaFields;
    }
    /**
     * @return The scope of the inventory for this rule. Possible values are `Blob` and `Container`.
     * 
     */
    public String scope() {
        return this.scope;
    }
    /**
     * @return The storage container name to store the blob inventory files for this rule.
     * 
     */
    public String storageContainerName() {
        return this.storageContainerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BlobInventoryPolicyRuleFilter filter;
        private String format;
        private String name;
        private String schedule;
        private List<String> schemaFields;
        private String scope;
        private String storageContainerName;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.format = defaults.format;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.schemaFields = defaults.schemaFields;
    	      this.scope = defaults.scope;
    	      this.storageContainerName = defaults.storageContainerName;
        }

        public Builder filter(@Nullable BlobInventoryPolicyRuleFilter filter) {
            this.filter = filter;
            return this;
        }
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder schemaFields(List<String> schemaFields) {
            this.schemaFields = Objects.requireNonNull(schemaFields);
            return this;
        }
        public Builder schemaFields(String... schemaFields) {
            return schemaFields(List.of(schemaFields));
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder storageContainerName(String storageContainerName) {
            this.storageContainerName = Objects.requireNonNull(storageContainerName);
            return this;
        }        public BlobInventoryPolicyRule build() {
            return new BlobInventoryPolicyRule(filter, format, name, schedule, schemaFields, scope, storageContainerName);
        }
    }
}