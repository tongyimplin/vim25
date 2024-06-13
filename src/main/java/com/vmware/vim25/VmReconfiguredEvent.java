package com.vmware.vim25;

import com.vmware.vim25.ChangesInfoEventArgument;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmReconfiguredEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReconfiguredEvent", propOrder = {"configSpec", "configChanges"})
public class VmReconfiguredEvent extends VmEvent {
  @XmlElement(required = true)
  protected VirtualMachineConfigSpec configSpec;
  
  protected ChangesInfoEventArgument configChanges;
  
  public VirtualMachineConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(VirtualMachineConfigSpec paramVirtualMachineConfigSpec) {
    this.configSpec = paramVirtualMachineConfigSpec;
  }
  
  public ChangesInfoEventArgument getConfigChanges() {
    return this.configChanges;
  }
  
  public void setConfigChanges(ChangesInfoEventArgument paramChangesInfoEventArgument) {
    this.configChanges = paramChangesInfoEventArgument;
  }
}
