// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupDiagnosticsLogAnalyticsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupDiagnosticsLogAnalyticsArgs Empty = new GroupDiagnosticsLogAnalyticsArgs();

    /**
     * The log type which should be used. Possible values are `ContainerInsights` and `ContainerInstanceLogs`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="logType")
    private @Nullable Output<String> logType;

    /**
     * @return The log type which should be used. Possible values are `ContainerInsights` and `ContainerInstanceLogs`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> logType() {
        return Optional.ofNullable(this.logType);
    }

    /**
     * Any metadata required for Log Analytics. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Any metadata required for Log Analytics. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The Workspace ID of the Log Analytics Workspace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return The Workspace ID of the Log Analytics Workspace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    /**
     * The Workspace Key of the Log Analytics Workspace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="workspaceKey", required=true)
    private Output<String> workspaceKey;

    /**
     * @return The Workspace Key of the Log Analytics Workspace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> workspaceKey() {
        return this.workspaceKey;
    }

    private GroupDiagnosticsLogAnalyticsArgs() {}

    private GroupDiagnosticsLogAnalyticsArgs(GroupDiagnosticsLogAnalyticsArgs $) {
        this.logType = $.logType;
        this.metadata = $.metadata;
        this.workspaceId = $.workspaceId;
        this.workspaceKey = $.workspaceKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupDiagnosticsLogAnalyticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupDiagnosticsLogAnalyticsArgs $;

        public Builder() {
            $ = new GroupDiagnosticsLogAnalyticsArgs();
        }

        public Builder(GroupDiagnosticsLogAnalyticsArgs defaults) {
            $ = new GroupDiagnosticsLogAnalyticsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logType The log type which should be used. Possible values are `ContainerInsights` and `ContainerInstanceLogs`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder logType(@Nullable Output<String> logType) {
            $.logType = logType;
            return this;
        }

        /**
         * @param logType The log type which should be used. Possible values are `ContainerInsights` and `ContainerInstanceLogs`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder logType(String logType) {
            return logType(Output.of(logType));
        }

        /**
         * @param metadata Any metadata required for Log Analytics. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Any metadata required for Log Analytics. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param workspaceId The Workspace ID of the Log Analytics Workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The Workspace ID of the Log Analytics Workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        /**
         * @param workspaceKey The Workspace Key of the Log Analytics Workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceKey(Output<String> workspaceKey) {
            $.workspaceKey = workspaceKey;
            return this;
        }

        /**
         * @param workspaceKey The Workspace Key of the Log Analytics Workspace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceKey(String workspaceKey) {
            return workspaceKey(Output.of(workspaceKey));
        }

        public GroupDiagnosticsLogAnalyticsArgs build() {
            $.workspaceId = Objects.requireNonNull($.workspaceId, "expected parameter 'workspaceId' to be non-null");
            $.workspaceKey = Objects.requireNonNull($.workspaceKey, "expected parameter 'workspaceKey' to be non-null");
            return $;
        }
    }

}