// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class VirtualMachineAdditionalCapabilities {
    /**
     * @return Should Ultra SSD disk be enabled for this Virtual Machine?
     * 
     */
    private final Boolean ultraSsdEnabled;

    @CustomType.Constructor
    private VirtualMachineAdditionalCapabilities(@CustomType.Parameter("ultraSsdEnabled") Boolean ultraSsdEnabled) {
        this.ultraSsdEnabled = ultraSsdEnabled;
    }

    /**
     * @return Should Ultra SSD disk be enabled for this Virtual Machine?
     * 
     */
    public Boolean ultraSsdEnabled() {
        return this.ultraSsdEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineAdditionalCapabilities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean ultraSsdEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineAdditionalCapabilities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ultraSsdEnabled = defaults.ultraSsdEnabled;
        }

        public Builder ultraSsdEnabled(Boolean ultraSsdEnabled) {
            this.ultraSsdEnabled = Objects.requireNonNull(ultraSsdEnabled);
            return this;
        }        public VirtualMachineAdditionalCapabilities build() {
            return new VirtualMachineAdditionalCapabilities(ultraSsdEnabled);
        }
    }
}