// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkflowArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkflowArgs Empty = new GetWorkflowArgs();

    /**
     * The name of the Logic App Workflow.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Logic App Workflow.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Resource Group in which the Logic App Workflow exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Logic App Workflow exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetWorkflowArgs() {}

    private GetWorkflowArgs(GetWorkflowArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkflowArgs $;

        public Builder() {
            $ = new GetWorkflowArgs();
        }

        public Builder(GetWorkflowArgs defaults) {
            $ = new GetWorkflowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Logic App Workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Logic App Workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Logic App Workflow exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Logic App Workflow exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetWorkflowArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}