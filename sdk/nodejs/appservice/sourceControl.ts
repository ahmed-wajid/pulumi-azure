// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Manages an App Service Web App or Function App Source Control Configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleServicePlan = new azure.appservice.ServicePlan("exampleServicePlan", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     osType: "Linux",
 *     skuName: "P1v2",
 * });
 * const exampleLinuxWebApp = new azure.appservice.LinuxWebApp("exampleLinuxWebApp", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleServicePlan.location,
 *     servicePlanId: exampleServicePlan.id,
 *     siteConfig: {},
 * });
 * const exampleSourceControl = new azure.appservice.SourceControl("exampleSourceControl", {
 *     appId: exampleLinuxWebApp.id,
 *     repoUrl: "https://github.com/Azure-Samples/python-docs-hello-world",
 *     branch: "master",
 * });
 * ```
 *
 * ## Import
 *
 * App Service Source Controls can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:appservice/sourceControl:SourceControl example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1
 * ```
 */
export class SourceControl extends pulumi.CustomResource {
    /**
     * Get an existing SourceControl resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SourceControlState, opts?: pulumi.CustomResourceOptions): SourceControl {
        return new SourceControl(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:appservice/sourceControl:SourceControl';

    /**
     * Returns true if the given object is an instance of SourceControl.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SourceControl {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SourceControl.__pulumiType;
    }

    /**
     * The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * The branch name to use for deployments. Changing this forces a new resource to be created.
     */
    public readonly branch!: pulumi.Output<string>;
    /**
     * A `githubActionConfiguration` block as defined below.
     */
    public readonly githubActionConfiguration!: pulumi.Output<outputs.appservice.SourceControlGithubActionConfiguration | undefined>;
    /**
     * The URL for the repository. Changing this forces a new resource to be created.
     */
    public readonly repoUrl!: pulumi.Output<string>;
    /**
     * Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
     */
    public readonly rollbackEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The SCM Type in use. This value is decoded by the service from the repository information supplied.
     */
    public /*out*/ readonly scmType!: pulumi.Output<string>;
    /**
     * Should the App use local Git configuration. Changing this forces a new resource to be created.
     */
    public readonly useLocalGit!: pulumi.Output<boolean | undefined>;
    /**
     * Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
     */
    public readonly useManualIntegration!: pulumi.Output<boolean | undefined>;
    /**
     * The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
     */
    public readonly useMercurial!: pulumi.Output<boolean | undefined>;
    /**
     * Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
     */
    public /*out*/ readonly usesGithubAction!: pulumi.Output<boolean>;

    /**
     * Create a SourceControl resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SourceControlArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SourceControlArgs | SourceControlState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SourceControlState | undefined;
            resourceInputs["appId"] = state ? state.appId : undefined;
            resourceInputs["branch"] = state ? state.branch : undefined;
            resourceInputs["githubActionConfiguration"] = state ? state.githubActionConfiguration : undefined;
            resourceInputs["repoUrl"] = state ? state.repoUrl : undefined;
            resourceInputs["rollbackEnabled"] = state ? state.rollbackEnabled : undefined;
            resourceInputs["scmType"] = state ? state.scmType : undefined;
            resourceInputs["useLocalGit"] = state ? state.useLocalGit : undefined;
            resourceInputs["useManualIntegration"] = state ? state.useManualIntegration : undefined;
            resourceInputs["useMercurial"] = state ? state.useMercurial : undefined;
            resourceInputs["usesGithubAction"] = state ? state.usesGithubAction : undefined;
        } else {
            const args = argsOrState as SourceControlArgs | undefined;
            if ((!args || args.appId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appId'");
            }
            resourceInputs["appId"] = args ? args.appId : undefined;
            resourceInputs["branch"] = args ? args.branch : undefined;
            resourceInputs["githubActionConfiguration"] = args ? args.githubActionConfiguration : undefined;
            resourceInputs["repoUrl"] = args ? args.repoUrl : undefined;
            resourceInputs["rollbackEnabled"] = args ? args.rollbackEnabled : undefined;
            resourceInputs["useLocalGit"] = args ? args.useLocalGit : undefined;
            resourceInputs["useManualIntegration"] = args ? args.useManualIntegration : undefined;
            resourceInputs["useMercurial"] = args ? args.useMercurial : undefined;
            resourceInputs["scmType"] = undefined /*out*/;
            resourceInputs["usesGithubAction"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SourceControl.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SourceControl resources.
 */
export interface SourceControlState {
    /**
     * The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
     */
    appId?: pulumi.Input<string>;
    /**
     * The branch name to use for deployments. Changing this forces a new resource to be created.
     */
    branch?: pulumi.Input<string>;
    /**
     * A `githubActionConfiguration` block as defined below.
     */
    githubActionConfiguration?: pulumi.Input<inputs.appservice.SourceControlGithubActionConfiguration>;
    /**
     * The URL for the repository. Changing this forces a new resource to be created.
     */
    repoUrl?: pulumi.Input<string>;
    /**
     * Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
     */
    rollbackEnabled?: pulumi.Input<boolean>;
    /**
     * The SCM Type in use. This value is decoded by the service from the repository information supplied.
     */
    scmType?: pulumi.Input<string>;
    /**
     * Should the App use local Git configuration. Changing this forces a new resource to be created.
     */
    useLocalGit?: pulumi.Input<boolean>;
    /**
     * Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
     */
    useManualIntegration?: pulumi.Input<boolean>;
    /**
     * The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
     */
    useMercurial?: pulumi.Input<boolean>;
    /**
     * Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
     */
    usesGithubAction?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SourceControl resource.
 */
export interface SourceControlArgs {
    /**
     * The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
     */
    appId: pulumi.Input<string>;
    /**
     * The branch name to use for deployments. Changing this forces a new resource to be created.
     */
    branch?: pulumi.Input<string>;
    /**
     * A `githubActionConfiguration` block as defined below.
     */
    githubActionConfiguration?: pulumi.Input<inputs.appservice.SourceControlGithubActionConfiguration>;
    /**
     * The URL for the repository. Changing this forces a new resource to be created.
     */
    repoUrl?: pulumi.Input<string>;
    /**
     * Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
     */
    rollbackEnabled?: pulumi.Input<boolean>;
    /**
     * Should the App use local Git configuration. Changing this forces a new resource to be created.
     */
    useLocalGit?: pulumi.Input<boolean>;
    /**
     * Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
     */
    useManualIntegration?: pulumi.Input<boolean>;
    /**
     * The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
     */
    useMercurial?: pulumi.Input<boolean>;
}