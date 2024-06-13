package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineConfigSpec", propOrder = {"virtualMachineConfigSpec"})
public class ArrayOfVirtualMachineConfigSpec {
  @XmlElement(name = "VirtualMachineConfigSpec")
  protected List<VirtualMachineConfigSpec> virtualMachineConfigSpec;
  
  public List<VirtualMachineConfigSpec> getVirtualMachineConfigSpec() {
    if (this.virtualMachineConfigSpec == null)
      this.virtualMachineConfigSpec = new ArrayList<>(); 
    return this.virtualMachineConfigSpec;
  }
}
