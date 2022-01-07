// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class RegistryTaskDockerStep
    {
        /// <summary>
        /// Specifies a map of arguments to be used when executing this step.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Arguments;
        /// <summary>
        /// Should the image cache be enabled? Defaults to `true`.
        /// </summary>
        public readonly bool? CacheEnabled;
        /// <summary>
        /// The token (Git PAT or SAS token of storage account blob) associated with the context for this step.
        /// </summary>
        public readonly string ContextAccessToken;
        /// <summary>
        /// The URL (absolute or relative) of the source context for this step.
        /// </summary>
        public readonly string ContextPath;
        /// <summary>
        /// The  Dockerfile path relative to the source context.
        /// </summary>
        public readonly string DockerfilePath;
        /// <summary>
        /// Specifies a list of fully qualified image names including the repository and tag.
        /// </summary>
        public readonly ImmutableArray<string> ImageNames;
        /// <summary>
        /// Should the image built be pushed to the registry or not? Defaults to `true`.
        /// </summary>
        public readonly bool? PushEnabled;
        /// <summary>
        /// Specifies a map of *secret* arguments to be used when executing this step.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? SecretArguments;
        /// <summary>
        /// The name of the target build stage for the docker build.
        /// </summary>
        public readonly string? Target;

        [OutputConstructor]
        private RegistryTaskDockerStep(
            ImmutableDictionary<string, string>? arguments,

            bool? cacheEnabled,

            string contextAccessToken,

            string contextPath,

            string dockerfilePath,

            ImmutableArray<string> imageNames,

            bool? pushEnabled,

            ImmutableDictionary<string, string>? secretArguments,

            string? target)
        {
            Arguments = arguments;
            CacheEnabled = cacheEnabled;
            ContextAccessToken = contextAccessToken;
            ContextPath = contextPath;
            DockerfilePath = dockerfilePath;
            ImageNames = imageNames;
            PushEnabled = pushEnabled;
            SecretArguments = secretArguments;
            Target = target;
        }
    }
}