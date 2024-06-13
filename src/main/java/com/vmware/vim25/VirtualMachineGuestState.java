package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineGuestState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineGuestState")
@XmlEnum
public enum VirtualMachineGuestState {
  RUNNING("running"),
  SHUTTING_DOWN("shuttingDown"),
  RESETTING("resetting"),
  STANDBY("standby"),
  NOT_RUNNING("notRunning"),
  UNKNOWN("unknown");
  
  private final String value;
  
  VirtualMachineGuestState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineGuestState fromValue(String paramString) {
    for (VirtualMachineGuestState virtualMachineGuestState : values()) {
      if (virtualMachineGuestState.value.equals(paramString))
        return virtualMachineGuestState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
