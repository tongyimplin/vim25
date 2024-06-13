package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachinePciSharedGpuPassthroughInfo;
import com.vmware.vim25.VirtualMachinePciSharedGpuPassthroughInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachinePciSharedGpuPassthroughInfo", propOrder = {"virtualMachinePciSharedGpuPassthroughInfo"})
public class ArrayOfVirtualMachinePciSharedGpuPassthroughInfo {
  @XmlElement(name = "VirtualMachinePciSharedGpuPassthroughInfo")
  protected List<VirtualMachinePciSharedGpuPassthroughInfo> virtualMachinePciSharedGpuPassthroughInfo;
  
  public List<VirtualMachinePciSharedGpuPassthroughInfo> getVirtualMachinePciSharedGpuPassthroughInfo() {
    if (this.virtualMachinePciSharedGpuPassthroughInfo == null)
      this.virtualMachinePciSharedGpuPassthroughInfo = new ArrayList<>(); 
    return this.virtualMachinePciSharedGpuPassthroughInfo;
  }
}
