// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.nginx.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentFrontendPublic {
    /**
     * @return List of public IPs of the Ngix Deployment.
     * 
     */
    private List<String> ipAddresses;

    private GetDeploymentFrontendPublic() {}
    /**
     * @return List of public IPs of the Ngix Deployment.
     * 
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentFrontendPublic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> ipAddresses;
        public Builder() {}
        public Builder(GetDeploymentFrontendPublic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddresses = defaults.ipAddresses;
        }

        @CustomType.Setter
        public Builder ipAddresses(List<String> ipAddresses) {
            if (ipAddresses == null) {
              throw new MissingRequiredPropertyException("GetDeploymentFrontendPublic", "ipAddresses");
            }
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public GetDeploymentFrontendPublic build() {
            final var _resultValue = new GetDeploymentFrontendPublic();
            _resultValue.ipAddresses = ipAddresses;
            return _resultValue;
        }
    }
}