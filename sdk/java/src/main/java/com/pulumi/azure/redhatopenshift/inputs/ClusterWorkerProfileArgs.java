// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redhatopenshift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterWorkerProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterWorkerProfileArgs Empty = new ClusterWorkerProfileArgs();

    /**
     * The resource ID of an associated disk encryption set. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="diskEncryptionSetId")
    private @Nullable Output<String> diskEncryptionSetId;

    /**
     * @return The resource ID of an associated disk encryption set. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> diskEncryptionSetId() {
        return Optional.ofNullable(this.diskEncryptionSetId);
    }

    /**
     * The internal OS disk size of the worker Virtual Machines in GB. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="diskSizeGb", required=true)
    private Output<Integer> diskSizeGb;

    /**
     * @return The internal OS disk size of the worker Virtual Machines in GB. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Whether worker virtual machines are encrypted at host. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     * **NOTE:** `encryption_at_host_enabled` is only available for certain VM sizes and the `EncryptionAtHost` feature must be enabled for your subscription. Please see the [Azure documentation](https://learn.microsoft.com/azure/virtual-machines/disks-enable-host-based-encryption-portal?tabs=azure-powershell) for more information.
     * 
     */
    @Import(name="encryptionAtHostEnabled")
    private @Nullable Output<Boolean> encryptionAtHostEnabled;

    /**
     * @return Whether worker virtual machines are encrypted at host. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     * **NOTE:** `encryption_at_host_enabled` is only available for certain VM sizes and the `EncryptionAtHost` feature must be enabled for your subscription. Please see the [Azure documentation](https://learn.microsoft.com/azure/virtual-machines/disks-enable-host-based-encryption-portal?tabs=azure-powershell) for more information.
     * 
     */
    public Optional<Output<Boolean>> encryptionAtHostEnabled() {
        return Optional.ofNullable(this.encryptionAtHostEnabled);
    }

    /**
     * The initial number of worker nodes which should exist in the cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="nodeCount", required=true)
    private Output<Integer> nodeCount;

    /**
     * @return The initial number of worker nodes which should exist in the cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> nodeCount() {
        return this.nodeCount;
    }

    /**
     * The ID of the subnet where worker nodes will be hosted. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet where worker nodes will be hosted. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    /**
     * The size of the Virtual Machines for the worker nodes. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="vmSize", required=true)
    private Output<String> vmSize;

    /**
     * @return The size of the Virtual Machines for the worker nodes. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> vmSize() {
        return this.vmSize;
    }

    private ClusterWorkerProfileArgs() {}

    private ClusterWorkerProfileArgs(ClusterWorkerProfileArgs $) {
        this.diskEncryptionSetId = $.diskEncryptionSetId;
        this.diskSizeGb = $.diskSizeGb;
        this.encryptionAtHostEnabled = $.encryptionAtHostEnabled;
        this.nodeCount = $.nodeCount;
        this.subnetId = $.subnetId;
        this.vmSize = $.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterWorkerProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterWorkerProfileArgs $;

        public Builder() {
            $ = new ClusterWorkerProfileArgs();
        }

        public Builder(ClusterWorkerProfileArgs defaults) {
            $ = new ClusterWorkerProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskEncryptionSetId The resource ID of an associated disk encryption set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionSetId(@Nullable Output<String> diskEncryptionSetId) {
            $.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        /**
         * @param diskEncryptionSetId The resource ID of an associated disk encryption set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionSetId(String diskEncryptionSetId) {
            return diskEncryptionSetId(Output.of(diskEncryptionSetId));
        }

        /**
         * @param diskSizeGb The internal OS disk size of the worker Virtual Machines in GB. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb The internal OS disk size of the worker Virtual Machines in GB. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param encryptionAtHostEnabled Whether worker virtual machines are encrypted at host. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * **NOTE:** `encryption_at_host_enabled` is only available for certain VM sizes and the `EncryptionAtHost` feature must be enabled for your subscription. Please see the [Azure documentation](https://learn.microsoft.com/azure/virtual-machines/disks-enable-host-based-encryption-portal?tabs=azure-powershell) for more information.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtHostEnabled(@Nullable Output<Boolean> encryptionAtHostEnabled) {
            $.encryptionAtHostEnabled = encryptionAtHostEnabled;
            return this;
        }

        /**
         * @param encryptionAtHostEnabled Whether worker virtual machines are encrypted at host. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * **NOTE:** `encryption_at_host_enabled` is only available for certain VM sizes and the `EncryptionAtHost` feature must be enabled for your subscription. Please see the [Azure documentation](https://learn.microsoft.com/azure/virtual-machines/disks-enable-host-based-encryption-portal?tabs=azure-powershell) for more information.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtHostEnabled(Boolean encryptionAtHostEnabled) {
            return encryptionAtHostEnabled(Output.of(encryptionAtHostEnabled));
        }

        /**
         * @param nodeCount The initial number of worker nodes which should exist in the cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount The initial number of worker nodes which should exist in the cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        /**
         * @param subnetId The ID of the subnet where worker nodes will be hosted. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the subnet where worker nodes will be hosted. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param vmSize The size of the Virtual Machines for the worker nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vmSize(Output<String> vmSize) {
            $.vmSize = vmSize;
            return this;
        }

        /**
         * @param vmSize The size of the Virtual Machines for the worker nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vmSize(String vmSize) {
            return vmSize(Output.of(vmSize));
        }

        public ClusterWorkerProfileArgs build() {
            if ($.diskSizeGb == null) {
                throw new MissingRequiredPropertyException("ClusterWorkerProfileArgs", "diskSizeGb");
            }
            if ($.nodeCount == null) {
                throw new MissingRequiredPropertyException("ClusterWorkerProfileArgs", "nodeCount");
            }
            if ($.subnetId == null) {
                throw new MissingRequiredPropertyException("ClusterWorkerProfileArgs", "subnetId");
            }
            if ($.vmSize == null) {
                throw new MissingRequiredPropertyException("ClusterWorkerProfileArgs", "vmSize");
            }
            return $;
        }
    }

}