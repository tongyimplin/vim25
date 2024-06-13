package com.vmware.vim25;

import com.vmware.vim25.VirtualMachinePciSharedGpuPassthroughInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachinePciSharedGpuPassthroughInfo", propOrder = {"vgpu"})
public class VirtualMachinePciSharedGpuPassthroughInfo extends VirtualMachineTargetInfo {
  @XmlElement(required = true)
  protected String vgpu;
  
  public String getVgpu() {
    return this.vgpu;
  }
  
  public void setVgpu(String paramString) {
    this.vgpu = paramString;
  }
}
