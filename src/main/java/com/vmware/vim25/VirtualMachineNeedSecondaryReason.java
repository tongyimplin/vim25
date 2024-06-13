package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineNeedSecondaryReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineNeedSecondaryReason")
@XmlEnum
public enum VirtualMachineNeedSecondaryReason {
  INITIALIZING("initializing"),
  DIVERGENCE("divergence"),
  LOST_CONNECTION("lostConnection"),
  PARTIAL_HARDWARE_FAILURE("partialHardwareFailure"),
  USER_ACTION("userAction"),
  CHECKPOINT_ERROR("checkpointError"),
  OTHER("other");
  
  private final String value;
  
  VirtualMachineNeedSecondaryReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineNeedSecondaryReason fromValue(String paramString) {
    for (VirtualMachineNeedSecondaryReason virtualMachineNeedSecondaryReason : values()) {
      if (virtualMachineNeedSecondaryReason.value.equals(paramString))
        return virtualMachineNeedSecondaryReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
