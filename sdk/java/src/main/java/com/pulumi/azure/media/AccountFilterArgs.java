// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media;

import com.pulumi.azure.media.inputs.AccountFilterPresentationTimeRangeArgs;
import com.pulumi.azure.media.inputs.AccountFilterTrackSelectionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountFilterArgs Empty = new AccountFilterArgs();

    /**
     * The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
     * 
     */
    @Import(name="firstQualityBitrate")
    private @Nullable Output<Integer> firstQualityBitrate;

    /**
     * @return The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
     * 
     */
    public Optional<Output<Integer>> firstQualityBitrate() {
        return Optional.ofNullable(this.firstQualityBitrate);
    }

    /**
     * The Media Services account name. Changing this forces a new Account Filter to be created.
     * 
     */
    @Import(name="mediaServicesAccountName", required=true)
    private Output<String> mediaServicesAccountName;

    /**
     * @return The Media Services account name. Changing this forces a new Account Filter to be created.
     * 
     */
    public Output<String> mediaServicesAccountName() {
        return this.mediaServicesAccountName;
    }

    /**
     * The name which should be used for this Account Filter. Changing this forces a new Account Filter to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Account Filter. Changing this forces a new Account Filter to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `presentation_time_range` block as defined below.
     * 
     */
    @Import(name="presentationTimeRange")
    private @Nullable Output<AccountFilterPresentationTimeRangeArgs> presentationTimeRange;

    /**
     * @return A `presentation_time_range` block as defined below.
     * 
     */
    public Optional<Output<AccountFilterPresentationTimeRangeArgs>> presentationTimeRange() {
        return Optional.ofNullable(this.presentationTimeRange);
    }

    /**
     * The name of the Resource Group where the Account Filter should exist. Changing this forces a new Account Filter to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Account Filter should exist. Changing this forces a new Account Filter to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * One or more `track_selection` blocks as defined below.
     * 
     */
    @Import(name="trackSelections")
    private @Nullable Output<List<AccountFilterTrackSelectionArgs>> trackSelections;

    /**
     * @return One or more `track_selection` blocks as defined below.
     * 
     */
    public Optional<Output<List<AccountFilterTrackSelectionArgs>>> trackSelections() {
        return Optional.ofNullable(this.trackSelections);
    }

    private AccountFilterArgs() {}

    private AccountFilterArgs(AccountFilterArgs $) {
        this.firstQualityBitrate = $.firstQualityBitrate;
        this.mediaServicesAccountName = $.mediaServicesAccountName;
        this.name = $.name;
        this.presentationTimeRange = $.presentationTimeRange;
        this.resourceGroupName = $.resourceGroupName;
        this.trackSelections = $.trackSelections;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountFilterArgs $;

        public Builder() {
            $ = new AccountFilterArgs();
        }

        public Builder(AccountFilterArgs defaults) {
            $ = new AccountFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param firstQualityBitrate The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
         * 
         * @return builder
         * 
         */
        public Builder firstQualityBitrate(@Nullable Output<Integer> firstQualityBitrate) {
            $.firstQualityBitrate = firstQualityBitrate;
            return this;
        }

        /**
         * @param firstQualityBitrate The first quality bitrate. Sets the first video track to appear in the Live Streaming playlist to allow HLS native players to start downloading from this quality level at the beginning.
         * 
         * @return builder
         * 
         */
        public Builder firstQualityBitrate(Integer firstQualityBitrate) {
            return firstQualityBitrate(Output.of(firstQualityBitrate));
        }

        /**
         * @param mediaServicesAccountName The Media Services account name. Changing this forces a new Account Filter to be created.
         * 
         * @return builder
         * 
         */
        public Builder mediaServicesAccountName(Output<String> mediaServicesAccountName) {
            $.mediaServicesAccountName = mediaServicesAccountName;
            return this;
        }

        /**
         * @param mediaServicesAccountName The Media Services account name. Changing this forces a new Account Filter to be created.
         * 
         * @return builder
         * 
         */
        public Builder mediaServicesAccountName(String mediaServicesAccountName) {
            return mediaServicesAccountName(Output.of(mediaServicesAccountName));
        }

        /**
         * @param name The name which should be used for this Account Filter. Changing this forces a new Account Filter to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Account Filter. Changing this forces a new Account Filter to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param presentationTimeRange A `presentation_time_range` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder presentationTimeRange(@Nullable Output<AccountFilterPresentationTimeRangeArgs> presentationTimeRange) {
            $.presentationTimeRange = presentationTimeRange;
            return this;
        }

        /**
         * @param presentationTimeRange A `presentation_time_range` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder presentationTimeRange(AccountFilterPresentationTimeRangeArgs presentationTimeRange) {
            return presentationTimeRange(Output.of(presentationTimeRange));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Account Filter should exist. Changing this forces a new Account Filter to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Account Filter should exist. Changing this forces a new Account Filter to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param trackSelections One or more `track_selection` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder trackSelections(@Nullable Output<List<AccountFilterTrackSelectionArgs>> trackSelections) {
            $.trackSelections = trackSelections;
            return this;
        }

        /**
         * @param trackSelections One or more `track_selection` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder trackSelections(List<AccountFilterTrackSelectionArgs> trackSelections) {
            return trackSelections(Output.of(trackSelections));
        }

        /**
         * @param trackSelections One or more `track_selection` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder trackSelections(AccountFilterTrackSelectionArgs... trackSelections) {
            return trackSelections(List.of(trackSelections));
        }

        public AccountFilterArgs build() {
            $.mediaServicesAccountName = Objects.requireNonNull($.mediaServicesAccountName, "expected parameter 'mediaServicesAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}