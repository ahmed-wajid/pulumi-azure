// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package arckubernetes

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Arc Kubernetes Flux Configuration.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/base64"
//	"os"
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/arckubernetes"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func filebase64OrPanic(path string) pulumi.StringPtrInput {
//		if fileData, err := os.ReadFile(path); err == nil {
//			return pulumi.String(base64.StdEncoding.EncodeToString(fileData[:]))
//		} else {
//			panic(err.Error())
//		}
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = arckubernetes.NewCluster(ctx, "exampleCluster", &arckubernetes.ClusterArgs{
//				ResourceGroupName:         exampleResourceGroup.Name,
//				Location:                  pulumi.String("West Europe"),
//				AgentPublicKeyCertificate: filebase64OrPanic("testdata/public.cer"),
//				Identity: &arckubernetes.ClusterIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//				Tags: pulumi.StringMap{
//					"ENV": pulumi.String("Test"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleClusterExtension, err := arckubernetes.NewClusterExtension(ctx, "exampleClusterExtension", &arckubernetes.ClusterExtensionArgs{
//				ClusterId:     pulumi.Any(azurerm_arc_kubernetes_cluster.Test.Id),
//				ExtensionType: pulumi.String("microsoft.flux"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = arckubernetes.NewFluxConfiguration(ctx, "exampleFluxConfiguration", &arckubernetes.FluxConfigurationArgs{
//				ClusterId: pulumi.Any(azurerm_arc_kubernetes_cluster.Test.Id),
//				Namespace: pulumi.String("flux"),
//				GitRepository: &arckubernetes.FluxConfigurationGitRepositoryArgs{
//					Url:            pulumi.String("https://github.com/Azure/arc-k8s-demo"),
//					ReferenceType:  pulumi.String("branch"),
//					ReferenceValue: pulumi.String("main"),
//				},
//				Kustomizations: arckubernetes.FluxConfigurationKustomizationArray{
//					&arckubernetes.FluxConfigurationKustomizationArgs{
//						Name: pulumi.String("kustomization-1"),
//					},
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleClusterExtension,
//			}))
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
// Arc Kubernetes Flux Configuration can be imported using the `resource id` for different `cluster_resource_name`, e.g.
//
// ```sh
//
//	$ pulumi import azure:arckubernetes/fluxConfiguration:FluxConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Kubernetes/connectedClusters/cluster1/providers/Microsoft.KubernetesConfiguration/fluxConfigurations/fluxConfiguration1
//
// ```
type FluxConfiguration struct {
	pulumi.CustomResourceState

	// An `blobStorage` block as defined below.
	BlobStorage FluxConfigurationBlobStoragePtrOutput `pulumi:"blobStorage"`
	// A `bucket` block as defined below.
	Bucket FluxConfigurationBucketPtrOutput `pulumi:"bucket"`
	// Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
	ContinuousReconciliationEnabled pulumi.BoolPtrOutput `pulumi:"continuousReconciliationEnabled"`
	// A `gitRepository` block as defined below.
	GitRepository FluxConfigurationGitRepositoryPtrOutput `pulumi:"gitRepository"`
	// A `kustomizations` block as defined below.
	Kustomizations FluxConfigurationKustomizationArrayOutput `pulumi:"kustomizations"`
	// Specifies the name which should be used for this Arc Kubernetes Flux Configuration. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the namespace to which this configuration is installed to. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Namespace pulumi.StringOutput `pulumi:"namespace"`
	// Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Scope pulumi.StringPtrOutput `pulumi:"scope"`
}

// NewFluxConfiguration registers a new resource with the given unique name, arguments, and options.
func NewFluxConfiguration(ctx *pulumi.Context,
	name string, args *FluxConfigurationArgs, opts ...pulumi.ResourceOption) (*FluxConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.Kustomizations == nil {
		return nil, errors.New("invalid value for required argument 'Kustomizations'")
	}
	if args.Namespace == nil {
		return nil, errors.New("invalid value for required argument 'Namespace'")
	}
	var resource FluxConfiguration
	err := ctx.RegisterResource("azure:arckubernetes/fluxConfiguration:FluxConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFluxConfiguration gets an existing FluxConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFluxConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FluxConfigurationState, opts ...pulumi.ResourceOption) (*FluxConfiguration, error) {
	var resource FluxConfiguration
	err := ctx.ReadResource("azure:arckubernetes/fluxConfiguration:FluxConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FluxConfiguration resources.
type fluxConfigurationState struct {
	// An `blobStorage` block as defined below.
	BlobStorage *FluxConfigurationBlobStorage `pulumi:"blobStorage"`
	// A `bucket` block as defined below.
	Bucket *FluxConfigurationBucket `pulumi:"bucket"`
	// Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
	ClusterId *string `pulumi:"clusterId"`
	// Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
	ContinuousReconciliationEnabled *bool `pulumi:"continuousReconciliationEnabled"`
	// A `gitRepository` block as defined below.
	GitRepository *FluxConfigurationGitRepository `pulumi:"gitRepository"`
	// A `kustomizations` block as defined below.
	Kustomizations []FluxConfigurationKustomization `pulumi:"kustomizations"`
	// Specifies the name which should be used for this Arc Kubernetes Flux Configuration. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Name *string `pulumi:"name"`
	// Specifies the namespace to which this configuration is installed to. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Namespace *string `pulumi:"namespace"`
	// Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Scope *string `pulumi:"scope"`
}

type FluxConfigurationState struct {
	// An `blobStorage` block as defined below.
	BlobStorage FluxConfigurationBlobStoragePtrInput
	// A `bucket` block as defined below.
	Bucket FluxConfigurationBucketPtrInput
	// Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
	ClusterId pulumi.StringPtrInput
	// Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
	ContinuousReconciliationEnabled pulumi.BoolPtrInput
	// A `gitRepository` block as defined below.
	GitRepository FluxConfigurationGitRepositoryPtrInput
	// A `kustomizations` block as defined below.
	Kustomizations FluxConfigurationKustomizationArrayInput
	// Specifies the name which should be used for this Arc Kubernetes Flux Configuration. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Name pulumi.StringPtrInput
	// Specifies the namespace to which this configuration is installed to. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Namespace pulumi.StringPtrInput
	// Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Scope pulumi.StringPtrInput
}

func (FluxConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*fluxConfigurationState)(nil)).Elem()
}

type fluxConfigurationArgs struct {
	// An `blobStorage` block as defined below.
	BlobStorage *FluxConfigurationBlobStorage `pulumi:"blobStorage"`
	// A `bucket` block as defined below.
	Bucket *FluxConfigurationBucket `pulumi:"bucket"`
	// Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
	ClusterId string `pulumi:"clusterId"`
	// Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
	ContinuousReconciliationEnabled *bool `pulumi:"continuousReconciliationEnabled"`
	// A `gitRepository` block as defined below.
	GitRepository *FluxConfigurationGitRepository `pulumi:"gitRepository"`
	// A `kustomizations` block as defined below.
	Kustomizations []FluxConfigurationKustomization `pulumi:"kustomizations"`
	// Specifies the name which should be used for this Arc Kubernetes Flux Configuration. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Name *string `pulumi:"name"`
	// Specifies the namespace to which this configuration is installed to. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Namespace string `pulumi:"namespace"`
	// Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Scope *string `pulumi:"scope"`
}

// The set of arguments for constructing a FluxConfiguration resource.
type FluxConfigurationArgs struct {
	// An `blobStorage` block as defined below.
	BlobStorage FluxConfigurationBlobStoragePtrInput
	// A `bucket` block as defined below.
	Bucket FluxConfigurationBucketPtrInput
	// Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
	ClusterId pulumi.StringInput
	// Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
	ContinuousReconciliationEnabled pulumi.BoolPtrInput
	// A `gitRepository` block as defined below.
	GitRepository FluxConfigurationGitRepositoryPtrInput
	// A `kustomizations` block as defined below.
	Kustomizations FluxConfigurationKustomizationArrayInput
	// Specifies the name which should be used for this Arc Kubernetes Flux Configuration. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Name pulumi.StringPtrInput
	// Specifies the namespace to which this configuration is installed to. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Namespace pulumi.StringInput
	// Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
	Scope pulumi.StringPtrInput
}

func (FluxConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fluxConfigurationArgs)(nil)).Elem()
}

type FluxConfigurationInput interface {
	pulumi.Input

	ToFluxConfigurationOutput() FluxConfigurationOutput
	ToFluxConfigurationOutputWithContext(ctx context.Context) FluxConfigurationOutput
}

func (*FluxConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**FluxConfiguration)(nil)).Elem()
}

