// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package netapp

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a NetApp Account Encryption Resource.
//
// For more information about Azure NetApp Files Customer-Managed Keys feature, please refer to [Configure customer-managed keys for Azure NetApp Files volume encryption](https://learn.microsoft.com/en-us/azure/azure-netapp-files/configure-customer-managed-keys)
//
// ## Import
//
// Account Encryption Resources can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:netapp/accountEncryption:AccountEncryption example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1
//
// ```
type AccountEncryption struct {
	pulumi.CustomResourceState

	// The versionless encryption key url.
	EncryptionKey pulumi.StringOutput `pulumi:"encryptionKey"`
	// The ID of the NetApp account where volume under it will have customer managed keys-based encryption enabled.
	NetappAccountId pulumi.StringOutput `pulumi:"netappAccountId"`
	// The ID of the System Assigned Manged Identity. Conflicts with `userAssignedIdentityId`.
	SystemAssignedIdentityPrincipalId pulumi.StringPtrOutput `pulumi:"systemAssignedIdentityPrincipalId"`
	// The ID of the User Assigned Managed Identity. Conflicts with `systemAssignedIdentityPrincipalId`.
	UserAssignedIdentityId pulumi.StringPtrOutput `pulumi:"userAssignedIdentityId"`
}

// NewAccountEncryption registers a new resource with the given unique name, arguments, and options.
func NewAccountEncryption(ctx *pulumi.Context,
	name string, args *AccountEncryptionArgs, opts ...pulumi.ResourceOption) (*AccountEncryption, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EncryptionKey == nil {
		return nil, errors.New("invalid value for required argument 'EncryptionKey'")
	}
	if args.NetappAccountId == nil {
		return nil, errors.New("invalid value for required argument 'NetappAccountId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccountEncryption
	err := ctx.RegisterResource("azure:netapp/accountEncryption:AccountEncryption", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccountEncryption gets an existing AccountEncryption resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccountEncryption(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccountEncryptionState, opts ...pulumi.ResourceOption) (*AccountEncryption, error) {
	var resource AccountEncryption
	err := ctx.ReadResource("azure:netapp/accountEncryption:AccountEncryption", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccountEncryption resources.
type accountEncryptionState struct {
	// The versionless encryption key url.
	EncryptionKey *string `pulumi:"encryptionKey"`
	// The ID of the NetApp account where volume under it will have customer managed keys-based encryption enabled.
	NetappAccountId *string `pulumi:"netappAccountId"`
	// The ID of the System Assigned Manged Identity. Conflicts with `userAssignedIdentityId`.
	SystemAssignedIdentityPrincipalId *string `pulumi:"systemAssignedIdentityPrincipalId"`
	// The ID of the User Assigned Managed Identity. Conflicts with `systemAssignedIdentityPrincipalId`.
	UserAssignedIdentityId *string `pulumi:"userAssignedIdentityId"`
}

type AccountEncryptionState struct {
	// The versionless encryption key url.
	EncryptionKey pulumi.StringPtrInput
	// The ID of the NetApp account where volume under it will have customer managed keys-based encryption enabled.
	NetappAccountId pulumi.StringPtrInput
	// The ID of the System Assigned Manged Identity. Conflicts with `userAssignedIdentityId`.
	SystemAssignedIdentityPrincipalId pulumi.StringPtrInput
	// The ID of the User Assigned Managed Identity. Conflicts with `systemAssignedIdentityPrincipalId`.
	UserAssignedIdentityId pulumi.StringPtrInput
}

func (AccountEncryptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountEncryptionState)(nil)).Elem()
}

type accountEncryptionArgs struct {
	// The versionless encryption key url.
	EncryptionKey string `pulumi:"encryptionKey"`
	// The ID of the NetApp account where volume under it will have customer managed keys-based encryption enabled.
	NetappAccountId string `pulumi:"netappAccountId"`
	// The ID of the System Assigned Manged Identity. Conflicts with `userAssignedIdentityId`.
	SystemAssignedIdentityPrincipalId *string `pulumi:"systemAssignedIdentityPrincipalId"`
	// The ID of the User Assigned Managed Identity. Conflicts with `systemAssignedIdentityPrincipalId`.
	UserAssignedIdentityId *string `pulumi:"userAssignedIdentityId"`
}

// The set of arguments for constructing a AccountEncryption resource.
type AccountEncryptionArgs struct {
	// The versionless encryption key url.
	EncryptionKey pulumi.StringInput
	// The ID of the NetApp account where volume under it will have customer managed keys-based encryption enabled.
	NetappAccountId pulumi.StringInput
	// The ID of the System Assigned Manged Identity. Conflicts with `userAssignedIdentityId`.
	SystemAssignedIdentityPrincipalId pulumi.StringPtrInput
	// The ID of the User Assigned Managed Identity. Conflicts with `systemAssignedIdentityPrincipalId`.
	UserAssignedIdentityId pulumi.StringPtrInput
}

func (AccountEncryptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accountEncryptionArgs)(nil)).Elem()
}

type AccountEncryptionInput interface {
	pulumi.Input

	ToAccountEncryptionOutput() AccountEncryptionOutput
	ToAccountEncryptionOutputWithContext(ctx context.Context) AccountEncryptionOutput
}

func (*AccountEncryption) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountEncryption)(nil)).Elem()
}

func (i *AccountEncryption) ToAccountEncryptionOutput() AccountEncryptionOutput {
	return i.ToAccountEncryptionOutputWithContext(context.Background())
}

func (i *AccountEncryption) ToAccountEncryptionOutputWithContext(ctx context.Context) AccountEncryptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountEncryptionOutput)
}

