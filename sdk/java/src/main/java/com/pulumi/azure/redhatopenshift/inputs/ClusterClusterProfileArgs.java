// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redhatopenshift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterProfileArgs Empty = new ClusterClusterProfileArgs();

    /**
     * The custom domain for the cluster. For more info, see [Prepare a custom domain for your cluster](https://docs.microsoft.com/azure/openshift/tutorial-create-cluster#prepare-a-custom-domain-for-your-cluster-optional). Changing this forces a new resource to be created.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The custom domain for the cluster. For more info, see [Prepare a custom domain for your cluster](https://docs.microsoft.com/azure/openshift/tutorial-create-cluster#prepare-a-custom-domain-for-your-cluster-optional). Changing this forces a new resource to be created.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * Whether Federal Information Processing Standard (FIPS) validated cryptographic modules are used. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="fipsEnabled")
    private @Nullable Output<Boolean> fipsEnabled;

    /**
     * @return Whether Federal Information Processing Standard (FIPS) validated cryptographic modules are used. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> fipsEnabled() {
        return Optional.ofNullable(this.fipsEnabled);
    }

    /**
     * The Red Hat pull secret for the cluster. For more info, see [Get a Red Hat pull secret](https://learn.microsoft.com/azure/openshift/tutorial-create-cluster#get-a-red-hat-pull-secret-optional). Changing this forces a new resource to be created.
     * 
     */
    @Import(name="pullSecret")
    private @Nullable Output<String> pullSecret;

    /**
     * @return The Red Hat pull secret for the cluster. For more info, see [Get a Red Hat pull secret](https://learn.microsoft.com/azure/openshift/tutorial-create-cluster#get-a-red-hat-pull-secret-optional). Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> pullSecret() {
        return Optional.ofNullable(this.pullSecret);
    }

    /**
     * The resource group that the cluster profile is attached to.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The resource group that the cluster profile is attached to.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The version of the OpenShift cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return The version of the OpenShift cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private ClusterClusterProfileArgs() {}

    private ClusterClusterProfileArgs(ClusterClusterProfileArgs $) {
        this.domain = $.domain;
        this.fipsEnabled = $.fipsEnabled;
        this.pullSecret = $.pullSecret;
        this.resourceGroupId = $.resourceGroupId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterProfileArgs $;

        public Builder() {
            $ = new ClusterClusterProfileArgs();
        }

        public Builder(ClusterClusterProfileArgs defaults) {
            $ = new ClusterClusterProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The custom domain for the cluster. For more info, see [Prepare a custom domain for your cluster](https://docs.microsoft.com/azure/openshift/tutorial-create-cluster#prepare-a-custom-domain-for-your-cluster-optional). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The custom domain for the cluster. For more info, see [Prepare a custom domain for your cluster](https://docs.microsoft.com/azure/openshift/tutorial-create-cluster#prepare-a-custom-domain-for-your-cluster-optional). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param fipsEnabled Whether Federal Information Processing Standard (FIPS) validated cryptographic modules are used. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder fipsEnabled(@Nullable Output<Boolean> fipsEnabled) {
            $.fipsEnabled = fipsEnabled;
            return this;
        }

        /**
         * @param fipsEnabled Whether Federal Information Processing Standard (FIPS) validated cryptographic modules are used. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder fipsEnabled(Boolean fipsEnabled) {
            return fipsEnabled(Output.of(fipsEnabled));
        }

        /**
         * @param pullSecret The Red Hat pull secret for the cluster. For more info, see [Get a Red Hat pull secret](https://learn.microsoft.com/azure/openshift/tutorial-create-cluster#get-a-red-hat-pull-secret-optional). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder pullSecret(@Nullable Output<String> pullSecret) {
            $.pullSecret = pullSecret;
            return this;
        }

        /**
         * @param pullSecret The Red Hat pull secret for the cluster. For more info, see [Get a Red Hat pull secret](https://learn.microsoft.com/azure/openshift/tutorial-create-cluster#get-a-red-hat-pull-secret-optional). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder pullSecret(String pullSecret) {
            return pullSecret(Output.of(pullSecret));
        }

        /**
         * @param resourceGroupId The resource group that the cluster profile is attached to.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The resource group that the cluster profile is attached to.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param version The version of the OpenShift cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the OpenShift cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ClusterClusterProfileArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("ClusterClusterProfileArgs", "domain");
            }
            if ($.version == null) {
                throw new MissingRequiredPropertyException("ClusterClusterProfileArgs", "version");
            }
            return $;
        }
    }

}