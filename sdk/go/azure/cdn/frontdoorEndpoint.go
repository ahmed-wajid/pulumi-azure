// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cdn

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a FrontDoor Endpoint.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/cdn"
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
// 			Location: pulumi.String("West Europe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleFrontdoorProfile, err := cdn.NewFrontdoorProfile(ctx, "exampleFrontdoorProfile", &cdn.FrontdoorProfileArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cdn.NewFrontdoorEndpoint(ctx, "exampleFrontdoorEndpoint", &cdn.FrontdoorEndpointArgs{
// 			CdnFrontdoorProfileId: exampleFrontdoorProfile.ID(),
// 			Tags: pulumi.StringMap{
// 				"ENV": pulumi.String("example"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// CDN FrontDoor Endpoints can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:cdn/frontdoorEndpoint:FrontdoorEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/afdEndpoints/endpoint1
// ```
type FrontdoorEndpoint struct {
	pulumi.CustomResourceState

	// The ID of the FrontDoor Profile within which this FrontDoor Endpoint should exist. Changing this forces a new CDN FrontDoor Endpoint to be created.
	CdnFrontdoorProfileId pulumi.StringOutput `pulumi:"cdnFrontdoorProfileId"`
	// Specifies if this CDN FrontDoor Endpoint is enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The host name of the CDN FrontDoor Endpoint, in the format `{endpointName}.{dnsZone}` (for example, `contoso.azureedge.net`).
	HostName pulumi.StringOutput `pulumi:"hostName"`
	// The name which should be used for this CDN FrontDoor Endpoint. Changing this forces a new CDN FrontDoor Endpoint to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies a mapping of tags which should be assigned to the CDN FrontDoor Endpoint.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewFrontdoorEndpoint registers a new resource with the given unique name, arguments, and options.
func NewFrontdoorEndpoint(ctx *pulumi.Context,
	name string, args *FrontdoorEndpointArgs, opts ...pulumi.ResourceOption) (*FrontdoorEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CdnFrontdoorProfileId == nil {
		return nil, errors.New("invalid value for required argument 'CdnFrontdoorProfileId'")
	}
	var resource FrontdoorEndpoint
	err := ctx.RegisterResource("azure:cdn/frontdoorEndpoint:FrontdoorEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFrontdoorEndpoint gets an existing FrontdoorEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFrontdoorEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FrontdoorEndpointState, opts ...pulumi.ResourceOption) (*FrontdoorEndpoint, error) {
	var resource FrontdoorEndpoint
	err := ctx.ReadResource("azure:cdn/frontdoorEndpoint:FrontdoorEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FrontdoorEndpoint resources.
type frontdoorEndpointState struct {
	// The ID of the FrontDoor Profile within which this FrontDoor Endpoint should exist. Changing this forces a new CDN FrontDoor Endpoint to be created.
	CdnFrontdoorProfileId *string `pulumi:"cdnFrontdoorProfileId"`
	// Specifies if this CDN FrontDoor Endpoint is enabled? Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The host name of the CDN FrontDoor Endpoint, in the format `{endpointName}.{dnsZone}` (for example, `contoso.azureedge.net`).
	HostName *string `pulumi:"hostName"`
	// The name which should be used for this CDN FrontDoor Endpoint. Changing this forces a new CDN FrontDoor Endpoint to be created.
	Name *string `pulumi:"name"`
	// Specifies a mapping of tags which should be assigned to the CDN FrontDoor Endpoint.
	Tags map[string]string `pulumi:"tags"`
}

type FrontdoorEndpointState struct {
	// The ID of the FrontDoor Profile within which this FrontDoor Endpoint should exist. Changing this forces a new CDN FrontDoor Endpoint to be created.
	CdnFrontdoorProfileId pulumi.StringPtrInput
	// Specifies if this CDN FrontDoor Endpoint is enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The host name of the CDN FrontDoor Endpoint, in the format `{endpointName}.{dnsZone}` (for example, `contoso.azureedge.net`).
	HostName pulumi.StringPtrInput
	// The name which should be used for this CDN FrontDoor Endpoint. Changing this forces a new CDN FrontDoor Endpoint to be created.
	Name pulumi.StringPtrInput
	// Specifies a mapping of tags which should be assigned to the CDN FrontDoor Endpoint.
	Tags pulumi.StringMapInput
}

func (FrontdoorEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*frontdoorEndpointState)(nil)).Elem()
}

type frontdoorEndpointArgs struct {
	// The ID of the FrontDoor Profile within which this FrontDoor Endpoint should exist. Changing this forces a new CDN FrontDoor Endpoint to be created.
	CdnFrontdoorProfileId string `pulumi:"cdnFrontdoorProfileId"`
	// Specifies if this CDN FrontDoor Endpoint is enabled? Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The name which should be used for this CDN FrontDoor Endpoint. Changing this forces a new CDN FrontDoor Endpoint to be created.
	Name *string `pulumi:"name"`
	// Specifies a mapping of tags which should be assigned to the CDN FrontDoor Endpoint.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a FrontdoorEndpoint resource.
type FrontdoorEndpointArgs struct {
	// The ID of the FrontDoor Profile within which this FrontDoor Endpoint should exist. Changing this forces a new CDN FrontDoor Endpoint to be created.
	CdnFrontdoorProfileId pulumi.StringInput
	// Specifies if this CDN FrontDoor Endpoint is enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The name which should be used for this CDN FrontDoor Endpoint. Changing this forces a new CDN FrontDoor Endpoint to be created.
	Name pulumi.StringPtrInput
	// Specifies a mapping of tags which should be assigned to the CDN FrontDoor Endpoint.
	Tags pulumi.StringMapInput
}

func (FrontdoorEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*frontdoorEndpointArgs)(nil)).Elem()
}

type FrontdoorEndpointInput interface {
	pulumi.Input

	ToFrontdoorEndpointOutput() FrontdoorEndpointOutput
	ToFrontdoorEndpointOutputWithContext(ctx context.Context) FrontdoorEndpointOutput
}

func (*FrontdoorEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**FrontdoorEndpoint)(nil)).Elem()
}

