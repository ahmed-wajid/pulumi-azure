// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterAutoScalerProfile {
    /**
     * @return Detect similar node groups and balance the number of nodes between them. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean balanceSimilarNodeGroups;
    /**
     * @return Maximum number of empty nodes that can be deleted at the same time. Defaults to `10`.
     * 
     */
    private final @Nullable String emptyBulkDeleteMax;
    /**
     * @return Expander to use. Possible values are `least-waste`, `priority`, `most-pods` and `random`. Defaults to `random`.
     * 
     */
    private final @Nullable String expander;
    /**
     * @return Maximum number of seconds the cluster autoscaler waits for pod termination when trying to scale down a node. Defaults to `600`.
     * 
     */
    private final @Nullable String maxGracefulTerminationSec;
    /**
     * @return Maximum time the autoscaler waits for a node to be provisioned. Defaults to `15m`.
     * 
     */
    private final @Nullable String maxNodeProvisioningTime;
    /**
     * @return Maximum Number of allowed unready nodes. Defaults to `3`.
     * 
     */
    private final @Nullable Integer maxUnreadyNodes;
    /**
     * @return Maximum percentage of unready nodes the cluster autoscaler will stop if the percentage is exceeded. Defaults to `45`.
     * 
     */
    private final @Nullable Double maxUnreadyPercentage;
    /**
     * @return For scenarios like burst/batch scale where you don&#39;t want CA to act before the kubernetes scheduler could schedule all the pods, you can tell CA to ignore unscheduled pods before they&#39;re a certain age. Defaults to `10s`.
     * 
     */
    private final @Nullable String newPodScaleUpDelay;
    /**
     * @return How long after the scale up of AKS nodes the scale down evaluation resumes. Defaults to `10m`.
     * 
     */
    private final @Nullable String scaleDownDelayAfterAdd;
    /**
     * @return How long after node deletion that scale down evaluation resumes. Defaults to the value used for `scan_interval`.
     * 
     */
    private final @Nullable String scaleDownDelayAfterDelete;
    /**
     * @return How long after scale down failure that scale down evaluation resumes. Defaults to `3m`.
     * 
     */
    private final @Nullable String scaleDownDelayAfterFailure;
    /**
     * @return How long a node should be unneeded before it is eligible for scale down. Defaults to `10m`.
     * 
     */
    private final @Nullable String scaleDownUnneeded;
    /**
     * @return How long an unready node should be unneeded before it is eligible for scale down. Defaults to `20m`.
     * 
     */
    private final @Nullable String scaleDownUnready;
    /**
     * @return Node utilization level, defined as sum of requested resources divided by capacity, below which a node can be considered for scale down. Defaults to `0.5`.
     * 
     */
    private final @Nullable String scaleDownUtilizationThreshold;
    /**
     * @return How often the AKS Cluster should be re-evaluated for scale up/down. Defaults to `10s`.
     * 
     */
    private final @Nullable String scanInterval;
    /**
     * @return If `true` cluster autoscaler will never delete nodes with pods with local storage, for example, EmptyDir or HostPath. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean skipNodesWithLocalStorage;
    /**
     * @return If `true` cluster autoscaler will never delete nodes with pods from kube-system (except for DaemonSet or mirror pods). Defaults to `true`.
     * 
     */
    private final @Nullable Boolean skipNodesWithSystemPods;

    @CustomType.Constructor
    private KubernetesClusterAutoScalerProfile(
        @CustomType.Parameter("balanceSimilarNodeGroups") @Nullable Boolean balanceSimilarNodeGroups,
        @CustomType.Parameter("emptyBulkDeleteMax") @Nullable String emptyBulkDeleteMax,
        @CustomType.Parameter("expander") @Nullable String expander,
        @CustomType.Parameter("maxGracefulTerminationSec") @Nullable String maxGracefulTerminationSec,
        @CustomType.Parameter("maxNodeProvisioningTime") @Nullable String maxNodeProvisioningTime,
        @CustomType.Parameter("maxUnreadyNodes") @Nullable Integer maxUnreadyNodes,
        @CustomType.Parameter("maxUnreadyPercentage") @Nullable Double maxUnreadyPercentage,
        @CustomType.Parameter("newPodScaleUpDelay") @Nullable String newPodScaleUpDelay,
        @CustomType.Parameter("scaleDownDelayAfterAdd") @Nullable String scaleDownDelayAfterAdd,
        @CustomType.Parameter("scaleDownDelayAfterDelete") @Nullable String scaleDownDelayAfterDelete,
        @CustomType.Parameter("scaleDownDelayAfterFailure") @Nullable String scaleDownDelayAfterFailure,
        @CustomType.Parameter("scaleDownUnneeded") @Nullable String scaleDownUnneeded,
        @CustomType.Parameter("scaleDownUnready") @Nullable String scaleDownUnready,
        @CustomType.Parameter("scaleDownUtilizationThreshold") @Nullable String scaleDownUtilizationThreshold,
        @CustomType.Parameter("scanInterval") @Nullable String scanInterval,
        @CustomType.Parameter("skipNodesWithLocalStorage") @Nullable Boolean skipNodesWithLocalStorage,
        @CustomType.Parameter("skipNodesWithSystemPods") @Nullable Boolean skipNodesWithSystemPods) {
        this.balanceSimilarNodeGroups = balanceSimilarNodeGroups;
        this.emptyBulkDeleteMax = emptyBulkDeleteMax;
        this.expander = expander;
        this.maxGracefulTerminationSec = maxGracefulTerminationSec;
        this.maxNodeProvisioningTime = maxNodeProvisioningTime;
        this.maxUnreadyNodes = maxUnreadyNodes;
        this.maxUnreadyPercentage = maxUnreadyPercentage;
        this.newPodScaleUpDelay = newPodScaleUpDelay;
        this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
        this.scaleDownDelayAfterDelete = scaleDownDelayAfterDelete;
        this.scaleDownDelayAfterFailure = scaleDownDelayAfterFailure;
        this.scaleDownUnneeded = scaleDownUnneeded;
        this.scaleDownUnready = scaleDownUnready;
        this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
        this.scanInterval = scanInterval;
        this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
        this.skipNodesWithSystemPods = skipNodesWithSystemPods;
    }

    /**
     * @return Detect similar node groups and balance the number of nodes between them. Defaults to `false`.
     * 
     */
    public Optional<Boolean> balanceSimilarNodeGroups() {
        return Optional.ofNullable(this.balanceSimilarNodeGroups);
    }
    /**
     * @return Maximum number of empty nodes that can be deleted at the same time. Defaults to `10`.
     * 
     */
    public Optional<String> emptyBulkDeleteMax() {
        return Optional.ofNullable(this.emptyBulkDeleteMax);
    }
    /**
     * @return Expander to use. Possible values are `least-waste`, `priority`, `most-pods` and `random`. Defaults to `random`.
     * 
     */
    public Optional<String> expander() {
        return Optional.ofNullable(this.expander);
    }
    /**
     * @return Maximum number of seconds the cluster autoscaler waits for pod termination when trying to scale down a node. Defaults to `600`.
     * 
     */
    public Optional<String> maxGracefulTerminationSec() {
        return Optional.ofNullable(this.maxGracefulTerminationSec);
    }
    /**
     * @return Maximum time the autoscaler waits for a node to be provisioned. Defaults to `15m`.
     * 
     */
    public Optional<String> maxNodeProvisioningTime() {
        return Optional.ofNullable(this.maxNodeProvisioningTime);
    }
    /**
     * @return Maximum Number of allowed unready nodes. Defaults to `3`.
     * 
     */
    public Optional<Integer> maxUnreadyNodes() {
        return Optional.ofNullable(this.maxUnreadyNodes);
    }
    /**
     * @return Maximum percentage of unready nodes the cluster autoscaler will stop if the percentage is exceeded. Defaults to `45`.
     * 
     */
    public Optional<Double> maxUnreadyPercentage() {
        return Optional.ofNullable(this.maxUnreadyPercentage);
    }
    /**
     * @return For scenarios like burst/batch scale where you don&#39;t want CA to act before the kubernetes scheduler could schedule all the pods, you can tell CA to ignore unscheduled pods before they&#39;re a certain age. Defaults to `10s`.
     * 
     */
    public Optional<String> newPodScaleUpDelay() {
        return Optional.ofNullable(this.newPodScaleUpDelay);
    }
    /**
     * @return How long after the scale up of AKS nodes the scale down evaluation resumes. Defaults to `10m`.
     * 
     */
    public Optional<String> scaleDownDelayAfterAdd() {
        return Optional.ofNullable(this.scaleDownDelayAfterAdd);
    }
    /**
     * @return How long after node deletion that scale down evaluation resumes. Defaults to the value used for `scan_interval`.
     * 
     */
    public Optional<String> scaleDownDelayAfterDelete() {
        return Optional.ofNullable(this.scaleDownDelayAfterDelete);
    }
    /**
     * @return How long after scale down failure that scale down evaluation resumes. Defaults to `3m`.
     * 
     */
    public Optional<String> scaleDownDelayAfterFailure() {
        return Optional.ofNullable(this.scaleDownDelayAfterFailure);
    }
    /**
     * @return How long a node should be unneeded before it is eligible for scale down. Defaults to `10m`.
     * 
     */
    public Optional<String> scaleDownUnneeded() {
        return Optional.ofNullable(this.scaleDownUnneeded);
    }
    /**
     * @return How long an unready node should be unneeded before it is eligible for scale down. Defaults to `20m`.
     * 
     */
    public Optional<String> scaleDownUnready() {
        return Optional.ofNullable(this.scaleDownUnready);
    }
    /**
     * @return Node utilization level, defined as sum of requested resources divided by capacity, below which a node can be considered for scale down. Defaults to `0.5`.
     * 
     */
    public Optional<String> scaleDownUtilizationThreshold() {
        return Optional.ofNullable(this.scaleDownUtilizationThreshold);
    }
    /**
     * @return How often the AKS Cluster should be re-evaluated for scale up/down. Defaults to `10s`.
     * 
     */
    public Optional<String> scanInterval() {
        return Optional.ofNullable(this.scanInterval);
    }
    /**
     * @return If `true` cluster autoscaler will never delete nodes with pods with local storage, for example, EmptyDir or HostPath. Defaults to `true`.
     * 
     */
    public Optional<Boolean> skipNodesWithLocalStorage() {
        return Optional.ofNullable(this.skipNodesWithLocalStorage);
    }
    /**
     * @return If `true` cluster autoscaler will never delete nodes with pods from kube-system (except for DaemonSet or mirror pods). Defaults to `true`.
     * 
     */
    public Optional<Boolean> skipNodesWithSystemPods() {
        return Optional.ofNullable(this.skipNodesWithSystemPods);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterAutoScalerProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean balanceSimilarNodeGroups;
        private @Nullable String emptyBulkDeleteMax;
        private @Nullable String expander;
        private @Nullable String maxGracefulTerminationSec;
        private @Nullable String maxNodeProvisioningTime;
        private @Nullable Integer maxUnreadyNodes;
        private @Nullable Double maxUnreadyPercentage;
        private @Nullable String newPodScaleUpDelay;
        private @Nullable String scaleDownDelayAfterAdd;
        private @Nullable String scaleDownDelayAfterDelete;
        private @Nullable String scaleDownDelayAfterFailure;
        private @Nullable String scaleDownUnneeded;
        private @Nullable String scaleDownUnready;
        private @Nullable String scaleDownUtilizationThreshold;
        private @Nullable String scanInterval;
        private @Nullable Boolean skipNodesWithLocalStorage;
        private @Nullable Boolean skipNodesWithSystemPods;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterAutoScalerProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.balanceSimilarNodeGroups = defaults.balanceSimilarNodeGroups;
    	      this.emptyBulkDeleteMax = defaults.emptyBulkDeleteMax;
    	      this.expander = defaults.expander;
    	      this.maxGracefulTerminationSec = defaults.maxGracefulTerminationSec;
    	      this.maxNodeProvisioningTime = defaults.maxNodeProvisioningTime;
    	      this.maxUnreadyNodes = defaults.maxUnreadyNodes;
    	      this.maxUnreadyPercentage = defaults.maxUnreadyPercentage;
    	      this.newPodScaleUpDelay = defaults.newPodScaleUpDelay;
    	      this.scaleDownDelayAfterAdd = defaults.scaleDownDelayAfterAdd;
    	      this.scaleDownDelayAfterDelete = defaults.scaleDownDelayAfterDelete;
    	      this.scaleDownDelayAfterFailure = defaults.scaleDownDelayAfterFailure;
    	      this.scaleDownUnneeded = defaults.scaleDownUnneeded;
    	      this.scaleDownUnready = defaults.scaleDownUnready;
    	      this.scaleDownUtilizationThreshold = defaults.scaleDownUtilizationThreshold;
    	      this.scanInterval = defaults.scanInterval;
    	      this.skipNodesWithLocalStorage = defaults.skipNodesWithLocalStorage;
    	      this.skipNodesWithSystemPods = defaults.skipNodesWithSystemPods;
        }

        public Builder balanceSimilarNodeGroups(@Nullable Boolean balanceSimilarNodeGroups) {
            this.balanceSimilarNodeGroups = balanceSimilarNodeGroups;
            return this;
        }
        public Builder emptyBulkDeleteMax(@Nullable String emptyBulkDeleteMax) {
            this.emptyBulkDeleteMax = emptyBulkDeleteMax;
            return this;
        }
        public Builder expander(@Nullable String expander) {
            this.expander = expander;
            return this;
        }
        public Builder maxGracefulTerminationSec(@Nullable String maxGracefulTerminationSec) {
            this.maxGracefulTerminationSec = maxGracefulTerminationSec;
            return this;
        }
        public Builder maxNodeProvisioningTime(@Nullable String maxNodeProvisioningTime) {
            this.maxNodeProvisioningTime = maxNodeProvisioningTime;
            return this;
        }
        public Builder maxUnreadyNodes(@Nullable Integer maxUnreadyNodes) {
            this.maxUnreadyNodes = maxUnreadyNodes;
            return this;
        }
        public Builder maxUnreadyPercentage(@Nullable Double maxUnreadyPercentage) {
            this.maxUnreadyPercentage = maxUnreadyPercentage;
            return this;
        }
        public Builder newPodScaleUpDelay(@Nullable String newPodScaleUpDelay) {
            this.newPodScaleUpDelay = newPodScaleUpDelay;
            return this;
        }
        public Builder scaleDownDelayAfterAdd(@Nullable String scaleDownDelayAfterAdd) {
            this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
            return this;
        }
        public Builder scaleDownDelayAfterDelete(@Nullable String scaleDownDelayAfterDelete) {
            this.scaleDownDelayAfterDelete = scaleDownDelayAfterDelete;
            return this;
        }
        public Builder scaleDownDelayAfterFailure(@Nullable String scaleDownDelayAfterFailure) {
            this.scaleDownDelayAfterFailure = scaleDownDelayAfterFailure;
            return this;
        }
        public Builder scaleDownUnneeded(@Nullable String scaleDownUnneeded) {
            this.scaleDownUnneeded = scaleDownUnneeded;
            return this;
        }
        public Builder scaleDownUnready(@Nullable String scaleDownUnready) {
            this.scaleDownUnready = scaleDownUnready;
            return this;
        }
        public Builder scaleDownUtilizationThreshold(@Nullable String scaleDownUtilizationThreshold) {
            this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
            return this;
        }
        public Builder scanInterval(@Nullable String scanInterval) {
            this.scanInterval = scanInterval;
            return this;
        }
        public Builder skipNodesWithLocalStorage(@Nullable Boolean skipNodesWithLocalStorage) {
            this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
            return this;
        }
        public Builder skipNodesWithSystemPods(@Nullable Boolean skipNodesWithSystemPods) {
            this.skipNodesWithSystemPods = skipNodesWithSystemPods;
            return this;
        }        public KubernetesClusterAutoScalerProfile build() {
            return new KubernetesClusterAutoScalerProfile(balanceSimilarNodeGroups, emptyBulkDeleteMax, expander, maxGracefulTerminationSec, maxNodeProvisioningTime, maxUnreadyNodes, maxUnreadyPercentage, newPodScaleUpDelay, scaleDownDelayAfterAdd, scaleDownDelayAfterDelete, scaleDownDelayAfterFailure, scaleDownUnneeded, scaleDownUnready, scaleDownUtilizationThreshold, scanInterval, skipNodesWithLocalStorage, skipNodesWithSystemPods);
        }
    }
}