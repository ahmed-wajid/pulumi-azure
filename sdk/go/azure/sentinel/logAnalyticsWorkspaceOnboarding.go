// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sentinel

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Security Insights Sentinel Onboarding.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/operationalinsights"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/sentinel"
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
//			exampleAnalyticsWorkspace, err := operationalinsights.NewAnalyticsWorkspace(ctx, "exampleAnalyticsWorkspace", &operationalinsights.AnalyticsWorkspaceArgs{
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				Sku:               pulumi.String("PerGB2018"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = sentinel.NewLogAnalyticsWorkspaceOnboarding(ctx, "exampleLogAnalyticsWorkspaceOnboarding", &sentinel.LogAnalyticsWorkspaceOnboardingArgs{
//				ResourceGroupName:         exampleResourceGroup.Name,
//				WorkspaceName:             exampleAnalyticsWorkspace.Name,
//				CustomerManagedKeyEnabled: pulumi.Bool(false),
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
// Security Insights Sentinel Onboarding States can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:sentinel/logAnalyticsWorkspaceOnboarding:LogAnalyticsWorkspaceOnboarding example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/onboardingStates/defaults
//
// ```
type LogAnalyticsWorkspaceOnboarding struct {
	pulumi.CustomResourceState

	// Specifies if the Workspace is using Customer managed key. Defaults to `false`. Changing this forces a new resource to be created.
	CustomerManagedKeyEnabled pulumi.BoolPtrOutput `pulumi:"customerManagedKeyEnabled"`
	// Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again. Changing this forces a new resource to be created.
	WorkspaceName pulumi.StringOutput `pulumi:"workspaceName"`
}

// NewLogAnalyticsWorkspaceOnboarding registers a new resource with the given unique name, arguments, and options.
func NewLogAnalyticsWorkspaceOnboarding(ctx *pulumi.Context,
	name string, args *LogAnalyticsWorkspaceOnboardingArgs, opts ...pulumi.ResourceOption) (*LogAnalyticsWorkspaceOnboarding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.WorkspaceName == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceName'")
	}
	var resource LogAnalyticsWorkspaceOnboarding
	err := ctx.RegisterResource("azure:sentinel/logAnalyticsWorkspaceOnboarding:LogAnalyticsWorkspaceOnboarding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogAnalyticsWorkspaceOnboarding gets an existing LogAnalyticsWorkspaceOnboarding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogAnalyticsWorkspaceOnboarding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogAnalyticsWorkspaceOnboardingState, opts ...pulumi.ResourceOption) (*LogAnalyticsWorkspaceOnboarding, error) {
	var resource LogAnalyticsWorkspaceOnboarding
	err := ctx.ReadResource("azure:sentinel/logAnalyticsWorkspaceOnboarding:LogAnalyticsWorkspaceOnboarding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogAnalyticsWorkspaceOnboarding resources.
type logAnalyticsWorkspaceOnboardingState struct {
	// Specifies if the Workspace is using Customer managed key. Defaults to `false`. Changing this forces a new resource to be created.
	CustomerManagedKeyEnabled *bool `pulumi:"customerManagedKeyEnabled"`
	// Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again. Changing this forces a new resource to be created.
	WorkspaceName *string `pulumi:"workspaceName"`
}

type LogAnalyticsWorkspaceOnboardingState struct {
	// Specifies if the Workspace is using Customer managed key. Defaults to `false`. Changing this forces a new resource to be created.
	CustomerManagedKeyEnabled pulumi.BoolPtrInput
	// Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
	ResourceGroupName pulumi.StringPtrInput
	// Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again. Changing this forces a new resource to be created.
	WorkspaceName pulumi.StringPtrInput
}

func (LogAnalyticsWorkspaceOnboardingState) ElementType() reflect.Type {
	return reflect.TypeOf((*logAnalyticsWorkspaceOnboardingState)(nil)).Elem()
}

type logAnalyticsWorkspaceOnboardingArgs struct {
	// Specifies if the Workspace is using Customer managed key. Defaults to `false`. Changing this forces a new resource to be created.
	CustomerManagedKeyEnabled *bool `pulumi:"customerManagedKeyEnabled"`
	// Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again. Changing this forces a new resource to be created.
	WorkspaceName string `pulumi:"workspaceName"`
}

// The set of arguments for constructing a LogAnalyticsWorkspaceOnboarding resource.
type LogAnalyticsWorkspaceOnboardingArgs struct {
	// Specifies if the Workspace is using Customer managed key. Defaults to `false`. Changing this forces a new resource to be created.
	CustomerManagedKeyEnabled pulumi.BoolPtrInput
	// Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
	ResourceGroupName pulumi.StringInput
	// Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again. Changing this forces a new resource to be created.
	WorkspaceName pulumi.StringInput
}

func (LogAnalyticsWorkspaceOnboardingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logAnalyticsWorkspaceOnboardingArgs)(nil)).Elem()
}

type LogAnalyticsWorkspaceOnboardingInput interface {
	pulumi.Input

	ToLogAnalyticsWorkspaceOnboardingOutput() LogAnalyticsWorkspaceOnboardingOutput
	ToLogAnalyticsWorkspaceOnboardingOutputWithContext(ctx context.Context) LogAnalyticsWorkspaceOnboardingOutput
}

func (*LogAnalyticsWorkspaceOnboarding) ElementType() reflect.Type {
	return reflect.TypeOf((**LogAnalyticsWorkspaceOnboarding)(nil)).Elem()
}

func (i *LogAnalyticsWorkspaceOnboarding) ToLogAnalyticsWorkspaceOnboardingOutput() LogAnalyticsWorkspaceOnboardingOutput {
	return i.ToLogAnalyticsWorkspaceOnboardingOutputWithContext(context.Background())
}

func (i *LogAnalyticsWorkspaceOnboarding) ToLogAnalyticsWorkspaceOnboardingOutputWithContext(ctx context.Context) LogAnalyticsWorkspaceOnboardingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogAnalyticsWorkspaceOnboardingOutput)
}

// LogAnalyticsWorkspaceOnboardingArrayInput is an input type that accepts LogAnalyticsWorkspaceOnboardingArray and LogAnalyticsWorkspaceOnboardingArrayOutput values.
// You can construct a concrete instance of `LogAnalyticsWorkspaceOnboardingArrayInput` via:
//
//	LogAnalyticsWorkspaceOnboardingArray{ LogAnalyticsWorkspaceOnboardingArgs{...} }
type LogAnalyticsWorkspaceOnboardingArrayInput interface {
	pulumi.Input

	ToLogAnalyticsWorkspaceOnboardingArrayOutput() LogAnalyticsWorkspaceOnboardingArrayOutput
	ToLogAnalyticsWorkspaceOnboardingArrayOutputWithContext(context.Context) LogAnalyticsWorkspaceOnboardingArrayOutput
}

type LogAnalyticsWorkspaceOnboardingArray []LogAnalyticsWorkspaceOnboardingInput

func (LogAnalyticsWorkspaceOnboardingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogAnalyticsWorkspaceOnboarding)(nil)).Elem()
}

