// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class LogzSubAccountUserGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Email of the user used by Logz for contacting them if needed. A valid email address consists of an email prefix and an email domain. The prefix and domain may contain only letters, numbers, underscores, periods and dashes. Changing this forces a new logz Sub Account to be created.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// First Name of the user. Possible values must be between 1 and 50 characters in length. Changing this forces a new logz Sub Account to be created.
        /// </summary>
        [Input("firstName", required: true)]
        public Input<string> FirstName { get; set; } = null!;

        /// <summary>
        /// Last Name of the user. Possible values must be between 1 and 50 characters in length. Changing this forces a new logz Sub Account to be created.
        /// </summary>
        [Input("lastName", required: true)]
        public Input<string> LastName { get; set; } = null!;

        /// <summary>
        /// Phone number of the user used by Logz for contacting them if needed. Possible values must be between 1 and 40 characters in length. Changing this forces a new logz Sub Account to be created.
        /// </summary>
        [Input("phoneNumber", required: true)]
        public Input<string> PhoneNumber { get; set; } = null!;

        public LogzSubAccountUserGetArgs()
        {
        }
        public static new LogzSubAccountUserGetArgs Empty => new LogzSubAccountUserGetArgs();
    }
}