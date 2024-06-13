package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineConfigOptionDescriptor;
import com.vmware.vim25.VirtualMachineConfigOptionDescriptor;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineConfigOptionDescriptor", propOrder = {"virtualMachineConfigOptionDescriptor"})
public class ArrayOfVirtualMachineConfigOptionDescriptor {
  @XmlElement(name = "VirtualMachineConfigOptionDescriptor")
  protected List<VirtualMachineConfigOptionDescriptor> virtualMachineConfigOptionDescriptor;
  
  public List<VirtualMachineConfigOptionDescriptor> getVirtualMachineConfigOptionDescriptor() {
    if (this.virtualMachineConfigOptionDescriptor == null)
      this.virtualMachineConfigOptionDescriptor = new ArrayList<>(); 
    return this.virtualMachineConfigOptionDescriptor;
  }
}
