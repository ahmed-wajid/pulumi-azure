// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.azure.batch.outputs.GetPoolStartTaskUserIdentityAutoUser;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPoolStartTaskUserIdentity {
    /**
     * @return A `auto_user` block that describes the user identity under which the start task runs.
     * 
     */
    private final List<GetPoolStartTaskUserIdentityAutoUser> autoUsers;
    /**
     * @return The user name to log into the registry server.
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private GetPoolStartTaskUserIdentity(
        @CustomType.Parameter("autoUsers") List<GetPoolStartTaskUserIdentityAutoUser> autoUsers,
        @CustomType.Parameter("userName") String userName) {
        this.autoUsers = autoUsers;
        this.userName = userName;
    }

    /**
     * @return A `auto_user` block that describes the user identity under which the start task runs.
     * 
     */
    public List<GetPoolStartTaskUserIdentityAutoUser> autoUsers() {
        return this.autoUsers;
    }
    /**
     * @return The user name to log into the registry server.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolStartTaskUserIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetPoolStartTaskUserIdentityAutoUser> autoUsers;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPoolStartTaskUserIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUsers = defaults.autoUsers;
    	      this.userName = defaults.userName;
        }

        public Builder autoUsers(List<GetPoolStartTaskUserIdentityAutoUser> autoUsers) {
            this.autoUsers = Objects.requireNonNull(autoUsers);
            return this;
        }
        public Builder autoUsers(GetPoolStartTaskUserIdentityAutoUser... autoUsers) {
            return autoUsers(List.of(autoUsers));
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetPoolStartTaskUserIdentity build() {
            return new GetPoolStartTaskUserIdentity(autoUsers, userName);
        }
    }
}