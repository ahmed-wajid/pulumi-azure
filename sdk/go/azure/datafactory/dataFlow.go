// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package datafactory

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Data Flow inside an Azure Data Factory.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/datafactory"
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
// 		exampleAccount, err := storage.NewAccount(ctx, "exampleAccount", &storage.AccountArgs{
// 			Location:               exampleResourceGroup.Location,
// 			ResourceGroupName:      exampleResourceGroup.Name,
// 			AccountTier:            pulumi.String("Standard"),
// 			AccountReplicationType: pulumi.String("LRS"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleFactory, err := datafactory.NewFactory(ctx, "exampleFactory", &datafactory.FactoryArgs{
// 			Location:          exampleResourceGroup.Location,
// 			ResourceGroupName: exampleResourceGroup.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleLinkedCustomService, err := datafactory.NewLinkedCustomService(ctx, "exampleLinkedCustomService", &datafactory.LinkedCustomServiceArgs{
// 			DataFactoryId: exampleFactory.ID(),
// 			Type:          pulumi.String("AzureBlobStorage"),
// 			TypePropertiesJson: exampleAccount.PrimaryConnectionString.ApplyT(func(primaryConnectionString string) (string, error) {
// 				return fmt.Sprintf("%v%v%v%v%v", "{\n", "  \"connectionString\": \"", primaryConnectionString, "\"\n", "}\n"), nil
// 			}).(pulumi.StringOutput),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		example1, err := datafactory.NewDatasetJson(ctx, "example1", &datafactory.DatasetJsonArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			DataFactoryName:   exampleFactory.Name,
// 			LinkedServiceName: exampleLinkedCustomService.Name,
// 			AzureBlobStorageLocation: &datafactory.DatasetJsonAzureBlobStorageLocationArgs{
// 				Container: pulumi.String("container"),
// 				Path:      pulumi.String("foo/bar/"),
// 				Filename:  pulumi.String("foo.txt"),
// 			},
// 			Encoding: pulumi.String("UTF-8"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		example2, err := datafactory.NewDatasetJson(ctx, "example2", &datafactory.DatasetJsonArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			DataFactoryName:   exampleFactory.Name,
// 			LinkedServiceName: exampleLinkedCustomService.Name,
// 			AzureBlobStorageLocation: &datafactory.DatasetJsonAzureBlobStorageLocationArgs{
// 				Container: pulumi.String("container"),
// 				Path:      pulumi.String("foo/bar/"),
// 				Filename:  pulumi.String("bar.txt"),
// 			},
// 			Encoding: pulumi.String("UTF-8"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = datafactory.NewDataFlow(ctx, "exampleDataFlow", &datafactory.DataFlowArgs{
// 			DataFactoryId: exampleFactory.ID(),
// 			Sources: datafactory.DataFlowSourceArray{
// 				&datafactory.DataFlowSourceArgs{
// 					Name: pulumi.String("source1"),
// 					Dataset: &datafactory.DataFlowSourceDatasetArgs{
// 						Name: example1.Name,
// 					},
// 				},
// 			},
// 			Sinks: datafactory.DataFlowSinkArray{
// 				&datafactory.DataFlowSinkArgs{
// 					Name: pulumi.String("sink1"),
// 					Dataset: &datafactory.DataFlowSinkDatasetArgs{
// 						Name: example2.Name,
// 					},
// 				},
// 			},
// 			Script: pulumi.String(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v", "source(\n", "  allowSchemaDrift: true, \n", "  validateSchema: false, \n", "  limit: 100, \n", "  ignoreNoFilesFound: false, \n", "  documentForm: 'documentPerLine') ~> source1 \n", "source1 sink(\n", "  allowSchemaDrift: true, \n", "  validateSchema: false, \n", "  skipDuplicateMapInputs: true, \n", "  skipDuplicateMapOutputs: true) ~> sink1\n")),
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
// Data Factory Data Flow can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:datafactory/dataFlow:DataFlow example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/dataflows/example
// ```
type DataFlow struct {
	pulumi.CustomResourceState

	// List of tags that can be used for describing the Data Factory Data Flow.
	Annotations pulumi.StringArrayOutput `pulumi:"annotations"`
	// The ID of Data Factory in which to associate the Data Flow with. Changing this forces a new resource.
	DataFactoryId pulumi.StringOutput `pulumi:"dataFactoryId"`
	// The description for the Data Factory Data Flow.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The folder that this Data Flow is in. If not specified, the Data Flow will appear at the root level.
	Folder pulumi.StringPtrOutput `pulumi:"folder"`
	// Specifies the name of the Data Factory Data Flow. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The script for the Data Factory Data Flow.
	Script pulumi.StringOutput `pulumi:"script"`
	// One or more `sink` blocks as defined below.
	Sinks DataFlowSinkArrayOutput `pulumi:"sinks"`
	// One or more `source` blocks as defined below.
	Sources DataFlowSourceArrayOutput `pulumi:"sources"`
	// One or more `transformation` blocks as defined below.
	Transformations DataFlowTransformationArrayOutput `pulumi:"transformations"`
}

