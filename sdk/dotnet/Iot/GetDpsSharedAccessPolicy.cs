// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Iot
{
    public static class GetDpsSharedAccessPolicy
    {
        /// <summary>
        /// Use this data source to access information about an existing IotHub Device Provisioning Service Shared Access Policy
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDpsSharedAccessPolicyResult> InvokeAsync(GetDpsSharedAccessPolicyArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDpsSharedAccessPolicyResult>("azure:iot/getDpsSharedAccessPolicy:getDpsSharedAccessPolicy", args ?? new GetDpsSharedAccessPolicyArgs(), options.WithVersion());
    }


    public sealed class GetDpsSharedAccessPolicyArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the IoT Hub Device Provisioning service to which the Shared Access Policy belongs.
        /// </summary>
        [Input("iothubDpsName", required: true)]
        public string IothubDpsName { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the IotHub Shared Access Policy.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the resource group under which the IotHub Shared Access Policy resource exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetDpsSharedAccessPolicyArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDpsSharedAccessPolicyResult
    {
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string IothubDpsName;
        public readonly string Name;
        /// <summary>
        /// The primary connection string of the Shared Access Policy.
        /// </summary>
        public readonly string PrimaryConnectionString;
        /// <summary>
        /// The primary key used to create the authentication token.
        /// </summary>
        public readonly string PrimaryKey;
        public readonly string ResourceGroupName;
        /// <summary>
        /// The secondary connection string of the Shared Access Policy.
        /// </summary>
        public readonly string SecondaryConnectionString;
        /// <summary>
        /// The secondary key used to create the authentication token.
        /// </summary>
        public readonly string SecondaryKey;

        [OutputConstructor]
        private GetDpsSharedAccessPolicyResult(
            string id,

            string iothubDpsName,

            string name,

            string primaryConnectionString,

            string primaryKey,

            string resourceGroupName,

            string secondaryConnectionString,

            string secondaryKey)
        {
            Id = id;
            IothubDpsName = iothubDpsName;
            Name = name;
            PrimaryConnectionString = primaryConnectionString;
            PrimaryKey = primaryKey;
            ResourceGroupName = resourceGroupName;
            SecondaryConnectionString = secondaryConnectionString;
            SecondaryKey = secondaryKey;
        }
    }
}