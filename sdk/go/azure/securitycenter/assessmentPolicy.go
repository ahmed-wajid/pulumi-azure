// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package securitycenter

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages the Security Center Assessment Metadata for Azure Security Center.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/securitycenter"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := securitycenter.NewAssessmentPolicy(ctx, "example", &securitycenter.AssessmentPolicyArgs{
// 			Description: pulumi.String("Test Description"),
// 			DisplayName: pulumi.String("Test Display Name"),
// 			Severity:    pulumi.String("Medium"),
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
// Security Assessments Policy can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:securitycenter/assessmentPolicy:AssessmentPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Security/assessmentMetadata/metadata1
// ```
type AssessmentPolicy struct {
	pulumi.CustomResourceState

	// The description of the Security Center Assessment.
	Description pulumi.StringOutput `pulumi:"description"`
	// The user-friendly display name of the Security Center Assessment.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The implementation effort which is used to remediate the Security Center Assessment. Possible values are `Low`, `Moderate` and `High`.
	ImplementationEffort pulumi.StringPtrOutput `pulumi:"implementationEffort"`
	// The GUID as the name of the Security Center Assessment Policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// The description which is used to mitigate the security issue.
	RemediationDescription pulumi.StringPtrOutput `pulumi:"remediationDescription"`
	// The severity level of the Security Center Assessment. Possible values are `Low`, `Medium` and `High`. Defaults to `Medium`.
	Severity pulumi.StringPtrOutput `pulumi:"severity"`
	// A list of the threat impacts for the Security Center Assessment. Possible values are `AccountBreach`, `DataExfiltration`, `DataSpillage`, `DenialOfService`, `ElevationOfPrivilege`, `MaliciousInsider`, `MissingCoverage` and `ThreatResistance`.
	Threats pulumi.StringArrayOutput `pulumi:"threats"`
	// The user impact of the Security Center Assessment. Possible values are `Low`, `Moderate` and `High`.
	UserImpact pulumi.StringPtrOutput `pulumi:"userImpact"`
}

// NewAssessmentPolicy registers a new resource with the given unique name, arguments, and options.
func NewAssessmentPolicy(ctx *pulumi.Context,
	name string, args *AssessmentPolicyArgs, opts ...pulumi.ResourceOption) (*AssessmentPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	var resource AssessmentPolicy
	err := ctx.RegisterResource("azure:securitycenter/assessmentPolicy:AssessmentPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAssessmentPolicy gets an existing AssessmentPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAssessmentPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AssessmentPolicyState, opts ...pulumi.ResourceOption) (*AssessmentPolicy, error) {
	var resource AssessmentPolicy
	err := ctx.ReadResource("azure:securitycenter/assessmentPolicy:AssessmentPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AssessmentPolicy resources.
type assessmentPolicyState struct {
	// The description of the Security Center Assessment.
	Description *string `pulumi:"description"`
	// The user-friendly display name of the Security Center Assessment.
	DisplayName *string `pulumi:"displayName"`
	// The implementation effort which is used to remediate the Security Center Assessment. Possible values are `Low`, `Moderate` and `High`.
	ImplementationEffort *string `pulumi:"implementationEffort"`
	// The GUID as the name of the Security Center Assessment Policy.
	Name *string `pulumi:"name"`
	// The description which is used to mitigate the security issue.
	RemediationDescription *string `pulumi:"remediationDescription"`
	// The severity level of the Security Center Assessment. Possible values are `Low`, `Medium` and `High`. Defaults to `Medium`.
	Severity *string `pulumi:"severity"`
	// A list of the threat impacts for the Security Center Assessment. Possible values are `AccountBreach`, `DataExfiltration`, `DataSpillage`, `DenialOfService`, `ElevationOfPrivilege`, `MaliciousInsider`, `MissingCoverage` and `ThreatResistance`.
	Threats []string `pulumi:"threats"`
	// The user impact of the Security Center Assessment. Possible values are `Low`, `Moderate` and `High`.
	UserImpact *string `pulumi:"userImpact"`
}

type AssessmentPolicyState struct {
	// The description of the Security Center Assessment.
	Description pulumi.StringPtrInput
	// The user-friendly display name of the Security Center Assessment.
	DisplayName pulumi.StringPtrInput
	// The implementation effort which is used to remediate the Security Center Assessment. Possible values are `Low`, `Moderate` and `High`.
	ImplementationEffort pulumi.StringPtrInput
	// The GUID as the name of the Security Center Assessment Policy.
	Name pulumi.StringPtrInput
	// The description which is used to mitigate the security issue.
	RemediationDescription pulumi.StringPtrInput
	// The severity level of the Security Center Assessment. Possible values are `Low`, `Medium` and `High`. Defaults to `Medium`.
	Severity pulumi.StringPtrInput
	// A list of the threat impacts for the Security Center Assessment. Possible values are `AccountBreach`, `DataExfiltration`, `DataSpillage`, `DenialOfService`, `ElevationOfPrivilege`, `MaliciousInsider`, `MissingCoverage` and `ThreatResistance`.
	Threats pulumi.StringArrayInput
	// The user impact of the Security Center Assessment. Possible values are `Low`, `Moderate` and `High`.
	UserImpact pulumi.StringPtrInput
}

func (AssessmentPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*assessmentPolicyState)(nil)).Elem()
}

type assessmentPolicyArgs struct {
	// The description of the Security Center Assessment.
	Description string `pulumi:"description"`
	// The user-friendly display name of the Security Center Assessment.
	DisplayName string `pulumi:"displayName"`
	// The implementation effort which is used to remediate the Security Center Assessment. Possible values are `Low`, `Moderate` and `High`.
	ImplementationEffort *string `pulumi:"implementationEffort"`
	// The description which is used to mitigate the security issue.
	RemediationDescription *string `pulumi:"remediationDescription"`
	// The severity level of the Security Center Assessment. Possible values are `Low`, `Medium` and `High`. Defaults to `Medium`.
	Severity *string `pulumi:"severity"`
	// A list of the threat impacts for the Security Center Assessment. Possible values are `AccountBreach`, `DataExfiltration`, `DataSpillage`, `DenialOfService`, `ElevationOfPrivilege`, `MaliciousInsider`, `MissingCoverage` and `ThreatResistance`.
	Threats []string `pulumi:"threats"`
	// The user impact of the Security Center Assessment. Possible values are `Low`, `Moderate` and `High`.
	UserImpact *string `pulumi:"userImpact"`
}

// The set of arguments for constructing a AssessmentPolicy resource.
type AssessmentPolicyArgs struct {
	// The description of the Security Center Assessment.
	Description pulumi.StringInput
	// The user-friendly display name of the Security Center Assessment.
	DisplayName pulumi.StringInput
	// The implementation effort which is used to remediate the Security Center Assessment. Possible values are `Low`, `Moderate` and `High`.
	ImplementationEffort pulumi.StringPtrInput
	// The description which is used to mitigate the security issue.
	RemediationDescription pulumi.StringPtrInput
	// The severity level of the Security Center Assessment. Possible values are `Low`, `Medium` and `High`. Defaults to `Medium`.
	Severity pulumi.StringPtrInput
	// A list of the threat impacts for the Security Center Assessment. Possible values are `AccountBreach`, `DataExfiltration`, `DataSpillage`, `DenialOfService`, `ElevationOfPrivilege`, `MaliciousInsider`, `MissingCoverage` and `ThreatResistance`.
	Threats pulumi.StringArrayInput
	// The user impact of the Security Center Assessment. Possible values are `Low`, `Moderate` and `High`.
	UserImpact pulumi.StringPtrInput
}

func (AssessmentPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*assessmentPolicyArgs)(nil)).Elem()
}

