// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package management

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type GroupPolicyRemediation struct {
	pulumi.CustomResourceState

	LocationFilters       pulumi.StringArrayOutput `pulumi:"locationFilters"`
	ManagementGroupId     pulumi.StringOutput      `pulumi:"managementGroupId"`
	Name                  pulumi.StringOutput      `pulumi:"name"`
	PolicyAssignmentId    pulumi.StringOutput      `pulumi:"policyAssignmentId"`
	PolicyDefinitionId    pulumi.StringPtrOutput   `pulumi:"policyDefinitionId"`
	ResourceDiscoveryMode pulumi.StringPtrOutput   `pulumi:"resourceDiscoveryMode"`
}

// NewGroupPolicyRemediation registers a new resource with the given unique name, arguments, and options.
func NewGroupPolicyRemediation(ctx *pulumi.Context,
	name string, args *GroupPolicyRemediationArgs, opts ...pulumi.ResourceOption) (*GroupPolicyRemediation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ManagementGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ManagementGroupId'")
	}
	if args.PolicyAssignmentId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyAssignmentId'")
	}
	var resource GroupPolicyRemediation
	err := ctx.RegisterResource("azure:management/groupPolicyRemediation:GroupPolicyRemediation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroupPolicyRemediation gets an existing GroupPolicyRemediation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroupPolicyRemediation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupPolicyRemediationState, opts ...pulumi.ResourceOption) (*GroupPolicyRemediation, error) {
	var resource GroupPolicyRemediation
	err := ctx.ReadResource("azure:management/groupPolicyRemediation:GroupPolicyRemediation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GroupPolicyRemediation resources.
type groupPolicyRemediationState struct {
	LocationFilters       []string `pulumi:"locationFilters"`
	ManagementGroupId     *string  `pulumi:"managementGroupId"`
	Name                  *string  `pulumi:"name"`
	PolicyAssignmentId    *string  `pulumi:"policyAssignmentId"`
	PolicyDefinitionId    *string  `pulumi:"policyDefinitionId"`
	ResourceDiscoveryMode *string  `pulumi:"resourceDiscoveryMode"`
}

type GroupPolicyRemediationState struct {
	LocationFilters       pulumi.StringArrayInput
	ManagementGroupId     pulumi.StringPtrInput
	Name                  pulumi.StringPtrInput
	PolicyAssignmentId    pulumi.StringPtrInput
	PolicyDefinitionId    pulumi.StringPtrInput
	ResourceDiscoveryMode pulumi.StringPtrInput
}

func (GroupPolicyRemediationState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupPolicyRemediationState)(nil)).Elem()
}

type groupPolicyRemediationArgs struct {
	LocationFilters       []string `pulumi:"locationFilters"`
	ManagementGroupId     string   `pulumi:"managementGroupId"`
	Name                  *string  `pulumi:"name"`
	PolicyAssignmentId    string   `pulumi:"policyAssignmentId"`
	PolicyDefinitionId    *string  `pulumi:"policyDefinitionId"`
	ResourceDiscoveryMode *string  `pulumi:"resourceDiscoveryMode"`
}

// The set of arguments for constructing a GroupPolicyRemediation resource.
type GroupPolicyRemediationArgs struct {
	LocationFilters       pulumi.StringArrayInput
	ManagementGroupId     pulumi.StringInput
	Name                  pulumi.StringPtrInput
	PolicyAssignmentId    pulumi.StringInput
	PolicyDefinitionId    pulumi.StringPtrInput
	ResourceDiscoveryMode pulumi.StringPtrInput
}

func (GroupPolicyRemediationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupPolicyRemediationArgs)(nil)).Elem()
}

type GroupPolicyRemediationInput interface {
	pulumi.Input

	ToGroupPolicyRemediationOutput() GroupPolicyRemediationOutput
	ToGroupPolicyRemediationOutputWithContext(ctx context.Context) GroupPolicyRemediationOutput
}

func (*GroupPolicyRemediation) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupPolicyRemediation)(nil)).Elem()
}

func (i *GroupPolicyRemediation) ToGroupPolicyRemediationOutput() GroupPolicyRemediationOutput {
	return i.ToGroupPolicyRemediationOutputWithContext(context.Background())
}

func (i *GroupPolicyRemediation) ToGroupPolicyRemediationOutputWithContext(ctx context.Context) GroupPolicyRemediationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupPolicyRemediationOutput)
}

// GroupPolicyRemediationArrayInput is an input type that accepts GroupPolicyRemediationArray and GroupPolicyRemediationArrayOutput values.
// You can construct a concrete instance of `GroupPolicyRemediationArrayInput` via:
//
//          GroupPolicyRemediationArray{ GroupPolicyRemediationArgs{...} }
type GroupPolicyRemediationArrayInput interface {
	pulumi.Input

	ToGroupPolicyRemediationArrayOutput() GroupPolicyRemediationArrayOutput
	ToGroupPolicyRemediationArrayOutputWithContext(context.Context) GroupPolicyRemediationArrayOutput
}

type GroupPolicyRemediationArray []GroupPolicyRemediationInput

func (GroupPolicyRemediationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupPolicyRemediation)(nil)).Elem()
}

