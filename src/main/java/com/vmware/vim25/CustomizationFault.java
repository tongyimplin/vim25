package com.vmware.vim25;

import com.vmware.vim25.CannotDecryptPasswords;
import com.vmware.vim25.CustomizationPending;
import com.vmware.vim25.IpHostnameGeneratorError;
import com.vmware.vim25.LinuxVolumeNotClean;
import com.vmware.vim25.MissingLinuxCustResources;
import com.vmware.vim25.MissingWindowsCustResources;
import com.vmware.vim25.MountError;
import com.vmware.vim25.NicSettingMismatch;
import com.vmware.vim25.NoDisksToCustomize;
import com.vmware.vim25.UncustomizableGuest;
import com.vmware.vim25.UnexpectedCustomizationFault;
import com.vmware.vim25.VimFault;
import com.vmware.vim25.VolumeEditorError;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationFault")
@XmlSeeAlso({IpHostnameGeneratorError.class, CannotDecryptPasswords.class, LinuxVolumeNotClean.class, VolumeEditorError.class, UnexpectedCustomizationFault.class, MissingLinuxCustResources.class, NicSettingMismatch.class, CustomizationPending.class, NoDisksToCustomize.class, MissingWindowsCustResources.class, MountError.class, UncustomizableGuest.class})
public class CustomizationFault extends VimFault {}
