// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class TransformOutputBuiltinPresetPresetConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The complexity of the encoding. Possible values are `Balanced`, `Speed` or `Quality`.
        /// </summary>
        [Input("complexity")]
        public Input<string>? Complexity { get; set; }

        /// <summary>
        /// Specifies the interleave mode of the output to control how audio are stored in the container format. Possible values are `InterleavedOutput` and `NonInterleavedOutput`.
        /// </summary>
        [Input("interleaveOutput")]
        public Input<string>? InterleaveOutput { get; set; }

        /// <summary>
        /// The key frame interval in seconds. Possible value is a positive float. For example, set as `2.0` to reduce the playback buffering for some players.
        /// </summary>
        [Input("keyFrameIntervalInSeconds")]
        public Input<double>? KeyFrameIntervalInSeconds { get; set; }

        /// <summary>
        /// The maximum bitrate in bits per second (threshold for the top video layer). For example, set as `6000000` to avoid producing very high bitrate outputs for contents with high complexity.
        /// </summary>
        [Input("maxBitrateBps")]
        public Input<int>? MaxBitrateBps { get; set; }

        /// <summary>
        /// The maximum height of output video layers. For example, set as `720` to produce output layers up to 720P even if the input is 4K.
        /// </summary>
        [Input("maxHeight")]
        public Input<int>? MaxHeight { get; set; }

        /// <summary>
        /// The maximum number of output video layers. For example, set as `4` to make sure at most 4 output layers are produced to control the overall cost of the encoding job.
        /// </summary>
        [Input("maxLayers")]
        public Input<int>? MaxLayers { get; set; }

        /// <summary>
        /// The minimum bitrate in bits per second (threshold for the bottom video layer). For example, set as `200000` to have a bottom layer that covers users with low network bandwidth.
        /// </summary>
        [Input("minBitrateBps")]
        public Input<int>? MinBitrateBps { get; set; }

        /// <summary>
        /// The minimum height of output video layers. For example, set as `360` to avoid output layers of smaller resolutions like 180P.
        /// </summary>
        [Input("minHeight")]
        public Input<int>? MinHeight { get; set; }

        public TransformOutputBuiltinPresetPresetConfigurationGetArgs()
        {
        }
        public static new TransformOutputBuiltinPresetPresetConfigurationGetArgs Empty => new TransformOutputBuiltinPresetPresetConfigurationGetArgs();
    }
}