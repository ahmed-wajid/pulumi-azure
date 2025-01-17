// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nginx

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Nginx Certificate.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/nginx"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := nginx.LookupCertificate(ctx, &nginx.LookupCertificateArgs{
//				Name:              "existing",
//				NginxDeploymentId: azurerm_nginx_deployment.Example.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", example.Id)
//			return nil
//		})
//	}
//
// ```
func LookupCertificate(ctx *pulumi.Context, args *LookupCertificateArgs, opts ...pulumi.InvokeOption) (*LookupCertificateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCertificateResult
	err := ctx.Invoke("azure:nginx/getCertificate:getCertificate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCertificate.
type LookupCertificateArgs struct {
	// The name of this Nginx Certificate.
	Name string `pulumi:"name"`
	// The ID of the Nginx Deployment that this certificate is associated with.
	NginxDeploymentId string `pulumi:"nginxDeploymentId"`
}

// A collection of values returned by getCertificate.
type LookupCertificateResult struct {
	// The path to the certificate file of this certificate.
	CertificateVirtualPath string `pulumi:"certificateVirtualPath"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The ID of the Key Vault Secret for this certificate.
	KeyVaultSecretId string `pulumi:"keyVaultSecretId"`
	// The path to the key file of this certificate.
	KeyVirtualPath    string `pulumi:"keyVirtualPath"`
	Name              string `pulumi:"name"`
	NginxDeploymentId string `pulumi:"nginxDeploymentId"`
}

func LookupCertificateOutput(ctx *pulumi.Context, args LookupCertificateOutputArgs, opts ...pulumi.InvokeOption) LookupCertificateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCertificateResult, error) {
			args := v.(LookupCertificateArgs)
			r, err := LookupCertificate(ctx, &args, opts...)
			var s LookupCertificateResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCertificateResultOutput)
}

// A collection of arguments for invoking getCertificate.
type LookupCertificateOutputArgs struct {
	// The name of this Nginx Certificate.
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the Nginx Deployment that this certificate is associated with.
	NginxDeploymentId pulumi.StringInput `pulumi:"nginxDeploymentId"`
}

func (LookupCertificateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCertificateArgs)(nil)).Elem()
}

// A collection of values returned by getCertificate.
type LookupCertificateResultOutput struct{ *pulumi.OutputState }

func (LookupCertificateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCertificateResult)(nil)).Elem()
}

func (o LookupCertificateResultOutput) ToLookupCertificateResultOutput() LookupCertificateResultOutput {
	return o
}

func (o LookupCertificateResultOutput) ToLookupCertificateResultOutputWithContext(ctx context.Context) LookupCertificateResultOutput {
	return o
}

// The path to the certificate file of this certificate.
func (o LookupCertificateResultOutput) CertificateVirtualPath() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.CertificateVirtualPath }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCertificateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Id }).(pulumi.StringOutput)
}

// The ID of the Key Vault Secret for this certificate.
func (o LookupCertificateResultOutput) KeyVaultSecretId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.KeyVaultSecretId }).(pulumi.StringOutput)
}

// The path to the key file of this certificate.
func (o LookupCertificateResultOutput) KeyVirtualPath() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.KeyVirtualPath }).(pulumi.StringOutput)
}

func (o LookupCertificateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupCertificateResultOutput) NginxDeploymentId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.NginxDeploymentId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCertificateResultOutput{})
}
