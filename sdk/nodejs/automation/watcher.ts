// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an Automation Wacher.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.automation.Watcher("example", {
 *     automationAccountId: azurerm_automation_account.test.id,
 *     location: "West Europe",
 *     scriptName: azurerm_automation_runbook.test.name,
 *     scriptRunOn: azurerm_automation_hybrid_runbook_worker_group.test.name,
 *     description: "example-watcher desc",
 *     executionFrequencyInSeconds: 42,
 *     tags: {
 *         foo: "bar",
 *     },
 *     scriptParameters: {
 *         foo: "bar",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Automation Watchers can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:automation/watcher:Watcher example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/watchers/watch1
 * ```
 */
export class Watcher extends pulumi.CustomResource {
    /**
     * Get an existing Watcher resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WatcherState, opts?: pulumi.CustomResourceOptions): Watcher {
        return new Watcher(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:automation/watcher:Watcher';

    /**
     * Returns true if the given object is an instance of Watcher.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Watcher {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Watcher.__pulumiType;
    }

    /**
     * The ID of Automation Account to manage this Watcher. Changing this forces a new Watcher to be created.
     */
    public readonly automationAccountId!: pulumi.Output<string>;
    /**
     * A description of this Automation Watcher.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A string of etag assigned to this Automation Watcher.
     */
    public readonly etag!: pulumi.Output<string | undefined>;
    /**
     * Specify the frequency at which the watcher is invoked.
     */
    public readonly executionFrequencyInSeconds!: pulumi.Output<number>;
    /**
     * The Azure Region where the Automation Watcher should exist. Changing this forces a new Automation Watcher to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name which should be used for this Automation Watcher. Changing this forces a new Automation Watcher to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specify the name of an existing runbook this watcher is attached to. Changing this forces a new Automation to be created.
     */
    public readonly scriptName!: pulumi.Output<string>;
    /**
     * Specifies a list of key-vaule parameters. Changing this forces a new Automation watcher to be created.
     */
    public readonly scriptParameters!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Specify the name of the Hybrid work group the watcher will run on.
     */
    public readonly scriptRunOn!: pulumi.Output<string>;
    /**
     * The current status of the Automation Watcher.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Automation Watcher.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a Watcher resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WatcherArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WatcherArgs | WatcherState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WatcherState | undefined;
            resourceInputs["automationAccountId"] = state ? state.automationAccountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["executionFrequencyInSeconds"] = state ? state.executionFrequencyInSeconds : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["scriptName"] = state ? state.scriptName : undefined;
            resourceInputs["scriptParameters"] = state ? state.scriptParameters : undefined;
            resourceInputs["scriptRunOn"] = state ? state.scriptRunOn : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as WatcherArgs | undefined;
            if ((!args || args.automationAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'automationAccountId'");
            }
            if ((!args || args.executionFrequencyInSeconds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'executionFrequencyInSeconds'");
            }
            if ((!args || args.scriptName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scriptName'");
            }
            if ((!args || args.scriptRunOn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scriptRunOn'");
            }
            resourceInputs["automationAccountId"] = args ? args.automationAccountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["etag"] = args ? args.etag : undefined;
            resourceInputs["executionFrequencyInSeconds"] = args ? args.executionFrequencyInSeconds : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["scriptName"] = args ? args.scriptName : undefined;
            resourceInputs["scriptParameters"] = args ? args.scriptParameters : undefined;
            resourceInputs["scriptRunOn"] = args ? args.scriptRunOn : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Watcher.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Watcher resources.
 */
export interface WatcherState {
    /**
     * The ID of Automation Account to manage this Watcher. Changing this forces a new Watcher to be created.
     */
    automationAccountId?: pulumi.Input<string>;
    /**
     * A description of this Automation Watcher.
     */
    description?: pulumi.Input<string>;
    /**
     * A string of etag assigned to this Automation Watcher.
     */
    etag?: pulumi.Input<string>;
    /**
     * Specify the frequency at which the watcher is invoked.
     */
    executionFrequencyInSeconds?: pulumi.Input<number>;
    /**
     * The Azure Region where the Automation Watcher should exist. Changing this forces a new Automation Watcher to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Automation Watcher. Changing this forces a new Automation Watcher to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specify the name of an existing runbook this watcher is attached to. Changing this forces a new Automation to be created.
     */
    scriptName?: pulumi.Input<string>;
    /**
     * Specifies a list of key-vaule parameters. Changing this forces a new Automation watcher to be created.
     */
    scriptParameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specify the name of the Hybrid work group the watcher will run on.
     */
    scriptRunOn?: pulumi.Input<string>;
    /**
     * The current status of the Automation Watcher.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Automation Watcher.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Watcher resource.
 */
export interface WatcherArgs {
    /**
     * The ID of Automation Account to manage this Watcher. Changing this forces a new Watcher to be created.
     */
    automationAccountId: pulumi.Input<string>;
    /**
     * A description of this Automation Watcher.
     */
    description?: pulumi.Input<string>;
    /**
     * A string of etag assigned to this Automation Watcher.
     */
    etag?: pulumi.Input<string>;
    /**
     * Specify the frequency at which the watcher is invoked.
     */
    executionFrequencyInSeconds: pulumi.Input<number>;
    /**
     * The Azure Region where the Automation Watcher should exist. Changing this forces a new Automation Watcher to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Automation Watcher. Changing this forces a new Automation Watcher to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specify the name of an existing runbook this watcher is attached to. Changing this forces a new Automation to be created.
     */
    scriptName: pulumi.Input<string>;
    /**
     * Specifies a list of key-vaule parameters. Changing this forces a new Automation watcher to be created.
     */
    scriptParameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specify the name of the Hybrid work group the watcher will run on.
     */
    scriptRunOn: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Automation Watcher.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}