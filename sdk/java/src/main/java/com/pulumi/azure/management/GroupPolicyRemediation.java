// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.management.GroupPolicyRemediationArgs;
import com.pulumi.azure.management.inputs.GroupPolicyRemediationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Management Group Policy Remediation.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.management.Group;
 * import com.pulumi.azure.management.GroupArgs;
 * import com.pulumi.azure.policy.PolicyFunctions;
 * import com.pulumi.azure.policy.inputs.GetPolicyDefintionArgs;
 * import com.pulumi.azure.management.GroupPolicyAssignment;
 * import com.pulumi.azure.management.GroupPolicyAssignmentArgs;
 * import com.pulumi.azure.management.GroupPolicyRemediation;
 * import com.pulumi.azure.management.GroupPolicyRemediationArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var exampleGroup = new Group(&#34;exampleGroup&#34;, GroupArgs.builder()        
 *             .displayName(&#34;Example Management Group&#34;)
 *             .build());
 * 
 *         final var examplePolicyDefintion = PolicyFunctions.getPolicyDefintion(GetPolicyDefintionArgs.builder()
 *             .displayName(&#34;Allowed locations&#34;)
 *             .build());
 * 
 *         var exampleGroupPolicyAssignment = new GroupPolicyAssignment(&#34;exampleGroupPolicyAssignment&#34;, GroupPolicyAssignmentArgs.builder()        
 *             .managementGroupId(exampleGroup.id())
 *             .policyDefinitionId(examplePolicyDefintion.applyValue(getPolicyDefintionResult -&gt; getPolicyDefintionResult.id()))
 *             .parameters(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;listOfAllowedLocations&#34;, jsonObject(
 *                         jsonProperty(&#34;value&#34;, jsonArray(&#34;East US&#34;))
 *                     ))
 *                 )))
 *             .build());
 * 
 *         var exampleGroupPolicyRemediation = new GroupPolicyRemediation(&#34;exampleGroupPolicyRemediation&#34;, GroupPolicyRemediationArgs.builder()        
 *             .managementGroupId(exampleGroup.id())
 *             .policyAssignmentId(exampleGroupPolicyAssignment.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Policy Remediations can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:management/groupPolicyRemediation:GroupPolicyRemediation example /providers/Microsoft.Management/managementGroups/my-mgmt-group-id/providers/Microsoft.PolicyInsights/remediations/remediation1
 * ```
 * 
 */
@ResourceType(type="azure:management/groupPolicyRemediation:GroupPolicyRemediation")
public class GroupPolicyRemediation extends com.pulumi.resources.CustomResource {
    /**
     * A number between 0.0 to 1.0 representing the percentage failure threshold. The remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this threshold.
     * 
     */
    @Export(name="failurePercentage", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> failurePercentage;

    /**
     * @return A number between 0.0 to 1.0 representing the percentage failure threshold. The remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this threshold.
     * 
     */
    public Output<Optional<Double>> failurePercentage() {
        return Codegen.optional(this.failurePercentage);
    }
    /**
     * A list of the resource locations that will be remediated.
     * 
     */
    @Export(name="locationFilters", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> locationFilters;

    /**
     * @return A list of the resource locations that will be remediated.
     * 
     */
    public Output<Optional<List<String>>> locationFilters() {
        return Codegen.optional(this.locationFilters);
    }
    /**
     * The Management Group ID at which the Policy Remediation should be applied. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="managementGroupId", refs={String.class}, tree="[0]")
    private Output<String> managementGroupId;

    /**
     * @return The Management Group ID at which the Policy Remediation should be applied. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }
    /**
     * The name of the Policy Remediation. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Policy Remediation. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Determines how many resources to remediate at any given time. Can be used to increase or reduce the pace of the remediation. If not provided, the default parallel deployments value is used.
     * 
     */
    @Export(name="parallelDeployments", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> parallelDeployments;

    /**
     * @return Determines how many resources to remediate at any given time. Can be used to increase or reduce the pace of the remediation. If not provided, the default parallel deployments value is used.
     * 
     */
    public Output<Optional<Integer>> parallelDeployments() {
        return Codegen.optional(this.parallelDeployments);
    }
    /**
     * The ID of the Policy Assignment that should be remediated.
     * 
     */
    @Export(name="policyAssignmentId", refs={String.class}, tree="[0]")
    private Output<String> policyAssignmentId;

    /**
     * @return The ID of the Policy Assignment that should be remediated.
     * 
     */
    public Output<String> policyAssignmentId() {
        return this.policyAssignmentId;
    }
    /**
     * The unique ID for the policy definition within the policy set definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     * &gt; **Note:** This property has been deprecated and will be removed in version 4.0 of the provider in favour of `policy_definition_reference_id`.
     * 
     * @deprecated
     * `policy_definition_id` will be removed in version 4.0 of the AzureRM Provider in favour of `policy_definition_reference_id`.
     * 
     */
    @Deprecated /* `policy_definition_id` will be removed in version 4.0 of the AzureRM Provider in favour of `policy_definition_reference_id`. */
    @Export(name="policyDefinitionId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policyDefinitionId;

    /**
     * @return The unique ID for the policy definition within the policy set definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     * &gt; **Note:** This property has been deprecated and will be removed in version 4.0 of the provider in favour of `policy_definition_reference_id`.
     * 
     */
    public Output<Optional<String>> policyDefinitionId() {
        return Codegen.optional(this.policyDefinitionId);
    }
    /**
     * The unique ID for the policy definition reference within the policy set definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    @Export(name="policyDefinitionReferenceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policyDefinitionReferenceId;

    /**
     * @return The unique ID for the policy definition reference within the policy set definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    public Output<Optional<String>> policyDefinitionReferenceId() {
        return Codegen.optional(this.policyDefinitionReferenceId);
    }
    /**
     * Determines the max number of resources that can be remediated by the remediation job. If not provided, the default resource count is used.
     * 
     */
    @Export(name="resourceCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> resourceCount;

    /**
     * @return Determines the max number of resources that can be remediated by the remediation job. If not provided, the default resource count is used.
     * 
     */
    public Output<Optional<Integer>> resourceCount() {
        return Codegen.optional(this.resourceCount);
    }
    /**
     * The way that resources to remediate are discovered. Possible values are `ExistingNonCompliant`, `ReEvaluateCompliance`. Defaults to `ExistingNonCompliant`.
     * 
     * &gt; **Note:** This property has been deprecated and will be removed in version 4.0 of the provider as evaluating compliance before remediation is only supported at subscription scope and below.
     * 
     * @deprecated
     * `resource_discovery_mode` will be removed in version 4.0 of the AzureRM Provider as evaluating compliance before remediation is only supported at subscription scope and below.
     * 
     */
    @Deprecated /* `resource_discovery_mode` will be removed in version 4.0 of the AzureRM Provider as evaluating compliance before remediation is only supported at subscription scope and below. */
    @Export(name="resourceDiscoveryMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resourceDiscoveryMode;

    /**
     * @return The way that resources to remediate are discovered. Possible values are `ExistingNonCompliant`, `ReEvaluateCompliance`. Defaults to `ExistingNonCompliant`.
     * 
     * &gt; **Note:** This property has been deprecated and will be removed in version 4.0 of the provider as evaluating compliance before remediation is only supported at subscription scope and below.
     * 
     */
    public Output<Optional<String>> resourceDiscoveryMode() {
        return Codegen.optional(this.resourceDiscoveryMode);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupPolicyRemediation(String name) {
        this(name, GroupPolicyRemediationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupPolicyRemediation(String name, GroupPolicyRemediationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupPolicyRemediation(String name, GroupPolicyRemediationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:management/groupPolicyRemediation:GroupPolicyRemediation", name, args == null ? GroupPolicyRemediationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupPolicyRemediation(String name, Output<String> id, @Nullable GroupPolicyRemediationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:management/groupPolicyRemediation:GroupPolicyRemediation", name, state, makeResourceOptions(options, id));
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
    public static GroupPolicyRemediation get(String name, Output<String> id, @Nullable GroupPolicyRemediationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupPolicyRemediation(name, id, state, options);
    }
}
