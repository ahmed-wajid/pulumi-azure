// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "azure:network/applicationGateway:ApplicationGateway":
		r = &ApplicationGateway{}
	case "azure:network/applicationSecurityGroup:ApplicationSecurityGroup":
		r = &ApplicationSecurityGroup{}
	case "azure:network/bgpConnection:BgpConnection":
		r = &BgpConnection{}
	case "azure:network/ddosProtectionPlan:DdosProtectionPlan":
		r = &DdosProtectionPlan{}
	case "azure:network/expressRouteCircuit:ExpressRouteCircuit":
		r = &ExpressRouteCircuit{}
	case "azure:network/expressRouteCircuitAuthorization:ExpressRouteCircuitAuthorization":
		r = &ExpressRouteCircuitAuthorization{}
	case "azure:network/expressRouteCircuitPeering:ExpressRouteCircuitPeering":
		r = &ExpressRouteCircuitPeering{}
	case "azure:network/expressRouteGateway:ExpressRouteGateway":
		r = &ExpressRouteGateway{}
	case "azure:network/expressRoutePort:ExpressRoutePort":
		r = &ExpressRoutePort{}
	case "azure:network/firewall:Firewall":
		r = &Firewall{}
	case "azure:network/firewallApplicationRuleCollection:FirewallApplicationRuleCollection":
		r = &FirewallApplicationRuleCollection{}
	case "azure:network/firewallNatRuleCollection:FirewallNatRuleCollection":
		r = &FirewallNatRuleCollection{}
	case "azure:network/firewallNetworkRuleCollection:FirewallNetworkRuleCollection":
		r = &FirewallNetworkRuleCollection{}
	case "azure:network/firewallPolicy:FirewallPolicy":
		r = &FirewallPolicy{}
	case "azure:network/firewallPolicyRuleCollectionGroup:FirewallPolicyRuleCollectionGroup":
		r = &FirewallPolicyRuleCollectionGroup{}
	case "azure:network/iPGroup:IPGroup":
		r = &IPGroup{}
	case "azure:network/localNetworkGateway:LocalNetworkGateway":
		r = &LocalNetworkGateway{}
	case "azure:network/natGateway:NatGateway":
		r = &NatGateway{}
	case "azure:network/natGatewayPublicIpAssociation:NatGatewayPublicIpAssociation":
		r = &NatGatewayPublicIpAssociation{}
	case "azure:network/networkConnectionMonitor:NetworkConnectionMonitor":
		r = &NetworkConnectionMonitor{}
	case "azure:network/networkInterface:NetworkInterface":
		r = &NetworkInterface{}
	case "azure:network/networkInterfaceApplicationGatewayBackendAddressPoolAssociation:NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation":
		r = &NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation{}
	case "azure:network/networkInterfaceApplicationSecurityGroupAssociation:NetworkInterfaceApplicationSecurityGroupAssociation":
		r = &NetworkInterfaceApplicationSecurityGroupAssociation{}
	case "azure:network/networkInterfaceBackendAddressPoolAssociation:NetworkInterfaceBackendAddressPoolAssociation":
		r = &NetworkInterfaceBackendAddressPoolAssociation{}
	case "azure:network/networkInterfaceNatRuleAssociation:NetworkInterfaceNatRuleAssociation":
		r = &NetworkInterfaceNatRuleAssociation{}
	case "azure:network/networkInterfaceSecurityGroupAssociation:NetworkInterfaceSecurityGroupAssociation":
		r = &NetworkInterfaceSecurityGroupAssociation{}
	case "azure:network/networkPacketCapture:NetworkPacketCapture":
		r = &NetworkPacketCapture{}
	case "azure:network/networkSecurityGroup:NetworkSecurityGroup":
		r = &NetworkSecurityGroup{}
	case "azure:network/networkSecurityRule:NetworkSecurityRule":
		r = &NetworkSecurityRule{}
	case "azure:network/networkWatcher:NetworkWatcher":
		r = &NetworkWatcher{}
	case "azure:network/networkWatcherFlowLog:NetworkWatcherFlowLog":
		r = &NetworkWatcherFlowLog{}
	case "azure:network/packetCapture:PacketCapture":
		r = &PacketCapture{}
	case "azure:network/pointToPointVpnGateway:PointToPointVpnGateway":
		r = &PointToPointVpnGateway{}
	case "azure:network/profile:Profile":
		r = &Profile{}
	case "azure:network/publicIp:PublicIp":
		r = &PublicIp{}
	case "azure:network/publicIpPrefix:PublicIpPrefix":
		r = &PublicIpPrefix{}
	case "azure:network/route:Route":
		r = &Route{}
	case "azure:network/routeFilter:RouteFilter":
		r = &RouteFilter{}
	case "azure:network/routeTable:RouteTable":
		r = &RouteTable{}
	case "azure:network/securityPartnerProvider:SecurityPartnerProvider":
		r = &SecurityPartnerProvider{}
	case "azure:network/subnet:Subnet":
		r = &Subnet{}
	case "azure:network/subnetNatGatewayAssociation:SubnetNatGatewayAssociation":
		r = &SubnetNatGatewayAssociation{}
	case "azure:network/subnetNetworkSecurityGroupAssociation:SubnetNetworkSecurityGroupAssociation":
		r = &SubnetNetworkSecurityGroupAssociation{}
	case "azure:network/subnetRouteTableAssociation:SubnetRouteTableAssociation":
		r = &SubnetRouteTableAssociation{}
	case "azure:network/subnetServiceEndpointStoragePolicy:SubnetServiceEndpointStoragePolicy":
		r = &SubnetServiceEndpointStoragePolicy{}
	case "azure:network/trafficManagerEndpoint:TrafficManagerEndpoint":
		r = &TrafficManagerEndpoint{}
	case "azure:network/trafficManagerProfile:TrafficManagerProfile":
		r = &TrafficManagerProfile{}
	case "azure:network/virtualHub:VirtualHub":
		r = &VirtualHub{}
	case "azure:network/virtualHubConnection:VirtualHubConnection":
		r = &VirtualHubConnection{}
	case "azure:network/virtualHubIp:VirtualHubIp":
		r = &VirtualHubIp{}
	case "azure:network/virtualHubRouteTable:VirtualHubRouteTable":
		r = &VirtualHubRouteTable{}
	case "azure:network/virtualNetwork:VirtualNetwork":
		r = &VirtualNetwork{}
	case "azure:network/virtualNetworkGateway:VirtualNetworkGateway":
		r = &VirtualNetworkGateway{}
	case "azure:network/virtualNetworkGatewayConnection:VirtualNetworkGatewayConnection":
		r = &VirtualNetworkGatewayConnection{}
	case "azure:network/virtualNetworkPeering:VirtualNetworkPeering":
		r = &VirtualNetworkPeering{}
	case "azure:network/virtualWan:VirtualWan":
		r = &VirtualWan{}
	case "azure:network/vpnGateway:VpnGateway":
		r = &VpnGateway{}
	case "azure:network/vpnGatewayConnection:VpnGatewayConnection":
		r = &VpnGatewayConnection{}
	case "azure:network/vpnServerConfiguration:VpnServerConfiguration":
		r = &VpnServerConfiguration{}
	case "azure:network/vpnSite:VpnSite":
		r = &VpnSite{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := azure.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"azure",
		"network/applicationGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/applicationSecurityGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/bgpConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/ddosProtectionPlan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/expressRouteCircuit",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/expressRouteCircuitAuthorization",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/expressRouteCircuitPeering",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/expressRouteGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/expressRoutePort",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/firewall",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/firewallApplicationRuleCollection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/firewallNatRuleCollection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/firewallNetworkRuleCollection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/firewallPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/firewallPolicyRuleCollectionGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/iPGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/localNetworkGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/natGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/natGatewayPublicIpAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkConnectionMonitor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkInterface",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkInterfaceApplicationGatewayBackendAddressPoolAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkInterfaceApplicationSecurityGroupAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkInterfaceBackendAddressPoolAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkInterfaceNatRuleAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkInterfaceSecurityGroupAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkPacketCapture",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkSecurityGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkSecurityRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkWatcher",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/networkWatcherFlowLog",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/packetCapture",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/pointToPointVpnGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/profile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/publicIp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/publicIpPrefix",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/route",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/routeFilter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/routeTable",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/securityPartnerProvider",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/subnet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/subnetNatGatewayAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/subnetNetworkSecurityGroupAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/subnetRouteTableAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/subnetServiceEndpointStoragePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/trafficManagerEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/trafficManagerProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/virtualHub",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/virtualHubConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/virtualHubIp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/virtualHubRouteTable",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/virtualNetwork",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/virtualNetworkGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/virtualNetworkGatewayConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/virtualNetworkPeering",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/virtualWan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/vpnGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/vpnGatewayConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/vpnServerConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"network/vpnSite",
		&module{version},
	)
}