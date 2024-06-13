package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineFlagInfoVirtualMmuUsage;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineFlagInfoVirtualMmuUsage")
@XmlEnum
public enum VirtualMachineFlagInfoVirtualMmuUsage {
  AUTOMATIC("automatic"),
  ON("on"),
  OFF("off");
  
  private final String value;
  
  VirtualMachineFlagInfoVirtualMmuUsage(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineFlagInfoVirtualMmuUsage fromValue(String paramString) {
    for (VirtualMachineFlagInfoVirtualMmuUsage virtualMachineFlagInfoVirtualMmuUsage : values()) {
      if (virtualMachineFlagInfoVirtualMmuUsage.value.equals(paramString))
        return virtualMachineFlagInfoVirtualMmuUsage; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
