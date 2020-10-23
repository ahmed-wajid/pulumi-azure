// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Service Fabric Mesh Application.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleMeshApplication = new azure.servicefabric.MeshApplication("exampleMeshApplication", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     services: [{
 *         name: "testservice1",
 *         osType: "Linux",
 *         codePackages: [{
 *             name: "testcodepackage1",
 *             imageName: "seabreeze/sbz-helloworld:1.0-alpine",
 *             resources: {
 *                 requests: {
 *                     memory: 1,
 *                     cpu: 1,
 *                 },
 *             },
 *         }],
 *     }],
 * });
 * ```
 */
export class MeshApplication extends pulumi.CustomResource {
    /**
     * Get an existing MeshApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MeshApplicationState, opts?: pulumi.CustomResourceOptions): MeshApplication {
        return new MeshApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:servicefabric/meshApplication:MeshApplication';

    /**
     * Returns true if the given object is an instance of MeshApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MeshApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MeshApplication.__pulumiType;
    }

    /**
     * Specifies the Azure Region where the Service Fabric Mesh Application should exist. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name of the Service Fabric Mesh Application. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Resource Group in which the Service Fabric Mesh Application exists. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Any number of `service` block as defined below.
     */
    public readonly services!: pulumi.Output<outputs.servicefabric.MeshApplicationService[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a MeshApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MeshApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MeshApplicationArgs | MeshApplicationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as MeshApplicationState | undefined;
            inputs["location"] = state ? state.location : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            inputs["services"] = state ? state.services : undefined;
            inputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as MeshApplicationArgs | undefined;
            if (!args || args.resourceGroupName === undefined) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if (!args || args.services === undefined) {
                throw new Error("Missing required property 'services'");
            }
            inputs["location"] = args ? args.location : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            inputs["services"] = args ? args.services : undefined;
            inputs["tags"] = args ? args.tags : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(MeshApplication.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MeshApplication resources.
 */
export interface MeshApplicationState {
    /**
     * Specifies the Azure Region where the Service Fabric Mesh Application should exist. Changing this forces a new resource to be created.
     */
    readonly location?: pulumi.Input<string>;
    /**
     * The name of the Service Fabric Mesh Application. Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group in which the Service Fabric Mesh Application exists. Changing this forces a new resource to be created.
     */
    readonly resourceGroupName?: pulumi.Input<string>;
    /**
     * Any number of `service` block as defined below.
     */
    readonly services?: pulumi.Input<pulumi.Input<inputs.servicefabric.MeshApplicationService>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a MeshApplication resource.
 */
export interface MeshApplicationArgs {
    /**
     * Specifies the Azure Region where the Service Fabric Mesh Application should exist. Changing this forces a new resource to be created.
     */
    readonly location?: pulumi.Input<string>;
    /**
     * The name of the Service Fabric Mesh Application. Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group in which the Service Fabric Mesh Application exists. Changing this forces a new resource to be created.
     */
    readonly resourceGroupName: pulumi.Input<string>;
    /**
     * Any number of `service` block as defined below.
     */
    readonly services: pulumi.Input<pulumi.Input<inputs.servicefabric.MeshApplicationService>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}