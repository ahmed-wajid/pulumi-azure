// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cdn.FrontdoorOriginGroupArgs;
import com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupState;
import com.pulumi.azure.cdn.outputs.FrontdoorOriginGroupHealthProbe;
import com.pulumi.azure.cdn.outputs.FrontdoorOriginGroupLoadBalancing;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a CDN FrontDoor Origin Group.
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
 * import com.pulumi.azure.cdn.FrontdoorProfile;
 * import com.pulumi.azure.cdn.FrontdoorProfileArgs;
 * import com.pulumi.azure.cdn.FrontdoorOriginGroup;
 * import com.pulumi.azure.cdn.FrontdoorOriginGroupArgs;
 * import com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupHealthProbeArgs;
 * import com.pulumi.azure.cdn.inputs.FrontdoorOriginGroupLoadBalancingArgs;
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
 *         var exampleFrontdoorProfile = new FrontdoorProfile(&#34;exampleFrontdoorProfile&#34;, FrontdoorProfileArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleFrontdoorOriginGroup = new FrontdoorOriginGroup(&#34;exampleFrontdoorOriginGroup&#34;, FrontdoorOriginGroupArgs.builder()        
 *             .cdnFrontdoorProfileId(exampleFrontdoorProfile.id())
 *             .sessionAffinityEnabled(true)
 *             .restoreTrafficTimeToHealedOrNewEndpointInMinutes(10)
 *             .healthProbe(FrontdoorOriginGroupHealthProbeArgs.builder()
 *                 .intervalInSeconds(240)
 *                 .path(&#34;/healthProbe&#34;)
 *                 .protocol(&#34;Https&#34;)
 *                 .requestType(&#34;HEAD&#34;)
 *                 .build())
 *             .loadBalancing(FrontdoorOriginGroupLoadBalancingArgs.builder()
 *                 .additionalLatencyInMilliseconds(0)
 *                 .sampleSize(16)
 *                 .successfulSamplesRequired(3)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * CDN FrontDoor Origin Groups can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:cdn/frontdoorOriginGroup:FrontdoorOriginGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/originGroups/originGroup1
 * ```
 * 
 */
@ResourceType(type="azure:cdn/frontdoorOriginGroup:FrontdoorOriginGroup")
public class FrontdoorOriginGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the CDN FrontDoor Profile within which this CDN FrontDoor Origin Group should exist. Changing this forces a new CDN FrontDoor Origin Group to be created.
     * 
     */
    @Export(name="cdnFrontdoorProfileId", type=String.class, parameters={})
    private Output<String> cdnFrontdoorProfileId;

    /**
     * @return The ID of the CDN FrontDoor Profile within which this CDN FrontDoor Origin Group should exist. Changing this forces a new CDN FrontDoor Origin Group to be created.
     * 
     */
    public Output<String> cdnFrontdoorProfileId() {
        return this.cdnFrontdoorProfileId;
    }
    /**
     * A `health_probe` block as defined below.
     * 
     */
    @Export(name="healthProbe", type=FrontdoorOriginGroupHealthProbe.class, parameters={})
    private Output</* @Nullable */ FrontdoorOriginGroupHealthProbe> healthProbe;

    /**
     * @return A `health_probe` block as defined below.
     * 
     */
    public Output<Optional<FrontdoorOriginGroupHealthProbe>> healthProbe() {
        return Codegen.optional(this.healthProbe);
    }
    /**
     * A `load_balancing` block as defined below.
     * 
     */
    @Export(name="loadBalancing", type=FrontdoorOriginGroupLoadBalancing.class, parameters={})
    private Output<FrontdoorOriginGroupLoadBalancing> loadBalancing;

    /**
     * @return A `load_balancing` block as defined below.
     * 
     */
    public Output<FrontdoorOriginGroupLoadBalancing> loadBalancing() {
        return this.loadBalancing;
    }
    /**
     * The name which should be used for this CDN FrontDoor Origin Group. Changing this forces a new CDN FrontDoor Origin Group to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this CDN FrontDoor Origin Group. Changing this forces a new CDN FrontDoor Origin Group to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the amount of time which should elapse before shifting traffic to another endpoint when a healthy endpoint becomes unhealthy or a new endpoint is added. Possible values are between `0` and `50` minutes (inclusive). Default is `10` minutes.
     * 
     */
    @Export(name="restoreTrafficTimeToHealedOrNewEndpointInMinutes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> restoreTrafficTimeToHealedOrNewEndpointInMinutes;

    /**
     * @return Specifies the amount of time which should elapse before shifting traffic to another endpoint when a healthy endpoint becomes unhealthy or a new endpoint is added. Possible values are between `0` and `50` minutes (inclusive). Default is `10` minutes.
     * 
     */
    public Output<Optional<Integer>> restoreTrafficTimeToHealedOrNewEndpointInMinutes() {
        return Codegen.optional(this.restoreTrafficTimeToHealedOrNewEndpointInMinutes);
    }
    /**
     * Specifies whether session affinity should be enabled on this host. Defaults to `true`.
     * 
     */
    @Export(name="sessionAffinityEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sessionAffinityEnabled;

    /**
     * @return Specifies whether session affinity should be enabled on this host. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> sessionAffinityEnabled() {
        return Codegen.optional(this.sessionAffinityEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FrontdoorOriginGroup(String name) {
        this(name, FrontdoorOriginGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FrontdoorOriginGroup(String name, FrontdoorOriginGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FrontdoorOriginGroup(String name, FrontdoorOriginGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cdn/frontdoorOriginGroup:FrontdoorOriginGroup", name, args == null ? FrontdoorOriginGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FrontdoorOriginGroup(String name, Output<String> id, @Nullable FrontdoorOriginGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cdn/frontdoorOriginGroup:FrontdoorOriginGroup", name, state, makeResourceOptions(options, id));
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
    public static FrontdoorOriginGroup get(String name, Output<String> id, @Nullable FrontdoorOriginGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FrontdoorOriginGroup(name, id, state, options);
    }
}