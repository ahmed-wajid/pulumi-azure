// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ActionHttpRunAfterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionHttpRunAfterArgs Empty = new ActionHttpRunAfterArgs();

    /**
     * Specifies the name of the precedent HTTP Action.
     * 
     */
    @Import(name="actionName", required=true)
    private Output<String> actionName;

    /**
     * @return Specifies the name of the precedent HTTP Action.
     * 
     */
    public Output<String> actionName() {
        return this.actionName;
    }

    /**
     * Specifies the expected result of the precedent HTTP Action, only after which the current HTTP Action will be triggered. Possible values include `Succeeded`, `Failed`, `Skipped` and `TimedOut`.
     * 
     */
    @Import(name="actionResult", required=true)
    private Output<String> actionResult;

    /**
     * @return Specifies the expected result of the precedent HTTP Action, only after which the current HTTP Action will be triggered. Possible values include `Succeeded`, `Failed`, `Skipped` and `TimedOut`.
     * 
     */
    public Output<String> actionResult() {
        return this.actionResult;
    }

    private ActionHttpRunAfterArgs() {}

    private ActionHttpRunAfterArgs(ActionHttpRunAfterArgs $) {
        this.actionName = $.actionName;
        this.actionResult = $.actionResult;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionHttpRunAfterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionHttpRunAfterArgs $;

        public Builder() {
            $ = new ActionHttpRunAfterArgs();
        }

        public Builder(ActionHttpRunAfterArgs defaults) {
            $ = new ActionHttpRunAfterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionName Specifies the name of the precedent HTTP Action.
         * 
         * @return builder
         * 
         */
        public Builder actionName(Output<String> actionName) {
            $.actionName = actionName;
            return this;
        }

        /**
         * @param actionName Specifies the name of the precedent HTTP Action.
         * 
         * @return builder
         * 
         */
        public Builder actionName(String actionName) {
            return actionName(Output.of(actionName));
        }

        /**
         * @param actionResult Specifies the expected result of the precedent HTTP Action, only after which the current HTTP Action will be triggered. Possible values include `Succeeded`, `Failed`, `Skipped` and `TimedOut`.
         * 
         * @return builder
         * 
         */
        public Builder actionResult(Output<String> actionResult) {
            $.actionResult = actionResult;
            return this;
        }

        /**
         * @param actionResult Specifies the expected result of the precedent HTTP Action, only after which the current HTTP Action will be triggered. Possible values include `Succeeded`, `Failed`, `Skipped` and `TimedOut`.
         * 
         * @return builder
         * 
         */
        public Builder actionResult(String actionResult) {
            return actionResult(Output.of(actionResult));
        }

        public ActionHttpRunAfterArgs build() {
            $.actionName = Objects.requireNonNull($.actionName, "expected parameter 'actionName' to be non-null");
            $.actionResult = Objects.requireNonNull($.actionResult, "expected parameter 'actionResult' to be non-null");
            return $;
        }
    }

}