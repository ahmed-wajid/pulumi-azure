# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ContactArgs', 'Contact']

@pulumi.input_type
class ContactArgs:
    def __init__(__self__, *,
                 contact_profile_id: pulumi.Input[str],
                 ground_station_name: pulumi.Input[str],
                 reservation_end_time: pulumi.Input[str],
                 reservation_start_time: pulumi.Input[str],
                 spacecraft_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Contact resource.
        :param pulumi.Input[str] contact_profile_id: ID of the orbital contact profile. Changing this forces a new resource to be created.
        :param pulumi.Input[str] ground_station_name: Name of the Azure ground station. Changing this forces a new resource to be created.
        :param pulumi.Input[str] reservation_end_time: Reservation end time of the Contact. Changing this forces a new resource to be created.
        :param pulumi.Input[str] reservation_start_time: Reservation start time of the Contact. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spacecraft_id: The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "contact_profile_id", contact_profile_id)
        pulumi.set(__self__, "ground_station_name", ground_station_name)
        pulumi.set(__self__, "reservation_end_time", reservation_end_time)
        pulumi.set(__self__, "reservation_start_time", reservation_start_time)
        pulumi.set(__self__, "spacecraft_id", spacecraft_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="contactProfileId")
    def contact_profile_id(self) -> pulumi.Input[str]:
        """
        ID of the orbital contact profile. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "contact_profile_id")

    @contact_profile_id.setter
    def contact_profile_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "contact_profile_id", value)

    @property
    @pulumi.getter(name="groundStationName")
    def ground_station_name(self) -> pulumi.Input[str]:
        """
        Name of the Azure ground station. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "ground_station_name")

    @ground_station_name.setter
    def ground_station_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "ground_station_name", value)

    @property
    @pulumi.getter(name="reservationEndTime")
    def reservation_end_time(self) -> pulumi.Input[str]:
        """
        Reservation end time of the Contact. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "reservation_end_time")

    @reservation_end_time.setter
    def reservation_end_time(self, value: pulumi.Input[str]):
        pulumi.set(self, "reservation_end_time", value)

    @property
    @pulumi.getter(name="reservationStartTime")
    def reservation_start_time(self) -> pulumi.Input[str]:
        """
        Reservation start time of the Contact. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "reservation_start_time")

    @reservation_start_time.setter
    def reservation_start_time(self, value: pulumi.Input[str]):
        pulumi.set(self, "reservation_start_time", value)

    @property
    @pulumi.getter(name="spacecraftId")
    def spacecraft_id(self) -> pulumi.Input[str]:
        """
        The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spacecraft_id")

    @spacecraft_id.setter
    def spacecraft_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "spacecraft_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ContactState:
    def __init__(__self__, *,
                 contact_profile_id: Optional[pulumi.Input[str]] = None,
                 ground_station_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 reservation_end_time: Optional[pulumi.Input[str]] = None,
                 reservation_start_time: Optional[pulumi.Input[str]] = None,
                 spacecraft_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Contact resources.
        :param pulumi.Input[str] contact_profile_id: ID of the orbital contact profile. Changing this forces a new resource to be created.
        :param pulumi.Input[str] ground_station_name: Name of the Azure ground station. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] reservation_end_time: Reservation end time of the Contact. Changing this forces a new resource to be created.
        :param pulumi.Input[str] reservation_start_time: Reservation start time of the Contact. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spacecraft_id: The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
        """
        if contact_profile_id is not None:
            pulumi.set(__self__, "contact_profile_id", contact_profile_id)
        if ground_station_name is not None:
            pulumi.set(__self__, "ground_station_name", ground_station_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if reservation_end_time is not None:
            pulumi.set(__self__, "reservation_end_time", reservation_end_time)
        if reservation_start_time is not None:
            pulumi.set(__self__, "reservation_start_time", reservation_start_time)
        if spacecraft_id is not None:
            pulumi.set(__self__, "spacecraft_id", spacecraft_id)

    @property
    @pulumi.getter(name="contactProfileId")
    def contact_profile_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the orbital contact profile. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "contact_profile_id")

    @contact_profile_id.setter
    def contact_profile_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "contact_profile_id", value)

    @property
    @pulumi.getter(name="groundStationName")
    def ground_station_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Azure ground station. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "ground_station_name")

    @ground_station_name.setter
    def ground_station_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ground_station_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="reservationEndTime")
    def reservation_end_time(self) -> Optional[pulumi.Input[str]]:
        """
        Reservation end time of the Contact. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "reservation_end_time")

    @reservation_end_time.setter
    def reservation_end_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reservation_end_time", value)

    @property
    @pulumi.getter(name="reservationStartTime")
    def reservation_start_time(self) -> Optional[pulumi.Input[str]]:
        """
        Reservation start time of the Contact. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "reservation_start_time")

    @reservation_start_time.setter
    def reservation_start_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "reservation_start_time", value)

    @property
    @pulumi.getter(name="spacecraftId")
    def spacecraft_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spacecraft_id")

    @spacecraft_id.setter
    def spacecraft_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "spacecraft_id", value)


