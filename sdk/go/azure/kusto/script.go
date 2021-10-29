// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kusto

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Kusto Script.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/kusto"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/storage"
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
// 		exampleCluster, err := kusto.NewCluster(ctx, "exampleCluster", &kusto.ClusterArgs{
// 			Location:          exampleResourceGroup.Location,
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Sku: &kusto.ClusterSkuArgs{
// 				Name:     pulumi.String("Dev(No SLA)_Standard_D11_v2"),
// 				Capacity: pulumi.Int(1),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleDatabase, err := kusto.NewDatabase(ctx, "exampleDatabase", &kusto.DatabaseArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Location:          exampleResourceGroup.Location,
// 			ClusterName:       exampleCluster.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleAccount, err := storage.NewAccount(ctx, "exampleAccount", &storage.AccountArgs{
// 			ResourceGroupName:      exampleResourceGroup.Name,
// 			Location:               exampleResourceGroup.Location,
// 			AccountTier:            pulumi.String("Standard"),
// 			AccountReplicationType: pulumi.String("LRS"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleContainer, err := storage.NewContainer(ctx, "exampleContainer", &storage.ContainerArgs{
// 			StorageAccountName:  exampleAccount.Name,
// 			ContainerAccessType: pulumi.String("private"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleBlob, err := storage.NewBlob(ctx, "exampleBlob", &storage.BlobArgs{
// 			StorageAccountName:   exampleAccount.Name,
// 			StorageContainerName: exampleContainer.Name,
// 			Type:                 pulumi.String("Block"),
// 			SourceContent:        pulumi.String(".create table MyTable (Level:string, Timestamp:datetime, UserId:string, TraceId:string, Message:string, ProcessId:int32)"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = kusto.NewScript(ctx, "exampleScript", &kusto.ScriptArgs{
// 			DatabaseId: exampleDatabase.ID(),
// 			Url:        exampleBlob.ID(),
// 			SasToken: exampleAccountBlobContainerSAS.ApplyT(func(exampleAccountBlobContainerSAS storage.GetAccountBlobContainerSASResult) (string, error) {
// 				return exampleAccountBlobContainerSAS.Sas, nil
// 			}).(pulumi.StringOutput),
// 			ContinueOnErrorsEnabled:       pulumi.Bool(true),
// 			ForceAnUpdateWhenValueChanged: pulumi.String("first"),
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
// Kusto Scripts can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:kusto/script:Script example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Kusto/Clusters/cluster1/Databases/database1/Scripts/script1
// ```
type Script struct {
	pulumi.CustomResourceState

	// Flag that indicates whether to continue if one of the command fails.
	ContinueOnErrorsEnabled pulumi.BoolPtrOutput `pulumi:"continueOnErrorsEnabled"`
	// The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
	DatabaseId pulumi.StringOutput `pulumi:"databaseId"`
	// A unique string. If changed the script will be applied again.
	ForceAnUpdateWhenValueChanged pulumi.StringOutput `pulumi:"forceAnUpdateWhenValueChanged"`
	// The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The SAS token used to access the script.
	SasToken pulumi.StringOutput `pulumi:"sasToken"`
	// The url to the KQL script blob file. Please reference [this documentation](https://docs.microsoft.com/en-us/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewScript registers a new resource with the given unique name, arguments, and options.
func NewScript(ctx *pulumi.Context,
	name string, args *ScriptArgs, opts ...pulumi.ResourceOption) (*Script, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseId == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseId'")
	}
	if args.SasToken == nil {
		return nil, errors.New("invalid value for required argument 'SasToken'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	var resource Script
	err := ctx.RegisterResource("azure:kusto/script:Script", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetScript gets an existing Script resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScript(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScriptState, opts ...pulumi.ResourceOption) (*Script, error) {
	var resource Script
	err := ctx.ReadResource("azure:kusto/script:Script", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Script resources.
type scriptState struct {
	// Flag that indicates whether to continue if one of the command fails.
	ContinueOnErrorsEnabled *bool `pulumi:"continueOnErrorsEnabled"`
	// The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
	DatabaseId *string `pulumi:"databaseId"`
	// A unique string. If changed the script will be applied again.
	ForceAnUpdateWhenValueChanged *string `pulumi:"forceAnUpdateWhenValueChanged"`
	// The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
	Name *string `pulumi:"name"`
	// The SAS token used to access the script.
	SasToken *string `pulumi:"sasToken"`
	// The url to the KQL script blob file. Please reference [this documentation](https://docs.microsoft.com/en-us/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
	Url *string `pulumi:"url"`
}

type ScriptState struct {
	// Flag that indicates whether to continue if one of the command fails.
	ContinueOnErrorsEnabled pulumi.BoolPtrInput
	// The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
	DatabaseId pulumi.StringPtrInput
	// A unique string. If changed the script will be applied again.
	ForceAnUpdateWhenValueChanged pulumi.StringPtrInput
	// The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
	Name pulumi.StringPtrInput
	// The SAS token used to access the script.
	SasToken pulumi.StringPtrInput
	// The url to the KQL script blob file. Please reference [this documentation](https://docs.microsoft.com/en-us/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
	Url pulumi.StringPtrInput
}

func (ScriptState) ElementType() reflect.Type {
	return reflect.TypeOf((*scriptState)(nil)).Elem()
}

type scriptArgs struct {
	// Flag that indicates whether to continue if one of the command fails.
	ContinueOnErrorsEnabled *bool `pulumi:"continueOnErrorsEnabled"`
	// The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
	DatabaseId string `pulumi:"databaseId"`
	// A unique string. If changed the script will be applied again.
	ForceAnUpdateWhenValueChanged *string `pulumi:"forceAnUpdateWhenValueChanged"`
	// The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
	Name *string `pulumi:"name"`
	// The SAS token used to access the script.
	SasToken string `pulumi:"sasToken"`
	// The url to the KQL script blob file. Please reference [this documentation](https://docs.microsoft.com/en-us/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a Script resource.
type ScriptArgs struct {
	// Flag that indicates whether to continue if one of the command fails.
	ContinueOnErrorsEnabled pulumi.BoolPtrInput
	// The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
	DatabaseId pulumi.StringInput
	// A unique string. If changed the script will be applied again.
	ForceAnUpdateWhenValueChanged pulumi.StringPtrInput
	// The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
	Name pulumi.StringPtrInput
	// The SAS token used to access the script.
	SasToken pulumi.StringInput
	// The url to the KQL script blob file. Please reference [this documentation](https://docs.microsoft.com/en-us/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
	Url pulumi.StringInput
}

func (ScriptArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scriptArgs)(nil)).Elem()
}

type ScriptInput interface {
	pulumi.Input

	ToScriptOutput() ScriptOutput
	ToScriptOutputWithContext(ctx context.Context) ScriptOutput
}

func (*Script) ElementType() reflect.Type {
	return reflect.TypeOf((*Script)(nil))
}

func (i *Script) ToScriptOutput() ScriptOutput {
	return i.ToScriptOutputWithContext(context.Background())
}

func (i *Script) ToScriptOutputWithContext(ctx context.Context) ScriptOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScriptOutput)
}

func (i *Script) ToScriptPtrOutput() ScriptPtrOutput {
	return i.ToScriptPtrOutputWithContext(context.Background())
}

func (i *Script) ToScriptPtrOutputWithContext(ctx context.Context) ScriptPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScriptPtrOutput)
}

type ScriptPtrInput interface {
	pulumi.Input

	ToScriptPtrOutput() ScriptPtrOutput
	ToScriptPtrOutputWithContext(ctx context.Context) ScriptPtrOutput
}

type scriptPtrType ScriptArgs

func (*scriptPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Script)(nil))
}

