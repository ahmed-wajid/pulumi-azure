// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterStorageProfile {
    /**
     * @return Is the Blob CSI driver enabled? Defaults to `false`.
     * 
     */
    private @Nullable Boolean blobDriverEnabled;
    /**
     * @return Is the Disk CSI driver enabled? Defaults to `true`.
     * 
     */
    private @Nullable Boolean diskDriverEnabled;
    /**
     * @return Disk CSI Driver version to be used. Possible values are `v1` and `v2`. Defaults to `v1`.
     * 
     */
    private @Nullable String diskDriverVersion;
    /**
     * @return Is the File CSI driver enabled? Defaults to `true`.
     * 
     */
    private @Nullable Boolean fileDriverEnabled;
    /**
     * @return Is the Snapshot Controller enabled? Defaults to `true`.
     * 
     */
    private @Nullable Boolean snapshotControllerEnabled;

    private KubernetesClusterStorageProfile() {}
    /**
     * @return Is the Blob CSI driver enabled? Defaults to `false`.
     * 
     */
    public Optional<Boolean> blobDriverEnabled() {
        return Optional.ofNullable(this.blobDriverEnabled);
    }
    /**
     * @return Is the Disk CSI driver enabled? Defaults to `true`.
     * 
     */
    public Optional<Boolean> diskDriverEnabled() {
        return Optional.ofNullable(this.diskDriverEnabled);
    }
    /**
     * @return Disk CSI Driver version to be used. Possible values are `v1` and `v2`. Defaults to `v1`.
     * 
     */
    public Optional<String> diskDriverVersion() {
        return Optional.ofNullable(this.diskDriverVersion);
    }
    /**
     * @return Is the File CSI driver enabled? Defaults to `true`.
     * 
     */
    public Optional<Boolean> fileDriverEnabled() {
        return Optional.ofNullable(this.fileDriverEnabled);
    }
    /**
     * @return Is the Snapshot Controller enabled? Defaults to `true`.
     * 
     */
    public Optional<Boolean> snapshotControllerEnabled() {
        return Optional.ofNullable(this.snapshotControllerEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterStorageProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean blobDriverEnabled;
        private @Nullable Boolean diskDriverEnabled;
        private @Nullable String diskDriverVersion;
        private @Nullable Boolean fileDriverEnabled;
        private @Nullable Boolean snapshotControllerEnabled;
        public Builder() {}
        public Builder(KubernetesClusterStorageProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobDriverEnabled = defaults.blobDriverEnabled;
    	      this.diskDriverEnabled = defaults.diskDriverEnabled;
    	      this.diskDriverVersion = defaults.diskDriverVersion;
    	      this.fileDriverEnabled = defaults.fileDriverEnabled;
    	      this.snapshotControllerEnabled = defaults.snapshotControllerEnabled;
        }

        @CustomType.Setter
        public Builder blobDriverEnabled(@Nullable Boolean blobDriverEnabled) {
            this.blobDriverEnabled = blobDriverEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder diskDriverEnabled(@Nullable Boolean diskDriverEnabled) {
            this.diskDriverEnabled = diskDriverEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder diskDriverVersion(@Nullable String diskDriverVersion) {
            this.diskDriverVersion = diskDriverVersion;
            return this;
        }
        @CustomType.Setter
        public Builder fileDriverEnabled(@Nullable Boolean fileDriverEnabled) {
            this.fileDriverEnabled = fileDriverEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotControllerEnabled(@Nullable Boolean snapshotControllerEnabled) {
            this.snapshotControllerEnabled = snapshotControllerEnabled;
            return this;
        }
        public KubernetesClusterStorageProfile build() {
            final var o = new KubernetesClusterStorageProfile();
            o.blobDriverEnabled = blobDriverEnabled;
            o.diskDriverEnabled = diskDriverEnabled;
            o.diskDriverVersion = diskDriverVersion;
            o.fileDriverEnabled = fileDriverEnabled;
            o.snapshotControllerEnabled = snapshotControllerEnabled;
            return o;
        }
    }
}