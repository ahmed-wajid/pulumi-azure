// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IntegrationRuntimeManagedCustomSetupScript {
    /**
     * @return The blob endpoint for the container which contains a custom setup script that will be run on every node on startup. See [https://docs.microsoft.com/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup](https://docs.microsoft.com/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup) for more information.
     * 
     */
    private final String blobContainerUri;
    /**
     * @return A container SAS token that gives access to the files. See [https://docs.microsoft.com/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup](https://docs.microsoft.com/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup) for more information.
     * 
     */
    private final String sasToken;

    @CustomType.Constructor
    private IntegrationRuntimeManagedCustomSetupScript(
        @CustomType.Parameter("blobContainerUri") String blobContainerUri,
        @CustomType.Parameter("sasToken") String sasToken) {
        this.blobContainerUri = blobContainerUri;
        this.sasToken = sasToken;
    }

    /**
     * @return The blob endpoint for the container which contains a custom setup script that will be run on every node on startup. See [https://docs.microsoft.com/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup](https://docs.microsoft.com/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup) for more information.
     * 
     */
    public String blobContainerUri() {
        return this.blobContainerUri;
    }
    /**
     * @return A container SAS token that gives access to the files. See [https://docs.microsoft.com/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup](https://docs.microsoft.com/azure/data-factory/how-to-configure-azure-ssis-ir-custom-setup) for more information.
     * 
     */
    public String sasToken() {
        return this.sasToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeManagedCustomSetupScript defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blobContainerUri;
        private String sasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeManagedCustomSetupScript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobContainerUri = defaults.blobContainerUri;
    	      this.sasToken = defaults.sasToken;
        }

        public Builder blobContainerUri(String blobContainerUri) {
            this.blobContainerUri = Objects.requireNonNull(blobContainerUri);
            return this;
        }
        public Builder sasToken(String sasToken) {
            this.sasToken = Objects.requireNonNull(sasToken);
            return this;
        }        public IntegrationRuntimeManagedCustomSetupScript build() {
            return new IntegrationRuntimeManagedCustomSetupScript(blobContainerUri, sasToken);
        }
    }
}