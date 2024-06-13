package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineFaultToleranceState;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmFaultToleranceStateChangedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceStateChangedEvent", propOrder = {"oldState", "newState"})
public class VmFaultToleranceStateChangedEvent extends VmEvent {
  @XmlElement(required = true)
  protected VirtualMachineFaultToleranceState oldState;
  
  @XmlElement(required = true)
  protected VirtualMachineFaultToleranceState newState;
  
  public VirtualMachineFaultToleranceState getOldState() {
    return this.oldState;
  }
  
  public void setOldState(VirtualMachineFaultToleranceState paramVirtualMachineFaultToleranceState) {
    this.oldState = paramVirtualMachineFaultToleranceState;
  }
  
  public VirtualMachineFaultToleranceState getNewState() {
    return this.newState;
  }
  
  public void setNewState(VirtualMachineFaultToleranceState paramVirtualMachineFaultToleranceState) {
    this.newState = paramVirtualMachineFaultToleranceState;
  }
}
