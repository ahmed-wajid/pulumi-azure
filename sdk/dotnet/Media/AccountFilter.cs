// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media
{
    /// <summary>
    /// Manages a Media Services Account Filter.
    /// 
    /// ## Import
    /// 
    /// Account Filters can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:media/accountFilter:AccountFilter example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Media/mediaServices/account1/accountFilters/filter1
    /// ```
    /// </summary>
    [AzureResourceType("azure:media/accountFilter:AccountFilter")]
    public partial class AccountFilter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
        /// </summary>
        [Output("firstQualityBitrate")]
        public Output<int?> FirstQualityBitrate { get; private set; } = null!;

        /// <summary>
        /// The Media Services account name. Changing this forces a new Account Filter to be created.
        /// </summary>
        [Output("mediaServicesAccountName")]
        public Output<string> MediaServicesAccountName { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Account Filter. Changing this forces a new Account Filter to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A `presentation_time_range` block as defined below.
        /// </summary>
        [Output("presentationTimeRange")]
        public Output<Outputs.AccountFilterPresentationTimeRange?> PresentationTimeRange { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Account Filter should exist. Changing this forces a new Account Filter to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// One or more `track_selection` blocks as defined below.
        /// </summary>
        [Output("trackSelections")]
        public Output<ImmutableArray<Outputs.AccountFilterTrackSelection>> TrackSelections { get; private set; } = null!;


        /// <summary>
        /// Create a AccountFilter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountFilter(string name, AccountFilterArgs args, CustomResourceOptions? options = null)
            : base("azure:media/accountFilter:AccountFilter", name, args ?? new AccountFilterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountFilter(string name, Input<string> id, AccountFilterState? state = null, CustomResourceOptions? options = null)
            : base("azure:media/accountFilter:AccountFilter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccountFilter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountFilter Get(string name, Input<string> id, AccountFilterState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountFilter(name, id, state, options);
        }
    }

    public sealed class AccountFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
        /// </summary>
        [Input("firstQualityBitrate")]
        public Input<int>? FirstQualityBitrate { get; set; }

        /// <summary>
        /// The Media Services account name. Changing this forces a new Account Filter to be created.
        /// </summary>
        [Input("mediaServicesAccountName", required: true)]
        public Input<string> MediaServicesAccountName { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Account Filter. Changing this forces a new Account Filter to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `presentation_time_range` block as defined below.
        /// </summary>
        [Input("presentationTimeRange")]
        public Input<Inputs.AccountFilterPresentationTimeRangeArgs>? PresentationTimeRange { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Account Filter should exist. Changing this forces a new Account Filter to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("trackSelections")]
        private InputList<Inputs.AccountFilterTrackSelectionArgs>? _trackSelections;

        /// <summary>
        /// One or more `track_selection` blocks as defined below.
        /// </summary>
        public InputList<Inputs.AccountFilterTrackSelectionArgs> TrackSelections
        {
            get => _trackSelections ?? (_trackSelections = new InputList<Inputs.AccountFilterTrackSelectionArgs>());
            set => _trackSelections = value;
        }

        public AccountFilterArgs()
        {
        }
        public static new AccountFilterArgs Empty => new AccountFilterArgs();
    }

    public sealed class AccountFilterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
        /// </summary>
        [Input("firstQualityBitrate")]
        public Input<int>? FirstQualityBitrate { get; set; }

        /// <summary>
        /// The Media Services account name. Changing this forces a new Account Filter to be created.
        /// </summary>
        [Input("mediaServicesAccountName")]
        public Input<string>? MediaServicesAccountName { get; set; }

        /// <summary>
        /// The name which should be used for this Account Filter. Changing this forces a new Account Filter to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `presentation_time_range` block as defined below.
        /// </summary>
        [Input("presentationTimeRange")]
        public Input<Inputs.AccountFilterPresentationTimeRangeGetArgs>? PresentationTimeRange { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Account Filter should exist. Changing this forces a new Account Filter to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("trackSelections")]
        private InputList<Inputs.AccountFilterTrackSelectionGetArgs>? _trackSelections;

        /// <summary>
        /// One or more `track_selection` blocks as defined below.
        /// </summary>
        public InputList<Inputs.AccountFilterTrackSelectionGetArgs> TrackSelections
        {
            get => _trackSelections ?? (_trackSelections = new InputList<Inputs.AccountFilterTrackSelectionGetArgs>());
            set => _trackSelections = value;
        }

        public AccountFilterState()
        {
        }
        public static new AccountFilterState Empty => new AccountFilterState();
    }
}