// NewDataFlow registers a new resource with the given unique name, arguments, and options.
func NewDataFlow(ctx *pulumi.Context,
	name string, args *DataFlowArgs, opts ...pulumi.ResourceOption) (*DataFlow, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataFactoryId == nil {
		return nil, errors.New("invalid value for required argument 'DataFactoryId'")
	}
	if args.Script == nil {
		return nil, errors.New("invalid value for required argument 'Script'")
	}
	if args.Sinks == nil {
		return nil, errors.New("invalid value for required argument 'Sinks'")
	}
	if args.Sources == nil {
		return nil, errors.New("invalid value for required argument 'Sources'")
	}
	var resource DataFlow
	err := ctx.RegisterResource("azure:datafactory/dataFlow:DataFlow", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataFlow gets an existing DataFlow resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataFlow(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataFlowState, opts ...pulumi.ResourceOption) (*DataFlow, error) {
	var resource DataFlow
	err := ctx.ReadResource("azure:datafactory/dataFlow:DataFlow", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataFlow resources.
type dataFlowState struct {
	// List of tags that can be used for describing the Data Factory Data Flow.
	Annotations []string `pulumi:"annotations"`
	// The ID of Data Factory in which to associate the Data Flow with. Changing this forces a new resource.
	DataFactoryId *string `pulumi:"dataFactoryId"`
	// The description for the Data Factory Data Flow.
	Description *string `pulumi:"description"`
	// The folder that this Data Flow is in. If not specified, the Data Flow will appear at the root level.
	Folder *string `pulumi:"folder"`
	// Specifies the name of the Data Factory Data Flow. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The script for the Data Factory Data Flow.
	Script *string `pulumi:"script"`
	// One or more `sink` blocks as defined below.
	Sinks []DataFlowSink `pulumi:"sinks"`
	// One or more `source` blocks as defined below.
	Sources []DataFlowSource `pulumi:"sources"`
	// One or more `transformation` blocks as defined below.
	Transformations []DataFlowTransformation `pulumi:"transformations"`
}

type DataFlowState struct {
	// List of tags that can be used for describing the Data Factory Data Flow.
	Annotations pulumi.StringArrayInput
	// The ID of Data Factory in which to associate the Data Flow with. Changing this forces a new resource.
	DataFactoryId pulumi.StringPtrInput
	// The description for the Data Factory Data Flow.
	Description pulumi.StringPtrInput
	// The folder that this Data Flow is in. If not specified, the Data Flow will appear at the root level.
	Folder pulumi.StringPtrInput
	// Specifies the name of the Data Factory Data Flow. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The script for the Data Factory Data Flow.
	Script pulumi.StringPtrInput
	// One or more `sink` blocks as defined below.
	Sinks DataFlowSinkArrayInput
	// One or more `source` blocks as defined below.
	Sources DataFlowSourceArrayInput
	// One or more `transformation` blocks as defined below.
	Transformations DataFlowTransformationArrayInput
}

func (DataFlowState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataFlowState)(nil)).Elem()
}

type dataFlowArgs struct {
	// List of tags that can be used for describing the Data Factory Data Flow.
	Annotations []string `pulumi:"annotations"`
	// The ID of Data Factory in which to associate the Data Flow with. Changing this forces a new resource.
	DataFactoryId string `pulumi:"dataFactoryId"`
	// The description for the Data Factory Data Flow.
	Description *string `pulumi:"description"`
	// The folder that this Data Flow is in. If not specified, the Data Flow will appear at the root level.
	Folder *string `pulumi:"folder"`
	// Specifies the name of the Data Factory Data Flow. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The script for the Data Factory Data Flow.
	Script string `pulumi:"script"`
	// One or more `sink` blocks as defined below.
	Sinks []DataFlowSink `pulumi:"sinks"`
	// One or more `source` blocks as defined below.
	Sources []DataFlowSource `pulumi:"sources"`
	// One or more `transformation` blocks as defined below.
	Transformations []DataFlowTransformation `pulumi:"transformations"`
}

// The set of arguments for constructing a DataFlow resource.
type DataFlowArgs struct {
	// List of tags that can be used for describing the Data Factory Data Flow.
	Annotations pulumi.StringArrayInput
	// The ID of Data Factory in which to associate the Data Flow with. Changing this forces a new resource.
	DataFactoryId pulumi.StringInput
	// The description for the Data Factory Data Flow.
	Description pulumi.StringPtrInput
	// The folder that this Data Flow is in. If not specified, the Data Flow will appear at the root level.
	Folder pulumi.StringPtrInput
	// Specifies the name of the Data Factory Data Flow. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The script for the Data Factory Data Flow.
	Script pulumi.StringInput
	// One or more `sink` blocks as defined below.
	Sinks DataFlowSinkArrayInput
	// One or more `source` blocks as defined below.
	Sources DataFlowSourceArrayInput
	// One or more `transformation` blocks as defined below.
	Transformations DataFlowTransformationArrayInput
}

func (DataFlowArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataFlowArgs)(nil)).Elem()
}

