// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Manages an External Endpoint within a Traffic Manager Profile.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleTrafficManagerProfile = new azure.network.TrafficManagerProfile("exampleTrafficManagerProfile", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     trafficRoutingMethod: "Weighted",
 *     dnsConfig: {
 *         relativeName: "example-profile",
 *         ttl: 100,
 *     },
 *     monitorConfig: {
 *         protocol: "http",
 *         port: 80,
 *         path: "/",
 *         intervalInSeconds: 30,
 *         timeoutInSeconds: 9,
 *         toleratedNumberOfFailures: 3,
 *     },
 *     tags: {
 *         environment: "Production",
 *     },
 * });
 * const exampleTrafficManagerExternalEndpoint = new azure.network.TrafficManagerExternalEndpoint("exampleTrafficManagerExternalEndpoint", {
 *     profileId: exampleTrafficManagerProfile.id,
 *     weight: 100,
 *     target: "www.example.com",
 * });
 * ```
 *
 * ## Import
 *
 * External Endpoints can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:network/trafficManagerExternalEndpoint:TrafficManagerExternalEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-group/providers/Microsoft.Network/trafficManagerProfiles/example-profile/ExternalEndpoints/example-endpoint
 * ```
 */
export class TrafficManagerExternalEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing TrafficManagerExternalEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TrafficManagerExternalEndpointState, opts?: pulumi.CustomResourceOptions): TrafficManagerExternalEndpoint {
        return new TrafficManagerExternalEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:network/trafficManagerExternalEndpoint:TrafficManagerExternalEndpoint';

    /**
     * Returns true if the given object is an instance of TrafficManagerExternalEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TrafficManagerExternalEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TrafficManagerExternalEndpoint.__pulumiType;
    }

    /**
     * One or more `customHeader` blocks as defined below.
     */
    public readonly customHeaders!: pulumi.Output<outputs.network.TrafficManagerExternalEndpointCustomHeader[] | undefined>;
    /**
     * Is the endpoint enabled? Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    public readonly endpointLocation!: pulumi.Output<string>;
    /**
     * A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/en-us/rest/api/trafficmanager/geographichierarchies/getdefault).
     */
    public readonly geoMappings!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the External Endpoint. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the priority of this Endpoint, this must be
     * specified for Profiles using the `Priority` traffic routing method. Supports
     * values between 1 and 1000, with no Endpoints sharing the same value. If
     * omitted the value will be computed in order of creation.
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
     */
    public readonly profileId!: pulumi.Output<string>;
    /**
     * One or more `subnet` blocks as defined below
     */
    public readonly subnets!: pulumi.Output<outputs.network.TrafficManagerExternalEndpointSubnet[] | undefined>;
    /**
     * The FQDN DNS name of the target.
     */
    public readonly target!: pulumi.Output<string>;
    /**
     * Specifies how much traffic should be distributed to this
     * endpoint. Valid values are between `1` and `1000`.
     */
    public readonly weight!: pulumi.Output<number>;

    /**
     * Create a TrafficManagerExternalEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TrafficManagerExternalEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TrafficManagerExternalEndpointArgs | TrafficManagerExternalEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TrafficManagerExternalEndpointState | undefined;
            resourceInputs["customHeaders"] = state ? state.customHeaders : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["endpointLocation"] = state ? state.endpointLocation : undefined;
            resourceInputs["geoMappings"] = state ? state.geoMappings : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["profileId"] = state ? state.profileId : undefined;
            resourceInputs["subnets"] = state ? state.subnets : undefined;
            resourceInputs["target"] = state ? state.target : undefined;
            resourceInputs["weight"] = state ? state.weight : undefined;
        } else {
            const args = argsOrState as TrafficManagerExternalEndpointArgs | undefined;
            if ((!args || args.profileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'profileId'");
            }
            if ((!args || args.target === undefined) && !opts.urn) {
                throw new Error("Missing required property 'target'");
            }
            if ((!args || args.weight === undefined) && !opts.urn) {
                throw new Error("Missing required property 'weight'");
            }
            resourceInputs["customHeaders"] = args ? args.customHeaders : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["endpointLocation"] = args ? args.endpointLocation : undefined;
            resourceInputs["geoMappings"] = args ? args.geoMappings : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["profileId"] = args ? args.profileId : undefined;
            resourceInputs["subnets"] = args ? args.subnets : undefined;
            resourceInputs["target"] = args ? args.target : undefined;
            resourceInputs["weight"] = args ? args.weight : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TrafficManagerExternalEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TrafficManagerExternalEndpoint resources.
 */
export interface TrafficManagerExternalEndpointState {
    /**
     * One or more `customHeader` blocks as defined below.
     */
    customHeaders?: pulumi.Input<pulumi.Input<inputs.network.TrafficManagerExternalEndpointCustomHeader>[]>;
    /**
     * Is the endpoint enabled? Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    endpointLocation?: pulumi.Input<string>;
    /**
     * A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/en-us/rest/api/trafficmanager/geographichierarchies/getdefault).
     */
    geoMappings?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the External Endpoint. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the priority of this Endpoint, this must be
     * specified for Profiles using the `Priority` traffic routing method. Supports
     * values between 1 and 1000, with no Endpoints sharing the same value. If
     * omitted the value will be computed in order of creation.
     */
    priority?: pulumi.Input<number>;
    /**
     * The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
     */
    profileId?: pulumi.Input<string>;
    /**
     * One or more `subnet` blocks as defined below
     */
    subnets?: pulumi.Input<pulumi.Input<inputs.network.TrafficManagerExternalEndpointSubnet>[]>;
    /**
     * The FQDN DNS name of the target.
     */
    target?: pulumi.Input<string>;
    /**
     * Specifies how much traffic should be distributed to this
     * endpoint. Valid values are between `1` and `1000`.
     */
    weight?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a TrafficManagerExternalEndpoint resource.
 */
export interface TrafficManagerExternalEndpointArgs {
    /**
     * One or more `customHeader` blocks as defined below.
     */
    customHeaders?: pulumi.Input<pulumi.Input<inputs.network.TrafficManagerExternalEndpointCustomHeader>[]>;
    /**
     * Is the endpoint enabled? Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    endpointLocation?: pulumi.Input<string>;
    /**
     * A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/en-us/rest/api/trafficmanager/geographichierarchies/getdefault).
     */
    geoMappings?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the External Endpoint. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the priority of this Endpoint, this must be
     * specified for Profiles using the `Priority` traffic routing method. Supports
     * values between 1 and 1000, with no Endpoints sharing the same value. If
     * omitted the value will be computed in order of creation.
     */
    priority?: pulumi.Input<number>;
    /**
     * The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
     */
    profileId: pulumi.Input<string>;
    /**
     * One or more `subnet` blocks as defined below
     */
    subnets?: pulumi.Input<pulumi.Input<inputs.network.TrafficManagerExternalEndpointSubnet>[]>;
    /**
     * The FQDN DNS name of the target.
     */
    target: pulumi.Input<string>;
    /**
     * Specifies how much traffic should be distributed to this
     * endpoint. Valid values are between `1` and `1000`.
     */
    weight: pulumi.Input<number>;
}