func (i *FrontdoorEndpoint) ToFrontdoorEndpointOutput() FrontdoorEndpointOutput {
	return i.ToFrontdoorEndpointOutputWithContext(context.Background())
}

func (i *FrontdoorEndpoint) ToFrontdoorEndpointOutputWithContext(ctx context.Context) FrontdoorEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorEndpointOutput)
}

// FrontdoorEndpointArrayInput is an input type that accepts FrontdoorEndpointArray and FrontdoorEndpointArrayOutput values.
// You can construct a concrete instance of `FrontdoorEndpointArrayInput` via:
//
//          FrontdoorEndpointArray{ FrontdoorEndpointArgs{...} }
type FrontdoorEndpointArrayInput interface {
	pulumi.Input

	ToFrontdoorEndpointArrayOutput() FrontdoorEndpointArrayOutput
	ToFrontdoorEndpointArrayOutputWithContext(context.Context) FrontdoorEndpointArrayOutput
}

type FrontdoorEndpointArray []FrontdoorEndpointInput

func (FrontdoorEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FrontdoorEndpoint)(nil)).Elem()
}

func (i FrontdoorEndpointArray) ToFrontdoorEndpointArrayOutput() FrontdoorEndpointArrayOutput {
	return i.ToFrontdoorEndpointArrayOutputWithContext(context.Background())
}

func (i FrontdoorEndpointArray) ToFrontdoorEndpointArrayOutputWithContext(ctx context.Context) FrontdoorEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorEndpointArrayOutput)
}

// FrontdoorEndpointMapInput is an input type that accepts FrontdoorEndpointMap and FrontdoorEndpointMapOutput values.
// You can construct a concrete instance of `FrontdoorEndpointMapInput` via:
//
//          FrontdoorEndpointMap{ "key": FrontdoorEndpointArgs{...} }
type FrontdoorEndpointMapInput interface {
	pulumi.Input

	ToFrontdoorEndpointMapOutput() FrontdoorEndpointMapOutput
	ToFrontdoorEndpointMapOutputWithContext(context.Context) FrontdoorEndpointMapOutput
}

type FrontdoorEndpointMap map[string]FrontdoorEndpointInput

func (FrontdoorEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FrontdoorEndpoint)(nil)).Elem()
}

