// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupContainerGpuLimit {
    /**
     * @return The number of GPUs which should be assigned to this container. Allowed values are `1`, `2`, or `4`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer count;
    /**
     * @return The SKU which should be used for the GPU. Possible values are `K80`, `P100`, or `V100`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String sku;

    @CustomType.Constructor
    private GroupContainerGpuLimit(
        @CustomType.Parameter("count") @Nullable Integer count,
        @CustomType.Parameter("sku") @Nullable String sku) {
        this.count = count;
        this.sku = sku;
    }

    /**
     * @return The number of GPUs which should be assigned to this container. Allowed values are `1`, `2`, or `4`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return The SKU which should be used for the GPU. Possible values are `K80`, `P100`, or `V100`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupContainerGpuLimit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupContainerGpuLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.sku = defaults.sku;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }        public GroupContainerGpuLimit build() {
            return new GroupContainerGpuLimit(count, sku);
        }
    }
}