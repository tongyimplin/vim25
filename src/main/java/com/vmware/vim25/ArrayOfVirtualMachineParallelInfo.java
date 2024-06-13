package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineParallelInfo;
import com.vmware.vim25.VirtualMachineParallelInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineParallelInfo", propOrder = {"virtualMachineParallelInfo"})
public class ArrayOfVirtualMachineParallelInfo {
  @XmlElement(name = "VirtualMachineParallelInfo")
  protected List<VirtualMachineParallelInfo> virtualMachineParallelInfo;
  
  public List<VirtualMachineParallelInfo> getVirtualMachineParallelInfo() {
    if (this.virtualMachineParallelInfo == null)
      this.virtualMachineParallelInfo = new ArrayList<>(); 
    return this.virtualMachineParallelInfo;
  }
}
