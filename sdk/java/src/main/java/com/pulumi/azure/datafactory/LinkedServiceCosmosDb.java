// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.LinkedServiceCosmosDbArgs;
import com.pulumi.azure.datafactory.inputs.LinkedServiceCosmosDbState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Linked Service (connection) between a CosmosDB and Azure Data Factory using SQL API.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         final var exampleAccount = Output.of(CosmosdbFunctions.getAccount(GetAccountArgs.builder()
 *             .name(&#34;tfex-cosmosdb-account&#34;)
 *             .resourceGroupName(&#34;tfex-cosmosdb-account-rg&#34;)
 *             .build()));
 * 
 *         var exampleFactory = new Factory(&#34;exampleFactory&#34;, FactoryArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleLinkedServiceCosmosDb = new LinkedServiceCosmosDb(&#34;exampleLinkedServiceCosmosDb&#34;, LinkedServiceCosmosDbArgs.builder()        
 *             .dataFactoryId(exampleFactory.id())
 *             .accountEndpoint(exampleAccount.apply(getAccountResult -&gt; getAccountResult.endpoint()))
 *             .accountKey(exampleAccount.apply(getAccountResult -&gt; getAccountResult.primaryKey()))
 *             .database(&#34;foo&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Factory Linked Service&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datafactory/linkedServiceCosmosDb:LinkedServiceCosmosDb example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/linkedServiceCosmosDb:LinkedServiceCosmosDb")
public class LinkedServiceCosmosDb extends com.pulumi.resources.CustomResource {
    /**
     * The endpoint of the Azure CosmosDB account. Required if `connection_string` is unspecified.
     * 
     */
    @Export(name="accountEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountEndpoint;

    /**
     * @return The endpoint of the Azure CosmosDB account. Required if `connection_string` is unspecified.
     * 
     */
    public Output<Optional<String>> accountEndpoint() {
        return Codegen.optional(this.accountEndpoint);
    }
    /**
     * The account key of the Azure Cosmos DB account. Required if `connection_string` is unspecified.
     * 
     */
    @Export(name="accountKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountKey;

    /**
     * @return The account key of the Azure Cosmos DB account. Required if `connection_string` is unspecified.
     * 
     */
    public Output<Optional<String>> accountKey() {
        return Codegen.optional(this.accountKey);
    }
    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="additionalProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<Map<String,String>>> additionalProperties() {
        return Codegen.optional(this.additionalProperties);
    }
    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The connection string. Required if `account_endpoint`, `account_key`, and `database` are unspecified.
     * 
     */
    @Export(name="connectionString", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionString;

    /**
     * @return The connection string. Required if `account_endpoint`, `account_key`, and `database` are unspecified.
     * 
     */
    public Output<Optional<String>> connectionString() {
        return Codegen.optional(this.connectionString);
    }
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", type=String.class, parameters={})
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The name of the database. Required if `connection_string` is unspecified.
     * 
     */
    @Export(name="database", type=String.class, parameters={})
    private Output</* @Nullable */ String> database;

    /**
     * @return The name of the database. Required if `connection_string` is unspecified.
     * 
     */
    public Output<Optional<String>> database() {
        return Codegen.optional(this.database);
    }
    /**
     * The description for the Data Factory Linked Service.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Linked Service.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="integrationRuntimeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<String>> integrationRuntimeName() {
        return Codegen.optional(this.integrationRuntimeName);
    }
    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedServiceCosmosDb(String name) {
        this(name, LinkedServiceCosmosDbArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedServiceCosmosDb(String name, LinkedServiceCosmosDbArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedServiceCosmosDb(String name, LinkedServiceCosmosDbArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceCosmosDb:LinkedServiceCosmosDb", name, args == null ? LinkedServiceCosmosDbArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkedServiceCosmosDb(String name, Output<String> id, @Nullable LinkedServiceCosmosDbState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceCosmosDb:LinkedServiceCosmosDb", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LinkedServiceCosmosDb get(String name, Output<String> id, @Nullable LinkedServiceCosmosDbState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkedServiceCosmosDb(name, id, state, options);
    }
}