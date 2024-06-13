package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineTargetInfoConfigurationTag;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineTargetInfoConfigurationTag")
@XmlEnum
public enum VirtualMachineTargetInfoConfigurationTag {
  COMPLIANT("compliant"),
  CLUSTER_WIDE("clusterWide");
  
  private final String value;
  
  VirtualMachineTargetInfoConfigurationTag(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineTargetInfoConfigurationTag fromValue(String paramString) {
    for (VirtualMachineTargetInfoConfigurationTag virtualMachineTargetInfoConfigurationTag : values()) {
      if (virtualMachineTargetInfoConfigurationTag.value.equals(paramString))
        return virtualMachineTargetInfoConfigurationTag; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
