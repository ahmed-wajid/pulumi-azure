// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring;

import com.pulumi.azure.monitoring.inputs.ScheduledQueryRulesLogCriteriaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledQueryRulesLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryRulesLogArgs Empty = new ScheduledQueryRulesLogArgs();

    @Import(name="authorizedResourceIds")
    private @Nullable Output<List<String>> authorizedResourceIds;

    public Optional<Output<List<String>>> authorizedResourceIds() {
        return Optional.ofNullable(this.authorizedResourceIds);
    }

    /**
     * A `criteria` block as defined below.
     * 
     */
    @Import(name="criteria", required=true)
    private Output<ScheduledQueryRulesLogCriteriaArgs> criteria;

    /**
     * @return A `criteria` block as defined below.
     * 
     */
    public Output<ScheduledQueryRulesLogCriteriaArgs> criteria() {
        return this.criteria;
    }

    /**
     * The resource URI over which log search query is to be run.
     * 
     */
    @Import(name="dataSourceId", required=true)
    private Output<String> dataSourceId;

    /**
     * @return The resource URI over which log search query is to be run.
     * 
     */
    public Output<String> dataSourceId() {
        return this.dataSourceId;
    }

    /**
     * The description of the scheduled query rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the scheduled query rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether this scheduled query rule is enabled.  Default is `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether this scheduled query rule is enabled.  Default is `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the scheduled query rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the scheduled query rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the scheduled query rule instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the scheduled query rule instance.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ScheduledQueryRulesLogArgs() {}

    private ScheduledQueryRulesLogArgs(ScheduledQueryRulesLogArgs $) {
        this.authorizedResourceIds = $.authorizedResourceIds;
        this.criteria = $.criteria;
        this.dataSourceId = $.dataSourceId;
        this.description = $.description;
        this.enabled = $.enabled;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledQueryRulesLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledQueryRulesLogArgs $;

        public Builder() {
            $ = new ScheduledQueryRulesLogArgs();
        }

        public Builder(ScheduledQueryRulesLogArgs defaults) {
            $ = new ScheduledQueryRulesLogArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizedResourceIds(@Nullable Output<List<String>> authorizedResourceIds) {
            $.authorizedResourceIds = authorizedResourceIds;
            return this;
        }

        public Builder authorizedResourceIds(List<String> authorizedResourceIds) {
            return authorizedResourceIds(Output.of(authorizedResourceIds));
        }

        public Builder authorizedResourceIds(String... authorizedResourceIds) {
            return authorizedResourceIds(List.of(authorizedResourceIds));
        }

        /**
         * @param criteria A `criteria` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder criteria(Output<ScheduledQueryRulesLogCriteriaArgs> criteria) {
            $.criteria = criteria;
            return this;
        }

        /**
         * @param criteria A `criteria` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder criteria(ScheduledQueryRulesLogCriteriaArgs criteria) {
            return criteria(Output.of(criteria));
        }

        /**
         * @param dataSourceId The resource URI over which log search query is to be run.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(Output<String> dataSourceId) {
            $.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * @param dataSourceId The resource URI over which log search query is to be run.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(String dataSourceId) {
            return dataSourceId(Output.of(dataSourceId));
        }

        /**
         * @param description The description of the scheduled query rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the scheduled query rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Whether this scheduled query rule is enabled.  Default is `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether this scheduled query rule is enabled.  Default is `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the scheduled query rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the scheduled query rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the scheduled query rule instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the scheduled query rule instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ScheduledQueryRulesLogArgs build() {
            $.criteria = Objects.requireNonNull($.criteria, "expected parameter 'criteria' to be non-null");
            $.dataSourceId = Objects.requireNonNull($.dataSourceId, "expected parameter 'dataSourceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}