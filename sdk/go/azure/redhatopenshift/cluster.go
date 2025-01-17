// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package redhatopenshift

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a fully managed Azure Red Hat OpenShift Cluster (also known as ARO).
//
// > **Note:** All arguments including the client secret will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
//
// ## Import
//
// Red Hat OpenShift Clusters can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:redhatopenshift/cluster:Cluster cluster1 /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/group1/providers/Microsoft.RedHatOpenShift/openShiftClusters/cluster1
//
// ```
type Cluster struct {
	pulumi.CustomResourceState

	// An `apiServerProfile` block as defined below.
	ApiServerProfile ClusterApiServerProfileOutput `pulumi:"apiServerProfile"`
	// A `clusterProfile` block as defined below.
	ClusterProfile ClusterClusterProfileOutput `pulumi:"clusterProfile"`
	// The Red Hat OpenShift cluster console URL.
	ConsoleUrl pulumi.StringOutput `pulumi:"consoleUrl"`
	// An `ingressProfile` block as defined below.
	IngressProfile ClusterIngressProfileOutput `pulumi:"ingressProfile"`
	// The location where the Azure Red Hat OpenShift Cluster should be created. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// A `mainProfile` block as defined below.
	MainProfile ClusterMainProfileOutput `pulumi:"mainProfile"`
	// The name of the Azure Red Hat OpenShift Cluster to create. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A `networkProfile` block as defined below.
	NetworkProfile ClusterNetworkProfileOutput `pulumi:"networkProfile"`
	// Specifies the Resource Group where the Azure Red Hat OpenShift Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A `servicePrincipal` block as defined below.
	ServicePrincipal ClusterServicePrincipalOutput `pulumi:"servicePrincipal"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A `workerProfile` block as defined below.
	WorkerProfile ClusterWorkerProfileOutput `pulumi:"workerProfile"`
}

// NewCluster registers a new resource with the given unique name, arguments, and options.
func NewCluster(ctx *pulumi.Context,
	name string, args *ClusterArgs, opts ...pulumi.ResourceOption) (*Cluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiServerProfile == nil {
		return nil, errors.New("invalid value for required argument 'ApiServerProfile'")
	}
	if args.ClusterProfile == nil {
		return nil, errors.New("invalid value for required argument 'ClusterProfile'")
	}
	if args.IngressProfile == nil {
		return nil, errors.New("invalid value for required argument 'IngressProfile'")
	}
	if args.MainProfile == nil {
		return nil, errors.New("invalid value for required argument 'MainProfile'")
	}
	if args.NetworkProfile == nil {
		return nil, errors.New("invalid value for required argument 'NetworkProfile'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.ServicePrincipal == nil {
		return nil, errors.New("invalid value for required argument 'ServicePrincipal'")
	}
	if args.WorkerProfile == nil {
		return nil, errors.New("invalid value for required argument 'WorkerProfile'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Cluster
	err := ctx.RegisterResource("azure:redhatopenshift/cluster:Cluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCluster gets an existing Cluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterState, opts ...pulumi.ResourceOption) (*Cluster, error) {
	var resource Cluster
	err := ctx.ReadResource("azure:redhatopenshift/cluster:Cluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Cluster resources.
type clusterState struct {
	// An `apiServerProfile` block as defined below.
	ApiServerProfile *ClusterApiServerProfile `pulumi:"apiServerProfile"`
	// A `clusterProfile` block as defined below.
	ClusterProfile *ClusterClusterProfile `pulumi:"clusterProfile"`
	// The Red Hat OpenShift cluster console URL.
	ConsoleUrl *string `pulumi:"consoleUrl"`
	// An `ingressProfile` block as defined below.
	IngressProfile *ClusterIngressProfile `pulumi:"ingressProfile"`
	// The location where the Azure Red Hat OpenShift Cluster should be created. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A `mainProfile` block as defined below.
	MainProfile *ClusterMainProfile `pulumi:"mainProfile"`
	// The name of the Azure Red Hat OpenShift Cluster to create. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A `networkProfile` block as defined below.
	NetworkProfile *ClusterNetworkProfile `pulumi:"networkProfile"`
	// Specifies the Resource Group where the Azure Red Hat OpenShift Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A `servicePrincipal` block as defined below.
	ServicePrincipal *ClusterServicePrincipal `pulumi:"servicePrincipal"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// A `workerProfile` block as defined below.
	WorkerProfile *ClusterWorkerProfile `pulumi:"workerProfile"`
}

