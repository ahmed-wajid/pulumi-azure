// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class FrontdoorRouteDisableLinkToDefaultDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorRouteDisableLinkToDefaultDomainArgs Empty = new FrontdoorRouteDisableLinkToDefaultDomainArgs();

    /**
     * The resource IDs of the Front Door Custom Domains which are associated with this Front Door Route.
     * 
     * @deprecated
     * the &#39;cdn_frontdoor_route_disable_link_to_default_domain&#39; resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the &#39;link_to_default_domain&#39; field in the &#39;cdn_frontdoor_route&#39; resource to control this value
     * 
     */
    @Deprecated /* the 'cdn_frontdoor_route_disable_link_to_default_domain' resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the 'link_to_default_domain' field in the 'cdn_frontdoor_route' resource to control this value */
    @Import(name="cdnFrontdoorCustomDomainIds", required=true)
    private Output<List<String>> cdnFrontdoorCustomDomainIds;

    /**
     * @return The resource IDs of the Front Door Custom Domains which are associated with this Front Door Route.
     * 
     * @deprecated
     * the &#39;cdn_frontdoor_route_disable_link_to_default_domain&#39; resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the &#39;link_to_default_domain&#39; field in the &#39;cdn_frontdoor_route&#39; resource to control this value
     * 
     */
    @Deprecated /* the 'cdn_frontdoor_route_disable_link_to_default_domain' resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the 'link_to_default_domain' field in the 'cdn_frontdoor_route' resource to control this value */
    public Output<List<String>> cdnFrontdoorCustomDomainIds() {
        return this.cdnFrontdoorCustomDomainIds;
    }

    /**
     * The resource ID of the Front Door Route where the Link To Default Domain property should be `disabled`. Changing this forces a new Front Door Route Disable Link To Default Domain to be created.
     * 
     * @deprecated
     * the &#39;cdn_frontdoor_route_disable_link_to_default_domain&#39; resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the &#39;link_to_default_domain&#39; field in the &#39;cdn_frontdoor_route&#39; resource to control this value
     * 
     */
    @Deprecated /* the 'cdn_frontdoor_route_disable_link_to_default_domain' resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the 'link_to_default_domain' field in the 'cdn_frontdoor_route' resource to control this value */
    @Import(name="cdnFrontdoorRouteId", required=true)
    private Output<String> cdnFrontdoorRouteId;

    /**
     * @return The resource ID of the Front Door Route where the Link To Default Domain property should be `disabled`. Changing this forces a new Front Door Route Disable Link To Default Domain to be created.
     * 
     * @deprecated
     * the &#39;cdn_frontdoor_route_disable_link_to_default_domain&#39; resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the &#39;link_to_default_domain&#39; field in the &#39;cdn_frontdoor_route&#39; resource to control this value
     * 
     */
    @Deprecated /* the 'cdn_frontdoor_route_disable_link_to_default_domain' resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the 'link_to_default_domain' field in the 'cdn_frontdoor_route' resource to control this value */
    public Output<String> cdnFrontdoorRouteId() {
        return this.cdnFrontdoorRouteId;
    }

    private FrontdoorRouteDisableLinkToDefaultDomainArgs() {}

    private FrontdoorRouteDisableLinkToDefaultDomainArgs(FrontdoorRouteDisableLinkToDefaultDomainArgs $) {
        this.cdnFrontdoorCustomDomainIds = $.cdnFrontdoorCustomDomainIds;
        this.cdnFrontdoorRouteId = $.cdnFrontdoorRouteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorRouteDisableLinkToDefaultDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorRouteDisableLinkToDefaultDomainArgs $;

        public Builder() {
            $ = new FrontdoorRouteDisableLinkToDefaultDomainArgs();
        }

        public Builder(FrontdoorRouteDisableLinkToDefaultDomainArgs defaults) {
            $ = new FrontdoorRouteDisableLinkToDefaultDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cdnFrontdoorCustomDomainIds The resource IDs of the Front Door Custom Domains which are associated with this Front Door Route.
         * 
         * @return builder
         * 
         * @deprecated
         * the &#39;cdn_frontdoor_route_disable_link_to_default_domain&#39; resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the &#39;link_to_default_domain&#39; field in the &#39;cdn_frontdoor_route&#39; resource to control this value
         * 
         */
        @Deprecated /* the 'cdn_frontdoor_route_disable_link_to_default_domain' resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the 'link_to_default_domain' field in the 'cdn_frontdoor_route' resource to control this value */
        public Builder cdnFrontdoorCustomDomainIds(Output<List<String>> cdnFrontdoorCustomDomainIds) {
            $.cdnFrontdoorCustomDomainIds = cdnFrontdoorCustomDomainIds;
            return this;
        }

        /**
         * @param cdnFrontdoorCustomDomainIds The resource IDs of the Front Door Custom Domains which are associated with this Front Door Route.
         * 
         * @return builder
         * 
         * @deprecated
         * the &#39;cdn_frontdoor_route_disable_link_to_default_domain&#39; resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the &#39;link_to_default_domain&#39; field in the &#39;cdn_frontdoor_route&#39; resource to control this value
         * 
         */
        @Deprecated /* the 'cdn_frontdoor_route_disable_link_to_default_domain' resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the 'link_to_default_domain' field in the 'cdn_frontdoor_route' resource to control this value */
        public Builder cdnFrontdoorCustomDomainIds(List<String> cdnFrontdoorCustomDomainIds) {
            return cdnFrontdoorCustomDomainIds(Output.of(cdnFrontdoorCustomDomainIds));
        }

        /**
         * @param cdnFrontdoorCustomDomainIds The resource IDs of the Front Door Custom Domains which are associated with this Front Door Route.
         * 
         * @return builder
         * 
         * @deprecated
         * the &#39;cdn_frontdoor_route_disable_link_to_default_domain&#39; resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the &#39;link_to_default_domain&#39; field in the &#39;cdn_frontdoor_route&#39; resource to control this value
         * 
         */
        @Deprecated /* the 'cdn_frontdoor_route_disable_link_to_default_domain' resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the 'link_to_default_domain' field in the 'cdn_frontdoor_route' resource to control this value */
        public Builder cdnFrontdoorCustomDomainIds(String... cdnFrontdoorCustomDomainIds) {
            return cdnFrontdoorCustomDomainIds(List.of(cdnFrontdoorCustomDomainIds));
        }

        /**
         * @param cdnFrontdoorRouteId The resource ID of the Front Door Route where the Link To Default Domain property should be `disabled`. Changing this forces a new Front Door Route Disable Link To Default Domain to be created.
         * 
         * @return builder
         * 
         * @deprecated
         * the &#39;cdn_frontdoor_route_disable_link_to_default_domain&#39; resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the &#39;link_to_default_domain&#39; field in the &#39;cdn_frontdoor_route&#39; resource to control this value
         * 
         */
        @Deprecated /* the 'cdn_frontdoor_route_disable_link_to_default_domain' resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the 'link_to_default_domain' field in the 'cdn_frontdoor_route' resource to control this value */
        public Builder cdnFrontdoorRouteId(Output<String> cdnFrontdoorRouteId) {
            $.cdnFrontdoorRouteId = cdnFrontdoorRouteId;
            return this;
        }

        /**
         * @param cdnFrontdoorRouteId The resource ID of the Front Door Route where the Link To Default Domain property should be `disabled`. Changing this forces a new Front Door Route Disable Link To Default Domain to be created.
         * 
         * @return builder
         * 
         * @deprecated
         * the &#39;cdn_frontdoor_route_disable_link_to_default_domain&#39; resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the &#39;link_to_default_domain&#39; field in the &#39;cdn_frontdoor_route&#39; resource to control this value
         * 
         */
        @Deprecated /* the 'cdn_frontdoor_route_disable_link_to_default_domain' resource has been deprecated and will be removed from the 4.0 AzureRM provider. Please use the 'link_to_default_domain' field in the 'cdn_frontdoor_route' resource to control this value */
        public Builder cdnFrontdoorRouteId(String cdnFrontdoorRouteId) {
            return cdnFrontdoorRouteId(Output.of(cdnFrontdoorRouteId));
        }

        public FrontdoorRouteDisableLinkToDefaultDomainArgs build() {
            if ($.cdnFrontdoorCustomDomainIds == null) {
                throw new MissingRequiredPropertyException("FrontdoorRouteDisableLinkToDefaultDomainArgs", "cdnFrontdoorCustomDomainIds");
            }
            if ($.cdnFrontdoorRouteId == null) {
                throw new MissingRequiredPropertyException("FrontdoorRouteDisableLinkToDefaultDomainArgs", "cdnFrontdoorRouteId");
            }
            return $;
        }
    }

}
