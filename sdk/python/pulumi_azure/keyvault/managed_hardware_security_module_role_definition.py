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

__all__ = ['ManagedHardwareSecurityModuleRoleDefinitionArgs', 'ManagedHardwareSecurityModuleRoleDefinition']

@pulumi.input_type
class ManagedHardwareSecurityModuleRoleDefinitionArgs:
    def __init__(__self__, *,
                 vault_base_url: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]]] = None,
                 role_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ManagedHardwareSecurityModuleRoleDefinition resource.
        :param pulumi.Input[str] vault_base_url: The base URL of the managed hardware security module resource. Changing this forces a new KeyVault Role Definition to be created.
        :param pulumi.Input[str] description: Specifies a text description about this KeyVault Role Definition.
        :param pulumi.Input[str] name: The name which should be used for this KeyVault Role Definition. Changing this forces a new KeyVault Role Definition to be created.
        :param pulumi.Input[Sequence[pulumi.Input['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]] permissions: One or more `permission` blocks as defined below.
        :param pulumi.Input[str] role_name: Specify a name for this KeyVault Role Definition.
        """
        pulumi.set(__self__, "vault_base_url", vault_base_url)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if role_name is not None:
            pulumi.set(__self__, "role_name", role_name)

    @property
    @pulumi.getter(name="vaultBaseUrl")
    def vault_base_url(self) -> pulumi.Input[str]:
        """
        The base URL of the managed hardware security module resource. Changing this forces a new KeyVault Role Definition to be created.
        """
        return pulumi.get(self, "vault_base_url")

    @vault_base_url.setter
    def vault_base_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "vault_base_url", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a text description about this KeyVault Role Definition.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this KeyVault Role Definition. Changing this forces a new KeyVault Role Definition to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]]]:
        """
        One or more `permission` blocks as defined below.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specify a name for this KeyVault Role Definition.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_name", value)


@pulumi.input_type
class _ManagedHardwareSecurityModuleRoleDefinitionState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]]] = None,
                 resource_manager_id: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 role_type: Optional[pulumi.Input[str]] = None,
                 vault_base_url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ManagedHardwareSecurityModuleRoleDefinition resources.
        :param pulumi.Input[str] description: Specifies a text description about this KeyVault Role Definition.
        :param pulumi.Input[str] name: The name which should be used for this KeyVault Role Definition. Changing this forces a new KeyVault Role Definition to be created.
        :param pulumi.Input[Sequence[pulumi.Input['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]] permissions: One or more `permission` blocks as defined below.
        :param pulumi.Input[str] resource_manager_id: The ID of the role definition resource without Key Vault base URL.
        :param pulumi.Input[str] role_name: Specify a name for this KeyVault Role Definition.
        :param pulumi.Input[str] role_type: The type of the role definition. Possible values are `AKVBuiltInRole` and `CustomRole`.
        :param pulumi.Input[str] vault_base_url: The base URL of the managed hardware security module resource. Changing this forces a new KeyVault Role Definition to be created.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if resource_manager_id is not None:
            pulumi.set(__self__, "resource_manager_id", resource_manager_id)
        if role_name is not None:
            pulumi.set(__self__, "role_name", role_name)
        if role_type is not None:
            pulumi.set(__self__, "role_type", role_type)
        if vault_base_url is not None:
            pulumi.set(__self__, "vault_base_url", vault_base_url)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a text description about this KeyVault Role Definition.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this KeyVault Role Definition. Changing this forces a new KeyVault Role Definition to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]]]:
        """
        One or more `permission` blocks as defined below.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="resourceManagerId")
    def resource_manager_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the role definition resource without Key Vault base URL.
        """
        return pulumi.get(self, "resource_manager_id")

    @resource_manager_id.setter
    def resource_manager_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_manager_id", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specify a name for this KeyVault Role Definition.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_name", value)

    @property
    @pulumi.getter(name="roleType")
    def role_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the role definition. Possible values are `AKVBuiltInRole` and `CustomRole`.
        """
        return pulumi.get(self, "role_type")

    @role_type.setter
    def role_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_type", value)

    @property
    @pulumi.getter(name="vaultBaseUrl")
    def vault_base_url(self) -> Optional[pulumi.Input[str]]:
        """
        The base URL of the managed hardware security module resource. Changing this forces a new KeyVault Role Definition to be created.
        """
        return pulumi.get(self, "vault_base_url")

    @vault_base_url.setter
    def vault_base_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vault_base_url", value)


class ManagedHardwareSecurityModuleRoleDefinition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]]]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 vault_base_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a KeyVault Managed Hardware Security Module Role Definition. This resource works together with Managed hardware security module resource.

        ## Import

        KeyVaults can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:keyvault/managedHardwareSecurityModuleRoleDefinition:ManagedHardwareSecurityModuleRoleDefinition example https://0000.managedhsm.azure.net///RoleDefinition/00000000-0000-0000-0000-000000000000
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Specifies a text description about this KeyVault Role Definition.
        :param pulumi.Input[str] name: The name which should be used for this KeyVault Role Definition. Changing this forces a new KeyVault Role Definition to be created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]]] permissions: One or more `permission` blocks as defined below.
        :param pulumi.Input[str] role_name: Specify a name for this KeyVault Role Definition.
        :param pulumi.Input[str] vault_base_url: The base URL of the managed hardware security module resource. Changing this forces a new KeyVault Role Definition to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ManagedHardwareSecurityModuleRoleDefinitionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a KeyVault Managed Hardware Security Module Role Definition. This resource works together with Managed hardware security module resource.

        ## Import

        KeyVaults can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:keyvault/managedHardwareSecurityModuleRoleDefinition:ManagedHardwareSecurityModuleRoleDefinition example https://0000.managedhsm.azure.net///RoleDefinition/00000000-0000-0000-0000-000000000000
        ```

        :param str resource_name: The name of the resource.
        :param ManagedHardwareSecurityModuleRoleDefinitionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ManagedHardwareSecurityModuleRoleDefinitionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]]]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 vault_base_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ManagedHardwareSecurityModuleRoleDefinitionArgs.__new__(ManagedHardwareSecurityModuleRoleDefinitionArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["permissions"] = permissions
            __props__.__dict__["role_name"] = role_name
            if vault_base_url is None and not opts.urn:
                raise TypeError("Missing required property 'vault_base_url'")
            __props__.__dict__["vault_base_url"] = vault_base_url
            __props__.__dict__["resource_manager_id"] = None
            __props__.__dict__["role_type"] = None
        super(ManagedHardwareSecurityModuleRoleDefinition, __self__).__init__(
            'azure:keyvault/managedHardwareSecurityModuleRoleDefinition:ManagedHardwareSecurityModuleRoleDefinition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]]]] = None,
            resource_manager_id: Optional[pulumi.Input[str]] = None,
            role_name: Optional[pulumi.Input[str]] = None,
            role_type: Optional[pulumi.Input[str]] = None,
            vault_base_url: Optional[pulumi.Input[str]] = None) -> 'ManagedHardwareSecurityModuleRoleDefinition':
        """
        Get an existing ManagedHardwareSecurityModuleRoleDefinition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Specifies a text description about this KeyVault Role Definition.
        :param pulumi.Input[str] name: The name which should be used for this KeyVault Role Definition. Changing this forces a new KeyVault Role Definition to be created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs']]]] permissions: One or more `permission` blocks as defined below.
        :param pulumi.Input[str] resource_manager_id: The ID of the role definition resource without Key Vault base URL.
        :param pulumi.Input[str] role_name: Specify a name for this KeyVault Role Definition.
        :param pulumi.Input[str] role_type: The type of the role definition. Possible values are `AKVBuiltInRole` and `CustomRole`.
        :param pulumi.Input[str] vault_base_url: The base URL of the managed hardware security module resource. Changing this forces a new KeyVault Role Definition to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ManagedHardwareSecurityModuleRoleDefinitionState.__new__(_ManagedHardwareSecurityModuleRoleDefinitionState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["resource_manager_id"] = resource_manager_id
        __props__.__dict__["role_name"] = role_name
        __props__.__dict__["role_type"] = role_type
        __props__.__dict__["vault_base_url"] = vault_base_url
        return ManagedHardwareSecurityModuleRoleDefinition(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a text description about this KeyVault Role Definition.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this KeyVault Role Definition. Changing this forces a new KeyVault Role Definition to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Optional[Sequence['outputs.ManagedHardwareSecurityModuleRoleDefinitionPermission']]]:
        """
        One or more `permission` blocks as defined below.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="resourceManagerId")
    def resource_manager_id(self) -> pulumi.Output[str]:
        """
        The ID of the role definition resource without Key Vault base URL.
        """
        return pulumi.get(self, "resource_manager_id")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[Optional[str]]:
        """
        Specify a name for this KeyVault Role Definition.
        """
        return pulumi.get(self, "role_name")

    @property
    @pulumi.getter(name="roleType")
    def role_type(self) -> pulumi.Output[str]:
        """
        The type of the role definition. Possible values are `AKVBuiltInRole` and `CustomRole`.
        """
        return pulumi.get(self, "role_type")

    @property
    @pulumi.getter(name="vaultBaseUrl")
    def vault_base_url(self) -> pulumi.Output[str]:
        """
        The base URL of the managed hardware security module resource. Changing this forces a new KeyVault Role Definition to be created.
        """
        return pulumi.get(self, "vault_base_url")
