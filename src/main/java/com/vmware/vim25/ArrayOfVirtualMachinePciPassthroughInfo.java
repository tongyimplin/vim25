package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachinePciPassthroughInfo;
import com.vmware.vim25.VirtualMachinePciPassthroughInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachinePciPassthroughInfo", propOrder = {"virtualMachinePciPassthroughInfo"})
public class ArrayOfVirtualMachinePciPassthroughInfo {
  @XmlElement(name = "VirtualMachinePciPassthroughInfo")
  protected List<VirtualMachinePciPassthroughInfo> virtualMachinePciPassthroughInfo;
  
  public List<VirtualMachinePciPassthroughInfo> getVirtualMachinePciPassthroughInfo() {
    if (this.virtualMachinePciPassthroughInfo == null)
      this.virtualMachinePciPassthroughInfo = new ArrayList<>(); 
    return this.virtualMachinePciPassthroughInfo;
  }
}
