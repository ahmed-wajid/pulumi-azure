// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.azure.cdn.outputs.FrontdoorSecurityPolicySecurityPoliciesFirewall;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class FrontdoorSecurityPolicySecurityPolicies {
    /**
     * @return An `firewall` block as defined below. Changing this forces a new Frontdoor Security Policy to be created.
     * 
     */
    private final FrontdoorSecurityPolicySecurityPoliciesFirewall firewall;

    @CustomType.Constructor
    private FrontdoorSecurityPolicySecurityPolicies(@CustomType.Parameter("firewall") FrontdoorSecurityPolicySecurityPoliciesFirewall firewall) {
        this.firewall = firewall;
    }

    /**
     * @return An `firewall` block as defined below. Changing this forces a new Frontdoor Security Policy to be created.
     * 
     */
    public FrontdoorSecurityPolicySecurityPoliciesFirewall firewall() {
        return this.firewall;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontdoorSecurityPolicySecurityPolicies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorSecurityPolicySecurityPoliciesFirewall firewall;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontdoorSecurityPolicySecurityPolicies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewall = defaults.firewall;
        }

        public Builder firewall(FrontdoorSecurityPolicySecurityPoliciesFirewall firewall) {
            this.firewall = Objects.requireNonNull(firewall);
            return this;
        }        public FrontdoorSecurityPolicySecurityPolicies build() {
            return new FrontdoorSecurityPolicySecurityPolicies(firewall);
        }
    }
}