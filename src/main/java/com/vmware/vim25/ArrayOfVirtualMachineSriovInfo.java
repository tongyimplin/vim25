package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineSriovInfo;
import com.vmware.vim25.VirtualMachineSriovInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineSriovInfo", propOrder = {"virtualMachineSriovInfo"})
public class ArrayOfVirtualMachineSriovInfo {
  @XmlElement(name = "VirtualMachineSriovInfo")
  protected List<VirtualMachineSriovInfo> virtualMachineSriovInfo;
  
  public List<VirtualMachineSriovInfo> getVirtualMachineSriovInfo() {
    if (this.virtualMachineSriovInfo == null)
      this.virtualMachineSriovInfo = new ArrayList<>(); 
    return this.virtualMachineSriovInfo;
  }
}
