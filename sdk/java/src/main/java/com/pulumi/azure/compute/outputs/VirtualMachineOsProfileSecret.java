// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.VirtualMachineOsProfileSecretVaultCertificate;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineOsProfileSecret {
    /**
     * @return Specifies the ID of the Key Vault to use.
     * 
     */
    private final String sourceVaultId;
    /**
     * @return One or more `vault_certificates` blocks.
     * 
     */
    private final @Nullable List<VirtualMachineOsProfileSecretVaultCertificate> vaultCertificates;

    @CustomType.Constructor
    private VirtualMachineOsProfileSecret(
        @CustomType.Parameter("sourceVaultId") String sourceVaultId,
        @CustomType.Parameter("vaultCertificates") @Nullable List<VirtualMachineOsProfileSecretVaultCertificate> vaultCertificates) {
        this.sourceVaultId = sourceVaultId;
        this.vaultCertificates = vaultCertificates;
    }

    /**
     * @return Specifies the ID of the Key Vault to use.
     * 
     */
    public String sourceVaultId() {
        return this.sourceVaultId;
    }
    /**
     * @return One or more `vault_certificates` blocks.
     * 
     */
    public List<VirtualMachineOsProfileSecretVaultCertificate> vaultCertificates() {
        return this.vaultCertificates == null ? List.of() : this.vaultCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineOsProfileSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceVaultId;
        private @Nullable List<VirtualMachineOsProfileSecretVaultCertificate> vaultCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineOsProfileSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceVaultId = defaults.sourceVaultId;
    	      this.vaultCertificates = defaults.vaultCertificates;
        }

        public Builder sourceVaultId(String sourceVaultId) {
            this.sourceVaultId = Objects.requireNonNull(sourceVaultId);
            return this;
        }
        public Builder vaultCertificates(@Nullable List<VirtualMachineOsProfileSecretVaultCertificate> vaultCertificates) {
            this.vaultCertificates = vaultCertificates;
            return this;
        }
        public Builder vaultCertificates(VirtualMachineOsProfileSecretVaultCertificate... vaultCertificates) {
            return vaultCertificates(List.of(vaultCertificates));
        }        public VirtualMachineOsProfileSecret build() {
            return new VirtualMachineOsProfileSecret(sourceVaultId, vaultCertificates);
        }
    }
}