// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegistryScopeMapResult {
    /**
     * @return The actions for the Scope Map.
     * 
     */
    private final List<String> actions;
    private final String containerRegistryName;
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String resourceGroupName;

    @CustomType.Constructor
    private GetRegistryScopeMapResult(
        @CustomType.Parameter("actions") List<String> actions,
        @CustomType.Parameter("containerRegistryName") String containerRegistryName,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName) {
        this.actions = actions;
        this.containerRegistryName = containerRegistryName;
        this.description = description;
        this.id = id;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * @return The actions for the Scope Map.
     * 
     */
    public List<String> actions() {
        return this.actions;
    }
    public String containerRegistryName() {
        return this.containerRegistryName;
    }
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
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryScopeMapResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private String containerRegistryName;
        private String description;
        private String id;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryScopeMapResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.containerRegistryName = defaults.containerRegistryName;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public Builder containerRegistryName(String containerRegistryName) {
            this.containerRegistryName = Objects.requireNonNull(containerRegistryName);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetRegistryScopeMapResult build() {
            return new GetRegistryScopeMapResult(actions, containerRegistryName, description, id, name, resourceGroupName);
        }
    }
}