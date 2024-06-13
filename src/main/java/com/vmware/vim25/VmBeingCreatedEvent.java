package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VmBeingCreatedEvent;
import com.vmware.vim25.VmEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmBeingCreatedEvent", propOrder = {"configSpec"})
public class VmBeingCreatedEvent extends VmEvent {
  protected VirtualMachineConfigSpec configSpec;
  
  public VirtualMachineConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(VirtualMachineConfigSpec paramVirtualMachineConfigSpec) {
    this.configSpec = paramVirtualMachineConfigSpec;
  }
}
