// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Nginx Deployment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.nginx.getDeployment({
 *     name: "existing",
 *     resourceGroupName: "existing",
 * });
 * export const id = example.then(example => example.id);
 * ```
 */
export function getDeployment(args: GetDeploymentArgs, opts?: pulumi.InvokeOptions): Promise<GetDeploymentResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:nginx/getDeployment:getDeployment", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getDeployment.
 */
export interface GetDeploymentArgs {
    /**
     * The name of this Nginx Deployment.
     */
    name: string;
    /**
     * The name of the Resource Group where the Nginx Deployment exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getDeployment.
 */
export interface GetDeploymentResult {
    /**
     * The number of NGINX capacity units for this Nginx Deployment.
     */
    readonly capacity: number;
    /**
     * Whether diagnostic settings are enabled.
     */
    readonly diagnoseSupportEnabled: boolean;
    /**
     * Preferred email associated with the Nginx Deployment.
     */
    readonly email: string;
    /**
     * A `frontendPrivate` block as defined below.
     */
    readonly frontendPrivates: outputs.nginx.GetDeploymentFrontendPrivate[];
    /**
     * A `frontendPublic` block as defined below.
     */
    readonly frontendPublics: outputs.nginx.GetDeploymentFrontendPublic[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A `identity` block as defined below.
     */
    readonly identities: outputs.nginx.GetDeploymentIdentity[];
    /**
     * List of public IPs of the Ngix Deployment.
     */
    readonly ipAddress: string;
    /**
     * The Azure Region where the Nginx Deployment exists.
     */
    readonly location: string;
    /**
     * A `loggingStorageAccount` block as defined below.
     */
    readonly loggingStorageAccounts: outputs.nginx.GetDeploymentLoggingStorageAccount[];
    /**
     * Auto-generated managed resource group for the Nginx Deployment.
     */
    readonly managedResourceGroup: string;
    /**
     * The account name of the StorageAccount for logging.
     */
    readonly name: string;
    /**
     * A `networkInterface` block as defined below.
     */
    readonly networkInterfaces: outputs.nginx.GetDeploymentNetworkInterface[];
    /**
     * NGINX version of the Nginx Deployment.
     */
    readonly nginxVersion: string;
    readonly resourceGroupName: string;
    /**
     * Name of the SKU for this Nginx Deployment.
     */
    readonly sku: string;
    /**
     * A mapping of tags assigned to the Nginx Deployment.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Use this data source to access information about an existing Nginx Deployment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.nginx.getDeployment({
 *     name: "existing",
 *     resourceGroupName: "existing",
 * });
 * export const id = example.then(example => example.id);
 * ```
 */
export function getDeploymentOutput(args: GetDeploymentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDeploymentResult> {
    return pulumi.output(args).apply((a: any) => getDeployment(a, opts))
}

/**
 * A collection of arguments for invoking getDeployment.
 */
export interface GetDeploymentOutputArgs {
    /**
     * The name of this Nginx Deployment.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Nginx Deployment exists.
     */
    resourceGroupName: pulumi.Input<string>;
}