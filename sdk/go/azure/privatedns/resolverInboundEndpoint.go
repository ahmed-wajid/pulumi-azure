// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package privatedns

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Private DNS Resolver Inbound Endpoint.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/network"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/privatedns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "exampleVirtualNetwork", &network.VirtualNetworkArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.0.0.0/16"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = privatedns.NewResolver(ctx, "test", &privatedns.ResolverArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				VirtualNetworkId:  exampleVirtualNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSubnet, err := network.NewSubnet(ctx, "exampleSubnet", &network.SubnetArgs{
//				ResourceGroupName:  pulumi.Any(azurerm_resource_group.Test.Name),
//				VirtualNetworkName: pulumi.Any(azurerm_virtual_network.Test.Name),
//				AddressPrefixes: pulumi.StringArray{
//					pulumi.String("10.0.0.0/28"),
//				},
//				Delegations: network.SubnetDelegationArray{
//					&network.SubnetDelegationArgs{
//						Name: pulumi.String("Microsoft.Network.dnsResolvers"),
//						ServiceDelegation: &network.SubnetDelegationServiceDelegationArgs{
//							Actions: pulumi.StringArray{
//								pulumi.String("Microsoft.Network/virtualNetworks/subnets/join/action"),
//							},
//							Name: pulumi.String("Microsoft.Network/dnsResolvers"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = privatedns.NewResolverInboundEndpoint(ctx, "exampleResolverInboundEndpoint", &privatedns.ResolverInboundEndpointArgs{
//				PrivateDnsResolverId: pulumi.Any(azurerm_private_dns_resolver.Example.Id),
//				Location:             pulumi.Any(azurerm_private_dns_resolver.Example.Location),
//				IpConfigurations: privatedns.ResolverInboundEndpointIpConfigurationArray{
//					&privatedns.ResolverInboundEndpointIpConfigurationArgs{
//						PrivateIpAllocationMethod: pulumi.String("Dynamic"),
//						SubnetId:                  exampleSubnet.ID(),
//					},
//				},
//				Tags: pulumi.StringMap{
//					"key": pulumi.String("value"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Private DNS Resolver Inbound Endpoint can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:privatedns/resolverInboundEndpoint:ResolverInboundEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/dnsResolvers/dnsResolver1/inboundEndpoints/inboundEndpoint1
//
// ```
type ResolverInboundEndpoint struct {
	pulumi.CustomResourceState

	// Can be specified multiple times to define multiple IP configurations. Each `ipConfigurations` block as defined below.
	IpConfigurations ResolverInboundEndpointIpConfigurationArrayOutput `pulumi:"ipConfigurations"`
	// Specifies the Azure Region where the Private DNS Resolver Inbound Endpoint should exist. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies the name which should be used for this Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the ID of the Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	PrivateDnsResolverId pulumi.StringOutput `pulumi:"privateDnsResolverId"`
	// A mapping of tags which should be assigned to the Private DNS Resolver Inbound Endpoint.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewResolverInboundEndpoint registers a new resource with the given unique name, arguments, and options.
func NewResolverInboundEndpoint(ctx *pulumi.Context,
	name string, args *ResolverInboundEndpointArgs, opts ...pulumi.ResourceOption) (*ResolverInboundEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IpConfigurations == nil {
		return nil, errors.New("invalid value for required argument 'IpConfigurations'")
	}
	if args.PrivateDnsResolverId == nil {
		return nil, errors.New("invalid value for required argument 'PrivateDnsResolverId'")
	}
	var resource ResolverInboundEndpoint
	err := ctx.RegisterResource("azure:privatedns/resolverInboundEndpoint:ResolverInboundEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResolverInboundEndpoint gets an existing ResolverInboundEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResolverInboundEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResolverInboundEndpointState, opts ...pulumi.ResourceOption) (*ResolverInboundEndpoint, error) {
	var resource ResolverInboundEndpoint
	err := ctx.ReadResource("azure:privatedns/resolverInboundEndpoint:ResolverInboundEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResolverInboundEndpoint resources.
type resolverInboundEndpointState struct {
	// Can be specified multiple times to define multiple IP configurations. Each `ipConfigurations` block as defined below.
	IpConfigurations []ResolverInboundEndpointIpConfiguration `pulumi:"ipConfigurations"`
	// Specifies the Azure Region where the Private DNS Resolver Inbound Endpoint should exist. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	Location *string `pulumi:"location"`
	// Specifies the name which should be used for this Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	Name *string `pulumi:"name"`
	// Specifies the ID of the Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	PrivateDnsResolverId *string `pulumi:"privateDnsResolverId"`
	// A mapping of tags which should be assigned to the Private DNS Resolver Inbound Endpoint.
	Tags map[string]string `pulumi:"tags"`
}

type ResolverInboundEndpointState struct {
	// Can be specified multiple times to define multiple IP configurations. Each `ipConfigurations` block as defined below.
	IpConfigurations ResolverInboundEndpointIpConfigurationArrayInput
	// Specifies the Azure Region where the Private DNS Resolver Inbound Endpoint should exist. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	Location pulumi.StringPtrInput
	// Specifies the name which should be used for this Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	Name pulumi.StringPtrInput
	// Specifies the ID of the Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	PrivateDnsResolverId pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Private DNS Resolver Inbound Endpoint.
	Tags pulumi.StringMapInput
}

func (ResolverInboundEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverInboundEndpointState)(nil)).Elem()
}

type resolverInboundEndpointArgs struct {
	// Can be specified multiple times to define multiple IP configurations. Each `ipConfigurations` block as defined below.
	IpConfigurations []ResolverInboundEndpointIpConfiguration `pulumi:"ipConfigurations"`
	// Specifies the Azure Region where the Private DNS Resolver Inbound Endpoint should exist. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	Location *string `pulumi:"location"`
	// Specifies the name which should be used for this Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	Name *string `pulumi:"name"`
	// Specifies the ID of the Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	PrivateDnsResolverId string `pulumi:"privateDnsResolverId"`
	// A mapping of tags which should be assigned to the Private DNS Resolver Inbound Endpoint.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ResolverInboundEndpoint resource.
type ResolverInboundEndpointArgs struct {
	// Can be specified multiple times to define multiple IP configurations. Each `ipConfigurations` block as defined below.
	IpConfigurations ResolverInboundEndpointIpConfigurationArrayInput
	// Specifies the Azure Region where the Private DNS Resolver Inbound Endpoint should exist. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	Location pulumi.StringPtrInput
	// Specifies the name which should be used for this Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	Name pulumi.StringPtrInput
	// Specifies the ID of the Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
	PrivateDnsResolverId pulumi.StringInput
	// A mapping of tags which should be assigned to the Private DNS Resolver Inbound Endpoint.
	Tags pulumi.StringMapInput
}

func (ResolverInboundEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverInboundEndpointArgs)(nil)).Elem()
}

type ResolverInboundEndpointInput interface {
	pulumi.Input

	ToResolverInboundEndpointOutput() ResolverInboundEndpointOutput
	ToResolverInboundEndpointOutputWithContext(ctx context.Context) ResolverInboundEndpointOutput
}

func (*ResolverInboundEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverInboundEndpoint)(nil)).Elem()
}

func (i *ResolverInboundEndpoint) ToResolverInboundEndpointOutput() ResolverInboundEndpointOutput {
	return i.ToResolverInboundEndpointOutputWithContext(context.Background())
}

func (i *ResolverInboundEndpoint) ToResolverInboundEndpointOutputWithContext(ctx context.Context) ResolverInboundEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverInboundEndpointOutput)
}

