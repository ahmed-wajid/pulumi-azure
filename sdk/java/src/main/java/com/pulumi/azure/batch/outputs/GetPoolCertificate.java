// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPoolCertificate {
    /**
     * @return The fully qualified ID of the certificate installed on the pool.
     * 
     */
    private final String id;
    /**
     * @return The location of the certificate store on the compute node into which the certificate is installed, either `CurrentUser` or `LocalMachine`.
     * 
     */
    private final String storeLocation;
    /**
     * @return The name of the certificate store on the compute node into which the certificate is installed.
     * 
     */
    private final String storeName;
    /**
     * @return Which user accounts on the compute node have access to the private data of the certificate.
     * 
     */
    private final List<String> visibilities;

    @CustomType.Constructor
    private GetPoolCertificate(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("storeLocation") String storeLocation,
        @CustomType.Parameter("storeName") String storeName,
        @CustomType.Parameter("visibilities") List<String> visibilities) {
        this.id = id;
        this.storeLocation = storeLocation;
        this.storeName = storeName;
        this.visibilities = visibilities;
    }

    /**
     * @return The fully qualified ID of the certificate installed on the pool.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The location of the certificate store on the compute node into which the certificate is installed, either `CurrentUser` or `LocalMachine`.
     * 
     */
    public String storeLocation() {
        return this.storeLocation;
    }
    /**
     * @return The name of the certificate store on the compute node into which the certificate is installed.
     * 
     */
    public String storeName() {
        return this.storeName;
    }
    /**
     * @return Which user accounts on the compute node have access to the private data of the certificate.
     * 
     */
    public List<String> visibilities() {
        return this.visibilities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String storeLocation;
        private String storeName;
        private List<String> visibilities;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPoolCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.storeLocation = defaults.storeLocation;
    	      this.storeName = defaults.storeName;
    	      this.visibilities = defaults.visibilities;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder storeLocation(String storeLocation) {
            this.storeLocation = Objects.requireNonNull(storeLocation);
            return this;
        }
        public Builder storeName(String storeName) {
            this.storeName = Objects.requireNonNull(storeName);
            return this;
        }
        public Builder visibilities(List<String> visibilities) {
            this.visibilities = Objects.requireNonNull(visibilities);
            return this;
        }
        public Builder visibilities(String... visibilities) {
            return visibilities(List.of(visibilities));
        }        public GetPoolCertificate build() {
            return new GetPoolCertificate(id, storeLocation, storeName, visibilities);
        }
    }
}