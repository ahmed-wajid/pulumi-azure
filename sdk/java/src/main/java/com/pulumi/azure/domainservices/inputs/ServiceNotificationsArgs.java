// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.domainservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceNotificationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceNotificationsArgs Empty = new ServiceNotificationsArgs();

    /**
     * A list of additional email addresses to notify when there are alerts in the managed domain.
     * 
     */
    @Import(name="additionalRecipients")
    private @Nullable Output<List<String>> additionalRecipients;

    /**
     * @return A list of additional email addresses to notify when there are alerts in the managed domain.
     * 
     */
    public Optional<Output<List<String>>> additionalRecipients() {
        return Optional.ofNullable(this.additionalRecipients);
    }

    /**
     * Whether to notify members of the _AAD DC Administrators_ group when there are alerts in the managed domain.
     * 
     */
    @Import(name="notifyDcAdmins")
    private @Nullable Output<Boolean> notifyDcAdmins;

    /**
     * @return Whether to notify members of the _AAD DC Administrators_ group when there are alerts in the managed domain.
     * 
     */
    public Optional<Output<Boolean>> notifyDcAdmins() {
        return Optional.ofNullable(this.notifyDcAdmins);
    }

    /**
     * Whether to notify all Global Administrators when there are alerts in the managed domain.
     * 
     */
    @Import(name="notifyGlobalAdmins")
    private @Nullable Output<Boolean> notifyGlobalAdmins;

    /**
     * @return Whether to notify all Global Administrators when there are alerts in the managed domain.
     * 
     */
    public Optional<Output<Boolean>> notifyGlobalAdmins() {
        return Optional.ofNullable(this.notifyGlobalAdmins);
    }

    private ServiceNotificationsArgs() {}

    private ServiceNotificationsArgs(ServiceNotificationsArgs $) {
        this.additionalRecipients = $.additionalRecipients;
        this.notifyDcAdmins = $.notifyDcAdmins;
        this.notifyGlobalAdmins = $.notifyGlobalAdmins;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceNotificationsArgs $;

        public Builder() {
            $ = new ServiceNotificationsArgs();
        }

        public Builder(ServiceNotificationsArgs defaults) {
            $ = new ServiceNotificationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalRecipients A list of additional email addresses to notify when there are alerts in the managed domain.
         * 
         * @return builder
         * 
         */
        public Builder additionalRecipients(@Nullable Output<List<String>> additionalRecipients) {
            $.additionalRecipients = additionalRecipients;
            return this;
        }

        /**
         * @param additionalRecipients A list of additional email addresses to notify when there are alerts in the managed domain.
         * 
         * @return builder
         * 
         */
        public Builder additionalRecipients(List<String> additionalRecipients) {
            return additionalRecipients(Output.of(additionalRecipients));
        }

        /**
         * @param additionalRecipients A list of additional email addresses to notify when there are alerts in the managed domain.
         * 
         * @return builder
         * 
         */
        public Builder additionalRecipients(String... additionalRecipients) {
            return additionalRecipients(List.of(additionalRecipients));
        }

        /**
         * @param notifyDcAdmins Whether to notify members of the _AAD DC Administrators_ group when there are alerts in the managed domain.
         * 
         * @return builder
         * 
         */
        public Builder notifyDcAdmins(@Nullable Output<Boolean> notifyDcAdmins) {
            $.notifyDcAdmins = notifyDcAdmins;
            return this;
        }

        /**
         * @param notifyDcAdmins Whether to notify members of the _AAD DC Administrators_ group when there are alerts in the managed domain.
         * 
         * @return builder
         * 
         */
        public Builder notifyDcAdmins(Boolean notifyDcAdmins) {
            return notifyDcAdmins(Output.of(notifyDcAdmins));
        }

        /**
         * @param notifyGlobalAdmins Whether to notify all Global Administrators when there are alerts in the managed domain.
         * 
         * @return builder
         * 
         */
        public Builder notifyGlobalAdmins(@Nullable Output<Boolean> notifyGlobalAdmins) {
            $.notifyGlobalAdmins = notifyGlobalAdmins;
            return this;
        }

        /**
         * @param notifyGlobalAdmins Whether to notify all Global Administrators when there are alerts in the managed domain.
         * 
         * @return builder
         * 
         */
        public Builder notifyGlobalAdmins(Boolean notifyGlobalAdmins) {
            return notifyGlobalAdmins(Output.of(notifyGlobalAdmins));
        }

        public ServiceNotificationsArgs build() {
            return $;
        }
    }

}