// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.HadoopClusterRolesEdgeNode;
import com.pulumi.azure.hdinsight.outputs.HadoopClusterRolesHeadNode;
import com.pulumi.azure.hdinsight.outputs.HadoopClusterRolesWorkerNode;
import com.pulumi.azure.hdinsight.outputs.HadoopClusterRolesZookeeperNode;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HadoopClusterRoles {
    /**
     * @return A `edge_node` block as defined below.
     * 
     */
    private final @Nullable HadoopClusterRolesEdgeNode edgeNode;
    /**
     * @return A `head_node` block as defined above.
     * 
     */
    private final HadoopClusterRolesHeadNode headNode;
    /**
     * @return A `worker_node` block as defined below.
     * 
     */
    private final HadoopClusterRolesWorkerNode workerNode;
    /**
     * @return A `zookeeper_node` block as defined below.
     * 
     */
    private final HadoopClusterRolesZookeeperNode zookeeperNode;

    @CustomType.Constructor
    private HadoopClusterRoles(
        @CustomType.Parameter("edgeNode") @Nullable HadoopClusterRolesEdgeNode edgeNode,
        @CustomType.Parameter("headNode") HadoopClusterRolesHeadNode headNode,
        @CustomType.Parameter("workerNode") HadoopClusterRolesWorkerNode workerNode,
        @CustomType.Parameter("zookeeperNode") HadoopClusterRolesZookeeperNode zookeeperNode) {
        this.edgeNode = edgeNode;
        this.headNode = headNode;
        this.workerNode = workerNode;
        this.zookeeperNode = zookeeperNode;
    }

    /**
     * @return A `edge_node` block as defined below.
     * 
     */
    public Optional<HadoopClusterRolesEdgeNode> edgeNode() {
        return Optional.ofNullable(this.edgeNode);
    }
    /**
     * @return A `head_node` block as defined above.
     * 
     */
    public HadoopClusterRolesHeadNode headNode() {
        return this.headNode;
    }
    /**
     * @return A `worker_node` block as defined below.
     * 
     */
    public HadoopClusterRolesWorkerNode workerNode() {
        return this.workerNode;
    }
    /**
     * @return A `zookeeper_node` block as defined below.
     * 
     */
    public HadoopClusterRolesZookeeperNode zookeeperNode() {
        return this.zookeeperNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HadoopClusterRoles defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HadoopClusterRolesEdgeNode edgeNode;
        private HadoopClusterRolesHeadNode headNode;
        private HadoopClusterRolesWorkerNode workerNode;
        private HadoopClusterRolesZookeeperNode zookeeperNode;

        public Builder() {
    	      // Empty
        }

        public Builder(HadoopClusterRoles defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edgeNode = defaults.edgeNode;
    	      this.headNode = defaults.headNode;
    	      this.workerNode = defaults.workerNode;
    	      this.zookeeperNode = defaults.zookeeperNode;
        }

        public Builder edgeNode(@Nullable HadoopClusterRolesEdgeNode edgeNode) {
            this.edgeNode = edgeNode;
            return this;
        }
        public Builder headNode(HadoopClusterRolesHeadNode headNode) {
            this.headNode = Objects.requireNonNull(headNode);
            return this;
        }
        public Builder workerNode(HadoopClusterRolesWorkerNode workerNode) {
            this.workerNode = Objects.requireNonNull(workerNode);
            return this;
        }
        public Builder zookeeperNode(HadoopClusterRolesZookeeperNode zookeeperNode) {
            this.zookeeperNode = Objects.requireNonNull(zookeeperNode);
            return this;
        }        public HadoopClusterRoles build() {
            return new HadoopClusterRoles(edgeNode, headNode, workerNode, zookeeperNode);
        }
    }
}