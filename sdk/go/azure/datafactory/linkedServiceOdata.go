// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package datafactory

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Linked Service (connection) between a Database and Azure Data Factory through OData protocol.
//
// > **Note:** All arguments including the connectionString will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/datafactory"
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
// 		exampleFactory, err := datafactory.NewFactory(ctx, "exampleFactory", &datafactory.FactoryArgs{
// 			Location:          exampleResourceGroup.Location,
// 			ResourceGroupName: exampleResourceGroup.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = datafactory.NewLinkedServiceOdata(ctx, "anonymous", &datafactory.LinkedServiceOdataArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			DataFactoryName:   exampleFactory.Name,
// 			Url:               pulumi.String("https://services.odata.org/v4/TripPinServiceRW/People"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = datafactory.NewLinkedServiceOdata(ctx, "basicAuth", &datafactory.LinkedServiceOdataArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			DataFactoryName:   exampleFactory.Name,
// 			Url:               pulumi.String("https://services.odata.org/v4/TripPinServiceRW/People"),
// 			BasicAuthentication: &datafactory.LinkedServiceOdataBasicAuthenticationArgs{
// 				Username: pulumi.String("emma"),
// 				Password: pulumi.String("Ch4ngeM3!"),
// 			},
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
// Data Factory OData Linked Service's can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:datafactory/linkedServiceOdata:LinkedServiceOdata example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
// ```
type LinkedServiceOdata struct {
	pulumi.CustomResourceState

	// A map of additional properties to associate with the Data Factory Linked Service OData.
	AdditionalProperties pulumi.StringMapOutput `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service OData.
	Annotations pulumi.StringArrayOutput `pulumi:"annotations"`
	// A `basicAuthentication` block as defined below.
	BasicAuthentication LinkedServiceOdataBasicAuthenticationPtrOutput `pulumi:"basicAuthentication"`
	// The Data Factory name in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryName pulumi.StringOutput `pulumi:"dataFactoryName"`
	// The description for the Data Factory Linked Service OData.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The integration runtime reference to associate with the Data Factory Linked Service OData.
	IntegrationRuntimeName pulumi.StringPtrOutput `pulumi:"integrationRuntimeName"`
	// Specifies the name of the Data Factory Linked Service OData. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringOutput `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service OData.
	Parameters pulumi.StringMapOutput `pulumi:"parameters"`
	// The name of the resource group in which to create the Data Factory Linked Service OData. Changing this forces a new resource
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The URL of the OData service endpoint.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewLinkedServiceOdata registers a new resource with the given unique name, arguments, and options.
func NewLinkedServiceOdata(ctx *pulumi.Context,
	name string, args *LinkedServiceOdataArgs, opts ...pulumi.ResourceOption) (*LinkedServiceOdata, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataFactoryName == nil {
		return nil, errors.New("invalid value for required argument 'DataFactoryName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	var resource LinkedServiceOdata
	err := ctx.RegisterResource("azure:datafactory/linkedServiceOdata:LinkedServiceOdata", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLinkedServiceOdata gets an existing LinkedServiceOdata resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLinkedServiceOdata(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LinkedServiceOdataState, opts ...pulumi.ResourceOption) (*LinkedServiceOdata, error) {
	var resource LinkedServiceOdata
	err := ctx.ReadResource("azure:datafactory/linkedServiceOdata:LinkedServiceOdata", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LinkedServiceOdata resources.
type linkedServiceOdataState struct {
	// A map of additional properties to associate with the Data Factory Linked Service OData.
	AdditionalProperties map[string]string `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service OData.
	Annotations []string `pulumi:"annotations"`
	// A `basicAuthentication` block as defined below.
	BasicAuthentication *LinkedServiceOdataBasicAuthentication `pulumi:"basicAuthentication"`
	// The Data Factory name in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryName *string `pulumi:"dataFactoryName"`
	// The description for the Data Factory Linked Service OData.
	Description *string `pulumi:"description"`
	// The integration runtime reference to associate with the Data Factory Linked Service OData.
	IntegrationRuntimeName *string `pulumi:"integrationRuntimeName"`
	// Specifies the name of the Data Factory Linked Service OData. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
	Name *string `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service OData.
	Parameters map[string]string `pulumi:"parameters"`
	// The name of the resource group in which to create the Data Factory Linked Service OData. Changing this forces a new resource
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The URL of the OData service endpoint.
	Url *string `pulumi:"url"`
}

type LinkedServiceOdataState struct {
	// A map of additional properties to associate with the Data Factory Linked Service OData.
	AdditionalProperties pulumi.StringMapInput
	// List of tags that can be used for describing the Data Factory Linked Service OData.
	Annotations pulumi.StringArrayInput
	// A `basicAuthentication` block as defined below.
	BasicAuthentication LinkedServiceOdataBasicAuthenticationPtrInput
	// The Data Factory name in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryName pulumi.StringPtrInput
	// The description for the Data Factory Linked Service OData.
	Description pulumi.StringPtrInput
	// The integration runtime reference to associate with the Data Factory Linked Service OData.
	IntegrationRuntimeName pulumi.StringPtrInput
	// Specifies the name of the Data Factory Linked Service OData. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringPtrInput
	// A map of parameters to associate with the Data Factory Linked Service OData.
	Parameters pulumi.StringMapInput
	// The name of the resource group in which to create the Data Factory Linked Service OData. Changing this forces a new resource
	ResourceGroupName pulumi.StringPtrInput
	// The URL of the OData service endpoint.
	Url pulumi.StringPtrInput
}

func (LinkedServiceOdataState) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedServiceOdataState)(nil)).Elem()
}

type linkedServiceOdataArgs struct {
	// A map of additional properties to associate with the Data Factory Linked Service OData.
	AdditionalProperties map[string]string `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service OData.
	Annotations []string `pulumi:"annotations"`
	// A `basicAuthentication` block as defined below.
	BasicAuthentication *LinkedServiceOdataBasicAuthentication `pulumi:"basicAuthentication"`
	// The Data Factory name in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryName string `pulumi:"dataFactoryName"`
	// The description for the Data Factory Linked Service OData.
	Description *string `pulumi:"description"`
	// The integration runtime reference to associate with the Data Factory Linked Service OData.
	IntegrationRuntimeName *string `pulumi:"integrationRuntimeName"`
	// Specifies the name of the Data Factory Linked Service OData. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
	Name *string `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service OData.
	Parameters map[string]string `pulumi:"parameters"`
	// The name of the resource group in which to create the Data Factory Linked Service OData. Changing this forces a new resource
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The URL of the OData service endpoint.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a LinkedServiceOdata resource.
type LinkedServiceOdataArgs struct {
	// A map of additional properties to associate with the Data Factory Linked Service OData.
	AdditionalProperties pulumi.StringMapInput
	// List of tags that can be used for describing the Data Factory Linked Service OData.
	Annotations pulumi.StringArrayInput
	// A `basicAuthentication` block as defined below.
	BasicAuthentication LinkedServiceOdataBasicAuthenticationPtrInput
	// The Data Factory name in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryName pulumi.StringInput
	// The description for the Data Factory Linked Service OData.
	Description pulumi.StringPtrInput
	// The integration runtime reference to associate with the Data Factory Linked Service OData.
	IntegrationRuntimeName pulumi.StringPtrInput
	// Specifies the name of the Data Factory Linked Service OData. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringPtrInput
	// A map of parameters to associate with the Data Factory Linked Service OData.
	Parameters pulumi.StringMapInput
	// The name of the resource group in which to create the Data Factory Linked Service OData. Changing this forces a new resource
	ResourceGroupName pulumi.StringInput
	// The URL of the OData service endpoint.
	Url pulumi.StringInput
}

func (LinkedServiceOdataArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedServiceOdataArgs)(nil)).Elem()
}

type LinkedServiceOdataInput interface {
	pulumi.Input

	ToLinkedServiceOdataOutput() LinkedServiceOdataOutput
	ToLinkedServiceOdataOutputWithContext(ctx context.Context) LinkedServiceOdataOutput
}

func (*LinkedServiceOdata) ElementType() reflect.Type {
	return reflect.TypeOf((*LinkedServiceOdata)(nil))
}

func (i *LinkedServiceOdata) ToLinkedServiceOdataOutput() LinkedServiceOdataOutput {
	return i.ToLinkedServiceOdataOutputWithContext(context.Background())
}

func (i *LinkedServiceOdata) ToLinkedServiceOdataOutputWithContext(ctx context.Context) LinkedServiceOdataOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceOdataOutput)
}

func (i *LinkedServiceOdata) ToLinkedServiceOdataPtrOutput() LinkedServiceOdataPtrOutput {
	return i.ToLinkedServiceOdataPtrOutputWithContext(context.Background())
}

func (i *LinkedServiceOdata) ToLinkedServiceOdataPtrOutputWithContext(ctx context.Context) LinkedServiceOdataPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceOdataPtrOutput)
}

