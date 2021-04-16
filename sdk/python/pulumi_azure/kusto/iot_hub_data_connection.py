# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['IotHubDataConnectionArgs', 'IotHubDataConnection']

@pulumi.input_type
class IotHubDataConnectionArgs:
    def __init__(__self__, *,
                 cluster_name: pulumi.Input[str],
                 consumer_group: pulumi.Input[str],
                 database_name: pulumi.Input[str],
                 iothub_id: pulumi.Input[str],
                 resource_group_name: pulumi.Input[str],
                 shared_access_policy_name: pulumi.Input[str],
                 event_system_properties: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a IotHubDataConnection resource.
        :param pulumi.Input[str] cluster_name: Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[str] consumer_group: Specifies the IotHub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
        :param pulumi.Input[str] database_name: Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[str] iothub_id: Specifies the resource id of the IotHub this data connection will use for ingestion. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[str] shared_access_policy_name: Specifies the IotHub Shared Access Policy this data connection will use for ingestion, which must have read permission. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] event_system_properties: Specifies the System Properties that each IoT Hub message should contain. Changing this forces a new resource to be created.
        :param pulumi.Input[str] location: The location where the Kusto Database should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Kusto IotHub Data Connection to create. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "cluster_name", cluster_name)
        pulumi.set(__self__, "consumer_group", consumer_group)
        pulumi.set(__self__, "database_name", database_name)
        pulumi.set(__self__, "iothub_id", iothub_id)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "shared_access_policy_name", shared_access_policy_name)
        if event_system_properties is not None:
            pulumi.set(__self__, "event_system_properties", event_system_properties)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Input[str]:
        """
        Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="consumerGroup")
    def consumer_group(self) -> pulumi.Input[str]:
        """
        Specifies the IotHub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "consumer_group")

    @consumer_group.setter
    def consumer_group(self, value: pulumi.Input[str]):
        pulumi.set(self, "consumer_group", value)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Input[str]:
        """
        Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "database_name")

    @database_name.setter
    def database_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "database_name", value)

    @property
    @pulumi.getter(name="iothubId")
    def iothub_id(self) -> pulumi.Input[str]:
        """
        Specifies the resource id of the IotHub this data connection will use for ingestion. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iothub_id")

    @iothub_id.setter
    def iothub_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "iothub_id", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="sharedAccessPolicyName")
    def shared_access_policy_name(self) -> pulumi.Input[str]:
        """
        Specifies the IotHub Shared Access Policy this data connection will use for ingestion, which must have read permission. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "shared_access_policy_name")

    @shared_access_policy_name.setter
    def shared_access_policy_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "shared_access_policy_name", value)

    @property
    @pulumi.getter(name="eventSystemProperties")
    def event_system_properties(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies the System Properties that each IoT Hub message should contain. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "event_system_properties")

    @event_system_properties.setter
    def event_system_properties(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "event_system_properties", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The location where the Kusto Database should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Kusto IotHub Data Connection to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _IotHubDataConnectionState:
    def __init__(__self__, *,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 consumer_group: Optional[pulumi.Input[str]] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 event_system_properties: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 iothub_id: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 shared_access_policy_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IotHubDataConnection resources.
        :param pulumi.Input[str] cluster_name: Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[str] consumer_group: Specifies the IotHub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
        :param pulumi.Input[str] database_name: Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] event_system_properties: Specifies the System Properties that each IoT Hub message should contain. Changing this forces a new resource to be created.
        :param pulumi.Input[str] iothub_id: Specifies the resource id of the IotHub this data connection will use for ingestion. Changing this forces a new resource to be created.
        :param pulumi.Input[str] location: The location where the Kusto Database should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Kusto IotHub Data Connection to create. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[str] shared_access_policy_name: Specifies the IotHub Shared Access Policy this data connection will use for ingestion, which must have read permission. Changing this forces a new resource to be created.
        """
        if cluster_name is not None:
            pulumi.set(__self__, "cluster_name", cluster_name)
        if consumer_group is not None:
            pulumi.set(__self__, "consumer_group", consumer_group)
        if database_name is not None:
            pulumi.set(__self__, "database_name", database_name)
        if event_system_properties is not None:
            pulumi.set(__self__, "event_system_properties", event_system_properties)
        if iothub_id is not None:
            pulumi.set(__self__, "iothub_id", iothub_id)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if shared_access_policy_name is not None:
            pulumi.set(__self__, "shared_access_policy_name", shared_access_policy_name)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="consumerGroup")
    def consumer_group(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the IotHub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "consumer_group")

    @consumer_group.setter
    def consumer_group(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "consumer_group", value)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "database_name")

    @database_name.setter
    def database_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database_name", value)

    @property
    @pulumi.getter(name="eventSystemProperties")
    def event_system_properties(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies the System Properties that each IoT Hub message should contain. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "event_system_properties")

    @event_system_properties.setter
    def event_system_properties(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "event_system_properties", value)

    @property
    @pulumi.getter(name="iothubId")
    def iothub_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the resource id of the IotHub this data connection will use for ingestion. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iothub_id")

    @iothub_id.setter
    def iothub_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "iothub_id", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The location where the Kusto Database should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Kusto IotHub Data Connection to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="sharedAccessPolicyName")
    def shared_access_policy_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the IotHub Shared Access Policy this data connection will use for ingestion, which must have read permission. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "shared_access_policy_name")

    @shared_access_policy_name.setter
    def shared_access_policy_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "shared_access_policy_name", value)


