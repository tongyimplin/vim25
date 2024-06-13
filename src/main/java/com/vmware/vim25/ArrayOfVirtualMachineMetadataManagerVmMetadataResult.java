package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineMetadataManagerVmMetadataResult;
import com.vmware.vim25.VirtualMachineMetadataManagerVmMetadataResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineMetadataManagerVmMetadataResult", propOrder = {"virtualMachineMetadataManagerVmMetadataResult"})
public class ArrayOfVirtualMachineMetadataManagerVmMetadataResult {
  @XmlElement(name = "VirtualMachineMetadataManagerVmMetadataResult")
  protected List<VirtualMachineMetadataManagerVmMetadataResult> virtualMachineMetadataManagerVmMetadataResult;
  
  public List<VirtualMachineMetadataManagerVmMetadataResult> getVirtualMachineMetadataManagerVmMetadataResult() {
    if (this.virtualMachineMetadataManagerVmMetadataResult == null)
      this.virtualMachineMetadataManagerVmMetadataResult = new ArrayList<>(); 
    return this.virtualMachineMetadataManagerVmMetadataResult;
  }
}
