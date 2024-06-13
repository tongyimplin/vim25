package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineMetadataManagerVmMetadataInput;
import com.vmware.vim25.VirtualMachineMetadataManagerVmMetadataInput;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineMetadataManagerVmMetadataInput", propOrder = {"virtualMachineMetadataManagerVmMetadataInput"})
public class ArrayOfVirtualMachineMetadataManagerVmMetadataInput {
  @XmlElement(name = "VirtualMachineMetadataManagerVmMetadataInput")
  protected List<VirtualMachineMetadataManagerVmMetadataInput> virtualMachineMetadataManagerVmMetadataInput;
  
  public List<VirtualMachineMetadataManagerVmMetadataInput> getVirtualMachineMetadataManagerVmMetadataInput() {
    if (this.virtualMachineMetadataManagerVmMetadataInput == null)
      this.virtualMachineMetadataManagerVmMetadataInput = new ArrayList<>(); 
    return this.virtualMachineMetadataManagerVmMetadataInput;
  }
}
