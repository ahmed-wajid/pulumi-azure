// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.outputs;

import com.pulumi.azure.logicapps.outputs.WorkflowAccessControlTriggerOpenAuthenticationPolicyClaim;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WorkflowAccessControlTriggerOpenAuthenticationPolicy {
    /**
     * @return A `claim` block as defined below.
     * 
     */
    private final List<WorkflowAccessControlTriggerOpenAuthenticationPolicyClaim> claims;
    /**
     * @return The OAuth policy name for the Logic App Workflow.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private WorkflowAccessControlTriggerOpenAuthenticationPolicy(
        @CustomType.Parameter("claims") List<WorkflowAccessControlTriggerOpenAuthenticationPolicyClaim> claims,
        @CustomType.Parameter("name") String name) {
        this.claims = claims;
        this.name = name;
    }

    /**
     * @return A `claim` block as defined below.
     * 
     */
    public List<WorkflowAccessControlTriggerOpenAuthenticationPolicyClaim> claims() {
        return this.claims;
    }
    /**
     * @return The OAuth policy name for the Logic App Workflow.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowAccessControlTriggerOpenAuthenticationPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WorkflowAccessControlTriggerOpenAuthenticationPolicyClaim> claims;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowAccessControlTriggerOpenAuthenticationPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claims = defaults.claims;
    	      this.name = defaults.name;
        }

        public Builder claims(List<WorkflowAccessControlTriggerOpenAuthenticationPolicyClaim> claims) {
            this.claims = Objects.requireNonNull(claims);
            return this;
        }
        public Builder claims(WorkflowAccessControlTriggerOpenAuthenticationPolicyClaim... claims) {
            return claims(List.of(claims));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public WorkflowAccessControlTriggerOpenAuthenticationPolicy build() {
            return new WorkflowAccessControlTriggerOpenAuthenticationPolicy(claims, name);
        }
    }
}