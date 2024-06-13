package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineVFlashModuleInfo;
import com.vmware.vim25.VirtualMachineVFlashModuleInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineVFlashModuleInfo", propOrder = {"virtualMachineVFlashModuleInfo"})
public class ArrayOfVirtualMachineVFlashModuleInfo {
  @XmlElement(name = "VirtualMachineVFlashModuleInfo")
  protected List<VirtualMachineVFlashModuleInfo> virtualMachineVFlashModuleInfo;
  
  public List<VirtualMachineVFlashModuleInfo> getVirtualMachineVFlashModuleInfo() {
    if (this.virtualMachineVFlashModuleInfo == null)
      this.virtualMachineVFlashModuleInfo = new ArrayList<>(); 
    return this.virtualMachineVFlashModuleInfo;
  }
}
