# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DevCenterArgs', 'DevCenter']

@pulumi.input_type
class DevCenterArgs:
    def __init__(__self__, *,
                 resource_group_name: pulumi.Input[str],
                 identity: Optional[pulumi.Input['DevCenterIdentityArgs']] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a DevCenter resource.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
        :param pulumi.Input['DevCenterIdentityArgs'] identity: An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
        :param pulumi.Input[str] location: The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[str] name: Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Dev Center.
        """
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input['DevCenterIdentityArgs']]:
        """
        An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input['DevCenterIdentityArgs']]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags which should be assigned to the Dev Center.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DevCenterState:
    def __init__(__self__, *,
                 dev_center_uri: Optional[pulumi.Input[str]] = None,
                 identity: Optional[pulumi.Input['DevCenterIdentityArgs']] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering DevCenter resources.
        :param pulumi.Input[str] dev_center_uri: The URI of the Dev Center.
        :param pulumi.Input['DevCenterIdentityArgs'] identity: An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
        :param pulumi.Input[str] location: The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[str] name: Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Dev Center.
        """
        if dev_center_uri is not None:
            pulumi.set(__self__, "dev_center_uri", dev_center_uri)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="devCenterUri")
    def dev_center_uri(self) -> Optional[pulumi.Input[str]]:
        """
        The URI of the Dev Center.
        """
        return pulumi.get(self, "dev_center_uri")

    @dev_center_uri.setter
    def dev_center_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dev_center_uri", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input['DevCenterIdentityArgs']]:
        """
        An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input['DevCenterIdentityArgs']]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags which should be assigned to the Dev Center.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class DevCenter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 identity: Optional[pulumi.Input[pulumi.InputType['DevCenterIdentityArgs']]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        <!-- Note: This documentation is generated. Any manual changes will be overwritten -->

        Manages a Dev Center.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_user_assigned_identity = azure.authorization.UserAssignedIdentity("exampleUserAssignedIdentity",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_dev_center = azure.devcenter.DevCenter("exampleDevCenter",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name)
        ```
        ## Blocks Reference

        ### `identity` Block

        The `identity` block supports the following arguments:

        * `type` - (Required) Specifies the type of Managed Identity that should be assigned to this Dev Center. Possible values are `SystemAssigned`, `SystemAssigned, UserAssigned` and `UserAssigned`.
        * `identity_ids` - (Optional) A list of the User Assigned Identity IDs that should be assigned to this Dev Center.

        In addition to the arguments defined above, the `identity` block exports the following attributes:

        * `principal_id` - The Principal ID for the System-Assigned Managed Identity assigned to this Dev Center.
        * `tenant_id` - The Tenant ID for the System-Assigned Managed Identity assigned to this Dev Center.

        ## Import

        An existing Dev Center can be imported into Terraform using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:devcenter/devCenter:DevCenter example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevCenter/devCenters/{devCenterName}
        ```

         * Where `{subscriptionId}` is the ID of the Azure Subscription where the Dev Center exists. For example `12345678-1234-9876-4563-123456789012`. * Where `{resourceGroupName}` is the name of Resource Group where this Dev Center exists. For example `example-resource-group`. * Where `{devCenterName}` is the name of the Dev Center. For example `devCenterValue`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['DevCenterIdentityArgs']] identity: An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
        :param pulumi.Input[str] location: The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[str] name: Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Dev Center.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DevCenterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        <!-- Note: This documentation is generated. Any manual changes will be overwritten -->

        Manages a Dev Center.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_user_assigned_identity = azure.authorization.UserAssignedIdentity("exampleUserAssignedIdentity",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_dev_center = azure.devcenter.DevCenter("exampleDevCenter",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name)
        ```
        ## Blocks Reference

        ### `identity` Block

        The `identity` block supports the following arguments:

        * `type` - (Required) Specifies the type of Managed Identity that should be assigned to this Dev Center. Possible values are `SystemAssigned`, `SystemAssigned, UserAssigned` and `UserAssigned`.
        * `identity_ids` - (Optional) A list of the User Assigned Identity IDs that should be assigned to this Dev Center.

        In addition to the arguments defined above, the `identity` block exports the following attributes:

        * `principal_id` - The Principal ID for the System-Assigned Managed Identity assigned to this Dev Center.
        * `tenant_id` - The Tenant ID for the System-Assigned Managed Identity assigned to this Dev Center.

        ## Import

        An existing Dev Center can be imported into Terraform using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:devcenter/devCenter:DevCenter example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevCenter/devCenters/{devCenterName}
        ```

         * Where `{subscriptionId}` is the ID of the Azure Subscription where the Dev Center exists. For example `12345678-1234-9876-4563-123456789012`. * Where `{resourceGroupName}` is the name of Resource Group where this Dev Center exists. For example `example-resource-group`. * Where `{devCenterName}` is the name of the Dev Center. For example `devCenterValue`.

        :param str resource_name: The name of the resource.
        :param DevCenterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DevCenterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 identity: Optional[pulumi.Input[pulumi.InputType['DevCenterIdentityArgs']]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DevCenterArgs.__new__(DevCenterArgs)

            __props__.__dict__["identity"] = identity
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["dev_center_uri"] = None
        super(DevCenter, __self__).__init__(
            'azure:devcenter/devCenter:DevCenter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dev_center_uri: Optional[pulumi.Input[str]] = None,
            identity: Optional[pulumi.Input[pulumi.InputType['DevCenterIdentityArgs']]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'DevCenter':
        """
        Get an existing DevCenter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dev_center_uri: The URI of the Dev Center.
        :param pulumi.Input[pulumi.InputType['DevCenterIdentityArgs']] identity: An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
        :param pulumi.Input[str] location: The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[str] name: Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Dev Center.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DevCenterState.__new__(_DevCenterState)

        __props__.__dict__["dev_center_uri"] = dev_center_uri
        __props__.__dict__["identity"] = identity
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["tags"] = tags
        return DevCenter(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="devCenterUri")
    def dev_center_uri(self) -> pulumi.Output[str]:
        """
        The URI of the Dev Center.
        """
        return pulumi.get(self, "dev_center_uri")

    @property
    @pulumi.getter
    def identity(self) -> pulumi.Output[Optional['outputs.DevCenterIdentity']]:
        """
        An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
        """
        return pulumi.get(self, "identity")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of tags which should be assigned to the Dev Center.
        """
        return pulumi.get(self, "tags")
