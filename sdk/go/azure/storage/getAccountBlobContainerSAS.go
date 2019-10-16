// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to obtain a Shared Access Signature (SAS Token) for an existing Storage Account Blob Container.
// 
// Shared access signatures allow fine-grained, ephemeral access control to various aspects of an Azure Storage Account Blob Container.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/d/storage_account_blob_container_sas.html.markdown.
func LookupAccountBlobContainerSAS(ctx *pulumi.Context, args *GetAccountBlobContainerSASArgs) (*GetAccountBlobContainerSASResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["cacheControl"] = args.CacheControl
		inputs["connectionString"] = args.ConnectionString
		inputs["containerName"] = args.ContainerName
		inputs["contentDisposition"] = args.ContentDisposition
		inputs["contentEncoding"] = args.ContentEncoding
		inputs["contentLanguage"] = args.ContentLanguage
		inputs["contentType"] = args.ContentType
		inputs["expiry"] = args.Expiry
		inputs["httpsOnly"] = args.HttpsOnly
		inputs["ipAddress"] = args.IpAddress
		inputs["permissions"] = args.Permissions
		inputs["start"] = args.Start
	}
	outputs, err := ctx.Invoke("azure:storage/getAccountBlobContainerSAS:getAccountBlobContainerSAS", inputs)
	if err != nil {
		return nil, err
	}
	return &GetAccountBlobContainerSASResult{
		CacheControl: outputs["cacheControl"],
		ConnectionString: outputs["connectionString"],
		ContainerName: outputs["containerName"],
		ContentDisposition: outputs["contentDisposition"],
		ContentEncoding: outputs["contentEncoding"],
		ContentLanguage: outputs["contentLanguage"],
		ContentType: outputs["contentType"],
		Expiry: outputs["expiry"],
		HttpsOnly: outputs["httpsOnly"],
		IpAddress: outputs["ipAddress"],
		Permissions: outputs["permissions"],
		Sas: outputs["sas"],
		Start: outputs["start"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getAccountBlobContainerSAS.
type GetAccountBlobContainerSASArgs struct {
	// The `Cache-Control` response header that is sent when this SAS token is used.
	CacheControl interface{}
	ConnectionString interface{}
	// Name of the container.
	ContainerName interface{}
	// The `Content-Disposition` response header that is sent when this SAS token is used.
	ContentDisposition interface{}
	// The `Content-Encoding` response header that is sent when this SAS token is used.
	ContentEncoding interface{}
	// The `Content-Language` response header that is sent when this SAS token is used.
	ContentLanguage interface{}
	// The `Content-Type` response header that is sent when this SAS token is used.
	ContentType interface{}
	// The expiration time and date of this SAS. Must be a valid ISO-8601 format time/date string.
	Expiry interface{}
	// Only permit `https` access. If `false`, both `http` and `https` are permitted. Defaults to `true`.
	HttpsOnly interface{}
	// Single ipv4 address or range (connected with a dash) of ipv4 addresses.
	IpAddress interface{}
	// A `permissions` block as defined below.
	Permissions interface{}
	// The starting time and date of validity of this SAS. Must be a valid ISO-8601 format time/date string.
	Start interface{}
}

// A collection of values returned by getAccountBlobContainerSAS.
type GetAccountBlobContainerSASResult struct {
	CacheControl interface{}
	ConnectionString interface{}
	ContainerName interface{}
	ContentDisposition interface{}
	ContentEncoding interface{}
	ContentLanguage interface{}
	ContentType interface{}
	Expiry interface{}
	HttpsOnly interface{}
	IpAddress interface{}
	Permissions interface{}
	// The computed Blob Container Shared Access Signature (SAS).
	Sas interface{}
	Start interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}