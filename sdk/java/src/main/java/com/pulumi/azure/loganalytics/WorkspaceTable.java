// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loganalytics;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.loganalytics.WorkspaceTableArgs;
import com.pulumi.azure.loganalytics.inputs.WorkspaceTableState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Table in a Log Analytics (formally Operational Insights) Workspace.
 * 
 * &gt; **Note:** This resource does not create or destroy tables. This resource is used to update attributes (currently only retention_in_days) of the tables created when a Log Analytics Workspace is created. Deleting an azure.loganalytics.WorkspaceTable resource will not delete the table. Instead, the table&#39;s retention_in_days field will be set to the value of azure.operationalinsights.AnalyticsWorkspace retention_in_days
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.operationalinsights.AnalyticsWorkspace;
 * import com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs;
 * import com.pulumi.azure.loganalytics.WorkspaceTable;
 * import com.pulumi.azure.loganalytics.WorkspaceTableArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace(&#34;exampleAnalyticsWorkspace&#34;, AnalyticsWorkspaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;PerGB2018&#34;)
 *             .retentionInDays(30)
 *             .build());
 * 
 *         var exampleWorkspaceTable = new WorkspaceTable(&#34;exampleWorkspaceTable&#34;, WorkspaceTableArgs.builder()        
 *             .workspaceId(exampleAnalyticsWorkspace.id())
 *             .retentionInDays(60)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="azure:loganalytics/workspaceTable:WorkspaceTable")
public class WorkspaceTable extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the name of a table in a Log Analytics Workspace.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of a table in a Log Analytics Workspace.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specify the system how to handle and charge the logs ingested to the table. Possible values are `Analytics` and `Basic`. Defaults to `Analytics`.
     * 
     * &gt; **Note:** The `name` of tables currently supported by the `Basic` plan can be found [here](https://learn.microsoft.com/en-us/azure/azure-monitor/logs/basic-logs-configure?tabs=portal-1#supported-tables).
     * 
     */
    @Export(name="plan", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> plan;

    /**
     * @return Specify the system how to handle and charge the logs ingested to the table. Possible values are `Analytics` and `Basic`. Defaults to `Analytics`.
     * 
     * &gt; **Note:** The `name` of tables currently supported by the `Basic` plan can be found [here](https://learn.microsoft.com/en-us/azure/azure-monitor/logs/basic-logs-configure?tabs=portal-1#supported-tables).
     * 
     */
    public Output<Optional<String>> plan() {
        return Codegen.optional(this.plan);
    }
    /**
     * The table&#39;s retention in days. Possible values are either 7 (Free Tier only) or range between 30 and 730.
     * 
     * &gt; **Note:** `retention_in_days` will revert back to the value of azure.operationalinsights.AnalyticsWorkspace retention_in_days when a azure.loganalytics.WorkspaceTable is deleted.
     * 
     * &gt; **Note:** The `retention_in_days` cannot be specified when `plan` is `Basic` because the retention is fixed at eight days.
     * 
     */
    @Export(name="retentionInDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> retentionInDays;

    /**
     * @return The table&#39;s retention in days. Possible values are either 7 (Free Tier only) or range between 30 and 730.
     * 
     * &gt; **Note:** `retention_in_days` will revert back to the value of azure.operationalinsights.AnalyticsWorkspace retention_in_days when a azure.loganalytics.WorkspaceTable is deleted.
     * 
     * &gt; **Note:** The `retention_in_days` cannot be specified when `plan` is `Basic` because the retention is fixed at eight days.
     * 
     */
    public Output<Optional<Integer>> retentionInDays() {
        return Codegen.optional(this.retentionInDays);
    }
    /**
     * The object ID of the Log Analytics Workspace that contains the table.
     * 
     */
    @Export(name="workspaceId", refs={String.class}, tree="[0]")
    private Output<String> workspaceId;

    /**
     * @return The object ID of the Log Analytics Workspace that contains the table.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkspaceTable(String name) {
        this(name, WorkspaceTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkspaceTable(String name, WorkspaceTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkspaceTable(String name, WorkspaceTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loganalytics/workspaceTable:WorkspaceTable", name, args == null ? WorkspaceTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkspaceTable(String name, Output<String> id, @Nullable WorkspaceTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loganalytics/workspaceTable:WorkspaceTable", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WorkspaceTable get(String name, Output<String> id, @Nullable WorkspaceTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkspaceTable(name, id, state, options);
    }
}