// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package streamanalytics

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Stream Analytics Job Schedule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/storage"
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/streamanalytics"
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
// 		_, err = storage.NewBlob(ctx, "exampleBlob", &storage.BlobArgs{
// 			StorageAccountName:   exampleAccount.Name,
// 			StorageContainerName: exampleContainer.Name,
// 			Type:                 pulumi.String("Block"),
// 			Source:               pulumi.NewFileAsset("example.csv"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleJob, err := streamanalytics.NewJob(ctx, "exampleJob", &streamanalytics.JobArgs{
// 			ResourceGroupName:                  exampleResourceGroup.Name,
// 			Location:                           exampleResourceGroup.Location,
// 			CompatibilityLevel:                 pulumi.String("1.2"),
// 			DataLocale:                         pulumi.String("en-GB"),
// 			EventsLateArrivalMaxDelayInSeconds: pulumi.Int(60),
// 			EventsOutOfOrderMaxDelayInSeconds:  pulumi.Int(50),
// 			EventsOutOfOrderPolicy:             pulumi.String("Adjust"),
// 			OutputErrorPolicy:                  pulumi.String("Drop"),
// 			StreamingUnits:                     pulumi.Int(3),
// 			Tags: pulumi.StringMap{
// 				"environment": pulumi.String("Example"),
// 			},
// 			TransformationQuery: pulumi.String(fmt.Sprintf("%v%v%v", "    SELECT *\n", "    INTO [exampleoutput]\n", "    FROM [exampleinput]\n")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleStreamInputBlob, err := streamanalytics.NewStreamInputBlob(ctx, "exampleStreamInputBlob", &streamanalytics.StreamInputBlobArgs{
// 			StreamAnalyticsJobName: exampleJob.Name,
// 			ResourceGroupName:      exampleJob.ResourceGroupName,
// 			StorageAccountName:     exampleAccount.Name,
// 			StorageAccountKey:      exampleAccount.PrimaryAccessKey,
// 			StorageContainerName:   exampleContainer.Name,
// 			PathPattern:            pulumi.String(""),
// 			DateFormat:             pulumi.String("yyyy/MM/dd"),
// 			TimeFormat:             pulumi.String("HH"),
// 			Serialization: &streamanalytics.StreamInputBlobSerializationArgs{
// 				Type:           pulumi.String("Csv"),
// 				Encoding:       pulumi.String("UTF8"),
// 				FieldDelimiter: pulumi.String(","),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleOutputBlob, err := streamanalytics.NewOutputBlob(ctx, "exampleOutputBlob", &streamanalytics.OutputBlobArgs{
// 			StreamAnalyticsJobName: exampleJob.Name,
// 			ResourceGroupName:      exampleJob.ResourceGroupName,
// 			StorageAccountName:     exampleAccount.Name,
// 			StorageAccountKey:      exampleAccount.PrimaryAccessKey,
// 			StorageContainerName:   exampleContainer.Name,
// 			PathPattern:            pulumi.String("example-{date}-{time}"),
// 			DateFormat:             pulumi.String("yyyy-MM-dd"),
// 			TimeFormat:             pulumi.String("HH"),
// 			Serialization: &streamanalytics.OutputBlobSerializationArgs{
// 				Type: pulumi.String("Avro"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = streamanalytics.NewJobSchedule(ctx, "exampleJobSchedule", &streamanalytics.JobScheduleArgs{
// 			StreamAnalyticsJobId: exampleJob.ID(),
// 			StartMode:            pulumi.String("CustomTime"),
// 			StartTime:            pulumi.String("2022-09-21T00:00:00Z"),
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			exampleJob,
// 			exampleStreamInputBlob,
// 			exampleOutputBlob,
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
// Stream Analytics Job's can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:streamanalytics/jobSchedule:JobSchedule example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/group1/providers/Microsoft.StreamAnalytics/streamingjobs/job1/schedule/default
// ```
type JobSchedule struct {
	pulumi.CustomResourceState

	// The time at which the Stream Analytics job last produced an output.
	LastOutputTime pulumi.StringOutput `pulumi:"lastOutputTime"`
	// The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
	StartMode pulumi.StringOutput `pulumi:"startMode"`
	// The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `startMode` is set to `CustomTime`
	StartTime pulumi.StringOutput `pulumi:"startTime"`
	// The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
	StreamAnalyticsJobId pulumi.StringOutput `pulumi:"streamAnalyticsJobId"`
}

