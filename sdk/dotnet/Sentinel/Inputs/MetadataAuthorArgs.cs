// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel.Inputs
{

    public sealed class MetadataAuthorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The email address of the author contact.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// The link for author/vendor page.
        /// </summary>
        [Input("link")]
        public Input<string>? Link { get; set; }

        /// <summary>
        /// The name of the author, company or person.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public MetadataAuthorArgs()
        {
        }
        public static new MetadataAuthorArgs Empty => new MetadataAuthorArgs();
    }
}