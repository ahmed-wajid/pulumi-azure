// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GalleryApplicationState extends com.pulumi.resources.ResourceArgs {

    public static final GalleryApplicationState Empty = new GalleryApplicationState();

    /**
     * A description of the Gallery Application.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the Gallery Application.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The end of life date in RFC3339 format of the Gallery Application.
     * 
     */
    @Import(name="endOfLifeDate")
    private @Nullable Output<String> endOfLifeDate;

    /**
     * @return The end of life date in RFC3339 format of the Gallery Application.
     * 
     */
    public Optional<Output<String>> endOfLifeDate() {
        return Optional.ofNullable(this.endOfLifeDate);
    }

    /**
     * The End User Licence Agreement of the Gallery Application.
     * 
     */
    @Import(name="eula")
    private @Nullable Output<String> eula;

    /**
     * @return The End User Licence Agreement of the Gallery Application.
     * 
     */
    public Optional<Output<String>> eula() {
        return Optional.ofNullable(this.eula);
    }

    /**
     * The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="galleryId")
    private @Nullable Output<String> galleryId;

    /**
     * @return The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> galleryId() {
        return Optional.ofNullable(this.galleryId);
    }

    /**
     * The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URI containing the Privacy Statement associated with the Gallery Application.
     * 
     */
    @Import(name="privacyStatementUri")
    private @Nullable Output<String> privacyStatementUri;

    /**
     * @return The URI containing the Privacy Statement associated with the Gallery Application.
     * 
     */
    public Optional<Output<String>> privacyStatementUri() {
        return Optional.ofNullable(this.privacyStatementUri);
    }

    /**
     * The URI containing the Release Notes associated with the Gallery Application.
     * 
     */
    @Import(name="releaseNoteUri")
    private @Nullable Output<String> releaseNoteUri;

    /**
     * @return The URI containing the Release Notes associated with the Gallery Application.
     * 
     */
    public Optional<Output<String>> releaseNoteUri() {
        return Optional.ofNullable(this.releaseNoteUri);
    }

    /**
     * The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="supportedOsType")
    private @Nullable Output<String> supportedOsType;

    /**
     * @return The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> supportedOsType() {
        return Optional.ofNullable(this.supportedOsType);
    }

    /**
     * A mapping of tags to assign to the Gallery Application.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Gallery Application.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GalleryApplicationState() {}

    private GalleryApplicationState(GalleryApplicationState $) {
        this.description = $.description;
        this.endOfLifeDate = $.endOfLifeDate;
        this.eula = $.eula;
        this.galleryId = $.galleryId;
        this.location = $.location;
        this.name = $.name;
        this.privacyStatementUri = $.privacyStatementUri;
        this.releaseNoteUri = $.releaseNoteUri;
        this.supportedOsType = $.supportedOsType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryApplicationState $;

        public Builder() {
            $ = new GalleryApplicationState();
        }

        public Builder(GalleryApplicationState defaults) {
            $ = new GalleryApplicationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param endOfLifeDate The end of life date in RFC3339 format of the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder endOfLifeDate(@Nullable Output<String> endOfLifeDate) {
            $.endOfLifeDate = endOfLifeDate;
            return this;
        }

        /**
         * @param endOfLifeDate The end of life date in RFC3339 format of the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder endOfLifeDate(String endOfLifeDate) {
            return endOfLifeDate(Output.of(endOfLifeDate));
        }

        /**
         * @param eula The End User Licence Agreement of the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder eula(@Nullable Output<String> eula) {
            $.eula = eula;
            return this;
        }

        /**
         * @param eula The End User Licence Agreement of the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder eula(String eula) {
            return eula(Output.of(eula));
        }

        /**
         * @param galleryId The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder galleryId(@Nullable Output<String> galleryId) {
            $.galleryId = galleryId;
            return this;
        }

        /**
         * @param galleryId The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder galleryId(String galleryId) {
            return galleryId(Output.of(galleryId));
        }

        /**
         * @param location The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the Gallery Application. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Gallery Application. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privacyStatementUri The URI containing the Privacy Statement associated with the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder privacyStatementUri(@Nullable Output<String> privacyStatementUri) {
            $.privacyStatementUri = privacyStatementUri;
            return this;
        }

        /**
         * @param privacyStatementUri The URI containing the Privacy Statement associated with the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder privacyStatementUri(String privacyStatementUri) {
            return privacyStatementUri(Output.of(privacyStatementUri));
        }

        /**
         * @param releaseNoteUri The URI containing the Release Notes associated with the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder releaseNoteUri(@Nullable Output<String> releaseNoteUri) {
            $.releaseNoteUri = releaseNoteUri;
            return this;
        }

        /**
         * @param releaseNoteUri The URI containing the Release Notes associated with the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder releaseNoteUri(String releaseNoteUri) {
            return releaseNoteUri(Output.of(releaseNoteUri));
        }

        /**
         * @param supportedOsType The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder supportedOsType(@Nullable Output<String> supportedOsType) {
            $.supportedOsType = supportedOsType;
            return this;
        }

        /**
         * @param supportedOsType The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder supportedOsType(String supportedOsType) {
            return supportedOsType(Output.of(supportedOsType));
        }

        /**
         * @param tags A mapping of tags to assign to the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the Gallery Application.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GalleryApplicationState build() {
            return $;
        }
    }

}