type LinkedServiceOdataPtrInput interface {
	pulumi.Input

	ToLinkedServiceOdataPtrOutput() LinkedServiceOdataPtrOutput
	ToLinkedServiceOdataPtrOutputWithContext(ctx context.Context) LinkedServiceOdataPtrOutput
}

type linkedServiceOdataPtrType LinkedServiceOdataArgs

func (*linkedServiceOdataPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedServiceOdata)(nil))
}

func (i *linkedServiceOdataPtrType) ToLinkedServiceOdataPtrOutput() LinkedServiceOdataPtrOutput {
	return i.ToLinkedServiceOdataPtrOutputWithContext(context.Background())
}

func (i *linkedServiceOdataPtrType) ToLinkedServiceOdataPtrOutputWithContext(ctx context.Context) LinkedServiceOdataPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceOdataPtrOutput)
}

// LinkedServiceOdataArrayInput is an input type that accepts LinkedServiceOdataArray and LinkedServiceOdataArrayOutput values.
// You can construct a concrete instance of `LinkedServiceOdataArrayInput` via:
//
//          LinkedServiceOdataArray{ LinkedServiceOdataArgs{...} }
type LinkedServiceOdataArrayInput interface {
	pulumi.Input

	ToLinkedServiceOdataArrayOutput() LinkedServiceOdataArrayOutput
	ToLinkedServiceOdataArrayOutputWithContext(context.Context) LinkedServiceOdataArrayOutput
}

