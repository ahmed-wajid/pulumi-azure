// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package siterecovery

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information about an Azure Site Recovery Plan within a Recovery Services vault. A recovery plan gathers machines into recovery groups for the purpose of failover.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/recoveryservices"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/siterecovery"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			vault, err := recoveryservices.LookupVault(ctx, &recoveryservices.LookupVaultArgs{
//				Name:              "tfex-recovery_vault",
//				ResourceGroupName: "tfex-resource_group",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = siterecovery.LookupReplicationRecoveryPlan(ctx, &siterecovery.LookupReplicationRecoveryPlanArgs{
//				Name:            "example-recovery-plan",
//				RecoveryVaultId: vault.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupReplicationRecoveryPlan(ctx *pulumi.Context, args *LookupReplicationRecoveryPlanArgs, opts ...pulumi.InvokeOption) (*LookupReplicationRecoveryPlanResult, error) {
	var rv LookupReplicationRecoveryPlanResult
	err := ctx.Invoke("azure:siterecovery/getReplicationRecoveryPlan:getReplicationRecoveryPlan", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getReplicationRecoveryPlan.
type LookupReplicationRecoveryPlanArgs struct {
	// The name of the Replication Plan.
	Name string `pulumi:"name"`
	// The ID of the vault that should be updated.
	RecoveryVaultId string `pulumi:"recoveryVaultId"`
}

// A collection of values returned by getReplicationRecoveryPlan.
type LookupReplicationRecoveryPlanResult struct {
	FailoverDeploymentModel string `pulumi:"failoverDeploymentModel"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name of the Action.
	Name string `pulumi:"name"`
	// `recoveryGroup` block defined as below.
	// ---
	RecoveryGroups  []GetReplicationRecoveryPlanRecoveryGroup `pulumi:"recoveryGroups"`
	RecoveryVaultId string                                    `pulumi:"recoveryVaultId"`
	// The ID of source fabric to be recovered from.
	SourceRecoveryFabricId string `pulumi:"sourceRecoveryFabricId"`
	// The ID of target fabric to recover.
	TargetRecoveryFabricId string `pulumi:"targetRecoveryFabricId"`
}

func LookupReplicationRecoveryPlanOutput(ctx *pulumi.Context, args LookupReplicationRecoveryPlanOutputArgs, opts ...pulumi.InvokeOption) LookupReplicationRecoveryPlanResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupReplicationRecoveryPlanResult, error) {
			args := v.(LookupReplicationRecoveryPlanArgs)
			r, err := LookupReplicationRecoveryPlan(ctx, &args, opts...)
			var s LookupReplicationRecoveryPlanResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupReplicationRecoveryPlanResultOutput)
}

// A collection of arguments for invoking getReplicationRecoveryPlan.
type LookupReplicationRecoveryPlanOutputArgs struct {
	// The name of the Replication Plan.
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the vault that should be updated.
	RecoveryVaultId pulumi.StringInput `pulumi:"recoveryVaultId"`
}

func (LookupReplicationRecoveryPlanOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupReplicationRecoveryPlanArgs)(nil)).Elem()
}

// A collection of values returned by getReplicationRecoveryPlan.
type LookupReplicationRecoveryPlanResultOutput struct{ *pulumi.OutputState }

func (LookupReplicationRecoveryPlanResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupReplicationRecoveryPlanResult)(nil)).Elem()
}

func (o LookupReplicationRecoveryPlanResultOutput) ToLookupReplicationRecoveryPlanResultOutput() LookupReplicationRecoveryPlanResultOutput {
	return o
}

func (o LookupReplicationRecoveryPlanResultOutput) ToLookupReplicationRecoveryPlanResultOutputWithContext(ctx context.Context) LookupReplicationRecoveryPlanResultOutput {
	return o
}

func (o LookupReplicationRecoveryPlanResultOutput) FailoverDeploymentModel() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationRecoveryPlanResult) string { return v.FailoverDeploymentModel }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupReplicationRecoveryPlanResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationRecoveryPlanResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the Action.
func (o LookupReplicationRecoveryPlanResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationRecoveryPlanResult) string { return v.Name }).(pulumi.StringOutput)
}

// `recoveryGroup` block defined as below.
// ---
func (o LookupReplicationRecoveryPlanResultOutput) RecoveryGroups() GetReplicationRecoveryPlanRecoveryGroupArrayOutput {
	return o.ApplyT(func(v LookupReplicationRecoveryPlanResult) []GetReplicationRecoveryPlanRecoveryGroup {
		return v.RecoveryGroups
	}).(GetReplicationRecoveryPlanRecoveryGroupArrayOutput)
}

func (o LookupReplicationRecoveryPlanResultOutput) RecoveryVaultId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationRecoveryPlanResult) string { return v.RecoveryVaultId }).(pulumi.StringOutput)
}

// The ID of source fabric to be recovered from.
func (o LookupReplicationRecoveryPlanResultOutput) SourceRecoveryFabricId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationRecoveryPlanResult) string { return v.SourceRecoveryFabricId }).(pulumi.StringOutput)
}

// The ID of target fabric to recover.
func (o LookupReplicationRecoveryPlanResultOutput) TargetRecoveryFabricId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupReplicationRecoveryPlanResult) string { return v.TargetRecoveryFabricId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupReplicationRecoveryPlanResultOutput{})
}