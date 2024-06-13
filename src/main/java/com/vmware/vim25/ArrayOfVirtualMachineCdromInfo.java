package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineCdromInfo;
import com.vmware.vim25.VirtualMachineCdromInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineCdromInfo", propOrder = {"virtualMachineCdromInfo"})
public class ArrayOfVirtualMachineCdromInfo {
  @XmlElement(name = "VirtualMachineCdromInfo")
  protected List<VirtualMachineCdromInfo> virtualMachineCdromInfo;
  
  public List<VirtualMachineCdromInfo> getVirtualMachineCdromInfo() {
    if (this.virtualMachineCdromInfo == null)
      this.virtualMachineCdromInfo = new ArrayList<>(); 
    return this.virtualMachineCdromInfo;
  }
}
