package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineConfigInfoDatastoreUrlPair;
import com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineConfigInfoDatastoreUrlPair", propOrder = {"virtualMachineConfigInfoDatastoreUrlPair"})
public class ArrayOfVirtualMachineConfigInfoDatastoreUrlPair {
  @XmlElement(name = "VirtualMachineConfigInfoDatastoreUrlPair")
  protected List<VirtualMachineConfigInfoDatastoreUrlPair> virtualMachineConfigInfoDatastoreUrlPair;
  
  public List<VirtualMachineConfigInfoDatastoreUrlPair> getVirtualMachineConfigInfoDatastoreUrlPair() {
    if (this.virtualMachineConfigInfoDatastoreUrlPair == null)
      this.virtualMachineConfigInfoDatastoreUrlPair = new ArrayList<>(); 
    return this.virtualMachineConfigInfoDatastoreUrlPair;
  }
}
