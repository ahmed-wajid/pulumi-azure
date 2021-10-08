// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package datalake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type StoreIdentity struct {
	PrincipalId *string `pulumi:"principalId"`
	TenantId    *string `pulumi:"tenantId"`
	// The Type of Identity which should be used for this Data Lake Store Account. At this time the only possible value is `SystemAssigned`.
	Type string `pulumi:"type"`
}

// StoreIdentityInput is an input type that accepts StoreIdentityArgs and StoreIdentityOutput values.
// You can construct a concrete instance of `StoreIdentityInput` via:
//
//          StoreIdentityArgs{...}
type StoreIdentityInput interface {
	pulumi.Input

	ToStoreIdentityOutput() StoreIdentityOutput
	ToStoreIdentityOutputWithContext(context.Context) StoreIdentityOutput
}

type StoreIdentityArgs struct {
	PrincipalId pulumi.StringPtrInput `pulumi:"principalId"`
	TenantId    pulumi.StringPtrInput `pulumi:"tenantId"`
	// The Type of Identity which should be used for this Data Lake Store Account. At this time the only possible value is `SystemAssigned`.
	Type pulumi.StringInput `pulumi:"type"`
}

func (StoreIdentityArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreIdentity)(nil)).Elem()
}

func (i StoreIdentityArgs) ToStoreIdentityOutput() StoreIdentityOutput {
	return i.ToStoreIdentityOutputWithContext(context.Background())
}

func (i StoreIdentityArgs) ToStoreIdentityOutputWithContext(ctx context.Context) StoreIdentityOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIdentityOutput)
}

func (i StoreIdentityArgs) ToStoreIdentityPtrOutput() StoreIdentityPtrOutput {
	return i.ToStoreIdentityPtrOutputWithContext(context.Background())
}

func (i StoreIdentityArgs) ToStoreIdentityPtrOutputWithContext(ctx context.Context) StoreIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIdentityOutput).ToStoreIdentityPtrOutputWithContext(ctx)
}

// StoreIdentityPtrInput is an input type that accepts StoreIdentityArgs, StoreIdentityPtr and StoreIdentityPtrOutput values.
// You can construct a concrete instance of `StoreIdentityPtrInput` via:
//
//          StoreIdentityArgs{...}
//
//  or:
//
//          nil
type StoreIdentityPtrInput interface {
	pulumi.Input

	ToStoreIdentityPtrOutput() StoreIdentityPtrOutput
	ToStoreIdentityPtrOutputWithContext(context.Context) StoreIdentityPtrOutput
}

type storeIdentityPtrType StoreIdentityArgs

func StoreIdentityPtr(v *StoreIdentityArgs) StoreIdentityPtrInput {
	return (*storeIdentityPtrType)(v)
}

func (*storeIdentityPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**StoreIdentity)(nil)).Elem()
}

func (i *storeIdentityPtrType) ToStoreIdentityPtrOutput() StoreIdentityPtrOutput {
	return i.ToStoreIdentityPtrOutputWithContext(context.Background())
}

func (i *storeIdentityPtrType) ToStoreIdentityPtrOutputWithContext(ctx context.Context) StoreIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIdentityPtrOutput)
}

type StoreIdentityOutput struct{ *pulumi.OutputState }

func (StoreIdentityOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*StoreIdentity)(nil)).Elem()
}

func (o StoreIdentityOutput) ToStoreIdentityOutput() StoreIdentityOutput {
	return o
}

func (o StoreIdentityOutput) ToStoreIdentityOutputWithContext(ctx context.Context) StoreIdentityOutput {
	return o
}

func (o StoreIdentityOutput) ToStoreIdentityPtrOutput() StoreIdentityPtrOutput {
	return o.ToStoreIdentityPtrOutputWithContext(context.Background())
}

func (o StoreIdentityOutput) ToStoreIdentityPtrOutputWithContext(ctx context.Context) StoreIdentityPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v StoreIdentity) *StoreIdentity {
		return &v
	}).(StoreIdentityPtrOutput)
}

func (o StoreIdentityOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v StoreIdentity) *string { return v.PrincipalId }).(pulumi.StringPtrOutput)
}

func (o StoreIdentityOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v StoreIdentity) *string { return v.TenantId }).(pulumi.StringPtrOutput)
}

// The Type of Identity which should be used for this Data Lake Store Account. At this time the only possible value is `SystemAssigned`.
func (o StoreIdentityOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v StoreIdentity) string { return v.Type }).(pulumi.StringOutput)
}

type StoreIdentityPtrOutput struct{ *pulumi.OutputState }

func (StoreIdentityPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StoreIdentity)(nil)).Elem()
}

func (o StoreIdentityPtrOutput) ToStoreIdentityPtrOutput() StoreIdentityPtrOutput {
	return o
}

func (o StoreIdentityPtrOutput) ToStoreIdentityPtrOutputWithContext(ctx context.Context) StoreIdentityPtrOutput {
	return o
}

func (o StoreIdentityPtrOutput) Elem() StoreIdentityOutput {
	return o.ApplyT(func(v *StoreIdentity) StoreIdentity {
		if v != nil {
			return *v
		}
		var ret StoreIdentity
		return ret
	}).(StoreIdentityOutput)
}

func (o StoreIdentityPtrOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StoreIdentity) *string {
		if v == nil {
			return nil
		}
		return v.PrincipalId
	}).(pulumi.StringPtrOutput)
}

func (o StoreIdentityPtrOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StoreIdentity) *string {
		if v == nil {
			return nil
		}
		return v.TenantId
	}).(pulumi.StringPtrOutput)
}

// The Type of Identity which should be used for this Data Lake Store Account. At this time the only possible value is `SystemAssigned`.
func (o StoreIdentityPtrOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StoreIdentity) *string {
		if v == nil {
			return nil
		}
		return &v.Type
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StoreIdentityInput)(nil)).Elem(), StoreIdentityArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*StoreIdentityPtrInput)(nil)).Elem(), StoreIdentityArgs{})
	pulumi.RegisterOutputType(StoreIdentityOutput{})
	pulumi.RegisterOutputType(StoreIdentityPtrOutput{})
}