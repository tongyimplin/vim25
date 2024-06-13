package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineVMCIDeviceAction;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineVMCIDeviceAction")
@XmlEnum
public enum VirtualMachineVMCIDeviceAction {
  ALLOW("allow"),
  DENY("deny");
  
  private final String value;
  
  VirtualMachineVMCIDeviceAction(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineVMCIDeviceAction fromValue(String paramString) {
    for (VirtualMachineVMCIDeviceAction virtualMachineVMCIDeviceAction : values()) {
      if (virtualMachineVMCIDeviceAction.value.equals(paramString))
        return virtualMachineVMCIDeviceAction; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
