// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.azure.datafactory.inputs.TriggerCustomEventPipelineArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerCustomEventState extends com.pulumi.resources.ResourceArgs {

    public static final TriggerCustomEventState Empty = new TriggerCustomEventState();

    /**
     * Specifies if the Data Factory Custom Event Trigger is activated. Defaults to `true`.
     * 
     */
    @Import(name="activated")
    private @Nullable Output<Boolean> activated;

    /**
     * @return Specifies if the Data Factory Custom Event Trigger is activated. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> activated() {
        return Optional.ofNullable(this.activated);
    }

    /**
     * A map of additional properties to associate with the Data Factory Custom Event Trigger.
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Custom Event Trigger.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Data Factory Custom Event Trigger.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Custom Event Trigger.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The ID of Data Factory in which to associate the Trigger with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId")
    private @Nullable Output<String> dataFactoryId;

    /**
     * @return The ID of Data Factory in which to associate the Trigger with. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> dataFactoryId() {
        return Optional.ofNullable(this.dataFactoryId);
    }

    /**
     * The description for the Data Factory Custom Event Trigger.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Custom Event Trigger.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of Event Grid Topic in which event will be listened. Changing this forces a new resource.
     * 
     */
    @Import(name="eventgridTopicId")
    private @Nullable Output<String> eventgridTopicId;

    /**
     * @return The ID of Event Grid Topic in which event will be listened. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> eventgridTopicId() {
        return Optional.ofNullable(this.eventgridTopicId);
    }

    /**
     * List of events that will fire this trigger. At least one event must be specified.
     * 
     */
    @Import(name="events")
    private @Nullable Output<List<String>> events;

    /**
     * @return List of events that will fire this trigger. At least one event must be specified.
     * 
     */
    public Optional<Output<List<String>>> events() {
        return Optional.ofNullable(this.events);
    }

    /**
     * Specifies the name of the Data Factory Custom Event Trigger. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Custom Event Trigger. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more `pipeline` blocks as defined below.
     * 
     */
    @Import(name="pipelines")
    private @Nullable Output<List<TriggerCustomEventPipelineArgs>> pipelines;

    /**
     * @return One or more `pipeline` blocks as defined below.
     * 
     */
    public Optional<Output<List<TriggerCustomEventPipelineArgs>>> pipelines() {
        return Optional.ofNullable(this.pipelines);
    }

    /**
     * The pattern that event subject starts with for trigger to fire.
     * 
     */
    @Import(name="subjectBeginsWith")
    private @Nullable Output<String> subjectBeginsWith;

    /**
     * @return The pattern that event subject starts with for trigger to fire.
     * 
     */
    public Optional<Output<String>> subjectBeginsWith() {
        return Optional.ofNullable(this.subjectBeginsWith);
    }

    /**
     * The pattern that event subject ends with for trigger to fire.
     * 
     */
    @Import(name="subjectEndsWith")
    private @Nullable Output<String> subjectEndsWith;

    /**
     * @return The pattern that event subject ends with for trigger to fire.
     * 
     */
    public Optional<Output<String>> subjectEndsWith() {
        return Optional.ofNullable(this.subjectEndsWith);
    }

    private TriggerCustomEventState() {}

    private TriggerCustomEventState(TriggerCustomEventState $) {
        this.activated = $.activated;
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.eventgridTopicId = $.eventgridTopicId;
        this.events = $.events;
        this.name = $.name;
        this.pipelines = $.pipelines;
        this.subjectBeginsWith = $.subjectBeginsWith;
        this.subjectEndsWith = $.subjectEndsWith;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerCustomEventState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerCustomEventState $;

        public Builder() {
            $ = new TriggerCustomEventState();
        }

        public Builder(TriggerCustomEventState defaults) {
            $ = new TriggerCustomEventState(Objects.requireNonNull(defaults));
        }

        /**
         * @param activated Specifies if the Data Factory Custom Event Trigger is activated. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder activated(@Nullable Output<Boolean> activated) {
            $.activated = activated;
            return this;
        }

        /**
         * @param activated Specifies if the Data Factory Custom Event Trigger is activated. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder activated(Boolean activated) {
            return activated(Output.of(activated));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Custom Event Trigger.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Custom Event Trigger.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Custom Event Trigger.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Custom Event Trigger.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Custom Event Trigger.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param dataFactoryId The ID of Data Factory in which to associate the Trigger with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(@Nullable Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The ID of Data Factory in which to associate the Trigger with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(String dataFactoryId) {
            return dataFactoryId(Output.of(dataFactoryId));
        }

        /**
         * @param description The description for the Data Factory Custom Event Trigger.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Custom Event Trigger.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param eventgridTopicId The ID of Event Grid Topic in which event will be listened. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder eventgridTopicId(@Nullable Output<String> eventgridTopicId) {
            $.eventgridTopicId = eventgridTopicId;
            return this;
        }

        /**
         * @param eventgridTopicId The ID of Event Grid Topic in which event will be listened. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder eventgridTopicId(String eventgridTopicId) {
            return eventgridTopicId(Output.of(eventgridTopicId));
        }

        /**
         * @param events List of events that will fire this trigger. At least one event must be specified.
         * 
         * @return builder
         * 
         */
        public Builder events(@Nullable Output<List<String>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events List of events that will fire this trigger. At least one event must be specified.
         * 
         * @return builder
         * 
         */
        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        /**
         * @param events List of events that will fire this trigger. At least one event must be specified.
         * 
         * @return builder
         * 
         */
        public Builder events(String... events) {
            return events(List.of(events));
        }

        /**
         * @param name Specifies the name of the Data Factory Custom Event Trigger. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Data Factory Custom Event Trigger. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pipelines One or more `pipeline` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder pipelines(@Nullable Output<List<TriggerCustomEventPipelineArgs>> pipelines) {
            $.pipelines = pipelines;
            return this;
        }

        /**
         * @param pipelines One or more `pipeline` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder pipelines(List<TriggerCustomEventPipelineArgs> pipelines) {
            return pipelines(Output.of(pipelines));
        }

        /**
         * @param pipelines One or more `pipeline` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder pipelines(TriggerCustomEventPipelineArgs... pipelines) {
            return pipelines(List.of(pipelines));
        }

        /**
         * @param subjectBeginsWith The pattern that event subject starts with for trigger to fire.
         * 
         * @return builder
         * 
         */
        public Builder subjectBeginsWith(@Nullable Output<String> subjectBeginsWith) {
            $.subjectBeginsWith = subjectBeginsWith;
            return this;
        }

        /**
         * @param subjectBeginsWith The pattern that event subject starts with for trigger to fire.
         * 
         * @return builder
         * 
         */
        public Builder subjectBeginsWith(String subjectBeginsWith) {
            return subjectBeginsWith(Output.of(subjectBeginsWith));
        }

        /**
         * @param subjectEndsWith The pattern that event subject ends with for trigger to fire.
         * 
         * @return builder
         * 
         */
        public Builder subjectEndsWith(@Nullable Output<String> subjectEndsWith) {
            $.subjectEndsWith = subjectEndsWith;
            return this;
        }

        /**
         * @param subjectEndsWith The pattern that event subject ends with for trigger to fire.
         * 
         * @return builder
         * 
         */
        public Builder subjectEndsWith(String subjectEndsWith) {
            return subjectEndsWith(Output.of(subjectEndsWith));
        }

        public TriggerCustomEventState build() {
            return $;
        }
    }

}