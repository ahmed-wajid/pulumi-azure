// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackendAddressPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackendAddressPoolArgs Empty = new GetBackendAddressPoolArgs();

    /**
     * The ID of the Load Balancer in which the Backend Address Pool exists.
     * 
     */
    @Import(name="loadbalancerId", required=true)
    private Output<String> loadbalancerId;

    /**
     * @return The ID of the Load Balancer in which the Backend Address Pool exists.
     * 
     */
    public Output<String> loadbalancerId() {
        return this.loadbalancerId;
    }

    /**
     * Specifies the name of the Backend Address Pool.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Backend Address Pool.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetBackendAddressPoolArgs() {}

    private GetBackendAddressPoolArgs(GetBackendAddressPoolArgs $) {
        this.loadbalancerId = $.loadbalancerId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackendAddressPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackendAddressPoolArgs $;

        public Builder() {
            $ = new GetBackendAddressPoolArgs();
        }

        public Builder(GetBackendAddressPoolArgs defaults) {
            $ = new GetBackendAddressPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param loadbalancerId The ID of the Load Balancer in which the Backend Address Pool exists.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(Output<String> loadbalancerId) {
            $.loadbalancerId = loadbalancerId;
            return this;
        }

        /**
         * @param loadbalancerId The ID of the Load Balancer in which the Backend Address Pool exists.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(String loadbalancerId) {
            return loadbalancerId(Output.of(loadbalancerId));
        }

        /**
         * @param name Specifies the name of the Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetBackendAddressPoolArgs build() {
            $.loadbalancerId = Objects.requireNonNull($.loadbalancerId, "expected parameter 'loadbalancerId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}