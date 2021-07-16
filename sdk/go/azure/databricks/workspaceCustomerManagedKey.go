// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Customer Managed Key for a Databricks Workspace
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/databricks"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/keyvault"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		current, err := core.GetClientConfig(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
// 			Location: pulumi.String("West Europe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleWorkspace, err := databricks.NewWorkspace(ctx, "exampleWorkspace", &databricks.WorkspaceArgs{
// 			ResourceGroupName:         exampleResourceGroup.Name,
// 			Location:                  exampleResourceGroup.Location,
// 			Sku:                       pulumi.String("premium"),
// 			CustomerManagedKeyEnabled: pulumi.Bool(true),
// 			Tags: pulumi.StringMap{
// 				"Environment": pulumi.String("Production"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleKeyVault, err := keyvault.NewKeyVault(ctx, "exampleKeyVault", &keyvault.KeyVaultArgs{
// 			Location:               exampleResourceGroup.Location,
// 			ResourceGroupName:      exampleResourceGroup.Name,
// 			TenantId:               pulumi.String(current.TenantId),
// 			SkuName:                pulumi.String("premium"),
// 			PurgeProtectionEnabled: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		databricks, err := keyvault.NewAccessPolicy(ctx, "databricks", &keyvault.AccessPolicyArgs{
// 			KeyVaultId: exampleKeyVault.ID(),
// 			TenantId: exampleWorkspace.StorageAccountIdentities.ApplyT(func(storageAccountIdentities []databricks.WorkspaceStorageAccountIdentity) (string, error) {
// 				return storageAccountIdentities[0].TenantId, nil
// 			}).(pulumi.StringOutput),
// 			ObjectId: exampleWorkspace.StorageAccountIdentities.ApplyT(func(storageAccountIdentities []databricks.WorkspaceStorageAccountIdentity) (string, error) {
// 				return storageAccountIdentities[0].PrincipalId, nil
// 			}).(pulumi.StringOutput),
// 			KeyPermissions: pulumi.StringArray{
// 				pulumi.String("get"),
// 				pulumi.String("unwrapKey"),
// 				pulumi.String("wrapKey"),
// 			},
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			exampleWorkspace,
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		_, err = databricks.NewWorkspaceCustomerManagedKey(ctx, "exampleWorkspaceCustomerManagedKey", &databricks.WorkspaceCustomerManagedKeyArgs{
// 			WorkspaceId:   exampleWorkspace.ID(),
// 			KeyVaultKeyId: exampleKeyVault.ID(),
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			databricks,
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		exampleAccessPolicy, err := keyvault.NewAccessPolicy(ctx, "exampleAccessPolicy", &keyvault.AccessPolicyArgs{
// 			KeyVaultId: exampleKeyVault.ID(),
// 			TenantId:   exampleKeyVault.TenantId,
// 			ObjectId:   pulumi.String(current.ObjectId),
// 			KeyPermissions: pulumi.StringArray{
// 				pulumi.String("get"),
// 				pulumi.String("list"),
// 				pulumi.String("create"),
// 				pulumi.String("decrypt"),
// 				pulumi.String("encrypt"),
// 				pulumi.String("sign"),
// 				pulumi.String("unwrapKey"),
// 				pulumi.String("verify"),
// 				pulumi.String("wrapKey"),
// 				pulumi.String("delete"),
// 				pulumi.String("restore"),
// 				pulumi.String("recover"),
// 				pulumi.String("update"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = keyvault.NewKey(ctx, "exampleKey", &keyvault.KeyArgs{
// 			KeyVaultId: exampleKeyVault.ID(),
// 			KeyType:    pulumi.String("RSA"),
// 			KeySize:    pulumi.Int(2048),
// 			KeyOpts: pulumi.StringArray{
// 				pulumi.String("decrypt"),
// 				pulumi.String("encrypt"),
// 				pulumi.String("sign"),
// 				pulumi.String("unwrapKey"),
// 				pulumi.String("verify"),
// 				pulumi.String("wrapKey"),
// 			},
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			exampleAccessPolicy,
// 		}))
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
// Databricks Workspace Customer Managed Key can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:databricks/workspaceCustomerManagedKey:WorkspaceCustomerManagedKey workspace1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Databricks/customerManagedKey/workspace1
// ```
type WorkspaceCustomerManagedKey struct {
	pulumi.CustomResourceState

	// The ID of the Key Vault.
	KeyVaultKeyId pulumi.StringOutput `pulumi:"keyVaultKeyId"`
	// The ID of the Databricks workspace.
	WorkspaceId pulumi.StringOutput `pulumi:"workspaceId"`
}

// NewWorkspaceCustomerManagedKey registers a new resource with the given unique name, arguments, and options.
func NewWorkspaceCustomerManagedKey(ctx *pulumi.Context,
	name string, args *WorkspaceCustomerManagedKeyArgs, opts ...pulumi.ResourceOption) (*WorkspaceCustomerManagedKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KeyVaultKeyId == nil {
		return nil, errors.New("invalid value for required argument 'KeyVaultKeyId'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	var resource WorkspaceCustomerManagedKey
	err := ctx.RegisterResource("azure:databricks/workspaceCustomerManagedKey:WorkspaceCustomerManagedKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkspaceCustomerManagedKey gets an existing WorkspaceCustomerManagedKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkspaceCustomerManagedKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkspaceCustomerManagedKeyState, opts ...pulumi.ResourceOption) (*WorkspaceCustomerManagedKey, error) {
	var resource WorkspaceCustomerManagedKey
	err := ctx.ReadResource("azure:databricks/workspaceCustomerManagedKey:WorkspaceCustomerManagedKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkspaceCustomerManagedKey resources.
type workspaceCustomerManagedKeyState struct {
	// The ID of the Key Vault.
	KeyVaultKeyId *string `pulumi:"keyVaultKeyId"`
	// The ID of the Databricks workspace.
	WorkspaceId *string `pulumi:"workspaceId"`
}

type WorkspaceCustomerManagedKeyState struct {
	// The ID of the Key Vault.
	KeyVaultKeyId pulumi.StringPtrInput
	// The ID of the Databricks workspace.
	WorkspaceId pulumi.StringPtrInput
}

func (WorkspaceCustomerManagedKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceCustomerManagedKeyState)(nil)).Elem()
}

type workspaceCustomerManagedKeyArgs struct {
	// The ID of the Key Vault.
	KeyVaultKeyId string `pulumi:"keyVaultKeyId"`
	// The ID of the Databricks workspace.
	WorkspaceId string `pulumi:"workspaceId"`
}

// The set of arguments for constructing a WorkspaceCustomerManagedKey resource.
type WorkspaceCustomerManagedKeyArgs struct {
	// The ID of the Key Vault.
	KeyVaultKeyId pulumi.StringInput
	// The ID of the Databricks workspace.
	WorkspaceId pulumi.StringInput
}

func (WorkspaceCustomerManagedKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceCustomerManagedKeyArgs)(nil)).Elem()
}

type WorkspaceCustomerManagedKeyInput interface {
	pulumi.Input

	ToWorkspaceCustomerManagedKeyOutput() WorkspaceCustomerManagedKeyOutput
	ToWorkspaceCustomerManagedKeyOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyOutput
}

func (*WorkspaceCustomerManagedKey) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkspaceCustomerManagedKey)(nil))
}

func (i *WorkspaceCustomerManagedKey) ToWorkspaceCustomerManagedKeyOutput() WorkspaceCustomerManagedKeyOutput {
	return i.ToWorkspaceCustomerManagedKeyOutputWithContext(context.Background())
}

func (i *WorkspaceCustomerManagedKey) ToWorkspaceCustomerManagedKeyOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceCustomerManagedKeyOutput)
}

func (i *WorkspaceCustomerManagedKey) ToWorkspaceCustomerManagedKeyPtrOutput() WorkspaceCustomerManagedKeyPtrOutput {
	return i.ToWorkspaceCustomerManagedKeyPtrOutputWithContext(context.Background())
}

func (i *WorkspaceCustomerManagedKey) ToWorkspaceCustomerManagedKeyPtrOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceCustomerManagedKeyPtrOutput)
}

