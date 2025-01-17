// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.netapp.AccountArgs;
import com.pulumi.azure.netapp.inputs.AccountState;
import com.pulumi.azure.netapp.outputs.AccountActiveDirectory;
import com.pulumi.azure.netapp.outputs.AccountIdentity;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a NetApp Account.
 * 
 * &gt; **NOTE:** Azure allows only one active directory can be joined to a single subscription at a time for NetApp Account.
 * 
 * ## NetApp Account Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.authorization.UserAssignedIdentity;
 * import com.pulumi.azure.authorization.UserAssignedIdentityArgs;
 * import com.pulumi.azure.netapp.Account;
 * import com.pulumi.azure.netapp.AccountArgs;
 * import com.pulumi.azure.netapp.inputs.AccountActiveDirectoryArgs;
 * import com.pulumi.azure.netapp.inputs.AccountIdentityArgs;
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
 *         final var current = CoreFunctions.getClientConfig();
 * 
 *         var exampleUserAssignedIdentity = new UserAssignedIdentity(&#34;exampleUserAssignedIdentity&#34;, UserAssignedIdentityArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .activeDirectory(AccountActiveDirectoryArgs.builder()
 *                 .username(&#34;aduser&#34;)
 *                 .password(&#34;aduserpwd&#34;)
 *                 .smbServerName(&#34;SMBSERVER&#34;)
 *                 .dnsServers(&#34;1.2.3.4&#34;)
 *                 .domain(&#34;westcentralus.com&#34;)
 *                 .organizationalUnit(&#34;OU=FirstLevel&#34;)
 *                 .build())
 *             .identity(AccountIdentityArgs.builder()
 *                 .type(&#34;UserAssigned&#34;)
 *                 .identityIds(exampleUserAssignedIdentity.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * NetApp Accounts can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:netapp/account:Account example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1
 * ```
 * 
 */
@ResourceType(type="azure:netapp/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * A `active_directory` block as defined below.
     * 
     */
    @Export(name="activeDirectory", refs={AccountActiveDirectory.class}, tree="[0]")
    private Output</* @Nullable */ AccountActiveDirectory> activeDirectory;

    /**
     * @return A `active_directory` block as defined below.
     * 
     */
    public Output<Optional<AccountActiveDirectory>> activeDirectory() {
        return Codegen.optional(this.activeDirectory);
    }
    /**
     * The identity block where it is used when customer managed keys based encryption will be enabled.
     * 
     */
    @Export(name="identity", refs={AccountIdentity.class}, tree="[0]")
    private Output</* @Nullable */ AccountIdentity> identity;

    /**
     * @return The identity block where it is used when customer managed keys based encryption will be enabled.
     * 
     */
    public Output<Optional<AccountIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the NetApp Account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the NetApp Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group where the NetApp Account should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the NetApp Account should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(String name, AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:netapp/account:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:netapp/account:Account", name, state, makeResourceOptions(options, id));
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
    public static Account get(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, state, options);
    }
}