// NewJobSchedule registers a new resource with the given unique name, arguments, and options.
func NewJobSchedule(ctx *pulumi.Context,
	name string, args *JobScheduleArgs, opts ...pulumi.ResourceOption) (*JobSchedule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StartMode == nil {
		return nil, errors.New("invalid value for required argument 'StartMode'")
	}
	if args.StreamAnalyticsJobId == nil {
		return nil, errors.New("invalid value for required argument 'StreamAnalyticsJobId'")
	}
	var resource JobSchedule
	err := ctx.RegisterResource("azure:streamanalytics/jobSchedule:JobSchedule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetJobSchedule gets an existing JobSchedule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetJobSchedule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *JobScheduleState, opts ...pulumi.ResourceOption) (*JobSchedule, error) {
	var resource JobSchedule
	err := ctx.ReadResource("azure:streamanalytics/jobSchedule:JobSchedule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering JobSchedule resources.
type jobScheduleState struct {
	// The time at which the Stream Analytics job last produced an output.
	LastOutputTime *string `pulumi:"lastOutputTime"`
	// The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
	StartMode *string `pulumi:"startMode"`
	// The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `startMode` is set to `CustomTime`
	StartTime *string `pulumi:"startTime"`
	// The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
	StreamAnalyticsJobId *string `pulumi:"streamAnalyticsJobId"`
}

type JobScheduleState struct {
	// The time at which the Stream Analytics job last produced an output.
	LastOutputTime pulumi.StringPtrInput
	// The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
	StartMode pulumi.StringPtrInput
	// The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `startMode` is set to `CustomTime`
	StartTime pulumi.StringPtrInput
	// The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
	StreamAnalyticsJobId pulumi.StringPtrInput
}

func (JobScheduleState) ElementType() reflect.Type {
	return reflect.TypeOf((*jobScheduleState)(nil)).Elem()
}

type jobScheduleArgs struct {
	// The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
	StartMode string `pulumi:"startMode"`
	// The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `startMode` is set to `CustomTime`
	StartTime *string `pulumi:"startTime"`
	// The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
	StreamAnalyticsJobId string `pulumi:"streamAnalyticsJobId"`
}

// The set of arguments for constructing a JobSchedule resource.
type JobScheduleArgs struct {
	// The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
	StartMode pulumi.StringInput
	// The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `startMode` is set to `CustomTime`
	StartTime pulumi.StringPtrInput
	// The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
	StreamAnalyticsJobId pulumi.StringInput
}

func (JobScheduleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*jobScheduleArgs)(nil)).Elem()
}

type JobScheduleInput interface {
	pulumi.Input

	ToJobScheduleOutput() JobScheduleOutput
	ToJobScheduleOutputWithContext(ctx context.Context) JobScheduleOutput
}

func (*JobSchedule) ElementType() reflect.Type {
	return reflect.TypeOf((**JobSchedule)(nil)).Elem()
}

func (i *JobSchedule) ToJobScheduleOutput() JobScheduleOutput {
	return i.ToJobScheduleOutputWithContext(context.Background())
}

func (i *JobSchedule) ToJobScheduleOutputWithContext(ctx context.Context) JobScheduleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobScheduleOutput)
}

// JobScheduleArrayInput is an input type that accepts JobScheduleArray and JobScheduleArrayOutput values.
// You can construct a concrete instance of `JobScheduleArrayInput` via:
//
//          JobScheduleArray{ JobScheduleArgs{...} }
type JobScheduleArrayInput interface {
	pulumi.Input

	ToJobScheduleArrayOutput() JobScheduleArrayOutput
	ToJobScheduleArrayOutputWithContext(context.Context) JobScheduleArrayOutput
}

type JobScheduleArray []JobScheduleInput

func (JobScheduleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JobSchedule)(nil)).Elem()
}

func (i JobScheduleArray) ToJobScheduleArrayOutput() JobScheduleArrayOutput {
	return i.ToJobScheduleArrayOutputWithContext(context.Background())
}

