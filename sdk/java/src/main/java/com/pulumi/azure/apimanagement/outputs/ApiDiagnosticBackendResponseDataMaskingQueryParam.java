// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApiDiagnosticBackendResponseDataMaskingQueryParam {
    /**
     * @return The data masking mode. Possible values are `Mask` and `Hide` for `query_params`. The only possible value is `Mask` for `headers`.
     * 
     */
    private final String mode;
    /**
     * @return The name of the header or the query parameter to mask.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ApiDiagnosticBackendResponseDataMaskingQueryParam(
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("value") String value) {
        this.mode = mode;
        this.value = value;
    }

    /**
     * @return The data masking mode. Possible values are `Mask` and `Hide` for `query_params`. The only possible value is `Mask` for `headers`.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return The name of the header or the query parameter to mask.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDiagnosticBackendResponseDataMaskingQueryParam defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDiagnosticBackendResponseDataMaskingQueryParam defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.value = defaults.value;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ApiDiagnosticBackendResponseDataMaskingQueryParam build() {
            return new ApiDiagnosticBackendResponseDataMaskingQueryParam(mode, value);
        }
    }
}