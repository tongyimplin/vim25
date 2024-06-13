package com.vmware.vim25;

import com.vmware.vim25.VirtualMachinePowerOffBehavior;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachinePowerOffBehavior")
@XmlEnum
public enum VirtualMachinePowerOffBehavior {
  POWER_OFF("powerOff"),
  REVERT("revert"),
  PROMPT("prompt"),
  TAKE("take");
  
  private final String value;
  
  VirtualMachinePowerOffBehavior(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachinePowerOffBehavior fromValue(String paramString) {
    for (VirtualMachinePowerOffBehavior virtualMachinePowerOffBehavior : values()) {
      if (virtualMachinePowerOffBehavior.value.equals(paramString))
        return virtualMachinePowerOffBehavior; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
