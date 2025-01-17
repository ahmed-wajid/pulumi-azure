// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetIpGroupsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of IP Group IDs.
     * 
     */
    private List<String> ids;
    private String location;
    private String name;
    /**
     * @return A list of IP Group Names.
     * 
     */
    private List<String> names;
    private String resourceGroupName;
    private Map<String,String> tags;

    private GetIpGroupsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of IP Group IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return A list of IP Group Names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private String location;
        private String name;
        private List<String> names;
        private String resourceGroupName;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetIpGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.names = defaults.names;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIpGroupsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetIpGroupsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetIpGroupsResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIpGroupsResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetIpGroupsResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetIpGroupsResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetIpGroupsResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public GetIpGroupsResult build() {
            final var _resultValue = new GetIpGroupsResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.names = names;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
