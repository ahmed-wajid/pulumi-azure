// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Grafana Dashboard.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.dashboard.getGrafana({
 *     name: "example-grafana-dashboard",
 *     resourceGroupName: "example-rg",
 * });
 * export const name = example.then(example => example.name);
 * ```
 */
export function getGrafana(args: GetGrafanaArgs, opts?: pulumi.InvokeOptions): Promise<GetGrafanaResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:dashboard/getGrafana:getGrafana", {
        "identity": args.identity,
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getGrafana.
 */
export interface GetGrafanaArgs {
    /**
     * The managed identity of the grafana resource.
     */
    identity?: inputs.dashboard.GetGrafanaIdentity;
    /**
     * Name of the grafana dashboard.
     */
    name: string;
    /**
     * Name of the resource group where resource belongs to.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getGrafana.
 */
export interface GetGrafanaResult {
    /**
     * Whether the api key setting of the Grafana instance is enabled.
     */
    readonly apiKeyEnabled: boolean;
    /**
     * Scope for dns deterministic name hash calculation.
     */
    readonly autoGeneratedDomainNameLabelScope: string;
    /**
     * Integrations for Azure Monitor Workspace.
     */
    readonly azureMonitorWorkspaceIntegrations: outputs.dashboard.GetGrafanaAzureMonitorWorkspaceIntegration[];
    /**
     * Whether the Grafana instance uses deterministic outbound IPs.
     */
    readonly deterministicOutboundIpEnabled: boolean;
    /**
     * The endpoint of the Grafana instance.
     */
    readonly endpoint: string;
    /**
     * Major version of Grafana instance.
     */
    readonly grafanaMajorVersion: string;
    /**
     * The full Grafana software semantic version deployed.
     */
    readonly grafanaVersion: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The managed identity of the grafana resource.
     */
    readonly identity?: outputs.dashboard.GetGrafanaIdentity;
    /**
     * Azure location where the resource exists.
     */
    readonly location: string;
    readonly name: string;
    readonly outboundIps: string[];
    /**
     * Whether or not public endpoint access is allowed for this server.
     */
    readonly publicNetworkAccessEnabled: boolean;
    readonly resourceGroupName: string;
    /**
     * The name of the SKU used for the Grafana instance.
     */
    readonly sku: string;
    /**
     * A mapping of tags to assigned to the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * The zone redundancy setting of the Grafana instance.
     */
    readonly zoneRedundancyEnabled: boolean;
}
/**
 * Use this data source to access information about an existing Grafana Dashboard.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.dashboard.getGrafana({
 *     name: "example-grafana-dashboard",
 *     resourceGroupName: "example-rg",
 * });
 * export const name = example.then(example => example.name);
 * ```
 */
export function getGrafanaOutput(args: GetGrafanaOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGrafanaResult> {
    return pulumi.output(args).apply((a: any) => getGrafana(a, opts))
}

/**
 * A collection of arguments for invoking getGrafana.
 */
export interface GetGrafanaOutputArgs {
    /**
     * The managed identity of the grafana resource.
     */
    identity?: pulumi.Input<inputs.dashboard.GetGrafanaIdentityArgs>;
    /**
     * Name of the grafana dashboard.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the resource group where resource belongs to.
     */
    resourceGroupName: pulumi.Input<string>;
}