func (i LogAnalyticsWorkspaceOnboardingArray) ToLogAnalyticsWorkspaceOnboardingArrayOutput() LogAnalyticsWorkspaceOnboardingArrayOutput {
	return i.ToLogAnalyticsWorkspaceOnboardingArrayOutputWithContext(context.Background())
}

func (i LogAnalyticsWorkspaceOnboardingArray) ToLogAnalyticsWorkspaceOnboardingArrayOutputWithContext(ctx context.Context) LogAnalyticsWorkspaceOnboardingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogAnalyticsWorkspaceOnboardingArrayOutput)
}

// LogAnalyticsWorkspaceOnboardingMapInput is an input type that accepts LogAnalyticsWorkspaceOnboardingMap and LogAnalyticsWorkspaceOnboardingMapOutput values.
// You can construct a concrete instance of `LogAnalyticsWorkspaceOnboardingMapInput` via:
//
//	LogAnalyticsWorkspaceOnboardingMap{ "key": LogAnalyticsWorkspaceOnboardingArgs{...} }
type LogAnalyticsWorkspaceOnboardingMapInput interface {
	pulumi.Input

	ToLogAnalyticsWorkspaceOnboardingMapOutput() LogAnalyticsWorkspaceOnboardingMapOutput
	ToLogAnalyticsWorkspaceOnboardingMapOutputWithContext(context.Context) LogAnalyticsWorkspaceOnboardingMapOutput
}

type LogAnalyticsWorkspaceOnboardingMap map[string]LogAnalyticsWorkspaceOnboardingInput

func (LogAnalyticsWorkspaceOnboardingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogAnalyticsWorkspaceOnboarding)(nil)).Elem()
}

func (i LogAnalyticsWorkspaceOnboardingMap) ToLogAnalyticsWorkspaceOnboardingMapOutput() LogAnalyticsWorkspaceOnboardingMapOutput {
	return i.ToLogAnalyticsWorkspaceOnboardingMapOutputWithContext(context.Background())
}

func (i LogAnalyticsWorkspaceOnboardingMap) ToLogAnalyticsWorkspaceOnboardingMapOutputWithContext(ctx context.Context) LogAnalyticsWorkspaceOnboardingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogAnalyticsWorkspaceOnboardingMapOutput)
}

