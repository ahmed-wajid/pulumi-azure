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

__all__ = [
    'GetPublicConfigurationsResult',
    'AwaitableGetPublicConfigurationsResult',
    'get_public_configurations',
    'get_public_configurations_output',
]

@pulumi.output_type
class GetPublicConfigurationsResult:
    """
    A collection of values returned by getPublicConfigurations.
    """
    def __init__(__self__, configs=None, id=None, location=None, recur_every=None, scope=None):
        if configs and not isinstance(configs, list):
            raise TypeError("Expected argument 'configs' to be a list")
        pulumi.set(__self__, "configs", configs)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if recur_every and not isinstance(recur_every, str):
            raise TypeError("Expected argument 'recur_every' to be a str")
        pulumi.set(__self__, "recur_every", recur_every)
        if scope and not isinstance(scope, str):
            raise TypeError("Expected argument 'scope' to be a str")
        pulumi.set(__self__, "scope", scope)

    @property
    @pulumi.getter
    def configs(self) -> Sequence['outputs.GetPublicConfigurationsConfigResult']:
        """
        A `configs` block as defined below.
        """
        return pulumi.get(self, "configs")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def location(self) -> Optional[str]:
        """
        The Azure location of the Public Maintenance Configuration.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter(name="recurEvery")
    def recur_every(self) -> Optional[str]:
        """
        The rate at which a maintenance window is expected to recur.
        """
        return pulumi.get(self, "recur_every")

    @property
    @pulumi.getter
    def scope(self) -> Optional[str]:
        return pulumi.get(self, "scope")


class AwaitableGetPublicConfigurationsResult(GetPublicConfigurationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPublicConfigurationsResult(
            configs=self.configs,
            id=self.id,
            location=self.location,
            recur_every=self.recur_every,
            scope=self.scope)


def get_public_configurations(location: Optional[str] = None,
                              recur_every: Optional[str] = None,
                              scope: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPublicConfigurationsResult:
    """
    Use this data source to access information about existing Public Maintenance Configurations.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    existing = azure.maintenance.get_public_configurations(location="West Europe",
        scope="SQLManagedInstance",
        recur_every="Monday-Thursday")
    pulumi.export("name", existing.configs[0].name)
    ```


    :param str location: The Azure location to filter the list of Public Maintenance Configurations against.
    :param str recur_every: The recurring window to filter the list of Public Maintenance Configurations against. Possible values are `Monday-Thursday` and `Friday-Sunday`
    :param str scope: The scope to filter the list of Public Maintenance Configurations against. Possible values are `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` and `SQLManagedInstance`.
    """
    __args__ = dict()
    __args__['location'] = location
    __args__['recurEvery'] = recur_every
    __args__['scope'] = scope
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:maintenance/getPublicConfigurations:getPublicConfigurations', __args__, opts=opts, typ=GetPublicConfigurationsResult).value

    return AwaitableGetPublicConfigurationsResult(
        configs=__ret__.configs,
        id=__ret__.id,
        location=__ret__.location,
        recur_every=__ret__.recur_every,
        scope=__ret__.scope)


@_utilities.lift_output_func(get_public_configurations)
def get_public_configurations_output(location: Optional[pulumi.Input[Optional[str]]] = None,
                                     recur_every: Optional[pulumi.Input[Optional[str]]] = None,
                                     scope: Optional[pulumi.Input[Optional[str]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPublicConfigurationsResult]:
    """
    Use this data source to access information about existing Public Maintenance Configurations.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    existing = azure.maintenance.get_public_configurations(location="West Europe",
        scope="SQLManagedInstance",
        recur_every="Monday-Thursday")
    pulumi.export("name", existing.configs[0].name)
    ```


    :param str location: The Azure location to filter the list of Public Maintenance Configurations against.
    :param str recur_every: The recurring window to filter the list of Public Maintenance Configurations against. Possible values are `Monday-Thursday` and `Friday-Sunday`
    :param str scope: The scope to filter the list of Public Maintenance Configurations against. Possible values are `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` and `SQLManagedInstance`.
    """
    ...