// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImagesImageOsDisk {
    /**
     * @return the URI in Azure storage of the blob used to create the image.
     * 
     */
    private final String blobUri;
    /**
     * @return the caching mode for the Data Disk.
     * 
     */
    private final String caching;
    /**
     * @return the ID of the Managed Disk used as the Data Disk Image.
     * 
     */
    private final String managedDiskId;
    /**
     * @return the State of the OS used in the Image.
     * 
     */
    private final String osState;
    /**
     * @return the type of Operating System used on the OS Disk.
     * 
     */
    private final String osType;
    /**
     * @return the size of this Data Disk in GB.
     * 
     */
    private final Integer sizeGb;

    @CustomType.Constructor
    private GetImagesImageOsDisk(
        @CustomType.Parameter("blobUri") String blobUri,
        @CustomType.Parameter("caching") String caching,
        @CustomType.Parameter("managedDiskId") String managedDiskId,
        @CustomType.Parameter("osState") String osState,
        @CustomType.Parameter("osType") String osType,
        @CustomType.Parameter("sizeGb") Integer sizeGb) {
        this.blobUri = blobUri;
        this.caching = caching;
        this.managedDiskId = managedDiskId;
        this.osState = osState;
        this.osType = osType;
        this.sizeGb = sizeGb;
    }

    /**
     * @return the URI in Azure storage of the blob used to create the image.
     * 
     */
    public String blobUri() {
        return this.blobUri;
    }
    /**
     * @return the caching mode for the Data Disk.
     * 
     */
    public String caching() {
        return this.caching;
    }
    /**
     * @return the ID of the Managed Disk used as the Data Disk Image.
     * 
     */
    public String managedDiskId() {
        return this.managedDiskId;
    }
    /**
     * @return the State of the OS used in the Image.
     * 
     */
    public String osState() {
        return this.osState;
    }
    /**
     * @return the type of Operating System used on the OS Disk.
     * 
     */
    public String osType() {
        return this.osType;
    }
    /**
     * @return the size of this Data Disk in GB.
     * 
     */
    public Integer sizeGb() {
        return this.sizeGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagesImageOsDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blobUri;
        private String caching;
        private String managedDiskId;
        private String osState;
        private String osType;
        private Integer sizeGb;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImagesImageOsDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobUri = defaults.blobUri;
    	      this.caching = defaults.caching;
    	      this.managedDiskId = defaults.managedDiskId;
    	      this.osState = defaults.osState;
    	      this.osType = defaults.osType;
    	      this.sizeGb = defaults.sizeGb;
        }

        public Builder blobUri(String blobUri) {
            this.blobUri = Objects.requireNonNull(blobUri);
            return this;
        }
        public Builder caching(String caching) {
            this.caching = Objects.requireNonNull(caching);
            return this;
        }
        public Builder managedDiskId(String managedDiskId) {
            this.managedDiskId = Objects.requireNonNull(managedDiskId);
            return this;
        }
        public Builder osState(String osState) {
            this.osState = Objects.requireNonNull(osState);
            return this;
        }
        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder sizeGb(Integer sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }        public GetImagesImageOsDisk build() {
            return new GetImagesImageOsDisk(blobUri, caching, managedDiskId, osState, osType, sizeGb);
        }
    }
}