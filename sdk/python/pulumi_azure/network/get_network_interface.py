# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class GetNetworkInterfaceResult(object):
    """
    A collection of values returned by getNetworkInterface.
    """
    def __init__(__self__, applied_dns_servers=None, dns_servers=None, enable_accelerated_networking=None, enable_ip_forwarding=None, internal_dns_name_label=None, internal_fqdn=None, ip_configurations=None, location=None, mac_address=None, network_security_group_id=None, private_ip_address=None, private_ip_addresses=None, tags=None, virtual_machine_id=None, id=None):
        if applied_dns_servers and not isinstance(applied_dns_servers, list):
            raise TypeError('Expected argument applied_dns_servers to be a list')
        __self__.applied_dns_servers = applied_dns_servers
        """
        List of DNS servers applied to the specified Network Interface.
        """
        if dns_servers and not isinstance(dns_servers, list):
            raise TypeError('Expected argument dns_servers to be a list')
        __self__.dns_servers = dns_servers
        """
        The list of DNS servers used by the specified Network Interface.
        """
        if enable_accelerated_networking and not isinstance(enable_accelerated_networking, bool):
            raise TypeError('Expected argument enable_accelerated_networking to be a bool')
        __self__.enable_accelerated_networking = enable_accelerated_networking
        """
        Indicates if accelerated networking is set on the specified Network Interface.
        """
        if enable_ip_forwarding and not isinstance(enable_ip_forwarding, bool):
            raise TypeError('Expected argument enable_ip_forwarding to be a bool')
        __self__.enable_ip_forwarding = enable_ip_forwarding
        """
        Indicate if IP forwarding is set on the specified Network Interface.
        """
        if internal_dns_name_label and not isinstance(internal_dns_name_label, basestring):
            raise TypeError('Expected argument internal_dns_name_label to be a basestring')
        __self__.internal_dns_name_label = internal_dns_name_label
        """
        The internal dns name label of the specified Network Interface.
        """
        if internal_fqdn and not isinstance(internal_fqdn, basestring):
            raise TypeError('Expected argument internal_fqdn to be a basestring')
        __self__.internal_fqdn = internal_fqdn
        """
        The internal FQDN associated to the specified Network Interface.
        """
        if ip_configurations and not isinstance(ip_configurations, list):
            raise TypeError('Expected argument ip_configurations to be a list')
        __self__.ip_configurations = ip_configurations
        """
        One or more `ip_configuration` blocks as defined below.
        """
        if location and not isinstance(location, basestring):
            raise TypeError('Expected argument location to be a basestring')
        __self__.location = location
        """
        The location of the specified Network Interface.
        """
        if mac_address and not isinstance(mac_address, basestring):
            raise TypeError('Expected argument mac_address to be a basestring')
        __self__.mac_address = mac_address
        """
        The MAC address used by the specified Network Interface.
        """
        if network_security_group_id and not isinstance(network_security_group_id, basestring):
            raise TypeError('Expected argument network_security_group_id to be a basestring')
        __self__.network_security_group_id = network_security_group_id
        """
        The ID of the network security group associated to the specified Network Interface.
        """
        if private_ip_address and not isinstance(private_ip_address, basestring):
            raise TypeError('Expected argument private_ip_address to be a basestring')
        __self__.private_ip_address = private_ip_address
        """
        The Private IP Address assigned to this Network Interface.
        """
        if private_ip_addresses and not isinstance(private_ip_addresses, list):
            raise TypeError('Expected argument private_ip_addresses to be a list')
        __self__.private_ip_addresses = private_ip_addresses
        """
        The list of private ip addresses associates to the specified Network Interface.
        """
        if tags and not isinstance(tags, dict):
            raise TypeError('Expected argument tags to be a dict')
        __self__.tags = tags
        """
        List the tags associated to the specified Network Interface.
        """
        if virtual_machine_id and not isinstance(virtual_machine_id, basestring):
            raise TypeError('Expected argument virtual_machine_id to be a basestring')
        __self__.virtual_machine_id = virtual_machine_id
        """
        The ID of the virtual machine that the specified Network Interface is attached to.
        """
        if id and not isinstance(id, basestring):
            raise TypeError('Expected argument id to be a basestring')
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """

def get_network_interface(name=None, resource_group_name=None):
    """
    Use this data source to access the properties of an Azure Network Interface.
    """
    __args__ = dict()

    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __ret__ = pulumi.runtime.invoke('azure:network/getNetworkInterface:getNetworkInterface', __args__)

    return GetNetworkInterfaceResult(
        applied_dns_servers=__ret__.get('appliedDnsServers'),
        dns_servers=__ret__.get('dnsServers'),
        enable_accelerated_networking=__ret__.get('enableAcceleratedNetworking'),
        enable_ip_forwarding=__ret__.get('enableIpForwarding'),
        internal_dns_name_label=__ret__.get('internalDnsNameLabel'),
        internal_fqdn=__ret__.get('internalFqdn'),
        ip_configurations=__ret__.get('ipConfigurations'),
        location=__ret__.get('location'),
        mac_address=__ret__.get('macAddress'),
        network_security_group_id=__ret__.get('networkSecurityGroupId'),
        private_ip_address=__ret__.get('privateIpAddress'),
        private_ip_addresses=__ret__.get('privateIpAddresses'),
        tags=__ret__.get('tags'),
        virtual_machine_id=__ret__.get('virtualMachineId'),
        id=__ret__.get('id'))