class Contact(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_profile_id: Optional[pulumi.Input[str]] = None,
                 ground_station_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 reservation_end_time: Optional[pulumi.Input[str]] = None,
                 reservation_start_time: Optional[pulumi.Input[str]] = None,
                 spacecraft_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an orbital contact.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_spacecraft = azure.orbital.Spacecraft("exampleSpacecraft",
            resource_group_name=azurerm_resource_group["test"]["name"],
            location="westeurope",
            norad_id="12345",
            links=[azure.orbital.SpacecraftLinkArgs(
                bandwidth_mhz=100,
                center_frequency_mhz=101,
                direction="Uplink",
                polarization="LHCP",
                name="examplename",
            )],
            two_line_elements=[
                "1 23455U 94089A   97320.90946019  .00000140  00000-0  10191-3 0  2621",
                "2 23455  99.0090 272.6745 0008546 223.1686 136.8816 14.11711747148495",
            ],
            title_line="AQUA",
            tags={
                "aks-managed-cluster-name": "9a57225d-a405-4d40-aa46-f13d2342abef",
            })
        example_virtual_network = azure.network.VirtualNetwork("exampleVirtualNetwork",
            address_spaces=["10.0.0.0/16"],
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name)
        example_subnet = azure.network.Subnet("exampleSubnet",
            resource_group_name=example_resource_group.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.1.0/24"],
            delegations=[azure.network.SubnetDelegationArgs(
                name="orbitalgateway",
                service_delegation=azure.network.SubnetDelegationServiceDelegationArgs(
                    name="Microsoft.Orbital/orbitalGateways",
                    actions=[
                        "Microsoft.Network/publicIPAddresses/join/action",
                        "Microsoft.Network/virtualNetworks/subnets/join/action",
                        "Microsoft.Network/virtualNetworks/read",
                        "Microsoft.Network/publicIPAddresses/read",
                    ],
                ),
            )])
        example_contact_profile = azure.orbital.ContactProfile("exampleContactProfile",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            minimum_variable_contact_duration="PT1M",
            auto_tracking="disabled",
            links=[azure.orbital.ContactProfileLinkArgs(
                channels=[azure.orbital.ContactProfileLinkChannelArgs(
                    name="channelname",
                    bandwidth_mhz=100,
                    center_frequency_mhz=101,
                    end_points=[azure.orbital.ContactProfileLinkChannelEndPointArgs(
                        end_point_name="AQUA_command",
                        ip_address="10.0.1.0",
                        port="49153",
                        protocol="TCP",
                    )],
                )],
                direction="Uplink",
                name="RHCP_UL",
                polarization="RHCP",
            )],
            network_configuration_subnet_id=example_subnet.id)
        example_contact = azure.orbital.Contact("exampleContact",
            spacecraft_id=example_spacecraft.id,
            reservation_start_time="2020-07-16T20:35:00.00Z",
            reservation_end_time="2020-07-16T20:55:00.00Z",
            ground_station_name="WESTUS2_0",
            contact_profile_id=example_contact_profile.id)
        ```

        ## Import

        Spacecraft can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:orbital/contact:Contact example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Orbital/spacecrafts/spacecraft1/contacts/contact1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] contact_profile_id: ID of the orbital contact profile. Changing this forces a new resource to be created.
        :param pulumi.Input[str] ground_station_name: Name of the Azure ground station. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] reservation_end_time: Reservation end time of the Contact. Changing this forces a new resource to be created.
        :param pulumi.Input[str] reservation_start_time: Reservation start time of the Contact. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spacecraft_id: The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ContactArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an orbital contact.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_spacecraft = azure.orbital.Spacecraft("exampleSpacecraft",
            resource_group_name=azurerm_resource_group["test"]["name"],
            location="westeurope",
            norad_id="12345",
            links=[azure.orbital.SpacecraftLinkArgs(
                bandwidth_mhz=100,
                center_frequency_mhz=101,
                direction="Uplink",
                polarization="LHCP",
                name="examplename",
            )],
            two_line_elements=[
                "1 23455U 94089A   97320.90946019  .00000140  00000-0  10191-3 0  2621",
                "2 23455  99.0090 272.6745 0008546 223.1686 136.8816 14.11711747148495",
            ],
            title_line="AQUA",
            tags={
                "aks-managed-cluster-name": "9a57225d-a405-4d40-aa46-f13d2342abef",
            })
        example_virtual_network = azure.network.VirtualNetwork("exampleVirtualNetwork",
            address_spaces=["10.0.0.0/16"],
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name)
        example_subnet = azure.network.Subnet("exampleSubnet",
            resource_group_name=example_resource_group.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.1.0/24"],
            delegations=[azure.network.SubnetDelegationArgs(
                name="orbitalgateway",
                service_delegation=azure.network.SubnetDelegationServiceDelegationArgs(
                    name="Microsoft.Orbital/orbitalGateways",
                    actions=[
                        "Microsoft.Network/publicIPAddresses/join/action",
                        "Microsoft.Network/virtualNetworks/subnets/join/action",
                        "Microsoft.Network/virtualNetworks/read",
                        "Microsoft.Network/publicIPAddresses/read",
                    ],
                ),
            )])
        example_contact_profile = azure.orbital.ContactProfile("exampleContactProfile",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            minimum_variable_contact_duration="PT1M",
            auto_tracking="disabled",
            links=[azure.orbital.ContactProfileLinkArgs(
                channels=[azure.orbital.ContactProfileLinkChannelArgs(
                    name="channelname",
                    bandwidth_mhz=100,
                    center_frequency_mhz=101,
                    end_points=[azure.orbital.ContactProfileLinkChannelEndPointArgs(
                        end_point_name="AQUA_command",
                        ip_address="10.0.1.0",
                        port="49153",
                        protocol="TCP",
                    )],
                )],
                direction="Uplink",
                name="RHCP_UL",
                polarization="RHCP",
            )],
            network_configuration_subnet_id=example_subnet.id)
        example_contact = azure.orbital.Contact("exampleContact",
            spacecraft_id=example_spacecraft.id,
            reservation_start_time="2020-07-16T20:35:00.00Z",
            reservation_end_time="2020-07-16T20:55:00.00Z",
            ground_station_name="WESTUS2_0",
            contact_profile_id=example_contact_profile.id)
        ```

        ## Import

        Spacecraft can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:orbital/contact:Contact example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Orbital/spacecrafts/spacecraft1/contacts/contact1
        ```

        :param str resource_name: The name of the resource.
        :param ContactArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ContactArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_profile_id: Optional[pulumi.Input[str]] = None,
                 ground_station_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 reservation_end_time: Optional[pulumi.Input[str]] = None,
                 reservation_start_time: Optional[pulumi.Input[str]] = None,
                 spacecraft_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ContactArgs.__new__(ContactArgs)

            if contact_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'contact_profile_id'")
            __props__.__dict__["contact_profile_id"] = contact_profile_id
            if ground_station_name is None and not opts.urn:
                raise TypeError("Missing required property 'ground_station_name'")
            __props__.__dict__["ground_station_name"] = ground_station_name
            __props__.__dict__["name"] = name
            if reservation_end_time is None and not opts.urn:
                raise TypeError("Missing required property 'reservation_end_time'")
            __props__.__dict__["reservation_end_time"] = reservation_end_time
            if reservation_start_time is None and not opts.urn:
                raise TypeError("Missing required property 'reservation_start_time'")
            __props__.__dict__["reservation_start_time"] = reservation_start_time
            if spacecraft_id is None and not opts.urn:
                raise TypeError("Missing required property 'spacecraft_id'")
            __props__.__dict__["spacecraft_id"] = spacecraft_id
        super(Contact, __self__).__init__(
            'azure:orbital/contact:Contact',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            contact_profile_id: Optional[pulumi.Input[str]] = None,
            ground_station_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            reservation_end_time: Optional[pulumi.Input[str]] = None,
            reservation_start_time: Optional[pulumi.Input[str]] = None,
            spacecraft_id: Optional[pulumi.Input[str]] = None) -> 'Contact':
        """
        Get an existing Contact resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] contact_profile_id: ID of the orbital contact profile. Changing this forces a new resource to be created.
        :param pulumi.Input[str] ground_station_name: Name of the Azure ground station. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] reservation_end_time: Reservation end time of the Contact. Changing this forces a new resource to be created.
        :param pulumi.Input[str] reservation_start_time: Reservation start time of the Contact. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spacecraft_id: The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ContactState.__new__(_ContactState)

        __props__.__dict__["contact_profile_id"] = contact_profile_id
        __props__.__dict__["ground_station_name"] = ground_station_name
        __props__.__dict__["name"] = name
        __props__.__dict__["reservation_end_time"] = reservation_end_time
        __props__.__dict__["reservation_start_time"] = reservation_start_time
        __props__.__dict__["spacecraft_id"] = spacecraft_id
        return Contact(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="contactProfileId")
    def contact_profile_id(self) -> pulumi.Output[str]:
        """
        ID of the orbital contact profile. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "contact_profile_id")

    @property
    @pulumi.getter(name="groundStationName")
    def ground_station_name(self) -> pulumi.Output[str]:
        """
        Name of the Azure ground station. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "ground_station_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="reservationEndTime")
    def reservation_end_time(self) -> pulumi.Output[str]:
        """
        Reservation end time of the Contact. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "reservation_end_time")

    @property
    @pulumi.getter(name="reservationStartTime")
    def reservation_start_time(self) -> pulumi.Output[str]:
        """
        Reservation start time of the Contact. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "reservation_start_time")

    @property
    @pulumi.getter(name="spacecraftId")
    def spacecraft_id(self) -> pulumi.Output[str]:
        """
        The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spacecraft_id")
