// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetNetworkManagerCrossTenantScope;
import com.pulumi.azure.network.outputs.GetNetworkManagerScope;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNetworkManagerResult {
    /**
     * @return One or more `cross_tenant_scopes` blocks as defined below.
     * 
     */
    private List<GetNetworkManagerCrossTenantScope> crossTenantScopes;
    /**
     * @return A description of the Network Manager.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region where the Network Manager exists.
     * 
     */
    private String location;
    private String name;
    private String resourceGroupName;
    /**
     * @return A list of configuration deployment type configured on the Network Manager.
     * 
     */
    private List<String> scopeAccesses;
    /**
     * @return A `scope` block as defined below.
     * 
     */
    private List<GetNetworkManagerScope> scopes;
    /**
     * @return A mapping of tags assigned to the Network Manager.
     * 
     */
    private Map<String,String> tags;

    private GetNetworkManagerResult() {}
    /**
     * @return One or more `cross_tenant_scopes` blocks as defined below.
     * 
     */
    public List<GetNetworkManagerCrossTenantScope> crossTenantScopes() {
        return this.crossTenantScopes;
    }
    /**
     * @return A description of the Network Manager.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region where the Network Manager exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A list of configuration deployment type configured on the Network Manager.
     * 
     */
    public List<String> scopeAccesses() {
        return this.scopeAccesses;
    }
    /**
     * @return A `scope` block as defined below.
     * 
     */
    public List<GetNetworkManagerScope> scopes() {
        return this.scopes;
    }
    /**
     * @return A mapping of tags assigned to the Network Manager.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkManagerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetNetworkManagerCrossTenantScope> crossTenantScopes;
        private String description;
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private List<String> scopeAccesses;
        private List<GetNetworkManagerScope> scopes;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetNetworkManagerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossTenantScopes = defaults.crossTenantScopes;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scopeAccesses = defaults.scopeAccesses;
    	      this.scopes = defaults.scopes;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder crossTenantScopes(List<GetNetworkManagerCrossTenantScope> crossTenantScopes) {
            if (crossTenantScopes == null) {
              throw new MissingRequiredPropertyException("GetNetworkManagerResult", "crossTenantScopes");
            }
            this.crossTenantScopes = crossTenantScopes;
            return this;
        }
        public Builder crossTenantScopes(GetNetworkManagerCrossTenantScope... crossTenantScopes) {
            return crossTenantScopes(List.of(crossTenantScopes));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetNetworkManagerResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNetworkManagerResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetNetworkManagerResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNetworkManagerResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetNetworkManagerResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder scopeAccesses(List<String> scopeAccesses) {
            if (scopeAccesses == null) {
              throw new MissingRequiredPropertyException("GetNetworkManagerResult", "scopeAccesses");
            }
            this.scopeAccesses = scopeAccesses;
            return this;
        }
        public Builder scopeAccesses(String... scopeAccesses) {
            return scopeAccesses(List.of(scopeAccesses));
        }
        @CustomType.Setter
        public Builder scopes(List<GetNetworkManagerScope> scopes) {
            if (scopes == null) {
              throw new MissingRequiredPropertyException("GetNetworkManagerResult", "scopes");
            }
            this.scopes = scopes;
            return this;
        }
        public Builder scopes(GetNetworkManagerScope... scopes) {
            return scopes(List.of(scopes));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetNetworkManagerResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public GetNetworkManagerResult build() {
            final var _resultValue = new GetNetworkManagerResult();
            _resultValue.crossTenantScopes = crossTenantScopes;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.scopeAccesses = scopeAccesses;
            _resultValue.scopes = scopes;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}