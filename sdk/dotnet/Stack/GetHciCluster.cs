// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Stack
{
    public static class GetHciCluster
    {
        /// <summary>
        /// Use this data source to access information about an existing Azure Stack HCI Cluster instance.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Stack.GetHciCluster.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         ResourceGroupName = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getHciClusterResult =&gt; getHciClusterResult.Id),
        ///         ["location"] = example.Apply(getHciClusterResult =&gt; getHciClusterResult.Location),
        ///         ["clientId"] = example.Apply(getHciClusterResult =&gt; getHciClusterResult.ClientId),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetHciClusterResult> InvokeAsync(GetHciClusterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHciClusterResult>("azure:stack/getHciCluster:getHciCluster", args ?? new GetHciClusterArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Azure Stack HCI Cluster instance.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Stack.GetHciCluster.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         ResourceGroupName = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getHciClusterResult =&gt; getHciClusterResult.Id),
        ///         ["location"] = example.Apply(getHciClusterResult =&gt; getHciClusterResult.Location),
        ///         ["clientId"] = example.Apply(getHciClusterResult =&gt; getHciClusterResult.ClientId),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetHciClusterResult> Invoke(GetHciClusterInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHciClusterResult>("azure:stack/getHciCluster:getHciCluster", args ?? new GetHciClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHciClusterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Azure Stack HCI Cluster.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Azure Stack HCI Cluster exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetHciClusterArgs()
        {
        }
        public static new GetHciClusterArgs Empty => new GetHciClusterArgs();
    }

    public sealed class GetHciClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Azure Stack HCI Cluster.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Azure Stack HCI Cluster exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetHciClusterInvokeArgs()
        {
        }
        public static new GetHciClusterInvokeArgs Empty => new GetHciClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetHciClusterResult
    {
        /// <summary>
        /// The ID of the Automanage Configuration assigned to the Azure Stack HCI Cluster.
        /// </summary>
        public readonly string AutomanageConfigurationId;
        /// <summary>
        /// The Client ID of the Azure Active Directory used by the Azure Stack HCI Cluster.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Azure Region where the Azure Stack HCI Cluster exists.
        /// </summary>
        public readonly string Location;
        public readonly string Name;
        public readonly string ResourceGroupName;
        /// <summary>
        /// A mapping of tags assigned to the Azure Stack HCI Cluster.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// The Tenant ID of the Azure Active Directory used by the Azure Stack HCI Cluster.
        /// </summary>
        public readonly string TenantId;

        [OutputConstructor]
        private GetHciClusterResult(
            string automanageConfigurationId,

            string clientId,

            string id,

            string location,

            string name,

            string resourceGroupName,

            ImmutableDictionary<string, string> tags,

            string tenantId)
        {
            AutomanageConfigurationId = automanageConfigurationId;
            ClientId = clientId;
            Id = id;
            Location = location;
            Name = name;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
            TenantId = tenantId;
        }
    }
}