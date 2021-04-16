// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Use this data source to access data stored in an existing Key Vault Certificate.
 *
 * > **Note:** This data source uses the `GetSecret` function of the Azure API, to get the key of the certificate. Therefore you need secret/get permission
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleKeyVault = azure.keyvault.getKeyVault({
 *     name: "examplekv",
 *     resourceGroupName: "some-resource-group",
 * });
 * const exampleCertificateData = exampleKeyVault.then(exampleKeyVault => azure.keyvault.getCertificateData({
 *     name: "secret-sauce",
 *     keyVaultId: exampleKeyVault.id,
 * }));
 * export const examplePem = exampleCertificateData.then(exampleCertificateData => exampleCertificateData.pem);
 * ```
 */
export function getCertificateData(args: GetCertificateDataArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificateDataResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("azure:keyvault/getCertificateData:getCertificateData", {
        "keyVaultId": args.keyVaultId,
        "name": args.name,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificateData.
 */
export interface GetCertificateDataArgs {
    /**
     * Specifies the ID of the Key Vault instance where the Secret resides, available on the `azure.keyvault.KeyVault` Data Source / Resource.
     */
    readonly keyVaultId: string;
    /**
     * Specifies the name of the Key Vault Secret.
     */
    readonly name: string;
    /**
     * Specifies the version of the certificate to look up.  (Defaults to latest)
     */
    readonly version?: string;
}

/**
 * A collection of values returned by getCertificateData.
 */
export interface GetCertificateDataResult {
    /**
     * Expiry date of certificate in RFC3339 format.
     */
    readonly expires: string;
    /**
     * The raw Key Vault Certificate data represented as a hexadecimal string.
     */
    readonly hex: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Key Vault Certificate Key.
     */
    readonly key: string;
    readonly keyVaultId: string;
    readonly name: string;
    /**
     * The Key Vault Certificate in PEM format.
     */
    readonly pem: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags: {[key: string]: string};
    readonly version: string;
}