func (i JobScheduleArray) ToJobScheduleArrayOutputWithContext(ctx context.Context) JobScheduleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobScheduleArrayOutput)
}

// JobScheduleMapInput is an input type that accepts JobScheduleMap and JobScheduleMapOutput values.
// You can construct a concrete instance of `JobScheduleMapInput` via:
//
//          JobScheduleMap{ "key": JobScheduleArgs{...} }
type JobScheduleMapInput interface {
	pulumi.Input

	ToJobScheduleMapOutput() JobScheduleMapOutput
	ToJobScheduleMapOutputWithContext(context.Context) JobScheduleMapOutput
}

type JobScheduleMap map[string]JobScheduleInput

func (JobScheduleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JobSchedule)(nil)).Elem()
}

func (i JobScheduleMap) ToJobScheduleMapOutput() JobScheduleMapOutput {
	return i.ToJobScheduleMapOutputWithContext(context.Background())
}

func (i JobScheduleMap) ToJobScheduleMapOutputWithContext(ctx context.Context) JobScheduleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobScheduleMapOutput)
}

type JobScheduleOutput struct{ *pulumi.OutputState }

func (JobScheduleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**JobSchedule)(nil)).Elem()
}

func (o JobScheduleOutput) ToJobScheduleOutput() JobScheduleOutput {
	return o
}

func (o JobScheduleOutput) ToJobScheduleOutputWithContext(ctx context.Context) JobScheduleOutput {
	return o
}

// The time at which the Stream Analytics job last produced an output.
func (o JobScheduleOutput) LastOutputTime() pulumi.StringOutput {
	return o.ApplyT(func(v *JobSchedule) pulumi.StringOutput { return v.LastOutputTime }).(pulumi.StringOutput)
}

// The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
func (o JobScheduleOutput) StartMode() pulumi.StringOutput {
	return o.ApplyT(func(v *JobSchedule) pulumi.StringOutput { return v.StartMode }).(pulumi.StringOutput)
}

// The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `startMode` is set to `CustomTime`
func (o JobScheduleOutput) StartTime() pulumi.StringOutput {
	return o.ApplyT(func(v *JobSchedule) pulumi.StringOutput { return v.StartTime }).(pulumi.StringOutput)
}

// The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
func (o JobScheduleOutput) StreamAnalyticsJobId() pulumi.StringOutput {
	return o.ApplyT(func(v *JobSchedule) pulumi.StringOutput { return v.StreamAnalyticsJobId }).(pulumi.StringOutput)
}

type JobScheduleArrayOutput struct{ *pulumi.OutputState }

func (JobScheduleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JobSchedule)(nil)).Elem()
}

func (o JobScheduleArrayOutput) ToJobScheduleArrayOutput() JobScheduleArrayOutput {
	return o
}

func (o JobScheduleArrayOutput) ToJobScheduleArrayOutputWithContext(ctx context.Context) JobScheduleArrayOutput {
	return o
}

func (o JobScheduleArrayOutput) Index(i pulumi.IntInput) JobScheduleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *JobSchedule {
		return vs[0].([]*JobSchedule)[vs[1].(int)]
	}).(JobScheduleOutput)
}

type JobScheduleMapOutput struct{ *pulumi.OutputState }

func (JobScheduleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JobSchedule)(nil)).Elem()
}

func (o JobScheduleMapOutput) ToJobScheduleMapOutput() JobScheduleMapOutput {
	return o
}

func (o JobScheduleMapOutput) ToJobScheduleMapOutputWithContext(ctx context.Context) JobScheduleMapOutput {
	return o
}

func (o JobScheduleMapOutput) MapIndex(k pulumi.StringInput) JobScheduleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *JobSchedule {
		return vs[0].(map[string]*JobSchedule)[vs[1].(string)]
	}).(JobScheduleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*JobScheduleInput)(nil)).Elem(), &JobSchedule{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobScheduleArrayInput)(nil)).Elem(), JobScheduleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobScheduleMapInput)(nil)).Elem(), JobScheduleMap{})
	pulumi.RegisterOutputType(JobScheduleOutput{})
	pulumi.RegisterOutputType(JobScheduleArrayOutput{})
	pulumi.RegisterOutputType(JobScheduleMapOutput{})
}