package com.vmware.vim25;

import com.vmware.vim25.InvalidPowerState;
import com.vmware.vim25.InvalidState;
import com.vmware.vim25.VirtualMachinePowerState;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidPowerState", propOrder = {"requestedState", "existingState"})
public class InvalidPowerState extends InvalidState {
  protected VirtualMachinePowerState requestedState;
  
  @XmlElement(required = true)
  protected VirtualMachinePowerState existingState;
  
  public VirtualMachinePowerState getRequestedState() {
    return this.requestedState;
  }
  
  public void setRequestedState(VirtualMachinePowerState paramVirtualMachinePowerState) {
    this.requestedState = paramVirtualMachinePowerState;
  }
  
  public VirtualMachinePowerState getExistingState() {
    return this.existingState;
  }
  
  public void setExistingState(VirtualMachinePowerState paramVirtualMachinePowerState) {
    this.existingState = paramVirtualMachinePowerState;
  }
}
