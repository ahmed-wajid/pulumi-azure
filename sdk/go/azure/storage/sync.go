// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a Storage Sync.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/storage"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
// 			Location: pulumi.String("West Europe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = storage.NewSync(ctx, "test", &storage.SyncArgs{
// 			ResourceGroupName: pulumi.Any(azurerm_resource_group.Test.Name),
// 			Location:          pulumi.Any(azurerm_resource_group.Test.Location),
// 			Tags: pulumi.StringMap{
// 				"foo": pulumi.String("bar"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Sync struct {
	pulumi.CustomResourceState

	// Incoming traffic policy. Possible values are `AllowAllTraffic` and `AllowVirtualNetworksOnly`.
	IncomingTrafficPolicy pulumi.StringPtrOutput `pulumi:"incomingTrafficPolicy"`
	// The Azure Region where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name which should be used for this Storage Sync. Changing this forces a new Storage Sync to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Storage Sync.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewSync registers a new resource with the given unique name, arguments, and options.
func NewSync(ctx *pulumi.Context,
	name string, args *SyncArgs, opts ...pulumi.ResourceOption) (*Sync, error) {
	if args == nil || args.ResourceGroupName == nil {
		return nil, errors.New("missing required argument 'ResourceGroupName'")
	}
	if args == nil {
		args = &SyncArgs{}
	}
	var resource Sync
	err := ctx.RegisterResource("azure:storage/sync:Sync", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSync gets an existing Sync resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSync(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SyncState, opts ...pulumi.ResourceOption) (*Sync, error) {
	var resource Sync
	err := ctx.ReadResource("azure:storage/sync:Sync", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Sync resources.
type syncState struct {
	// Incoming traffic policy. Possible values are `AllowAllTraffic` and `AllowVirtualNetworksOnly`.
	IncomingTrafficPolicy *string `pulumi:"incomingTrafficPolicy"`
	// The Azure Region where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Storage Sync. Changing this forces a new Storage Sync to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Storage Sync.
	Tags map[string]string `pulumi:"tags"`
}

type SyncState struct {
	// Incoming traffic policy. Possible values are `AllowAllTraffic` and `AllowVirtualNetworksOnly`.
	IncomingTrafficPolicy pulumi.StringPtrInput
	// The Azure Region where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Storage Sync. Changing this forces a new Storage Sync to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Storage Sync.
	Tags pulumi.StringMapInput
}

func (SyncState) ElementType() reflect.Type {
	return reflect.TypeOf((*syncState)(nil)).Elem()
}

type syncArgs struct {
	// Incoming traffic policy. Possible values are `AllowAllTraffic` and `AllowVirtualNetworksOnly`.
	IncomingTrafficPolicy *string `pulumi:"incomingTrafficPolicy"`
	// The Azure Region where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Storage Sync. Changing this forces a new Storage Sync to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Storage Sync.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Sync resource.
type SyncArgs struct {
	// Incoming traffic policy. Possible values are `AllowAllTraffic` and `AllowVirtualNetworksOnly`.
	IncomingTrafficPolicy pulumi.StringPtrInput
	// The Azure Region where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Storage Sync. Changing this forces a new Storage Sync to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Storage Sync.
	Tags pulumi.StringMapInput
}

func (SyncArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*syncArgs)(nil)).Elem()
}