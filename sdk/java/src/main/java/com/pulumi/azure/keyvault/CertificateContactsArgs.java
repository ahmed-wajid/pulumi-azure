// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault;

import com.pulumi.azure.keyvault.inputs.CertificateContactsContactArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class CertificateContactsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateContactsArgs Empty = new CertificateContactsArgs();

    /**
     * One or more `contact` blocks as defined below.
     * 
     */
    @Import(name="contacts", required=true)
    private Output<List<CertificateContactsContactArgs>> contacts;

    /**
     * @return One or more `contact` blocks as defined below.
     * 
     */
    public Output<List<CertificateContactsContactArgs>> contacts() {
        return this.contacts;
    }

    /**
     * The ID of the Key Vault. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="keyVaultId", required=true)
    private Output<String> keyVaultId;

    /**
     * @return The ID of the Key Vault. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> keyVaultId() {
        return this.keyVaultId;
    }

    private CertificateContactsArgs() {}

    private CertificateContactsArgs(CertificateContactsArgs $) {
        this.contacts = $.contacts;
        this.keyVaultId = $.keyVaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateContactsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateContactsArgs $;

        public Builder() {
            $ = new CertificateContactsArgs();
        }

        public Builder(CertificateContactsArgs defaults) {
            $ = new CertificateContactsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contacts One or more `contact` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder contacts(Output<List<CertificateContactsContactArgs>> contacts) {
            $.contacts = contacts;
            return this;
        }

        /**
         * @param contacts One or more `contact` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder contacts(List<CertificateContactsContactArgs> contacts) {
            return contacts(Output.of(contacts));
        }

        /**
         * @param contacts One or more `contact` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder contacts(CertificateContactsContactArgs... contacts) {
            return contacts(List.of(contacts));
        }

        /**
         * @param keyVaultId The ID of the Key Vault. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId The ID of the Key Vault. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        public CertificateContactsArgs build() {
            $.contacts = Objects.requireNonNull($.contacts, "expected parameter 'contacts' to be non-null");
            $.keyVaultId = Objects.requireNonNull($.keyVaultId, "expected parameter 'keyVaultId' to be non-null");
            return $;
        }
    }

}