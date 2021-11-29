# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FlexibleServerFirewallRuleArgs', 'FlexibleServerFirewallRule']

@pulumi.input_type
class FlexibleServerFirewallRuleArgs:
    def __init__(__self__, *,
                 end_ip_address: pulumi.Input[str],
                 resource_group_name: pulumi.Input[str],
                 server_name: pulumi.Input[str],
                 start_ip_address: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FlexibleServerFirewallRule resource.
        :param pulumi.Input[str] end_ip_address: Specifies the End IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] server_name: Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
        :param pulumi.Input[str] start_ip_address: Specifies the Start IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "end_ip_address", end_ip_address)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "server_name", server_name)
        pulumi.set(__self__, "start_ip_address", start_ip_address)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="endIpAddress")
    def end_ip_address(self) -> pulumi.Input[str]:
        """
        Specifies the End IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "end_ip_address")

    @end_ip_address.setter
    def end_ip_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "end_ip_address", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="serverName")
    def server_name(self) -> pulumi.Input[str]:
        """
        Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_name")

    @server_name.setter
    def server_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "server_name", value)

    @property
    @pulumi.getter(name="startIpAddress")
    def start_ip_address(self) -> pulumi.Input[str]:
        """
        Specifies the Start IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "start_ip_address")

    @start_ip_address.setter
    def start_ip_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "start_ip_address", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _FlexibleServerFirewallRuleState:
    def __init__(__self__, *,
                 end_ip_address: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 server_name: Optional[pulumi.Input[str]] = None,
                 start_ip_address: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FlexibleServerFirewallRule resources.
        :param pulumi.Input[str] end_ip_address: Specifies the End IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] server_name: Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
        :param pulumi.Input[str] start_ip_address: Specifies the Start IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        """
        if end_ip_address is not None:
            pulumi.set(__self__, "end_ip_address", end_ip_address)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if server_name is not None:
            pulumi.set(__self__, "server_name", server_name)
        if start_ip_address is not None:
            pulumi.set(__self__, "start_ip_address", start_ip_address)

    @property
    @pulumi.getter(name="endIpAddress")
    def end_ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the End IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "end_ip_address")

    @end_ip_address.setter
    def end_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_ip_address", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="serverName")
    def server_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_name")

    @server_name.setter
    def server_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "server_name", value)

    @property
    @pulumi.getter(name="startIpAddress")
    def start_ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the Start IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "start_ip_address")

    @start_ip_address.setter
    def start_ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_ip_address", value)


class FlexibleServerFirewallRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end_ip_address: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 server_name: Optional[pulumi.Input[str]] = None,
                 start_ip_address: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Firewall Rule for a MySQL Flexible Server.

        ## Example Usage
        ### Single IP Address)

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_flexible_server = azure.mysql.FlexibleServer("exampleFlexibleServer")
        # ...
        example_flexible_server_firewall_rule = azure.mysql.FlexibleServerFirewallRule("exampleFlexibleServerFirewallRule",
            resource_group_name=example_resource_group.name,
            server_name=example_flexible_server.name,
            start_ip_address="40.112.8.12",
            end_ip_address="40.112.8.12")
        ```
        ### IP Range)

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_flexible_server = azure.mysql.FlexibleServer("exampleFlexibleServer")
        # ...
        example_flexible_server_firewall_rule = azure.mysql.FlexibleServerFirewallRule("exampleFlexibleServerFirewallRule",
            resource_group_name=example_resource_group.name,
            server_name=example_flexible_server.name,
            start_ip_address="40.112.0.0",
            end_ip_address="40.112.255.255")
        ```
        ### Allow Access To Azure Services)

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_flexible_server = azure.mysql.FlexibleServer("exampleFlexibleServer")
        # ...
        example_flexible_server_firewall_rule = azure.mysql.FlexibleServerFirewallRule("exampleFlexibleServerFirewallRule",
            resource_group_name=example_resource_group.name,
            server_name=example_flexible_server.name,
            start_ip_address="0.0.0.0",
            end_ip_address="0.0.0.0")
        ```

        ## Import

        MySQL Firewall Rule's can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:mysql/flexibleServerFirewallRule:FlexibleServerFirewallRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.DBforMySQL/flexibleServers/flexibleServer1/firewallRules/firewallRule1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] end_ip_address: Specifies the End IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] server_name: Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
        :param pulumi.Input[str] start_ip_address: Specifies the Start IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FlexibleServerFirewallRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Firewall Rule for a MySQL Flexible Server.

        ## Example Usage
        ### Single IP Address)

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_flexible_server = azure.mysql.FlexibleServer("exampleFlexibleServer")
        # ...
        example_flexible_server_firewall_rule = azure.mysql.FlexibleServerFirewallRule("exampleFlexibleServerFirewallRule",
            resource_group_name=example_resource_group.name,
            server_name=example_flexible_server.name,
            start_ip_address="40.112.8.12",
            end_ip_address="40.112.8.12")
        ```
        ### IP Range)

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_flexible_server = azure.mysql.FlexibleServer("exampleFlexibleServer")
        # ...
        example_flexible_server_firewall_rule = azure.mysql.FlexibleServerFirewallRule("exampleFlexibleServerFirewallRule",
            resource_group_name=example_resource_group.name,
            server_name=example_flexible_server.name,
            start_ip_address="40.112.0.0",
            end_ip_address="40.112.255.255")
        ```
        ### Allow Access To Azure Services)

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_flexible_server = azure.mysql.FlexibleServer("exampleFlexibleServer")
        # ...
        example_flexible_server_firewall_rule = azure.mysql.FlexibleServerFirewallRule("exampleFlexibleServerFirewallRule",
            resource_group_name=example_resource_group.name,
            server_name=example_flexible_server.name,
            start_ip_address="0.0.0.0",
            end_ip_address="0.0.0.0")
        ```

        ## Import

        MySQL Firewall Rule's can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:mysql/flexibleServerFirewallRule:FlexibleServerFirewallRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.DBforMySQL/flexibleServers/flexibleServer1/firewallRules/firewallRule1
        ```

        :param str resource_name: The name of the resource.
        :param FlexibleServerFirewallRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FlexibleServerFirewallRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end_ip_address: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 server_name: Optional[pulumi.Input[str]] = None,
                 start_ip_address: Optional[pulumi.Input[str]] = None,
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
            __props__ = FlexibleServerFirewallRuleArgs.__new__(FlexibleServerFirewallRuleArgs)

            if end_ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'end_ip_address'")
            __props__.__dict__["end_ip_address"] = end_ip_address
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if server_name is None and not opts.urn:
                raise TypeError("Missing required property 'server_name'")
            __props__.__dict__["server_name"] = server_name
            if start_ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'start_ip_address'")
            __props__.__dict__["start_ip_address"] = start_ip_address
        super(FlexibleServerFirewallRule, __self__).__init__(
            'azure:mysql/flexibleServerFirewallRule:FlexibleServerFirewallRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            end_ip_address: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            server_name: Optional[pulumi.Input[str]] = None,
            start_ip_address: Optional[pulumi.Input[str]] = None) -> 'FlexibleServerFirewallRule':
        """
        Get an existing FlexibleServerFirewallRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] end_ip_address: Specifies the End IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
        :param pulumi.Input[str] server_name: Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
        :param pulumi.Input[str] start_ip_address: Specifies the Start IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FlexibleServerFirewallRuleState.__new__(_FlexibleServerFirewallRuleState)

        __props__.__dict__["end_ip_address"] = end_ip_address
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["server_name"] = server_name
        __props__.__dict__["start_ip_address"] = start_ip_address
        return FlexibleServerFirewallRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="endIpAddress")
    def end_ip_address(self) -> pulumi.Output[str]:
        """
        Specifies the End IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "end_ip_address")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the MySQL Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="serverName")
    def server_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_name")

    @property
    @pulumi.getter(name="startIpAddress")
    def start_ip_address(self) -> pulumi.Output[str]:
        """
        Specifies the Start IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "start_ip_address")
