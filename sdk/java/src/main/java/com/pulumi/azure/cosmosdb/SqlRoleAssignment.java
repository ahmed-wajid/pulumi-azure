// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cosmosdb.SqlRoleAssignmentArgs;
import com.pulumi.azure.cosmosdb.inputs.SqlRoleAssignmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Cosmos DB SQL Role Assignment.
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
 *         final var current = Output.of(CoreFunctions.getClientConfig());
 * 
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
 *                 .consistencyLevel(&#34;Strong&#34;)
 *                 .build())
 *             .geoLocations(AccountGeoLocationArgs.builder()
 *                 .location(exampleResourceGroup.location())
 *                 .failoverPriority(0)
 *                 .build())
 *             .build());
 * 
 *         var exampleSqlRoleDefinition = new SqlRoleDefinition(&#34;exampleSqlRoleDefinition&#34;, SqlRoleDefinitionArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .accountName(exampleAccount.name())
 *             .type(&#34;CustomRole&#34;)
 *             .assignableScopes(Output.tuple(exampleResourceGroup.name(), exampleAccount.name()).apply(values -&gt; {
 *                 var exampleResourceGroupName = values.t1;
 *                 var exampleAccountName = values.t2;
 *                 return String.format(&#34;/subscriptions/%s/resourceGroups/%s/providers/Microsoft.DocumentDB/databaseAccounts/%s&#34;, current.apply(getClientConfigResult -&gt; getClientConfigResult.subscriptionId()),exampleResourceGroupName,exampleAccountName);
 *             }))
 *             .permissions(SqlRoleDefinitionPermissionArgs.builder()
 *                 .dataActions(&#34;Microsoft.DocumentDB/databaseAccounts/sqlDatabases/containers/items/read&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleSqlRoleAssignment = new SqlRoleAssignment(&#34;exampleSqlRoleAssignment&#34;, SqlRoleAssignmentArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .accountName(exampleAccount.name())
 *             .roleDefinitionId(exampleSqlRoleDefinition.id())
 *             .principalId(current.apply(getClientConfigResult -&gt; getClientConfigResult.objectId()))
 *             .scope(Output.tuple(exampleResourceGroup.name(), exampleAccount.name()).apply(values -&gt; {
 *                 var exampleResourceGroupName = values.t1;
 *                 var exampleAccountName = values.t2;
 *                 return String.format(&#34;/subscriptions/%s/resourceGroups/%s/providers/Microsoft.DocumentDB/databaseAccounts/%s&#34;, current.apply(getClientConfigResult -&gt; getClientConfigResult.subscriptionId()),exampleResourceGroupName,exampleAccountName);
 *             }))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cosmos DB SQL Role Assignments can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:cosmosdb/sqlRoleAssignment:SqlRoleAssignment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DocumentDB/databaseAccounts/account1/sqlRoleAssignments/9e007587-dbcd-4190-84cb-fcab5a09ca39
 * ```
 * 
 */
@ResourceType(type="azure:cosmosdb/sqlRoleAssignment:SqlRoleAssignment")
public class SqlRoleAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Cosmos DB Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="accountName", type=String.class, parameters={})
    private Output<String> accountName;

    /**
     * @return The name of the Cosmos DB Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * The GUID as the name of the Cosmos DB SQL Role Assignment - one will be generated if not specified. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The GUID as the name of the Cosmos DB SQL Role Assignment - one will be generated if not specified. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the Principal (Client) in Azure Active Directory. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="principalId", type=String.class, parameters={})
    private Output<String> principalId;

    /**
     * @return The ID of the Principal (Client) in Azure Active Directory. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }
    /**
     * The name of the Resource Group in which the Cosmos DB SQL Role Assignment is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Cosmos DB SQL Role Assignment is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The resource ID of the Cosmos DB SQL Role Definition.
     * 
     */
    @Export(name="roleDefinitionId", type=String.class, parameters={})
    private Output<String> roleDefinitionId;

    /**
     * @return The resource ID of the Cosmos DB SQL Role Definition.
     * 
     */
    public Output<String> roleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * The data plane resource path for which access is being granted through this Cosmos DB SQL Role Assignment. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return The data plane resource path for which access is being granted through this Cosmos DB SQL Role Assignment. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlRoleAssignment(String name) {
        this(name, SqlRoleAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlRoleAssignment(String name, SqlRoleAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlRoleAssignment(String name, SqlRoleAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/sqlRoleAssignment:SqlRoleAssignment", name, args == null ? SqlRoleAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlRoleAssignment(String name, Output<String> id, @Nullable SqlRoleAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/sqlRoleAssignment:SqlRoleAssignment", name, state, makeResourceOptions(options, id));
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
    public static SqlRoleAssignment get(String name, Output<String> id, @Nullable SqlRoleAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlRoleAssignment(name, id, state, options);
    }
}