// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.azure.media.outputs.TransformOutputCustomPresetFilterOverlayAudio;
import com.pulumi.azure.media.outputs.TransformOutputCustomPresetFilterOverlayVideo;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransformOutputCustomPresetFilterOverlay {
    /**
     * @return An `audio` block as defined above.
     * 
     */
    private @Nullable TransformOutputCustomPresetFilterOverlayAudio audio;
    /**
     * @return A `video` block as defined below.
     * 
     */
    private @Nullable TransformOutputCustomPresetFilterOverlayVideo video;

    private TransformOutputCustomPresetFilterOverlay() {}
    /**
     * @return An `audio` block as defined above.
     * 
     */
    public Optional<TransformOutputCustomPresetFilterOverlayAudio> audio() {
        return Optional.ofNullable(this.audio);
    }
    /**
     * @return A `video` block as defined below.
     * 
     */
    public Optional<TransformOutputCustomPresetFilterOverlayVideo> video() {
        return Optional.ofNullable(this.video);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformOutputCustomPresetFilterOverlay defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable TransformOutputCustomPresetFilterOverlayAudio audio;
        private @Nullable TransformOutputCustomPresetFilterOverlayVideo video;
        public Builder() {}
        public Builder(TransformOutputCustomPresetFilterOverlay defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.video = defaults.video;
        }

        @CustomType.Setter
        public Builder audio(@Nullable TransformOutputCustomPresetFilterOverlayAudio audio) {
            this.audio = audio;
            return this;
        }
        @CustomType.Setter
        public Builder video(@Nullable TransformOutputCustomPresetFilterOverlayVideo video) {
            this.video = video;
            return this;
        }
        public TransformOutputCustomPresetFilterOverlay build() {
            final var o = new TransformOutputCustomPresetFilterOverlay();
            o.audio = audio;
            o.video = video;
            return o;
        }
    }
}