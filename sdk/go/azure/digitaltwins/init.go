// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitaltwins

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "azure:digitaltwins/endpointEventGrid:EndpointEventGrid":
		r = &EndpointEventGrid{}
	case "azure:digitaltwins/endpointEventHub:EndpointEventHub":
		r = &EndpointEventHub{}
	case "azure:digitaltwins/endpointServicebus:EndpointServicebus":
		r = &EndpointServicebus{}
	case "azure:digitaltwins/instance:Instance":
		r = &Instance{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := azure.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"azure",
		"digitaltwins/endpointEventGrid",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"digitaltwins/endpointEventHub",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"digitaltwins/endpointServicebus",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"digitaltwins/instance",
		&module{version},
	)
}