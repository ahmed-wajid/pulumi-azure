// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Policy Set Definition.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 * 
 * const example = azure.policy.getPolicySetDefinition({
 *     displayName: "Policy Set Definition Example",
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/d/policy_set_definition.html.markdown.
 */
export function getPolicySetDefinition(args?: GetPolicySetDefinitionArgs, opts?: pulumi.InvokeOptions): Promise<GetPolicySetDefinitionResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("azure:policy/getPolicySetDefinition:getPolicySetDefinition", {
        "displayName": args.displayName,
        "managementGroupName": args.managementGroupName,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getPolicySetDefinition.
 */
export interface GetPolicySetDefinitionArgs {
    /**
     * Specifies the display name of the Policy Set Definition. Conflicts with `name`.
     */
    readonly displayName?: string;
    /**
     * Only retrieve Policy Set Definitions from this Management Group.
     */
    readonly managementGroupName?: string;
    /**
     * Specifies the name of the Policy Set Definition. Conflicts with `displayName`.
     */
    readonly name?: string;
}

/**
 * A collection of values returned by getPolicySetDefinition.
 */
export interface GetPolicySetDefinitionResult {
    /**
     * The Description of the Policy Set Definition.
     */
    readonly description: string;
    readonly displayName: string;
    readonly managementGroupName?: string;
    /**
     * Any Metadata defined in the Policy Set Definition.
     */
    readonly metadata: string;
    readonly name: string;
    /**
     * Any Parameters defined in the Policy Set Definition.
     */
    readonly parameters: string;
    /**
     * The policy definitions contained within the policy set definition.
     */
    readonly policyDefinitions: string;
    /**
     * The Type of the Policy Set Definition.
     */
    readonly policyType: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}