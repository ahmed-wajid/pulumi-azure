# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['IntegrationRuntimeSelfHostedArgs', 'IntegrationRuntimeSelfHosted']

@pulumi.input_type
class IntegrationRuntimeSelfHostedArgs:
    def __init__(__self__, *,
                 synapse_workspace_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a IntegrationRuntimeSelfHosted resource.
        :param pulumi.Input[str] synapse_workspace_id: The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        :param pulumi.Input[str] description: Integration runtime description.
        :param pulumi.Input[str] name: The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        """
        pulumi.set(__self__, "synapse_workspace_id", synapse_workspace_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="synapseWorkspaceId")
    def synapse_workspace_id(self) -> pulumi.Input[str]:
        """
        The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        """
        return pulumi.get(self, "synapse_workspace_id")

    @synapse_workspace_id.setter
    def synapse_workspace_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "synapse_workspace_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Integration runtime description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _IntegrationRuntimeSelfHostedState:
    def __init__(__self__, *,
                 authorization_key_primary: Optional[pulumi.Input[str]] = None,
                 authorization_key_secondary: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 synapse_workspace_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IntegrationRuntimeSelfHosted resources.
        :param pulumi.Input[str] authorization_key_primary: The primary integration runtime authentication key.
        :param pulumi.Input[str] authorization_key_secondary: The secondary integration runtime authentication key.
        :param pulumi.Input[str] description: Integration runtime description.
        :param pulumi.Input[str] name: The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        :param pulumi.Input[str] synapse_workspace_id: The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        """
        if authorization_key_primary is not None:
            pulumi.set(__self__, "authorization_key_primary", authorization_key_primary)
        if authorization_key_secondary is not None:
            pulumi.set(__self__, "authorization_key_secondary", authorization_key_secondary)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if synapse_workspace_id is not None:
            pulumi.set(__self__, "synapse_workspace_id", synapse_workspace_id)

    @property
    @pulumi.getter(name="authorizationKeyPrimary")
    def authorization_key_primary(self) -> Optional[pulumi.Input[str]]:
        """
        The primary integration runtime authentication key.
        """
        return pulumi.get(self, "authorization_key_primary")

    @authorization_key_primary.setter
    def authorization_key_primary(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authorization_key_primary", value)

    @property
    @pulumi.getter(name="authorizationKeySecondary")
    def authorization_key_secondary(self) -> Optional[pulumi.Input[str]]:
        """
        The secondary integration runtime authentication key.
        """
        return pulumi.get(self, "authorization_key_secondary")

    @authorization_key_secondary.setter
    def authorization_key_secondary(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authorization_key_secondary", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Integration runtime description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="synapseWorkspaceId")
    def synapse_workspace_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        """
        return pulumi.get(self, "synapse_workspace_id")

    @synapse_workspace_id.setter
    def synapse_workspace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "synapse_workspace_id", value)


class IntegrationRuntimeSelfHosted(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 synapse_workspace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Synapse Self-hosted Integration Runtime.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            account_tier="Standard",
            account_replication_type="LRS")
        example_container = azure.storage.Container("exampleContainer",
            storage_account_name=example_account.name,
            container_access_type="private")
        example_data_lake_gen2_filesystem = azure.storage.DataLakeGen2Filesystem("exampleDataLakeGen2Filesystem", storage_account_id=example_account.id)
        example_workspace = azure.synapse.Workspace("exampleWorkspace",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            storage_data_lake_gen2_filesystem_id=example_data_lake_gen2_filesystem.id,
            sql_administrator_login="sqladminuser",
            sql_administrator_login_password="H@Sh1CoR3!",
            managed_virtual_network_enabled=True)
        example_firewall_rule = azure.synapse.FirewallRule("exampleFirewallRule",
            synapse_workspace_id=example_workspace.id,
            start_ip_address="0.0.0.0",
            end_ip_address="255.255.255.255")
        example_integration_runtime_self_hosted = azure.synapse.IntegrationRuntimeSelfHosted("exampleIntegrationRuntimeSelfHosted", synapse_workspace_id=example_workspace.id)
        ```

        ## Import

        Synapse Self-hosted Integration Runtimes can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:synapse/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Synapse/workspaces/workspace1/integrationruntimes/IntegrationRuntime1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Integration runtime description.
        :param pulumi.Input[str] name: The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        :param pulumi.Input[str] synapse_workspace_id: The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IntegrationRuntimeSelfHostedArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Synapse Self-hosted Integration Runtime.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            account_tier="Standard",
            account_replication_type="LRS")
        example_container = azure.storage.Container("exampleContainer",
            storage_account_name=example_account.name,
            container_access_type="private")
        example_data_lake_gen2_filesystem = azure.storage.DataLakeGen2Filesystem("exampleDataLakeGen2Filesystem", storage_account_id=example_account.id)
        example_workspace = azure.synapse.Workspace("exampleWorkspace",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            storage_data_lake_gen2_filesystem_id=example_data_lake_gen2_filesystem.id,
            sql_administrator_login="sqladminuser",
            sql_administrator_login_password="H@Sh1CoR3!",
            managed_virtual_network_enabled=True)
        example_firewall_rule = azure.synapse.FirewallRule("exampleFirewallRule",
            synapse_workspace_id=example_workspace.id,
            start_ip_address="0.0.0.0",
            end_ip_address="255.255.255.255")
        example_integration_runtime_self_hosted = azure.synapse.IntegrationRuntimeSelfHosted("exampleIntegrationRuntimeSelfHosted", synapse_workspace_id=example_workspace.id)
        ```

        ## Import

        Synapse Self-hosted Integration Runtimes can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:synapse/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Synapse/workspaces/workspace1/integrationruntimes/IntegrationRuntime1
        ```

        :param str resource_name: The name of the resource.
        :param IntegrationRuntimeSelfHostedArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IntegrationRuntimeSelfHostedArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 synapse_workspace_id: Optional[pulumi.Input[str]] = None,
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
            __props__ = IntegrationRuntimeSelfHostedArgs.__new__(IntegrationRuntimeSelfHostedArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if synapse_workspace_id is None and not opts.urn:
                raise TypeError("Missing required property 'synapse_workspace_id'")
            __props__.__dict__["synapse_workspace_id"] = synapse_workspace_id
            __props__.__dict__["authorization_key_primary"] = None
            __props__.__dict__["authorization_key_secondary"] = None
        super(IntegrationRuntimeSelfHosted, __self__).__init__(
            'azure:synapse/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authorization_key_primary: Optional[pulumi.Input[str]] = None,
            authorization_key_secondary: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            synapse_workspace_id: Optional[pulumi.Input[str]] = None) -> 'IntegrationRuntimeSelfHosted':
        """
        Get an existing IntegrationRuntimeSelfHosted resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authorization_key_primary: The primary integration runtime authentication key.
        :param pulumi.Input[str] authorization_key_secondary: The secondary integration runtime authentication key.
        :param pulumi.Input[str] description: Integration runtime description.
        :param pulumi.Input[str] name: The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        :param pulumi.Input[str] synapse_workspace_id: The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IntegrationRuntimeSelfHostedState.__new__(_IntegrationRuntimeSelfHostedState)

        __props__.__dict__["authorization_key_primary"] = authorization_key_primary
        __props__.__dict__["authorization_key_secondary"] = authorization_key_secondary
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["synapse_workspace_id"] = synapse_workspace_id
        return IntegrationRuntimeSelfHosted(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authorizationKeyPrimary")
    def authorization_key_primary(self) -> pulumi.Output[str]:
        """
        The primary integration runtime authentication key.
        """
        return pulumi.get(self, "authorization_key_primary")

    @property
    @pulumi.getter(name="authorizationKeySecondary")
    def authorization_key_secondary(self) -> pulumi.Output[str]:
        """
        The secondary integration runtime authentication key.
        """
        return pulumi.get(self, "authorization_key_secondary")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Integration runtime description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="synapseWorkspaceId")
    def synapse_workspace_id(self) -> pulumi.Output[str]:
        """
        The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
        """
        return pulumi.get(self, "synapse_workspace_id")
