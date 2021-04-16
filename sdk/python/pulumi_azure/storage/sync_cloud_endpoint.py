# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SyncCloudEndpointArgs', 'SyncCloudEndpoint']

@pulumi.input_type
class SyncCloudEndpointArgs:
    def __init__(__self__, *,
                 file_share_name: pulumi.Input[str],
                 storage_account_id: pulumi.Input[str],
                 storage_sync_group_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 storage_account_tenant_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SyncCloudEndpoint resource.
        :param pulumi.Input[str] file_share_name: The Storage Share name to be synchronized in this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] storage_account_id: The ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] storage_sync_group_id: The ID of the Storage Sync Group where this Cloud Endpoint should be created. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] name: The name which should be used for this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] storage_account_tenant_id: The Tenant ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created. Defaults to the current tenant id.
        """
        pulumi.set(__self__, "file_share_name", file_share_name)
        pulumi.set(__self__, "storage_account_id", storage_account_id)
        pulumi.set(__self__, "storage_sync_group_id", storage_sync_group_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if storage_account_tenant_id is not None:
            pulumi.set(__self__, "storage_account_tenant_id", storage_account_tenant_id)

    @property
    @pulumi.getter(name="fileShareName")
    def file_share_name(self) -> pulumi.Input[str]:
        """
        The Storage Share name to be synchronized in this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "file_share_name")

    @file_share_name.setter
    def file_share_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "file_share_name", value)

    @property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> pulumi.Input[str]:
        """
        The ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "storage_account_id")

    @storage_account_id.setter
    def storage_account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "storage_account_id", value)

    @property
    @pulumi.getter(name="storageSyncGroupId")
    def storage_sync_group_id(self) -> pulumi.Input[str]:
        """
        The ID of the Storage Sync Group where this Cloud Endpoint should be created. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "storage_sync_group_id")

    @storage_sync_group_id.setter
    def storage_sync_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "storage_sync_group_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="storageAccountTenantId")
    def storage_account_tenant_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Tenant ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created. Defaults to the current tenant id.
        """
        return pulumi.get(self, "storage_account_tenant_id")

    @storage_account_tenant_id.setter
    def storage_account_tenant_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_account_tenant_id", value)


@pulumi.input_type
class _SyncCloudEndpointState:
    def __init__(__self__, *,
                 file_share_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 storage_account_id: Optional[pulumi.Input[str]] = None,
                 storage_account_tenant_id: Optional[pulumi.Input[str]] = None,
                 storage_sync_group_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SyncCloudEndpoint resources.
        :param pulumi.Input[str] file_share_name: The Storage Share name to be synchronized in this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] name: The name which should be used for this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] storage_account_id: The ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] storage_account_tenant_id: The Tenant ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created. Defaults to the current tenant id.
        :param pulumi.Input[str] storage_sync_group_id: The ID of the Storage Sync Group where this Cloud Endpoint should be created. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        if file_share_name is not None:
            pulumi.set(__self__, "file_share_name", file_share_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if storage_account_id is not None:
            pulumi.set(__self__, "storage_account_id", storage_account_id)
        if storage_account_tenant_id is not None:
            pulumi.set(__self__, "storage_account_tenant_id", storage_account_tenant_id)
        if storage_sync_group_id is not None:
            pulumi.set(__self__, "storage_sync_group_id", storage_sync_group_id)

    @property
    @pulumi.getter(name="fileShareName")
    def file_share_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Storage Share name to be synchronized in this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "file_share_name")

    @file_share_name.setter
    def file_share_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_share_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "storage_account_id")

    @storage_account_id.setter
    def storage_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_account_id", value)

    @property
    @pulumi.getter(name="storageAccountTenantId")
    def storage_account_tenant_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Tenant ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created. Defaults to the current tenant id.
        """
        return pulumi.get(self, "storage_account_tenant_id")

    @storage_account_tenant_id.setter
    def storage_account_tenant_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_account_tenant_id", value)

    @property
    @pulumi.getter(name="storageSyncGroupId")
    def storage_sync_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Storage Sync Group where this Cloud Endpoint should be created. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "storage_sync_group_id")

    @storage_sync_group_id.setter
    def storage_sync_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_sync_group_id", value)


class SyncCloudEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 file_share_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 storage_account_id: Optional[pulumi.Input[str]] = None,
                 storage_account_tenant_id: Optional[pulumi.Input[str]] = None,
                 storage_sync_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Storage Sync Cloud Endpoint.

        > **NOTE:** Please ensure Azure File Sync has access to the storage account in your subscription, which indicates that `Microsoft.StorageSync` is assigned role `Reader and Data Access` ( refer to details [here](https://docs.microsoft.com/en-us/azure/storage/files/storage-sync-files-troubleshoot?tabs=portal1%2Cazure-portal#common-troubleshooting-steps)).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_sync = azure.storage.Sync("exampleSync",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_sync_group = azure.storage.SyncGroup("exampleSyncGroup", storage_sync_id=example_sync.id)
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_share = azure.storage.Share("exampleShare",
            storage_account_name=example_account.name,
            acls=[azure.storage.ShareAclArgs(
                id="GhostedRecall",
                access_policies=[{
                    "permissions": "r",
                }],
            )])
        example_sync_cloud_endpoint = azure.storage.SyncCloudEndpoint("exampleSyncCloudEndpoint",
            storage_sync_group_id=example_sync_group.id,
            file_share_name=example_share.name,
            storage_account_id=example_account.id)
        ```

        ## Import

        Storage Sync Cloud Endpoints can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:storage/syncCloudEndpoint:SyncCloudEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StorageSync/storageSyncServices/sync1/syncGroups/syncgroup1/cloudEndpoints/cloudEndpoint1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] file_share_name: The Storage Share name to be synchronized in this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] name: The name which should be used for this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] storage_account_id: The ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] storage_account_tenant_id: The Tenant ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created. Defaults to the current tenant id.
        :param pulumi.Input[str] storage_sync_group_id: The ID of the Storage Sync Group where this Cloud Endpoint should be created. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SyncCloudEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Storage Sync Cloud Endpoint.

        > **NOTE:** Please ensure Azure File Sync has access to the storage account in your subscription, which indicates that `Microsoft.StorageSync` is assigned role `Reader and Data Access` ( refer to details [here](https://docs.microsoft.com/en-us/azure/storage/files/storage-sync-files-troubleshoot?tabs=portal1%2Cazure-portal#common-troubleshooting-steps)).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_sync = azure.storage.Sync("exampleSync",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_sync_group = azure.storage.SyncGroup("exampleSyncGroup", storage_sync_id=example_sync.id)
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_share = azure.storage.Share("exampleShare",
            storage_account_name=example_account.name,
            acls=[azure.storage.ShareAclArgs(
                id="GhostedRecall",
                access_policies=[{
                    "permissions": "r",
                }],
            )])
        example_sync_cloud_endpoint = azure.storage.SyncCloudEndpoint("exampleSyncCloudEndpoint",
            storage_sync_group_id=example_sync_group.id,
            file_share_name=example_share.name,
            storage_account_id=example_account.id)
        ```

        ## Import

        Storage Sync Cloud Endpoints can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:storage/syncCloudEndpoint:SyncCloudEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StorageSync/storageSyncServices/sync1/syncGroups/syncgroup1/cloudEndpoints/cloudEndpoint1
        ```

        :param str resource_name: The name of the resource.
        :param SyncCloudEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SyncCloudEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 file_share_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 storage_account_id: Optional[pulumi.Input[str]] = None,
                 storage_account_tenant_id: Optional[pulumi.Input[str]] = None,
                 storage_sync_group_id: Optional[pulumi.Input[str]] = None,
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
            __props__ = SyncCloudEndpointArgs.__new__(SyncCloudEndpointArgs)

            if file_share_name is None and not opts.urn:
                raise TypeError("Missing required property 'file_share_name'")
            __props__.__dict__["file_share_name"] = file_share_name
            __props__.__dict__["name"] = name
            if storage_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'storage_account_id'")
            __props__.__dict__["storage_account_id"] = storage_account_id
            __props__.__dict__["storage_account_tenant_id"] = storage_account_tenant_id
            if storage_sync_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'storage_sync_group_id'")
            __props__.__dict__["storage_sync_group_id"] = storage_sync_group_id
        super(SyncCloudEndpoint, __self__).__init__(
            'azure:storage/syncCloudEndpoint:SyncCloudEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            file_share_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            storage_account_id: Optional[pulumi.Input[str]] = None,
            storage_account_tenant_id: Optional[pulumi.Input[str]] = None,
            storage_sync_group_id: Optional[pulumi.Input[str]] = None) -> 'SyncCloudEndpoint':
        """
        Get an existing SyncCloudEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] file_share_name: The Storage Share name to be synchronized in this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] name: The name which should be used for this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] storage_account_id: The ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        :param pulumi.Input[str] storage_account_tenant_id: The Tenant ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created. Defaults to the current tenant id.
        :param pulumi.Input[str] storage_sync_group_id: The ID of the Storage Sync Group where this Cloud Endpoint should be created. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SyncCloudEndpointState.__new__(_SyncCloudEndpointState)

        __props__.__dict__["file_share_name"] = file_share_name
        __props__.__dict__["name"] = name
        __props__.__dict__["storage_account_id"] = storage_account_id
        __props__.__dict__["storage_account_tenant_id"] = storage_account_tenant_id
        __props__.__dict__["storage_sync_group_id"] = storage_sync_group_id
        return SyncCloudEndpoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="fileShareName")
    def file_share_name(self) -> pulumi.Output[str]:
        """
        The Storage Share name to be synchronized in this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "file_share_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this Storage Sync Cloud Endpoint. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> pulumi.Output[str]:
        """
        The ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "storage_account_id")

    @property
    @pulumi.getter(name="storageAccountTenantId")
    def storage_account_tenant_id(self) -> pulumi.Output[str]:
        """
        The Tenant ID of the Storage Account where the Storage Share exists. Changing this forces a new Storage Sync Cloud Endpoint to be created. Defaults to the current tenant id.
        """
        return pulumi.get(self, "storage_account_tenant_id")

    @property
    @pulumi.getter(name="storageSyncGroupId")
    def storage_sync_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the Storage Sync Group where this Cloud Endpoint should be created. Changing this forces a new Storage Sync Cloud Endpoint to be created.
        """
        return pulumi.get(self, "storage_sync_group_id")
