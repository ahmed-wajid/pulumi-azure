// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring
{
    public static class GetDataCollectionEndpoint
    {
        /// <summary>
        /// Use this data source to access information about an existing Data Collection Endpoint.
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
        ///     var example = Azure.Monitoring.GetDataCollectionEndpoint.Invoke(new()
        ///     {
        ///         Name = "example-mdce",
        ///         ResourceGroupName = azurerm_resource_group.Example.Name,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["endpointId"] = example.Apply(getDataCollectionEndpointResult =&gt; getDataCollectionEndpointResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDataCollectionEndpointResult> InvokeAsync(GetDataCollectionEndpointArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDataCollectionEndpointResult>("azure:monitoring/getDataCollectionEndpoint:getDataCollectionEndpoint", args ?? new GetDataCollectionEndpointArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Data Collection Endpoint.
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
        ///     var example = Azure.Monitoring.GetDataCollectionEndpoint.Invoke(new()
        ///     {
        ///         Name = "example-mdce",
        ///         ResourceGroupName = azurerm_resource_group.Example.Name,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["endpointId"] = example.Apply(getDataCollectionEndpointResult =&gt; getDataCollectionEndpointResult.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDataCollectionEndpointResult> Invoke(GetDataCollectionEndpointInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDataCollectionEndpointResult>("azure:monitoring/getDataCollectionEndpoint:getDataCollectionEndpoint", args ?? new GetDataCollectionEndpointInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDataCollectionEndpointArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Data Collection Endpoint.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the resource group the Data Collection Endpoint is located in.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetDataCollectionEndpointArgs()
        {
        }
        public static new GetDataCollectionEndpointArgs Empty => new GetDataCollectionEndpointArgs();
    }

    public sealed class GetDataCollectionEndpointInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Data Collection Endpoint.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the resource group the Data Collection Endpoint is located in.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetDataCollectionEndpointInvokeArgs()
        {
        }
        public static new GetDataCollectionEndpointInvokeArgs Empty => new GetDataCollectionEndpointInvokeArgs();
    }


    [OutputType]
    public sealed class GetDataCollectionEndpointResult
    {
        /// <summary>
        /// The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
        /// </summary>
        public readonly string ConfigurationAccessEndpoint;
        /// <summary>
        /// Specifies a description for the Data Collection Endpoint.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// The Azure Region where the Data Collection Endpoint should exist.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
        /// </summary>
        public readonly string LogsIngestionEndpoint;
        public readonly string Name;
        /// <summary>
        /// Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`.
        /// </summary>
        public readonly bool PublicNetworkAccessEnabled;
        public readonly string ResourceGroupName;
        /// <summary>
        /// A mapping of tags which should be assigned to the Data Collection Endpoint.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetDataCollectionEndpointResult(
            string configurationAccessEndpoint,

            string description,

            string id,

            string kind,

            string location,

            string logsIngestionEndpoint,

            string name,

            bool publicNetworkAccessEnabled,

            string resourceGroupName,

            ImmutableDictionary<string, string> tags)
        {
            ConfigurationAccessEndpoint = configurationAccessEndpoint;
            Description = description;
            Id = id;
            Kind = kind;
            Location = location;
            LogsIngestionEndpoint = logsIngestionEndpoint;
            Name = name;
            PublicNetworkAccessEnabled = publicNetworkAccessEnabled;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
        }
    }
}