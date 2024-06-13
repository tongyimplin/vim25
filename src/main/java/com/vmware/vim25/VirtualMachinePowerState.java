package com.vmware.vim25;

import com.vmware.vim25.VirtualMachinePowerState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachinePowerState")
@XmlEnum
public enum VirtualMachinePowerState {
  POWERED_OFF("poweredOff"),
  POWERED_ON("poweredOn"),
  SUSPENDED("suspended");
  
  private final String value;
  
  VirtualMachinePowerState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachinePowerState fromValue(String paramString) {
    for (VirtualMachinePowerState virtualMachinePowerState : values()) {
      if (virtualMachinePowerState.value.equals(paramString))
        return virtualMachinePowerState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
