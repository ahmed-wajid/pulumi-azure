// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Inputs
{

    public sealed class GetPoolStartTaskUserIdentityArgs : Pulumi.InvokeArgs
    {
        [Input("autoUsers", required: true)]
        private List<Inputs.GetPoolStartTaskUserIdentityAutoUserArgs>? _autoUsers;

        /// <summary>
        /// A `auto_user` block that describes the user identity under which the start task runs.
        /// </summary>
        public List<Inputs.GetPoolStartTaskUserIdentityAutoUserArgs> AutoUsers
        {
            get => _autoUsers ?? (_autoUsers = new List<Inputs.GetPoolStartTaskUserIdentityAutoUserArgs>());
            set => _autoUsers = value;
        }

        /// <summary>
        /// The user name to log into the registry server.
        /// </summary>
        [Input("userName", required: true)]
        public string UserName { get; set; } = null!;

        public GetPoolStartTaskUserIdentityArgs()
        {
        }
    }
}