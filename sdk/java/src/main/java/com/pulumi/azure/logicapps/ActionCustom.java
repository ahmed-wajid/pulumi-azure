// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.logicapps.ActionCustomArgs;
import com.pulumi.azure.logicapps.inputs.ActionCustomState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Custom Action within a Logic App Workflow
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
 *         var exampleWorkflow = new Workflow(&#34;exampleWorkflow&#34;, WorkflowArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleActionCustom = new ActionCustom(&#34;exampleActionCustom&#34;, ActionCustomArgs.builder()        
 *             .logicAppId(exampleWorkflow.id())
 *             .body(&#34;&#34;&#34;
 * {
 *     &#34;description&#34;: &#34;A variable to configure the auto expiration age in days. Configured in negative number. Default is -30 (30 days old).&#34;,
 *     &#34;inputs&#34;: {
 *         &#34;variables&#34;: [
 *             {
 *                 &#34;name&#34;: &#34;ExpirationAgeInDays&#34;,
 *                 &#34;type&#34;: &#34;Integer&#34;,
 *                 &#34;value&#34;: -30
 *             }
 *         ]
 *     },
 *     &#34;runAfter&#34;: {},
 *     &#34;type&#34;: &#34;InitializeVariable&#34;
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Logic App Custom Actions can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:logicapps/actionCustom:ActionCustom custom1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Logic/workflows/workflow1/actions/custom1
 * ```
 * 
 */
@ResourceType(type="azure:logicapps/actionCustom:ActionCustom")
public class ActionCustom extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the JSON Blob defining the Body of this Custom Action.
     * 
     */
    @Export(name="body", type=String.class, parameters={})
    private Output<String> body;

    /**
     * @return Specifies the JSON Blob defining the Body of this Custom Action.
     * 
     */
    public Output<String> body() {
        return this.body;
    }
    /**
     * Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="logicAppId", type=String.class, parameters={})
    private Output<String> logicAppId;

    /**
     * @return Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> logicAppId() {
        return this.logicAppId;
    }
    /**
     * Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ActionCustom(String name) {
        this(name, ActionCustomArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActionCustom(String name, ActionCustomArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActionCustom(String name, ActionCustomArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:logicapps/actionCustom:ActionCustom", name, args == null ? ActionCustomArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ActionCustom(String name, Output<String> id, @Nullable ActionCustomState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:logicapps/actionCustom:ActionCustom", name, state, makeResourceOptions(options, id));
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
    public static ActionCustom get(String name, Output<String> id, @Nullable ActionCustomState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ActionCustom(name, id, state, options);
    }
}