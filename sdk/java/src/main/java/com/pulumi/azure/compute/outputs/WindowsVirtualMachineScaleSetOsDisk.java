// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.WindowsVirtualMachineScaleSetOsDiskDiffDiskSettings;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsVirtualMachineScaleSetOsDisk {
    /**
     * @return The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
     * 
     */
    private final String caching;
    /**
     * @return A `diff_disk_settings` block as defined above. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable WindowsVirtualMachineScaleSetOsDiskDiffDiskSettings diffDiskSettings;
    /**
     * @return The ID of the Disk Encryption Set which should be used to encrypt this OS Disk. Conflicts with `secure_vm_disk_encryption_set_id`.
     * 
     */
    private final @Nullable String diskEncryptionSetId;
    /**
     * @return The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine Scale Set is sourced from.
     * 
     */
    private final @Nullable Integer diskSizeGb;
    /**
     * @return The ID of the Disk Encryption Set which should be used to Encrypt the OS Disk when the Virtual Machine Scale Set is Confidential VMSS. Conflicts with `disk_encryption_set_id`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String secureVmDiskEncryptionSetId;
    /**
     * @return Encryption Type when the Virtual Machine Scale Set is Confidential VMSS. Possible values are `VMGuestStateOnly` and `DiskWithVMGuestState`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String securityEncryptionType;
    /**
     * @return The Type of Storage Account which should back this the Internal OS Disk. Possible values include `Standard_LRS`, `StandardSSD_LRS` and `Premium_LRS`.
     * 
     */
    private final String storageAccountType;
    /**
     * @return Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean writeAcceleratorEnabled;

    @CustomType.Constructor
    private WindowsVirtualMachineScaleSetOsDisk(
        @CustomType.Parameter("caching") String caching,
        @CustomType.Parameter("diffDiskSettings") @Nullable WindowsVirtualMachineScaleSetOsDiskDiffDiskSettings diffDiskSettings,
        @CustomType.Parameter("diskEncryptionSetId") @Nullable String diskEncryptionSetId,
        @CustomType.Parameter("diskSizeGb") @Nullable Integer diskSizeGb,
        @CustomType.Parameter("secureVmDiskEncryptionSetId") @Nullable String secureVmDiskEncryptionSetId,
        @CustomType.Parameter("securityEncryptionType") @Nullable String securityEncryptionType,
        @CustomType.Parameter("storageAccountType") String storageAccountType,
        @CustomType.Parameter("writeAcceleratorEnabled") @Nullable Boolean writeAcceleratorEnabled) {
        this.caching = caching;
        this.diffDiskSettings = diffDiskSettings;
        this.diskEncryptionSetId = diskEncryptionSetId;
        this.diskSizeGb = diskSizeGb;
        this.secureVmDiskEncryptionSetId = secureVmDiskEncryptionSetId;
        this.securityEncryptionType = securityEncryptionType;
        this.storageAccountType = storageAccountType;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    /**
     * @return The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
     * 
     */
    public String caching() {
        return this.caching;
    }
    /**
     * @return A `diff_disk_settings` block as defined above. Changing this forces a new resource to be created.
     * 
     */
    public Optional<WindowsVirtualMachineScaleSetOsDiskDiffDiskSettings> diffDiskSettings() {
        return Optional.ofNullable(this.diffDiskSettings);
    }
    /**
     * @return The ID of the Disk Encryption Set which should be used to encrypt this OS Disk. Conflicts with `secure_vm_disk_encryption_set_id`.
     * 
     */
    public Optional<String> diskEncryptionSetId() {
        return Optional.ofNullable(this.diskEncryptionSetId);
    }
    /**
     * @return The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine Scale Set is sourced from.
     * 
     */
    public Optional<Integer> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }
    /**
     * @return The ID of the Disk Encryption Set which should be used to Encrypt the OS Disk when the Virtual Machine Scale Set is Confidential VMSS. Conflicts with `disk_encryption_set_id`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> secureVmDiskEncryptionSetId() {
        return Optional.ofNullable(this.secureVmDiskEncryptionSetId);
    }
    /**
     * @return Encryption Type when the Virtual Machine Scale Set is Confidential VMSS. Possible values are `VMGuestStateOnly` and `DiskWithVMGuestState`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> securityEncryptionType() {
        return Optional.ofNullable(this.securityEncryptionType);
    }
    /**
     * @return The Type of Storage Account which should back this the Internal OS Disk. Possible values include `Standard_LRS`, `StandardSSD_LRS` and `Premium_LRS`.
     * 
     */
    public String storageAccountType() {
        return this.storageAccountType;
    }
    /**
     * @return Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
     * 
     */
    public Optional<Boolean> writeAcceleratorEnabled() {
        return Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsVirtualMachineScaleSetOsDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caching;
        private @Nullable WindowsVirtualMachineScaleSetOsDiskDiffDiskSettings diffDiskSettings;
        private @Nullable String diskEncryptionSetId;
        private @Nullable Integer diskSizeGb;
        private @Nullable String secureVmDiskEncryptionSetId;
        private @Nullable String securityEncryptionType;
        private String storageAccountType;
        private @Nullable Boolean writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsVirtualMachineScaleSetOsDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.diffDiskSettings = defaults.diffDiskSettings;
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.secureVmDiskEncryptionSetId = defaults.secureVmDiskEncryptionSetId;
    	      this.securityEncryptionType = defaults.securityEncryptionType;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder caching(String caching) {
            this.caching = Objects.requireNonNull(caching);
            return this;
        }
        public Builder diffDiskSettings(@Nullable WindowsVirtualMachineScaleSetOsDiskDiffDiskSettings diffDiskSettings) {
            this.diffDiskSettings = diffDiskSettings;
            return this;
        }
        public Builder diskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }
        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder secureVmDiskEncryptionSetId(@Nullable String secureVmDiskEncryptionSetId) {
            this.secureVmDiskEncryptionSetId = secureVmDiskEncryptionSetId;
            return this;
        }
        public Builder securityEncryptionType(@Nullable String securityEncryptionType) {
            this.securityEncryptionType = securityEncryptionType;
            return this;
        }
        public Builder storageAccountType(String storageAccountType) {
            this.storageAccountType = Objects.requireNonNull(storageAccountType);
            return this;
        }
        public Builder writeAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }        public WindowsVirtualMachineScaleSetOsDisk build() {
            return new WindowsVirtualMachineScaleSetOsDisk(caching, diffDiskSettings, diskEncryptionSetId, diskSizeGb, secureVmDiskEncryptionSetId, securityEncryptionType, storageAccountType, writeAcceleratorEnabled);
        }
    }
}