// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cosmosdb.SqlDedicatedGatewayArgs;
import com.pulumi.azure.cosmosdb.inputs.SqlDedicatedGatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a SQL Dedicated Gateway within a Cosmos DB Account.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.cosmosdb.Account;
 * import com.pulumi.azure.cosmosdb.AccountArgs;
 * import com.pulumi.azure.cosmosdb.inputs.AccountConsistencyPolicyArgs;
 * import com.pulumi.azure.cosmosdb.inputs.AccountGeoLocationArgs;
 * import com.pulumi.azure.cosmosdb.SqlDedicatedGateway;
 * import com.pulumi.azure.cosmosdb.SqlDedicatedGatewayArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .offerType(&#34;Standard&#34;)
 *             .kind(&#34;GlobalDocumentDB&#34;)
 *             .consistencyPolicy(AccountConsistencyPolicyArgs.builder()
 *                 .consistencyLevel(&#34;BoundedStaleness&#34;)
 *                 .build())
 *             .geoLocations(AccountGeoLocationArgs.builder()
 *                 .location(exampleResourceGroup.location())
 *                 .failoverPriority(0)
 *                 .build())
 *             .build());
 * 
 *         var exampleSqlDedicatedGateway = new SqlDedicatedGateway(&#34;exampleSqlDedicatedGateway&#34;, SqlDedicatedGatewayArgs.builder()        
 *             .cosmosdbAccountId(exampleAccount.id())
 *             .instanceCount(1)
 *             .instanceSize(&#34;Cosmos.D4s&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * CosmosDB SQL Dedicated Gateways can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:cosmosdb/sqlDedicatedGateway:SqlDedicatedGateway example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.DocumentDB/databaseAccounts/account1/services/SqlDedicatedGateway
 * ```
 * 
 */
@ResourceType(type="azure:cosmosdb/sqlDedicatedGateway:SqlDedicatedGateway")
public class SqlDedicatedGateway extends com.pulumi.resources.CustomResource {
    /**
     * The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="cosmosdbAccountId", type=String.class, parameters={})
    private Output<String> cosmosdbAccountId;

    /**
     * @return The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> cosmosdbAccountId() {
        return this.cosmosdbAccountId;
    }
    /**
     * The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
     * 
     */
    @Export(name="instanceCount", type=Integer.class, parameters={})
    private Output<Integer> instanceCount;

    /**
     * @return The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
     * 
     */
    public Output<Integer> instanceCount() {
        return this.instanceCount;
    }
    /**
     * The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="instanceSize", type=String.class, parameters={})
    private Output<String> instanceSize;

    /**
     * @return The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> instanceSize() {
        return this.instanceSize;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlDedicatedGateway(String name) {
        this(name, SqlDedicatedGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlDedicatedGateway(String name, SqlDedicatedGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlDedicatedGateway(String name, SqlDedicatedGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/sqlDedicatedGateway:SqlDedicatedGateway", name, args == null ? SqlDedicatedGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlDedicatedGateway(String name, Output<String> id, @Nullable SqlDedicatedGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/sqlDedicatedGateway:SqlDedicatedGateway", name, state, makeResourceOptions(options, id));
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
    public static SqlDedicatedGateway get(String name, Output<String> id, @Nullable SqlDedicatedGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlDedicatedGateway(name, id, state, options);
    }
}