// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class GroupContainerGpuLimit
    {
        /// <summary>
        /// The number of GPUs which should be assigned to this container. Allowed values are `1`, `2`, or `4`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly int? Count;
        /// <summary>
        /// The SKU which should be used for the GPU. Possible values are `K80`, `P100`, or `V100`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? Sku;

        [OutputConstructor]
        private GroupContainerGpuLimit(
            int? count,

            string? sku)
        {
            Count = count;
            Sku = sku;
        }
    }
}