package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineAppHeartbeatStatusType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineAppHeartbeatStatusType")
@XmlEnum
public enum VirtualMachineAppHeartbeatStatusType {
  APP_STATUS_GRAY("appStatusGray"),
  APP_STATUS_GREEN("appStatusGreen"),
  APP_STATUS_RED("appStatusRed");
  
  private final String value;
  
  VirtualMachineAppHeartbeatStatusType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineAppHeartbeatStatusType fromValue(String paramString) {
    for (VirtualMachineAppHeartbeatStatusType virtualMachineAppHeartbeatStatusType : values()) {
      if (virtualMachineAppHeartbeatStatusType.value.equals(paramString))
        return virtualMachineAppHeartbeatStatusType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
