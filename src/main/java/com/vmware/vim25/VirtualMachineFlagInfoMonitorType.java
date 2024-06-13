package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineFlagInfoMonitorType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineFlagInfoMonitorType")
@XmlEnum
public enum VirtualMachineFlagInfoMonitorType {
  RELEASE("release"),
  DEBUG("debug"),
  STATS("stats");
  
  private final String value;
  
  VirtualMachineFlagInfoMonitorType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineFlagInfoMonitorType fromValue(String paramString) {
    for (VirtualMachineFlagInfoMonitorType virtualMachineFlagInfoMonitorType : values()) {
      if (virtualMachineFlagInfoMonitorType.value.equals(paramString))
        return virtualMachineFlagInfoMonitorType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