type AssessmentPolicyInput interface {
	pulumi.Input

	ToAssessmentPolicyOutput() AssessmentPolicyOutput
	ToAssessmentPolicyOutputWithContext(ctx context.Context) AssessmentPolicyOutput
}

func (*AssessmentPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((*AssessmentPolicy)(nil))
}

func (i *AssessmentPolicy) ToAssessmentPolicyOutput() AssessmentPolicyOutput {
	return i.ToAssessmentPolicyOutputWithContext(context.Background())
}

func (i *AssessmentPolicy) ToAssessmentPolicyOutputWithContext(ctx context.Context) AssessmentPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssessmentPolicyOutput)
}

func (i *AssessmentPolicy) ToAssessmentPolicyPtrOutput() AssessmentPolicyPtrOutput {
	return i.ToAssessmentPolicyPtrOutputWithContext(context.Background())
}

func (i *AssessmentPolicy) ToAssessmentPolicyPtrOutputWithContext(ctx context.Context) AssessmentPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssessmentPolicyPtrOutput)
}

type AssessmentPolicyPtrInput interface {
	pulumi.Input

	ToAssessmentPolicyPtrOutput() AssessmentPolicyPtrOutput
	ToAssessmentPolicyPtrOutputWithContext(ctx context.Context) AssessmentPolicyPtrOutput
}

type assessmentPolicyPtrType AssessmentPolicyArgs

func (*assessmentPolicyPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AssessmentPolicy)(nil))
}

func (i *assessmentPolicyPtrType) ToAssessmentPolicyPtrOutput() AssessmentPolicyPtrOutput {
	return i.ToAssessmentPolicyPtrOutputWithContext(context.Background())
}

func (i *assessmentPolicyPtrType) ToAssessmentPolicyPtrOutputWithContext(ctx context.Context) AssessmentPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssessmentPolicyPtrOutput)
}

// AssessmentPolicyArrayInput is an input type that accepts AssessmentPolicyArray and AssessmentPolicyArrayOutput values.
// You can construct a concrete instance of `AssessmentPolicyArrayInput` via:
//
//          AssessmentPolicyArray{ AssessmentPolicyArgs{...} }
type AssessmentPolicyArrayInput interface {
	pulumi.Input

	ToAssessmentPolicyArrayOutput() AssessmentPolicyArrayOutput
	ToAssessmentPolicyArrayOutputWithContext(context.Context) AssessmentPolicyArrayOutput
}

