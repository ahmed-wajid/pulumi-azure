// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SecurityDeviceGroupAllowRule {
    /**
     * @return Specifies which IP is not allowed to be connected to in current device group for inbound connection.
     * 
     */
    private final @Nullable List<String> connectionFromIpsNotAlloweds;
    /**
     * @return Specifies which IP is not allowed to be connected to in current device group for outbound connection.
     * 
     */
    private final @Nullable List<String> connectionToIpsNotAlloweds;
    /**
     * @return Specifies which local user is not allowed to login in current device group.
     * 
     */
    private final @Nullable List<String> localUsersNotAlloweds;
    /**
     * @return Specifies which process is not allowed to be executed in current device group.
     * 
     */
    private final @Nullable List<String> processesNotAlloweds;

    @CustomType.Constructor
    private SecurityDeviceGroupAllowRule(
        @CustomType.Parameter("connectionFromIpsNotAlloweds") @Nullable List<String> connectionFromIpsNotAlloweds,
        @CustomType.Parameter("connectionToIpsNotAlloweds") @Nullable List<String> connectionToIpsNotAlloweds,
        @CustomType.Parameter("localUsersNotAlloweds") @Nullable List<String> localUsersNotAlloweds,
        @CustomType.Parameter("processesNotAlloweds") @Nullable List<String> processesNotAlloweds) {
        this.connectionFromIpsNotAlloweds = connectionFromIpsNotAlloweds;
        this.connectionToIpsNotAlloweds = connectionToIpsNotAlloweds;
        this.localUsersNotAlloweds = localUsersNotAlloweds;
        this.processesNotAlloweds = processesNotAlloweds;
    }

    /**
     * @return Specifies which IP is not allowed to be connected to in current device group for inbound connection.
     * 
     */
    public List<String> connectionFromIpsNotAlloweds() {
        return this.connectionFromIpsNotAlloweds == null ? List.of() : this.connectionFromIpsNotAlloweds;
    }
    /**
     * @return Specifies which IP is not allowed to be connected to in current device group for outbound connection.
     * 
     */
    public List<String> connectionToIpsNotAlloweds() {
        return this.connectionToIpsNotAlloweds == null ? List.of() : this.connectionToIpsNotAlloweds;
    }
    /**
     * @return Specifies which local user is not allowed to login in current device group.
     * 
     */
    public List<String> localUsersNotAlloweds() {
        return this.localUsersNotAlloweds == null ? List.of() : this.localUsersNotAlloweds;
    }
    /**
     * @return Specifies which process is not allowed to be executed in current device group.
     * 
     */
    public List<String> processesNotAlloweds() {
        return this.processesNotAlloweds == null ? List.of() : this.processesNotAlloweds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityDeviceGroupAllowRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> connectionFromIpsNotAlloweds;
        private @Nullable List<String> connectionToIpsNotAlloweds;
        private @Nullable List<String> localUsersNotAlloweds;
        private @Nullable List<String> processesNotAlloweds;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityDeviceGroupAllowRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionFromIpsNotAlloweds = defaults.connectionFromIpsNotAlloweds;
    	      this.connectionToIpsNotAlloweds = defaults.connectionToIpsNotAlloweds;
    	      this.localUsersNotAlloweds = defaults.localUsersNotAlloweds;
    	      this.processesNotAlloweds = defaults.processesNotAlloweds;
        }

        public Builder connectionFromIpsNotAlloweds(@Nullable List<String> connectionFromIpsNotAlloweds) {
            this.connectionFromIpsNotAlloweds = connectionFromIpsNotAlloweds;
            return this;
        }
        public Builder connectionFromIpsNotAlloweds(String... connectionFromIpsNotAlloweds) {
            return connectionFromIpsNotAlloweds(List.of(connectionFromIpsNotAlloweds));
        }
        public Builder connectionToIpsNotAlloweds(@Nullable List<String> connectionToIpsNotAlloweds) {
            this.connectionToIpsNotAlloweds = connectionToIpsNotAlloweds;
            return this;
        }
        public Builder connectionToIpsNotAlloweds(String... connectionToIpsNotAlloweds) {
            return connectionToIpsNotAlloweds(List.of(connectionToIpsNotAlloweds));
        }
        public Builder localUsersNotAlloweds(@Nullable List<String> localUsersNotAlloweds) {
            this.localUsersNotAlloweds = localUsersNotAlloweds;
            return this;
        }
        public Builder localUsersNotAlloweds(String... localUsersNotAlloweds) {
            return localUsersNotAlloweds(List.of(localUsersNotAlloweds));
        }
        public Builder processesNotAlloweds(@Nullable List<String> processesNotAlloweds) {
            this.processesNotAlloweds = processesNotAlloweds;
            return this;
        }
        public Builder processesNotAlloweds(String... processesNotAlloweds) {
            return processesNotAlloweds(List.of(processesNotAlloweds));
        }        public SecurityDeviceGroupAllowRule build() {
            return new SecurityDeviceGroupAllowRule(connectionFromIpsNotAlloweds, connectionToIpsNotAlloweds, localUsersNotAlloweds, processesNotAlloweds);
        }
    }
}