type WorkspaceCustomerManagedKeyPtrInput interface {
	pulumi.Input

	ToWorkspaceCustomerManagedKeyPtrOutput() WorkspaceCustomerManagedKeyPtrOutput
	ToWorkspaceCustomerManagedKeyPtrOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyPtrOutput
}

type workspaceCustomerManagedKeyPtrType WorkspaceCustomerManagedKeyArgs

func (*workspaceCustomerManagedKeyPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceCustomerManagedKey)(nil))
}

func (i *workspaceCustomerManagedKeyPtrType) ToWorkspaceCustomerManagedKeyPtrOutput() WorkspaceCustomerManagedKeyPtrOutput {
	return i.ToWorkspaceCustomerManagedKeyPtrOutputWithContext(context.Background())
}

func (i *workspaceCustomerManagedKeyPtrType) ToWorkspaceCustomerManagedKeyPtrOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceCustomerManagedKeyPtrOutput)
}

// WorkspaceCustomerManagedKeyArrayInput is an input type that accepts WorkspaceCustomerManagedKeyArray and WorkspaceCustomerManagedKeyArrayOutput values.
// You can construct a concrete instance of `WorkspaceCustomerManagedKeyArrayInput` via:
//
//          WorkspaceCustomerManagedKeyArray{ WorkspaceCustomerManagedKeyArgs{...} }
type WorkspaceCustomerManagedKeyArrayInput interface {
	pulumi.Input

	ToWorkspaceCustomerManagedKeyArrayOutput() WorkspaceCustomerManagedKeyArrayOutput
	ToWorkspaceCustomerManagedKeyArrayOutputWithContext(context.Context) WorkspaceCustomerManagedKeyArrayOutput
}

