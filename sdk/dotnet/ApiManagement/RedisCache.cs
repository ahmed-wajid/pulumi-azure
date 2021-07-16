// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement
{
    /// <summary>
    /// Manages a API Management Redis Cache.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleService = new Azure.ApiManagement.Service("exampleService", new Azure.ApiManagement.ServiceArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             PublisherName = "pub1",
    ///             PublisherEmail = "pub1@email.com",
    ///             SkuName = "Consumption_0",
    ///         });
    ///         var exampleCache = new Azure.Redis.Cache("exampleCache", new Azure.Redis.CacheArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Capacity = 1,
    ///             Family = "C",
    ///             SkuName = "Basic",
    ///             EnableNonSslPort = false,
    ///             MinimumTlsVersion = "1.2",
    ///             RedisConfiguration = ,
    ///         });
    ///         var exampleRedisCache = new Azure.ApiManagement.RedisCache("exampleRedisCache", new Azure.ApiManagement.RedisCacheArgs
    ///         {
    ///             ApiManagementId = exampleService.Id,
    ///             ConnectionString = exampleCache.PrimaryConnectionString,
    ///             Description = "Redis cache instances",
    ///             RedisCacheId = exampleCache.Id,
    ///             CacheLocation = "East Us",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// API Management Redis Caches can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:apimanagement/redisCache:RedisCache example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/caches/cache1
    /// ```
    /// </summary>
    [AzureResourceType("azure:apimanagement/redisCache:RedisCache")]
    public partial class RedisCache : Pulumi.CustomResource
    {
        /// <summary>
        /// The resource ID of the Api Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
        /// </summary>
        [Output("apiManagementId")]
        public Output<string> ApiManagementId { get; private set; } = null!;

        /// <summary>
        /// The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
        /// </summary>
        [Output("cacheLocation")]
        public Output<string?> CacheLocation { get; private set; } = null!;

        /// <summary>
        /// The connection string to the Cache for Redis.
        /// </summary>
        [Output("connectionString")]
        public Output<string> ConnectionString { get; private set; } = null!;

        /// <summary>
        /// The description of the API Management Redis Cache.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The resource ID of the Cache for Redis.
        /// </summary>
        [Output("redisCacheId")]
        public Output<string?> RedisCacheId { get; private set; } = null!;


        /// <summary>
        /// Create a RedisCache resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RedisCache(string name, RedisCacheArgs args, CustomResourceOptions? options = null)
            : base("azure:apimanagement/redisCache:RedisCache", name, args ?? new RedisCacheArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RedisCache(string name, Input<string> id, RedisCacheState? state = null, CustomResourceOptions? options = null)
            : base("azure:apimanagement/redisCache:RedisCache", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RedisCache resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RedisCache Get(string name, Input<string> id, RedisCacheState? state = null, CustomResourceOptions? options = null)
        {
            return new RedisCache(name, id, state, options);
        }
    }

    public sealed class RedisCacheArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource ID of the Api Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
        /// </summary>
        [Input("apiManagementId", required: true)]
        public Input<string> ApiManagementId { get; set; } = null!;

        /// <summary>
        /// The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
        /// </summary>
        [Input("cacheLocation")]
        public Input<string>? CacheLocation { get; set; }

        /// <summary>
        /// The connection string to the Cache for Redis.
        /// </summary>
        [Input("connectionString", required: true)]
        public Input<string> ConnectionString { get; set; } = null!;

        /// <summary>
        /// The description of the API Management Redis Cache.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The resource ID of the Cache for Redis.
        /// </summary>
        [Input("redisCacheId")]
        public Input<string>? RedisCacheId { get; set; }

        public RedisCacheArgs()
        {
        }
    }

    public sealed class RedisCacheState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource ID of the Api Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
        /// </summary>
        [Input("apiManagementId")]
        public Input<string>? ApiManagementId { get; set; }

        /// <summary>
        /// The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
        /// </summary>
        [Input("cacheLocation")]
        public Input<string>? CacheLocation { get; set; }

        /// <summary>
        /// The connection string to the Cache for Redis.
        /// </summary>
        [Input("connectionString")]
        public Input<string>? ConnectionString { get; set; }

        /// <summary>
        /// The description of the API Management Redis Cache.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The resource ID of the Cache for Redis.
        /// </summary>
        [Input("redisCacheId")]
        public Input<string>? RedisCacheId { get; set; }

        public RedisCacheState()
        {
        }
    }
}