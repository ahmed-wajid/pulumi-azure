// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.orbital;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContactArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContactArgs Empty = new ContactArgs();

    /**
     * ID of the orbital contact profile. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="contactProfileId", required=true)
    private Output<String> contactProfileId;

    /**
     * @return ID of the orbital contact profile. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> contactProfileId() {
        return this.contactProfileId;
    }

    /**
     * Name of the Azure ground station. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="groundStationName", required=true)
    private Output<String> groundStationName;

    /**
     * @return Name of the Azure ground station. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> groundStationName() {
        return this.groundStationName;
    }

    /**
     * The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Reservation end time of the Contact. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="reservationEndTime", required=true)
    private Output<String> reservationEndTime;

    /**
     * @return Reservation end time of the Contact. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> reservationEndTime() {
        return this.reservationEndTime;
    }

    /**
     * Reservation start time of the Contact. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="reservationStartTime", required=true)
    private Output<String> reservationStartTime;

    /**
     * @return Reservation start time of the Contact. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> reservationStartTime() {
        return this.reservationStartTime;
    }

    /**
     * The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="spacecraftId", required=true)
    private Output<String> spacecraftId;

    /**
     * @return The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> spacecraftId() {
        return this.spacecraftId;
    }

    private ContactArgs() {}

    private ContactArgs(ContactArgs $) {
        this.contactProfileId = $.contactProfileId;
        this.groundStationName = $.groundStationName;
        this.name = $.name;
        this.reservationEndTime = $.reservationEndTime;
        this.reservationStartTime = $.reservationStartTime;
        this.spacecraftId = $.spacecraftId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactArgs $;

        public Builder() {
            $ = new ContactArgs();
        }

        public Builder(ContactArgs defaults) {
            $ = new ContactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactProfileId ID of the orbital contact profile. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder contactProfileId(Output<String> contactProfileId) {
            $.contactProfileId = contactProfileId;
            return this;
        }

        /**
         * @param contactProfileId ID of the orbital contact profile. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder contactProfileId(String contactProfileId) {
            return contactProfileId(Output.of(contactProfileId));
        }

        /**
         * @param groundStationName Name of the Azure ground station. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder groundStationName(Output<String> groundStationName) {
            $.groundStationName = groundStationName;
            return this;
        }

        /**
         * @param groundStationName Name of the Azure ground station. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder groundStationName(String groundStationName) {
            return groundStationName(Output.of(groundStationName));
        }

        /**
         * @param name The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Contact. Changing this forces a new resource to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param reservationEndTime Reservation end time of the Contact. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder reservationEndTime(Output<String> reservationEndTime) {
            $.reservationEndTime = reservationEndTime;
            return this;
        }

        /**
         * @param reservationEndTime Reservation end time of the Contact. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder reservationEndTime(String reservationEndTime) {
            return reservationEndTime(Output.of(reservationEndTime));
        }

        /**
         * @param reservationStartTime Reservation start time of the Contact. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder reservationStartTime(Output<String> reservationStartTime) {
            $.reservationStartTime = reservationStartTime;
            return this;
        }

        /**
         * @param reservationStartTime Reservation start time of the Contact. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder reservationStartTime(String reservationStartTime) {
            return reservationStartTime(Output.of(reservationStartTime));
        }

        /**
         * @param spacecraftId The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder spacecraftId(Output<String> spacecraftId) {
            $.spacecraftId = spacecraftId;
            return this;
        }

        /**
         * @param spacecraftId The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder spacecraftId(String spacecraftId) {
            return spacecraftId(Output.of(spacecraftId));
        }

        public ContactArgs build() {
            $.contactProfileId = Objects.requireNonNull($.contactProfileId, "expected parameter 'contactProfileId' to be non-null");
            $.groundStationName = Objects.requireNonNull($.groundStationName, "expected parameter 'groundStationName' to be non-null");
            $.reservationEndTime = Objects.requireNonNull($.reservationEndTime, "expected parameter 'reservationEndTime' to be non-null");
            $.reservationStartTime = Objects.requireNonNull($.reservationStartTime, "expected parameter 'reservationStartTime' to be non-null");
            $.spacecraftId = Objects.requireNonNull($.spacecraftId, "expected parameter 'spacecraftId' to be non-null");
            return $;
        }
    }

}