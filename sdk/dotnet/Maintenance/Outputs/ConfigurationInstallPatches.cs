// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Maintenance.Outputs
{

    [OutputType]
    public sealed class ConfigurationInstallPatches
    {
        /// <summary>
        /// A `linux` block as defined above. This property only applies when `scope` is set to `InGuestPatch`
        /// </summary>
        public readonly ImmutableArray<Outputs.ConfigurationInstallPatchesLinux> Linuxes;
        /// <summary>
        /// Possible reboot preference as defined by the user based on which it would be decided to reboot the machine or not after the patch operation is completed. Possible values are `Always`, `IfRequired` and `Never`. This property only applies when `scope` is set to `InGuestPatch`.
        /// </summary>
        public readonly string? Reboot;
        /// <summary>
        /// A `windows` block as defined above. This property only applies when `scope` is set to `InGuestPatch`
        /// </summary>
        public readonly ImmutableArray<Outputs.ConfigurationInstallPatchesWindow> Windows;

        [OutputConstructor]
        private ConfigurationInstallPatches(
            ImmutableArray<Outputs.ConfigurationInstallPatchesLinux> linuxes,

            string? reboot,

            ImmutableArray<Outputs.ConfigurationInstallPatchesWindow> windows)
        {
            Linuxes = linuxes;
            Reboot = reboot;
            Windows = windows;
        }
    }
}