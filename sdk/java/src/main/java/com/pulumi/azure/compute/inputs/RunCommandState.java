// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.RunCommandErrorBlobManagedIdentityArgs;
import com.pulumi.azure.compute.inputs.RunCommandInstanceViewArgs;
import com.pulumi.azure.compute.inputs.RunCommandOutputBlobManagedIdentityArgs;
import com.pulumi.azure.compute.inputs.RunCommandParameterArgs;
import com.pulumi.azure.compute.inputs.RunCommandProtectedParameterArgs;
import com.pulumi.azure.compute.inputs.RunCommandSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RunCommandState extends com.pulumi.resources.ResourceArgs {

    public static final RunCommandState Empty = new RunCommandState();

    /**
     * An `error_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
     * 
     */
    @Import(name="errorBlobManagedIdentity")
    private @Nullable Output<RunCommandErrorBlobManagedIdentityArgs> errorBlobManagedIdentity;

    /**
     * @return An `error_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
     * 
     */
    public Optional<Output<RunCommandErrorBlobManagedIdentityArgs>> errorBlobManagedIdentity() {
        return Optional.ofNullable(this.errorBlobManagedIdentity);
    }

    /**
     * Specifies the Azure storage blob where script error stream will be uploaded.
     * 
     */
    @Import(name="errorBlobUri")
    private @Nullable Output<String> errorBlobUri;

    /**
     * @return Specifies the Azure storage blob where script error stream will be uploaded.
     * 
     */
    public Optional<Output<String>> errorBlobUri() {
        return Optional.ofNullable(this.errorBlobUri);
    }

    @Import(name="instanceViews")
    private @Nullable Output<List<RunCommandInstanceViewArgs>> instanceViews;

    public Optional<Output<List<RunCommandInstanceViewArgs>>> instanceViews() {
        return Optional.ofNullable(this.instanceViews);
    }

    /**
     * The Azure Region where the Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of this Virtual Machine Run Command. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of this Virtual Machine Run Command. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An `output_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
     * 
     */
    @Import(name="outputBlobManagedIdentity")
    private @Nullable Output<RunCommandOutputBlobManagedIdentityArgs> outputBlobManagedIdentity;

    /**
     * @return An `output_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
     * 
     */
    public Optional<Output<RunCommandOutputBlobManagedIdentityArgs>> outputBlobManagedIdentity() {
        return Optional.ofNullable(this.outputBlobManagedIdentity);
    }

    /**
     * Specifies the Azure storage blob where script output stream will be uploaded. It can be basic blob URI with SAS token.
     * 
     */
    @Import(name="outputBlobUri")
    private @Nullable Output<String> outputBlobUri;

    /**
     * @return Specifies the Azure storage blob where script output stream will be uploaded. It can be basic blob URI with SAS token.
     * 
     */
    public Optional<Output<String>> outputBlobUri() {
        return Optional.ofNullable(this.outputBlobUri);
    }

    /**
     * A list of `parameter` blocks as defined below. The parameters used by the script.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<RunCommandParameterArgs>> parameters;

    /**
     * @return A list of `parameter` blocks as defined below. The parameters used by the script.
     * 
     */
    public Optional<Output<List<RunCommandParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * A list of `protected_parameter` blocks as defined below. The protected parameters used by the script.
     * 
     */
    @Import(name="protectedParameters")
    private @Nullable Output<List<RunCommandProtectedParameterArgs>> protectedParameters;

    /**
     * @return A list of `protected_parameter` blocks as defined below. The protected parameters used by the script.
     * 
     */
    public Optional<Output<List<RunCommandProtectedParameterArgs>>> protectedParameters() {
        return Optional.ofNullable(this.protectedParameters);
    }

    /**
     * Specifies the user account password on the VM when executing the Virtual Machine Run Command.
     * 
     */
    @Import(name="runAsPassword")
    private @Nullable Output<String> runAsPassword;

    /**
     * @return Specifies the user account password on the VM when executing the Virtual Machine Run Command.
     * 
     */
    public Optional<Output<String>> runAsPassword() {
        return Optional.ofNullable(this.runAsPassword);
    }

    /**
     * Specifies the user account on the VM when executing the Virtual Machine Run Command.
     * 
     */
    @Import(name="runAsUser")
    private @Nullable Output<String> runAsUser;

    /**
     * @return Specifies the user account on the VM when executing the Virtual Machine Run Command.
     * 
     */
    public Optional<Output<String>> runAsUser() {
        return Optional.ofNullable(this.runAsUser);
    }

    /**
     * A `source` block as defined below. The source of the run command script.
     * 
     */
    @Import(name="source")
    private @Nullable Output<RunCommandSourceArgs> source;

    /**
     * @return A `source` block as defined below. The source of the run command script.
     * 
     */
    public Optional<Output<RunCommandSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * A mapping of tags which should be assigned to the Virtual Machine Run Command.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Virtual Machine Run Command.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the Virtual Machine ID within which this Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    @Import(name="virtualMachineId")
    private @Nullable Output<String> virtualMachineId;

    /**
     * @return Specifies the Virtual Machine ID within which this Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    public Optional<Output<String>> virtualMachineId() {
        return Optional.ofNullable(this.virtualMachineId);
    }

    private RunCommandState() {}

    private RunCommandState(RunCommandState $) {
        this.errorBlobManagedIdentity = $.errorBlobManagedIdentity;
        this.errorBlobUri = $.errorBlobUri;
        this.instanceViews = $.instanceViews;
        this.location = $.location;
        this.name = $.name;
        this.outputBlobManagedIdentity = $.outputBlobManagedIdentity;
        this.outputBlobUri = $.outputBlobUri;
        this.parameters = $.parameters;
        this.protectedParameters = $.protectedParameters;
        this.runAsPassword = $.runAsPassword;
        this.runAsUser = $.runAsUser;
        this.source = $.source;
        this.tags = $.tags;
        this.virtualMachineId = $.virtualMachineId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RunCommandState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RunCommandState $;

        public Builder() {
            $ = new RunCommandState();
        }

        public Builder(RunCommandState defaults) {
            $ = new RunCommandState(Objects.requireNonNull(defaults));
        }

        /**
         * @param errorBlobManagedIdentity An `error_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
         * 
         * @return builder
         * 
         */
        public Builder errorBlobManagedIdentity(@Nullable Output<RunCommandErrorBlobManagedIdentityArgs> errorBlobManagedIdentity) {
            $.errorBlobManagedIdentity = errorBlobManagedIdentity;
            return this;
        }

        /**
         * @param errorBlobManagedIdentity An `error_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
         * 
         * @return builder
         * 
         */
        public Builder errorBlobManagedIdentity(RunCommandErrorBlobManagedIdentityArgs errorBlobManagedIdentity) {
            return errorBlobManagedIdentity(Output.of(errorBlobManagedIdentity));
        }

        /**
         * @param errorBlobUri Specifies the Azure storage blob where script error stream will be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder errorBlobUri(@Nullable Output<String> errorBlobUri) {
            $.errorBlobUri = errorBlobUri;
            return this;
        }

        /**
         * @param errorBlobUri Specifies the Azure storage blob where script error stream will be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder errorBlobUri(String errorBlobUri) {
            return errorBlobUri(Output.of(errorBlobUri));
        }

        public Builder instanceViews(@Nullable Output<List<RunCommandInstanceViewArgs>> instanceViews) {
            $.instanceViews = instanceViews;
            return this;
        }

        public Builder instanceViews(List<RunCommandInstanceViewArgs> instanceViews) {
            return instanceViews(Output.of(instanceViews));
        }

        public Builder instanceViews(RunCommandInstanceViewArgs... instanceViews) {
            return instanceViews(List.of(instanceViews));
        }

        /**
         * @param location The Azure Region where the Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of this Virtual Machine Run Command. Changing this forces a new Virtual Machine Run Command to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of this Virtual Machine Run Command. Changing this forces a new Virtual Machine Run Command to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputBlobManagedIdentity An `output_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
         * 
         * @return builder
         * 
         */
        public Builder outputBlobManagedIdentity(@Nullable Output<RunCommandOutputBlobManagedIdentityArgs> outputBlobManagedIdentity) {
            $.outputBlobManagedIdentity = outputBlobManagedIdentity;
            return this;
        }

        /**
         * @param outputBlobManagedIdentity An `output_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
         * 
         * @return builder
         * 
         */
        public Builder outputBlobManagedIdentity(RunCommandOutputBlobManagedIdentityArgs outputBlobManagedIdentity) {
            return outputBlobManagedIdentity(Output.of(outputBlobManagedIdentity));
        }

        /**
         * @param outputBlobUri Specifies the Azure storage blob where script output stream will be uploaded. It can be basic blob URI with SAS token.
         * 
         * @return builder
         * 
         */
        public Builder outputBlobUri(@Nullable Output<String> outputBlobUri) {
            $.outputBlobUri = outputBlobUri;
            return this;
        }

        /**
         * @param outputBlobUri Specifies the Azure storage blob where script output stream will be uploaded. It can be basic blob URI with SAS token.
         * 
         * @return builder
         * 
         */
        public Builder outputBlobUri(String outputBlobUri) {
            return outputBlobUri(Output.of(outputBlobUri));
        }

        /**
         * @param parameters A list of `parameter` blocks as defined below. The parameters used by the script.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<RunCommandParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A list of `parameter` blocks as defined below. The parameters used by the script.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<RunCommandParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters A list of `parameter` blocks as defined below. The parameters used by the script.
         * 
         * @return builder
         * 
         */
        public Builder parameters(RunCommandParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param protectedParameters A list of `protected_parameter` blocks as defined below. The protected parameters used by the script.
         * 
         * @return builder
         * 
         */
        public Builder protectedParameters(@Nullable Output<List<RunCommandProtectedParameterArgs>> protectedParameters) {
            $.protectedParameters = protectedParameters;
            return this;
        }

        /**
         * @param protectedParameters A list of `protected_parameter` blocks as defined below. The protected parameters used by the script.
         * 
         * @return builder
         * 
         */
        public Builder protectedParameters(List<RunCommandProtectedParameterArgs> protectedParameters) {
            return protectedParameters(Output.of(protectedParameters));
        }

        /**
         * @param protectedParameters A list of `protected_parameter` blocks as defined below. The protected parameters used by the script.
         * 
         * @return builder
         * 
         */
        public Builder protectedParameters(RunCommandProtectedParameterArgs... protectedParameters) {
            return protectedParameters(List.of(protectedParameters));
        }

        /**
         * @param runAsPassword Specifies the user account password on the VM when executing the Virtual Machine Run Command.
         * 
         * @return builder
         * 
         */
        public Builder runAsPassword(@Nullable Output<String> runAsPassword) {
            $.runAsPassword = runAsPassword;
            return this;
        }

        /**
         * @param runAsPassword Specifies the user account password on the VM when executing the Virtual Machine Run Command.
         * 
         * @return builder
         * 
         */
        public Builder runAsPassword(String runAsPassword) {
            return runAsPassword(Output.of(runAsPassword));
        }

        /**
         * @param runAsUser Specifies the user account on the VM when executing the Virtual Machine Run Command.
         * 
         * @return builder
         * 
         */
        public Builder runAsUser(@Nullable Output<String> runAsUser) {
            $.runAsUser = runAsUser;
            return this;
        }

        /**
         * @param runAsUser Specifies the user account on the VM when executing the Virtual Machine Run Command.
         * 
         * @return builder
         * 
         */
        public Builder runAsUser(String runAsUser) {
            return runAsUser(Output.of(runAsUser));
        }

        /**
         * @param source A `source` block as defined below. The source of the run command script.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<RunCommandSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source A `source` block as defined below. The source of the run command script.
         * 
         * @return builder
         * 
         */
        public Builder source(RunCommandSourceArgs source) {
            return source(Output.of(source));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Virtual Machine Run Command.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Virtual Machine Run Command.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param virtualMachineId Specifies the Virtual Machine ID within which this Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineId(@Nullable Output<String> virtualMachineId) {
            $.virtualMachineId = virtualMachineId;
            return this;
        }

        /**
         * @param virtualMachineId Specifies the Virtual Machine ID within which this Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineId(String virtualMachineId) {
            return virtualMachineId(Output.of(virtualMachineId));
        }

        public RunCommandState build() {
            return $;
        }
    }

}