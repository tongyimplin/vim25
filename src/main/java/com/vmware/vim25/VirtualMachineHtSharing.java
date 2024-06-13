package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineHtSharing;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineHtSharing")
@XmlEnum
public enum VirtualMachineHtSharing {
  ANY("any"),
  NONE("none"),
  INTERNAL("internal");
  
  private final String value;
  
  VirtualMachineHtSharing(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineHtSharing fromValue(String paramString) {
    for (VirtualMachineHtSharing virtualMachineHtSharing : values()) {
      if (virtualMachineHtSharing.value.equals(paramString))
        return virtualMachineHtSharing; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
