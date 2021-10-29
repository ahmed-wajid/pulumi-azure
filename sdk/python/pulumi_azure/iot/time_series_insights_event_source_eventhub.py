# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TimeSeriesInsightsEventSourceEventhubArgs', 'TimeSeriesInsightsEventSourceEventhub']

@pulumi.input_type
class TimeSeriesInsightsEventSourceEventhubArgs:
    def __init__(__self__, *,
                 consumer_group_name: pulumi.Input[str],
                 environment_id: pulumi.Input[str],
                 event_source_resource_id: pulumi.Input[str],
                 eventhub_name: pulumi.Input[str],
                 namespace_name: pulumi.Input[str],
                 shared_access_key: pulumi.Input[str],
                 shared_access_key_name: pulumi.Input[str],
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timestamp_property_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TimeSeriesInsightsEventSourceEventhub resource.
        :param pulumi.Input[str] consumer_group_name: Specifies the name of the EventHub Consumer Group that holds the partitions from which events will be read.
        :param pulumi.Input[str] environment_id: Specifies the id of the IoT Time Series Insights Environment that the Event Source should be associated with. Changing this forces a new resource to created.
        :param pulumi.Input[str] event_source_resource_id: Specifies the resource id where events will be coming from.
        :param pulumi.Input[str] eventhub_name: Specifies the name of the EventHub which will be associated with this resource.
        :param pulumi.Input[str] namespace_name: Specifies the EventHub Namespace name.
        :param pulumi.Input[str] shared_access_key: Specifies the value of the Shared Access Policy key that grants the Time Series Insights service read access to the EventHub.
        :param pulumi.Input[str] shared_access_key_name: Specifies the name of the Shared Access key that grants the Event Source access to the EventHub.
        :param pulumi.Input[str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the Azure IoT Time Series Insights EventHub Event Source. Changing this forces a new resource to be created. Must be globally unique.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] timestamp_property_name: Specifies the value that will be used as the event source's timestamp. This value defaults to the event creation time.
        """
        pulumi.set(__self__, "consumer_group_name", consumer_group_name)
        pulumi.set(__self__, "environment_id", environment_id)
        pulumi.set(__self__, "event_source_resource_id", event_source_resource_id)
        pulumi.set(__self__, "eventhub_name", eventhub_name)
        pulumi.set(__self__, "namespace_name", namespace_name)
        pulumi.set(__self__, "shared_access_key", shared_access_key)
        pulumi.set(__self__, "shared_access_key_name", shared_access_key_name)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if timestamp_property_name is not None:
            pulumi.set(__self__, "timestamp_property_name", timestamp_property_name)

    @property
    @pulumi.getter(name="consumerGroupName")
    def consumer_group_name(self) -> pulumi.Input[str]:
        """
        Specifies the name of the EventHub Consumer Group that holds the partitions from which events will be read.
        """
        return pulumi.get(self, "consumer_group_name")

    @consumer_group_name.setter
    def consumer_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "consumer_group_name", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Input[str]:
        """
        Specifies the id of the IoT Time Series Insights Environment that the Event Source should be associated with. Changing this forces a new resource to created.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter(name="eventSourceResourceId")
    def event_source_resource_id(self) -> pulumi.Input[str]:
        """
        Specifies the resource id where events will be coming from.
        """
        return pulumi.get(self, "event_source_resource_id")

    @event_source_resource_id.setter
    def event_source_resource_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "event_source_resource_id", value)

    @property
    @pulumi.getter(name="eventhubName")
    def eventhub_name(self) -> pulumi.Input[str]:
        """
        Specifies the name of the EventHub which will be associated with this resource.
        """
        return pulumi.get(self, "eventhub_name")

    @eventhub_name.setter
    def eventhub_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "eventhub_name", value)

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> pulumi.Input[str]:
        """
        Specifies the EventHub Namespace name.
        """
        return pulumi.get(self, "namespace_name")

    @namespace_name.setter
    def namespace_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "namespace_name", value)

    @property
    @pulumi.getter(name="sharedAccessKey")
    def shared_access_key(self) -> pulumi.Input[str]:
        """
        Specifies the value of the Shared Access Policy key that grants the Time Series Insights service read access to the EventHub.
        """
        return pulumi.get(self, "shared_access_key")

    @shared_access_key.setter
    def shared_access_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "shared_access_key", value)

    @property
    @pulumi.getter(name="sharedAccessKeyName")
    def shared_access_key_name(self) -> pulumi.Input[str]:
        """
        Specifies the name of the Shared Access key that grants the Event Source access to the EventHub.
        """
        return pulumi.get(self, "shared_access_key_name")

    @shared_access_key_name.setter
    def shared_access_key_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "shared_access_key_name", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Azure IoT Time Series Insights EventHub Event Source. Changing this forces a new resource to be created. Must be globally unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="timestampPropertyName")
    def timestamp_property_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the value that will be used as the event source's timestamp. This value defaults to the event creation time.
        """
        return pulumi.get(self, "timestamp_property_name")

    @timestamp_property_name.setter
    def timestamp_property_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timestamp_property_name", value)


@pulumi.input_type
class _TimeSeriesInsightsEventSourceEventhubState:
    def __init__(__self__, *,
                 consumer_group_name: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 event_source_resource_id: Optional[pulumi.Input[str]] = None,
                 eventhub_name: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_name: Optional[pulumi.Input[str]] = None,
                 shared_access_key: Optional[pulumi.Input[str]] = None,
                 shared_access_key_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timestamp_property_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TimeSeriesInsightsEventSourceEventhub resources.
        :param pulumi.Input[str] consumer_group_name: Specifies the name of the EventHub Consumer Group that holds the partitions from which events will be read.
        :param pulumi.Input[str] environment_id: Specifies the id of the IoT Time Series Insights Environment that the Event Source should be associated with. Changing this forces a new resource to created.
        :param pulumi.Input[str] event_source_resource_id: Specifies the resource id where events will be coming from.
        :param pulumi.Input[str] eventhub_name: Specifies the name of the EventHub which will be associated with this resource.
        :param pulumi.Input[str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the Azure IoT Time Series Insights EventHub Event Source. Changing this forces a new resource to be created. Must be globally unique.
        :param pulumi.Input[str] namespace_name: Specifies the EventHub Namespace name.
        :param pulumi.Input[str] shared_access_key: Specifies the value of the Shared Access Policy key that grants the Time Series Insights service read access to the EventHub.
        :param pulumi.Input[str] shared_access_key_name: Specifies the name of the Shared Access key that grants the Event Source access to the EventHub.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] timestamp_property_name: Specifies the value that will be used as the event source's timestamp. This value defaults to the event creation time.
        """
        if consumer_group_name is not None:
            pulumi.set(__self__, "consumer_group_name", consumer_group_name)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)
        if event_source_resource_id is not None:
            pulumi.set(__self__, "event_source_resource_id", event_source_resource_id)
        if eventhub_name is not None:
            pulumi.set(__self__, "eventhub_name", eventhub_name)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace_name is not None:
            pulumi.set(__self__, "namespace_name", namespace_name)
        if shared_access_key is not None:
            pulumi.set(__self__, "shared_access_key", shared_access_key)
        if shared_access_key_name is not None:
            pulumi.set(__self__, "shared_access_key_name", shared_access_key_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if timestamp_property_name is not None:
            pulumi.set(__self__, "timestamp_property_name", timestamp_property_name)

    @property
    @pulumi.getter(name="consumerGroupName")
    def consumer_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the EventHub Consumer Group that holds the partitions from which events will be read.
        """
        return pulumi.get(self, "consumer_group_name")

    @consumer_group_name.setter
    def consumer_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "consumer_group_name", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the id of the IoT Time Series Insights Environment that the Event Source should be associated with. Changing this forces a new resource to created.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter(name="eventSourceResourceId")
    def event_source_resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the resource id where events will be coming from.
        """
        return pulumi.get(self, "event_source_resource_id")

    @event_source_resource_id.setter
    def event_source_resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_source_resource_id", value)

    @property
    @pulumi.getter(name="eventhubName")
    def eventhub_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the EventHub which will be associated with this resource.
        """
        return pulumi.get(self, "eventhub_name")

    @eventhub_name.setter
    def eventhub_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "eventhub_name", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Azure IoT Time Series Insights EventHub Event Source. Changing this forces a new resource to be created. Must be globally unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the EventHub Namespace name.
        """
        return pulumi.get(self, "namespace_name")

    @namespace_name.setter
    def namespace_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "namespace_name", value)

    @property
    @pulumi.getter(name="sharedAccessKey")
    def shared_access_key(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the value of the Shared Access Policy key that grants the Time Series Insights service read access to the EventHub.
        """
        return pulumi.get(self, "shared_access_key")

    @shared_access_key.setter
    def shared_access_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "shared_access_key", value)

    @property
    @pulumi.getter(name="sharedAccessKeyName")
    def shared_access_key_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Shared Access key that grants the Event Source access to the EventHub.
        """
        return pulumi.get(self, "shared_access_key_name")

    @shared_access_key_name.setter
    def shared_access_key_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "shared_access_key_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="timestampPropertyName")
    def timestamp_property_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the value that will be used as the event source's timestamp. This value defaults to the event creation time.
        """
        return pulumi.get(self, "timestamp_property_name")

    @timestamp_property_name.setter
    def timestamp_property_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timestamp_property_name", value)


class TimeSeriesInsightsEventSourceEventhub(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 consumer_group_name: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 event_source_resource_id: Optional[pulumi.Input[str]] = None,
                 eventhub_name: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_name: Optional[pulumi.Input[str]] = None,
                 shared_access_key: Optional[pulumi.Input[str]] = None,
                 shared_access_key_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timestamp_property_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an Azure IoT Time Series Insights EventHub Event Source.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_event_hub_namespace = azure.eventhub.EventHubNamespace("exampleEventHubNamespace",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku="Standard")
        example_event_hub = azure.eventhub.EventHub("exampleEventHub",
            namespace_name=example_event_hub_namespace.name,
            resource_group_name=example_resource_group.name,
            partition_count=2,
            message_retention=7)
        example_consumer_group = azure.eventhub.ConsumerGroup("exampleConsumerGroup",
            namespace_name=example_event_hub_namespace.name,
            eventhub_name=example_event_hub.name,
            resource_group_name=example_resource_group.name)
        example_authorization_rule = azure.eventhub.AuthorizationRule("exampleAuthorizationRule",
            namespace_name=example_event_hub_namespace.name,
            eventhub_name=example_event_hub.name,
            resource_group_name=example_resource_group.name,
            listen=True,
            send=False,
            manage=False)
        example_account = azure.storage.Account("exampleAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            account_tier="Standard",
            account_replication_type="LRS")
        example_time_series_insights_gen2_environment = azure.iot.TimeSeriesInsightsGen2Environment("exampleTimeSeriesInsightsGen2Environment",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku_name="L1",
            id_properties=["id"],
            storage=azure.iot.TimeSeriesInsightsGen2EnvironmentStorageArgs(
                name=example_account.name,
                key=example_account.primary_access_key,
            ))
        example_time_series_insights_event_source_eventhub = azure.iot.TimeSeriesInsightsEventSourceEventhub("exampleTimeSeriesInsightsEventSourceEventhub",
            location=example_resource_group.location,
            environment_id=example_time_series_insights_gen2_environment.id,
            eventhub_name=example_event_hub.name,
            namespace_name=example_event_hub_namespace.name,
            shared_access_key=example_authorization_rule.primary_key,
            shared_access_key_name=example_authorization_rule.name,
            consumer_group_name=example_consumer_group.name,
            event_source_resource_id=example_event_hub.id)
        ```

        ## Import

        Azure IoT Time Series Insights EventHub Event Source can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:iot/timeSeriesInsightsEventSourceEventhub:TimeSeriesInsightsEventSourceEventhub example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.TimeSeriesInsights/environments/environment1/eventSources/example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] consumer_group_name: Specifies the name of the EventHub Consumer Group that holds the partitions from which events will be read.
        :param pulumi.Input[str] environment_id: Specifies the id of the IoT Time Series Insights Environment that the Event Source should be associated with. Changing this forces a new resource to created.
        :param pulumi.Input[str] event_source_resource_id: Specifies the resource id where events will be coming from.
        :param pulumi.Input[str] eventhub_name: Specifies the name of the EventHub which will be associated with this resource.
        :param pulumi.Input[str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the Azure IoT Time Series Insights EventHub Event Source. Changing this forces a new resource to be created. Must be globally unique.
        :param pulumi.Input[str] namespace_name: Specifies the EventHub Namespace name.
        :param pulumi.Input[str] shared_access_key: Specifies the value of the Shared Access Policy key that grants the Time Series Insights service read access to the EventHub.
        :param pulumi.Input[str] shared_access_key_name: Specifies the name of the Shared Access key that grants the Event Source access to the EventHub.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] timestamp_property_name: Specifies the value that will be used as the event source's timestamp. This value defaults to the event creation time.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TimeSeriesInsightsEventSourceEventhubArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Azure IoT Time Series Insights EventHub Event Source.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_event_hub_namespace = azure.eventhub.EventHubNamespace("exampleEventHubNamespace",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku="Standard")
        example_event_hub = azure.eventhub.EventHub("exampleEventHub",
            namespace_name=example_event_hub_namespace.name,
            resource_group_name=example_resource_group.name,
            partition_count=2,
            message_retention=7)
        example_consumer_group = azure.eventhub.ConsumerGroup("exampleConsumerGroup",
            namespace_name=example_event_hub_namespace.name,
            eventhub_name=example_event_hub.name,
            resource_group_name=example_resource_group.name)
        example_authorization_rule = azure.eventhub.AuthorizationRule("exampleAuthorizationRule",
            namespace_name=example_event_hub_namespace.name,
            eventhub_name=example_event_hub.name,
            resource_group_name=example_resource_group.name,
            listen=True,
            send=False,
            manage=False)
        example_account = azure.storage.Account("exampleAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            account_tier="Standard",
            account_replication_type="LRS")
        example_time_series_insights_gen2_environment = azure.iot.TimeSeriesInsightsGen2Environment("exampleTimeSeriesInsightsGen2Environment",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku_name="L1",
            id_properties=["id"],
            storage=azure.iot.TimeSeriesInsightsGen2EnvironmentStorageArgs(
                name=example_account.name,
                key=example_account.primary_access_key,
            ))
        example_time_series_insights_event_source_eventhub = azure.iot.TimeSeriesInsightsEventSourceEventhub("exampleTimeSeriesInsightsEventSourceEventhub",
            location=example_resource_group.location,
            environment_id=example_time_series_insights_gen2_environment.id,
            eventhub_name=example_event_hub.name,
            namespace_name=example_event_hub_namespace.name,
            shared_access_key=example_authorization_rule.primary_key,
            shared_access_key_name=example_authorization_rule.name,
            consumer_group_name=example_consumer_group.name,
            event_source_resource_id=example_event_hub.id)
        ```

        ## Import

        Azure IoT Time Series Insights EventHub Event Source can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:iot/timeSeriesInsightsEventSourceEventhub:TimeSeriesInsightsEventSourceEventhub example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.TimeSeriesInsights/environments/environment1/eventSources/example
        ```

        :param str resource_name: The name of the resource.
        :param TimeSeriesInsightsEventSourceEventhubArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TimeSeriesInsightsEventSourceEventhubArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 consumer_group_name: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 event_source_resource_id: Optional[pulumi.Input[str]] = None,
                 eventhub_name: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 namespace_name: Optional[pulumi.Input[str]] = None,
                 shared_access_key: Optional[pulumi.Input[str]] = None,
                 shared_access_key_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 timestamp_property_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TimeSeriesInsightsEventSourceEventhubArgs.__new__(TimeSeriesInsightsEventSourceEventhubArgs)

            if consumer_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'consumer_group_name'")
            __props__.__dict__["consumer_group_name"] = consumer_group_name
            if environment_id is None and not opts.urn:
                raise TypeError("Missing required property 'environment_id'")
            __props__.__dict__["environment_id"] = environment_id
            if event_source_resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'event_source_resource_id'")
            __props__.__dict__["event_source_resource_id"] = event_source_resource_id
            if eventhub_name is None and not opts.urn:
                raise TypeError("Missing required property 'eventhub_name'")
            __props__.__dict__["eventhub_name"] = eventhub_name
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if namespace_name is None and not opts.urn:
                raise TypeError("Missing required property 'namespace_name'")
            __props__.__dict__["namespace_name"] = namespace_name
            if shared_access_key is None and not opts.urn:
                raise TypeError("Missing required property 'shared_access_key'")
            __props__.__dict__["shared_access_key"] = shared_access_key
            if shared_access_key_name is None and not opts.urn:
                raise TypeError("Missing required property 'shared_access_key_name'")
            __props__.__dict__["shared_access_key_name"] = shared_access_key_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["timestamp_property_name"] = timestamp_property_name
        super(TimeSeriesInsightsEventSourceEventhub, __self__).__init__(
            'azure:iot/timeSeriesInsightsEventSourceEventhub:TimeSeriesInsightsEventSourceEventhub',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            consumer_group_name: Optional[pulumi.Input[str]] = None,
            environment_id: Optional[pulumi.Input[str]] = None,
            event_source_resource_id: Optional[pulumi.Input[str]] = None,
            eventhub_name: Optional[pulumi.Input[str]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            namespace_name: Optional[pulumi.Input[str]] = None,
            shared_access_key: Optional[pulumi.Input[str]] = None,
            shared_access_key_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            timestamp_property_name: Optional[pulumi.Input[str]] = None) -> 'TimeSeriesInsightsEventSourceEventhub':
        """
        Get an existing TimeSeriesInsightsEventSourceEventhub resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] consumer_group_name: Specifies the name of the EventHub Consumer Group that holds the partitions from which events will be read.
        :param pulumi.Input[str] environment_id: Specifies the id of the IoT Time Series Insights Environment that the Event Source should be associated with. Changing this forces a new resource to created.
        :param pulumi.Input[str] event_source_resource_id: Specifies the resource id where events will be coming from.
        :param pulumi.Input[str] eventhub_name: Specifies the name of the EventHub which will be associated with this resource.
        :param pulumi.Input[str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the Azure IoT Time Series Insights EventHub Event Source. Changing this forces a new resource to be created. Must be globally unique.
        :param pulumi.Input[str] namespace_name: Specifies the EventHub Namespace name.
        :param pulumi.Input[str] shared_access_key: Specifies the value of the Shared Access Policy key that grants the Time Series Insights service read access to the EventHub.
        :param pulumi.Input[str] shared_access_key_name: Specifies the name of the Shared Access key that grants the Event Source access to the EventHub.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] timestamp_property_name: Specifies the value that will be used as the event source's timestamp. This value defaults to the event creation time.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TimeSeriesInsightsEventSourceEventhubState.__new__(_TimeSeriesInsightsEventSourceEventhubState)

        __props__.__dict__["consumer_group_name"] = consumer_group_name
        __props__.__dict__["environment_id"] = environment_id
        __props__.__dict__["event_source_resource_id"] = event_source_resource_id
        __props__.__dict__["eventhub_name"] = eventhub_name
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace_name"] = namespace_name
        __props__.__dict__["shared_access_key"] = shared_access_key
        __props__.__dict__["shared_access_key_name"] = shared_access_key_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["timestamp_property_name"] = timestamp_property_name
        return TimeSeriesInsightsEventSourceEventhub(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="consumerGroupName")
    def consumer_group_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the EventHub Consumer Group that holds the partitions from which events will be read.
        """
        return pulumi.get(self, "consumer_group_name")

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Output[str]:
        """
        Specifies the id of the IoT Time Series Insights Environment that the Event Source should be associated with. Changing this forces a new resource to created.
        """
        return pulumi.get(self, "environment_id")

    @property
    @pulumi.getter(name="eventSourceResourceId")
    def event_source_resource_id(self) -> pulumi.Output[str]:
        """
        Specifies the resource id where events will be coming from.
        """
        return pulumi.get(self, "event_source_resource_id")

    @property
    @pulumi.getter(name="eventhubName")
    def eventhub_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the EventHub which will be associated with this resource.
        """
        return pulumi.get(self, "eventhub_name")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Azure IoT Time Series Insights EventHub Event Source. Changing this forces a new resource to be created. Must be globally unique.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> pulumi.Output[str]:
        """
        Specifies the EventHub Namespace name.
        """
        return pulumi.get(self, "namespace_name")

    @property
    @pulumi.getter(name="sharedAccessKey")
    def shared_access_key(self) -> pulumi.Output[str]:
        """
        Specifies the value of the Shared Access Policy key that grants the Time Series Insights service read access to the EventHub.
        """
        return pulumi.get(self, "shared_access_key")

    @property
    @pulumi.getter(name="sharedAccessKeyName")
    def shared_access_key_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Shared Access key that grants the Event Source access to the EventHub.
        """
        return pulumi.get(self, "shared_access_key_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="timestampPropertyName")
    def timestamp_property_name(self) -> pulumi.Output[str]:
        """
        Specifies the value that will be used as the event source's timestamp. This value defaults to the event creation time.
        """
        return pulumi.get(self, "timestamp_property_name")
