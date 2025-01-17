// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppIngressCustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppIngressCustomDomainArgs Empty = new AppIngressCustomDomainArgs();

    /**
     * The Binding type. Possible values include `Disabled` and `SniEnabled`. Defaults to `Disabled`.
     * 
     */
    @Import(name="certificateBindingType")
    private @Nullable Output<String> certificateBindingType;

    /**
     * @return The Binding type. Possible values include `Disabled` and `SniEnabled`. Defaults to `Disabled`.
     * 
     */
    public Optional<Output<String>> certificateBindingType() {
        return Optional.ofNullable(this.certificateBindingType);
    }

    /**
     * The ID of the Container App Environment Certificate.
     * 
     */
    @Import(name="certificateId", required=true)
    private Output<String> certificateId;

    /**
     * @return The ID of the Container App Environment Certificate.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }

    /**
     * The hostname of the Certificate. Must be the CN or a named SAN in the certificate.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The hostname of the Certificate. Must be the CN or a named SAN in the certificate.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private AppIngressCustomDomainArgs() {}

    private AppIngressCustomDomainArgs(AppIngressCustomDomainArgs $) {
        this.certificateBindingType = $.certificateBindingType;
        this.certificateId = $.certificateId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppIngressCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppIngressCustomDomainArgs $;

        public Builder() {
            $ = new AppIngressCustomDomainArgs();
        }

        public Builder(AppIngressCustomDomainArgs defaults) {
            $ = new AppIngressCustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateBindingType The Binding type. Possible values include `Disabled` and `SniEnabled`. Defaults to `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder certificateBindingType(@Nullable Output<String> certificateBindingType) {
            $.certificateBindingType = certificateBindingType;
            return this;
        }

        /**
         * @param certificateBindingType The Binding type. Possible values include `Disabled` and `SniEnabled`. Defaults to `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder certificateBindingType(String certificateBindingType) {
            return certificateBindingType(Output.of(certificateBindingType));
        }

        /**
         * @param certificateId The ID of the Container App Environment Certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId The ID of the Container App Environment Certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        /**
         * @param name The hostname of the Certificate. Must be the CN or a named SAN in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The hostname of the Certificate. Must be the CN or a named SAN in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AppIngressCustomDomainArgs build() {
            if ($.certificateId == null) {
                throw new MissingRequiredPropertyException("AppIngressCustomDomainArgs", "certificateId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AppIngressCustomDomainArgs", "name");
            }
            return $;
        }
    }

}