// AccountEncryptionArrayInput is an input type that accepts AccountEncryptionArray and AccountEncryptionArrayOutput values.
// You can construct a concrete instance of `AccountEncryptionArrayInput` via:
//
//	AccountEncryptionArray{ AccountEncryptionArgs{...} }
type AccountEncryptionArrayInput interface {
	pulumi.Input

	ToAccountEncryptionArrayOutput() AccountEncryptionArrayOutput
	ToAccountEncryptionArrayOutputWithContext(context.Context) AccountEncryptionArrayOutput
}

type AccountEncryptionArray []AccountEncryptionInput

func (AccountEncryptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccountEncryption)(nil)).Elem()
}

func (i AccountEncryptionArray) ToAccountEncryptionArrayOutput() AccountEncryptionArrayOutput {
	return i.ToAccountEncryptionArrayOutputWithContext(context.Background())
}

func (i AccountEncryptionArray) ToAccountEncryptionArrayOutputWithContext(ctx context.Context) AccountEncryptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountEncryptionArrayOutput)
}

// AccountEncryptionMapInput is an input type that accepts AccountEncryptionMap and AccountEncryptionMapOutput values.
// You can construct a concrete instance of `AccountEncryptionMapInput` via:
//
//	AccountEncryptionMap{ "key": AccountEncryptionArgs{...} }
type AccountEncryptionMapInput interface {
	pulumi.Input

	ToAccountEncryptionMapOutput() AccountEncryptionMapOutput
	ToAccountEncryptionMapOutputWithContext(context.Context) AccountEncryptionMapOutput
}

type AccountEncryptionMap map[string]AccountEncryptionInput

func (AccountEncryptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccountEncryption)(nil)).Elem()
}

func (i AccountEncryptionMap) ToAccountEncryptionMapOutput() AccountEncryptionMapOutput {
	return i.ToAccountEncryptionMapOutputWithContext(context.Background())
}

func (i AccountEncryptionMap) ToAccountEncryptionMapOutputWithContext(ctx context.Context) AccountEncryptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountEncryptionMapOutput)
}

type AccountEncryptionOutput struct{ *pulumi.OutputState }

func (AccountEncryptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountEncryption)(nil)).Elem()
}

func (o AccountEncryptionOutput) ToAccountEncryptionOutput() AccountEncryptionOutput {
	return o
}

func (o AccountEncryptionOutput) ToAccountEncryptionOutputWithContext(ctx context.Context) AccountEncryptionOutput {
	return o
}

// The versionless encryption key url.
func (o AccountEncryptionOutput) EncryptionKey() pulumi.StringOutput {
	return o.ApplyT(func(v *AccountEncryption) pulumi.StringOutput { return v.EncryptionKey }).(pulumi.StringOutput)
}

// The ID of the NetApp account where volume under it will have customer managed keys-based encryption enabled.
func (o AccountEncryptionOutput) NetappAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccountEncryption) pulumi.StringOutput { return v.NetappAccountId }).(pulumi.StringOutput)
}

// The ID of the System Assigned Manged Identity. Conflicts with `userAssignedIdentityId`.
func (o AccountEncryptionOutput) SystemAssignedIdentityPrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccountEncryption) pulumi.StringPtrOutput { return v.SystemAssignedIdentityPrincipalId }).(pulumi.StringPtrOutput)
}

// The ID of the User Assigned Managed Identity. Conflicts with `systemAssignedIdentityPrincipalId`.
func (o AccountEncryptionOutput) UserAssignedIdentityId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccountEncryption) pulumi.StringPtrOutput { return v.UserAssignedIdentityId }).(pulumi.StringPtrOutput)
}

type AccountEncryptionArrayOutput struct{ *pulumi.OutputState }

func (AccountEncryptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccountEncryption)(nil)).Elem()
}

func (o AccountEncryptionArrayOutput) ToAccountEncryptionArrayOutput() AccountEncryptionArrayOutput {
	return o
}

func (o AccountEncryptionArrayOutput) ToAccountEncryptionArrayOutputWithContext(ctx context.Context) AccountEncryptionArrayOutput {
	return o
}

func (o AccountEncryptionArrayOutput) Index(i pulumi.IntInput) AccountEncryptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccountEncryption {
		return vs[0].([]*AccountEncryption)[vs[1].(int)]
	}).(AccountEncryptionOutput)
}

type AccountEncryptionMapOutput struct{ *pulumi.OutputState }

func (AccountEncryptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccountEncryption)(nil)).Elem()
}

func (o AccountEncryptionMapOutput) ToAccountEncryptionMapOutput() AccountEncryptionMapOutput {
	return o
}

func (o AccountEncryptionMapOutput) ToAccountEncryptionMapOutputWithContext(ctx context.Context) AccountEncryptionMapOutput {
	return o
}

func (o AccountEncryptionMapOutput) MapIndex(k pulumi.StringInput) AccountEncryptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccountEncryption {
		return vs[0].(map[string]*AccountEncryption)[vs[1].(string)]
	}).(AccountEncryptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccountEncryptionInput)(nil)).Elem(), &AccountEncryption{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountEncryptionArrayInput)(nil)).Elem(), AccountEncryptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountEncryptionMapInput)(nil)).Elem(), AccountEncryptionMap{})
	pulumi.RegisterOutputType(AccountEncryptionOutput{})
	pulumi.RegisterOutputType(AccountEncryptionArrayOutput{})
	pulumi.RegisterOutputType(AccountEncryptionMapOutput{})
}