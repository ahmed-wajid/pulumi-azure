# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetScheduledQueryRulesLogResult:
    """
    A collection of values returned by getScheduledQueryRulesLog.
    """
    def __init__(__self__, authorized_resource_ids=None, criterias=None, data_source_id=None, description=None, enabled=None, id=None, location=None, name=None, resource_group_name=None, tags=None):
        if authorized_resource_ids and not isinstance(authorized_resource_ids, list):
            raise TypeError("Expected argument 'authorized_resource_ids' to be a list")
        __self__.authorized_resource_ids = authorized_resource_ids
        if criterias and not isinstance(criterias, list):
            raise TypeError("Expected argument 'criterias' to be a list")
        __self__.criterias = criterias
        """
        A `criteria` block as defined below.
        """
        if data_source_id and not isinstance(data_source_id, str):
            raise TypeError("Expected argument 'data_source_id' to be a str")
        __self__.data_source_id = data_source_id
        """
        The resource URI over which log search query is to be run.
        """
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        __self__.description = description
        """
        The description of the scheduled query rule.
        """
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        __self__.enabled = enabled
        """
        Whether this scheduled query rule is enabled.
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        __self__.location = location
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        """
        Name of the dimension.
        """
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        __self__.resource_group_name = resource_group_name
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        __self__.tags = tags
class AwaitableGetScheduledQueryRulesLogResult(GetScheduledQueryRulesLogResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetScheduledQueryRulesLogResult(
            authorized_resource_ids=self.authorized_resource_ids,
            criterias=self.criterias,
            data_source_id=self.data_source_id,
            description=self.description,
            enabled=self.enabled,
            id=self.id,
            location=self.location,
            name=self.name,
            resource_group_name=self.resource_group_name,
            tags=self.tags)

def get_scheduled_query_rules_log(name=None,resource_group_name=None,opts=None):
    """
    Use this data source to access the properties of a LogToMetricAction scheduled query rule.




    :param str name: Specifies the name of the scheduled query rule.
    :param str resource_group_name: Specifies the name of the resource group where the scheduled query rule is located.
    """
    __args__ = dict()


    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('azure:monitoring/getScheduledQueryRulesLog:getScheduledQueryRulesLog', __args__, opts=opts).value

    return AwaitableGetScheduledQueryRulesLogResult(
        authorized_resource_ids=__ret__.get('authorizedResourceIds'),
        criterias=__ret__.get('criterias'),
        data_source_id=__ret__.get('dataSourceId'),
        description=__ret__.get('description'),
        enabled=__ret__.get('enabled'),
        id=__ret__.get('id'),
        location=__ret__.get('location'),
        name=__ret__.get('name'),
        resource_group_name=__ret__.get('resourceGroupName'),
        tags=__ret__.get('tags'))