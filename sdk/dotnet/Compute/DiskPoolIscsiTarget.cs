// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute
{
    /// <summary>
    /// Manages an iSCSI Target.
    /// 
    /// !&gt; **Note:** Each Disk Pool can have a maximum of 1 iSCSI Target.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using AzureAD = Pulumi.AzureAD;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("exampleVirtualNetwork", new Azure.Network.VirtualNetworkArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             AddressSpaces = 
    ///             {
    ///                 "10.0.0.0/16",
    ///             },
    ///         });
    ///         var exampleSubnet = new Azure.Network.Subnet("exampleSubnet", new Azure.Network.SubnetArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             VirtualNetworkName = exampleVirtualNetwork.Name,
    ///             AddressPrefixes = 
    ///             {
    ///                 "10.0.0.0/24",
    ///             },
    ///             Delegations = 
    ///             {
    ///                 new Azure.Network.Inputs.SubnetDelegationArgs
    ///                 {
    ///                     Name = "diskspool",
    ///                     ServiceDelegation = new Azure.Network.Inputs.SubnetDelegationServiceDelegationArgs
    ///                     {
    ///                         Actions = 
    ///                         {
    ///                             "Microsoft.Network/virtualNetworks/read",
    ///                         },
    ///                         Name = "Microsoft.StoragePool/diskPools",
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///         var exampleDiskPool = new Azure.Compute.DiskPool("exampleDiskPool", new Azure.Compute.DiskPoolArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             SubnetId = exampleSubnet.Id,
    ///             Zones = 
    ///             {
    ///                 "1",
    ///             },
    ///             SkuName = "Basic_B1",
    ///         });
    ///         var exampleManagedDisk = new Azure.Compute.ManagedDisk("exampleManagedDisk", new Azure.Compute.ManagedDiskArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             CreateOption = "Empty",
    ///             StorageAccountType = "Premium_LRS",
    ///             DiskSizeGb = 4,
    ///             MaxShares = 2,
    ///             Zones = 
    ///             {
    ///                 "1",
    ///             },
    ///         });
    ///         var exampleServicePrincipal = Output.Create(AzureAD.GetServicePrincipal.InvokeAsync(new AzureAD.GetServicePrincipalArgs
    ///         {
    ///             DisplayName = "StoragePool Resource Provider",
    ///         }));
    ///         var roles = 
    ///         {
    ///             "Disk Pool Operator",
    ///             "Virtual Machine Contributor",
    ///         };
    ///         var exampleAssignment = new List&lt;Azure.Authorization.Assignment&gt;();
    ///         for (var rangeIndex = 0; rangeIndex &lt; roles.Length; rangeIndex++)
    ///         {
    ///             var range = new { Value = rangeIndex };
    ///             exampleAssignment.Add(new Azure.Authorization.Assignment($"exampleAssignment-{range.Value}", new Azure.Authorization.AssignmentArgs
    ///             {
    ///                 PrincipalId = exampleServicePrincipal.Apply(exampleServicePrincipal =&gt; exampleServicePrincipal.Id),
    ///                 RoleDefinitionName = roles[range.Value],
    ///                 Scope = exampleManagedDisk.Id,
    ///             }));
    ///         }
    ///         var exampleDiskPoolManagedDiskAttachment = new Azure.Compute.DiskPoolManagedDiskAttachment("exampleDiskPoolManagedDiskAttachment", new Azure.Compute.DiskPoolManagedDiskAttachmentArgs
    ///         {
    ///             DiskPoolId = exampleDiskPool.Id,
    ///             ManagedDiskId = exampleManagedDisk.Id,
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 exampleAssignment,
    ///             },
    ///         });
    ///         var exampleDiskPoolIscsiTarget = new Azure.Compute.DiskPoolIscsiTarget("exampleDiskPoolIscsiTarget", new Azure.Compute.DiskPoolIscsiTargetArgs
    ///         {
    ///             AclMode = "Dynamic",
    ///             DisksPoolId = exampleDiskPool.Id,
    ///             TargetIqn = "iqn.2021-11.com.microsoft:test",
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 exampleDiskPoolManagedDiskAttachment,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// iSCSI Targets can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.StoragePool/diskPools/pool1/iscsiTargets/iscsiTarget1
    /// ```
    /// </summary>
    [AzureResourceType("azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget")]
    public partial class DiskPoolIscsiTarget : Pulumi.CustomResource
    {
        /// <summary>
        /// Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Output("aclMode")]
        public Output<string> AclMode { get; private set; } = null!;

        /// <summary>
        /// The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Output("disksPoolId")]
        public Output<string> DisksPoolId { get; private set; } = null!;

        /// <summary>
        /// List of private IPv4 addresses to connect to the iSCSI Target.
        /// </summary>
        [Output("endpoints")]
        public Output<ImmutableArray<string>> Endpoints { get; private set; } = null!;

        /// <summary>
        /// The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The port used by iSCSI Target portal group.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.&lt;abc&gt;.&lt;pqr&gt;[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Output("targetIqn")]
        public Output<string?> TargetIqn { get; private set; } = null!;


        /// <summary>
        /// Create a DiskPoolIscsiTarget resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DiskPoolIscsiTarget(string name, DiskPoolIscsiTargetArgs args, CustomResourceOptions? options = null)
            : base("azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget", name, args ?? new DiskPoolIscsiTargetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DiskPoolIscsiTarget(string name, Input<string> id, DiskPoolIscsiTargetState? state = null, CustomResourceOptions? options = null)
            : base("azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DiskPoolIscsiTarget resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DiskPoolIscsiTarget Get(string name, Input<string> id, DiskPoolIscsiTargetState? state = null, CustomResourceOptions? options = null)
        {
            return new DiskPoolIscsiTarget(name, id, state, options);
        }
    }

    public sealed class DiskPoolIscsiTargetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Input("aclMode", required: true)]
        public Input<string> AclMode { get; set; } = null!;

        /// <summary>
        /// The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Input("disksPoolId", required: true)]
        public Input<string> DisksPoolId { get; set; } = null!;

        /// <summary>
        /// The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.&lt;abc&gt;.&lt;pqr&gt;[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Input("targetIqn")]
        public Input<string>? TargetIqn { get; set; }

        public DiskPoolIscsiTargetArgs()
        {
        }
    }

    public sealed class DiskPoolIscsiTargetState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Input("aclMode")]
        public Input<string>? AclMode { get; set; }

        /// <summary>
        /// The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Input("disksPoolId")]
        public Input<string>? DisksPoolId { get; set; }

        [Input("endpoints")]
        private InputList<string>? _endpoints;

        /// <summary>
        /// List of private IPv4 addresses to connect to the iSCSI Target.
        /// </summary>
        public InputList<string> Endpoints
        {
            get => _endpoints ?? (_endpoints = new InputList<string>());
            set => _endpoints = value;
        }

        /// <summary>
        /// The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The port used by iSCSI Target portal group.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.&lt;abc&gt;.&lt;pqr&gt;[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
        /// </summary>
        [Input("targetIqn")]
        public Input<string>? TargetIqn { get; set; }

        public DiskPoolIscsiTargetState()
        {
        }
    }
}