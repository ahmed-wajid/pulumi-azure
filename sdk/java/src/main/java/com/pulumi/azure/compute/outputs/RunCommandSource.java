// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.RunCommandSourceScriptUriManagedIdentity;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RunCommandSource {
    private @Nullable String commandId;
    private @Nullable String script;
    private @Nullable String scriptUri;
    /**
     * @return A `script_uri_managed_identity` block as defined above.
     * 
     */
    private @Nullable RunCommandSourceScriptUriManagedIdentity scriptUriManagedIdentity;

    private RunCommandSource() {}
    public Optional<String> commandId() {
        return Optional.ofNullable(this.commandId);
    }
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }
    public Optional<String> scriptUri() {
        return Optional.ofNullable(this.scriptUri);
    }
    /**
     * @return A `script_uri_managed_identity` block as defined above.
     * 
     */
    public Optional<RunCommandSourceScriptUriManagedIdentity> scriptUriManagedIdentity() {
        return Optional.ofNullable(this.scriptUriManagedIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunCommandSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String commandId;
        private @Nullable String script;
        private @Nullable String scriptUri;
        private @Nullable RunCommandSourceScriptUriManagedIdentity scriptUriManagedIdentity;
        public Builder() {}
        public Builder(RunCommandSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandId = defaults.commandId;
    	      this.script = defaults.script;
    	      this.scriptUri = defaults.scriptUri;
    	      this.scriptUriManagedIdentity = defaults.scriptUriManagedIdentity;
        }

        @CustomType.Setter
        public Builder commandId(@Nullable String commandId) {

            this.commandId = commandId;
            return this;
        }
        @CustomType.Setter
        public Builder script(@Nullable String script) {

            this.script = script;
            return this;
        }
        @CustomType.Setter
        public Builder scriptUri(@Nullable String scriptUri) {

            this.scriptUri = scriptUri;
            return this;
        }
        @CustomType.Setter
        public Builder scriptUriManagedIdentity(@Nullable RunCommandSourceScriptUriManagedIdentity scriptUriManagedIdentity) {

            this.scriptUriManagedIdentity = scriptUriManagedIdentity;
            return this;
        }
        public RunCommandSource build() {
            final var _resultValue = new RunCommandSource();
            _resultValue.commandId = commandId;
            _resultValue.script = script;
            _resultValue.scriptUri = scriptUri;
            _resultValue.scriptUriManagedIdentity = scriptUriManagedIdentity;
            return _resultValue;
        }
    }
}