type AssessmentPolicyArray []AssessmentPolicyInput

func (AssessmentPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AssessmentPolicy)(nil))
}

func (i AssessmentPolicyArray) ToAssessmentPolicyArrayOutput() AssessmentPolicyArrayOutput {
	return i.ToAssessmentPolicyArrayOutputWithContext(context.Background())
}

func (i AssessmentPolicyArray) ToAssessmentPolicyArrayOutputWithContext(ctx context.Context) AssessmentPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssessmentPolicyArrayOutput)
}

// AssessmentPolicyMapInput is an input type that accepts AssessmentPolicyMap and AssessmentPolicyMapOutput values.
// You can construct a concrete instance of `AssessmentPolicyMapInput` via:
//
//          AssessmentPolicyMap{ "key": AssessmentPolicyArgs{...} }
type AssessmentPolicyMapInput interface {
	pulumi.Input

	ToAssessmentPolicyMapOutput() AssessmentPolicyMapOutput
	ToAssessmentPolicyMapOutputWithContext(context.Context) AssessmentPolicyMapOutput
}

type AssessmentPolicyMap map[string]AssessmentPolicyInput

func (AssessmentPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AssessmentPolicy)(nil))
}

func (i AssessmentPolicyMap) ToAssessmentPolicyMapOutput() AssessmentPolicyMapOutput {
	return i.ToAssessmentPolicyMapOutputWithContext(context.Background())
}

func (i AssessmentPolicyMap) ToAssessmentPolicyMapOutputWithContext(ctx context.Context) AssessmentPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssessmentPolicyMapOutput)
}

type AssessmentPolicyOutput struct {
	*pulumi.OutputState
}

func (AssessmentPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AssessmentPolicy)(nil))
}

func (o AssessmentPolicyOutput) ToAssessmentPolicyOutput() AssessmentPolicyOutput {
	return o
}

func (o AssessmentPolicyOutput) ToAssessmentPolicyOutputWithContext(ctx context.Context) AssessmentPolicyOutput {
	return o
}

func (o AssessmentPolicyOutput) ToAssessmentPolicyPtrOutput() AssessmentPolicyPtrOutput {
	return o.ToAssessmentPolicyPtrOutputWithContext(context.Background())
}

func (o AssessmentPolicyOutput) ToAssessmentPolicyPtrOutputWithContext(ctx context.Context) AssessmentPolicyPtrOutput {
	return o.ApplyT(func(v AssessmentPolicy) *AssessmentPolicy {
		return &v
	}).(AssessmentPolicyPtrOutput)
}

type AssessmentPolicyPtrOutput struct {
	*pulumi.OutputState
}

func (AssessmentPolicyPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AssessmentPolicy)(nil))
}

func (o AssessmentPolicyPtrOutput) ToAssessmentPolicyPtrOutput() AssessmentPolicyPtrOutput {
	return o
}

func (o AssessmentPolicyPtrOutput) ToAssessmentPolicyPtrOutputWithContext(ctx context.Context) AssessmentPolicyPtrOutput {
	return o
}

type AssessmentPolicyArrayOutput struct{ *pulumi.OutputState }

func (AssessmentPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AssessmentPolicy)(nil))
}

func (o AssessmentPolicyArrayOutput) ToAssessmentPolicyArrayOutput() AssessmentPolicyArrayOutput {
	return o
}

func (o AssessmentPolicyArrayOutput) ToAssessmentPolicyArrayOutputWithContext(ctx context.Context) AssessmentPolicyArrayOutput {
	return o
}

func (o AssessmentPolicyArrayOutput) Index(i pulumi.IntInput) AssessmentPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AssessmentPolicy {
		return vs[0].([]AssessmentPolicy)[vs[1].(int)]
	}).(AssessmentPolicyOutput)
}

type AssessmentPolicyMapOutput struct{ *pulumi.OutputState }

func (AssessmentPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AssessmentPolicy)(nil))
}

func (o AssessmentPolicyMapOutput) ToAssessmentPolicyMapOutput() AssessmentPolicyMapOutput {
	return o
}

func (o AssessmentPolicyMapOutput) ToAssessmentPolicyMapOutputWithContext(ctx context.Context) AssessmentPolicyMapOutput {
	return o
}

func (o AssessmentPolicyMapOutput) MapIndex(k pulumi.StringInput) AssessmentPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AssessmentPolicy {
		return vs[0].(map[string]AssessmentPolicy)[vs[1].(string)]
	}).(AssessmentPolicyOutput)
}

func init() {
	pulumi.RegisterOutputType(AssessmentPolicyOutput{})
	pulumi.RegisterOutputType(AssessmentPolicyPtrOutput{})
	pulumi.RegisterOutputType(AssessmentPolicyArrayOutput{})
	pulumi.RegisterOutputType(AssessmentPolicyMapOutput{})
}