package com.vmware.vim25;

import com.vmware.vim25.OvfHardwareExport;
import com.vmware.vim25.OvfUnknownDeviceBacking;
import com.vmware.vim25.VirtualDeviceBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnknownDeviceBacking", propOrder = {"backing"})
public class OvfUnknownDeviceBacking extends OvfHardwareExport {
  @XmlElement(required = true)
  protected VirtualDeviceBackingInfo backing;
  
  public VirtualDeviceBackingInfo getBacking() {
    return this.backing;
  }
  
  public void setBacking(VirtualDeviceBackingInfo paramVirtualDeviceBackingInfo) {
    this.backing = paramVirtualDeviceBackingInfo;
  }
}
