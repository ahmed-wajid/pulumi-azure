// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkPacketCoreControlPlaneLocalDiagnosticsAccess {
    /**
     * @return How to authenticate users to access local diagnostics APIs. Possible values are `AAD` and `Password`.
     * 
     */
    private String authenticationType;
    /**
     * @return The versionless certificate URL used to secure local access to packet core diagnostics over local APIs by the Kubernetes ingress.
     * 
     */
    private @Nullable String httpsServerCertificateUrl;

    private NetworkPacketCoreControlPlaneLocalDiagnosticsAccess() {}
    /**
     * @return How to authenticate users to access local diagnostics APIs. Possible values are `AAD` and `Password`.
     * 
     */
    public String authenticationType() {
        return this.authenticationType;
    }
    /**
     * @return The versionless certificate URL used to secure local access to packet core diagnostics over local APIs by the Kubernetes ingress.
     * 
     */
    public Optional<String> httpsServerCertificateUrl() {
        return Optional.ofNullable(this.httpsServerCertificateUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPacketCoreControlPlaneLocalDiagnosticsAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authenticationType;
        private @Nullable String httpsServerCertificateUrl;
        public Builder() {}
        public Builder(NetworkPacketCoreControlPlaneLocalDiagnosticsAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.httpsServerCertificateUrl = defaults.httpsServerCertificateUrl;
        }

        @CustomType.Setter
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        @CustomType.Setter
        public Builder httpsServerCertificateUrl(@Nullable String httpsServerCertificateUrl) {
            this.httpsServerCertificateUrl = httpsServerCertificateUrl;
            return this;
        }
        public NetworkPacketCoreControlPlaneLocalDiagnosticsAccess build() {
            final var o = new NetworkPacketCoreControlPlaneLocalDiagnosticsAccess();
            o.authenticationType = authenticationType;
            o.httpsServerCertificateUrl = httpsServerCertificateUrl;
            return o;
        }
    }
}