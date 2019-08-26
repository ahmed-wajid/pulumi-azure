# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class RoleDefinition(pulumi.CustomResource):
    assignable_scopes: pulumi.Output[list]
    """
    One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
    """
    description: pulumi.Output[str]
    """
    A description of the Role Definition.
    """
    name: pulumi.Output[str]
    """
    The name of the Role Definition. Changing this forces a new resource to be created.
    """
    permissions: pulumi.Output[list]
    """
    A `permissions` block as defined below.
    """
    role_definition_id: pulumi.Output[str]
    """
    A unique UUID/GUID which identifies this role - one will be generated if not specified. Changing this forces a new resource to be created.
    """
    scope: pulumi.Output[str]
    """
    The scope at which the Role Definition applies too, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`. Changing this forces a new resource to be created.
    """
    def __init__(__self__, resource_name, opts=None, assignable_scopes=None, description=None, name=None, permissions=None, role_definition_id=None, scope=None, __props__=None, __name__=None, __opts__=None):
        """
        Manages a custom Role Definition, used to assign Roles to Users/Principals. See ['Understand role definitions'](https://docs.microsoft.com/en-us/azure/role-based-access-control/role-definitions) in the Azure documentation for more details.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] assignable_scopes: One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
        :param pulumi.Input[str] description: A description of the Role Definition.
        :param pulumi.Input[str] name: The name of the Role Definition. Changing this forces a new resource to be created.
        :param pulumi.Input[list] permissions: A `permissions` block as defined below.
        :param pulumi.Input[str] role_definition_id: A unique UUID/GUID which identifies this role - one will be generated if not specified. Changing this forces a new resource to be created.
        :param pulumi.Input[str] scope: The scope at which the Role Definition applies too, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`. Changing this forces a new resource to be created.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/r/role_definition.html.markdown.
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

            if assignable_scopes is None:
                raise TypeError("Missing required property 'assignable_scopes'")
            __props__['assignable_scopes'] = assignable_scopes
            __props__['description'] = description
            __props__['name'] = name
            if permissions is None:
                raise TypeError("Missing required property 'permissions'")
            __props__['permissions'] = permissions
            __props__['role_definition_id'] = role_definition_id
            if scope is None:
                raise TypeError("Missing required property 'scope'")
            __props__['scope'] = scope
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="azure:role/definition:Definition")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(RoleDefinition, __self__).__init__(
            'azure:authorization/roleDefinition:RoleDefinition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, assignable_scopes=None, description=None, name=None, permissions=None, role_definition_id=None, scope=None):
        """
        Get an existing RoleDefinition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] assignable_scopes: One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
        :param pulumi.Input[str] description: A description of the Role Definition.
        :param pulumi.Input[str] name: The name of the Role Definition. Changing this forces a new resource to be created.
        :param pulumi.Input[list] permissions: A `permissions` block as defined below.
        :param pulumi.Input[str] role_definition_id: A unique UUID/GUID which identifies this role - one will be generated if not specified. Changing this forces a new resource to be created.
        :param pulumi.Input[str] scope: The scope at which the Role Definition applies too, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`. Changing this forces a new resource to be created.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-azurerm/blob/master/website/docs/r/role_definition.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["assignable_scopes"] = assignable_scopes
        __props__["description"] = description
        __props__["name"] = name
        __props__["permissions"] = permissions
        __props__["role_definition_id"] = role_definition_id
        __props__["scope"] = scope
        return RoleDefinition(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
