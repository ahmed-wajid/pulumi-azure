// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dashboard

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Grafana Dashboard.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/dashboard"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := dashboard.LookupGrafana(ctx, &dashboard.LookupGrafanaArgs{
//				Name:              "example-grafana-dashboard",
//				ResourceGroupName: "example-rg",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("name", example.Name)
//			return nil
//		})
//	}
//
// ```
func LookupGrafana(ctx *pulumi.Context, args *LookupGrafanaArgs, opts ...pulumi.InvokeOption) (*LookupGrafanaResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGrafanaResult
	err := ctx.Invoke("azure:dashboard/getGrafana:getGrafana", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGrafana.
type LookupGrafanaArgs struct {
	// The managed identity of the grafana resource.
	Identity *GetGrafanaIdentity `pulumi:"identity"`
	// Name of the grafana dashboard.
	Name string `pulumi:"name"`
	// Name of the resource group where resource belongs to.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getGrafana.
type LookupGrafanaResult struct {
	// Whether the api key setting of the Grafana instance is enabled.
	ApiKeyEnabled bool `pulumi:"apiKeyEnabled"`
	// Scope for dns deterministic name hash calculation.
	AutoGeneratedDomainNameLabelScope string `pulumi:"autoGeneratedDomainNameLabelScope"`
	// Integrations for Azure Monitor Workspace.
	AzureMonitorWorkspaceIntegrations []GetGrafanaAzureMonitorWorkspaceIntegration `pulumi:"azureMonitorWorkspaceIntegrations"`
	// Whether the Grafana instance uses deterministic outbound IPs.
	DeterministicOutboundIpEnabled bool `pulumi:"deterministicOutboundIpEnabled"`
	// The endpoint of the Grafana instance.
	Endpoint string `pulumi:"endpoint"`
	// Major version of Grafana instance.
	GrafanaMajorVersion string `pulumi:"grafanaMajorVersion"`
	// The full Grafana software semantic version deployed.
	GrafanaVersion string `pulumi:"grafanaVersion"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The managed identity of the grafana resource.
	Identity *GetGrafanaIdentity `pulumi:"identity"`
	// Azure location where the resource exists.
	Location    string   `pulumi:"location"`
	Name        string   `pulumi:"name"`
	OutboundIps []string `pulumi:"outboundIps"`
	// Whether or not public endpoint access is allowed for this server.
	PublicNetworkAccessEnabled bool   `pulumi:"publicNetworkAccessEnabled"`
	ResourceGroupName          string `pulumi:"resourceGroupName"`
	// The name of the SKU used for the Grafana instance.
	Sku string `pulumi:"sku"`
	// A mapping of tags to assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The zone redundancy setting of the Grafana instance.
	ZoneRedundancyEnabled bool `pulumi:"zoneRedundancyEnabled"`
}

func LookupGrafanaOutput(ctx *pulumi.Context, args LookupGrafanaOutputArgs, opts ...pulumi.InvokeOption) LookupGrafanaResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGrafanaResult, error) {
			args := v.(LookupGrafanaArgs)
			r, err := LookupGrafana(ctx, &args, opts...)
			var s LookupGrafanaResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupGrafanaResultOutput)
}

// A collection of arguments for invoking getGrafana.
type LookupGrafanaOutputArgs struct {
	// The managed identity of the grafana resource.
	Identity GetGrafanaIdentityPtrInput `pulumi:"identity"`
	// Name of the grafana dashboard.
	Name pulumi.StringInput `pulumi:"name"`
	// Name of the resource group where resource belongs to.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupGrafanaOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGrafanaArgs)(nil)).Elem()
}

// A collection of values returned by getGrafana.
type LookupGrafanaResultOutput struct{ *pulumi.OutputState }

func (LookupGrafanaResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGrafanaResult)(nil)).Elem()
}

func (o LookupGrafanaResultOutput) ToLookupGrafanaResultOutput() LookupGrafanaResultOutput {
	return o
}

func (o LookupGrafanaResultOutput) ToLookupGrafanaResultOutputWithContext(ctx context.Context) LookupGrafanaResultOutput {
	return o
}

// Whether the api key setting of the Grafana instance is enabled.
func (o LookupGrafanaResultOutput) ApiKeyEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupGrafanaResult) bool { return v.ApiKeyEnabled }).(pulumi.BoolOutput)
}

// Scope for dns deterministic name hash calculation.
func (o LookupGrafanaResultOutput) AutoGeneratedDomainNameLabelScope() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGrafanaResult) string { return v.AutoGeneratedDomainNameLabelScope }).(pulumi.StringOutput)
}

// Integrations for Azure Monitor Workspace.
func (o LookupGrafanaResultOutput) AzureMonitorWorkspaceIntegrations() GetGrafanaAzureMonitorWorkspaceIntegrationArrayOutput {
	return o.ApplyT(func(v LookupGrafanaResult) []GetGrafanaAzureMonitorWorkspaceIntegration {
		return v.AzureMonitorWorkspaceIntegrations
	}).(GetGrafanaAzureMonitorWorkspaceIntegrationArrayOutput)
}

// Whether the Grafana instance uses deterministic outbound IPs.
func (o LookupGrafanaResultOutput) DeterministicOutboundIpEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupGrafanaResult) bool { return v.DeterministicOutboundIpEnabled }).(pulumi.BoolOutput)
}

// The endpoint of the Grafana instance.
func (o LookupGrafanaResultOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGrafanaResult) string { return v.Endpoint }).(pulumi.StringOutput)
}

// Major version of Grafana instance.
func (o LookupGrafanaResultOutput) GrafanaMajorVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGrafanaResult) string { return v.GrafanaMajorVersion }).(pulumi.StringOutput)
}

// The full Grafana software semantic version deployed.
func (o LookupGrafanaResultOutput) GrafanaVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGrafanaResult) string { return v.GrafanaVersion }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGrafanaResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGrafanaResult) string { return v.Id }).(pulumi.StringOutput)
}

// The managed identity of the grafana resource.
func (o LookupGrafanaResultOutput) Identity() GetGrafanaIdentityPtrOutput {
	return o.ApplyT(func(v LookupGrafanaResult) *GetGrafanaIdentity { return v.Identity }).(GetGrafanaIdentityPtrOutput)
}

// Azure location where the resource exists.
func (o LookupGrafanaResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGrafanaResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupGrafanaResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGrafanaResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupGrafanaResultOutput) OutboundIps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGrafanaResult) []string { return v.OutboundIps }).(pulumi.StringArrayOutput)
}

// Whether or not public endpoint access is allowed for this server.
func (o LookupGrafanaResultOutput) PublicNetworkAccessEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupGrafanaResult) bool { return v.PublicNetworkAccessEnabled }).(pulumi.BoolOutput)
}

func (o LookupGrafanaResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGrafanaResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The name of the SKU used for the Grafana instance.
func (o LookupGrafanaResultOutput) Sku() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGrafanaResult) string { return v.Sku }).(pulumi.StringOutput)
}

// A mapping of tags to assigned to the resource.
func (o LookupGrafanaResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupGrafanaResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// The zone redundancy setting of the Grafana instance.
func (o LookupGrafanaResultOutput) ZoneRedundancyEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupGrafanaResult) bool { return v.ZoneRedundancyEnabled }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGrafanaResultOutput{})
}