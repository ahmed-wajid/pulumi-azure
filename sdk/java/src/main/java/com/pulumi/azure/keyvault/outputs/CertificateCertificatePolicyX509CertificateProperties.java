// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.azure.keyvault.outputs.CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateCertificatePolicyX509CertificateProperties {
    /**
     * @return A list of Extended/Enhanced Key Usages. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable List<String> extendedKeyUsages;
    /**
     * @return A list of uses associated with this Key. Possible values include `cRLSign`, `dataEncipherment`, `decipherOnly`, `digitalSignature`, `encipherOnly`, `keyAgreement`, `keyCertSign`, `keyEncipherment` and `nonRepudiation` and are case-sensitive. Changing this forces a new resource to be created.
     * 
     */
    private final List<String> keyUsages;
    /**
     * @return The Certificate&#39;s Subject. Changing this forces a new resource to be created.
     * 
     */
    private final String subject;
    /**
     * @return A `subject_alternative_names` block as defined below.
     * 
     */
    private final @Nullable CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames subjectAlternativeNames;
    /**
     * @return The Certificates Validity Period in Months. Changing this forces a new resource to be created.
     * 
     */
    private final Integer validityInMonths;

    @CustomType.Constructor
    private CertificateCertificatePolicyX509CertificateProperties(
        @CustomType.Parameter("extendedKeyUsages") @Nullable List<String> extendedKeyUsages,
        @CustomType.Parameter("keyUsages") List<String> keyUsages,
        @CustomType.Parameter("subject") String subject,
        @CustomType.Parameter("subjectAlternativeNames") @Nullable CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames subjectAlternativeNames,
        @CustomType.Parameter("validityInMonths") Integer validityInMonths) {
        this.extendedKeyUsages = extendedKeyUsages;
        this.keyUsages = keyUsages;
        this.subject = subject;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.validityInMonths = validityInMonths;
    }

    /**
     * @return A list of Extended/Enhanced Key Usages. Changing this forces a new resource to be created.
     * 
     */
    public List<String> extendedKeyUsages() {
        return this.extendedKeyUsages == null ? List.of() : this.extendedKeyUsages;
    }
    /**
     * @return A list of uses associated with this Key. Possible values include `cRLSign`, `dataEncipherment`, `decipherOnly`, `digitalSignature`, `encipherOnly`, `keyAgreement`, `keyCertSign`, `keyEncipherment` and `nonRepudiation` and are case-sensitive. Changing this forces a new resource to be created.
     * 
     */
    public List<String> keyUsages() {
        return this.keyUsages;
    }
    /**
     * @return The Certificate&#39;s Subject. Changing this forces a new resource to be created.
     * 
     */
    public String subject() {
        return this.subject;
    }
    /**
     * @return A `subject_alternative_names` block as defined below.
     * 
     */
    public Optional<CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }
    /**
     * @return The Certificates Validity Period in Months. Changing this forces a new resource to be created.
     * 
     */
    public Integer validityInMonths() {
        return this.validityInMonths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificatePolicyX509CertificateProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> extendedKeyUsages;
        private List<String> keyUsages;
        private String subject;
        private @Nullable CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames subjectAlternativeNames;
        private Integer validityInMonths;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificatePolicyX509CertificateProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedKeyUsages = defaults.extendedKeyUsages;
    	      this.keyUsages = defaults.keyUsages;
    	      this.subject = defaults.subject;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.validityInMonths = defaults.validityInMonths;
        }

        public Builder extendedKeyUsages(@Nullable List<String> extendedKeyUsages) {
            this.extendedKeyUsages = extendedKeyUsages;
            return this;
        }
        public Builder extendedKeyUsages(String... extendedKeyUsages) {
            return extendedKeyUsages(List.of(extendedKeyUsages));
        }
        public Builder keyUsages(List<String> keyUsages) {
            this.keyUsages = Objects.requireNonNull(keyUsages);
            return this;
        }
        public Builder keyUsages(String... keyUsages) {
            return keyUsages(List.of(keyUsages));
        }
        public Builder subject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder subjectAlternativeNames(@Nullable CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder validityInMonths(Integer validityInMonths) {
            this.validityInMonths = Objects.requireNonNull(validityInMonths);
            return this;
        }        public CertificateCertificatePolicyX509CertificateProperties build() {
            return new CertificateCertificatePolicyX509CertificateProperties(extendedKeyUsages, keyUsages, subject, subjectAlternativeNames, validityInMonths);
        }
    }
}