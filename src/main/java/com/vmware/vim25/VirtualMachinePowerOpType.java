package com.vmware.vim25;

import com.vmware.vim25.VirtualMachinePowerOpType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachinePowerOpType")
@XmlEnum
public enum VirtualMachinePowerOpType {
  SOFT("soft"),
  HARD("hard"),
  PRESET("preset");
  
  private final String value;
  
  VirtualMachinePowerOpType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachinePowerOpType fromValue(String paramString) {
    for (VirtualMachinePowerOpType virtualMachinePowerOpType : values()) {
      if (virtualMachinePowerOpType.value.equals(paramString))
        return virtualMachinePowerOpType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