type LinkedServiceOdataArray []LinkedServiceOdataInput

func (LinkedServiceOdataArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*LinkedServiceOdata)(nil))
}

func (i LinkedServiceOdataArray) ToLinkedServiceOdataArrayOutput() LinkedServiceOdataArrayOutput {
	return i.ToLinkedServiceOdataArrayOutputWithContext(context.Background())
}

func (i LinkedServiceOdataArray) ToLinkedServiceOdataArrayOutputWithContext(ctx context.Context) LinkedServiceOdataArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceOdataArrayOutput)
}

// LinkedServiceOdataMapInput is an input type that accepts LinkedServiceOdataMap and LinkedServiceOdataMapOutput values.
// You can construct a concrete instance of `LinkedServiceOdataMapInput` via:
//
//          LinkedServiceOdataMap{ "key": LinkedServiceOdataArgs{...} }
type LinkedServiceOdataMapInput interface {
	pulumi.Input

	ToLinkedServiceOdataMapOutput() LinkedServiceOdataMapOutput
	ToLinkedServiceOdataMapOutputWithContext(context.Context) LinkedServiceOdataMapOutput
}

type LinkedServiceOdataMap map[string]LinkedServiceOdataInput

func (LinkedServiceOdataMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*LinkedServiceOdata)(nil))
}

