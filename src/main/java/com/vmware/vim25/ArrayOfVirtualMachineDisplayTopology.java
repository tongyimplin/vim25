package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineDisplayTopology;
import com.vmware.vim25.VirtualMachineDisplayTopology;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineDisplayTopology", propOrder = {"virtualMachineDisplayTopology"})
public class ArrayOfVirtualMachineDisplayTopology {
  @XmlElement(name = "VirtualMachineDisplayTopology")
  protected List<VirtualMachineDisplayTopology> virtualMachineDisplayTopology;
  
  public List<VirtualMachineDisplayTopology> getVirtualMachineDisplayTopology() {
    if (this.virtualMachineDisplayTopology == null)
      this.virtualMachineDisplayTopology = new ArrayList<>(); 
    return this.virtualMachineDisplayTopology;
  }
}
