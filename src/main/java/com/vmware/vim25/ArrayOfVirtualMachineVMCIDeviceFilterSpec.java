package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineVMCIDeviceFilterSpec;
import com.vmware.vim25.VirtualMachineVMCIDeviceFilterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineVMCIDeviceFilterSpec", propOrder = {"virtualMachineVMCIDeviceFilterSpec"})
public class ArrayOfVirtualMachineVMCIDeviceFilterSpec {
  @XmlElement(name = "VirtualMachineVMCIDeviceFilterSpec")
  protected List<VirtualMachineVMCIDeviceFilterSpec> virtualMachineVMCIDeviceFilterSpec;
  
  public List<VirtualMachineVMCIDeviceFilterSpec> getVirtualMachineVMCIDeviceFilterSpec() {
    if (this.virtualMachineVMCIDeviceFilterSpec == null)
      this.virtualMachineVMCIDeviceFilterSpec = new ArrayList<>(); 
    return this.virtualMachineVMCIDeviceFilterSpec;
  }
}
