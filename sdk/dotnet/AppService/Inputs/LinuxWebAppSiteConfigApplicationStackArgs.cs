// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class LinuxWebAppSiteConfigApplicationStackArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Docker image reference, including repository host as needed.
        /// </summary>
        [Input("dockerImage")]
        public Input<string>? DockerImage { get; set; }

        /// <summary>
        /// The image Tag to use. e.g. `latest`.
        /// </summary>
        [Input("dockerImageTag")]
        public Input<string>? DockerImageTag { get; set; }

        /// <summary>
        /// The version of .NET to use. Possible values include `3.1`, `5.0`, and `6.0`.
        /// </summary>
        [Input("dotnetVersion")]
        public Input<string>? DotnetVersion { get; set; }

        /// <summary>
        /// The Java server type. Possible values include `JAVA`, `TOMCAT`, and `JBOSSEAP`.
        /// </summary>
        [Input("javaServer")]
        public Input<string>? JavaServer { get; set; }

        /// <summary>
        /// The Version of the `java_server` to use.
        /// </summary>
        [Input("javaServerVersion")]
        public Input<string>? JavaServerVersion { get; set; }

        /// <summary>
        /// The Version of Java to use. Supported versions of Java vary depending on the `java_server` and `java_server_version`, as well as security and fixes to major versions. Please see Azure documentation for the latest information.
        /// </summary>
        [Input("javaVersion")]
        public Input<string>? JavaVersion { get; set; }

        /// <summary>
        /// The version of Node to run. Possible values include `12-lts`, `14-lts`, and `16-lts`. This property conflicts with `java_version`.
        /// </summary>
        [Input("nodeVersion")]
        public Input<string>? NodeVersion { get; set; }

        /// <summary>
        /// The version of PHP to run. Possible values include `7.4`, and `8.0`.
        /// </summary>
        [Input("phpVersion")]
        public Input<string>? PhpVersion { get; set; }

        /// <summary>
        /// The version of Python to run. Possible values include `3.7`, `3.8`, and `3.9`.
        /// </summary>
        [Input("pythonVersion")]
        public Input<string>? PythonVersion { get; set; }

        /// <summary>
        /// Te version of Ruby to run. Possible values include `2.6` and `2.7`.
        /// </summary>
        [Input("rubyVersion")]
        public Input<string>? RubyVersion { get; set; }

        public LinuxWebAppSiteConfigApplicationStackArgs()
        {
        }
    }
}