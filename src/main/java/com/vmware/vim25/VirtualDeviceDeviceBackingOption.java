package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.VirtualCdromAtapiBackingOption;
import com.vmware.vim25.VirtualCdromPassthroughBackingOption;
import com.vmware.vim25.VirtualCdromRemoteAtapiBackingOption;
import com.vmware.vim25.VirtualDeviceBackingOption;
import com.vmware.vim25.VirtualDeviceDeviceBackingOption;
import com.vmware.vim25.VirtualDiskRawDiskMappingVer1BackingOption;
import com.vmware.vim25.VirtualDiskRawDiskVer2BackingOption;
import com.vmware.vim25.VirtualEthernetCardLegacyNetworkBackingOption;
import com.vmware.vim25.VirtualEthernetCardNetworkBackingOption;
import com.vmware.vim25.VirtualFloppyDeviceBackingOption;
import com.vmware.vim25.VirtualPCIPassthroughDeviceBackingOption;
import com.vmware.vim25.VirtualPCIPassthroughDynamicBackingOption;
import com.vmware.vim25.VirtualParallelPortDeviceBackingOption;
import com.vmware.vim25.VirtualPointingDeviceBackingOption;
import com.vmware.vim25.VirtualSCSIPassthroughDeviceBackingOption;
import com.vmware.vim25.VirtualSerialPortDeviceBackingOption;
import com.vmware.vim25.VirtualSoundCardDeviceBackingOption;
import com.vmware.vim25.VirtualUSBRemoteHostBackingOption;
import com.vmware.vim25.VirtualUSBUSBBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceDeviceBackingOption", propOrder = {"autoDetectAvailable"})
@XmlSeeAlso({VirtualPointingDeviceBackingOption.class, VirtualParallelPortDeviceBackingOption.class, VirtualEthernetCardLegacyNetworkBackingOption.class, VirtualEthernetCardNetworkBackingOption.class, VirtualPCIPassthroughDynamicBackingOption.class, VirtualUSBRemoteHostBackingOption.class, VirtualCdromPassthroughBackingOption.class, VirtualPCIPassthroughDeviceBackingOption.class, VirtualSCSIPassthroughDeviceBackingOption.class, VirtualSerialPortDeviceBackingOption.class, VirtualCdromAtapiBackingOption.class, VirtualDiskRawDiskMappingVer1BackingOption.class, VirtualDiskRawDiskVer2BackingOption.class, VirtualCdromRemoteAtapiBackingOption.class, VirtualFloppyDeviceBackingOption.class, VirtualUSBUSBBackingOption.class, VirtualSoundCardDeviceBackingOption.class})
public class VirtualDeviceDeviceBackingOption extends VirtualDeviceBackingOption {
  @XmlElement(required = true)
  protected BoolOption autoDetectAvailable;
  
  public BoolOption getAutoDetectAvailable() {
    return this.autoDetectAvailable;
  }
  
  public void setAutoDetectAvailable(BoolOption paramBoolOption) {
    this.autoDetectAvailable = paramBoolOption;
  }
}
