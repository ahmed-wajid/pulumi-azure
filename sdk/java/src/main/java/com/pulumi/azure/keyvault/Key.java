// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.keyvault.KeyArgs;
import com.pulumi.azure.keyvault.inputs.KeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Key Vault Key.
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
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .tenantId(current.apply(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *             .skuName(&#34;premium&#34;)
 *             .softDeleteRetentionDays(7)
 *             .accessPolicies(KeyVaultAccessPolicyArgs.builder()
 *                 .tenantId(current.apply(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *                 .objectId(current.apply(getClientConfigResult -&gt; getClientConfigResult.objectId()))
 *                 .keyPermissions(                
 *                     &#34;create&#34;,
 *                     &#34;get&#34;,
 *                     &#34;purge&#34;,
 *                     &#34;recover&#34;)
 *                 .secretPermissions(&#34;set&#34;)
 *                 .build())
 *             .build());
 * 
 *         var generated = new Key(&#34;generated&#34;, KeyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.id())
 *             .keyType(&#34;RSA&#34;)
 *             .keySize(2048)
 *             .keyOpts(            
 *                 &#34;decrypt&#34;,
 *                 &#34;encrypt&#34;,
 *                 &#34;sign&#34;,
 *                 &#34;unwrapKey&#34;,
 *                 &#34;verify&#34;,
 *                 &#34;wrapKey&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Key Vault Key which is Enabled can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:keyvault/key:Key example &#34;https://example-keyvault.vault.azure.net/keys/example/fdf067c93bbb4b22bff4d8b7a9a56217&#34;
 * ```
 * 
 */
@ResourceType(type="azure:keyvault/key:Key")
public class Key extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the curve to use when creating an `EC` key. Possible values are `P-256`, `P-256K`, `P-384`, and `P-521`. This field will be required in a future release if `key_type` is `EC` or `EC-HSM`. The API will default to `P-256` if nothing is specified. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="curve", type=String.class, parameters={})
    private Output<String> curve;

    /**
     * @return Specifies the curve to use when creating an `EC` key. Possible values are `P-256`, `P-256K`, `P-384`, and `P-521`. This field will be required in a future release if `key_type` is `EC` or `EC-HSM`. The API will default to `P-256` if nothing is specified. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> curve() {
        return this.curve;
    }
    /**
     * The RSA public exponent of this Key Vault Key.
     * 
     */
    @Export(name="e", type=String.class, parameters={})
    private Output<String> e;

    /**
     * @return The RSA public exponent of this Key Vault Key.
     * 
     */
    public Output<String> e() {
        return this.e;
    }
    /**
     * Expiration UTC datetime (Y-m-d&#39;T&#39;H:M:S&#39;Z&#39;).
     * 
     */
    @Export(name="expirationDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> expirationDate;

    /**
     * @return Expiration UTC datetime (Y-m-d&#39;T&#39;H:M:S&#39;Z&#39;).
     * 
     */
    public Output<Optional<String>> expirationDate() {
        return Codegen.optional(this.expirationDate);
    }
    /**
     * A list of JSON web key operations. Possible values include: `decrypt`, `encrypt`, `sign`, `unwrapKey`, `verify` and `wrapKey`. Please note these values are case sensitive.
     * 
     */
    @Export(name="keyOpts", type=List.class, parameters={String.class})
    private Output<List<String>> keyOpts;

    /**
     * @return A list of JSON web key operations. Possible values include: `decrypt`, `encrypt`, `sign`, `unwrapKey`, `verify` and `wrapKey`. Please note these values are case sensitive.
     * 
     */
    public Output<List<String>> keyOpts() {
        return this.keyOpts;
    }
    /**
     * Specifies the Size of the RSA key to create in bytes. For example, 1024 or 2048. *Note*: This field is required if `key_type` is `RSA` or `RSA-HSM`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="keySize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> keySize;

    /**
     * @return Specifies the Size of the RSA key to create in bytes. For example, 1024 or 2048. *Note*: This field is required if `key_type` is `RSA` or `RSA-HSM`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> keySize() {
        return Codegen.optional(this.keySize);
    }
    /**
     * Specifies the Key Type to use for this Key Vault Key. Possible values are `EC` (Elliptic Curve), `EC-HSM`, `Oct` (Octet), `RSA` and `RSA-HSM`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="keyType", type=String.class, parameters={})
    private Output<String> keyType;

    /**
     * @return Specifies the Key Type to use for this Key Vault Key. Possible values are `EC` (Elliptic Curve), `EC-HSM`, `Oct` (Octet), `RSA` and `RSA-HSM`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> keyType() {
        return this.keyType;
    }
    /**
     * The ID of the Key Vault where the Key should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="keyVaultId", type=String.class, parameters={})
    private Output<String> keyVaultId;

    /**
     * @return The ID of the Key Vault where the Key should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> keyVaultId() {
        return this.keyVaultId;
    }
    /**
     * The RSA modulus of this Key Vault Key.
     * 
     */
    @Export(name="n", type=String.class, parameters={})
    private Output<String> n;

    /**
     * @return The RSA modulus of this Key Vault Key.
     * 
     */
    public Output<String> n() {
        return this.n;
    }
    /**
     * Specifies the name of the Key Vault Key. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Key Vault Key. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key not usable before the provided UTC datetime (Y-m-d&#39;T&#39;H:M:S&#39;Z&#39;).
     * 
     */
    @Export(name="notBeforeDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> notBeforeDate;

    /**
     * @return Key not usable before the provided UTC datetime (Y-m-d&#39;T&#39;H:M:S&#39;Z&#39;).
     * 
     */
    public Output<Optional<String>> notBeforeDate() {
        return Codegen.optional(this.notBeforeDate);
    }
    /**
     * The OpenSSH encoded public key of this Key Vault Key.
     * 
     */
    @Export(name="publicKeyOpenssh", type=String.class, parameters={})
    private Output<String> publicKeyOpenssh;

    /**
     * @return The OpenSSH encoded public key of this Key Vault Key.
     * 
     */
    public Output<String> publicKeyOpenssh() {
        return this.publicKeyOpenssh;
    }
    /**
     * The PEM encoded public key of this Key Vault Key.
     * 
     */
    @Export(name="publicKeyPem", type=String.class, parameters={})
    private Output<String> publicKeyPem;

    /**
     * @return The PEM encoded public key of this Key Vault Key.
     * 
     */
    public Output<String> publicKeyPem() {
        return this.publicKeyPem;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The current version of the Key Vault Key.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The current version of the Key Vault Key.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * The Base ID of the Key Vault Key.
     * 
     */
    @Export(name="versionlessId", type=String.class, parameters={})
    private Output<String> versionlessId;

    /**
     * @return The Base ID of the Key Vault Key.
     * 
     */
    public Output<String> versionlessId() {
        return this.versionlessId;
    }
    /**
     * The EC X component of this Key Vault Key.
     * 
     */
    @Export(name="x", type=String.class, parameters={})
    private Output<String> x;

    /**
     * @return The EC X component of this Key Vault Key.
     * 
     */
    public Output<String> x() {
        return this.x;
    }
    /**
     * The EC Y component of this Key Vault Key.
     * 
     */
    @Export(name="y", type=String.class, parameters={})
    private Output<String> y;

    /**
     * @return The EC Y component of this Key Vault Key.
     * 
     */
    public Output<String> y() {
        return this.y;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Key(String name) {
        this(name, KeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Key(String name, KeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, KeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:keyvault/key:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Key(String name, Output<String> id, @Nullable KeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:keyvault/key:Key", name, state, makeResourceOptions(options, id));
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
    public static Key get(String name, Output<String> id, @Nullable KeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, state, options);
    }
}