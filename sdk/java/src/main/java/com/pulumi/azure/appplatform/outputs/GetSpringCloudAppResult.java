// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.azure.appplatform.outputs.GetSpringCloudAppIdentity;
import com.pulumi.azure.appplatform.outputs.GetSpringCloudAppPersistentDisk;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSpringCloudAppResult {
    /**
     * @return The Fully Qualified DNS Name.
     * 
     */
    private final String fqdn;
    /**
     * @return Is only HTTPS allowed?
     * 
     */
    private final Boolean httpsOnly;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return An `identity` block as defined below.
     * 
     */
    private final List<GetSpringCloudAppIdentity> identities;
    /**
     * @return Does the Spring Cloud Application have public endpoint?
     * 
     */
    private final Boolean isPublic;
    private final String name;
    /**
     * @return A `persistent_disk` block as defined below.
     * 
     */
    private final List<GetSpringCloudAppPersistentDisk> persistentDisks;
    private final String resourceGroupName;
    private final String serviceName;
    /**
     * @return Is End to End TLS Enabled?
     * 
     */
    private final Boolean tlsEnabled;
    /**
     * @return The public endpoint of the Spring Cloud Application.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GetSpringCloudAppResult(
        @CustomType.Parameter("fqdn") String fqdn,
        @CustomType.Parameter("httpsOnly") Boolean httpsOnly,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identities") List<GetSpringCloudAppIdentity> identities,
        @CustomType.Parameter("isPublic") Boolean isPublic,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("persistentDisks") List<GetSpringCloudAppPersistentDisk> persistentDisks,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("tlsEnabled") Boolean tlsEnabled,
        @CustomType.Parameter("url") String url) {
        this.fqdn = fqdn;
        this.httpsOnly = httpsOnly;
        this.id = id;
        this.identities = identities;
        this.isPublic = isPublic;
        this.name = name;
        this.persistentDisks = persistentDisks;
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.tlsEnabled = tlsEnabled;
        this.url = url;
    }

    /**
     * @return The Fully Qualified DNS Name.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return Is only HTTPS allowed?
     * 
     */
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return An `identity` block as defined below.
     * 
     */
    public List<GetSpringCloudAppIdentity> identities() {
        return this.identities;
    }
    /**
     * @return Does the Spring Cloud Application have public endpoint?
     * 
     */
    public Boolean isPublic() {
        return this.isPublic;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return A `persistent_disk` block as defined below.
     * 
     */
    public List<GetSpringCloudAppPersistentDisk> persistentDisks() {
        return this.persistentDisks;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return Is End to End TLS Enabled?
     * 
     */
    public Boolean tlsEnabled() {
        return this.tlsEnabled;
    }
    /**
     * @return The public endpoint of the Spring Cloud Application.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpringCloudAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fqdn;
        private Boolean httpsOnly;
        private String id;
        private List<GetSpringCloudAppIdentity> identities;
        private Boolean isPublic;
        private String name;
        private List<GetSpringCloudAppPersistentDisk> persistentDisks;
        private String resourceGroupName;
        private String serviceName;
        private Boolean tlsEnabled;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpringCloudAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.isPublic = defaults.isPublic;
    	      this.name = defaults.name;
    	      this.persistentDisks = defaults.persistentDisks;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.tlsEnabled = defaults.tlsEnabled;
    	      this.url = defaults.url;
        }

        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        public Builder httpsOnly(Boolean httpsOnly) {
            this.httpsOnly = Objects.requireNonNull(httpsOnly);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identities(List<GetSpringCloudAppIdentity> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }
        public Builder identities(GetSpringCloudAppIdentity... identities) {
            return identities(List.of(identities));
        }
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = Objects.requireNonNull(isPublic);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder persistentDisks(List<GetSpringCloudAppPersistentDisk> persistentDisks) {
            this.persistentDisks = Objects.requireNonNull(persistentDisks);
            return this;
        }
        public Builder persistentDisks(GetSpringCloudAppPersistentDisk... persistentDisks) {
            return persistentDisks(List.of(persistentDisks));
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder tlsEnabled(Boolean tlsEnabled) {
            this.tlsEnabled = Objects.requireNonNull(tlsEnabled);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetSpringCloudAppResult build() {
            return new GetSpringCloudAppResult(fqdn, httpsOnly, id, identities, isPublic, name, persistentDisks, resourceGroupName, serviceName, tlsEnabled, url);
        }
    }
}