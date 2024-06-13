package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineRelocateSpecDiskLocator;
import com.vmware.vim25.VirtualMachineRelocateSpecDiskLocator;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineRelocateSpecDiskLocator", propOrder = {"virtualMachineRelocateSpecDiskLocator"})
public class ArrayOfVirtualMachineRelocateSpecDiskLocator {
  @XmlElement(name = "VirtualMachineRelocateSpecDiskLocator")
  protected List<VirtualMachineRelocateSpecDiskLocator> virtualMachineRelocateSpecDiskLocator;
  
  public List<VirtualMachineRelocateSpecDiskLocator> getVirtualMachineRelocateSpecDiskLocator() {
    if (this.virtualMachineRelocateSpecDiskLocator == null)
      this.virtualMachineRelocateSpecDiskLocator = new ArrayList<>(); 
    return this.virtualMachineRelocateSpecDiskLocator;
  }
}