type LogAnalyticsWorkspaceOnboardingOutput struct{ *pulumi.OutputState }

func (LogAnalyticsWorkspaceOnboardingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogAnalyticsWorkspaceOnboarding)(nil)).Elem()
}

func (o LogAnalyticsWorkspaceOnboardingOutput) ToLogAnalyticsWorkspaceOnboardingOutput() LogAnalyticsWorkspaceOnboardingOutput {
	return o
}

func (o LogAnalyticsWorkspaceOnboardingOutput) ToLogAnalyticsWorkspaceOnboardingOutputWithContext(ctx context.Context) LogAnalyticsWorkspaceOnboardingOutput {
	return o
}

// Specifies if the Workspace is using Customer managed key. Defaults to `false`. Changing this forces a new resource to be created.
func (o LogAnalyticsWorkspaceOnboardingOutput) CustomerManagedKeyEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LogAnalyticsWorkspaceOnboarding) pulumi.BoolPtrOutput { return v.CustomerManagedKeyEnabled }).(pulumi.BoolPtrOutput)
}

// Specifies the name of the Resource Group where the Security Insights Sentinel Onboarding States should exist. Changing this forces the Log Analytics Workspace off the board and onboard again.
func (o LogAnalyticsWorkspaceOnboardingOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *LogAnalyticsWorkspaceOnboarding) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// Specifies the Workspace Name. Changing this forces the Log Analytics Workspace off the board and onboard again. Changing this forces a new resource to be created.
func (o LogAnalyticsWorkspaceOnboardingOutput) WorkspaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *LogAnalyticsWorkspaceOnboarding) pulumi.StringOutput { return v.WorkspaceName }).(pulumi.StringOutput)
}

type LogAnalyticsWorkspaceOnboardingArrayOutput struct{ *pulumi.OutputState }

func (LogAnalyticsWorkspaceOnboardingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogAnalyticsWorkspaceOnboarding)(nil)).Elem()
}

func (o LogAnalyticsWorkspaceOnboardingArrayOutput) ToLogAnalyticsWorkspaceOnboardingArrayOutput() LogAnalyticsWorkspaceOnboardingArrayOutput {
	return o
}

func (o LogAnalyticsWorkspaceOnboardingArrayOutput) ToLogAnalyticsWorkspaceOnboardingArrayOutputWithContext(ctx context.Context) LogAnalyticsWorkspaceOnboardingArrayOutput {
	return o
}

func (o LogAnalyticsWorkspaceOnboardingArrayOutput) Index(i pulumi.IntInput) LogAnalyticsWorkspaceOnboardingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogAnalyticsWorkspaceOnboarding {
		return vs[0].([]*LogAnalyticsWorkspaceOnboarding)[vs[1].(int)]
	}).(LogAnalyticsWorkspaceOnboardingOutput)
}

type LogAnalyticsWorkspaceOnboardingMapOutput struct{ *pulumi.OutputState }

func (LogAnalyticsWorkspaceOnboardingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogAnalyticsWorkspaceOnboarding)(nil)).Elem()
}

func (o LogAnalyticsWorkspaceOnboardingMapOutput) ToLogAnalyticsWorkspaceOnboardingMapOutput() LogAnalyticsWorkspaceOnboardingMapOutput {
	return o
}

func (o LogAnalyticsWorkspaceOnboardingMapOutput) ToLogAnalyticsWorkspaceOnboardingMapOutputWithContext(ctx context.Context) LogAnalyticsWorkspaceOnboardingMapOutput {
	return o
}

func (o LogAnalyticsWorkspaceOnboardingMapOutput) MapIndex(k pulumi.StringInput) LogAnalyticsWorkspaceOnboardingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogAnalyticsWorkspaceOnboarding {
		return vs[0].(map[string]*LogAnalyticsWorkspaceOnboarding)[vs[1].(string)]
	}).(LogAnalyticsWorkspaceOnboardingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogAnalyticsWorkspaceOnboardingInput)(nil)).Elem(), &LogAnalyticsWorkspaceOnboarding{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogAnalyticsWorkspaceOnboardingArrayInput)(nil)).Elem(), LogAnalyticsWorkspaceOnboardingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogAnalyticsWorkspaceOnboardingMapInput)(nil)).Elem(), LogAnalyticsWorkspaceOnboardingMap{})
	pulumi.RegisterOutputType(LogAnalyticsWorkspaceOnboardingOutput{})
	pulumi.RegisterOutputType(LogAnalyticsWorkspaceOnboardingArrayOutput{})
	pulumi.RegisterOutputType(LogAnalyticsWorkspaceOnboardingMapOutput{})
}