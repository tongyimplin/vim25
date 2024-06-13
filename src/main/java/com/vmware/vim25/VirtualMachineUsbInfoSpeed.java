package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineUsbInfoSpeed;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineUsbInfoSpeed")
@XmlEnum
public enum VirtualMachineUsbInfoSpeed {
  LOW("low"),
  FULL("full"),
  HIGH("high"),
  SUPER_SPEED("superSpeed"),
  SUPER_SPEED_PLUS("superSpeedPlus"),
  UNKNOWN_SPEED("unknownSpeed");
  
  private final String value;
  
  VirtualMachineUsbInfoSpeed(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineUsbInfoSpeed fromValue(String paramString) {
    for (VirtualMachineUsbInfoSpeed virtualMachineUsbInfoSpeed : values()) {
      if (virtualMachineUsbInfoSpeed.value.equals(paramString))
        return virtualMachineUsbInfoSpeed; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
