// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseImport {
    /**
     * @return Specifies the name of the SQL administrator.
     * 
     */
    private final String administratorLogin;
    /**
     * @return Specifies the password of the SQL administrator.
     * 
     */
    private final String administratorLoginPassword;
    /**
     * @return Specifies the type of authentication used to access the server. Valid values are `SQL` or `ADPassword`.
     * 
     */
    private final String authenticationType;
    /**
     * @return Specifies the type of import operation being performed. The only allowable value is `Import`.
     * 
     */
    private final @Nullable String operationMode;
    /**
     * @return Specifies the access key for the storage account.
     * 
     */
    private final String storageKey;
    /**
     * @return Specifies the type of access key for the storage account. Valid values are `StorageAccessKey` or `SharedAccessKey`.
     * 
     */
    private final String storageKeyType;
    /**
     * @return Specifies the blob URI of the .bacpac file.
     * 
     */
    private final String storageUri;

    @CustomType.Constructor
    private DatabaseImport(
        @CustomType.Parameter("administratorLogin") String administratorLogin,
        @CustomType.Parameter("administratorLoginPassword") String administratorLoginPassword,
        @CustomType.Parameter("authenticationType") String authenticationType,
        @CustomType.Parameter("operationMode") @Nullable String operationMode,
        @CustomType.Parameter("storageKey") String storageKey,
        @CustomType.Parameter("storageKeyType") String storageKeyType,
        @CustomType.Parameter("storageUri") String storageUri) {
        this.administratorLogin = administratorLogin;
        this.administratorLoginPassword = administratorLoginPassword;
        this.authenticationType = authenticationType;
        this.operationMode = operationMode;
        this.storageKey = storageKey;
        this.storageKeyType = storageKeyType;
        this.storageUri = storageUri;
    }

    /**
     * @return Specifies the name of the SQL administrator.
     * 
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }
    /**
     * @return Specifies the password of the SQL administrator.
     * 
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }
    /**
     * @return Specifies the type of authentication used to access the server. Valid values are `SQL` or `ADPassword`.
     * 
     */
    public String authenticationType() {
        return this.authenticationType;
    }
    /**
     * @return Specifies the type of import operation being performed. The only allowable value is `Import`.
     * 
     */
    public Optional<String> operationMode() {
        return Optional.ofNullable(this.operationMode);
    }
    /**
     * @return Specifies the access key for the storage account.
     * 
     */
    public String storageKey() {
        return this.storageKey;
    }
    /**
     * @return Specifies the type of access key for the storage account. Valid values are `StorageAccessKey` or `SharedAccessKey`.
     * 
     */
    public String storageKeyType() {
        return this.storageKeyType;
    }
    /**
     * @return Specifies the blob URI of the .bacpac file.
     * 
     */
    public String storageUri() {
        return this.storageUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseImport defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String administratorLogin;
        private String administratorLoginPassword;
        private String authenticationType;
        private @Nullable String operationMode;
        private String storageKey;
        private String storageKeyType;
        private String storageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseImport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.administratorLoginPassword = defaults.administratorLoginPassword;
    	      this.authenticationType = defaults.authenticationType;
    	      this.operationMode = defaults.operationMode;
    	      this.storageKey = defaults.storageKey;
    	      this.storageKeyType = defaults.storageKeyType;
    	      this.storageUri = defaults.storageUri;
        }

        public Builder administratorLogin(String administratorLogin) {
            this.administratorLogin = Objects.requireNonNull(administratorLogin);
            return this;
        }
        public Builder administratorLoginPassword(String administratorLoginPassword) {
            this.administratorLoginPassword = Objects.requireNonNull(administratorLoginPassword);
            return this;
        }
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder operationMode(@Nullable String operationMode) {
            this.operationMode = operationMode;
            return this;
        }
        public Builder storageKey(String storageKey) {
            this.storageKey = Objects.requireNonNull(storageKey);
            return this;
        }
        public Builder storageKeyType(String storageKeyType) {
            this.storageKeyType = Objects.requireNonNull(storageKeyType);
            return this;
        }
        public Builder storageUri(String storageUri) {
            this.storageUri = Objects.requireNonNull(storageUri);
            return this;
        }        public DatabaseImport build() {
            return new DatabaseImport(administratorLogin, administratorLoginPassword, authenticationType, operationMode, storageKey, storageKeyType, storageUri);
        }
    }
}