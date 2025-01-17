// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionAppHostKeysResult {
    /**
     * @return Function App resource&#39;s Blobs Extension system key.
     * 
     */
    private String blobsExtensionKey;
    /**
     * @return Function App resource&#39;s default function key.
     * 
     */
    private String defaultFunctionKey;
    /**
     * @return Function App resource&#39;s Durable Task Extension system key.
     * 
     */
    private String durabletaskExtensionKey;
    /**
     * @return Function App resource&#39;s Event Grid Extension Config system key.
     * 
     */
    private String eventGridExtensionConfigKey;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    /**
     * @return Function App resource&#39;s secret key
     * 
     */
    private String primaryKey;
    private String resourceGroupName;
    /**
     * @return Function App resource&#39;s SignalR Extension system key.
     * 
     */
    private String signalrExtensionKey;
    /**
     * @return Function App resource&#39;s Web PubSub Extension system key.
     * 
     */
    private String webpubsubExtensionKey;

    private GetFunctionAppHostKeysResult() {}
    /**
     * @return Function App resource&#39;s Blobs Extension system key.
     * 
     */
    public String blobsExtensionKey() {
        return this.blobsExtensionKey;
    }
    /**
     * @return Function App resource&#39;s default function key.
     * 
     */
    public String defaultFunctionKey() {
        return this.defaultFunctionKey;
    }
    /**
     * @return Function App resource&#39;s Durable Task Extension system key.
     * 
     */
    public String durabletaskExtensionKey() {
        return this.durabletaskExtensionKey;
    }
    /**
     * @return Function App resource&#39;s Event Grid Extension Config system key.
     * 
     */
    public String eventGridExtensionConfigKey() {
        return this.eventGridExtensionConfigKey;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Function App resource&#39;s secret key
     * 
     */
    public String primaryKey() {
        return this.primaryKey;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return Function App resource&#39;s SignalR Extension system key.
     * 
     */
    public String signalrExtensionKey() {
        return this.signalrExtensionKey;
    }
    /**
     * @return Function App resource&#39;s Web PubSub Extension system key.
     * 
     */
    public String webpubsubExtensionKey() {
        return this.webpubsubExtensionKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionAppHostKeysResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String blobsExtensionKey;
        private String defaultFunctionKey;
        private String durabletaskExtensionKey;
        private String eventGridExtensionConfigKey;
        private String id;
        private String name;
        private String primaryKey;
        private String resourceGroupName;
        private String signalrExtensionKey;
        private String webpubsubExtensionKey;
        public Builder() {}
        public Builder(GetFunctionAppHostKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobsExtensionKey = defaults.blobsExtensionKey;
    	      this.defaultFunctionKey = defaults.defaultFunctionKey;
    	      this.durabletaskExtensionKey = defaults.durabletaskExtensionKey;
    	      this.eventGridExtensionConfigKey = defaults.eventGridExtensionConfigKey;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.primaryKey = defaults.primaryKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.signalrExtensionKey = defaults.signalrExtensionKey;
    	      this.webpubsubExtensionKey = defaults.webpubsubExtensionKey;
        }

        @CustomType.Setter
        public Builder blobsExtensionKey(String blobsExtensionKey) {
            if (blobsExtensionKey == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppHostKeysResult", "blobsExtensionKey");
            }
            this.blobsExtensionKey = blobsExtensionKey;
            return this;
        }
        @CustomType.Setter
        public Builder defaultFunctionKey(String defaultFunctionKey) {
            if (defaultFunctionKey == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppHostKeysResult", "defaultFunctionKey");
            }
            this.defaultFunctionKey = defaultFunctionKey;
            return this;
        }
        @CustomType.Setter
        public Builder durabletaskExtensionKey(String durabletaskExtensionKey) {
            if (durabletaskExtensionKey == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppHostKeysResult", "durabletaskExtensionKey");
            }
            this.durabletaskExtensionKey = durabletaskExtensionKey;
            return this;
        }
        @CustomType.Setter
        public Builder eventGridExtensionConfigKey(String eventGridExtensionConfigKey) {
            if (eventGridExtensionConfigKey == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppHostKeysResult", "eventGridExtensionConfigKey");
            }
            this.eventGridExtensionConfigKey = eventGridExtensionConfigKey;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppHostKeysResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppHostKeysResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder primaryKey(String primaryKey) {
            if (primaryKey == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppHostKeysResult", "primaryKey");
            }
            this.primaryKey = primaryKey;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppHostKeysResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder signalrExtensionKey(String signalrExtensionKey) {
            if (signalrExtensionKey == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppHostKeysResult", "signalrExtensionKey");
            }
            this.signalrExtensionKey = signalrExtensionKey;
            return this;
        }
        @CustomType.Setter
        public Builder webpubsubExtensionKey(String webpubsubExtensionKey) {
            if (webpubsubExtensionKey == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppHostKeysResult", "webpubsubExtensionKey");
            }
            this.webpubsubExtensionKey = webpubsubExtensionKey;
            return this;
        }
        public GetFunctionAppHostKeysResult build() {
            final var _resultValue = new GetFunctionAppHostKeysResult();
            _resultValue.blobsExtensionKey = blobsExtensionKey;
            _resultValue.defaultFunctionKey = defaultFunctionKey;
            _resultValue.durabletaskExtensionKey = durabletaskExtensionKey;
            _resultValue.eventGridExtensionConfigKey = eventGridExtensionConfigKey;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.primaryKey = primaryKey;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.signalrExtensionKey = signalrExtensionKey;
            _resultValue.webpubsubExtensionKey = webpubsubExtensionKey;
            return _resultValue;
        }
    }
}
