// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DevCenter
{
    /// <summary>
    /// &lt;!-- Note: This documentation is generated. Any manual changes will be overwritten --&gt;
    /// 
    /// Manages a Dev Center Project.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
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
    ///     var exampleDevCenter = new Azure.DevCenter.DevCenter("exampleDevCenter", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         Identity = new Azure.DevCenter.Inputs.DevCenterIdentityArgs
    ///         {
    ///             Type = "example-value",
    ///         },
    ///     });
    /// 
    ///     var exampleProject = new Azure.DevCenter.Project("exampleProject", new()
    ///     {
    ///         DevCenterId = exampleDevCenter.Id,
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// An existing Dev Center Project can be imported into Terraform using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:devcenter/project:Project example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevCenter/projects/{projectName}
    /// ```
    /// 
    ///  * Where `{subscriptionId}` is the ID of the Azure Subscription where the Dev Center Project exists. For example `12345678-1234-9876-4563-123456789012`. * Where `{resourceGroupName}` is the name of Resource Group where this Dev Center Project exists. For example `example-resource-group`. * Where `{projectName}` is the name of the Project. For example `projectValue`.
    /// </summary>
    [AzureResourceType("azure:devcenter/project:Project")]
    public partial class Project : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the project. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Resource Id of an associated DevCenter. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Output("devCenterId")]
        public Output<string> DevCenterId { get; private set; } = null!;

        /// <summary>
        /// The URI of the Dev Center resource this project is associated with.
        /// </summary>
        [Output("devCenterUri")]
        public Output<string> DevCenterUri { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Dev Center Project should exist. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// When specified, limits the maximum number of Dev Boxes a single user can create across all pools in the project.
        /// </summary>
        [Output("maximumDevBoxesPerUser")]
        public Output<int?> MaximumDevBoxesPerUser { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of this Dev Center Project. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group within which this Dev Center Project should exist. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Dev Center Project.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Project resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Project(string name, ProjectArgs args, CustomResourceOptions? options = null)
            : base("azure:devcenter/project:Project", name, args ?? new ProjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Project(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
            : base("azure:devcenter/project:Project", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Project resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Project Get(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
        {
            return new Project(name, id, state, options);
        }
    }

    public sealed class ProjectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the project. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Resource Id of an associated DevCenter. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Input("devCenterId", required: true)]
        public Input<string> DevCenterId { get; set; } = null!;

        /// <summary>
        /// The Azure Region where the Dev Center Project should exist. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// When specified, limits the maximum number of Dev Boxes a single user can create across all pools in the project.
        /// </summary>
        [Input("maximumDevBoxesPerUser")]
        public Input<int>? MaximumDevBoxesPerUser { get; set; }

        /// <summary>
        /// Specifies the name of this Dev Center Project. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group within which this Dev Center Project should exist. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Dev Center Project.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ProjectArgs()
        {
        }
        public static new ProjectArgs Empty => new ProjectArgs();
    }

    public sealed class ProjectState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the project. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Resource Id of an associated DevCenter. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Input("devCenterId")]
        public Input<string>? DevCenterId { get; set; }

        /// <summary>
        /// The URI of the Dev Center resource this project is associated with.
        /// </summary>
        [Input("devCenterUri")]
        public Input<string>? DevCenterUri { get; set; }

        /// <summary>
        /// The Azure Region where the Dev Center Project should exist. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// When specified, limits the maximum number of Dev Boxes a single user can create across all pools in the project.
        /// </summary>
        [Input("maximumDevBoxesPerUser")]
        public Input<int>? MaximumDevBoxesPerUser { get; set; }

        /// <summary>
        /// Specifies the name of this Dev Center Project. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group within which this Dev Center Project should exist. Changing this forces a new Dev Center Project to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Dev Center Project.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ProjectState()
        {
        }
        public static new ProjectState Empty => new ProjectState();
    }
}