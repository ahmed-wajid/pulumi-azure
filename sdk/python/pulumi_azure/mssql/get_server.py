# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetServerResult',
    'AwaitableGetServerResult',
    'get_server',
]

@pulumi.output_type
class GetServerResult:
    """
    A collection of values returned by getServer.
    """
    def __init__(__self__, administrator_login=None, fully_qualified_domain_name=None, id=None, identities=None, location=None, name=None, resource_group_name=None, restorable_dropped_database_ids=None, tags=None, version=None):
        if administrator_login and not isinstance(administrator_login, str):
            raise TypeError("Expected argument 'administrator_login' to be a str")
        pulumi.set(__self__, "administrator_login", administrator_login)
        if fully_qualified_domain_name and not isinstance(fully_qualified_domain_name, str):
            raise TypeError("Expected argument 'fully_qualified_domain_name' to be a str")
        pulumi.set(__self__, "fully_qualified_domain_name", fully_qualified_domain_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identities and not isinstance(identities, list):
            raise TypeError("Expected argument 'identities' to be a list")
        pulumi.set(__self__, "identities", identities)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if restorable_dropped_database_ids and not isinstance(restorable_dropped_database_ids, list):
            raise TypeError("Expected argument 'restorable_dropped_database_ids' to be a list")
        pulumi.set(__self__, "restorable_dropped_database_ids", restorable_dropped_database_ids)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="administratorLogin")
    def administrator_login(self) -> str:
        """
        The server's administrator login name.
        """
        return pulumi.get(self, "administrator_login")

    @property
    @pulumi.getter(name="fullyQualifiedDomainName")
    def fully_qualified_domain_name(self) -> str:
        """
        The fully qualified domain name of the Azure SQL Server.
        """
        return pulumi.get(self, "fully_qualified_domain_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identities(self) -> Sequence['outputs.GetServerIdentityResult']:
        """
        A `identity` block as defined below.
        """
        return pulumi.get(self, "identities")

    @property
    @pulumi.getter
    def location(self) -> str:
        """
        The Azure Region where the Microsoft SQL Server exists.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="restorableDroppedDatabaseIds")
    def restorable_dropped_database_ids(self) -> Sequence[str]:
        """
        A list of dropped restorable database IDs on the server.
        """
        return pulumi.get(self, "restorable_dropped_database_ids")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        A mapping of tags assigned to this Microsoft SQL Server.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def version(self) -> str:
        """
        This servers MS SQL version.
        """
        return pulumi.get(self, "version")


class AwaitableGetServerResult(GetServerResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServerResult(
            administrator_login=self.administrator_login,
            fully_qualified_domain_name=self.fully_qualified_domain_name,
            id=self.id,
            identities=self.identities,
            location=self.location,
            name=self.name,
            resource_group_name=self.resource_group_name,
            restorable_dropped_database_ids=self.restorable_dropped_database_ids,
            tags=self.tags,
            version=self.version)


def get_server(name: Optional[str] = None,
               resource_group_name: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServerResult:
    """
    Use this data source to access information about an existing Microsoft SQL Server.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.mssql.get_server(name="existingMsSqlServer",
        resource_group_name="existingResGroup")
    pulumi.export("id", example.id)
    ```


    :param str name: The name of this Microsoft SQL Server.
    :param str resource_group_name: The name of the Resource Group where the Microsoft SQL Server exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('azure:mssql/getServer:getServer', __args__, opts=opts, typ=GetServerResult).value

    return AwaitableGetServerResult(
        administrator_login=__ret__.administrator_login,
        fully_qualified_domain_name=__ret__.fully_qualified_domain_name,
        id=__ret__.id,
        identities=__ret__.identities,
        location=__ret__.location,
        name=__ret__.name,
        resource_group_name=__ret__.resource_group_name,
        restorable_dropped_database_ids=__ret__.restorable_dropped_database_ids,
        tags=__ret__.tags,
        version=__ret__.version)