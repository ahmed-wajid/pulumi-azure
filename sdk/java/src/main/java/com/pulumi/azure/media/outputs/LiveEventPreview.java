// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.azure.media.outputs.LiveEventPreviewEndpoint;
import com.pulumi.azure.media.outputs.LiveEventPreviewIpAccessControlAllow;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveEventPreview {
    /**
     * @return An alternative media identifier associated with the streaming locator created for the preview. The identifier can be used in the `CustomLicenseAcquisitionUrlTemplate` or the `CustomKeyAcquisitionUrlTemplate` of the Streaming Policy specified in the `streaming_policy_name` field. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String alternativeMediaId;
    private final @Nullable List<LiveEventPreviewEndpoint> endpoints;
    /**
     * @return One or more `ip_access_control_allow` blocks as defined above.
     * 
     */
    private final @Nullable List<LiveEventPreviewIpAccessControlAllow> ipAccessControlAllows;
    /**
     * @return The identifier of the preview locator in GUID format. Specifying this at creation time allows the caller to know the preview locator url before the event is created. If omitted, the service will generate a random identifier. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String previewLocator;
    /**
     * @return The name of streaming policy used for the live event preview. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String streamingPolicyName;

    @CustomType.Constructor
    private LiveEventPreview(
        @CustomType.Parameter("alternativeMediaId") @Nullable String alternativeMediaId,
        @CustomType.Parameter("endpoints") @Nullable List<LiveEventPreviewEndpoint> endpoints,
        @CustomType.Parameter("ipAccessControlAllows") @Nullable List<LiveEventPreviewIpAccessControlAllow> ipAccessControlAllows,
        @CustomType.Parameter("previewLocator") @Nullable String previewLocator,
        @CustomType.Parameter("streamingPolicyName") @Nullable String streamingPolicyName) {
        this.alternativeMediaId = alternativeMediaId;
        this.endpoints = endpoints;
        this.ipAccessControlAllows = ipAccessControlAllows;
        this.previewLocator = previewLocator;
        this.streamingPolicyName = streamingPolicyName;
    }

    /**
     * @return An alternative media identifier associated with the streaming locator created for the preview. The identifier can be used in the `CustomLicenseAcquisitionUrlTemplate` or the `CustomKeyAcquisitionUrlTemplate` of the Streaming Policy specified in the `streaming_policy_name` field. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> alternativeMediaId() {
        return Optional.ofNullable(this.alternativeMediaId);
    }
    public List<LiveEventPreviewEndpoint> endpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    /**
     * @return One or more `ip_access_control_allow` blocks as defined above.
     * 
     */
    public List<LiveEventPreviewIpAccessControlAllow> ipAccessControlAllows() {
        return this.ipAccessControlAllows == null ? List.of() : this.ipAccessControlAllows;
    }
    /**
     * @return The identifier of the preview locator in GUID format. Specifying this at creation time allows the caller to know the preview locator url before the event is created. If omitted, the service will generate a random identifier. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> previewLocator() {
        return Optional.ofNullable(this.previewLocator);
    }
    /**
     * @return The name of streaming policy used for the live event preview. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> streamingPolicyName() {
        return Optional.ofNullable(this.streamingPolicyName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventPreview defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alternativeMediaId;
        private @Nullable List<LiveEventPreviewEndpoint> endpoints;
        private @Nullable List<LiveEventPreviewIpAccessControlAllow> ipAccessControlAllows;
        private @Nullable String previewLocator;
        private @Nullable String streamingPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventPreview defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeMediaId = defaults.alternativeMediaId;
    	      this.endpoints = defaults.endpoints;
    	      this.ipAccessControlAllows = defaults.ipAccessControlAllows;
    	      this.previewLocator = defaults.previewLocator;
    	      this.streamingPolicyName = defaults.streamingPolicyName;
        }

        public Builder alternativeMediaId(@Nullable String alternativeMediaId) {
            this.alternativeMediaId = alternativeMediaId;
            return this;
        }
        public Builder endpoints(@Nullable List<LiveEventPreviewEndpoint> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(LiveEventPreviewEndpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder ipAccessControlAllows(@Nullable List<LiveEventPreviewIpAccessControlAllow> ipAccessControlAllows) {
            this.ipAccessControlAllows = ipAccessControlAllows;
            return this;
        }
        public Builder ipAccessControlAllows(LiveEventPreviewIpAccessControlAllow... ipAccessControlAllows) {
            return ipAccessControlAllows(List.of(ipAccessControlAllows));
        }
        public Builder previewLocator(@Nullable String previewLocator) {
            this.previewLocator = previewLocator;
            return this;
        }
        public Builder streamingPolicyName(@Nullable String streamingPolicyName) {
            this.streamingPolicyName = streamingPolicyName;
            return this;
        }        public LiveEventPreview build() {
            return new LiveEventPreview(alternativeMediaId, endpoints, ipAccessControlAllows, previewLocator, streamingPolicyName);
        }
    }
}