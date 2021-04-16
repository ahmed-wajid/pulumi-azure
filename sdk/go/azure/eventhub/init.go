// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eventhub

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
	case "azure:eventhub/authorizationRule:AuthorizationRule":
		r = &AuthorizationRule{}
	case "azure:eventhub/cluster:Cluster":
		r = &Cluster{}
	case "azure:eventhub/consumerGroup:ConsumerGroup":
		r = &ConsumerGroup{}
	case "azure:eventhub/domain:Domain":
		r = &Domain{}
	case "azure:eventhub/eventGridTopic:EventGridTopic":
		r = &EventGridTopic{}
	case "azure:eventhub/eventHub:EventHub":
		r = &EventHub{}
	case "azure:eventhub/eventHubAuthorizationRule:EventHubAuthorizationRule":
		r = &EventHubAuthorizationRule{}
	case "azure:eventhub/eventHubConsumerGroup:EventHubConsumerGroup":
		r = &EventHubConsumerGroup{}
	case "azure:eventhub/eventHubNamespace:EventHubNamespace":
		r = &EventHubNamespace{}
	case "azure:eventhub/eventHubNamespaceAuthorizationRule:EventHubNamespaceAuthorizationRule":
		r = &EventHubNamespaceAuthorizationRule{}
	case "azure:eventhub/eventSubscription:EventSubscription":
		r = &EventSubscription{}
	case "azure:eventhub/eventhubNamespaceDisasterRecoveryConfig:EventhubNamespaceDisasterRecoveryConfig":
		r = &EventhubNamespaceDisasterRecoveryConfig{}
	case "azure:eventhub/namespace:Namespace":
		r = &Namespace{}
	case "azure:eventhub/namespaceAuthorizationRule:NamespaceAuthorizationRule":
		r = &NamespaceAuthorizationRule{}
	case "azure:eventhub/queue:Queue":
		r = &Queue{}
	case "azure:eventhub/queueAuthorizationRule:QueueAuthorizationRule":
		r = &QueueAuthorizationRule{}
	case "azure:eventhub/subscription:Subscription":
		r = &Subscription{}
	case "azure:eventhub/subscriptionRule:SubscriptionRule":
		r = &SubscriptionRule{}
	case "azure:eventhub/topic:Topic":
		r = &Topic{}
	case "azure:eventhub/topicAuthorizationRule:TopicAuthorizationRule":
		r = &TopicAuthorizationRule{}
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
		"eventhub/authorizationRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/cluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/consumerGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/domain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/eventGridTopic",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/eventHub",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/eventHubAuthorizationRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/eventHubConsumerGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/eventHubNamespace",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/eventHubNamespaceAuthorizationRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/eventSubscription",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/eventhubNamespaceDisasterRecoveryConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/namespace",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/namespaceAuthorizationRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/queue",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/queueAuthorizationRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/subscription",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/subscriptionRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/topic",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"eventhub/topicAuthorizationRule",
		&module{version},
	)
}