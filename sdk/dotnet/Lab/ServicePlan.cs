// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Lab
{
    /// <summary>
    /// Manages a Lab Service Plan.
    /// 
    /// &gt; **Note:** Before using this resource, it's required to submit the request of registering the provider with Azure CLI `az provider register --namespace Microsoft.LabServices`.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleServicePlan = new Azure.Lab.ServicePlan("exampleServicePlan", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         AllowedRegions = new[]
    ///         {
    ///             exampleResourceGroup.Location,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Lab Service Plans can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:lab/servicePlan:ServicePlan example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.LabServices/labPlans/labPlan1
    /// ```
    /// </summary>
    [AzureResourceType("azure:lab/servicePlan:ServicePlan")]
    public partial class ServicePlan : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The allowed regions for the lab creator to use when creating labs using this Lab Service Plan. The allowed region's count must be between `1` and `28`.
        /// </summary>
        [Output("allowedRegions")]
        public Output<ImmutableArray<string>> AllowedRegions { get; private set; } = null!;

        /// <summary>
        /// A `default_auto_shutdown` block as defined below.
        /// </summary>
        [Output("defaultAutoShutdown")]
        public Output<Outputs.ServicePlanDefaultAutoShutdown?> DefaultAutoShutdown { get; private set; } = null!;

        /// <summary>
        /// A `default_connection` block as defined below.
        /// </summary>
        [Output("defaultConnection")]
        public Output<Outputs.ServicePlanDefaultConnection?> DefaultConnection { get; private set; } = null!;

        /// <summary>
        /// The resource ID of the Subnet for the Lab Service Plan network profile.
        /// </summary>
        [Output("defaultNetworkSubnetId")]
        public Output<string?> DefaultNetworkSubnetId { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Lab Service Plan should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name of the Lab Service Plan. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Lab Service Plan should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The resource ID of the Shared Image Gallery attached to this Lab Service Plan. When saving a lab template virtual machine image it will be persisted in this gallery. The shared images from the gallery can be made available to use when creating new labs.
        /// </summary>
        [Output("sharedGalleryId")]
        public Output<string?> SharedGalleryId { get; private set; } = null!;

        /// <summary>
        /// A `support` block as defined below.
        /// </summary>
        [Output("support")]
        public Output<Outputs.ServicePlanSupport?> Support { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Lab Service Plan.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ServicePlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServicePlan(string name, ServicePlanArgs args, CustomResourceOptions? options = null)
            : base("azure:lab/servicePlan:ServicePlan", name, args ?? new ServicePlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServicePlan(string name, Input<string> id, ServicePlanState? state = null, CustomResourceOptions? options = null)
            : base("azure:lab/servicePlan:ServicePlan", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ServicePlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServicePlan Get(string name, Input<string> id, ServicePlanState? state = null, CustomResourceOptions? options = null)
        {
            return new ServicePlan(name, id, state, options);
        }
    }

    public sealed class ServicePlanArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedRegions", required: true)]
        private InputList<string>? _allowedRegions;

        /// <summary>
        /// The allowed regions for the lab creator to use when creating labs using this Lab Service Plan. The allowed region's count must be between `1` and `28`.
        /// </summary>
        public InputList<string> AllowedRegions
        {
            get => _allowedRegions ?? (_allowedRegions = new InputList<string>());
            set => _allowedRegions = value;
        }

        /// <summary>
        /// A `default_auto_shutdown` block as defined below.
        /// </summary>
        [Input("defaultAutoShutdown")]
        public Input<Inputs.ServicePlanDefaultAutoShutdownArgs>? DefaultAutoShutdown { get; set; }

        /// <summary>
        /// A `default_connection` block as defined below.
        /// </summary>
        [Input("defaultConnection")]
        public Input<Inputs.ServicePlanDefaultConnectionArgs>? DefaultConnection { get; set; }

        /// <summary>
        /// The resource ID of the Subnet for the Lab Service Plan network profile.
        /// </summary>
        [Input("defaultNetworkSubnetId")]
        public Input<string>? DefaultNetworkSubnetId { get; set; }

        /// <summary>
        /// The Azure Region where the Lab Service Plan should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the Lab Service Plan. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Lab Service Plan should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The resource ID of the Shared Image Gallery attached to this Lab Service Plan. When saving a lab template virtual machine image it will be persisted in this gallery. The shared images from the gallery can be made available to use when creating new labs.
        /// </summary>
        [Input("sharedGalleryId")]
        public Input<string>? SharedGalleryId { get; set; }

        /// <summary>
        /// A `support` block as defined below.
        /// </summary>
        [Input("support")]
        public Input<Inputs.ServicePlanSupportArgs>? Support { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Lab Service Plan.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ServicePlanArgs()
        {
        }
        public static new ServicePlanArgs Empty => new ServicePlanArgs();
    }

    public sealed class ServicePlanState : global::Pulumi.ResourceArgs
    {
        [Input("allowedRegions")]
        private InputList<string>? _allowedRegions;

        /// <summary>
        /// The allowed regions for the lab creator to use when creating labs using this Lab Service Plan. The allowed region's count must be between `1` and `28`.
        /// </summary>
        public InputList<string> AllowedRegions
        {
            get => _allowedRegions ?? (_allowedRegions = new InputList<string>());
            set => _allowedRegions = value;
        }

        /// <summary>
        /// A `default_auto_shutdown` block as defined below.
        /// </summary>
        [Input("defaultAutoShutdown")]
        public Input<Inputs.ServicePlanDefaultAutoShutdownGetArgs>? DefaultAutoShutdown { get; set; }

        /// <summary>
        /// A `default_connection` block as defined below.
        /// </summary>
        [Input("defaultConnection")]
        public Input<Inputs.ServicePlanDefaultConnectionGetArgs>? DefaultConnection { get; set; }

        /// <summary>
        /// The resource ID of the Subnet for the Lab Service Plan network profile.
        /// </summary>
        [Input("defaultNetworkSubnetId")]
        public Input<string>? DefaultNetworkSubnetId { get; set; }

        /// <summary>
        /// The Azure Region where the Lab Service Plan should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the Lab Service Plan. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Lab Service Plan should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The resource ID of the Shared Image Gallery attached to this Lab Service Plan. When saving a lab template virtual machine image it will be persisted in this gallery. The shared images from the gallery can be made available to use when creating new labs.
        /// </summary>
        [Input("sharedGalleryId")]
        public Input<string>? SharedGalleryId { get; set; }

        /// <summary>
        /// A `support` block as defined below.
        /// </summary>
        [Input("support")]
        public Input<Inputs.ServicePlanSupportGetArgs>? Support { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Lab Service Plan.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ServicePlanState()
        {
        }
        public static new ServicePlanState Empty => new ServicePlanState();
    }
}