class IotHubDataConnection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 consumer_group: Optional[pulumi.Input[str]] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 event_system_properties: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 iothub_id: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 shared_access_policy_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Kusto (also known as Azure Data Explorer) IotHub Data Connection

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_cluster = azure.kusto.Cluster("exampleCluster",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku=azure.kusto.ClusterSkuArgs(
                name="Standard_D13_v2",
                capacity=2,
            ))
        example_database = azure.kusto.Database("exampleDatabase",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            cluster_name=example_cluster.name,
            hot_cache_period="P7D",
            soft_delete_period="P31D")
        example_io_t_hub = azure.iot.IoTHub("exampleIoTHub",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            sku=azure.iot.IoTHubSkuArgs(
                name="B1",
                capacity=1,
            ))
        example_shared_access_policy = azure.iot.SharedAccessPolicy("exampleSharedAccessPolicy",
            resource_group_name=example_resource_group.name,
            iothub_name=example_io_t_hub.name,
            registry_read=True)
        example_consumer_group = azure.iot.ConsumerGroup("exampleConsumerGroup",
            resource_group_name=example_resource_group.name,
            iothub_name=example_io_t_hub.name,
            eventhub_endpoint_name="events")
        example_iot_hub_data_connection = azure.kusto.IotHubDataConnection("exampleIotHubDataConnection",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            cluster_name=example_cluster.name,
            database_name=example_database.name,
            iothub_id=example_io_t_hub.id,
            consumer_group=example_consumer_group.name,
            shared_access_policy_name=example_shared_access_policy.name,
            event_system_properties=[
                "message-id",
                "sequence-number",
                "to",
            ])
        ```

        ## Import

        Kusto IotHub Data Connections can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:kusto/iotHubDataConnection:IotHubDataConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Kusto/Clusters/cluster1/Databases/database1/DataConnections/dataConnection1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[str] consumer_group: Specifies the IotHub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
        :param pulumi.Input[str] database_name: Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] event_system_properties: Specifies the System Properties that each IoT Hub message should contain. Changing this forces a new resource to be created.
        :param pulumi.Input[str] iothub_id: Specifies the resource id of the IotHub this data connection will use for ingestion. Changing this forces a new resource to be created.
        :param pulumi.Input[str] location: The location where the Kusto Database should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Kusto IotHub Data Connection to create. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[str] shared_access_policy_name: Specifies the IotHub Shared Access Policy this data connection will use for ingestion, which must have read permission. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IotHubDataConnectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Kusto (also known as Azure Data Explorer) IotHub Data Connection

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_cluster = azure.kusto.Cluster("exampleCluster",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku=azure.kusto.ClusterSkuArgs(
                name="Standard_D13_v2",
                capacity=2,
            ))
        example_database = azure.kusto.Database("exampleDatabase",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            cluster_name=example_cluster.name,
            hot_cache_period="P7D",
            soft_delete_period="P31D")
        example_io_t_hub = azure.iot.IoTHub("exampleIoTHub",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            sku=azure.iot.IoTHubSkuArgs(
                name="B1",
                capacity=1,
            ))
        example_shared_access_policy = azure.iot.SharedAccessPolicy("exampleSharedAccessPolicy",
            resource_group_name=example_resource_group.name,
            iothub_name=example_io_t_hub.name,
            registry_read=True)
        example_consumer_group = azure.iot.ConsumerGroup("exampleConsumerGroup",
            resource_group_name=example_resource_group.name,
            iothub_name=example_io_t_hub.name,
            eventhub_endpoint_name="events")
        example_iot_hub_data_connection = azure.kusto.IotHubDataConnection("exampleIotHubDataConnection",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            cluster_name=example_cluster.name,
            database_name=example_database.name,
            iothub_id=example_io_t_hub.id,
            consumer_group=example_consumer_group.name,
            shared_access_policy_name=example_shared_access_policy.name,
            event_system_properties=[
                "message-id",
                "sequence-number",
                "to",
            ])
        ```

        ## Import

        Kusto IotHub Data Connections can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:kusto/iotHubDataConnection:IotHubDataConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Kusto/Clusters/cluster1/Databases/database1/DataConnections/dataConnection1
        ```

        :param str resource_name: The name of the resource.
        :param IotHubDataConnectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IotHubDataConnectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 consumer_group: Optional[pulumi.Input[str]] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 event_system_properties: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 iothub_id: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 shared_access_policy_name: Optional[pulumi.Input[str]] = None,
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
            __props__ = IotHubDataConnectionArgs.__new__(IotHubDataConnectionArgs)

            if cluster_name is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_name'")
            __props__.__dict__["cluster_name"] = cluster_name
            if consumer_group is None and not opts.urn:
                raise TypeError("Missing required property 'consumer_group'")
            __props__.__dict__["consumer_group"] = consumer_group
            if database_name is None and not opts.urn:
                raise TypeError("Missing required property 'database_name'")
            __props__.__dict__["database_name"] = database_name
            __props__.__dict__["event_system_properties"] = event_system_properties
            if iothub_id is None and not opts.urn:
                raise TypeError("Missing required property 'iothub_id'")
            __props__.__dict__["iothub_id"] = iothub_id
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if shared_access_policy_name is None and not opts.urn:
                raise TypeError("Missing required property 'shared_access_policy_name'")
            __props__.__dict__["shared_access_policy_name"] = shared_access_policy_name
        super(IotHubDataConnection, __self__).__init__(
            'azure:kusto/iotHubDataConnection:IotHubDataConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            consumer_group: Optional[pulumi.Input[str]] = None,
            database_name: Optional[pulumi.Input[str]] = None,
            event_system_properties: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            iothub_id: Optional[pulumi.Input[str]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            shared_access_policy_name: Optional[pulumi.Input[str]] = None) -> 'IotHubDataConnection':
        """
        Get an existing IotHubDataConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[str] consumer_group: Specifies the IotHub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
        :param pulumi.Input[str] database_name: Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] event_system_properties: Specifies the System Properties that each IoT Hub message should contain. Changing this forces a new resource to be created.
        :param pulumi.Input[str] iothub_id: Specifies the resource id of the IotHub this data connection will use for ingestion. Changing this forces a new resource to be created.
        :param pulumi.Input[str] location: The location where the Kusto Database should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Kusto IotHub Data Connection to create. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[str] shared_access_policy_name: Specifies the IotHub Shared Access Policy this data connection will use for ingestion, which must have read permission. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IotHubDataConnectionState.__new__(_IotHubDataConnectionState)

        __props__.__dict__["cluster_name"] = cluster_name
        __props__.__dict__["consumer_group"] = consumer_group
        __props__.__dict__["database_name"] = database_name
        __props__.__dict__["event_system_properties"] = event_system_properties
        __props__.__dict__["iothub_id"] = iothub_id
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["shared_access_policy_name"] = shared_access_policy_name
        return IotHubDataConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="consumerGroup")
    def consumer_group(self) -> pulumi.Output[str]:
        """
        Specifies the IotHub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "consumer_group")

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "database_name")

    @property
    @pulumi.getter(name="eventSystemProperties")
    def event_system_properties(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Specifies the System Properties that each IoT Hub message should contain. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "event_system_properties")

    @property
    @pulumi.getter(name="iothubId")
    def iothub_id(self) -> pulumi.Output[str]:
        """
        Specifies the resource id of the IotHub this data connection will use for ingestion. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iothub_id")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The location where the Kusto Database should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Kusto IotHub Data Connection to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="sharedAccessPolicyName")
    def shared_access_policy_name(self) -> pulumi.Output[str]:
        """
        Specifies the IotHub Shared Access Policy this data connection will use for ingestion, which must have read permission. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "shared_access_policy_name")
