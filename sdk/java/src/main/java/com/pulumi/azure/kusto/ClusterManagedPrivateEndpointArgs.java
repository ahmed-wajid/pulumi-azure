// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterManagedPrivateEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterManagedPrivateEndpointArgs Empty = new ClusterManagedPrivateEndpointArgs();

    /**
     * The name of the Kusto Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the Kusto Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The group id in which the managed private endpoint is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return The group id in which the managed private endpoint is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * The name of the Managed Private Endpoints to create. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Managed Private Endpoints to create. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ARM resource ID of the resource for which the managed private endpoint is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="privateLinkResourceId", required=true)
    private Output<String> privateLinkResourceId;

    /**
     * @return The ARM resource ID of the resource for which the managed private endpoint is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * The region of the resource to which the managed private endpoint is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="privateLinkResourceRegion")
    private @Nullable Output<String> privateLinkResourceRegion;

    /**
     * @return The region of the resource to which the managed private endpoint is created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> privateLinkResourceRegion() {
        return Optional.ofNullable(this.privateLinkResourceRegion);
    }

    /**
     * The user request message.
     * 
     */
    @Import(name="requestMessage")
    private @Nullable Output<String> requestMessage;

    /**
     * @return The user request message.
     * 
     */
    public Optional<Output<String>> requestMessage() {
        return Optional.ofNullable(this.requestMessage);
    }

    /**
     * Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ClusterManagedPrivateEndpointArgs() {}

    private ClusterManagedPrivateEndpointArgs(ClusterManagedPrivateEndpointArgs $) {
        this.clusterName = $.clusterName;
        this.groupId = $.groupId;
        this.name = $.name;
        this.privateLinkResourceId = $.privateLinkResourceId;
        this.privateLinkResourceRegion = $.privateLinkResourceRegion;
        this.requestMessage = $.requestMessage;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterManagedPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterManagedPrivateEndpointArgs $;

        public Builder() {
            $ = new ClusterManagedPrivateEndpointArgs();
        }

        public Builder(ClusterManagedPrivateEndpointArgs defaults) {
            $ = new ClusterManagedPrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Kusto Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Kusto Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param groupId The group id in which the managed private endpoint is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The group id in which the managed private endpoint is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param name The name of the Managed Private Endpoints to create. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Managed Private Endpoints to create. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateLinkResourceId The ARM resource ID of the resource for which the managed private endpoint is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(Output<String> privateLinkResourceId) {
            $.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        /**
         * @param privateLinkResourceId The ARM resource ID of the resource for which the managed private endpoint is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(String privateLinkResourceId) {
            return privateLinkResourceId(Output.of(privateLinkResourceId));
        }

        /**
         * @param privateLinkResourceRegion The region of the resource to which the managed private endpoint is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceRegion(@Nullable Output<String> privateLinkResourceRegion) {
            $.privateLinkResourceRegion = privateLinkResourceRegion;
            return this;
        }

        /**
         * @param privateLinkResourceRegion The region of the resource to which the managed private endpoint is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceRegion(String privateLinkResourceRegion) {
            return privateLinkResourceRegion(Output.of(privateLinkResourceRegion));
        }

        /**
         * @param requestMessage The user request message.
         * 
         * @return builder
         * 
         */
        public Builder requestMessage(@Nullable Output<String> requestMessage) {
            $.requestMessage = requestMessage;
            return this;
        }

        /**
         * @param requestMessage The user request message.
         * 
         * @return builder
         * 
         */
        public Builder requestMessage(String requestMessage) {
            return requestMessage(Output.of(requestMessage));
        }

        /**
         * @param resourceGroupName Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ClusterManagedPrivateEndpointArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.privateLinkResourceId = Objects.requireNonNull($.privateLinkResourceId, "expected parameter 'privateLinkResourceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}