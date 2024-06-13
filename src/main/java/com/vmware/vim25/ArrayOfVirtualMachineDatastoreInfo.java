package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineDatastoreInfo;
import com.vmware.vim25.VirtualMachineDatastoreInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineDatastoreInfo", propOrder = {"virtualMachineDatastoreInfo"})
public class ArrayOfVirtualMachineDatastoreInfo {
  @XmlElement(name = "VirtualMachineDatastoreInfo")
  protected List<VirtualMachineDatastoreInfo> virtualMachineDatastoreInfo;
  
  public List<VirtualMachineDatastoreInfo> getVirtualMachineDatastoreInfo() {
    if (this.virtualMachineDatastoreInfo == null)
      this.virtualMachineDatastoreInfo = new ArrayList<>(); 
    return this.virtualMachineDatastoreInfo;
  }
}
