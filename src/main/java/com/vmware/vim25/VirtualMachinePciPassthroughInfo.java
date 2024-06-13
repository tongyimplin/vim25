package com.vmware.vim25;

import com.vmware.vim25.HostPciDevice;
import com.vmware.vim25.VirtualMachinePciPassthroughInfo;
import com.vmware.vim25.VirtualMachineSriovInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachinePciPassthroughInfo", propOrder = {"pciDevice", "systemId"})
@XmlSeeAlso({VirtualMachineSriovInfo.class})
public class VirtualMachinePciPassthroughInfo extends VirtualMachineTargetInfo {
  @XmlElement(required = true)
  protected HostPciDevice pciDevice;
  
  @XmlElement(required = true)
  protected String systemId;
  
  public HostPciDevice getPciDevice() {
    return this.pciDevice;
  }
  
  public void setPciDevice(HostPciDevice paramHostPciDevice) {
    this.pciDevice = paramHostPciDevice;
  }
  
  public String getSystemId() {
    return this.systemId;
  }
  
  public void setSystemId(String paramString) {
    this.systemId = paramString;
  }
}
