// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.communication.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EmailServiceState extends com.pulumi.resources.ResourceArgs {

    public static final EmailServiceState Empty = new EmailServiceState();

    /**
     * The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` and `United States`. Defaults to `United States`. Changing this forces a new Email Communication Service to be created.
     * 
     */
    @Import(name="dataLocation")
    private @Nullable Output<String> dataLocation;

    /**
     * @return The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` and `United States`. Defaults to `United States`. Changing this forces a new Email Communication Service to be created.
     * 
     */
    public Optional<Output<String>> dataLocation() {
        return Optional.ofNullable(this.dataLocation);
    }

    /**
     * The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags which should be assigned to the Email Communication Service.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Email Communication Service.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private EmailServiceState() {}

    private EmailServiceState(EmailServiceState $) {
        this.dataLocation = $.dataLocation;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailServiceState $;

        public Builder() {
            $ = new EmailServiceState();
        }

        public Builder(EmailServiceState defaults) {
            $ = new EmailServiceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataLocation The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` and `United States`. Defaults to `United States`. Changing this forces a new Email Communication Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataLocation(@Nullable Output<String> dataLocation) {
            $.dataLocation = dataLocation;
            return this;
        }

        /**
         * @param dataLocation The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` and `United States`. Defaults to `United States`. Changing this forces a new Email Communication Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataLocation(String dataLocation) {
            return dataLocation(Output.of(dataLocation));
        }

        /**
         * @param name The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Email Communication Service.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Email Communication Service.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public EmailServiceState build() {
            return $;
        }
    }

}