func (i LinkedServiceOdataMap) ToLinkedServiceOdataMapOutput() LinkedServiceOdataMapOutput {
	return i.ToLinkedServiceOdataMapOutputWithContext(context.Background())
}

func (i LinkedServiceOdataMap) ToLinkedServiceOdataMapOutputWithContext(ctx context.Context) LinkedServiceOdataMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceOdataMapOutput)
}

type LinkedServiceOdataOutput struct {
	*pulumi.OutputState
}

func (LinkedServiceOdataOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LinkedServiceOdata)(nil))
}

func (o LinkedServiceOdataOutput) ToLinkedServiceOdataOutput() LinkedServiceOdataOutput {
	return o
}

func (o LinkedServiceOdataOutput) ToLinkedServiceOdataOutputWithContext(ctx context.Context) LinkedServiceOdataOutput {
	return o
}

func (o LinkedServiceOdataOutput) ToLinkedServiceOdataPtrOutput() LinkedServiceOdataPtrOutput {
	return o.ToLinkedServiceOdataPtrOutputWithContext(context.Background())
}

func (o LinkedServiceOdataOutput) ToLinkedServiceOdataPtrOutputWithContext(ctx context.Context) LinkedServiceOdataPtrOutput {
	return o.ApplyT(func(v LinkedServiceOdata) *LinkedServiceOdata {
		return &v
	}).(LinkedServiceOdataPtrOutput)
}

type LinkedServiceOdataPtrOutput struct {
	*pulumi.OutputState
}

func (LinkedServiceOdataPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedServiceOdata)(nil))
}

func (o LinkedServiceOdataPtrOutput) ToLinkedServiceOdataPtrOutput() LinkedServiceOdataPtrOutput {
	return o
}

func (o LinkedServiceOdataPtrOutput) ToLinkedServiceOdataPtrOutputWithContext(ctx context.Context) LinkedServiceOdataPtrOutput {
	return o
}

type LinkedServiceOdataArrayOutput struct{ *pulumi.OutputState }

func (LinkedServiceOdataArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LinkedServiceOdata)(nil))
}

func (o LinkedServiceOdataArrayOutput) ToLinkedServiceOdataArrayOutput() LinkedServiceOdataArrayOutput {
	return o
}

func (o LinkedServiceOdataArrayOutput) ToLinkedServiceOdataArrayOutputWithContext(ctx context.Context) LinkedServiceOdataArrayOutput {
	return o
}

func (o LinkedServiceOdataArrayOutput) Index(i pulumi.IntInput) LinkedServiceOdataOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) LinkedServiceOdata {
		return vs[0].([]LinkedServiceOdata)[vs[1].(int)]
	}).(LinkedServiceOdataOutput)
}

type LinkedServiceOdataMapOutput struct{ *pulumi.OutputState }

func (LinkedServiceOdataMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]LinkedServiceOdata)(nil))
}

func (o LinkedServiceOdataMapOutput) ToLinkedServiceOdataMapOutput() LinkedServiceOdataMapOutput {
	return o
}

func (o LinkedServiceOdataMapOutput) ToLinkedServiceOdataMapOutputWithContext(ctx context.Context) LinkedServiceOdataMapOutput {
	return o
}

func (o LinkedServiceOdataMapOutput) MapIndex(k pulumi.StringInput) LinkedServiceOdataOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) LinkedServiceOdata {
		return vs[0].(map[string]LinkedServiceOdata)[vs[1].(string)]
	}).(LinkedServiceOdataOutput)
}

func init() {
	pulumi.RegisterOutputType(LinkedServiceOdataOutput{})
	pulumi.RegisterOutputType(LinkedServiceOdataPtrOutput{})
	pulumi.RegisterOutputType(LinkedServiceOdataArrayOutput{})
	pulumi.RegisterOutputType(LinkedServiceOdataMapOutput{})
}