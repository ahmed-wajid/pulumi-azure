// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.LoggerArgs;
import com.pulumi.azure.apimanagement.inputs.LoggerState;
import com.pulumi.azure.apimanagement.outputs.LoggerApplicationInsights;
import com.pulumi.azure.apimanagement.outputs.LoggerEventhub;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Logger within an API Management Service.
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
 *         var exampleInsights = new Insights(&#34;exampleInsights&#34;, InsightsArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .applicationType(&#34;other&#34;)
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .publisherName(&#34;My Company&#34;)
 *             .publisherEmail(&#34;company@exmaple.com&#34;)
 *             .skuName(&#34;Developer_1&#34;)
 *             .build());
 * 
 *         var exampleLogger = new Logger(&#34;exampleLogger&#34;, LoggerArgs.builder()        
 *             .apiManagementName(exampleService.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .resourceId(exampleInsights.id())
 *             .applicationInsights(LoggerApplicationInsightsArgs.builder()
 *                 .instrumentationKey(exampleInsights.instrumentationKey())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Management Loggers can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:apimanagement/logger:Logger example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/example-rg/providers/Microsoft.ApiManagement/service/example-apim/loggers/example-logger
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/logger:Logger")
public class Logger extends com.pulumi.resources.CustomResource {
    /**
     * The name of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="apiManagementName", type=String.class, parameters={})
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * An `application_insights` block as documented below.
     * 
     */
    @Export(name="applicationInsights", type=LoggerApplicationInsights.class, parameters={})
    private Output</* @Nullable */ LoggerApplicationInsights> applicationInsights;

    /**
     * @return An `application_insights` block as documented below.
     * 
     */
    public Output<Optional<LoggerApplicationInsights>> applicationInsights() {
        return Codegen.optional(this.applicationInsights);
    }
    /**
     * Specifies whether records should be buffered in the Logger prior to publishing. Defaults to `true`.
     * 
     */
    @Export(name="buffered", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> buffered;

    /**
     * @return Specifies whether records should be buffered in the Logger prior to publishing. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> buffered() {
        return Codegen.optional(this.buffered);
    }
    /**
     * A description of this Logger.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of this Logger.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * An `eventhub` block as documented below.
     * 
     */
    @Export(name="eventhub", type=LoggerEventhub.class, parameters={})
    private Output</* @Nullable */ LoggerEventhub> eventhub;

    /**
     * @return An `eventhub` block as documented below.
     * 
     */
    public Output<Optional<LoggerEventhub>> eventhub() {
        return Codegen.optional(this.eventhub);
    }
    /**
     * The name of this Logger, which must be unique within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this Logger, which must be unique within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The target resource id which will be linked in the API-Management portal page.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return The target resource id which will be linked in the API-Management portal page.
     * 
     */
    public Output<Optional<String>> resourceId() {
        return Codegen.optional(this.resourceId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Logger(String name) {
        this(name, LoggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Logger(String name, LoggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Logger(String name, LoggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/logger:Logger", name, args == null ? LoggerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Logger(String name, Output<String> id, @Nullable LoggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/logger:Logger", name, state, makeResourceOptions(options, id));
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
    public static Logger get(String name, Output<String> id, @Nullable LoggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Logger(name, id, state, options);
    }
}