func (i GroupPolicyRemediationArray) ToGroupPolicyRemediationArrayOutput() GroupPolicyRemediationArrayOutput {
	return i.ToGroupPolicyRemediationArrayOutputWithContext(context.Background())
}

func (i GroupPolicyRemediationArray) ToGroupPolicyRemediationArrayOutputWithContext(ctx context.Context) GroupPolicyRemediationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupPolicyRemediationArrayOutput)
}

// GroupPolicyRemediationMapInput is an input type that accepts GroupPolicyRemediationMap and GroupPolicyRemediationMapOutput values.
// You can construct a concrete instance of `GroupPolicyRemediationMapInput` via:
//
//          GroupPolicyRemediationMap{ "key": GroupPolicyRemediationArgs{...} }
type GroupPolicyRemediationMapInput interface {
	pulumi.Input

	ToGroupPolicyRemediationMapOutput() GroupPolicyRemediationMapOutput
	ToGroupPolicyRemediationMapOutputWithContext(context.Context) GroupPolicyRemediationMapOutput
}

type GroupPolicyRemediationMap map[string]GroupPolicyRemediationInput

func (GroupPolicyRemediationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupPolicyRemediation)(nil)).Elem()
}

func (i GroupPolicyRemediationMap) ToGroupPolicyRemediationMapOutput() GroupPolicyRemediationMapOutput {
	return i.ToGroupPolicyRemediationMapOutputWithContext(context.Background())
}

func (i GroupPolicyRemediationMap) ToGroupPolicyRemediationMapOutputWithContext(ctx context.Context) GroupPolicyRemediationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupPolicyRemediationMapOutput)
}

type GroupPolicyRemediationOutput struct{ *pulumi.OutputState }

func (GroupPolicyRemediationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupPolicyRemediation)(nil)).Elem()
}

func (o GroupPolicyRemediationOutput) ToGroupPolicyRemediationOutput() GroupPolicyRemediationOutput {
	return o
}

func (o GroupPolicyRemediationOutput) ToGroupPolicyRemediationOutputWithContext(ctx context.Context) GroupPolicyRemediationOutput {
	return o
}

func (o GroupPolicyRemediationOutput) LocationFilters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.StringArrayOutput { return v.LocationFilters }).(pulumi.StringArrayOutput)
}

func (o GroupPolicyRemediationOutput) ManagementGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.StringOutput { return v.ManagementGroupId }).(pulumi.StringOutput)
}

func (o GroupPolicyRemediationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o GroupPolicyRemediationOutput) PolicyAssignmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.StringOutput { return v.PolicyAssignmentId }).(pulumi.StringOutput)
}

func (o GroupPolicyRemediationOutput) PolicyDefinitionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.StringPtrOutput { return v.PolicyDefinitionId }).(pulumi.StringPtrOutput)
}

func (o GroupPolicyRemediationOutput) ResourceDiscoveryMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.StringPtrOutput { return v.ResourceDiscoveryMode }).(pulumi.StringPtrOutput)
}

type GroupPolicyRemediationArrayOutput struct{ *pulumi.OutputState }

func (GroupPolicyRemediationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupPolicyRemediation)(nil)).Elem()
}

func (o GroupPolicyRemediationArrayOutput) ToGroupPolicyRemediationArrayOutput() GroupPolicyRemediationArrayOutput {
	return o
}

func (o GroupPolicyRemediationArrayOutput) ToGroupPolicyRemediationArrayOutputWithContext(ctx context.Context) GroupPolicyRemediationArrayOutput {
	return o
}

func (o GroupPolicyRemediationArrayOutput) Index(i pulumi.IntInput) GroupPolicyRemediationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GroupPolicyRemediation {
		return vs[0].([]*GroupPolicyRemediation)[vs[1].(int)]
	}).(GroupPolicyRemediationOutput)
}

type GroupPolicyRemediationMapOutput struct{ *pulumi.OutputState }

func (GroupPolicyRemediationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupPolicyRemediation)(nil)).Elem()
}

func (o GroupPolicyRemediationMapOutput) ToGroupPolicyRemediationMapOutput() GroupPolicyRemediationMapOutput {
	return o
}

func (o GroupPolicyRemediationMapOutput) ToGroupPolicyRemediationMapOutputWithContext(ctx context.Context) GroupPolicyRemediationMapOutput {
	return o
}

func (o GroupPolicyRemediationMapOutput) MapIndex(k pulumi.StringInput) GroupPolicyRemediationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GroupPolicyRemediation {
		return vs[0].(map[string]*GroupPolicyRemediation)[vs[1].(string)]
	}).(GroupPolicyRemediationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GroupPolicyRemediationInput)(nil)).Elem(), &GroupPolicyRemediation{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupPolicyRemediationArrayInput)(nil)).Elem(), GroupPolicyRemediationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupPolicyRemediationMapInput)(nil)).Elem(), GroupPolicyRemediationMap{})
	pulumi.RegisterOutputType(GroupPolicyRemediationOutput{})
	pulumi.RegisterOutputType(GroupPolicyRemediationArrayOutput{})
	pulumi.RegisterOutputType(GroupPolicyRemediationMapOutput{})
}