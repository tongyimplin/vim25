package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineToolsStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineToolsStatus")
@XmlEnum
public enum VirtualMachineToolsStatus {
  TOOLS_NOT_INSTALLED("toolsNotInstalled"),
  TOOLS_NOT_RUNNING("toolsNotRunning"),
  TOOLS_OLD("toolsOld"),
  TOOLS_OK("toolsOk");
  
  private final String value;
  
  VirtualMachineToolsStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineToolsStatus fromValue(String paramString) {
    for (VirtualMachineToolsStatus virtualMachineToolsStatus : values()) {
      if (virtualMachineToolsStatus.value.equals(paramString))
        return virtualMachineToolsStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
