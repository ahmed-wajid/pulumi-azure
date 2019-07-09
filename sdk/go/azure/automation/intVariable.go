// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package automation

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Manages a integer variable in Azure Automation
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/r/automation_variable_int.html.markdown.
type IntVariable struct {
	s *pulumi.ResourceState
}

// NewIntVariable registers a new resource with the given unique name, arguments, and options.
func NewIntVariable(ctx *pulumi.Context,
	name string, args *IntVariableArgs, opts ...pulumi.ResourceOpt) (*IntVariable, error) {
	if args == nil || args.AutomationAccountName == nil {
		return nil, errors.New("missing required argument 'AutomationAccountName'")
	}
	if args == nil || args.ResourceGroupName == nil {
		return nil, errors.New("missing required argument 'ResourceGroupName'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["automationAccountName"] = nil
		inputs["description"] = nil
		inputs["encrypted"] = nil
		inputs["name"] = nil
		inputs["resourceGroupName"] = nil
		inputs["value"] = nil
	} else {
		inputs["automationAccountName"] = args.AutomationAccountName
		inputs["description"] = args.Description
		inputs["encrypted"] = args.Encrypted
		inputs["name"] = args.Name
		inputs["resourceGroupName"] = args.ResourceGroupName
		inputs["value"] = args.Value
	}
	s, err := ctx.RegisterResource("azure:automation/intVariable:IntVariable", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &IntVariable{s: s}, nil
}

// GetIntVariable gets an existing IntVariable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIntVariable(ctx *pulumi.Context,
	name string, id pulumi.ID, state *IntVariableState, opts ...pulumi.ResourceOpt) (*IntVariable, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["automationAccountName"] = state.AutomationAccountName
		inputs["description"] = state.Description
		inputs["encrypted"] = state.Encrypted
		inputs["name"] = state.Name
		inputs["resourceGroupName"] = state.ResourceGroupName
		inputs["value"] = state.Value
	}
	s, err := ctx.ReadResource("azure:automation/intVariable:IntVariable", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &IntVariable{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *IntVariable) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *IntVariable) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The name of the automation account in which the Variable is created. Changing this forces a new resource to be created.
func (r *IntVariable) AutomationAccountName() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["automationAccountName"])
}

// The description of the Automation Variable.
func (r *IntVariable) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// Specifies if the Automation Variable is encrypted. Defaults to `false`.
func (r *IntVariable) Encrypted() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["encrypted"])
}

// The name of the Automation Variable. Changing this forces a new resource to be created.
func (r *IntVariable) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// The name of the resource group in which to create the Automation Variable. Changing this forces a new resource to be created.
func (r *IntVariable) ResourceGroupName() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["resourceGroupName"])
}

// The value of the Automation Variable as a `integer`.
func (r *IntVariable) Value() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["value"])
}

// Input properties used for looking up and filtering IntVariable resources.
type IntVariableState struct {
	// The name of the automation account in which the Variable is created. Changing this forces a new resource to be created.
	AutomationAccountName interface{}
	// The description of the Automation Variable.
	Description interface{}
	// Specifies if the Automation Variable is encrypted. Defaults to `false`.
	Encrypted interface{}
	// The name of the Automation Variable. Changing this forces a new resource to be created.
	Name interface{}
	// The name of the resource group in which to create the Automation Variable. Changing this forces a new resource to be created.
	ResourceGroupName interface{}
	// The value of the Automation Variable as a `integer`.
	Value interface{}
}

// The set of arguments for constructing a IntVariable resource.
type IntVariableArgs struct {
	// The name of the automation account in which the Variable is created. Changing this forces a new resource to be created.
	AutomationAccountName interface{}
	// The description of the Automation Variable.
	Description interface{}
	// Specifies if the Automation Variable is encrypted. Defaults to `false`.
	Encrypted interface{}
	// The name of the Automation Variable. Changing this forces a new resource to be created.
	Name interface{}
	// The name of the resource group in which to create the Automation Variable. Changing this forces a new resource to be created.
	ResourceGroupName interface{}
	// The value of the Automation Variable as a `integer`.
	Value interface{}
}