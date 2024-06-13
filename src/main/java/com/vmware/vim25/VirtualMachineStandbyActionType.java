package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineStandbyActionType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineStandbyActionType")
@XmlEnum
public enum VirtualMachineStandbyActionType {
  CHECKPOINT("checkpoint"),
  POWER_ON_SUSPEND("powerOnSuspend");
  
  private final String value;
  
  VirtualMachineStandbyActionType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineStandbyActionType fromValue(String paramString) {
    for (VirtualMachineStandbyActionType virtualMachineStandbyActionType : values()) {
      if (virtualMachineStandbyActionType.value.equals(paramString))
        return virtualMachineStandbyActionType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
