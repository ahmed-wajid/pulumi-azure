// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package apimanagement

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a API Management Service API Diagnostics Logs.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/apimanagement"
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/appinsights"
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/core"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
// 		exampleInsights, err := appinsights.NewInsights(ctx, "exampleInsights", &appinsights.InsightsArgs{
// 			Location:          exampleResourceGroup.Location,
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			ApplicationType:   pulumi.String("web"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleService, err := apimanagement.NewService(ctx, "exampleService", &apimanagement.ServiceArgs{
// 			Location:          exampleResourceGroup.Location,
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			PublisherName:     pulumi.String("My Company"),
// 			PublisherEmail:    pulumi.String("company@terraform.io"),
// 			SkuName:           pulumi.String("Developer_1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleApi, err := apimanagement.NewApi(ctx, "exampleApi", &apimanagement.ApiArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			ApiManagementName: exampleService.Name,
// 			Revision:          pulumi.String("1"),
// 			DisplayName:       pulumi.String("Example API"),
// 			Path:              pulumi.String("example"),
// 			Protocols: pulumi.StringArray{
// 				pulumi.String("https"),
// 			},
// 			Import: &apimanagement.ApiImportArgs{
// 				ContentFormat: pulumi.String("swagger-link-json"),
// 				ContentValue:  pulumi.String("http://conferenceapi.azurewebsites.net/?format=json"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleLogger, err := apimanagement.NewLogger(ctx, "exampleLogger", &apimanagement.LoggerArgs{
// 			ApiManagementName: exampleService.Name,
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			ApplicationInsights: &apimanagement.LoggerApplicationInsightsArgs{
// 				InstrumentationKey: exampleInsights.InstrumentationKey,
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = apimanagement.NewApiDiagnostic(ctx, "exampleApiDiagnostic", &apimanagement.ApiDiagnosticArgs{
// 			ResourceGroupName:     exampleResourceGroup.Name,
// 			ApiManagementName:     exampleService.Name,
// 			ApiName:               exampleApi.Name,
// 			ApiManagementLoggerId: exampleLogger.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type ApiDiagnostic struct {
	pulumi.CustomResourceState

	// The ID (name) of the Diagnostics Logger.
	ApiManagementLoggerId pulumi.StringOutput `pulumi:"apiManagementLoggerId"`
	// The name of the API Management Service instance. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ApiManagementName pulumi.StringOutput `pulumi:"apiManagementName"`
	// The name of the API on which to configure the Diagnostics Logs. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ApiName pulumi.StringOutput `pulumi:"apiName"`
	// Identifier of the Diagnostics Logs. Possible values are `applicationinsights` and `azuremonitor`. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// The name of the Resource Group where the API Management Service API Diagnostics Logs should exist. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
}

// NewApiDiagnostic registers a new resource with the given unique name, arguments, and options.
func NewApiDiagnostic(ctx *pulumi.Context,
	name string, args *ApiDiagnosticArgs, opts ...pulumi.ResourceOption) (*ApiDiagnostic, error) {
	if args == nil || args.ApiManagementLoggerId == nil {
		return nil, errors.New("missing required argument 'ApiManagementLoggerId'")
	}
	if args == nil || args.ApiManagementName == nil {
		return nil, errors.New("missing required argument 'ApiManagementName'")
	}
	if args == nil || args.ApiName == nil {
		return nil, errors.New("missing required argument 'ApiName'")
	}
	if args == nil || args.Identifier == nil {
		return nil, errors.New("missing required argument 'Identifier'")
	}
	if args == nil || args.ResourceGroupName == nil {
		return nil, errors.New("missing required argument 'ResourceGroupName'")
	}
	if args == nil {
		args = &ApiDiagnosticArgs{}
	}
	var resource ApiDiagnostic
	err := ctx.RegisterResource("azure:apimanagement/apiDiagnostic:ApiDiagnostic", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiDiagnostic gets an existing ApiDiagnostic resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiDiagnostic(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiDiagnosticState, opts ...pulumi.ResourceOption) (*ApiDiagnostic, error) {
	var resource ApiDiagnostic
	err := ctx.ReadResource("azure:apimanagement/apiDiagnostic:ApiDiagnostic", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiDiagnostic resources.
type apiDiagnosticState struct {
	// The ID (name) of the Diagnostics Logger.
	ApiManagementLoggerId *string `pulumi:"apiManagementLoggerId"`
	// The name of the API Management Service instance. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ApiManagementName *string `pulumi:"apiManagementName"`
	// The name of the API on which to configure the Diagnostics Logs. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ApiName *string `pulumi:"apiName"`
	// Identifier of the Diagnostics Logs. Possible values are `applicationinsights` and `azuremonitor`. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	Identifier *string `pulumi:"identifier"`
	// The name of the Resource Group where the API Management Service API Diagnostics Logs should exist. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
}

type ApiDiagnosticState struct {
	// The ID (name) of the Diagnostics Logger.
	ApiManagementLoggerId pulumi.StringPtrInput
	// The name of the API Management Service instance. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ApiManagementName pulumi.StringPtrInput
	// The name of the API on which to configure the Diagnostics Logs. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ApiName pulumi.StringPtrInput
	// Identifier of the Diagnostics Logs. Possible values are `applicationinsights` and `azuremonitor`. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	Identifier pulumi.StringPtrInput
	// The name of the Resource Group where the API Management Service API Diagnostics Logs should exist. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ResourceGroupName pulumi.StringPtrInput
}

func (ApiDiagnosticState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiDiagnosticState)(nil)).Elem()
}

type apiDiagnosticArgs struct {
	// The ID (name) of the Diagnostics Logger.
	ApiManagementLoggerId string `pulumi:"apiManagementLoggerId"`
	// The name of the API Management Service instance. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ApiManagementName string `pulumi:"apiManagementName"`
	// The name of the API on which to configure the Diagnostics Logs. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ApiName string `pulumi:"apiName"`
	// Identifier of the Diagnostics Logs. Possible values are `applicationinsights` and `azuremonitor`. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	Identifier string `pulumi:"identifier"`
	// The name of the Resource Group where the API Management Service API Diagnostics Logs should exist. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// The set of arguments for constructing a ApiDiagnostic resource.
type ApiDiagnosticArgs struct {
	// The ID (name) of the Diagnostics Logger.
	ApiManagementLoggerId pulumi.StringInput
	// The name of the API Management Service instance. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ApiManagementName pulumi.StringInput
	// The name of the API on which to configure the Diagnostics Logs. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ApiName pulumi.StringInput
	// Identifier of the Diagnostics Logs. Possible values are `applicationinsights` and `azuremonitor`. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	Identifier pulumi.StringInput
	// The name of the Resource Group where the API Management Service API Diagnostics Logs should exist. Changing this forces a new API Management Service API Diagnostics Logs to be created.
	ResourceGroupName pulumi.StringInput
}

func (ApiDiagnosticArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiDiagnosticArgs)(nil)).Elem()
}