type DataFlowInput interface {
	pulumi.Input

	ToDataFlowOutput() DataFlowOutput
	ToDataFlowOutputWithContext(ctx context.Context) DataFlowOutput
}

func (*DataFlow) ElementType() reflect.Type {
	return reflect.TypeOf((*DataFlow)(nil))
}

func (i *DataFlow) ToDataFlowOutput() DataFlowOutput {
	return i.ToDataFlowOutputWithContext(context.Background())
}

func (i *DataFlow) ToDataFlowOutputWithContext(ctx context.Context) DataFlowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataFlowOutput)
}

func (i *DataFlow) ToDataFlowPtrOutput() DataFlowPtrOutput {
	return i.ToDataFlowPtrOutputWithContext(context.Background())
}

func (i *DataFlow) ToDataFlowPtrOutputWithContext(ctx context.Context) DataFlowPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataFlowPtrOutput)
}

type DataFlowPtrInput interface {
	pulumi.Input

	ToDataFlowPtrOutput() DataFlowPtrOutput
	ToDataFlowPtrOutputWithContext(ctx context.Context) DataFlowPtrOutput
}

type dataFlowPtrType DataFlowArgs

func (*dataFlowPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**DataFlow)(nil))
}

func (i *dataFlowPtrType) ToDataFlowPtrOutput() DataFlowPtrOutput {
	return i.ToDataFlowPtrOutputWithContext(context.Background())
}

func (i *dataFlowPtrType) ToDataFlowPtrOutputWithContext(ctx context.Context) DataFlowPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataFlowPtrOutput)
}

// DataFlowArrayInput is an input type that accepts DataFlowArray and DataFlowArrayOutput values.
// You can construct a concrete instance of `DataFlowArrayInput` via:
//
//          DataFlowArray{ DataFlowArgs{...} }
type DataFlowArrayInput interface {
	pulumi.Input

	ToDataFlowArrayOutput() DataFlowArrayOutput
	ToDataFlowArrayOutputWithContext(context.Context) DataFlowArrayOutput
}

type DataFlowArray []DataFlowInput

func (DataFlowArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataFlow)(nil)).Elem()
}

