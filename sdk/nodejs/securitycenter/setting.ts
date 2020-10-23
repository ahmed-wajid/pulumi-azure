// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages the Data Access Settings for Azure Security Center.
 *
 * > **NOTE:** This resource requires the `Owner` permission on the Subscription.
 *
 * > **NOTE:** Deletion of this resource does not change or reset the data access settings
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.securitycenter.Setting("example", {
 *     enabled: true,
 *     settingName: "MCAS",
 * });
 * ```
 */
export class Setting extends pulumi.CustomResource {
    /**
     * Get an existing Setting resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SettingState, opts?: pulumi.CustomResourceOptions): Setting {
        return new Setting(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:securitycenter/setting:Setting';

    /**
     * Returns true if the given object is an instance of Setting.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Setting {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Setting.__pulumiType;
    }

    /**
     * Boolean flag to enable/disable data access.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The setting to manage. Possible values are `MCAS` and `WDATP`.
     */
    public readonly settingName!: pulumi.Output<string>;

    /**
     * Create a Setting resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SettingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SettingArgs | SettingState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as SettingState | undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["settingName"] = state ? state.settingName : undefined;
        } else {
            const args = argsOrState as SettingArgs | undefined;
            if (!args || args.enabled === undefined) {
                throw new Error("Missing required property 'enabled'");
            }
            if (!args || args.settingName === undefined) {
                throw new Error("Missing required property 'settingName'");
            }
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["settingName"] = args ? args.settingName : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Setting.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Setting resources.
 */
export interface SettingState {
    /**
     * Boolean flag to enable/disable data access.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * The setting to manage. Possible values are `MCAS` and `WDATP`.
     */
    readonly settingName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Setting resource.
 */
export interface SettingArgs {
    /**
     * Boolean flag to enable/disable data access.
     */
    readonly enabled: pulumi.Input<boolean>;
    /**
     * The setting to manage. Possible values are `MCAS` and `WDATP`.
     */
    readonly settingName: pulumi.Input<string>;
}