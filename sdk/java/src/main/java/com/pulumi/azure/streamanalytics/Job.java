// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.streamanalytics.JobArgs;
import com.pulumi.azure.streamanalytics.inputs.JobState;
import com.pulumi.azure.streamanalytics.outputs.JobIdentity;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Stream Analytics Job.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
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
 *         var exampleJob = new Job(&#34;exampleJob&#34;, JobArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .compatibilityLevel(&#34;1.2&#34;)
 *             .dataLocale(&#34;en-GB&#34;)
 *             .eventsLateArrivalMaxDelayInSeconds(60)
 *             .eventsOutOfOrderMaxDelayInSeconds(50)
 *             .eventsOutOfOrderPolicy(&#34;Adjust&#34;)
 *             .outputErrorPolicy(&#34;Drop&#34;)
 *             .streamingUnits(3)
 *             .tags(Map.of(&#34;environment&#34;, &#34;Example&#34;))
 *             .transformationQuery(&#34;&#34;&#34;
 *     SELECT *
 *     INTO [YourOutputAlias]
 *     FROM [YourInputAlias]
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Stream Analytics Job&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:streamanalytics/job:Job example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/group1/providers/Microsoft.StreamAnalytics/streamingjobs/job1
 * ```
 * 
 */
@ResourceType(type="azure:streamanalytics/job:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the compatibility level for this job - which controls certain runtime behaviours of the streaming job. Possible values are `1.0`, `1.1` and `1.2`.
     * 
     */
    @Export(name="compatibilityLevel", type=String.class, parameters={})
    private Output<String> compatibilityLevel;

    /**
     * @return Specifies the compatibility level for this job - which controls certain runtime behaviours of the streaming job. Possible values are `1.0`, `1.1` and `1.2`.
     * 
     */
    public Output<String> compatibilityLevel() {
        return this.compatibilityLevel;
    }
    /**
     * Specifies the Data Locale of the Job, which [should be a supported .NET Culture](&lt;https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx&gt;).
     * 
     */
    @Export(name="dataLocale", type=String.class, parameters={})
    private Output<String> dataLocale;

    /**
     * @return Specifies the Data Locale of the Job, which [should be a supported .NET Culture](&lt;https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx&gt;).
     * 
     */
    public Output<String> dataLocale() {
        return this.dataLocale;
    }
    /**
     * Specifies the maximum tolerable delay in seconds where events arriving late could be included. Supported range is `-1` (indefinite) to `1814399` (20d 23h 59m 59s).  Default is `0`.
     * 
     */
    @Export(name="eventsLateArrivalMaxDelayInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> eventsLateArrivalMaxDelayInSeconds;

    /**
     * @return Specifies the maximum tolerable delay in seconds where events arriving late could be included. Supported range is `-1` (indefinite) to `1814399` (20d 23h 59m 59s).  Default is `0`.
     * 
     */
    public Output<Optional<Integer>> eventsLateArrivalMaxDelayInSeconds() {
        return Codegen.optional(this.eventsLateArrivalMaxDelayInSeconds);
    }
    /**
     * Specifies the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order. Supported range is `0` to `599` (9m 59s). Default is `5`.
     * 
     */
    @Export(name="eventsOutOfOrderMaxDelayInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> eventsOutOfOrderMaxDelayInSeconds;

    /**
     * @return Specifies the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order. Supported range is `0` to `599` (9m 59s). Default is `5`.
     * 
     */
    public Output<Optional<Integer>> eventsOutOfOrderMaxDelayInSeconds() {
        return Codegen.optional(this.eventsOutOfOrderMaxDelayInSeconds);
    }
    /**
     * Specifies the policy which should be applied to events which arrive out of order in the input event stream. Possible values are `Adjust` and `Drop`.  Default is `Adjust`.
     * 
     */
    @Export(name="eventsOutOfOrderPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventsOutOfOrderPolicy;

    /**
     * @return Specifies the policy which should be applied to events which arrive out of order in the input event stream. Possible values are `Adjust` and `Drop`.  Default is `Adjust`.
     * 
     */
    public Output<Optional<String>> eventsOutOfOrderPolicy() {
        return Codegen.optional(this.eventsOutOfOrderPolicy);
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=JobIdentity.class, parameters={})
    private Output</* @Nullable */ JobIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<JobIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The Job ID assigned by the Stream Analytics Job.
     * 
     */
    @Export(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    /**
     * @return The Job ID assigned by the Stream Analytics Job.
     * 
     */
    public Output<String> jobId() {
        return this.jobId;
    }
    /**
     * The Azure Region in which the Resource Group exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region in which the Resource Group exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the policy which should be applied to events which arrive at the output and cannot be written to the external storage due to being malformed (such as missing column values, column values of wrong type or size). Possible values are `Drop` and `Stop`.  Default is `Drop`.
     * 
     */
    @Export(name="outputErrorPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> outputErrorPolicy;

    /**
     * @return Specifies the policy which should be applied to events which arrive at the output and cannot be written to the external storage due to being malformed (such as missing column values, column values of wrong type or size). Possible values are `Drop` and `Stop`.  Default is `Drop`.
     * 
     */
    public Output<Optional<String>> outputErrorPolicy() {
        return Codegen.optional(this.outputErrorPolicy);
    }
    /**
     * The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The ID of an existing Stream Analytics Cluster where the Stream Analytics Job should run.
     * 
     */
    @Export(name="streamAnalyticsClusterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> streamAnalyticsClusterId;

    /**
     * @return The ID of an existing Stream Analytics Cluster where the Stream Analytics Job should run.
     * 
     */
    public Output<Optional<String>> streamAnalyticsClusterId() {
        return Codegen.optional(this.streamAnalyticsClusterId);
    }
    /**
     * Specifies the number of streaming units that the streaming job uses. Supported values are `1`, `3`, `6` and multiples of `6` up to `120`.
     * 
     */
    @Export(name="streamingUnits", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> streamingUnits;

    /**
     * @return Specifies the number of streaming units that the streaming job uses. Supported values are `1`, `3`, `6` and multiples of `6` up to `120`.
     * 
     */
    public Output<Optional<Integer>> streamingUnits() {
        return Codegen.optional(this.streamingUnits);
    }
    /**
     * A mapping of tags assigned to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the query that will be run in the streaming job, [written in Stream Analytics Query Language (SAQL)](https://msdn.microsoft.com/library/azure/dn834998).
     * 
     */
    @Export(name="transformationQuery", type=String.class, parameters={})
    private Output<String> transformationQuery;

    /**
     * @return Specifies the query that will be run in the streaming job, [written in Stream Analytics Query Language (SAQL)](https://msdn.microsoft.com/library/azure/dn834998).
     * 
     */
    public Output<String> transformationQuery() {
        return this.transformationQuery;
    }
    /**
     * The type of the Stream Analytics Job. Possible values are `Cloud` and `Edge`. Defaults to `Cloud`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the Stream Analytics Job. Possible values are `Cloud` and `Edge`. Defaults to `Cloud`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:streamanalytics/job:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:streamanalytics/job:Job", name, state, makeResourceOptions(options, id));
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
    public static Job get(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, state, options);
    }
}