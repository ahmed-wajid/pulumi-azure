// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiOperationPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final ApiOperationPolicyState Empty = new ApiOperationPolicyState();

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
     * The ID of the API Management API Operation within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiName")
    private @Nullable Output<String> apiName;

    /**
     * @return The ID of the API Management API Operation within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> apiName() {
        return Optional.ofNullable(this.apiName);
    }

    /**
     * The operation identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="operationId")
    private @Nullable Output<String> operationId;

    /**
     * @return The operation identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    public Optional<Output<String>> operationId() {
        return Optional.ofNullable(this.operationId);
    }

    /**
     * The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The XML Content for this Policy.
     * 
     */
    @Import(name="xmlContent")
    private @Nullable Output<String> xmlContent;

    /**
     * @return The XML Content for this Policy.
     * 
     */
    public Optional<Output<String>> xmlContent() {
        return Optional.ofNullable(this.xmlContent);
    }

    /**
     * A link to a Policy XML Document, which must be publicly available.
     * 
     */
    @Import(name="xmlLink")
    private @Nullable Output<String> xmlLink;

    /**
     * @return A link to a Policy XML Document, which must be publicly available.
     * 
     */
    public Optional<Output<String>> xmlLink() {
        return Optional.ofNullable(this.xmlLink);
    }

    private ApiOperationPolicyState() {}

    private ApiOperationPolicyState(ApiOperationPolicyState $) {
        this.apiManagementName = $.apiManagementName;
        this.apiName = $.apiName;
        this.operationId = $.operationId;
        this.resourceGroupName = $.resourceGroupName;
        this.xmlContent = $.xmlContent;
        this.xmlLink = $.xmlLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiOperationPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiOperationPolicyState $;

        public Builder() {
            $ = new ApiOperationPolicyState();
        }

        public Builder(ApiOperationPolicyState defaults) {
            $ = new ApiOperationPolicyState(Objects.requireNonNull(defaults));
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
         * @param apiName The ID of the API Management API Operation within the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiName(@Nullable Output<String> apiName) {
            $.apiName = apiName;
            return this;
        }

        /**
         * @param apiName The ID of the API Management API Operation within the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiName(String apiName) {
            return apiName(Output.of(apiName));
        }

        /**
         * @param operationId The operation identifier within an API. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder operationId(@Nullable Output<String> operationId) {
            $.operationId = operationId;
            return this;
        }

        /**
         * @param operationId The operation identifier within an API. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder operationId(String operationId) {
            return operationId(Output.of(operationId));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param xmlContent The XML Content for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder xmlContent(@Nullable Output<String> xmlContent) {
            $.xmlContent = xmlContent;
            return this;
        }

        /**
         * @param xmlContent The XML Content for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder xmlContent(String xmlContent) {
            return xmlContent(Output.of(xmlContent));
        }

        /**
         * @param xmlLink A link to a Policy XML Document, which must be publicly available.
         * 
         * @return builder
         * 
         */
        public Builder xmlLink(@Nullable Output<String> xmlLink) {
            $.xmlLink = xmlLink;
            return this;
        }

        /**
         * @param xmlLink A link to a Policy XML Document, which must be publicly available.
         * 
         * @return builder
         * 
         */
        public Builder xmlLink(String xmlLink) {
            return xmlLink(Output.of(xmlLink));
        }

        public ApiOperationPolicyState build() {
            return $;
        }
    }

}