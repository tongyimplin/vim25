package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineToolsRunningStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineToolsRunningStatus")
@XmlEnum
public enum VirtualMachineToolsRunningStatus {
  GUEST_TOOLS_NOT_RUNNING("guestToolsNotRunning"),
  GUEST_TOOLS_RUNNING("guestToolsRunning"),
  GUEST_TOOLS_EXECUTING_SCRIPTS("guestToolsExecutingScripts");
  
  private final String value;
  
  VirtualMachineToolsRunningStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineToolsRunningStatus fromValue(String paramString) {
    for (VirtualMachineToolsRunningStatus virtualMachineToolsRunningStatus : values()) {
      if (virtualMachineToolsRunningStatus.value.equals(paramString))
        return virtualMachineToolsRunningStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
