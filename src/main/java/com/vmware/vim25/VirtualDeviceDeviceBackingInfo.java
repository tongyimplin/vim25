package com.vmware.vim25;

import com.vmware.vim25.VirtualCdromAtapiBackingInfo;
import com.vmware.vim25.VirtualCdromPassthroughBackingInfo;
import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualDeviceDeviceBackingInfo;
import com.vmware.vim25.VirtualDiskRawDiskVer2BackingInfo;
import com.vmware.vim25.VirtualEthernetCardLegacyNetworkBackingInfo;
import com.vmware.vim25.VirtualEthernetCardNetworkBackingInfo;
import com.vmware.vim25.VirtualFloppyDeviceBackingInfo;
import com.vmware.vim25.VirtualPCIPassthroughDeviceBackingInfo;
import com.vmware.vim25.VirtualPCIPassthroughDynamicBackingInfo;
import com.vmware.vim25.VirtualParallelPortDeviceBackingInfo;
import com.vmware.vim25.VirtualPointingDeviceDeviceBackingInfo;
import com.vmware.vim25.VirtualSCSIPassthroughDeviceBackingInfo;
import com.vmware.vim25.VirtualSerialPortDeviceBackingInfo;
import com.vmware.vim25.VirtualSoundCardDeviceBackingInfo;
import com.vmware.vim25.VirtualUSBRemoteHostBackingInfo;
import com.vmware.vim25.VirtualUSBUSBBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceDeviceBackingInfo", propOrder = {"deviceName", "useAutoDetect"})
@XmlSeeAlso({VirtualPCIPassthroughDynamicBackingInfo.class, VirtualSerialPortDeviceBackingInfo.class, VirtualEthernetCardLegacyNetworkBackingInfo.class, VirtualUSBRemoteHostBackingInfo.class, VirtualCdromPassthroughBackingInfo.class, VirtualPCIPassthroughDeviceBackingInfo.class, VirtualPointingDeviceDeviceBackingInfo.class, VirtualFloppyDeviceBackingInfo.class, VirtualSCSIPassthroughDeviceBackingInfo.class, VirtualUSBUSBBackingInfo.class, VirtualSoundCardDeviceBackingInfo.class, VirtualEthernetCardNetworkBackingInfo.class, VirtualDiskRawDiskVer2BackingInfo.class, VirtualCdromAtapiBackingInfo.class, VirtualParallelPortDeviceBackingInfo.class})
public class VirtualDeviceDeviceBackingInfo extends VirtualDeviceBackingInfo {
  @XmlElement(required = true)
  protected String deviceName;
  
  protected Boolean useAutoDetect;
  
  public String getDeviceName() {
    return this.deviceName;
  }
  
  public void setDeviceName(String paramString) {
    this.deviceName = paramString;
  }
  
  public Boolean isUseAutoDetect() {
    return this.useAutoDetect;
  }
  
  public void setUseAutoDetect(Boolean paramBoolean) {
    this.useAutoDetect = paramBoolean;
  }
}
