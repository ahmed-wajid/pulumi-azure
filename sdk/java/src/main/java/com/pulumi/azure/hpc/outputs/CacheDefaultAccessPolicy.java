// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hpc.outputs;

import com.pulumi.azure.hpc.outputs.CacheDefaultAccessPolicyAccessRule;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CacheDefaultAccessPolicy {
    /**
     * @return One to three `access_rule` blocks as defined above.
     * 
     */
    private final List<CacheDefaultAccessPolicyAccessRule> accessRules;

    @CustomType.Constructor
    private CacheDefaultAccessPolicy(@CustomType.Parameter("accessRules") List<CacheDefaultAccessPolicyAccessRule> accessRules) {
        this.accessRules = accessRules;
    }

    /**
     * @return One to three `access_rule` blocks as defined above.
     * 
     */
    public List<CacheDefaultAccessPolicyAccessRule> accessRules() {
        return this.accessRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheDefaultAccessPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CacheDefaultAccessPolicyAccessRule> accessRules;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheDefaultAccessPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRules = defaults.accessRules;
        }

        public Builder accessRules(List<CacheDefaultAccessPolicyAccessRule> accessRules) {
            this.accessRules = Objects.requireNonNull(accessRules);
            return this;
        }
        public Builder accessRules(CacheDefaultAccessPolicyAccessRule... accessRules) {
            return accessRules(List.of(accessRules));
        }        public CacheDefaultAccessPolicy build() {
            return new CacheDefaultAccessPolicy(accessRules);
        }
    }
}