// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class TransformOutputCustomPresetCodecH265VideoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The complexity of the encoding. Possible values are `Balanced`, `Speed` or `Quality`. Default to `Balanced`.
        /// </summary>
        [Input("complexity")]
        public Input<string>? Complexity { get; set; }

        /// <summary>
        /// The distance between two key frames. The value should be non-zero in the range `0.5` to `20` seconds, specified in ISO 8601 format. The default is `2` seconds (`PT2S`). Note that this setting is ignored if `sync_mode` is set to `Passthrough`, where the KeyFrameInterval value will follow the input source setting.
        /// </summary>
        [Input("keyFrameInterval")]
        public Input<string>? KeyFrameInterval { get; set; }

        /// <summary>
        /// Specifies the label for the codec. The label can be used to control muxing behavior.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("layers")]
        private InputList<Inputs.TransformOutputCustomPresetCodecH265VideoLayerGetArgs>? _layers;

        /// <summary>
        /// One or more `layer` blocks as defined below.
        /// </summary>
        public InputList<Inputs.TransformOutputCustomPresetCodecH265VideoLayerGetArgs> Layers
        {
            get => _layers ?? (_layers = new InputList<Inputs.TransformOutputCustomPresetCodecH265VideoLayerGetArgs>());
            set => _layers = value;
        }

        /// <summary>
        /// Whether the encoder should insert key frames at scene changes. This flag should be set to true only when the encoder is being configured to produce a single output video. Default to `false`.
        /// </summary>
        [Input("sceneChangeDetectionEnabled")]
        public Input<bool>? SceneChangeDetectionEnabled { get; set; }

        /// <summary>
        /// Specifies the resizing mode - how the input video will be resized to fit the desired output resolution(s). Possible values are `AutoFit`, `AutoSize` or `None`. Default to `AutoSize`.
        /// </summary>
        [Input("stretchMode")]
        public Input<string>? StretchMode { get; set; }

        /// <summary>
        /// Specifies the synchronization mode for the video. Possible values are `Auto`, `Cfr`, `Passthrough` or `Vfr`. Default to `Auto`.
        /// </summary>
        [Input("syncMode")]
        public Input<string>? SyncMode { get; set; }

        public TransformOutputCustomPresetCodecH265VideoGetArgs()
        {
        }
        public static new TransformOutputCustomPresetCodecH265VideoGetArgs Empty => new TransformOutputCustomPresetCodecH265VideoGetArgs();
    }
}