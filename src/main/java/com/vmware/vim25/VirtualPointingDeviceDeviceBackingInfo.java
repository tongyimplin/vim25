package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceDeviceBackingInfo;
import com.vmware.vim25.VirtualPointingDeviceDeviceBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPointingDeviceDeviceBackingInfo", propOrder = {"hostPointingDevice"})
public class VirtualPointingDeviceDeviceBackingInfo extends VirtualDeviceDeviceBackingInfo {
  @XmlElement(required = true)
  protected String hostPointingDevice;
  
  public String getHostPointingDevice() {
    return this.hostPointingDevice;
  }
  
  public void setHostPointingDevice(String paramString) {
    this.hostPointingDevice = paramString;
  }
}