func (i DataFlowArray) ToDataFlowArrayOutput() DataFlowArrayOutput {
	return i.ToDataFlowArrayOutputWithContext(context.Background())
}

func (i DataFlowArray) ToDataFlowArrayOutputWithContext(ctx context.Context) DataFlowArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataFlowArrayOutput)
}

// DataFlowMapInput is an input type that accepts DataFlowMap and DataFlowMapOutput values.
// You can construct a concrete instance of `DataFlowMapInput` via:
//
//          DataFlowMap{ "key": DataFlowArgs{...} }
type DataFlowMapInput interface {
	pulumi.Input

	ToDataFlowMapOutput() DataFlowMapOutput
	ToDataFlowMapOutputWithContext(context.Context) DataFlowMapOutput
}

type DataFlowMap map[string]DataFlowInput

func (DataFlowMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataFlow)(nil)).Elem()
}

func (i DataFlowMap) ToDataFlowMapOutput() DataFlowMapOutput {
	return i.ToDataFlowMapOutputWithContext(context.Background())
}

func (i DataFlowMap) ToDataFlowMapOutputWithContext(ctx context.Context) DataFlowMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataFlowMapOutput)
}

type DataFlowOutput struct{ *pulumi.OutputState }

func (DataFlowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DataFlow)(nil))
}

func (o DataFlowOutput) ToDataFlowOutput() DataFlowOutput {
	return o
}

func (o DataFlowOutput) ToDataFlowOutputWithContext(ctx context.Context) DataFlowOutput {
	return o
}

func (o DataFlowOutput) ToDataFlowPtrOutput() DataFlowPtrOutput {
	return o.ToDataFlowPtrOutputWithContext(context.Background())
}

func (o DataFlowOutput) ToDataFlowPtrOutputWithContext(ctx context.Context) DataFlowPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v DataFlow) *DataFlow {
		return &v
	}).(DataFlowPtrOutput)
}

type DataFlowPtrOutput struct{ *pulumi.OutputState }

func (DataFlowPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataFlow)(nil))
}

func (o DataFlowPtrOutput) ToDataFlowPtrOutput() DataFlowPtrOutput {
	return o
}

func (o DataFlowPtrOutput) ToDataFlowPtrOutputWithContext(ctx context.Context) DataFlowPtrOutput {
	return o
}

func (o DataFlowPtrOutput) Elem() DataFlowOutput {
	return o.ApplyT(func(v *DataFlow) DataFlow {
		if v != nil {
			return *v
		}
		var ret DataFlow
		return ret
	}).(DataFlowOutput)
}

type DataFlowArrayOutput struct{ *pulumi.OutputState }

func (DataFlowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DataFlow)(nil))
}

func (o DataFlowArrayOutput) ToDataFlowArrayOutput() DataFlowArrayOutput {
	return o
}

func (o DataFlowArrayOutput) ToDataFlowArrayOutputWithContext(ctx context.Context) DataFlowArrayOutput {
	return o
}

func (o DataFlowArrayOutput) Index(i pulumi.IntInput) DataFlowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) DataFlow {
		return vs[0].([]DataFlow)[vs[1].(int)]
	}).(DataFlowOutput)
}

type DataFlowMapOutput struct{ *pulumi.OutputState }

func (DataFlowMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]DataFlow)(nil))
}

func (o DataFlowMapOutput) ToDataFlowMapOutput() DataFlowMapOutput {
	return o
}

func (o DataFlowMapOutput) ToDataFlowMapOutputWithContext(ctx context.Context) DataFlowMapOutput {
	return o
}

func (o DataFlowMapOutput) MapIndex(k pulumi.StringInput) DataFlowOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) DataFlow {
		return vs[0].(map[string]DataFlow)[vs[1].(string)]
	}).(DataFlowOutput)
}

func init() {
	pulumi.RegisterOutputType(DataFlowOutput{})
	pulumi.RegisterOutputType(DataFlowPtrOutput{})
	pulumi.RegisterOutputType(DataFlowArrayOutput{})
	pulumi.RegisterOutputType(DataFlowMapOutput{})
}