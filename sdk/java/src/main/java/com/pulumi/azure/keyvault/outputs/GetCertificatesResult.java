// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.azure.keyvault.outputs.GetCertificatesCertificate;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCertificatesResult {
    /**
     * @return One or more `certificates` blocks as defined below.
     * 
     */
    private List<GetCertificatesCertificate> certificates;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Boolean includePending;
    /**
     * @return The Key Vault ID.
     * 
     */
    private String keyVaultId;
    /**
     * @return List containing names of certificates that exist in this Key Vault.
     * 
     */
    private List<String> names;

    private GetCertificatesResult() {}
    /**
     * @return One or more `certificates` blocks as defined below.
     * 
     */
    public List<GetCertificatesCertificate> certificates() {
        return this.certificates;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> includePending() {
        return Optional.ofNullable(this.includePending);
    }
    /**
     * @return The Key Vault ID.
     * 
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }
    /**
     * @return List containing names of certificates that exist in this Key Vault.
     * 
     */
    public List<String> names() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCertificatesCertificate> certificates;
        private String id;
        private @Nullable Boolean includePending;
        private String keyVaultId;
        private List<String> names;
        public Builder() {}
        public Builder(GetCertificatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.id = defaults.id;
    	      this.includePending = defaults.includePending;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.names = defaults.names;
        }

        @CustomType.Setter
        public Builder certificates(List<GetCertificatesCertificate> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }
        public Builder certificates(GetCertificatesCertificate... certificates) {
            return certificates(List.of(certificates));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder includePending(@Nullable Boolean includePending) {
            this.includePending = includePending;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultId(String keyVaultId) {
            this.keyVaultId = Objects.requireNonNull(keyVaultId);
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public GetCertificatesResult build() {
            final var o = new GetCertificatesResult();
            o.certificates = certificates;
            o.id = id;
            o.includePending = includePending;
            o.keyVaultId = keyVaultId;
            o.names = names;
            return o;
        }
    }
}