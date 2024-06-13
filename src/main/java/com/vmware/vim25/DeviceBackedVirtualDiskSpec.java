package com.vmware.vim25;

import com.vmware.vim25.DeviceBackedVirtualDiskSpec;
import com.vmware.vim25.VirtualDiskSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceBackedVirtualDiskSpec", propOrder = {"device"})
public class DeviceBackedVirtualDiskSpec extends VirtualDiskSpec {
  @XmlElement(required = true)
  protected String device;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
}
