// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.ScaleSetOsProfileSecretVaultCertificate;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSetOsProfileSecret {
    /**
     * @return Specifies the key vault to use.
     * 
     */
    private final String sourceVaultId;
    /**
     * @return A collection of Vault Certificates as documented below
     * 
     */
    private final @Nullable List<ScaleSetOsProfileSecretVaultCertificate> vaultCertificates;

    @CustomType.Constructor
    private ScaleSetOsProfileSecret(
        @CustomType.Parameter("sourceVaultId") String sourceVaultId,
        @CustomType.Parameter("vaultCertificates") @Nullable List<ScaleSetOsProfileSecretVaultCertificate> vaultCertificates) {
        this.sourceVaultId = sourceVaultId;
        this.vaultCertificates = vaultCertificates;
    }

    /**
     * @return Specifies the key vault to use.
     * 
     */
    public String sourceVaultId() {
        return this.sourceVaultId;
    }
    /**
     * @return A collection of Vault Certificates as documented below
     * 
     */
    public List<ScaleSetOsProfileSecretVaultCertificate> vaultCertificates() {
        return this.vaultCertificates == null ? List.of() : this.vaultCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetOsProfileSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceVaultId;
        private @Nullable List<ScaleSetOsProfileSecretVaultCertificate> vaultCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSetOsProfileSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceVaultId = defaults.sourceVaultId;
    	      this.vaultCertificates = defaults.vaultCertificates;
        }

        public Builder sourceVaultId(String sourceVaultId) {
            this.sourceVaultId = Objects.requireNonNull(sourceVaultId);
            return this;
        }
        public Builder vaultCertificates(@Nullable List<ScaleSetOsProfileSecretVaultCertificate> vaultCertificates) {
            this.vaultCertificates = vaultCertificates;
            return this;
        }
        public Builder vaultCertificates(ScaleSetOsProfileSecretVaultCertificate... vaultCertificates) {
            return vaultCertificates(List.of(vaultCertificates));
        }        public ScaleSetOsProfileSecret build() {
            return new ScaleSetOsProfileSecret(sourceVaultId, vaultCertificates);
        }
    }
}