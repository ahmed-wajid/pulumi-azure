// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConfidentialLedgerAzureadBasedServicePrincipal {
    /**
     * @return The Ledger Role to grant this Certificate Security Principal.
     * 
     */
    private final String ledgerRoleName;
    /**
     * @return The Principal ID of the AzureAD Service Principal.
     * 
     */
    private final String principalId;
    /**
     * @return The Tenant ID for this AzureAD Service Principal.
     * 
     */
    private final String tenantId;

    @CustomType.Constructor
    private GetConfidentialLedgerAzureadBasedServicePrincipal(
        @CustomType.Parameter("ledgerRoleName") String ledgerRoleName,
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId) {
        this.ledgerRoleName = ledgerRoleName;
        this.principalId = principalId;
        this.tenantId = tenantId;
    }

    /**
     * @return The Ledger Role to grant this Certificate Security Principal.
     * 
     */
    public String ledgerRoleName() {
        return this.ledgerRoleName;
    }
    /**
     * @return The Principal ID of the AzureAD Service Principal.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The Tenant ID for this AzureAD Service Principal.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfidentialLedgerAzureadBasedServicePrincipal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ledgerRoleName;
        private String principalId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfidentialLedgerAzureadBasedServicePrincipal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ledgerRoleName = defaults.ledgerRoleName;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder ledgerRoleName(String ledgerRoleName) {
            this.ledgerRoleName = Objects.requireNonNull(ledgerRoleName);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }        public GetConfidentialLedgerAzureadBasedServicePrincipal build() {
            return new GetConfidentialLedgerAzureadBasedServicePrincipal(ledgerRoleName, principalId, tenantId);
        }
    }
}