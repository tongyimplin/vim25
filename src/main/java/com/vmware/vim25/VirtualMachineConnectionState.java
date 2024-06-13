package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineConnectionState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineConnectionState")
@XmlEnum
public enum VirtualMachineConnectionState {
  CONNECTED("connected"),
  DISCONNECTED("disconnected"),
  ORPHANED("orphaned"),
  INACCESSIBLE("inaccessible"),
  INVALID("invalid");
  
  private final String value;
  
  VirtualMachineConnectionState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineConnectionState fromValue(String paramString) {
    for (VirtualMachineConnectionState virtualMachineConnectionState : values()) {
      if (virtualMachineConnectionState.value.equals(paramString))
        return virtualMachineConnectionState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
