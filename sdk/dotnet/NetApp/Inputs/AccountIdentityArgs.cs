// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NetApp.Inputs
{

    public sealed class AccountIdentityArgs : global::Pulumi.ResourceArgs
    {
        [Input("identityIds")]
        private InputList<string>? _identityIds;

        /// <summary>
        /// The identity id of the user assigned identity to use when type is `UserAssigned`
        /// </summary>
        public InputList<string> IdentityIds
        {
            get => _identityIds ?? (_identityIds = new InputList<string>());
            set => _identityIds = value;
        }

        [Input("principalId")]
        public Input<string>? PrincipalId { get; set; }

        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        /// <summary>
        /// The identity type, which can be `SystemAssigned` or `UserAssigned`. Only one type at a time is supported by Azure NetApp Files.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AccountIdentityArgs()
        {
        }
        public static new AccountIdentityArgs Empty => new AccountIdentityArgs();
    }
}