// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.AvailabilitySetArgs;
import com.pulumi.azure.compute.inputs.AvailabilitySetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Availability Set for Virtual Machines.
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
 *         var exampleAvailabilitySet = new AvailabilitySet(&#34;exampleAvailabilitySet&#34;, AvailabilitySetArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Availability Sets can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/availabilitySet:AvailabilitySet group1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/availabilitySets/webAvailSet
 * ```
 * 
 */
@ResourceType(type="azure:compute/availabilitySet:AvailabilitySet")
public class AvailabilitySet extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies whether the availability set is managed or not. Possible values are `true` (to specify aligned) or `false` (to specify classic). Default is `true`.
     * 
     */
    @Export(name="managed", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> managed;

    /**
     * @return Specifies whether the availability set is managed or not. Possible values are `true` (to specify aligned) or `false` (to specify classic). Default is `true`.
     * 
     */
    public Output<Optional<Boolean>> managed() {
        return Codegen.optional(this.managed);
    }
    /**
     * Specifies the name of the availability set. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the availability set. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the number of fault domains that are used. Defaults to `3`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="platformFaultDomainCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> platformFaultDomainCount;

    /**
     * @return Specifies the number of fault domains that are used. Defaults to `3`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> platformFaultDomainCount() {
        return Codegen.optional(this.platformFaultDomainCount);
    }
    /**
     * Specifies the number of update domains that are used. Defaults to `5`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="platformUpdateDomainCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> platformUpdateDomainCount;

    /**
     * @return Specifies the number of update domains that are used. Defaults to `5`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> platformUpdateDomainCount() {
        return Codegen.optional(this.platformUpdateDomainCount);
    }
    /**
     * The ID of the Proximity Placement Group to which this Virtual Machine should be assigned. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="proximityPlacementGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> proximityPlacementGroupId;

    /**
     * @return The ID of the Proximity Placement Group to which this Virtual Machine should be assigned. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> proximityPlacementGroupId() {
        return Codegen.optional(this.proximityPlacementGroupId);
    }
    /**
     * The name of the resource group in which to create the availability set. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the availability set. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AvailabilitySet(String name) {
        this(name, AvailabilitySetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AvailabilitySet(String name, AvailabilitySetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AvailabilitySet(String name, AvailabilitySetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/availabilitySet:AvailabilitySet", name, args == null ? AvailabilitySetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AvailabilitySet(String name, Output<String> id, @Nullable AvailabilitySetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/availabilitySet:AvailabilitySet", name, state, makeResourceOptions(options, id));
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
    public static AvailabilitySet get(String name, Output<String> id, @Nullable AvailabilitySetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AvailabilitySet(name, id, state, options);
    }
}