// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.securitycenter;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.securitycenter.AutomationArgs;
import com.pulumi.azure.securitycenter.inputs.AutomationState;
import com.pulumi.azure.securitycenter.outputs.AutomationAction;
import com.pulumi.azure.securitycenter.outputs.AutomationSource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages Security Center Automation and Continuous Export. This resource supports three types of destination in the `action`, Logic Apps, Log Analytics and Event Hubs
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
 *         final var current = Output.of(CoreFunctions.getClientConfig());
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleEventHubNamespace = new EventHubNamespace(&#34;exampleEventHubNamespace&#34;, EventHubNamespaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Standard&#34;)
 *             .capacity(2)
 *             .build());
 * 
 *         var exampleEventHub = new EventHub(&#34;exampleEventHub&#34;, EventHubArgs.builder()        
 *             .namespaceName(exampleEventHubNamespace.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .partitionCount(2)
 *             .messageRetention(2)
 *             .build());
 * 
 *         var exampleAuthorizationRule = new AuthorizationRule(&#34;exampleAuthorizationRule&#34;, AuthorizationRuleArgs.builder()        
 *             .namespaceName(exampleEventHubNamespace.name())
 *             .eventhubName(exampleEventHub.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .listen(true)
 *             .send(false)
 *             .manage(false)
 *             .build());
 * 
 *         var exampleAutomation = new Automation(&#34;exampleAutomation&#34;, AutomationArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .actions(AutomationActionArgs.builder()
 *                 .type(&#34;EventHub&#34;)
 *                 .resourceId(exampleEventHub.id())
 *                 .connectionString(exampleAuthorizationRule.primaryConnectionString())
 *                 .build())
 *             .sources(AutomationSourceArgs.builder()
 *                 .eventSource(&#34;Alerts&#34;)
 *                 .ruleSets(AutomationSourceRuleSetArgs.builder()
 *                     .rules(AutomationSourceRuleSetRuleArgs.builder()
 *                         .propertyPath(&#34;properties.metadata.severity&#34;)
 *                         .operator(&#34;Equals&#34;)
 *                         .expectedValue(&#34;High&#34;)
 *                         .propertyType(&#34;String&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .scopes(String.format(&#34;/subscriptions/%s&#34;, current.apply(getClientConfigResult -&gt; getClientConfigResult.subscriptionId())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Security Center Automations can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:securitycenter/automation:Automation example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Security/automations/automation1
 * ```
 * 
 */
@ResourceType(type="azure:securitycenter/automation:Automation")
public class Automation extends com.pulumi.resources.CustomResource {
    /**
     * One or more `action` blocks as defined below. An `action` tells this automation where the data is to be sent to upon being evaluated by the rules in the `source`.
     * 
     */
    @Export(name="actions", type=List.class, parameters={AutomationAction.class})
    private Output<List<AutomationAction>> actions;

    /**
     * @return One or more `action` blocks as defined below. An `action` tells this automation where the data is to be sent to upon being evaluated by the rules in the `source`.
     * 
     */
    public Output<List<AutomationAction>> actions() {
        return this.actions;
    }
    /**
     * Specifies the description for the Security Center Automation.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies the description for the Security Center Automation.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Boolean to enable or disable this Security Center Automation.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Boolean to enable or disable this Security Center Automation.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The Azure Region where the Security Center Automation should exist. Changing this forces a new Security Center Automation to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Security Center Automation should exist. Changing this forces a new Security Center Automation to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Security Center Automation. Changing this forces a new Security Center Automation to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Security Center Automation. Changing this forces a new Security Center Automation to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Security Center Automation should exist. Changing this forces a new Security Center Automation to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Security Center Automation should exist. Changing this forces a new Security Center Automation to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A list of scopes on which the automation logic is applied, at least one is required. Supported scopes are a subscription (in this format `/subscriptions/00000000-0000-0000-0000-000000000000`) or a resource group under that subscription (in the format `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example`). The automation will only apply on defined scopes.
     * 
     */
    @Export(name="scopes", type=List.class, parameters={String.class})
    private Output<List<String>> scopes;

    /**
     * @return A list of scopes on which the automation logic is applied, at least one is required. Supported scopes are a subscription (in this format `/subscriptions/00000000-0000-0000-0000-000000000000`) or a resource group under that subscription (in the format `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example`). The automation will only apply on defined scopes.
     * 
     */
    public Output<List<String>> scopes() {
        return this.scopes;
    }
    /**
     * One or more `source` blocks as defined below. A `source` defines what data types will be processed and a set of rules to filter that data.
     * 
     */
    @Export(name="sources", type=List.class, parameters={AutomationSource.class})
    private Output<List<AutomationSource>> sources;

    /**
     * @return One or more `source` blocks as defined below. A `source` defines what data types will be processed and a set of rules to filter that data.
     * 
     */
    public Output<List<AutomationSource>> sources() {
        return this.sources;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Automation(String name) {
        this(name, AutomationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Automation(String name, AutomationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Automation(String name, AutomationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:securitycenter/automation:Automation", name, args == null ? AutomationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Automation(String name, Output<String> id, @Nullable AutomationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:securitycenter/automation:Automation", name, state, makeResourceOptions(options, id));
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
    public static Automation get(String name, Output<String> id, @Nullable AutomationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Automation(name, id, state, options);
    }
}