func (i FrontdoorEndpointMap) ToFrontdoorEndpointMapOutput() FrontdoorEndpointMapOutput {
	return i.ToFrontdoorEndpointMapOutputWithContext(context.Background())
}

func (i FrontdoorEndpointMap) ToFrontdoorEndpointMapOutputWithContext(ctx context.Context) FrontdoorEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorEndpointMapOutput)
}

type FrontdoorEndpointOutput struct{ *pulumi.OutputState }

func (FrontdoorEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FrontdoorEndpoint)(nil)).Elem()
}

func (o FrontdoorEndpointOutput) ToFrontdoorEndpointOutput() FrontdoorEndpointOutput {
	return o
}

func (o FrontdoorEndpointOutput) ToFrontdoorEndpointOutputWithContext(ctx context.Context) FrontdoorEndpointOutput {
	return o
}

// The ID of the FrontDoor Profile within which this FrontDoor Endpoint should exist. Changing this forces a new CDN FrontDoor Endpoint to be created.
func (o FrontdoorEndpointOutput) CdnFrontdoorProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *FrontdoorEndpoint) pulumi.StringOutput { return v.CdnFrontdoorProfileId }).(pulumi.StringOutput)
}

// Specifies if this CDN FrontDoor Endpoint is enabled? Defaults to `true`.
func (o FrontdoorEndpointOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FrontdoorEndpoint) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The host name of the CDN FrontDoor Endpoint, in the format `{endpointName}.{dnsZone}` (for example, `contoso.azureedge.net`).
func (o FrontdoorEndpointOutput) HostName() pulumi.StringOutput {
	return o.ApplyT(func(v *FrontdoorEndpoint) pulumi.StringOutput { return v.HostName }).(pulumi.StringOutput)
}

// The name which should be used for this CDN FrontDoor Endpoint. Changing this forces a new CDN FrontDoor Endpoint to be created.
func (o FrontdoorEndpointOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FrontdoorEndpoint) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies a mapping of tags which should be assigned to the CDN FrontDoor Endpoint.
func (o FrontdoorEndpointOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *FrontdoorEndpoint) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type FrontdoorEndpointArrayOutput struct{ *pulumi.OutputState }

func (FrontdoorEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FrontdoorEndpoint)(nil)).Elem()
}

func (o FrontdoorEndpointArrayOutput) ToFrontdoorEndpointArrayOutput() FrontdoorEndpointArrayOutput {
	return o
}

func (o FrontdoorEndpointArrayOutput) ToFrontdoorEndpointArrayOutputWithContext(ctx context.Context) FrontdoorEndpointArrayOutput {
	return o
}

func (o FrontdoorEndpointArrayOutput) Index(i pulumi.IntInput) FrontdoorEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FrontdoorEndpoint {
		return vs[0].([]*FrontdoorEndpoint)[vs[1].(int)]
	}).(FrontdoorEndpointOutput)
}

type FrontdoorEndpointMapOutput struct{ *pulumi.OutputState }

func (FrontdoorEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FrontdoorEndpoint)(nil)).Elem()
}

func (o FrontdoorEndpointMapOutput) ToFrontdoorEndpointMapOutput() FrontdoorEndpointMapOutput {
	return o
}

func (o FrontdoorEndpointMapOutput) ToFrontdoorEndpointMapOutputWithContext(ctx context.Context) FrontdoorEndpointMapOutput {
	return o
}

func (o FrontdoorEndpointMapOutput) MapIndex(k pulumi.StringInput) FrontdoorEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FrontdoorEndpoint {
		return vs[0].(map[string]*FrontdoorEndpoint)[vs[1].(string)]
	}).(FrontdoorEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorEndpointInput)(nil)).Elem(), &FrontdoorEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorEndpointArrayInput)(nil)).Elem(), FrontdoorEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorEndpointMapInput)(nil)).Elem(), FrontdoorEndpointMap{})
	pulumi.RegisterOutputType(FrontdoorEndpointOutput{})
	pulumi.RegisterOutputType(FrontdoorEndpointArrayOutput{})
	pulumi.RegisterOutputType(FrontdoorEndpointMapOutput{})
}