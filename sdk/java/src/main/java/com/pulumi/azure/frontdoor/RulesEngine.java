// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.frontdoor.RulesEngineArgs;
import com.pulumi.azure.frontdoor.inputs.RulesEngineState;
import com.pulumi.azure.frontdoor.outputs.RulesEngineRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Front Door Rules Engine configuration and rules.
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
 *         var exampleRulesEngine = new RulesEngine(&#34;exampleRulesEngine&#34;, RulesEngineArgs.builder()        
 *             .frontdoorName(azurerm_frontdoor.example().name())
 *             .resourceGroupName(azurerm_frontdoor.example().resource_group_name())
 *             .rules(            
 *                 RulesEngineRuleArgs.builder()
 *                     .name(&#34;debuggingoutput&#34;)
 *                     .priority(1)
 *                     .action(RulesEngineRuleActionArgs.builder()
 *                         .responseHeaders(RulesEngineRuleActionResponseHeaderArgs.builder()
 *                             .headerActionType(&#34;Append&#34;)
 *                             .headerName(&#34;X-TEST-HEADER&#34;)
 *                             .value(&#34;Append Header Rule&#34;)
 *                             .build())
 *                         .build())
 *                     .build(),
 *                 RulesEngineRuleArgs.builder()
 *                     .name(&#34;overwriteorigin&#34;)
 *                     .priority(2)
 *                     .matchConditions(RulesEngineRuleMatchConditionArgs.builder()
 *                         .variable(&#34;RequestMethod&#34;)
 *                         .operator(&#34;Equal&#34;)
 *                         .values(                        
 *                             &#34;GET&#34;,
 *                             &#34;POST&#34;)
 *                         .build())
 *                     .action(RulesEngineRuleActionArgs.builder()
 *                         .responseHeaders(                        
 *                             RulesEngineRuleActionResponseHeaderArgs.builder()
 *                                 .headerActionType(&#34;Overwrite&#34;)
 *                                 .headerName(&#34;Access-Control-Allow-Origin&#34;)
 *                                 .value(&#34;*&#34;)
 *                                 .build(),
 *                             RulesEngineRuleActionResponseHeaderArgs.builder()
 *                                 .headerActionType(&#34;Overwrite&#34;)
 *                                 .headerName(&#34;Access-Control-Allow-Credentials&#34;)
 *                                 .value(&#34;true&#34;)
 *                                 .build())
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Azure Front Door Rules Engine&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:frontdoor/rulesEngine:RulesEngine example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Network/frontdoors/frontdoor1/rulesengines/rule1
 * ```
 * 
 */
@ResourceType(type="azure:frontdoor/rulesEngine:RulesEngine")
public class RulesEngine extends com.pulumi.resources.CustomResource {
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The name of the Front Door instance. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="frontdoorName", type=String.class, parameters={})
    private Output<String> frontdoorName;

    /**
     * @return The name of the Front Door instance. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> frontdoorName() {
        return this.frontdoorName;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the Rules engine configuration. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Rules engine configuration. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `rule` block as defined below.
     * 
     */
    @Export(name="rules", type=List.class, parameters={RulesEngineRule.class})
    private Output</* @Nullable */ List<RulesEngineRule>> rules;

    /**
     * @return A `rule` block as defined below.
     * 
     */
    public Output<Optional<List<RulesEngineRule>>> rules() {
        return Codegen.optional(this.rules);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RulesEngine(String name) {
        this(name, RulesEngineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RulesEngine(String name, RulesEngineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RulesEngine(String name, RulesEngineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:frontdoor/rulesEngine:RulesEngine", name, args == null ? RulesEngineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RulesEngine(String name, Output<String> id, @Nullable RulesEngineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:frontdoor/rulesEngine:RulesEngine", name, state, makeResourceOptions(options, id));
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
    public static RulesEngine get(String name, Output<String> id, @Nullable RulesEngineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RulesEngine(name, id, state, options);
    }
}