type WorkspaceCustomerManagedKeyArray []WorkspaceCustomerManagedKeyInput

func (WorkspaceCustomerManagedKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*WorkspaceCustomerManagedKey)(nil))
}

func (i WorkspaceCustomerManagedKeyArray) ToWorkspaceCustomerManagedKeyArrayOutput() WorkspaceCustomerManagedKeyArrayOutput {
	return i.ToWorkspaceCustomerManagedKeyArrayOutputWithContext(context.Background())
}

func (i WorkspaceCustomerManagedKeyArray) ToWorkspaceCustomerManagedKeyArrayOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceCustomerManagedKeyArrayOutput)
}

// WorkspaceCustomerManagedKeyMapInput is an input type that accepts WorkspaceCustomerManagedKeyMap and WorkspaceCustomerManagedKeyMapOutput values.
// You can construct a concrete instance of `WorkspaceCustomerManagedKeyMapInput` via:
//
//          WorkspaceCustomerManagedKeyMap{ "key": WorkspaceCustomerManagedKeyArgs{...} }
type WorkspaceCustomerManagedKeyMapInput interface {
	pulumi.Input

	ToWorkspaceCustomerManagedKeyMapOutput() WorkspaceCustomerManagedKeyMapOutput
	ToWorkspaceCustomerManagedKeyMapOutputWithContext(context.Context) WorkspaceCustomerManagedKeyMapOutput
}

type WorkspaceCustomerManagedKeyMap map[string]WorkspaceCustomerManagedKeyInput

func (WorkspaceCustomerManagedKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*WorkspaceCustomerManagedKey)(nil))
}

func (i WorkspaceCustomerManagedKeyMap) ToWorkspaceCustomerManagedKeyMapOutput() WorkspaceCustomerManagedKeyMapOutput {
	return i.ToWorkspaceCustomerManagedKeyMapOutputWithContext(context.Background())
}

func (i WorkspaceCustomerManagedKeyMap) ToWorkspaceCustomerManagedKeyMapOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceCustomerManagedKeyMapOutput)
}

