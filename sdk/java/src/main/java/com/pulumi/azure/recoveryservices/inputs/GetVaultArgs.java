// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVaultArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVaultArgs Empty = new GetVaultArgs();

    /**
     * Specifies the name of the Recovery Services Vault.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Recovery Services Vault.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the resource group in which the Recovery Services Vault resides.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Recovery Services Vault resides.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetVaultArgs() {}

    private GetVaultArgs(GetVaultArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVaultArgs $;

        public Builder() {
            $ = new GetVaultArgs();
        }

        public Builder(GetVaultArgs defaults) {
            $ = new GetVaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Recovery Services Vault.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Recovery Services Vault.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Recovery Services Vault resides.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Recovery Services Vault resides.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetVaultArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}