// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile
{
    public static class GetNetworkSimGroup
    {
        /// <summary>
        /// Get information about a Mobile Network Sim Group.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleNetwork = Azure.Mobile.GetNetwork.Invoke(new()
        ///     {
        ///         Name = "example-mn",
        ///         ResourceGroupName = azurerm_resource_group.Example.Name,
        ///     });
        /// 
        ///     var exampleNetworkSimGroup = Azure.Mobile.GetNetworkSimGroup.Invoke(new()
        ///     {
        ///         Name = "example-mnsg",
        ///         MobileNetworkId = exampleNetwork.Apply(getNetworkResult =&gt; getNetworkResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetNetworkSimGroupResult> InvokeAsync(GetNetworkSimGroupArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkSimGroupResult>("azure:mobile/getNetworkSimGroup:getNetworkSimGroup", args ?? new GetNetworkSimGroupArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Mobile Network Sim Group.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleNetwork = Azure.Mobile.GetNetwork.Invoke(new()
        ///     {
        ///         Name = "example-mn",
        ///         ResourceGroupName = azurerm_resource_group.Example.Name,
        ///     });
        /// 
        ///     var exampleNetworkSimGroup = Azure.Mobile.GetNetworkSimGroup.Invoke(new()
        ///     {
        ///         Name = "example-mnsg",
        ///         MobileNetworkId = exampleNetwork.Apply(getNetworkResult =&gt; getNetworkResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetNetworkSimGroupResult> Invoke(GetNetworkSimGroupInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkSimGroupResult>("azure:mobile/getNetworkSimGroup:getNetworkSimGroup", args ?? new GetNetworkSimGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkSimGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of Mobile Network which the Mobile Network Sim Group belongs to.
        /// </summary>
        [Input("mobileNetworkId", required: true)]
        public string MobileNetworkId { get; set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this Mobile Network Sim Groups.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetNetworkSimGroupArgs()
        {
        }
        public static new GetNetworkSimGroupArgs Empty => new GetNetworkSimGroupArgs();
    }

    public sealed class GetNetworkSimGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of Mobile Network which the Mobile Network Sim Group belongs to.
        /// </summary>
        [Input("mobileNetworkId", required: true)]
        public Input<string> MobileNetworkId { get; set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this Mobile Network Sim Groups.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetNetworkSimGroupInvokeArgs()
        {
        }
        public static new GetNetworkSimGroupInvokeArgs Empty => new GetNetworkSimGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkSimGroupResult
    {
        /// <summary>
        /// A key to encrypt the SIM data that belongs to this SIM group.
        /// </summary>
        public readonly string EncryptionKeyUrl;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkSimGroupIdentityResult> Identities;
        /// <summary>
        /// The Azure Region where the Mobile Network Sim Groups should exist.
        /// </summary>
        public readonly string Location;
        public readonly string MobileNetworkId;
        public readonly string Name;
        /// <summary>
        /// A mapping of tags which should be assigned to the Mobile Network Sim Groups.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetNetworkSimGroupResult(
            string encryptionKeyUrl,

            string id,

            ImmutableArray<Outputs.GetNetworkSimGroupIdentityResult> identities,

            string location,

            string mobileNetworkId,

            string name,

            ImmutableDictionary<string, string> tags)
        {
            EncryptionKeyUrl = encryptionKeyUrl;
            Id = id;
            Identities = identities;
            Location = location;
            MobileNetworkId = mobileNetworkId;
            Name = name;
            Tags = tags;
        }
    }
}