type ClusterState struct {
	// An `apiServerProfile` block as defined below.
	ApiServerProfile ClusterApiServerProfilePtrInput
	// A `clusterProfile` block as defined below.
	ClusterProfile ClusterClusterProfilePtrInput
	// The Red Hat OpenShift cluster console URL.
	ConsoleUrl pulumi.StringPtrInput
	// An `ingressProfile` block as defined below.
	IngressProfile ClusterIngressProfilePtrInput
	// The location where the Azure Red Hat OpenShift Cluster should be created. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A `mainProfile` block as defined below.
	MainProfile ClusterMainProfilePtrInput
	// The name of the Azure Red Hat OpenShift Cluster to create. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A `networkProfile` block as defined below.
	NetworkProfile ClusterNetworkProfilePtrInput
	// Specifies the Resource Group where the Azure Red Hat OpenShift Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A `servicePrincipal` block as defined below.
	ServicePrincipal ClusterServicePrincipalPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// A `workerProfile` block as defined below.
	WorkerProfile ClusterWorkerProfilePtrInput
}

func (ClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterState)(nil)).Elem()
}

type clusterArgs struct {
	// An `apiServerProfile` block as defined below.
	ApiServerProfile ClusterApiServerProfile `pulumi:"apiServerProfile"`
	// A `clusterProfile` block as defined below.
	ClusterProfile ClusterClusterProfile `pulumi:"clusterProfile"`
	// An `ingressProfile` block as defined below.
	IngressProfile ClusterIngressProfile `pulumi:"ingressProfile"`
	// The location where the Azure Red Hat OpenShift Cluster should be created. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A `mainProfile` block as defined below.
	MainProfile ClusterMainProfile `pulumi:"mainProfile"`
	// The name of the Azure Red Hat OpenShift Cluster to create. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A `networkProfile` block as defined below.
	NetworkProfile ClusterNetworkProfile `pulumi:"networkProfile"`
	// Specifies the Resource Group where the Azure Red Hat OpenShift Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `servicePrincipal` block as defined below.
	ServicePrincipal ClusterServicePrincipal `pulumi:"servicePrincipal"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// A `workerProfile` block as defined below.
	WorkerProfile ClusterWorkerProfile `pulumi:"workerProfile"`
}

// The set of arguments for constructing a Cluster resource.
type ClusterArgs struct {
	// An `apiServerProfile` block as defined below.
	ApiServerProfile ClusterApiServerProfileInput
	// A `clusterProfile` block as defined below.
	ClusterProfile ClusterClusterProfileInput
	// An `ingressProfile` block as defined below.
	IngressProfile ClusterIngressProfileInput
	// The location where the Azure Red Hat OpenShift Cluster should be created. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A `mainProfile` block as defined below.
	MainProfile ClusterMainProfileInput
	// The name of the Azure Red Hat OpenShift Cluster to create. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A `networkProfile` block as defined below.
	NetworkProfile ClusterNetworkProfileInput
	// Specifies the Resource Group where the Azure Red Hat OpenShift Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A `servicePrincipal` block as defined below.
	ServicePrincipal ClusterServicePrincipalInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// A `workerProfile` block as defined below.
	WorkerProfile ClusterWorkerProfileInput
}

func (ClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterArgs)(nil)).Elem()
}

type ClusterInput interface {
	pulumi.Input

	ToClusterOutput() ClusterOutput
	ToClusterOutputWithContext(ctx context.Context) ClusterOutput
}

func (*Cluster) ElementType() reflect.Type {
	return reflect.TypeOf((**Cluster)(nil)).Elem()
}

func (i *Cluster) ToClusterOutput() ClusterOutput {
	return i.ToClusterOutputWithContext(context.Background())
}

func (i *Cluster) ToClusterOutputWithContext(ctx context.Context) ClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterOutput)
}

// ClusterArrayInput is an input type that accepts ClusterArray and ClusterArrayOutput values.
// You can construct a concrete instance of `ClusterArrayInput` via:
//
//	ClusterArray{ ClusterArgs{...} }
type ClusterArrayInput interface {
	pulumi.Input

	ToClusterArrayOutput() ClusterArrayOutput
	ToClusterArrayOutputWithContext(context.Context) ClusterArrayOutput
}

type ClusterArray []ClusterInput

func (ClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Cluster)(nil)).Elem()
}

func (i ClusterArray) ToClusterArrayOutput() ClusterArrayOutput {
	return i.ToClusterArrayOutputWithContext(context.Background())
}

func (i ClusterArray) ToClusterArrayOutputWithContext(ctx context.Context) ClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterArrayOutput)
}

// ClusterMapInput is an input type that accepts ClusterMap and ClusterMapOutput values.
// You can construct a concrete instance of `ClusterMapInput` via:
//
//	ClusterMap{ "key": ClusterArgs{...} }
type ClusterMapInput interface {
	pulumi.Input

	ToClusterMapOutput() ClusterMapOutput
	ToClusterMapOutputWithContext(context.Context) ClusterMapOutput
}

type ClusterMap map[string]ClusterInput

func (ClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Cluster)(nil)).Elem()
}

func (i ClusterMap) ToClusterMapOutput() ClusterMapOutput {
	return i.ToClusterMapOutputWithContext(context.Background())
}

func (i ClusterMap) ToClusterMapOutputWithContext(ctx context.Context) ClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterMapOutput)
}

type ClusterOutput struct{ *pulumi.OutputState }

func (ClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Cluster)(nil)).Elem()
}

func (o ClusterOutput) ToClusterOutput() ClusterOutput {
	return o
}

func (o ClusterOutput) ToClusterOutputWithContext(ctx context.Context) ClusterOutput {
	return o
}

// An `apiServerProfile` block as defined below.
func (o ClusterOutput) ApiServerProfile() ClusterApiServerProfileOutput {
	return o.ApplyT(func(v *Cluster) ClusterApiServerProfileOutput { return v.ApiServerProfile }).(ClusterApiServerProfileOutput)
}

// A `clusterProfile` block as defined below.
func (o ClusterOutput) ClusterProfile() ClusterClusterProfileOutput {
	return o.ApplyT(func(v *Cluster) ClusterClusterProfileOutput { return v.ClusterProfile }).(ClusterClusterProfileOutput)
}

// The Red Hat OpenShift cluster console URL.
func (o ClusterOutput) ConsoleUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.ConsoleUrl }).(pulumi.StringOutput)
}

// An `ingressProfile` block as defined below.
func (o ClusterOutput) IngressProfile() ClusterIngressProfileOutput {
	return o.ApplyT(func(v *Cluster) ClusterIngressProfileOutput { return v.IngressProfile }).(ClusterIngressProfileOutput)
}

// The location where the Azure Red Hat OpenShift Cluster should be created. Changing this forces a new resource to be created.
func (o ClusterOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// A `mainProfile` block as defined below.
func (o ClusterOutput) MainProfile() ClusterMainProfileOutput {
	return o.ApplyT(func(v *Cluster) ClusterMainProfileOutput { return v.MainProfile }).(ClusterMainProfileOutput)
}

// The name of the Azure Red Hat OpenShift Cluster to create. Changing this forces a new resource to be created.
func (o ClusterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A `networkProfile` block as defined below.
func (o ClusterOutput) NetworkProfile() ClusterNetworkProfileOutput {
	return o.ApplyT(func(v *Cluster) ClusterNetworkProfileOutput { return v.NetworkProfile }).(ClusterNetworkProfileOutput)
}

// Specifies the Resource Group where the Azure Red Hat OpenShift Cluster should exist. Changing this forces a new resource to be created.
func (o ClusterOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A `servicePrincipal` block as defined below.
func (o ClusterOutput) ServicePrincipal() ClusterServicePrincipalOutput {
	return o.ApplyT(func(v *Cluster) ClusterServicePrincipalOutput { return v.ServicePrincipal }).(ClusterServicePrincipalOutput)
}

// A mapping of tags to assign to the resource.
func (o ClusterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A `workerProfile` block as defined below.
func (o ClusterOutput) WorkerProfile() ClusterWorkerProfileOutput {
	return o.ApplyT(func(v *Cluster) ClusterWorkerProfileOutput { return v.WorkerProfile }).(ClusterWorkerProfileOutput)
}

type ClusterArrayOutput struct{ *pulumi.OutputState }

func (ClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Cluster)(nil)).Elem()
}

func (o ClusterArrayOutput) ToClusterArrayOutput() ClusterArrayOutput {
	return o
}

func (o ClusterArrayOutput) ToClusterArrayOutputWithContext(ctx context.Context) ClusterArrayOutput {
	return o
}

func (o ClusterArrayOutput) Index(i pulumi.IntInput) ClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Cluster {
		return vs[0].([]*Cluster)[vs[1].(int)]
	}).(ClusterOutput)
}

type ClusterMapOutput struct{ *pulumi.OutputState }

func (ClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Cluster)(nil)).Elem()
}

func (o ClusterMapOutput) ToClusterMapOutput() ClusterMapOutput {
	return o
}

func (o ClusterMapOutput) ToClusterMapOutputWithContext(ctx context.Context) ClusterMapOutput {
	return o
}

func (o ClusterMapOutput) MapIndex(k pulumi.StringInput) ClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Cluster {
		return vs[0].(map[string]*Cluster)[vs[1].(string)]
	}).(ClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterInput)(nil)).Elem(), &Cluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterArrayInput)(nil)).Elem(), ClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterMapInput)(nil)).Elem(), ClusterMap{})
	pulumi.RegisterOutputType(ClusterOutput{})
	pulumi.RegisterOutputType(ClusterArrayOutput{})
	pulumi.RegisterOutputType(ClusterMapOutput{})
}