// ResolverInboundEndpointArrayInput is an input type that accepts ResolverInboundEndpointArray and ResolverInboundEndpointArrayOutput values.
// You can construct a concrete instance of `ResolverInboundEndpointArrayInput` via:
//
//	ResolverInboundEndpointArray{ ResolverInboundEndpointArgs{...} }
type ResolverInboundEndpointArrayInput interface {
	pulumi.Input

	ToResolverInboundEndpointArrayOutput() ResolverInboundEndpointArrayOutput
	ToResolverInboundEndpointArrayOutputWithContext(context.Context) ResolverInboundEndpointArrayOutput
}

type ResolverInboundEndpointArray []ResolverInboundEndpointInput

func (ResolverInboundEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverInboundEndpoint)(nil)).Elem()
}

func (i ResolverInboundEndpointArray) ToResolverInboundEndpointArrayOutput() ResolverInboundEndpointArrayOutput {
	return i.ToResolverInboundEndpointArrayOutputWithContext(context.Background())
}

func (i ResolverInboundEndpointArray) ToResolverInboundEndpointArrayOutputWithContext(ctx context.Context) ResolverInboundEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverInboundEndpointArrayOutput)
}

// ResolverInboundEndpointMapInput is an input type that accepts ResolverInboundEndpointMap and ResolverInboundEndpointMapOutput values.
// You can construct a concrete instance of `ResolverInboundEndpointMapInput` via:
//
//	ResolverInboundEndpointMap{ "key": ResolverInboundEndpointArgs{...} }
type ResolverInboundEndpointMapInput interface {
	pulumi.Input

	ToResolverInboundEndpointMapOutput() ResolverInboundEndpointMapOutput
	ToResolverInboundEndpointMapOutputWithContext(context.Context) ResolverInboundEndpointMapOutput
}

