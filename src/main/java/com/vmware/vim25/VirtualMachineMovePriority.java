package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineMovePriority;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineMovePriority")
@XmlEnum
public enum VirtualMachineMovePriority {
  LOW_PRIORITY("lowPriority"),
  HIGH_PRIORITY("highPriority"),
  DEFAULT_PRIORITY("defaultPriority");
  
  private final String value;
  
  VirtualMachineMovePriority(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineMovePriority fromValue(String paramString) {
    for (VirtualMachineMovePriority virtualMachineMovePriority : values()) {
      if (virtualMachineMovePriority.value.equals(paramString))
        return virtualMachineMovePriority; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
