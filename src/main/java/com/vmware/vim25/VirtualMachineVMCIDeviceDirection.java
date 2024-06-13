package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineVMCIDeviceDirection;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineVMCIDeviceDirection")
@XmlEnum
public enum VirtualMachineVMCIDeviceDirection {
  GUEST("guest"),
  HOST("host"),
  ANY_DIRECTION("anyDirection");
  
  private final String value;
  
  VirtualMachineVMCIDeviceDirection(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineVMCIDeviceDirection fromValue(String paramString) {
    for (VirtualMachineVMCIDeviceDirection virtualMachineVMCIDeviceDirection : values()) {
      if (virtualMachineVMCIDeviceDirection.value.equals(paramString))
        return virtualMachineVMCIDeviceDirection; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