func (i *FluxConfiguration) ToFluxConfigurationOutput() FluxConfigurationOutput {
	return i.ToFluxConfigurationOutputWithContext(context.Background())
}

func (i *FluxConfiguration) ToFluxConfigurationOutputWithContext(ctx context.Context) FluxConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FluxConfigurationOutput)
}

// FluxConfigurationArrayInput is an input type that accepts FluxConfigurationArray and FluxConfigurationArrayOutput values.
// You can construct a concrete instance of `FluxConfigurationArrayInput` via:
//
//	FluxConfigurationArray{ FluxConfigurationArgs{...} }
type FluxConfigurationArrayInput interface {
	pulumi.Input

	ToFluxConfigurationArrayOutput() FluxConfigurationArrayOutput
	ToFluxConfigurationArrayOutputWithContext(context.Context) FluxConfigurationArrayOutput
}

type FluxConfigurationArray []FluxConfigurationInput

func (FluxConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FluxConfiguration)(nil)).Elem()
}

func (i FluxConfigurationArray) ToFluxConfigurationArrayOutput() FluxConfigurationArrayOutput {
	return i.ToFluxConfigurationArrayOutputWithContext(context.Background())
}

func (i FluxConfigurationArray) ToFluxConfigurationArrayOutputWithContext(ctx context.Context) FluxConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FluxConfigurationArrayOutput)
}

