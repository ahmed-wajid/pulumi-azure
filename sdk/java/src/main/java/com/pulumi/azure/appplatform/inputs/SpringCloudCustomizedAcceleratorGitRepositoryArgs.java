// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.inputs;

import com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositorySshAuthArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudCustomizedAcceleratorGitRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudCustomizedAcceleratorGitRepositoryArgs Empty = new SpringCloudCustomizedAcceleratorGitRepositoryArgs();

    /**
     * A `basic_auth` block as defined below. Conflicts with `git_repository.0.ssh_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * 
     */
    @Import(name="basicAuth")
    private @Nullable Output<SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs> basicAuth;

    /**
     * @return A `basic_auth` block as defined below. Conflicts with `git_repository.0.ssh_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * 
     */
    public Optional<Output<SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs>> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }

    /**
     * Specifies the Git repository branch to be used.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return Specifies the Git repository branch to be used.
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * Specifies the Git repository commit to be used.
     * 
     */
    @Import(name="commit")
    private @Nullable Output<String> commit;

    /**
     * @return Specifies the Git repository commit to be used.
     * 
     */
    public Optional<Output<String>> commit() {
        return Optional.ofNullable(this.commit);
    }

    /**
     * Specifies the Git repository tag to be used.
     * 
     */
    @Import(name="gitTag")
    private @Nullable Output<String> gitTag;

    /**
     * @return Specifies the Git repository tag to be used.
     * 
     */
    public Optional<Output<String>> gitTag() {
        return Optional.ofNullable(this.gitTag);
    }

    /**
     * Specifies the interval for checking for updates to Git or image repository. It should be greater than 10.
     * 
     */
    @Import(name="intervalInSeconds")
    private @Nullable Output<Integer> intervalInSeconds;

    /**
     * @return Specifies the interval for checking for updates to Git or image repository. It should be greater than 10.
     * 
     */
    public Optional<Output<Integer>> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }

    /**
     * A `ssh_auth` block as defined below. Conflicts with `git_repository.0.basic_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * 
     */
    @Import(name="sshAuth")
    private @Nullable Output<SpringCloudCustomizedAcceleratorGitRepositorySshAuthArgs> sshAuth;

    /**
     * @return A `ssh_auth` block as defined below. Conflicts with `git_repository.0.basic_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * 
     */
    public Optional<Output<SpringCloudCustomizedAcceleratorGitRepositorySshAuthArgs>> sshAuth() {
        return Optional.ofNullable(this.sshAuth);
    }

    /**
     * Specifies Git repository URL for the accelerator.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return Specifies Git repository URL for the accelerator.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private SpringCloudCustomizedAcceleratorGitRepositoryArgs() {}

    private SpringCloudCustomizedAcceleratorGitRepositoryArgs(SpringCloudCustomizedAcceleratorGitRepositoryArgs $) {
        this.basicAuth = $.basicAuth;
        this.branch = $.branch;
        this.commit = $.commit;
        this.gitTag = $.gitTag;
        this.intervalInSeconds = $.intervalInSeconds;
        this.sshAuth = $.sshAuth;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudCustomizedAcceleratorGitRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudCustomizedAcceleratorGitRepositoryArgs $;

        public Builder() {
            $ = new SpringCloudCustomizedAcceleratorGitRepositoryArgs();
        }

        public Builder(SpringCloudCustomizedAcceleratorGitRepositoryArgs defaults) {
            $ = new SpringCloudCustomizedAcceleratorGitRepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basicAuth A `basic_auth` block as defined below. Conflicts with `git_repository.0.ssh_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
         * 
         * @return builder
         * 
         */
        public Builder basicAuth(@Nullable Output<SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs> basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        /**
         * @param basicAuth A `basic_auth` block as defined below. Conflicts with `git_repository.0.ssh_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
         * 
         * @return builder
         * 
         */
        public Builder basicAuth(SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs basicAuth) {
            return basicAuth(Output.of(basicAuth));
        }

        /**
         * @param branch Specifies the Git repository branch to be used.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch Specifies the Git repository branch to be used.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param commit Specifies the Git repository commit to be used.
         * 
         * @return builder
         * 
         */
        public Builder commit(@Nullable Output<String> commit) {
            $.commit = commit;
            return this;
        }

        /**
         * @param commit Specifies the Git repository commit to be used.
         * 
         * @return builder
         * 
         */
        public Builder commit(String commit) {
            return commit(Output.of(commit));
        }

        /**
         * @param gitTag Specifies the Git repository tag to be used.
         * 
         * @return builder
         * 
         */
        public Builder gitTag(@Nullable Output<String> gitTag) {
            $.gitTag = gitTag;
            return this;
        }

        /**
         * @param gitTag Specifies the Git repository tag to be used.
         * 
         * @return builder
         * 
         */
        public Builder gitTag(String gitTag) {
            return gitTag(Output.of(gitTag));
        }

        /**
         * @param intervalInSeconds Specifies the interval for checking for updates to Git or image repository. It should be greater than 10.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(@Nullable Output<Integer> intervalInSeconds) {
            $.intervalInSeconds = intervalInSeconds;
            return this;
        }

        /**
         * @param intervalInSeconds Specifies the interval for checking for updates to Git or image repository. It should be greater than 10.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            return intervalInSeconds(Output.of(intervalInSeconds));
        }

        /**
         * @param sshAuth A `ssh_auth` block as defined below. Conflicts with `git_repository.0.basic_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
         * 
         * @return builder
         * 
         */
        public Builder sshAuth(@Nullable Output<SpringCloudCustomizedAcceleratorGitRepositorySshAuthArgs> sshAuth) {
            $.sshAuth = sshAuth;
            return this;
        }

        /**
         * @param sshAuth A `ssh_auth` block as defined below. Conflicts with `git_repository.0.basic_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
         * 
         * @return builder
         * 
         */
        public Builder sshAuth(SpringCloudCustomizedAcceleratorGitRepositorySshAuthArgs sshAuth) {
            return sshAuth(Output.of(sshAuth));
        }

        /**
         * @param url Specifies Git repository URL for the accelerator.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Specifies Git repository URL for the accelerator.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public SpringCloudCustomizedAcceleratorGitRepositoryArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}