type ResolverInboundEndpointMap map[string]ResolverInboundEndpointInput

func (ResolverInboundEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverInboundEndpoint)(nil)).Elem()
}

func (i ResolverInboundEndpointMap) ToResolverInboundEndpointMapOutput() ResolverInboundEndpointMapOutput {
	return i.ToResolverInboundEndpointMapOutputWithContext(context.Background())
}

func (i ResolverInboundEndpointMap) ToResolverInboundEndpointMapOutputWithContext(ctx context.Context) ResolverInboundEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverInboundEndpointMapOutput)
}

type ResolverInboundEndpointOutput struct{ *pulumi.OutputState }

func (ResolverInboundEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverInboundEndpoint)(nil)).Elem()
}

func (o ResolverInboundEndpointOutput) ToResolverInboundEndpointOutput() ResolverInboundEndpointOutput {
	return o
}

func (o ResolverInboundEndpointOutput) ToResolverInboundEndpointOutputWithContext(ctx context.Context) ResolverInboundEndpointOutput {
	return o
}

// Can be specified multiple times to define multiple IP configurations. Each `ipConfigurations` block as defined below.
func (o ResolverInboundEndpointOutput) IpConfigurations() ResolverInboundEndpointIpConfigurationArrayOutput {
	return o.ApplyT(func(v *ResolverInboundEndpoint) ResolverInboundEndpointIpConfigurationArrayOutput {
		return v.IpConfigurations
	}).(ResolverInboundEndpointIpConfigurationArrayOutput)
}

// Specifies the Azure Region where the Private DNS Resolver Inbound Endpoint should exist. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
func (o ResolverInboundEndpointOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverInboundEndpoint) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies the name which should be used for this Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
func (o ResolverInboundEndpointOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverInboundEndpoint) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the ID of the Private DNS Resolver Inbound Endpoint. Changing this forces a new Private DNS Resolver Inbound Endpoint to be created.
func (o ResolverInboundEndpointOutput) PrivateDnsResolverId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverInboundEndpoint) pulumi.StringOutput { return v.PrivateDnsResolverId }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Private DNS Resolver Inbound Endpoint.
func (o ResolverInboundEndpointOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ResolverInboundEndpoint) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type ResolverInboundEndpointArrayOutput struct{ *pulumi.OutputState }

func (ResolverInboundEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverInboundEndpoint)(nil)).Elem()
}

func (o ResolverInboundEndpointArrayOutput) ToResolverInboundEndpointArrayOutput() ResolverInboundEndpointArrayOutput {
	return o
}

func (o ResolverInboundEndpointArrayOutput) ToResolverInboundEndpointArrayOutputWithContext(ctx context.Context) ResolverInboundEndpointArrayOutput {
	return o
}

func (o ResolverInboundEndpointArrayOutput) Index(i pulumi.IntInput) ResolverInboundEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResolverInboundEndpoint {
		return vs[0].([]*ResolverInboundEndpoint)[vs[1].(int)]
	}).(ResolverInboundEndpointOutput)
}

type ResolverInboundEndpointMapOutput struct{ *pulumi.OutputState }

func (ResolverInboundEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverInboundEndpoint)(nil)).Elem()
}

func (o ResolverInboundEndpointMapOutput) ToResolverInboundEndpointMapOutput() ResolverInboundEndpointMapOutput {
	return o
}

func (o ResolverInboundEndpointMapOutput) ToResolverInboundEndpointMapOutputWithContext(ctx context.Context) ResolverInboundEndpointMapOutput {
	return o
}

func (o ResolverInboundEndpointMapOutput) MapIndex(k pulumi.StringInput) ResolverInboundEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResolverInboundEndpoint {
		return vs[0].(map[string]*ResolverInboundEndpoint)[vs[1].(string)]
	}).(ResolverInboundEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverInboundEndpointInput)(nil)).Elem(), &ResolverInboundEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverInboundEndpointArrayInput)(nil)).Elem(), ResolverInboundEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverInboundEndpointMapInput)(nil)).Elem(), ResolverInboundEndpointMap{})
	pulumi.RegisterOutputType(ResolverInboundEndpointOutput{})
	pulumi.RegisterOutputType(ResolverInboundEndpointArrayOutput{})
	pulumi.RegisterOutputType(ResolverInboundEndpointMapOutput{})
}