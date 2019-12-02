# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetPoolResult:
    """
    A collection of values returned by getPool.
    """
    def __init__(__self__, account_name=None, location=None, name=None, resource_group_name=None, service_level=None, size_in_tb=None, id=None):
        if account_name and not isinstance(account_name, str):
            raise TypeError("Expected argument 'account_name' to be a str")
        __self__.account_name = account_name
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        __self__.location = location
        """
        The Azure Region where the NetApp Pool exists.
        """
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        __self__.resource_group_name = resource_group_name
        if service_level and not isinstance(service_level, str):
            raise TypeError("Expected argument 'service_level' to be a str")
        __self__.service_level = service_level
        """
        The service level of the file system.
        """
        if size_in_tb and not isinstance(size_in_tb, float):
            raise TypeError("Expected argument 'size_in_tb' to be a float")
        __self__.size_in_tb = size_in_tb
        """
        Provisioned size of the pool in TB.
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
class AwaitableGetPoolResult(GetPoolResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPoolResult(
            account_name=self.account_name,
            location=self.location,
            name=self.name,
            resource_group_name=self.resource_group_name,
            service_level=self.service_level,
            size_in_tb=self.size_in_tb,
            id=self.id)

def get_pool(account_name=None,name=None,resource_group_name=None,opts=None):
    """
    Uses this data source to access information about an existing NetApp Pool.
    
    :param str account_name: The name of the NetApp account where the NetApp pool exists.
    :param str name: The name of the NetApp Pool.
    :param str resource_group_name: The Name of the Resource Group where the NetApp Pool exists.

    > This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/d/netapp_pool.html.markdown.
    """
    __args__ = dict()

    __args__['accountName'] = account_name
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('azure:netapp/getPool:getPool', __args__, opts=opts).value

    return AwaitableGetPoolResult(
        account_name=__ret__.get('accountName'),
        location=__ret__.get('location'),
        name=__ret__.get('name'),
        resource_group_name=__ret__.get('resourceGroupName'),
        service_level=__ret__.get('serviceLevel'),
        size_in_tb=__ret__.get('sizeInTb'),
        id=__ret__.get('id'))