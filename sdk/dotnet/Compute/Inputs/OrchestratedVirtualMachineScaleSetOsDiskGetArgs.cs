// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class OrchestratedVirtualMachineScaleSetOsDiskGetArgs : Pulumi.ResourceArgs
    {
        [Input("caching", required: true)]
        public Input<string> Caching { get; set; } = null!;

        [Input("diffDiskSettings")]
        public Input<Inputs.OrchestratedVirtualMachineScaleSetOsDiskDiffDiskSettingsGetArgs>? DiffDiskSettings { get; set; }

        [Input("diskEncryptionSetId")]
        public Input<string>? DiskEncryptionSetId { get; set; }

        [Input("diskSizeGb")]
        public Input<int>? DiskSizeGb { get; set; }

        [Input("storageAccountType", required: true)]
        public Input<string> StorageAccountType { get; set; } = null!;

        [Input("writeAcceleratorEnabled")]
        public Input<bool>? WriteAcceleratorEnabled { get; set; }

        public OrchestratedVirtualMachineScaleSetOsDiskGetArgs()
        {
        }
    }
}