type WorkspaceCustomerManagedKeyOutput struct {
	*pulumi.OutputState
}

func (WorkspaceCustomerManagedKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkspaceCustomerManagedKey)(nil))
}

func (o WorkspaceCustomerManagedKeyOutput) ToWorkspaceCustomerManagedKeyOutput() WorkspaceCustomerManagedKeyOutput {
	return o
}

func (o WorkspaceCustomerManagedKeyOutput) ToWorkspaceCustomerManagedKeyOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyOutput {
	return o
}

func (o WorkspaceCustomerManagedKeyOutput) ToWorkspaceCustomerManagedKeyPtrOutput() WorkspaceCustomerManagedKeyPtrOutput {
	return o.ToWorkspaceCustomerManagedKeyPtrOutputWithContext(context.Background())
}

func (o WorkspaceCustomerManagedKeyOutput) ToWorkspaceCustomerManagedKeyPtrOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyPtrOutput {
	return o.ApplyT(func(v WorkspaceCustomerManagedKey) *WorkspaceCustomerManagedKey {
		return &v
	}).(WorkspaceCustomerManagedKeyPtrOutput)
}

type WorkspaceCustomerManagedKeyPtrOutput struct {
	*pulumi.OutputState
}

func (WorkspaceCustomerManagedKeyPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceCustomerManagedKey)(nil))
}

func (o WorkspaceCustomerManagedKeyPtrOutput) ToWorkspaceCustomerManagedKeyPtrOutput() WorkspaceCustomerManagedKeyPtrOutput {
	return o
}

func (o WorkspaceCustomerManagedKeyPtrOutput) ToWorkspaceCustomerManagedKeyPtrOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyPtrOutput {
	return o
}

type WorkspaceCustomerManagedKeyArrayOutput struct{ *pulumi.OutputState }

func (WorkspaceCustomerManagedKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WorkspaceCustomerManagedKey)(nil))
}

func (o WorkspaceCustomerManagedKeyArrayOutput) ToWorkspaceCustomerManagedKeyArrayOutput() WorkspaceCustomerManagedKeyArrayOutput {
	return o
}

func (o WorkspaceCustomerManagedKeyArrayOutput) ToWorkspaceCustomerManagedKeyArrayOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyArrayOutput {
	return o
}

func (o WorkspaceCustomerManagedKeyArrayOutput) Index(i pulumi.IntInput) WorkspaceCustomerManagedKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) WorkspaceCustomerManagedKey {
		return vs[0].([]WorkspaceCustomerManagedKey)[vs[1].(int)]
	}).(WorkspaceCustomerManagedKeyOutput)
}

type WorkspaceCustomerManagedKeyMapOutput struct{ *pulumi.OutputState }

func (WorkspaceCustomerManagedKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]WorkspaceCustomerManagedKey)(nil))
}

func (o WorkspaceCustomerManagedKeyMapOutput) ToWorkspaceCustomerManagedKeyMapOutput() WorkspaceCustomerManagedKeyMapOutput {
	return o
}

func (o WorkspaceCustomerManagedKeyMapOutput) ToWorkspaceCustomerManagedKeyMapOutputWithContext(ctx context.Context) WorkspaceCustomerManagedKeyMapOutput {
	return o
}

func (o WorkspaceCustomerManagedKeyMapOutput) MapIndex(k pulumi.StringInput) WorkspaceCustomerManagedKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) WorkspaceCustomerManagedKey {
		return vs[0].(map[string]WorkspaceCustomerManagedKey)[vs[1].(string)]
	}).(WorkspaceCustomerManagedKeyOutput)
}

func init() {
	pulumi.RegisterOutputType(WorkspaceCustomerManagedKeyOutput{})
	pulumi.RegisterOutputType(WorkspaceCustomerManagedKeyPtrOutput{})
	pulumi.RegisterOutputType(WorkspaceCustomerManagedKeyArrayOutput{})
	pulumi.RegisterOutputType(WorkspaceCustomerManagedKeyMapOutput{})
}