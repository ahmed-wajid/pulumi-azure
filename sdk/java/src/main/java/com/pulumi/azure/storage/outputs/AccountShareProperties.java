// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.AccountSharePropertiesCorsRule;
import com.pulumi.azure.storage.outputs.AccountSharePropertiesRetentionPolicy;
import com.pulumi.azure.storage.outputs.AccountSharePropertiesSmb;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountShareProperties {
    /**
     * @return A `cors_rule` block as defined below.
     * 
     */
    private final @Nullable List<AccountSharePropertiesCorsRule> corsRules;
    /**
     * @return A `retention_policy` block as defined below.
     * 
     */
    private final @Nullable AccountSharePropertiesRetentionPolicy retentionPolicy;
    /**
     * @return A `smb` block as defined below.
     * 
     */
    private final @Nullable AccountSharePropertiesSmb smb;

    @CustomType.Constructor
    private AccountShareProperties(
        @CustomType.Parameter("corsRules") @Nullable List<AccountSharePropertiesCorsRule> corsRules,
        @CustomType.Parameter("retentionPolicy") @Nullable AccountSharePropertiesRetentionPolicy retentionPolicy,
        @CustomType.Parameter("smb") @Nullable AccountSharePropertiesSmb smb) {
        this.corsRules = corsRules;
        this.retentionPolicy = retentionPolicy;
        this.smb = smb;
    }

    /**
     * @return A `cors_rule` block as defined below.
     * 
     */
    public List<AccountSharePropertiesCorsRule> corsRules() {
        return this.corsRules == null ? List.of() : this.corsRules;
    }
    /**
     * @return A `retention_policy` block as defined below.
     * 
     */
    public Optional<AccountSharePropertiesRetentionPolicy> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }
    /**
     * @return A `smb` block as defined below.
     * 
     */
    public Optional<AccountSharePropertiesSmb> smb() {
        return Optional.ofNullable(this.smb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountShareProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AccountSharePropertiesCorsRule> corsRules;
        private @Nullable AccountSharePropertiesRetentionPolicy retentionPolicy;
        private @Nullable AccountSharePropertiesSmb smb;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountShareProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsRules = defaults.corsRules;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.smb = defaults.smb;
        }

        public Builder corsRules(@Nullable List<AccountSharePropertiesCorsRule> corsRules) {
            this.corsRules = corsRules;
            return this;
        }
        public Builder corsRules(AccountSharePropertiesCorsRule... corsRules) {
            return corsRules(List.of(corsRules));
        }
        public Builder retentionPolicy(@Nullable AccountSharePropertiesRetentionPolicy retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public Builder smb(@Nullable AccountSharePropertiesSmb smb) {
            this.smb = smb;
            return this;
        }        public AccountShareProperties build() {
            return new AccountShareProperties(corsRules, retentionPolicy, smb);
        }
    }
}