// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSpringCloudAppIdentity {
    private final List<String> identityIds;
    /**
     * @return The Principal ID for the Service Principal associated with the Managed Service Identity of this Spring Cloud Application.
     * 
     */
    private final String principalId;
    /**
     * @return The Tenant ID for the Service Principal associated with the Managed Service Identity of this Spring Cloud Application.
     * 
     */
    private final String tenantId;
    /**
     * @return The Type of Managed Identity assigned to the Spring Cloud Application.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSpringCloudAppIdentity(
        @CustomType.Parameter("identityIds") List<String> identityIds,
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.identityIds = identityIds;
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    public List<String> identityIds() {
        return this.identityIds;
    }
    /**
     * @return The Principal ID for the Service Principal associated with the Managed Service Identity of this Spring Cloud Application.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The Tenant ID for the Service Principal associated with the Managed Service Identity of this Spring Cloud Application.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return The Type of Managed Identity assigned to the Spring Cloud Application.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpringCloudAppIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> identityIds;
        private String principalId;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpringCloudAppIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder identityIds(List<String> identityIds) {
            this.identityIds = Objects.requireNonNull(identityIds);
            return this;
        }
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSpringCloudAppIdentity build() {
            return new GetSpringCloudAppIdentity(identityIds, principalId, tenantId, type);
        }
    }
}