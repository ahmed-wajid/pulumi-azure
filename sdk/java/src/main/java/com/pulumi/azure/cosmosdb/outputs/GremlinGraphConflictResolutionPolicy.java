// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GremlinGraphConflictResolutionPolicy {
    /**
     * @return The conflict resolution path in the case of LastWriterWins mode.
     * 
     */
    private final @Nullable String conflictResolutionPath;
    /**
     * @return The procedure to resolve conflicts in the case of custom mode.
     * 
     */
    private final @Nullable String conflictResolutionProcedure;
    /**
     * @return Indicates the conflict resolution mode. Possible values include: `LastWriterWins`, `Custom`.
     * 
     */
    private final String mode;

    @CustomType.Constructor
    private GremlinGraphConflictResolutionPolicy(
        @CustomType.Parameter("conflictResolutionPath") @Nullable String conflictResolutionPath,
        @CustomType.Parameter("conflictResolutionProcedure") @Nullable String conflictResolutionProcedure,
        @CustomType.Parameter("mode") String mode) {
        this.conflictResolutionPath = conflictResolutionPath;
        this.conflictResolutionProcedure = conflictResolutionProcedure;
        this.mode = mode;
    }

    /**
     * @return The conflict resolution path in the case of LastWriterWins mode.
     * 
     */
    public Optional<String> conflictResolutionPath() {
        return Optional.ofNullable(this.conflictResolutionPath);
    }
    /**
     * @return The procedure to resolve conflicts in the case of custom mode.
     * 
     */
    public Optional<String> conflictResolutionProcedure() {
        return Optional.ofNullable(this.conflictResolutionProcedure);
    }
    /**
     * @return Indicates the conflict resolution mode. Possible values include: `LastWriterWins`, `Custom`.
     * 
     */
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GremlinGraphConflictResolutionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String conflictResolutionPath;
        private @Nullable String conflictResolutionProcedure;
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(GremlinGraphConflictResolutionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictResolutionPath = defaults.conflictResolutionPath;
    	      this.conflictResolutionProcedure = defaults.conflictResolutionProcedure;
    	      this.mode = defaults.mode;
        }

        public Builder conflictResolutionPath(@Nullable String conflictResolutionPath) {
            this.conflictResolutionPath = conflictResolutionPath;
            return this;
        }
        public Builder conflictResolutionProcedure(@Nullable String conflictResolutionProcedure) {
            this.conflictResolutionProcedure = conflictResolutionProcedure;
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }        public GremlinGraphConflictResolutionPolicy build() {
            return new GremlinGraphConflictResolutionPolicy(conflictResolutionPath, conflictResolutionProcedure, mode);
        }
    }
}