// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProductTagState extends com.pulumi.resources.ResourceArgs {

    public static final ProductTagState Empty = new ProductTagState();

    /**
     * The name of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementName")
    private @Nullable Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> apiManagementName() {
        return Optional.ofNullable(this.apiManagementName);
    }

    /**
     * The name of the API Management product. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementProductId")
    private @Nullable Output<String> apiManagementProductId;

    /**
     * @return The name of the API Management product. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> apiManagementProductId() {
        return Optional.ofNullable(this.apiManagementProductId);
    }

    /**
     * The name which should be used for this API Management Tag. Changing this forces a new API Management Tag to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this API Management Tag. Changing this forces a new API Management Tag to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group in which the API Management Service should be exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the API Management Service should be exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private ProductTagState() {}

    private ProductTagState(ProductTagState $) {
        this.apiManagementName = $.apiManagementName;
        this.apiManagementProductId = $.apiManagementProductId;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProductTagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProductTagState $;

        public Builder() {
            $ = new ProductTagState();
        }

        public Builder(ProductTagState defaults) {
            $ = new ProductTagState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The name of the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(@Nullable Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The name of the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param apiManagementProductId The name of the API Management product. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementProductId(@Nullable Output<String> apiManagementProductId) {
            $.apiManagementProductId = apiManagementProductId;
            return this;
        }

        /**
         * @param apiManagementProductId The name of the API Management product. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementProductId(String apiManagementProductId) {
            return apiManagementProductId(Output.of(apiManagementProductId));
        }

        /**
         * @param name The name which should be used for this API Management Tag. Changing this forces a new API Management Tag to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this API Management Tag. Changing this forces a new API Management Tag to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Service should be exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Service should be exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ProductTagState build() {
            return $;
        }
    }

}