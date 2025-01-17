// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.RunCommandArgs;
import com.pulumi.azure.compute.inputs.RunCommandState;
import com.pulumi.azure.compute.outputs.RunCommandErrorBlobManagedIdentity;
import com.pulumi.azure.compute.outputs.RunCommandInstanceView;
import com.pulumi.azure.compute.outputs.RunCommandOutputBlobManagedIdentity;
import com.pulumi.azure.compute.outputs.RunCommandParameter;
import com.pulumi.azure.compute.outputs.RunCommandProtectedParameter;
import com.pulumi.azure.compute.outputs.RunCommandSource;
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
 * Manages a Virtual Machine Run Command.
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
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.NetworkInterface;
 * import com.pulumi.azure.network.NetworkInterfaceArgs;
 * import com.pulumi.azure.network.inputs.NetworkInterfaceIpConfigurationArgs;
 * import com.pulumi.azure.authorization.UserAssignedIdentity;
 * import com.pulumi.azure.authorization.UserAssignedIdentityArgs;
 * import com.pulumi.azure.compute.LinuxVirtualMachine;
 * import com.pulumi.azure.compute.LinuxVirtualMachineArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineOsDiskArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineSourceImageReferenceArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineIdentityArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.authorization.Assignment;
 * import com.pulumi.azure.authorization.AssignmentArgs;
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
 * import com.pulumi.azure.storage.Blob;
 * import com.pulumi.azure.storage.BlobArgs;
 * import com.pulumi.azure.storage.StorageFunctions;
 * import com.pulumi.azure.storage.inputs.GetAccountSASArgs;
 * import com.pulumi.azure.storage.inputs.GetAccountSASResourceTypesArgs;
 * import com.pulumi.azure.storage.inputs.GetAccountSASServicesArgs;
 * import com.pulumi.azure.storage.inputs.GetAccountSASPermissionsArgs;
 * import com.pulumi.azure.compute.RunCommand;
 * import com.pulumi.azure.compute.RunCommandArgs;
 * import com.pulumi.azure.compute.inputs.RunCommandSourceArgs;
 * import com.pulumi.azure.compute.inputs.RunCommandSourceScriptUriManagedIdentityArgs;
 * import com.pulumi.azure.compute.inputs.RunCommandErrorBlobManagedIdentityArgs;
 * import com.pulumi.azure.compute.inputs.RunCommandOutputBlobManagedIdentityArgs;
 * import com.pulumi.azure.compute.inputs.RunCommandParameterArgs;
 * import com.pulumi.azure.compute.inputs.RunCommandProtectedParameterArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var exampleNetworkInterface = new NetworkInterface(&#34;exampleNetworkInterface&#34;, NetworkInterfaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .ipConfigurations(NetworkInterfaceIpConfigurationArgs.builder()
 *                 .name(&#34;internal&#34;)
 *                 .subnetId(exampleSubnet.id())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleUserAssignedIdentity = new UserAssignedIdentity(&#34;exampleUserAssignedIdentity&#34;, UserAssignedIdentityArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .build());
 * 
 *         var exampleLinuxVirtualMachine = new LinuxVirtualMachine(&#34;exampleLinuxVirtualMachine&#34;, LinuxVirtualMachineArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .size(&#34;Standard_B2s&#34;)
 *             .adminUsername(&#34;adminuser&#34;)
 *             .adminPassword(&#34;P@$$w0rd1234!&#34;)
 *             .disablePasswordAuthentication(false)
 *             .networkInterfaceIds(exampleNetworkInterface.id())
 *             .osDisk(LinuxVirtualMachineOsDiskArgs.builder()
 *                 .caching(&#34;ReadWrite&#34;)
 *                 .storageAccountType(&#34;Premium_LRS&#34;)
 *                 .build())
 *             .sourceImageReference(LinuxVirtualMachineSourceImageReferenceArgs.builder()
 *                 .publisher(&#34;Canonical&#34;)
 *                 .offer(&#34;0001-com-ubuntu-server-jammy&#34;)
 *                 .sku(&#34;22_04-lts&#34;)
 *                 .version(&#34;latest&#34;)
 *                 .build())
 *             .identity(LinuxVirtualMachineIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned, UserAssigned&#34;)
 *                 .identityIds(exampleUserAssignedIdentity.id())
 *                 .build())
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleAssignment = new Assignment(&#34;exampleAssignment&#34;, AssignmentArgs.builder()        
 *             .scope(exampleAccount.id())
 *             .roleDefinitionName(&#34;Storage Blob Data Contributor&#34;)
 *             .principalId(exampleUserAssignedIdentity.principalId())
 *             .build());
 * 
 *         var exampleContainer = new Container(&#34;exampleContainer&#34;, ContainerArgs.builder()        
 *             .storageAccountName(exampleAccount.name())
 *             .containerAccessType(&#34;blob&#34;)
 *             .build());
 * 
 *         var example1 = new Blob(&#34;example1&#34;, BlobArgs.builder()        
 *             .storageAccountName(exampleAccount.name())
 *             .storageContainerName(exampleContainer.name())
 *             .type(&#34;Block&#34;)
 *             .sourceContent(&#34;echo &#39;hello world&#39;&#34;)
 *             .build());
 * 
 *         var example2Blob = new Blob(&#34;example2Blob&#34;, BlobArgs.builder()        
 *             .storageAccountName(exampleAccount.name())
 *             .storageContainerName(exampleContainer.name())
 *             .type(&#34;Append&#34;)
 *             .build());
 * 
 *         var example3Blob = new Blob(&#34;example3Blob&#34;, BlobArgs.builder()        
 *             .storageAccountName(exampleAccount.name())
 *             .storageContainerName(exampleContainer.name())
 *             .type(&#34;Append&#34;)
 *             .build());
 * 
 *         final var exampleAccountSAS = StorageFunctions.getAccountSAS(GetAccountSASArgs.builder()
 *             .connectionString(exampleAccount.primaryConnectionString())
 *             .httpsOnly(true)
 *             .signedVersion(&#34;2019-10-10&#34;)
 *             .start(&#34;2023-04-01T00:00:00Z&#34;)
 *             .expiry(&#34;2024-04-01T00:00:00Z&#34;)
 *             .resourceTypes(GetAccountSASResourceTypesArgs.builder()
 *                 .service(false)
 *                 .container(false)
 *                 .object(true)
 *                 .build())
 *             .services(GetAccountSASServicesArgs.builder()
 *                 .blob(true)
 *                 .queue(false)
 *                 .table(false)
 *                 .file(false)
 *                 .build())
 *             .permissions(GetAccountSASPermissionsArgs.builder()
 *                 .read(true)
 *                 .write(true)
 *                 .delete(false)
 *                 .list(false)
 *                 .add(true)
 *                 .create(true)
 *                 .update(false)
 *                 .process(false)
 *                 .tag(false)
 *                 .filter(false)
 *                 .build())
 *             .build());
 * 
 *         var exampleRunCommand = new RunCommand(&#34;exampleRunCommand&#34;, RunCommandArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .virtualMachineId(exampleLinuxVirtualMachine.id())
 *             .source(RunCommandSourceArgs.builder()
 *                 .script(&#34;echo &#39;hello world&#39;&#34;)
 *                 .build())
 *             .build());
 * 
 *         var example2RunCommand = new RunCommand(&#34;example2RunCommand&#34;, RunCommandArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .virtualMachineId(exampleLinuxVirtualMachine.id())
 *             .outputBlobUri(example2Blob.id())
 *             .errorBlobUri(example3Blob.id())
 *             .runAsPassword(&#34;P@$$w0rd1234!&#34;)
 *             .runAsUser(&#34;adminuser&#34;)
 *             .source(RunCommandSourceArgs.builder()
 *                 .scriptUri(example1.id())
 *                 .scriptUriManagedIdentity(RunCommandSourceScriptUriManagedIdentityArgs.builder()
 *                     .clientId(exampleUserAssignedIdentity.clientId())
 *                     .build())
 *                 .build())
 *             .errorBlobManagedIdentity(RunCommandErrorBlobManagedIdentityArgs.builder()
 *                 .clientId(exampleUserAssignedIdentity.clientId())
 *                 .build())
 *             .outputBlobManagedIdentity(RunCommandOutputBlobManagedIdentityArgs.builder()
 *                 .clientId(exampleUserAssignedIdentity.clientId())
 *                 .build())
 *             .parameters(RunCommandParameterArgs.builder()
 *                 .name(&#34;examplev1&#34;)
 *                 .value(&#34;val1&#34;)
 *                 .build())
 *             .protectedParameters(RunCommandProtectedParameterArgs.builder()
 *                 .name(&#34;examplev2&#34;)
 *                 .value(&#34;val2&#34;)
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;environment&#34;, &#34;terraform-examples&#34;),
 *                 Map.entry(&#34;some_key&#34;, &#34;some-value&#34;)
 *             ))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleAssignment)
 *                 .build());
 * 
 *         var example3RunCommand = new RunCommand(&#34;example3RunCommand&#34;, RunCommandArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .virtualMachineId(exampleLinuxVirtualMachine.id())
 *             .runAsPassword(&#34;P@$$w0rd1234!&#34;)
 *             .runAsUser(&#34;adminuser&#34;)
 *             .errorBlobUri(Output.tuple(example3Blob.id(), exampleAccountSAS.applyValue(getAccountSASResult -&gt; getAccountSASResult)).applyValue(values -&gt; {
 *                 var id = values.t1;
 *                 var exampleAccountSAS = values.t2;
 *                 return String.format(&#34;%s%s&#34;, id,exampleAccountSAS.applyValue(getAccountSASResult -&gt; getAccountSASResult.sas()));
 *             }))
 *             .outputBlobUri(Output.tuple(example2Blob.id(), exampleAccountSAS.applyValue(getAccountSASResult -&gt; getAccountSASResult)).applyValue(values -&gt; {
 *                 var id = values.t1;
 *                 var exampleAccountSAS = values.t2;
 *                 return String.format(&#34;%s%s&#34;, id,exampleAccountSAS.applyValue(getAccountSASResult -&gt; getAccountSASResult.sas()));
 *             }))
 *             .source(RunCommandSourceArgs.builder()
 *                 .scriptUri(Output.tuple(example1.id(), exampleAccountSAS.applyValue(getAccountSASResult -&gt; getAccountSASResult)).applyValue(values -&gt; {
 *                     var id = values.t1;
 *                     var exampleAccountSAS = values.t2;
 *                     return String.format(&#34;%s%s&#34;, id,exampleAccountSAS.applyValue(getAccountSASResult -&gt; getAccountSASResult.sas()));
 *                 }))
 *                 .build())
 *             .parameters(RunCommandParameterArgs.builder()
 *                 .name(&#34;example-vm1&#34;)
 *                 .value(&#34;val1&#34;)
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;environment&#34;, &#34;terraform-example-s&#34;),
 *                 Map.entry(&#34;some_key&#34;, &#34;some-value&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * An existing Virtual Machine Run Command can be imported into Terraform using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/runCommand:RunCommand example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/virtualMachines/vm1/runCommands/rc1
 * ```
 * 
 */
@ResourceType(type="azure:compute/runCommand:RunCommand")
public class RunCommand extends com.pulumi.resources.CustomResource {
    /**
     * An `error_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
     * 
     */
    @Export(name="errorBlobManagedIdentity", refs={RunCommandErrorBlobManagedIdentity.class}, tree="[0]")
    private Output</* @Nullable */ RunCommandErrorBlobManagedIdentity> errorBlobManagedIdentity;

    /**
     * @return An `error_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
     * 
     */
    public Output<Optional<RunCommandErrorBlobManagedIdentity>> errorBlobManagedIdentity() {
        return Codegen.optional(this.errorBlobManagedIdentity);
    }
    /**
     * Specifies the Azure storage blob where script error stream will be uploaded.
     * 
     */
    @Export(name="errorBlobUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> errorBlobUri;

    /**
     * @return Specifies the Azure storage blob where script error stream will be uploaded.
     * 
     */
    public Output<Optional<String>> errorBlobUri() {
        return Codegen.optional(this.errorBlobUri);
    }
    @Export(name="instanceViews", refs={List.class,RunCommandInstanceView.class}, tree="[0,1]")
    private Output<List<RunCommandInstanceView>> instanceViews;

    public Output<List<RunCommandInstanceView>> instanceViews() {
        return this.instanceViews;
    }
    /**
     * The Azure Region where the Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of this Virtual Machine Run Command. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of this Virtual Machine Run Command. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An `output_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
     * 
     */
    @Export(name="outputBlobManagedIdentity", refs={RunCommandOutputBlobManagedIdentity.class}, tree="[0]")
    private Output</* @Nullable */ RunCommandOutputBlobManagedIdentity> outputBlobManagedIdentity;

    /**
     * @return An `output_blob_managed_identity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
     * 
     */
    public Output<Optional<RunCommandOutputBlobManagedIdentity>> outputBlobManagedIdentity() {
        return Codegen.optional(this.outputBlobManagedIdentity);
    }
    /**
     * Specifies the Azure storage blob where script output stream will be uploaded. It can be basic blob URI with SAS token.
     * 
     */
    @Export(name="outputBlobUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> outputBlobUri;

    /**
     * @return Specifies the Azure storage blob where script output stream will be uploaded. It can be basic blob URI with SAS token.
     * 
     */
    public Output<Optional<String>> outputBlobUri() {
        return Codegen.optional(this.outputBlobUri);
    }
    /**
     * A list of `parameter` blocks as defined below. The parameters used by the script.
     * 
     */
    @Export(name="parameters", refs={List.class,RunCommandParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RunCommandParameter>> parameters;

    /**
     * @return A list of `parameter` blocks as defined below. The parameters used by the script.
     * 
     */
    public Output<Optional<List<RunCommandParameter>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * A list of `protected_parameter` blocks as defined below. The protected parameters used by the script.
     * 
     */
    @Export(name="protectedParameters", refs={List.class,RunCommandProtectedParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RunCommandProtectedParameter>> protectedParameters;

    /**
     * @return A list of `protected_parameter` blocks as defined below. The protected parameters used by the script.
     * 
     */
    public Output<Optional<List<RunCommandProtectedParameter>>> protectedParameters() {
        return Codegen.optional(this.protectedParameters);
    }
    /**
     * Specifies the user account password on the VM when executing the Virtual Machine Run Command.
     * 
     */
    @Export(name="runAsPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runAsPassword;

    /**
     * @return Specifies the user account password on the VM when executing the Virtual Machine Run Command.
     * 
     */
    public Output<Optional<String>> runAsPassword() {
        return Codegen.optional(this.runAsPassword);
    }
    /**
     * Specifies the user account on the VM when executing the Virtual Machine Run Command.
     * 
     */
    @Export(name="runAsUser", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runAsUser;

    /**
     * @return Specifies the user account on the VM when executing the Virtual Machine Run Command.
     * 
     */
    public Output<Optional<String>> runAsUser() {
        return Codegen.optional(this.runAsUser);
    }
    /**
     * A `source` block as defined below. The source of the run command script.
     * 
     */
    @Export(name="source", refs={RunCommandSource.class}, tree="[0]")
    private Output<RunCommandSource> source;

    /**
     * @return A `source` block as defined below. The source of the run command script.
     * 
     */
    public Output<RunCommandSource> source() {
        return this.source;
    }
    /**
     * A mapping of tags which should be assigned to the Virtual Machine Run Command.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Virtual Machine Run Command.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the Virtual Machine ID within which this Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    @Export(name="virtualMachineId", refs={String.class}, tree="[0]")
    private Output<String> virtualMachineId;

    /**
     * @return Specifies the Virtual Machine ID within which this Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     * 
     */
    public Output<String> virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RunCommand(String name) {
        this(name, RunCommandArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RunCommand(String name, RunCommandArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RunCommand(String name, RunCommandArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/runCommand:RunCommand", name, args == null ? RunCommandArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RunCommand(String name, Output<String> id, @Nullable RunCommandState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/runCommand:RunCommand", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "errorBlobManagedIdentity",
                "outputBlobManagedIdentity",
                "protectedParameters",
                "runAsPassword"
            ))
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
    public static RunCommand get(String name, Output<String> id, @Nullable RunCommandState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RunCommand(name, id, state, options);
    }
}
