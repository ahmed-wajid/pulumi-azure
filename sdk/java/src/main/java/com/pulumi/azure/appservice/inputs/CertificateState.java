// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateState extends com.pulumi.resources.ResourceArgs {

    public static final CertificateState Empty = new CertificateState();

    /**
     * The ID of the associated App Service plan. Must be specified when the certificate is used inside an App Service Environment hosted App Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="appServicePlanId")
    private @Nullable Output<String> appServicePlanId;

    /**
     * @return The ID of the associated App Service plan. Must be specified when the certificate is used inside an App Service Environment hosted App Service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> appServicePlanId() {
        return Optional.ofNullable(this.appServicePlanId);
    }

    /**
     * The expiration date for the certificate.
     * 
     */
    @Import(name="expirationDate")
    private @Nullable Output<String> expirationDate;

    /**
     * @return The expiration date for the certificate.
     * 
     */
    public Optional<Output<String>> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }

    /**
     * The friendly name of the certificate.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return The friendly name of the certificate.
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * List of host names the certificate applies to.
     * 
     */
    @Import(name="hostNames")
    private @Nullable Output<List<String>> hostNames;

    /**
     * @return List of host names the certificate applies to.
     * 
     */
    public Optional<Output<List<String>>> hostNames() {
        return Optional.ofNullable(this.hostNames);
    }

    /**
     * The issue date for the certificate.
     * 
     */
    @Import(name="issueDate")
    private @Nullable Output<String> issueDate;

    /**
     * @return The issue date for the certificate.
     * 
     */
    public Optional<Output<String>> issueDate() {
        return Optional.ofNullable(this.issueDate);
    }

    /**
     * The name of the certificate issuer.
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    /**
     * @return The name of the certificate issuer.
     * 
     */
    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * The ID of the Key Vault secret. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="keyVaultSecretId")
    private @Nullable Output<String> keyVaultSecretId;

    /**
     * @return The ID of the Key Vault secret. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> keyVaultSecretId() {
        return Optional.ofNullable(this.keyVaultSecretId);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the certificate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The password to access the certificate&#39;s private key. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password to access the certificate&#39;s private key. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The base64-encoded contents of the certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="pfxBlob")
    private @Nullable Output<String> pfxBlob;

    /**
     * @return The base64-encoded contents of the certificate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> pfxBlob() {
        return Optional.ofNullable(this.pfxBlob);
    }

    /**
     * The name of the resource group in which to create the certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the certificate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The subject name of the certificate.
     * 
     */
    @Import(name="subjectName")
    private @Nullable Output<String> subjectName;

    /**
     * @return The subject name of the certificate.
     * 
     */
    public Optional<Output<String>> subjectName() {
        return Optional.ofNullable(this.subjectName);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The thumbprint for the certificate.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return The thumbprint for the certificate.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    private CertificateState() {}

    private CertificateState(CertificateState $) {
        this.appServicePlanId = $.appServicePlanId;
        this.expirationDate = $.expirationDate;
        this.friendlyName = $.friendlyName;
        this.hostNames = $.hostNames;
        this.issueDate = $.issueDate;
        this.issuer = $.issuer;
        this.keyVaultSecretId = $.keyVaultSecretId;
        this.location = $.location;
        this.name = $.name;
        this.password = $.password;
        this.pfxBlob = $.pfxBlob;
        this.resourceGroupName = $.resourceGroupName;
        this.subjectName = $.subjectName;
        this.tags = $.tags;
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateState $;

        public Builder() {
            $ = new CertificateState();
        }

        public Builder(CertificateState defaults) {
            $ = new CertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appServicePlanId The ID of the associated App Service plan. Must be specified when the certificate is used inside an App Service Environment hosted App Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServicePlanId(@Nullable Output<String> appServicePlanId) {
            $.appServicePlanId = appServicePlanId;
            return this;
        }

        /**
         * @param appServicePlanId The ID of the associated App Service plan. Must be specified when the certificate is used inside an App Service Environment hosted App Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServicePlanId(String appServicePlanId) {
            return appServicePlanId(Output.of(appServicePlanId));
        }

        /**
         * @param expirationDate The expiration date for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            $.expirationDate = expirationDate;
            return this;
        }

        /**
         * @param expirationDate The expiration date for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(String expirationDate) {
            return expirationDate(Output.of(expirationDate));
        }

        /**
         * @param friendlyName The friendly name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName The friendly name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param hostNames List of host names the certificate applies to.
         * 
         * @return builder
         * 
         */
        public Builder hostNames(@Nullable Output<List<String>> hostNames) {
            $.hostNames = hostNames;
            return this;
        }

        /**
         * @param hostNames List of host names the certificate applies to.
         * 
         * @return builder
         * 
         */
        public Builder hostNames(List<String> hostNames) {
            return hostNames(Output.of(hostNames));
        }

        /**
         * @param hostNames List of host names the certificate applies to.
         * 
         * @return builder
         * 
         */
        public Builder hostNames(String... hostNames) {
            return hostNames(List.of(hostNames));
        }

        /**
         * @param issueDate The issue date for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder issueDate(@Nullable Output<String> issueDate) {
            $.issueDate = issueDate;
            return this;
        }

        /**
         * @param issueDate The issue date for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder issueDate(String issueDate) {
            return issueDate(Output.of(issueDate));
        }

        /**
         * @param issuer The name of the certificate issuer.
         * 
         * @return builder
         * 
         */
        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer The name of the certificate issuer.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param keyVaultSecretId The ID of the Key Vault secret. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSecretId(@Nullable Output<String> keyVaultSecretId) {
            $.keyVaultSecretId = keyVaultSecretId;
            return this;
        }

        /**
         * @param keyVaultSecretId The ID of the Key Vault secret. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSecretId(String keyVaultSecretId) {
            return keyVaultSecretId(Output.of(keyVaultSecretId));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password The password to access the certificate&#39;s private key. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password to access the certificate&#39;s private key. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param pfxBlob The base64-encoded contents of the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder pfxBlob(@Nullable Output<String> pfxBlob) {
            $.pfxBlob = pfxBlob;
            return this;
        }

        /**
         * @param pfxBlob The base64-encoded contents of the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder pfxBlob(String pfxBlob) {
            return pfxBlob(Output.of(pfxBlob));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param subjectName The subject name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(@Nullable Output<String> subjectName) {
            $.subjectName = subjectName;
            return this;
        }

        /**
         * @param subjectName The subject name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(String subjectName) {
            return subjectName(Output.of(subjectName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param thumbprint The thumbprint for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The thumbprint for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        public CertificateState build() {
            return $;
        }
    }

}