// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDomainTopicPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainTopicPlainArgs Empty = new GetDomainTopicPlainArgs();

    /**
     * The name of the EventGrid Domain Topic domain.
     * 
     */
    @Import(name="domainName", required=true)
    private String domainName;

    /**
     * @return The name of the EventGrid Domain Topic domain.
     * 
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * The name of the EventGrid Domain Topic resource.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the EventGrid Domain Topic resource.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group in which the EventGrid Domain Topic exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group in which the EventGrid Domain Topic exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDomainTopicPlainArgs() {}

    private GetDomainTopicPlainArgs(GetDomainTopicPlainArgs $) {
        this.domainName = $.domainName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainTopicPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainTopicPlainArgs $;

        public Builder() {
            $ = new GetDomainTopicPlainArgs();
        }

        public Builder(GetDomainTopicPlainArgs defaults) {
            $ = new GetDomainTopicPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName The name of the EventGrid Domain Topic domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param name The name of the EventGrid Domain Topic resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventGrid Domain Topic exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDomainTopicPlainArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}