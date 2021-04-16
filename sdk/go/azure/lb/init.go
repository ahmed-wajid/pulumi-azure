// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package lb

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
	case "azure:lb/backendAddressPool:BackendAddressPool":
		r = &BackendAddressPool{}
	case "azure:lb/backendAddressPoolAddress:BackendAddressPoolAddress":
		r = &BackendAddressPoolAddress{}
	case "azure:lb/loadBalancer:LoadBalancer":
		r = &LoadBalancer{}
	case "azure:lb/natPool:NatPool":
		r = &NatPool{}
	case "azure:lb/natRule:NatRule":
		r = &NatRule{}
	case "azure:lb/outboundRule:OutboundRule":
		r = &OutboundRule{}
	case "azure:lb/probe:Probe":
		r = &Probe{}
	case "azure:lb/rule:Rule":
		r = &Rule{}
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
		"lb/backendAddressPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"lb/backendAddressPoolAddress",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"lb/loadBalancer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"lb/natPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"lb/natRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"lb/outboundRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"lb/probe",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"lb/rule",
		&module{version},
	)
}