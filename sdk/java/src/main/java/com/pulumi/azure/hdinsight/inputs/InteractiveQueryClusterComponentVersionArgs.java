// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InteractiveQueryClusterComponentVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final InteractiveQueryClusterComponentVersionArgs Empty = new InteractiveQueryClusterComponentVersionArgs();

    @Import(name="interactiveHive", required=true)
    private Output<String> interactiveHive;

    public Output<String> interactiveHive() {
        return this.interactiveHive;
    }

    private InteractiveQueryClusterComponentVersionArgs() {}

    private InteractiveQueryClusterComponentVersionArgs(InteractiveQueryClusterComponentVersionArgs $) {
        this.interactiveHive = $.interactiveHive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InteractiveQueryClusterComponentVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InteractiveQueryClusterComponentVersionArgs $;

        public Builder() {
            $ = new InteractiveQueryClusterComponentVersionArgs();
        }

        public Builder(InteractiveQueryClusterComponentVersionArgs defaults) {
            $ = new InteractiveQueryClusterComponentVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder interactiveHive(Output<String> interactiveHive) {
            $.interactiveHive = interactiveHive;
            return this;
        }

        public Builder interactiveHive(String interactiveHive) {
            return interactiveHive(Output.of(interactiveHive));
        }

        public InteractiveQueryClusterComponentVersionArgs build() {
            $.interactiveHive = Objects.requireNonNull($.interactiveHive, "expected parameter 'interactiveHive' to be non-null");
            return $;
        }
    }

}