// FluxConfigurationMapInput is an input type that accepts FluxConfigurationMap and FluxConfigurationMapOutput values.
// You can construct a concrete instance of `FluxConfigurationMapInput` via:
//
//	FluxConfigurationMap{ "key": FluxConfigurationArgs{...} }
type FluxConfigurationMapInput interface {
	pulumi.Input

	ToFluxConfigurationMapOutput() FluxConfigurationMapOutput
	ToFluxConfigurationMapOutputWithContext(context.Context) FluxConfigurationMapOutput
}

type FluxConfigurationMap map[string]FluxConfigurationInput

func (FluxConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FluxConfiguration)(nil)).Elem()
}

func (i FluxConfigurationMap) ToFluxConfigurationMapOutput() FluxConfigurationMapOutput {
	return i.ToFluxConfigurationMapOutputWithContext(context.Background())
}

func (i FluxConfigurationMap) ToFluxConfigurationMapOutputWithContext(ctx context.Context) FluxConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FluxConfigurationMapOutput)
}

type FluxConfigurationOutput struct{ *pulumi.OutputState }

func (FluxConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FluxConfiguration)(nil)).Elem()
}

func (o FluxConfigurationOutput) ToFluxConfigurationOutput() FluxConfigurationOutput {
	return o
}

func (o FluxConfigurationOutput) ToFluxConfigurationOutputWithContext(ctx context.Context) FluxConfigurationOutput {
	return o
}

// An `blobStorage` block as defined below.
func (o FluxConfigurationOutput) BlobStorage() FluxConfigurationBlobStoragePtrOutput {
	return o.ApplyT(func(v *FluxConfiguration) FluxConfigurationBlobStoragePtrOutput { return v.BlobStorage }).(FluxConfigurationBlobStoragePtrOutput)
}

