// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Manages a Microsoft SQL Azure Managed Instance.
 *
 * > **Note:** All arguments including the administrator login and password will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleNetworkSecurityGroup = new azure.network.NetworkSecurityGroup("exampleNetworkSecurityGroup", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const allowManagementInbound = new azure.network.NetworkSecurityRule("allowManagementInbound", {
 *     priority: 106,
 *     direction: "Inbound",
 *     access: "Allow",
 *     protocol: "Tcp",
 *     sourcePortRange: "*",
 *     destinationPortRanges: [
 *         "9000",
 *         "9003",
 *         "1438",
 *         "1440",
 *         "1452",
 *     ],
 *     sourceAddressPrefix: "*",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const allowMisubnetInbound = new azure.network.NetworkSecurityRule("allowMisubnetInbound", {
 *     priority: 200,
 *     direction: "Inbound",
 *     access: "Allow",
 *     protocol: "*",
 *     sourcePortRange: "*",
 *     destinationPortRange: "*",
 *     sourceAddressPrefix: "10.0.0.0/24",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const allowHealthProbeInbound = new azure.network.NetworkSecurityRule("allowHealthProbeInbound", {
 *     priority: 300,
 *     direction: "Inbound",
 *     access: "Allow",
 *     protocol: "*",
 *     sourcePortRange: "*",
 *     destinationPortRange: "*",
 *     sourceAddressPrefix: "AzureLoadBalancer",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const allowTdsInbound = new azure.network.NetworkSecurityRule("allowTdsInbound", {
 *     priority: 1000,
 *     direction: "Inbound",
 *     access: "Allow",
 *     protocol: "Tcp",
 *     sourcePortRange: "*",
 *     destinationPortRange: "1433",
 *     sourceAddressPrefix: "VirtualNetwork",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const denyAllInbound = new azure.network.NetworkSecurityRule("denyAllInbound", {
 *     priority: 4096,
 *     direction: "Inbound",
 *     access: "Deny",
 *     protocol: "*",
 *     sourcePortRange: "*",
 *     destinationPortRange: "*",
 *     sourceAddressPrefix: "*",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const allowManagementOutbound = new azure.network.NetworkSecurityRule("allowManagementOutbound", {
 *     priority: 102,
 *     direction: "Outbound",
 *     access: "Allow",
 *     protocol: "Tcp",
 *     sourcePortRange: "*",
 *     destinationPortRanges: [
 *         "80",
 *         "443",
 *         "12000",
 *     ],
 *     sourceAddressPrefix: "*",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const allowMisubnetOutbound = new azure.network.NetworkSecurityRule("allowMisubnetOutbound", {
 *     priority: 200,
 *     direction: "Outbound",
 *     access: "Allow",
 *     protocol: "*",
 *     sourcePortRange: "*",
 *     destinationPortRange: "*",
 *     sourceAddressPrefix: "10.0.0.0/24",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const denyAllOutbound = new azure.network.NetworkSecurityRule("denyAllOutbound", {
 *     priority: 4096,
 *     direction: "Outbound",
 *     access: "Deny",
 *     protocol: "*",
 *     sourcePortRange: "*",
 *     destinationPortRange: "*",
 *     sourceAddressPrefix: "*",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("exampleVirtualNetwork", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: exampleResourceGroup.location,
 * });
 * const exampleSubnet = new azure.network.Subnet("exampleSubnet", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefix: "10.0.0.0/24",
 *     delegations: [{
 *         name: "managedinstancedelegation",
 *         serviceDelegation: {
 *             name: "Microsoft.Sql/managedInstances",
 *             actions: [
 *                 "Microsoft.Network/virtualNetworks/subnets/join/action",
 *                 "Microsoft.Network/virtualNetworks/subnets/prepareNetworkPolicies/action",
 *                 "Microsoft.Network/virtualNetworks/subnets/unprepareNetworkPolicies/action",
 *             ],
 *         },
 *     }],
 * });
 * const exampleSubnetNetworkSecurityGroupAssociation = new azure.network.SubnetNetworkSecurityGroupAssociation("exampleSubnetNetworkSecurityGroupAssociation", {
 *     subnetId: exampleSubnet.id,
 *     networkSecurityGroupId: exampleNetworkSecurityGroup.id,
 * });
 * const exampleRouteTable = new azure.network.RouteTable("exampleRouteTable", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     disableBgpRoutePropagation: false,
 * }, {
 *     dependsOn: [exampleSubnet],
 * });
 * const exampleSubnetRouteTableAssociation = new azure.network.SubnetRouteTableAssociation("exampleSubnetRouteTableAssociation", {
 *     subnetId: exampleSubnet.id,
 *     routeTableId: exampleRouteTable.id,
 * });
 * const exampleManagedInstance = new azure.mssql.ManagedInstance("exampleManagedInstance", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     licenseType: "BasePrice",
 *     skuName: "GP_Gen5",
 *     storageSizeInGb: 32,
 *     subnetId: exampleSubnet.id,
 *     vcores: 4,
 *     administratorLogin: "mradministrator",
 *     administratorLoginPassword: "thisIsDog11",
 * }, {
 *     dependsOn: [
 *         exampleSubnetNetworkSecurityGroupAssociation,
 *         exampleSubnetRouteTableAssociation,
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Microsoft SQL Managed Instances can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:mssql/managedInstance:ManagedInstance example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/managedInstances/myserver
 * ```
 */
export class ManagedInstance extends pulumi.CustomResource {
    /**
     * Get an existing ManagedInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedInstanceState, opts?: pulumi.CustomResourceOptions): ManagedInstance {
        return new ManagedInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mssql/managedInstance:ManagedInstance';

    /**
     * Returns true if the given object is an instance of ManagedInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedInstance.__pulumiType;
    }

    /**
     * The administrator login name for the new SQL Managed Instance. Changing this forces a new resource to be created.
     */
    public readonly administratorLogin!: pulumi.Output<string>;
    /**
     * The password associated with the `administratorLogin` user. Needs to comply with Azure's [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx)
     */
    public readonly administratorLoginPassword!: pulumi.Output<string>;
    /**
     * Specifies how the SQL Managed Instance will be collated. Default value is `SQL_Latin1_General_CP1_CI_AS`. Changing this forces a new resource to be created.
     */
    public readonly collation!: pulumi.Output<string | undefined>;
    /**
     * The ID of the SQL Managed Instance which will share the DNS zone. This is a prerequisite for creating an `azurermManagedInstanceFailoverGroup`. Setting this after creation forces a new resource to be created.
     */
    public readonly dnsZonePartnerId!: pulumi.Output<string | undefined>;
    /**
     * The fully qualified domain name of the Azure Managed SQL Instance
     */
    public /*out*/ readonly fqdn!: pulumi.Output<string>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.mssql.ManagedInstanceIdentity | undefined>;
    /**
     * What type of license the Managed Instance will use. Valid values include can be `PriceIncluded` or `BasePrice`.
     */
    public readonly licenseType!: pulumi.Output<string>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The Minimum TLS Version. Default value is `1.2` Valid values include `1.0`, `1.1`, `1.2`.
     */
    public readonly minimumTlsVersion!: pulumi.Output<string | undefined>;
    /**
     * The name of the SQL Managed Instance. This needs to be globally unique within Azure.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies how the SQL Managed Instance will be accessed. Default value is `Default`. Valid values include `Default`, `Proxy`, and `Redirect`.
     */
    public readonly proxyOverride!: pulumi.Output<string | undefined>;
    /**
     * Is the public data endpoint enabled? Default value is `false`.
     */
    public readonly publicDataEndpointEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the resource group in which to create the SQL Managed Instance.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Specifies the SKU Name for the SQL Managed Instance. Valid values include `GP_Gen4`, `GP_Gen5`, `GP_G8IM`, `GP_G8IH`, `BC_Gen4`, `BC_Gen5`, `BC_G8IM` or `BC_G8IH`.
     */
    public readonly skuName!: pulumi.Output<string>;
    /**
     * Specifies the storage account type used to store backups for this database. Changing this forces a new resource to be created. Possible values are `GRS`, `LRS` and `ZRS`. The default value is `GRS`.
     */
    public readonly storageAccountType!: pulumi.Output<string | undefined>;
    /**
     * Maximum storage space for the SQL Managed instance. This should be a multiple of 32 (GB).
     */
    public readonly storageSizeInGb!: pulumi.Output<number>;
    /**
     * The subnet resource id that the SQL Managed Instance will be associated with.
     */
    public readonly subnetId!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The TimeZone ID that the SQL Managed Instance will be operating in. Default value is `UTC`. Changing this forces a new resource to be created.
     */
    public readonly timezoneId!: pulumi.Output<string | undefined>;
    /**
     * Number of cores that should be assigned to the SQL Managed Instance. Values can be `8`, `16`, or `24` for Gen4 SKUs, or `8`, `16`, `24`, `32`, or `40` for Gen5 SKUs.
     */
    public readonly vcores!: pulumi.Output<number>;

    /**
     * Create a ManagedInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedInstanceArgs | ManagedInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedInstanceState | undefined;
            resourceInputs["administratorLogin"] = state ? state.administratorLogin : undefined;
            resourceInputs["administratorLoginPassword"] = state ? state.administratorLoginPassword : undefined;
            resourceInputs["collation"] = state ? state.collation : undefined;
            resourceInputs["dnsZonePartnerId"] = state ? state.dnsZonePartnerId : undefined;
            resourceInputs["fqdn"] = state ? state.fqdn : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["licenseType"] = state ? state.licenseType : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["minimumTlsVersion"] = state ? state.minimumTlsVersion : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["proxyOverride"] = state ? state.proxyOverride : undefined;
            resourceInputs["publicDataEndpointEnabled"] = state ? state.publicDataEndpointEnabled : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["skuName"] = state ? state.skuName : undefined;
            resourceInputs["storageAccountType"] = state ? state.storageAccountType : undefined;
            resourceInputs["storageSizeInGb"] = state ? state.storageSizeInGb : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["timezoneId"] = state ? state.timezoneId : undefined;
            resourceInputs["vcores"] = state ? state.vcores : undefined;
        } else {
            const args = argsOrState as ManagedInstanceArgs | undefined;
            if ((!args || args.administratorLogin === undefined) && !opts.urn) {
                throw new Error("Missing required property 'administratorLogin'");
            }
            if ((!args || args.administratorLoginPassword === undefined) && !opts.urn) {
                throw new Error("Missing required property 'administratorLoginPassword'");
            }
            if ((!args || args.licenseType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'licenseType'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.skuName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'skuName'");
            }
            if ((!args || args.storageSizeInGb === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageSizeInGb'");
            }
            if ((!args || args.subnetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetId'");
            }
            if ((!args || args.vcores === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vcores'");
            }
            resourceInputs["administratorLogin"] = args ? args.administratorLogin : undefined;
            resourceInputs["administratorLoginPassword"] = args ? args.administratorLoginPassword : undefined;
            resourceInputs["collation"] = args ? args.collation : undefined;
            resourceInputs["dnsZonePartnerId"] = args ? args.dnsZonePartnerId : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["licenseType"] = args ? args.licenseType : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["minimumTlsVersion"] = args ? args.minimumTlsVersion : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["proxyOverride"] = args ? args.proxyOverride : undefined;
            resourceInputs["publicDataEndpointEnabled"] = args ? args.publicDataEndpointEnabled : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["skuName"] = args ? args.skuName : undefined;
            resourceInputs["storageAccountType"] = args ? args.storageAccountType : undefined;
            resourceInputs["storageSizeInGb"] = args ? args.storageSizeInGb : undefined;
            resourceInputs["subnetId"] = args ? args.subnetId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["timezoneId"] = args ? args.timezoneId : undefined;
            resourceInputs["vcores"] = args ? args.vcores : undefined;
            resourceInputs["fqdn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagedInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedInstance resources.
 */
export interface ManagedInstanceState {
    /**
     * The administrator login name for the new SQL Managed Instance. Changing this forces a new resource to be created.
     */
    administratorLogin?: pulumi.Input<string>;
    /**
     * The password associated with the `administratorLogin` user. Needs to comply with Azure's [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx)
     */
    administratorLoginPassword?: pulumi.Input<string>;
    /**
     * Specifies how the SQL Managed Instance will be collated. Default value is `SQL_Latin1_General_CP1_CI_AS`. Changing this forces a new resource to be created.
     */
    collation?: pulumi.Input<string>;
    /**
     * The ID of the SQL Managed Instance which will share the DNS zone. This is a prerequisite for creating an `azurermManagedInstanceFailoverGroup`. Setting this after creation forces a new resource to be created.
     */
    dnsZonePartnerId?: pulumi.Input<string>;
    /**
     * The fully qualified domain name of the Azure Managed SQL Instance
     */
    fqdn?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.mssql.ManagedInstanceIdentity>;
    /**
     * What type of license the Managed Instance will use. Valid values include can be `PriceIncluded` or `BasePrice`.
     */
    licenseType?: pulumi.Input<string>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The Minimum TLS Version. Default value is `1.2` Valid values include `1.0`, `1.1`, `1.2`.
     */
    minimumTlsVersion?: pulumi.Input<string>;
    /**
     * The name of the SQL Managed Instance. This needs to be globally unique within Azure.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies how the SQL Managed Instance will be accessed. Default value is `Default`. Valid values include `Default`, `Proxy`, and `Redirect`.
     */
    proxyOverride?: pulumi.Input<string>;
    /**
     * Is the public data endpoint enabled? Default value is `false`.
     */
    publicDataEndpointEnabled?: pulumi.Input<boolean>;
    /**
     * The name of the resource group in which to create the SQL Managed Instance.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Specifies the SKU Name for the SQL Managed Instance. Valid values include `GP_Gen4`, `GP_Gen5`, `GP_G8IM`, `GP_G8IH`, `BC_Gen4`, `BC_Gen5`, `BC_G8IM` or `BC_G8IH`.
     */
    skuName?: pulumi.Input<string>;
    /**
     * Specifies the storage account type used to store backups for this database. Changing this forces a new resource to be created. Possible values are `GRS`, `LRS` and `ZRS`. The default value is `GRS`.
     */
    storageAccountType?: pulumi.Input<string>;
    /**
     * Maximum storage space for the SQL Managed instance. This should be a multiple of 32 (GB).
     */
    storageSizeInGb?: pulumi.Input<number>;
    /**
     * The subnet resource id that the SQL Managed Instance will be associated with.
     */
    subnetId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The TimeZone ID that the SQL Managed Instance will be operating in. Default value is `UTC`. Changing this forces a new resource to be created.
     */
    timezoneId?: pulumi.Input<string>;
    /**
     * Number of cores that should be assigned to the SQL Managed Instance. Values can be `8`, `16`, or `24` for Gen4 SKUs, or `8`, `16`, `24`, `32`, or `40` for Gen5 SKUs.
     */
    vcores?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ManagedInstance resource.
 */
export interface ManagedInstanceArgs {
    /**
     * The administrator login name for the new SQL Managed Instance. Changing this forces a new resource to be created.
     */
    administratorLogin: pulumi.Input<string>;
    /**
     * The password associated with the `administratorLogin` user. Needs to comply with Azure's [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx)
     */
    administratorLoginPassword: pulumi.Input<string>;
    /**
     * Specifies how the SQL Managed Instance will be collated. Default value is `SQL_Latin1_General_CP1_CI_AS`. Changing this forces a new resource to be created.
     */
    collation?: pulumi.Input<string>;
    /**
     * The ID of the SQL Managed Instance which will share the DNS zone. This is a prerequisite for creating an `azurermManagedInstanceFailoverGroup`. Setting this after creation forces a new resource to be created.
     */
    dnsZonePartnerId?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.mssql.ManagedInstanceIdentity>;
    /**
     * What type of license the Managed Instance will use. Valid values include can be `PriceIncluded` or `BasePrice`.
     */
    licenseType: pulumi.Input<string>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The Minimum TLS Version. Default value is `1.2` Valid values include `1.0`, `1.1`, `1.2`.
     */
    minimumTlsVersion?: pulumi.Input<string>;
    /**
     * The name of the SQL Managed Instance. This needs to be globally unique within Azure.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies how the SQL Managed Instance will be accessed. Default value is `Default`. Valid values include `Default`, `Proxy`, and `Redirect`.
     */
    proxyOverride?: pulumi.Input<string>;
    /**
     * Is the public data endpoint enabled? Default value is `false`.
     */
    publicDataEndpointEnabled?: pulumi.Input<boolean>;
    /**
     * The name of the resource group in which to create the SQL Managed Instance.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Specifies the SKU Name for the SQL Managed Instance. Valid values include `GP_Gen4`, `GP_Gen5`, `GP_G8IM`, `GP_G8IH`, `BC_Gen4`, `BC_Gen5`, `BC_G8IM` or `BC_G8IH`.
     */
    skuName: pulumi.Input<string>;
    /**
     * Specifies the storage account type used to store backups for this database. Changing this forces a new resource to be created. Possible values are `GRS`, `LRS` and `ZRS`. The default value is `GRS`.
     */
    storageAccountType?: pulumi.Input<string>;
    /**
     * Maximum storage space for the SQL Managed instance. This should be a multiple of 32 (GB).
     */
    storageSizeInGb: pulumi.Input<number>;
    /**
     * The subnet resource id that the SQL Managed Instance will be associated with.
     */
    subnetId: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The TimeZone ID that the SQL Managed Instance will be operating in. Default value is `UTC`. Changing this forces a new resource to be created.
     */
    timezoneId?: pulumi.Input<string>;
    /**
     * Number of cores that should be assigned to the SQL Managed Instance. Values can be `8`, `16`, or `24` for Gen4 SKUs, or `8`, `16`, `24`, `32`, or `40` for Gen5 SKUs.
     */
    vcores: pulumi.Input<number>;
}