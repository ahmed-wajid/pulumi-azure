// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GremlinGraphIndexPolicySpatialIndex {
    /**
     * @return Path for which the indexing behaviour applies to. According to the service design, all spatial types including `LineString`, `MultiPolygon`, `Point`, and `Polygon` will be applied to the path.
     * 
     */
    private final String path;
    private final @Nullable List<String> types;

    @CustomType.Constructor
    private GremlinGraphIndexPolicySpatialIndex(
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("types") @Nullable List<String> types) {
        this.path = path;
        this.types = types;
    }

    /**
     * @return Path for which the indexing behaviour applies to. According to the service design, all spatial types including `LineString`, `MultiPolygon`, `Point`, and `Polygon` will be applied to the path.
     * 
     */
    public String path() {
        return this.path;
    }
    public List<String> types() {
        return this.types == null ? List.of() : this.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GremlinGraphIndexPolicySpatialIndex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private @Nullable List<String> types;

        public Builder() {
    	      // Empty
        }

        public Builder(GremlinGraphIndexPolicySpatialIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.types = defaults.types;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder types(@Nullable List<String> types) {
            this.types = types;
            return this;
        }
        public Builder types(String... types) {
            return types(List.of(types));
        }        public GremlinGraphIndexPolicySpatialIndex build() {
            return new GremlinGraphIndexPolicySpatialIndex(path, types);
        }
    }
}