// A `bucket` block as defined below.
func (o FluxConfigurationOutput) Bucket() FluxConfigurationBucketPtrOutput {
	return o.ApplyT(func(v *FluxConfiguration) FluxConfigurationBucketPtrOutput { return v.Bucket }).(FluxConfigurationBucketPtrOutput)
}

// Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
func (o FluxConfigurationOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *FluxConfiguration) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
func (o FluxConfigurationOutput) ContinuousReconciliationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FluxConfiguration) pulumi.BoolPtrOutput { return v.ContinuousReconciliationEnabled }).(pulumi.BoolPtrOutput)
}

// A `gitRepository` block as defined below.
func (o FluxConfigurationOutput) GitRepository() FluxConfigurationGitRepositoryPtrOutput {
	return o.ApplyT(func(v *FluxConfiguration) FluxConfigurationGitRepositoryPtrOutput { return v.GitRepository }).(FluxConfigurationGitRepositoryPtrOutput)
}

// A `kustomizations` block as defined below.
func (o FluxConfigurationOutput) Kustomizations() FluxConfigurationKustomizationArrayOutput {
	return o.ApplyT(func(v *FluxConfiguration) FluxConfigurationKustomizationArrayOutput { return v.Kustomizations }).(FluxConfigurationKustomizationArrayOutput)
}

// Specifies the name which should be used for this Arc Kubernetes Flux Configuration. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
func (o FluxConfigurationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FluxConfiguration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the namespace to which this configuration is installed to. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
func (o FluxConfigurationOutput) Namespace() pulumi.StringOutput {
	return o.ApplyT(func(v *FluxConfiguration) pulumi.StringOutput { return v.Namespace }).(pulumi.StringOutput)
}

// Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Arc Kubernetes Flux Configuration to be created.
func (o FluxConfigurationOutput) Scope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FluxConfiguration) pulumi.StringPtrOutput { return v.Scope }).(pulumi.StringPtrOutput)
}

type FluxConfigurationArrayOutput struct{ *pulumi.OutputState }

func (FluxConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FluxConfiguration)(nil)).Elem()
}

func (o FluxConfigurationArrayOutput) ToFluxConfigurationArrayOutput() FluxConfigurationArrayOutput {
	return o
}

func (o FluxConfigurationArrayOutput) ToFluxConfigurationArrayOutputWithContext(ctx context.Context) FluxConfigurationArrayOutput {
	return o
}

func (o FluxConfigurationArrayOutput) Index(i pulumi.IntInput) FluxConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FluxConfiguration {
		return vs[0].([]*FluxConfiguration)[vs[1].(int)]
	}).(FluxConfigurationOutput)
}

type FluxConfigurationMapOutput struct{ *pulumi.OutputState }

func (FluxConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FluxConfiguration)(nil)).Elem()
}

func (o FluxConfigurationMapOutput) ToFluxConfigurationMapOutput() FluxConfigurationMapOutput {
	return o
}

func (o FluxConfigurationMapOutput) ToFluxConfigurationMapOutputWithContext(ctx context.Context) FluxConfigurationMapOutput {
	return o
}

func (o FluxConfigurationMapOutput) MapIndex(k pulumi.StringInput) FluxConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FluxConfiguration {
		return vs[0].(map[string]*FluxConfiguration)[vs[1].(string)]
	}).(FluxConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FluxConfigurationInput)(nil)).Elem(), &FluxConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*FluxConfigurationArrayInput)(nil)).Elem(), FluxConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FluxConfigurationMapInput)(nil)).Elem(), FluxConfigurationMap{})
	pulumi.RegisterOutputType(FluxConfigurationOutput{})
	pulumi.RegisterOutputType(FluxConfigurationArrayOutput{})
	pulumi.RegisterOutputType(FluxConfigurationMapOutput{})
}