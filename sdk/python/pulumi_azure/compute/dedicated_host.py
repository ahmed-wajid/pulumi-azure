# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class DedicatedHost(pulumi.CustomResource):
    auto_replace_on_failure: pulumi.Output[bool]
    """
    Should the Dedicated Host automatically be replaced in case of a Hardware Failure? Defaults to `true`.
    """
    dedicated_host_group_id: pulumi.Output[str]
    """
    Specifies the ID of the Dedicated Host Group where the Dedicated Host should exist. Changing this forces a new resource to be created.
    """
    license_type: pulumi.Output[str]
    """
    Specifies the software license type that will be applied to the VMs deployed on the Dedicated Host. Possible values are `None`, `Windows_Server_Hybrid` and `Windows_Server_Perpetual`. Defaults to `None`.
    """
    location: pulumi.Output[str]
    """
    Specify the supported Azure location where the resource exists. Changing this forces a new resource to be created.
    """
    name: pulumi.Output[str]
    """
    Specifies the name of this Dedicated Host. Changing this forces a new resource to be created.
    """
    platform_fault_domain: pulumi.Output[float]
    """
    Specify the fault domain of the Dedicated Host Group in which to create the Dedicated Host. Changing this forces a new resource to be created.
    """
    sku_name: pulumi.Output[str]
    """
    Specify the sku name of the Dedicated Host. Possible values are `DSv3-Type1`, `DSv3-Type2`, `ESv3-Type1`, `ESv3-Type2`,`FSv2-Type2`. Changing this forces a new resource to be created.
    """
    tags: pulumi.Output[dict]
    """
    A mapping of tags to assign to the resource.
    """
    def __init__(__self__, resource_name, opts=None, auto_replace_on_failure=None, dedicated_host_group_id=None, license_type=None, location=None, name=None, platform_fault_domain=None, sku_name=None, tags=None, __props__=None, __name__=None, __opts__=None):
        """
        Manage a Dedicated Host within a Dedicated Host Group.



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_replace_on_failure: Should the Dedicated Host automatically be replaced in case of a Hardware Failure? Defaults to `true`.
        :param pulumi.Input[str] dedicated_host_group_id: Specifies the ID of the Dedicated Host Group where the Dedicated Host should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[str] license_type: Specifies the software license type that will be applied to the VMs deployed on the Dedicated Host. Possible values are `None`, `Windows_Server_Hybrid` and `Windows_Server_Perpetual`. Defaults to `None`.
        :param pulumi.Input[str] location: Specify the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of this Dedicated Host. Changing this forces a new resource to be created.
        :param pulumi.Input[float] platform_fault_domain: Specify the fault domain of the Dedicated Host Group in which to create the Dedicated Host. Changing this forces a new resource to be created.
        :param pulumi.Input[str] sku_name: Specify the sku name of the Dedicated Host. Possible values are `DSv3-Type1`, `DSv3-Type2`, `ESv3-Type1`, `ESv3-Type2`,`FSv2-Type2`. Changing this forces a new resource to be created.
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the resource.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['auto_replace_on_failure'] = auto_replace_on_failure
            if dedicated_host_group_id is None:
                raise TypeError("Missing required property 'dedicated_host_group_id'")
            __props__['dedicated_host_group_id'] = dedicated_host_group_id
            __props__['license_type'] = license_type
            __props__['location'] = location
            __props__['name'] = name
            if platform_fault_domain is None:
                raise TypeError("Missing required property 'platform_fault_domain'")
            __props__['platform_fault_domain'] = platform_fault_domain
            if sku_name is None:
                raise TypeError("Missing required property 'sku_name'")
            __props__['sku_name'] = sku_name
            __props__['tags'] = tags
        super(DedicatedHost, __self__).__init__(
            'azure:compute/dedicatedHost:DedicatedHost',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, auto_replace_on_failure=None, dedicated_host_group_id=None, license_type=None, location=None, name=None, platform_fault_domain=None, sku_name=None, tags=None):
        """
        Get an existing DedicatedHost resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_replace_on_failure: Should the Dedicated Host automatically be replaced in case of a Hardware Failure? Defaults to `true`.
        :param pulumi.Input[str] dedicated_host_group_id: Specifies the ID of the Dedicated Host Group where the Dedicated Host should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[str] license_type: Specifies the software license type that will be applied to the VMs deployed on the Dedicated Host. Possible values are `None`, `Windows_Server_Hybrid` and `Windows_Server_Perpetual`. Defaults to `None`.
        :param pulumi.Input[str] location: Specify the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of this Dedicated Host. Changing this forces a new resource to be created.
        :param pulumi.Input[float] platform_fault_domain: Specify the fault domain of the Dedicated Host Group in which to create the Dedicated Host. Changing this forces a new resource to be created.
        :param pulumi.Input[str] sku_name: Specify the sku name of the Dedicated Host. Possible values are `DSv3-Type1`, `DSv3-Type2`, `ESv3-Type1`, `ESv3-Type2`,`FSv2-Type2`. Changing this forces a new resource to be created.
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["auto_replace_on_failure"] = auto_replace_on_failure
        __props__["dedicated_host_group_id"] = dedicated_host_group_id
        __props__["license_type"] = license_type
        __props__["location"] = location
        __props__["name"] = name
        __props__["platform_fault_domain"] = platform_fault_domain
        __props__["sku_name"] = sku_name
        __props__["tags"] = tags
        return DedicatedHost(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
