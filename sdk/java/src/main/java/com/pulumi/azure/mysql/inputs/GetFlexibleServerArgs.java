// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFlexibleServerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlexibleServerArgs Empty = new GetFlexibleServerArgs();

    /**
     * Specifies the name of the MySQL Flexible Server.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the MySQL Flexible Server.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the resource group for the MySQL Flexible Server.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group for the MySQL Flexible Server.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFlexibleServerArgs() {}

    private GetFlexibleServerArgs(GetFlexibleServerArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlexibleServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlexibleServerArgs $;

        public Builder() {
            $ = new GetFlexibleServerArgs();
        }

        public Builder(GetFlexibleServerArgs defaults) {
            $ = new GetFlexibleServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the MySQL Flexible Server.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the MySQL Flexible Server.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group for the MySQL Flexible Server.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group for the MySQL Flexible Server.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetFlexibleServerArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}