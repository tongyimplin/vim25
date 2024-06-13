package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineFlagInfoVirtualExecUsage;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineFlagInfoVirtualExecUsage")
@XmlEnum
public enum VirtualMachineFlagInfoVirtualExecUsage {
  HV_AUTO("hvAuto"),
  HV_ON("hvOn"),
  HV_OFF("hvOff");
  
  private final String value;
  
  VirtualMachineFlagInfoVirtualExecUsage(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineFlagInfoVirtualExecUsage fromValue(String paramString) {
    for (VirtualMachineFlagInfoVirtualExecUsage virtualMachineFlagInfoVirtualExecUsage : values()) {
      if (virtualMachineFlagInfoVirtualExecUsage.value.equals(paramString))
        return virtualMachineFlagInfoVirtualExecUsage; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
