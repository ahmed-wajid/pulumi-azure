// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.signalr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceUpstreamEndpoint {
    /**
     * @return The categories to match on, or `*` for all.
     * 
     */
    private final List<String> categoryPatterns;
    /**
     * @return The events to match on, or `*` for all.
     * 
     */
    private final List<String> eventPatterns;
    /**
     * @return The hubs to match on, or `*` for all.
     * 
     */
    private final List<String> hubPatterns;
    /**
     * @return The upstream URL Template. This can be a url or a template such as `http://host.com/{hub}/api/{category}/{event}`.
     * 
     */
    private final String urlTemplate;

    @CustomType.Constructor
    private ServiceUpstreamEndpoint(
        @CustomType.Parameter("categoryPatterns") List<String> categoryPatterns,
        @CustomType.Parameter("eventPatterns") List<String> eventPatterns,
        @CustomType.Parameter("hubPatterns") List<String> hubPatterns,
        @CustomType.Parameter("urlTemplate") String urlTemplate) {
        this.categoryPatterns = categoryPatterns;
        this.eventPatterns = eventPatterns;
        this.hubPatterns = hubPatterns;
        this.urlTemplate = urlTemplate;
    }

    /**
     * @return The categories to match on, or `*` for all.
     * 
     */
    public List<String> categoryPatterns() {
        return this.categoryPatterns;
    }
    /**
     * @return The events to match on, or `*` for all.
     * 
     */
    public List<String> eventPatterns() {
        return this.eventPatterns;
    }
    /**
     * @return The hubs to match on, or `*` for all.
     * 
     */
    public List<String> hubPatterns() {
        return this.hubPatterns;
    }
    /**
     * @return The upstream URL Template. This can be a url or a template such as `http://host.com/{hub}/api/{category}/{event}`.
     * 
     */
    public String urlTemplate() {
        return this.urlTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceUpstreamEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> categoryPatterns;
        private List<String> eventPatterns;
        private List<String> hubPatterns;
        private String urlTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceUpstreamEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoryPatterns = defaults.categoryPatterns;
    	      this.eventPatterns = defaults.eventPatterns;
    	      this.hubPatterns = defaults.hubPatterns;
    	      this.urlTemplate = defaults.urlTemplate;
        }

        public Builder categoryPatterns(List<String> categoryPatterns) {
            this.categoryPatterns = Objects.requireNonNull(categoryPatterns);
            return this;
        }
        public Builder categoryPatterns(String... categoryPatterns) {
            return categoryPatterns(List.of(categoryPatterns));
        }
        public Builder eventPatterns(List<String> eventPatterns) {
            this.eventPatterns = Objects.requireNonNull(eventPatterns);
            return this;
        }
        public Builder eventPatterns(String... eventPatterns) {
            return eventPatterns(List.of(eventPatterns));
        }
        public Builder hubPatterns(List<String> hubPatterns) {
            this.hubPatterns = Objects.requireNonNull(hubPatterns);
            return this;
        }
        public Builder hubPatterns(String... hubPatterns) {
            return hubPatterns(List.of(hubPatterns));
        }
        public Builder urlTemplate(String urlTemplate) {
            this.urlTemplate = Objects.requireNonNull(urlTemplate);
            return this;
        }        public ServiceUpstreamEndpoint build() {
            return new ServiceUpstreamEndpoint(categoryPatterns, eventPatterns, hubPatterns, urlTemplate);
        }
    }
}