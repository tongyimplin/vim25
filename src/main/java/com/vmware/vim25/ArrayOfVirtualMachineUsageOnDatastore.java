package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineUsageOnDatastore;
import com.vmware.vim25.VirtualMachineUsageOnDatastore;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineUsageOnDatastore", propOrder = {"virtualMachineUsageOnDatastore"})
public class ArrayOfVirtualMachineUsageOnDatastore {
  @XmlElement(name = "VirtualMachineUsageOnDatastore")
  protected List<VirtualMachineUsageOnDatastore> virtualMachineUsageOnDatastore;
  
  public List<VirtualMachineUsageOnDatastore> getVirtualMachineUsageOnDatastore() {
    if (this.virtualMachineUsageOnDatastore == null)
      this.virtualMachineUsageOnDatastore = new ArrayList<>(); 
    return this.virtualMachineUsageOnDatastore;
  }
}
