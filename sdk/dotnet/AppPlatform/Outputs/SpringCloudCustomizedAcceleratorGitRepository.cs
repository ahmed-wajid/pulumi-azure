// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform.Outputs
{

    [OutputType]
    public sealed class SpringCloudCustomizedAcceleratorGitRepository
    {
        /// <summary>
        /// A `basic_auth` block as defined below. Conflicts with `git_repository.0.ssh_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        /// </summary>
        public readonly Outputs.SpringCloudCustomizedAcceleratorGitRepositoryBasicAuth? BasicAuth;
        /// <summary>
        /// Specifies the Git repository branch to be used.
        /// </summary>
        public readonly string? Branch;
        /// <summary>
        /// Specifies the Git repository commit to be used.
        /// </summary>
        public readonly string? Commit;
        /// <summary>
        /// Specifies the Git repository tag to be used.
        /// </summary>
        public readonly string? GitTag;
        /// <summary>
        /// Specifies the interval for checking for updates to Git or image repository. It should be greater than 10.
        /// </summary>
        public readonly int? IntervalInSeconds;
        /// <summary>
        /// A `ssh_auth` block as defined below. Conflicts with `git_repository.0.basic_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        /// </summary>
        public readonly Outputs.SpringCloudCustomizedAcceleratorGitRepositorySshAuth? SshAuth;
        /// <summary>
        /// Specifies Git repository URL for the accelerator.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private SpringCloudCustomizedAcceleratorGitRepository(
            Outputs.SpringCloudCustomizedAcceleratorGitRepositoryBasicAuth? basicAuth,

            string? branch,

            string? commit,

            string? gitTag,

            int? intervalInSeconds,

            Outputs.SpringCloudCustomizedAcceleratorGitRepositorySshAuth? sshAuth,

            string url)
        {
            BasicAuth = basicAuth;
            Branch = branch;
            Commit = commit;
            GitTag = gitTag;
            IntervalInSeconds = intervalInSeconds;
            SshAuth = sshAuth;
            Url = url;
        }
    }
}