func (i *scriptPtrType) ToScriptPtrOutput() ScriptPtrOutput {
	return i.ToScriptPtrOutputWithContext(context.Background())
}

func (i *scriptPtrType) ToScriptPtrOutputWithContext(ctx context.Context) ScriptPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScriptPtrOutput)
}

// ScriptArrayInput is an input type that accepts ScriptArray and ScriptArrayOutput values.
// You can construct a concrete instance of `ScriptArrayInput` via:
//
//          ScriptArray{ ScriptArgs{...} }
type ScriptArrayInput interface {
	pulumi.Input

	ToScriptArrayOutput() ScriptArrayOutput
	ToScriptArrayOutputWithContext(context.Context) ScriptArrayOutput
}

type ScriptArray []ScriptInput

func (ScriptArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Script)(nil)).Elem()
}

func (i ScriptArray) ToScriptArrayOutput() ScriptArrayOutput {
	return i.ToScriptArrayOutputWithContext(context.Background())
}

func (i ScriptArray) ToScriptArrayOutputWithContext(ctx context.Context) ScriptArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScriptArrayOutput)
}

// ScriptMapInput is an input type that accepts ScriptMap and ScriptMapOutput values.
// You can construct a concrete instance of `ScriptMapInput` via:
//
//          ScriptMap{ "key": ScriptArgs{...} }
type ScriptMapInput interface {
	pulumi.Input

	ToScriptMapOutput() ScriptMapOutput
	ToScriptMapOutputWithContext(context.Context) ScriptMapOutput
}

