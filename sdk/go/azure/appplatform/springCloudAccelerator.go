// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appplatform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **NOTE:** This resource is applicable only for Spring Cloud Service with enterprise tier.
//
// Manages a Spring Cloud Accelerator.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/appplatform"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
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
//			exampleSpringCloudService, err := appplatform.NewSpringCloudService(ctx, "exampleSpringCloudService", &appplatform.SpringCloudServiceArgs{
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				SkuName:           pulumi.String("E0"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appplatform.NewSpringCloudAccelerator(ctx, "exampleSpringCloudAccelerator", &appplatform.SpringCloudAcceleratorArgs{
//				SpringCloudServiceId: exampleSpringCloudService.ID(),
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
// Spring Cloud Accelerators can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:appplatform/springCloudAccelerator:SpringCloudAccelerator example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resourceGroup1/providers/Microsoft.AppPlatform/Spring/service1/applicationAccelerators/default
//
// ```
type SpringCloudAccelerator struct {
	pulumi.CustomResourceState

	// The name which should be used for this Spring Cloud Accelerator. Changing this forces a new Spring Cloud Accelerator to be created. The only possible value is `default`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Accelerator to be created.
	SpringCloudServiceId pulumi.StringOutput `pulumi:"springCloudServiceId"`
}

// NewSpringCloudAccelerator registers a new resource with the given unique name, arguments, and options.
func NewSpringCloudAccelerator(ctx *pulumi.Context,
	name string, args *SpringCloudAcceleratorArgs, opts ...pulumi.ResourceOption) (*SpringCloudAccelerator, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SpringCloudServiceId == nil {
		return nil, errors.New("invalid value for required argument 'SpringCloudServiceId'")
	}
	var resource SpringCloudAccelerator
	err := ctx.RegisterResource("azure:appplatform/springCloudAccelerator:SpringCloudAccelerator", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpringCloudAccelerator gets an existing SpringCloudAccelerator resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpringCloudAccelerator(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpringCloudAcceleratorState, opts ...pulumi.ResourceOption) (*SpringCloudAccelerator, error) {
	var resource SpringCloudAccelerator
	err := ctx.ReadResource("azure:appplatform/springCloudAccelerator:SpringCloudAccelerator", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpringCloudAccelerator resources.
type springCloudAcceleratorState struct {
	// The name which should be used for this Spring Cloud Accelerator. Changing this forces a new Spring Cloud Accelerator to be created. The only possible value is `default`.
	Name *string `pulumi:"name"`
	// The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Accelerator to be created.
	SpringCloudServiceId *string `pulumi:"springCloudServiceId"`
}

type SpringCloudAcceleratorState struct {
	// The name which should be used for this Spring Cloud Accelerator. Changing this forces a new Spring Cloud Accelerator to be created. The only possible value is `default`.
	Name pulumi.StringPtrInput
	// The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Accelerator to be created.
	SpringCloudServiceId pulumi.StringPtrInput
}

func (SpringCloudAcceleratorState) ElementType() reflect.Type {
	return reflect.TypeOf((*springCloudAcceleratorState)(nil)).Elem()
}

type springCloudAcceleratorArgs struct {
	// The name which should be used for this Spring Cloud Accelerator. Changing this forces a new Spring Cloud Accelerator to be created. The only possible value is `default`.
	Name *string `pulumi:"name"`
	// The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Accelerator to be created.
	SpringCloudServiceId string `pulumi:"springCloudServiceId"`
}

// The set of arguments for constructing a SpringCloudAccelerator resource.
type SpringCloudAcceleratorArgs struct {
	// The name which should be used for this Spring Cloud Accelerator. Changing this forces a new Spring Cloud Accelerator to be created. The only possible value is `default`.
	Name pulumi.StringPtrInput
	// The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Accelerator to be created.
	SpringCloudServiceId pulumi.StringInput
}

func (SpringCloudAcceleratorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*springCloudAcceleratorArgs)(nil)).Elem()
}

type SpringCloudAcceleratorInput interface {
	pulumi.Input

	ToSpringCloudAcceleratorOutput() SpringCloudAcceleratorOutput
	ToSpringCloudAcceleratorOutputWithContext(ctx context.Context) SpringCloudAcceleratorOutput
}

func (*SpringCloudAccelerator) ElementType() reflect.Type {
	return reflect.TypeOf((**SpringCloudAccelerator)(nil)).Elem()
}

func (i *SpringCloudAccelerator) ToSpringCloudAcceleratorOutput() SpringCloudAcceleratorOutput {
	return i.ToSpringCloudAcceleratorOutputWithContext(context.Background())
}

func (i *SpringCloudAccelerator) ToSpringCloudAcceleratorOutputWithContext(ctx context.Context) SpringCloudAcceleratorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpringCloudAcceleratorOutput)
}

// SpringCloudAcceleratorArrayInput is an input type that accepts SpringCloudAcceleratorArray and SpringCloudAcceleratorArrayOutput values.
// You can construct a concrete instance of `SpringCloudAcceleratorArrayInput` via:
//
//	SpringCloudAcceleratorArray{ SpringCloudAcceleratorArgs{...} }
type SpringCloudAcceleratorArrayInput interface {
	pulumi.Input

	ToSpringCloudAcceleratorArrayOutput() SpringCloudAcceleratorArrayOutput
	ToSpringCloudAcceleratorArrayOutputWithContext(context.Context) SpringCloudAcceleratorArrayOutput
}

type SpringCloudAcceleratorArray []SpringCloudAcceleratorInput

func (SpringCloudAcceleratorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpringCloudAccelerator)(nil)).Elem()
}

func (i SpringCloudAcceleratorArray) ToSpringCloudAcceleratorArrayOutput() SpringCloudAcceleratorArrayOutput {
	return i.ToSpringCloudAcceleratorArrayOutputWithContext(context.Background())
}

func (i SpringCloudAcceleratorArray) ToSpringCloudAcceleratorArrayOutputWithContext(ctx context.Context) SpringCloudAcceleratorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpringCloudAcceleratorArrayOutput)
}

