package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineScsiPassthroughInfo;
import com.vmware.vim25.VirtualMachineScsiPassthroughInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineScsiPassthroughInfo", propOrder = {"virtualMachineScsiPassthroughInfo"})
public class ArrayOfVirtualMachineScsiPassthroughInfo {
  @XmlElement(name = "VirtualMachineScsiPassthroughInfo")
  protected List<VirtualMachineScsiPassthroughInfo> virtualMachineScsiPassthroughInfo;
  
  public List<VirtualMachineScsiPassthroughInfo> getVirtualMachineScsiPassthroughInfo() {
    if (this.virtualMachineScsiPassthroughInfo == null)
      this.virtualMachineScsiPassthroughInfo = new ArrayList<>(); 
    return this.virtualMachineScsiPassthroughInfo;
  }
}
