// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.privatedns.getARecord({
 *     name: "test",
 *     zoneName: "test-zone",
 *     resourceGroupName: "test-rg",
 * });
 * export const privateDnsARecordId = example.then(example => example.id);
 * ```
 */
export function getARecord(args: GetARecordArgs, opts?: pulumi.InvokeOptions): Promise<GetARecordResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("azure:privatedns/getARecord:getARecord", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "zoneName": args.zoneName,
    }, opts);
}

/**
 * A collection of arguments for invoking getARecord.
 */
export interface GetARecordArgs {
    /**
     * The name of the Private DNS A Record.
     */
    name: string;
    /**
     * Specifies the resource group where the Private DNS Zone (parent resource) exists.
     */
    resourceGroupName: string;
    /**
     * Specifies the Private DNS Zone where the resource exists.
     */
    zoneName: string;
}

/**
 * A collection of values returned by getARecord.
 */
export interface GetARecordResult {
    /**
     * The FQDN of the Private DNS A Record.
     */
    readonly fqdn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * List of IPv4 Addresses.
     */
    readonly records: string[];
    readonly resourceGroupName: string;
    /**
     * A mapping of tags assigned to the Private DNS A Record.
     */
    readonly tags: {[key: string]: string};
    /**
     * The Time To Live (TTL) of the Private DNS record in seconds.
     */
    readonly ttl: number;
    readonly zoneName: string;
}

export function getARecordOutput(args: GetARecordOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetARecordResult> {
    return pulumi.output(args).apply(a => getARecord(a, opts))
}

/**
 * A collection of arguments for invoking getARecord.
 */
export interface GetARecordOutputArgs {
    /**
     * The name of the Private DNS A Record.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the resource group where the Private DNS Zone (parent resource) exists.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Specifies the Private DNS Zone where the resource exists.
     */
    zoneName: pulumi.Input<string>;
}