type ScriptMap map[string]ScriptInput

func (ScriptMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Script)(nil)).Elem()
}

func (i ScriptMap) ToScriptMapOutput() ScriptMapOutput {
	return i.ToScriptMapOutputWithContext(context.Background())
}

func (i ScriptMap) ToScriptMapOutputWithContext(ctx context.Context) ScriptMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScriptMapOutput)
}

type ScriptOutput struct{ *pulumi.OutputState }

func (ScriptOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Script)(nil))
}

func (o ScriptOutput) ToScriptOutput() ScriptOutput {
	return o
}

func (o ScriptOutput) ToScriptOutputWithContext(ctx context.Context) ScriptOutput {
	return o
}

func (o ScriptOutput) ToScriptPtrOutput() ScriptPtrOutput {
	return o.ToScriptPtrOutputWithContext(context.Background())
}

func (o ScriptOutput) ToScriptPtrOutputWithContext(ctx context.Context) ScriptPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Script) *Script {
		return &v
	}).(ScriptPtrOutput)
}

type ScriptPtrOutput struct{ *pulumi.OutputState }

func (ScriptPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Script)(nil))
}

func (o ScriptPtrOutput) ToScriptPtrOutput() ScriptPtrOutput {
	return o
}

func (o ScriptPtrOutput) ToScriptPtrOutputWithContext(ctx context.Context) ScriptPtrOutput {
	return o
}

func (o ScriptPtrOutput) Elem() ScriptOutput {
	return o.ApplyT(func(v *Script) Script {
		if v != nil {
			return *v
		}
		var ret Script
		return ret
	}).(ScriptOutput)
}

type ScriptArrayOutput struct{ *pulumi.OutputState }

func (ScriptArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Script)(nil))
}

func (o ScriptArrayOutput) ToScriptArrayOutput() ScriptArrayOutput {
	return o
}

func (o ScriptArrayOutput) ToScriptArrayOutputWithContext(ctx context.Context) ScriptArrayOutput {
	return o
}

func (o ScriptArrayOutput) Index(i pulumi.IntInput) ScriptOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Script {
		return vs[0].([]Script)[vs[1].(int)]
	}).(ScriptOutput)
}

type ScriptMapOutput struct{ *pulumi.OutputState }

func (ScriptMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Script)(nil))
}

func (o ScriptMapOutput) ToScriptMapOutput() ScriptMapOutput {
	return o
}

func (o ScriptMapOutput) ToScriptMapOutputWithContext(ctx context.Context) ScriptMapOutput {
	return o
}

func (o ScriptMapOutput) MapIndex(k pulumi.StringInput) ScriptOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Script {
		return vs[0].(map[string]Script)[vs[1].(string)]
	}).(ScriptOutput)
}

func init() {
	pulumi.RegisterOutputType(ScriptOutput{})
	pulumi.RegisterOutputType(ScriptPtrOutput{})
	pulumi.RegisterOutputType(ScriptArrayOutput{})
	pulumi.RegisterOutputType(ScriptMapOutput{})
}