// SpringCloudAcceleratorMapInput is an input type that accepts SpringCloudAcceleratorMap and SpringCloudAcceleratorMapOutput values.
// You can construct a concrete instance of `SpringCloudAcceleratorMapInput` via:
//
//	SpringCloudAcceleratorMap{ "key": SpringCloudAcceleratorArgs{...} }
type SpringCloudAcceleratorMapInput interface {
	pulumi.Input

	ToSpringCloudAcceleratorMapOutput() SpringCloudAcceleratorMapOutput
	ToSpringCloudAcceleratorMapOutputWithContext(context.Context) SpringCloudAcceleratorMapOutput
}

type SpringCloudAcceleratorMap map[string]SpringCloudAcceleratorInput

func (SpringCloudAcceleratorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpringCloudAccelerator)(nil)).Elem()
}

func (i SpringCloudAcceleratorMap) ToSpringCloudAcceleratorMapOutput() SpringCloudAcceleratorMapOutput {
	return i.ToSpringCloudAcceleratorMapOutputWithContext(context.Background())
}

func (i SpringCloudAcceleratorMap) ToSpringCloudAcceleratorMapOutputWithContext(ctx context.Context) SpringCloudAcceleratorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpringCloudAcceleratorMapOutput)
}

type SpringCloudAcceleratorOutput struct{ *pulumi.OutputState }

func (SpringCloudAcceleratorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SpringCloudAccelerator)(nil)).Elem()
}

func (o SpringCloudAcceleratorOutput) ToSpringCloudAcceleratorOutput() SpringCloudAcceleratorOutput {
	return o
}

func (o SpringCloudAcceleratorOutput) ToSpringCloudAcceleratorOutputWithContext(ctx context.Context) SpringCloudAcceleratorOutput {
	return o
}

// The name which should be used for this Spring Cloud Accelerator. Changing this forces a new Spring Cloud Accelerator to be created. The only possible value is `default`.
func (o SpringCloudAcceleratorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SpringCloudAccelerator) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Accelerator to be created.
func (o SpringCloudAcceleratorOutput) SpringCloudServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SpringCloudAccelerator) pulumi.StringOutput { return v.SpringCloudServiceId }).(pulumi.StringOutput)
}

type SpringCloudAcceleratorArrayOutput struct{ *pulumi.OutputState }

func (SpringCloudAcceleratorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpringCloudAccelerator)(nil)).Elem()
}

func (o SpringCloudAcceleratorArrayOutput) ToSpringCloudAcceleratorArrayOutput() SpringCloudAcceleratorArrayOutput {
	return o
}

func (o SpringCloudAcceleratorArrayOutput) ToSpringCloudAcceleratorArrayOutputWithContext(ctx context.Context) SpringCloudAcceleratorArrayOutput {
	return o
}

func (o SpringCloudAcceleratorArrayOutput) Index(i pulumi.IntInput) SpringCloudAcceleratorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SpringCloudAccelerator {
		return vs[0].([]*SpringCloudAccelerator)[vs[1].(int)]
	}).(SpringCloudAcceleratorOutput)
}

type SpringCloudAcceleratorMapOutput struct{ *pulumi.OutputState }

func (SpringCloudAcceleratorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpringCloudAccelerator)(nil)).Elem()
}

func (o SpringCloudAcceleratorMapOutput) ToSpringCloudAcceleratorMapOutput() SpringCloudAcceleratorMapOutput {
	return o
}

func (o SpringCloudAcceleratorMapOutput) ToSpringCloudAcceleratorMapOutputWithContext(ctx context.Context) SpringCloudAcceleratorMapOutput {
	return o
}

func (o SpringCloudAcceleratorMapOutput) MapIndex(k pulumi.StringInput) SpringCloudAcceleratorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SpringCloudAccelerator {
		return vs[0].(map[string]*SpringCloudAccelerator)[vs[1].(string)]
	}).(SpringCloudAcceleratorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpringCloudAcceleratorInput)(nil)).Elem(), &SpringCloudAccelerator{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpringCloudAcceleratorArrayInput)(nil)).Elem(), SpringCloudAcceleratorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpringCloudAcceleratorMapInput)(nil)).Elem(), SpringCloudAcceleratorMap{})
	pulumi.RegisterOutputType(SpringCloudAcceleratorOutput{})
	pulumi.RegisterOutputType(SpringCloudAcceleratorArrayOutput{})
	pulumi.RegisterOutputType(SpringCloudAcceleratorMapOutput{})
}