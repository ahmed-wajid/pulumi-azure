// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages the Defender for Storage.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "westus2"});
 * const exampleAccount = new azure.storage.Account("exampleAccount", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const exampleStorageDefender = new azure.securitycenter.StorageDefender("exampleStorageDefender", {storageAccountId: exampleAccount.id});
 * ```
 *
 * ## Import
 *
 * The setting can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:securitycenter/storageDefender:StorageDefender example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Storage/storageAccounts/storageacc
 * ```
 */
export class StorageDefender extends pulumi.CustomResource {
    /**
     * Get an existing StorageDefender resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StorageDefenderState, opts?: pulumi.CustomResourceOptions): StorageDefender {
        return new StorageDefender(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:securitycenter/storageDefender:StorageDefender';

    /**
     * Returns true if the given object is an instance of StorageDefender.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StorageDefender {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StorageDefender.__pulumiType;
    }

    /**
     * The max GB to be scanned per Month. Must be `-1` or above `0`. Omit this property or set to `-1` if no capping is needed. Defaults to `-1`.
     */
    public readonly malwareScanningOnUploadCapGbPerMonth!: pulumi.Output<number | undefined>;
    /**
     * Whether On Upload malware scanning should be enabled. Defaults to `false`.
     */
    public readonly malwareScanningOnUploadEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Whether the settings defined for this storage account should override the settings defined for the subscription. Defaults to `false`.
     */
    public readonly overrideSubscriptionSettingsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Whether Sensitive Data Discovery should be enabled. Defaults to `false`.
     */
    public readonly sensitiveDataDiscoveryEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the storage account the defender applied to. Changing this forces a new resource to be created.
     */
    public readonly storageAccountId!: pulumi.Output<string>;

    /**
     * Create a StorageDefender resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StorageDefenderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StorageDefenderArgs | StorageDefenderState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StorageDefenderState | undefined;
            resourceInputs["malwareScanningOnUploadCapGbPerMonth"] = state ? state.malwareScanningOnUploadCapGbPerMonth : undefined;
            resourceInputs["malwareScanningOnUploadEnabled"] = state ? state.malwareScanningOnUploadEnabled : undefined;
            resourceInputs["overrideSubscriptionSettingsEnabled"] = state ? state.overrideSubscriptionSettingsEnabled : undefined;
            resourceInputs["sensitiveDataDiscoveryEnabled"] = state ? state.sensitiveDataDiscoveryEnabled : undefined;
            resourceInputs["storageAccountId"] = state ? state.storageAccountId : undefined;
        } else {
            const args = argsOrState as StorageDefenderArgs | undefined;
            if ((!args || args.storageAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageAccountId'");
            }
            resourceInputs["malwareScanningOnUploadCapGbPerMonth"] = args ? args.malwareScanningOnUploadCapGbPerMonth : undefined;
            resourceInputs["malwareScanningOnUploadEnabled"] = args ? args.malwareScanningOnUploadEnabled : undefined;
            resourceInputs["overrideSubscriptionSettingsEnabled"] = args ? args.overrideSubscriptionSettingsEnabled : undefined;
            resourceInputs["sensitiveDataDiscoveryEnabled"] = args ? args.sensitiveDataDiscoveryEnabled : undefined;
            resourceInputs["storageAccountId"] = args ? args.storageAccountId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StorageDefender.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StorageDefender resources.
 */
export interface StorageDefenderState {
    /**
     * The max GB to be scanned per Month. Must be `-1` or above `0`. Omit this property or set to `-1` if no capping is needed. Defaults to `-1`.
     */
    malwareScanningOnUploadCapGbPerMonth?: pulumi.Input<number>;
    /**
     * Whether On Upload malware scanning should be enabled. Defaults to `false`.
     */
    malwareScanningOnUploadEnabled?: pulumi.Input<boolean>;
    /**
     * Whether the settings defined for this storage account should override the settings defined for the subscription. Defaults to `false`.
     */
    overrideSubscriptionSettingsEnabled?: pulumi.Input<boolean>;
    /**
     * Whether Sensitive Data Discovery should be enabled. Defaults to `false`.
     */
    sensitiveDataDiscoveryEnabled?: pulumi.Input<boolean>;
    /**
     * The ID of the storage account the defender applied to. Changing this forces a new resource to be created.
     */
    storageAccountId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StorageDefender resource.
 */
export interface StorageDefenderArgs {
    /**
     * The max GB to be scanned per Month. Must be `-1` or above `0`. Omit this property or set to `-1` if no capping is needed. Defaults to `-1`.
     */
    malwareScanningOnUploadCapGbPerMonth?: pulumi.Input<number>;
    /**
     * Whether On Upload malware scanning should be enabled. Defaults to `false`.
     */
    malwareScanningOnUploadEnabled?: pulumi.Input<boolean>;
    /**
     * Whether the settings defined for this storage account should override the settings defined for the subscription. Defaults to `false`.
     */
    overrideSubscriptionSettingsEnabled?: pulumi.Input<boolean>;
    /**
     * Whether Sensitive Data Discovery should be enabled. Defaults to `false`.
     */
    sensitiveDataDiscoveryEnabled?: pulumi.Input<boolean>;
    /**
     * The ID of the storage account the defender applied to. Changing this forces a new resource to be created.
     */
    storageAccountId: pulumi.Input<string>;
}