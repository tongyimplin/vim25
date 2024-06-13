package com.vmware.vim25;

import com.vmware.vim25.VirtualCdromRemoteAtapiBackingInfo;
import com.vmware.vim25.VirtualCdromRemotePassthroughBackingInfo;
import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualDeviceRemoteDeviceBackingInfo;
import com.vmware.vim25.VirtualFloppyRemoteDeviceBackingInfo;
import com.vmware.vim25.VirtualUSBRemoteClientBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceRemoteDeviceBackingInfo", propOrder = {"deviceName", "useAutoDetect"})
@XmlSeeAlso({VirtualCdromRemoteAtapiBackingInfo.class, VirtualFloppyRemoteDeviceBackingInfo.class, VirtualUSBRemoteClientBackingInfo.class, VirtualCdromRemotePassthroughBackingInfo.class})
public class VirtualDeviceRemoteDeviceBackingInfo extends VirtualDeviceBackingInfo {
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
