// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventSubscriptionDeadLetterIdentity {
    /**
     * @return Specifies the type of Managed Service Identity that is used for dead lettering. Allowed value is `SystemAssigned`, `UserAssigned`.
     * 
     */
    private final String type;
    /**
     * @return The user identity associated with the resource.
     * 
     */
    private final @Nullable String userAssignedIdentity;

    @CustomType.Constructor
    private EventSubscriptionDeadLetterIdentity(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userAssignedIdentity") @Nullable String userAssignedIdentity) {
        this.type = type;
        this.userAssignedIdentity = userAssignedIdentity;
    }

    /**
     * @return Specifies the type of Managed Service Identity that is used for dead lettering. Allowed value is `SystemAssigned`, `UserAssigned`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The user identity associated with the resource.
     * 
     */
    public Optional<String> userAssignedIdentity() {
        return Optional.ofNullable(this.userAssignedIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionDeadLetterIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private @Nullable String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionDeadLetterIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }        public EventSubscriptionDeadLetterIdentity build() {
            return new EventSubscriptionDeadLetterIdentity(type, userAssignedIdentity);
        }
    }
}