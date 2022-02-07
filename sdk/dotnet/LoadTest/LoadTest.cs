// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LoadTest
{
    /// <summary>
    /// Manages a Load Test.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleLoadTest = new Azure.LoadTest.LoadTest("exampleLoadTest", new Azure.LoadTest.LoadTestArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = "West Europe",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Load tests can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:loadtest/loadTest:LoadTest example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.LoadTestService/loadtests/example
    /// ```
    /// </summary>
    [AzureResourceType("azure:loadtest/loadTest:LoadTest")]
    public partial class LoadTest : Pulumi.CustomResource
    {
        /// <summary>
        /// Public URI of the Data Plane.
        /// </summary>
        [Output("dataplaneUri")]
        public Output<string> DataplaneUri { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Load Test should exist. Changing this forces a new Load Test to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Load Test. Changing this forces a new Load Test to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Load Test should exist. Changing this forces a new Load Test to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Load Test.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a LoadTest resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadTest(string name, LoadTestArgs args, CustomResourceOptions? options = null)
            : base("azure:loadtest/loadTest:LoadTest", name, args ?? new LoadTestArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadTest(string name, Input<string> id, LoadTestState? state = null, CustomResourceOptions? options = null)
            : base("azure:loadtest/loadTest:LoadTest", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LoadTest resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadTest Get(string name, Input<string> id, LoadTestState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadTest(name, id, state, options);
        }
    }

    public sealed class LoadTestArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Azure Region where the Load Test should exist. Changing this forces a new Load Test to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name which should be used for this Load Test. Changing this forces a new Load Test to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Load Test should exist. Changing this forces a new Load Test to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Load Test.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public LoadTestArgs()
        {
        }
    }

    public sealed class LoadTestState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Public URI of the Data Plane.
        /// </summary>
        [Input("dataplaneUri")]
        public Input<string>? DataplaneUri { get; set; }

        /// <summary>
        /// The Azure Region where the Load Test should exist. Changing this forces a new Load Test to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name which should be used for this Load Test. Changing this forces a new Load Test to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Load Test should exist. Changing this forces a new Load Test to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Load Test.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public LoadTestState()
        {
        }
    }
}