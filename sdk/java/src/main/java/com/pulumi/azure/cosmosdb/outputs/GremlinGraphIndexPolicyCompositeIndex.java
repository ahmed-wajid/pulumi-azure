// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.azure.cosmosdb.outputs.GremlinGraphIndexPolicyCompositeIndexIndex;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GremlinGraphIndexPolicyCompositeIndex {
    /**
     * @return One or more `index` blocks as defined below.
     * 
     */
    private final List<GremlinGraphIndexPolicyCompositeIndexIndex> indices;

    @CustomType.Constructor
    private GremlinGraphIndexPolicyCompositeIndex(@CustomType.Parameter("indices") List<GremlinGraphIndexPolicyCompositeIndexIndex> indices) {
        this.indices = indices;
    }

    /**
     * @return One or more `index` blocks as defined below.
     * 
     */
    public List<GremlinGraphIndexPolicyCompositeIndexIndex> indices() {
        return this.indices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GremlinGraphIndexPolicyCompositeIndex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GremlinGraphIndexPolicyCompositeIndexIndex> indices;

        public Builder() {
    	      // Empty
        }

        public Builder(GremlinGraphIndexPolicyCompositeIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indices = defaults.indices;
        }

        public Builder indices(List<GremlinGraphIndexPolicyCompositeIndexIndex> indices) {
            this.indices = Objects.requireNonNull(indices);
            return this;
        }
        public Builder indices(GremlinGraphIndexPolicyCompositeIndexIndex... indices) {
            return indices(List.of(indices));
        }        public GremlinGraphIndexPolicyCompositeIndex build() {
            return new GremlinGraphIndexPolicyCompositeIndex(indices);
        }
    }
}