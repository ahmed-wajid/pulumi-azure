// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionGroupArmRoleReceiverArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionGroupArmRoleReceiverArgs Empty = new ActionGroupArmRoleReceiverArgs();

    /**
     * The name of the ARM role receiver.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the ARM role receiver.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The arm role id.
     * 
     */
    @Import(name="roleId", required=true)
    private Output<String> roleId;

    /**
     * @return The arm role id.
     * 
     */
    public Output<String> roleId() {
        return this.roleId;
    }

    /**
     * Enables or disables the common alert schema.
     * 
     */
    @Import(name="useCommonAlertSchema")
    private @Nullable Output<Boolean> useCommonAlertSchema;

    /**
     * @return Enables or disables the common alert schema.
     * 
     */
    public Optional<Output<Boolean>> useCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    private ActionGroupArmRoleReceiverArgs() {}

    private ActionGroupArmRoleReceiverArgs(ActionGroupArmRoleReceiverArgs $) {
        this.name = $.name;
        this.roleId = $.roleId;
        this.useCommonAlertSchema = $.useCommonAlertSchema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionGroupArmRoleReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionGroupArmRoleReceiverArgs $;

        public Builder() {
            $ = new ActionGroupArmRoleReceiverArgs();
        }

        public Builder(ActionGroupArmRoleReceiverArgs defaults) {
            $ = new ActionGroupArmRoleReceiverArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the ARM role receiver.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the ARM role receiver.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleId The arm role id.
         * 
         * @return builder
         * 
         */
        public Builder roleId(Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId The arm role id.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        /**
         * @param useCommonAlertSchema Enables or disables the common alert schema.
         * 
         * @return builder
         * 
         */
        public Builder useCommonAlertSchema(@Nullable Output<Boolean> useCommonAlertSchema) {
            $.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        /**
         * @param useCommonAlertSchema Enables or disables the common alert schema.
         * 
         * @return builder
         * 
         */
        public Builder useCommonAlertSchema(Boolean useCommonAlertSchema) {
            return useCommonAlertSchema(Output.of(useCommonAlertSchema));
        }

        public ActionGroupArmRoleReceiverArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.roleId = Objects.requireNonNull($.roleId, "expected parameter 'roleId' to be non-null");
            return $;
        }
    }

}