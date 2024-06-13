package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineProfileSpec;
import com.vmware.vim25.VirtualMachineProfileSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineProfileSpec", propOrder = {"virtualMachineProfileSpec"})
public class ArrayOfVirtualMachineProfileSpec {
  @XmlElement(name = "VirtualMachineProfileSpec")
  protected List<VirtualMachineProfileSpec> virtualMachineProfileSpec;
  
  public List<VirtualMachineProfileSpec> getVirtualMachineProfileSpec() {
    if (this.virtualMachineProfileSpec == null)
      this.virtualMachineProfileSpec = new ArrayList<>(); 
    return this.virtualMachineProfileSpec;
  }
}
