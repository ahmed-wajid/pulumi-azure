// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FailoverGroupPartnerServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final FailoverGroupPartnerServerArgs Empty = new FailoverGroupPartnerServerArgs();

    /**
     * the SQL server ID
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return the SQL server ID
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * the location of the failover group.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return the location of the failover group.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * local replication role of the failover group instance.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return local replication role of the failover group instance.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private FailoverGroupPartnerServerArgs() {}

    private FailoverGroupPartnerServerArgs(FailoverGroupPartnerServerArgs $) {
        this.id = $.id;
        this.location = $.location;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailoverGroupPartnerServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailoverGroupPartnerServerArgs $;

        public Builder() {
            $ = new FailoverGroupPartnerServerArgs();
        }

        public Builder(FailoverGroupPartnerServerArgs defaults) {
            $ = new FailoverGroupPartnerServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id the SQL server ID
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id the SQL server ID
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param location the location of the failover group.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location the location of the failover group.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param role local replication role of the failover group instance.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role local replication role of the failover group instance.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public FailoverGroupPartnerServerArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}