package com.vmware.vim25;

import com.vmware.vim25.OvfSystemFault;
import com.vmware.vim25.OvfUnknownDevice;
import com.vmware.vim25.VirtualDevice;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnknownDevice", propOrder = {"device", "vmName"})
public class OvfUnknownDevice extends OvfSystemFault {
  protected VirtualDevice device;
  
  @XmlElement(required = true)
  protected String vmName;
  
  public VirtualDevice getDevice() {
    return this.device;
  }
  
  public void setDevice(VirtualDevice paramVirtualDevice) {
    this.device = paramVirtualDevice;
  }
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
  }
}
