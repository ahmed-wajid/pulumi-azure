// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedClusterAuthenticationCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedClusterAuthenticationCertificateArgs Empty = new ManagedClusterAuthenticationCertificateArgs();

    /**
     * The certificate&#39;s CN.
     * 
     */
    @Import(name="commonName")
    private @Nullable Output<String> commonName;

    /**
     * @return The certificate&#39;s CN.
     * 
     */
    public Optional<Output<String>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    /**
     * The thumbprint of the certificate.
     * 
     */
    @Import(name="thumbprint", required=true)
    private Output<String> thumbprint;

    /**
     * @return The thumbprint of the certificate.
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
    }

    /**
     * The type of the certificate. Can be `AdminClient` or `ReadOnlyClient`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the certificate. Can be `AdminClient` or `ReadOnlyClient`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ManagedClusterAuthenticationCertificateArgs() {}

    private ManagedClusterAuthenticationCertificateArgs(ManagedClusterAuthenticationCertificateArgs $) {
        this.commonName = $.commonName;
        this.thumbprint = $.thumbprint;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterAuthenticationCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterAuthenticationCertificateArgs $;

        public Builder() {
            $ = new ManagedClusterAuthenticationCertificateArgs();
        }

        public Builder(ManagedClusterAuthenticationCertificateArgs defaults) {
            $ = new ManagedClusterAuthenticationCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commonName The certificate&#39;s CN.
         * 
         * @return builder
         * 
         */
        public Builder commonName(@Nullable Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        /**
         * @param commonName The certificate&#39;s CN.
         * 
         * @return builder
         * 
         */
        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        /**
         * @param thumbprint The thumbprint of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The thumbprint of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        /**
         * @param type The type of the certificate. Can be `AdminClient` or `ReadOnlyClient`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the certificate. Can be `AdminClient` or `ReadOnlyClient`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ManagedClusterAuthenticationCertificateArgs build() {
            $.thumbprint = Objects.requireNonNull($.thumbprint, "expected parameter 'thumbprint' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}