// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.SharedImageVersionTargetRegionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedImageVersionState extends com.pulumi.resources.ResourceArgs {

    public static final SharedImageVersionState Empty = new SharedImageVersionState();

    /**
     * Should this Image Version be excluded from the `latest` filter? If set to `true` this Image Version won&#39;t be returned for the `latest` version. Defaults to `false`.
     * 
     */
    @Import(name="excludeFromLatest")
    private @Nullable Output<Boolean> excludeFromLatest;

    /**
     * @return Should this Image Version be excluded from the `latest` filter? If set to `true` this Image Version won&#39;t be returned for the `latest` version. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> excludeFromLatest() {
        return Optional.ofNullable(this.excludeFromLatest);
    }

    /**
     * The name of the Shared Image Gallery in which the Shared Image exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="galleryName")
    private @Nullable Output<String> galleryName;

    /**
     * @return The name of the Shared Image Gallery in which the Shared Image exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> galleryName() {
        return Optional.ofNullable(this.galleryName);
    }

    /**
     * The name of the Shared Image within the Shared Image Gallery in which this Version should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="imageName")
    private @Nullable Output<String> imageName;

    /**
     * @return The name of the Shared Image within the Shared Image Gallery in which this Version should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> imageName() {
        return Optional.ofNullable(this.imageName);
    }

    /**
     * The Azure Region in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the Managed Image or Virtual Machine ID which should be used for this Shared Image Version. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="managedImageId")
    private @Nullable Output<String> managedImageId;

    /**
     * @return The ID of the Managed Image or Virtual Machine ID which should be used for this Shared Image Version. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> managedImageId() {
        return Optional.ofNullable(this.managedImageId);
    }

    /**
     * The version number for this Image Version, such as `1.0.0`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The version number for this Image Version, such as `1.0.0`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the OS disk snapshot which should be used for this Shared Image Version. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="osDiskSnapshotId")
    private @Nullable Output<String> osDiskSnapshotId;

    /**
     * @return The ID of the OS disk snapshot which should be used for this Shared Image Version. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> osDiskSnapshotId() {
        return Optional.ofNullable(this.osDiskSnapshotId);
    }

    /**
     * The name of the Resource Group in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A collection of tags which should be applied to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A collection of tags which should be applied to this resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * One or more `target_region` blocks as documented below.
     * 
     */
    @Import(name="targetRegions")
    private @Nullable Output<List<SharedImageVersionTargetRegionArgs>> targetRegions;

    /**
     * @return One or more `target_region` blocks as documented below.
     * 
     */
    public Optional<Output<List<SharedImageVersionTargetRegionArgs>>> targetRegions() {
        return Optional.ofNullable(this.targetRegions);
    }

    private SharedImageVersionState() {}

    private SharedImageVersionState(SharedImageVersionState $) {
        this.excludeFromLatest = $.excludeFromLatest;
        this.galleryName = $.galleryName;
        this.imageName = $.imageName;
        this.location = $.location;
        this.managedImageId = $.managedImageId;
        this.name = $.name;
        this.osDiskSnapshotId = $.osDiskSnapshotId;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.targetRegions = $.targetRegions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedImageVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedImageVersionState $;

        public Builder() {
            $ = new SharedImageVersionState();
        }

        public Builder(SharedImageVersionState defaults) {
            $ = new SharedImageVersionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludeFromLatest Should this Image Version be excluded from the `latest` filter? If set to `true` this Image Version won&#39;t be returned for the `latest` version. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder excludeFromLatest(@Nullable Output<Boolean> excludeFromLatest) {
            $.excludeFromLatest = excludeFromLatest;
            return this;
        }

        /**
         * @param excludeFromLatest Should this Image Version be excluded from the `latest` filter? If set to `true` this Image Version won&#39;t be returned for the `latest` version. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder excludeFromLatest(Boolean excludeFromLatest) {
            return excludeFromLatest(Output.of(excludeFromLatest));
        }

        /**
         * @param galleryName The name of the Shared Image Gallery in which the Shared Image exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder galleryName(@Nullable Output<String> galleryName) {
            $.galleryName = galleryName;
            return this;
        }

        /**
         * @param galleryName The name of the Shared Image Gallery in which the Shared Image exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder galleryName(String galleryName) {
            return galleryName(Output.of(galleryName));
        }

        /**
         * @param imageName The name of the Shared Image within the Shared Image Gallery in which this Version should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder imageName(@Nullable Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param imageName The name of the Shared Image within the Shared Image Gallery in which this Version should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        /**
         * @param location The Azure Region in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedImageId The ID of the Managed Image or Virtual Machine ID which should be used for this Shared Image Version. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedImageId(@Nullable Output<String> managedImageId) {
            $.managedImageId = managedImageId;
            return this;
        }

        /**
         * @param managedImageId The ID of the Managed Image or Virtual Machine ID which should be used for this Shared Image Version. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedImageId(String managedImageId) {
            return managedImageId(Output.of(managedImageId));
        }

        /**
         * @param name The version number for this Image Version, such as `1.0.0`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The version number for this Image Version, such as `1.0.0`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param osDiskSnapshotId The ID of the OS disk snapshot which should be used for this Shared Image Version. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder osDiskSnapshotId(@Nullable Output<String> osDiskSnapshotId) {
            $.osDiskSnapshotId = osDiskSnapshotId;
            return this;
        }

        /**
         * @param osDiskSnapshotId The ID of the OS disk snapshot which should be used for this Shared Image Version. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder osDiskSnapshotId(String osDiskSnapshotId) {
            return osDiskSnapshotId(Output.of(osDiskSnapshotId));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Shared Image Gallery exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A collection of tags which should be applied to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A collection of tags which should be applied to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param targetRegions One or more `target_region` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetRegions(@Nullable Output<List<SharedImageVersionTargetRegionArgs>> targetRegions) {
            $.targetRegions = targetRegions;
            return this;
        }

        /**
         * @param targetRegions One or more `target_region` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetRegions(List<SharedImageVersionTargetRegionArgs> targetRegions) {
            return targetRegions(Output.of(targetRegions));
        }

        /**
         * @param targetRegions One or more `target_region` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder targetRegions(SharedImageVersionTargetRegionArgs... targetRegions) {
            return targetRegions(List.of(targetRegions));
        }

        public SharedImageVersionState build() {
            return $;
        }
    }

}