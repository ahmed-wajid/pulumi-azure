// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.proximity;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.proximity.inputs.GetPlacementGroupArgs;
import com.pulumi.azure.proximity.inputs.GetPlacementGroupPlainArgs;
import com.pulumi.azure.proximity.outputs.GetPlacementGroupResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ProximityFunctions {
    /**
     * Use this data source to access information about an existing Proximity Placement Group.
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
     *         final var example = Output.of(ProximityFunctions.getPlacementGroup(GetPlacementGroupArgs.builder()
     *             .name(&#34;tf-appsecuritygroup&#34;)
     *             .resourceGroupName(&#34;my-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;proximityPlacementGroupId&#34;, example.apply(getPlacementGroupResult -&gt; getPlacementGroupResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetPlacementGroupResult> getPlacementGroup(GetPlacementGroupArgs args) {
        return getPlacementGroup(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Proximity Placement Group.
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
     *         final var example = Output.of(ProximityFunctions.getPlacementGroup(GetPlacementGroupArgs.builder()
     *             .name(&#34;tf-appsecuritygroup&#34;)
     *             .resourceGroupName(&#34;my-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;proximityPlacementGroupId&#34;, example.apply(getPlacementGroupResult -&gt; getPlacementGroupResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPlacementGroupResult> getPlacementGroupPlain(GetPlacementGroupPlainArgs args) {
        return getPlacementGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Proximity Placement Group.
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
     *         final var example = Output.of(ProximityFunctions.getPlacementGroup(GetPlacementGroupArgs.builder()
     *             .name(&#34;tf-appsecuritygroup&#34;)
     *             .resourceGroupName(&#34;my-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;proximityPlacementGroupId&#34;, example.apply(getPlacementGroupResult -&gt; getPlacementGroupResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetPlacementGroupResult> getPlacementGroup(GetPlacementGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:proximity/getPlacementGroup:getPlacementGroup", TypeShape.of(GetPlacementGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Proximity Placement Group.
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
     *         final var example = Output.of(ProximityFunctions.getPlacementGroup(GetPlacementGroupArgs.builder()
     *             .name(&#34;tf-appsecuritygroup&#34;)
     *             .resourceGroupName(&#34;my-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;proximityPlacementGroupId&#34;, example.apply(getPlacementGroupResult -&gt; getPlacementGroupResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPlacementGroupResult> getPlacementGroupPlain(GetPlacementGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:proximity/getPlacementGroup:getPlacementGroup", TypeShape.of(GetPlacementGroupResult.class), args, Utilities.withVersion(options));
    }
}