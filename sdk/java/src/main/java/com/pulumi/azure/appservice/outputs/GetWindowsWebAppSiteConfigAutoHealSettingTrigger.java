// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigAutoHealSettingTriggerRequest;
import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest;
import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigAutoHealSettingTriggerStatusCode;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppSiteConfigAutoHealSettingTrigger {
    /**
     * @return The amount of Private Memory used.
     * 
     */
    private final Integer privateMemoryKb;
    /**
     * @return A `requests` block as defined above.
     * 
     */
    private final List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerRequest> requests;
    /**
     * @return A `slow_request` block as defined above.
     * 
     */
    private final List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest> slowRequests;
    /**
     * @return A `status_code` block as defined above.
     * 
     */
    private final List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerStatusCode> statusCodes;

    @CustomType.Constructor
    private GetWindowsWebAppSiteConfigAutoHealSettingTrigger(
        @CustomType.Parameter("privateMemoryKb") Integer privateMemoryKb,
        @CustomType.Parameter("requests") List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerRequest> requests,
        @CustomType.Parameter("slowRequests") List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest> slowRequests,
        @CustomType.Parameter("statusCodes") List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerStatusCode> statusCodes) {
        this.privateMemoryKb = privateMemoryKb;
        this.requests = requests;
        this.slowRequests = slowRequests;
        this.statusCodes = statusCodes;
    }

    /**
     * @return The amount of Private Memory used.
     * 
     */
    public Integer privateMemoryKb() {
        return this.privateMemoryKb;
    }
    /**
     * @return A `requests` block as defined above.
     * 
     */
    public List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerRequest> requests() {
        return this.requests;
    }
    /**
     * @return A `slow_request` block as defined above.
     * 
     */
    public List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest> slowRequests() {
        return this.slowRequests;
    }
    /**
     * @return A `status_code` block as defined above.
     * 
     */
    public List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerStatusCode> statusCodes() {
        return this.statusCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppSiteConfigAutoHealSettingTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer privateMemoryKb;
        private List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerRequest> requests;
        private List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest> slowRequests;
        private List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerStatusCode> statusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWindowsWebAppSiteConfigAutoHealSettingTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateMemoryKb = defaults.privateMemoryKb;
    	      this.requests = defaults.requests;
    	      this.slowRequests = defaults.slowRequests;
    	      this.statusCodes = defaults.statusCodes;
        }

        public Builder privateMemoryKb(Integer privateMemoryKb) {
            this.privateMemoryKb = Objects.requireNonNull(privateMemoryKb);
            return this;
        }
        public Builder requests(List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerRequest> requests) {
            this.requests = Objects.requireNonNull(requests);
            return this;
        }
        public Builder requests(GetWindowsWebAppSiteConfigAutoHealSettingTriggerRequest... requests) {
            return requests(List.of(requests));
        }
        public Builder slowRequests(List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest> slowRequests) {
            this.slowRequests = Objects.requireNonNull(slowRequests);
            return this;
        }
        public Builder slowRequests(GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest... slowRequests) {
            return slowRequests(List.of(slowRequests));
        }
        public Builder statusCodes(List<GetWindowsWebAppSiteConfigAutoHealSettingTriggerStatusCode> statusCodes) {
            this.statusCodes = Objects.requireNonNull(statusCodes);
            return this;
        }
        public Builder statusCodes(GetWindowsWebAppSiteConfigAutoHealSettingTriggerStatusCode... statusCodes) {
            return statusCodes(List.of(statusCodes));
        }        public GetWindowsWebAppSiteConfigAutoHealSettingTrigger build() {
            return new GetWindowsWebAppSiteConfigAutoHealSettingTrigger(privateMemoryKb, requests, slowRequests, statusCodes);
        }
    }
}