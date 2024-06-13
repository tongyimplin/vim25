package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineRecordReplayState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineRecordReplayState")
@XmlEnum
public enum VirtualMachineRecordReplayState {
  RECORDING("recording"),
  REPLAYING("replaying"),
  INACTIVE("inactive");
  
  private final String value;
  
  VirtualMachineRecordReplayState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineRecordReplayState fromValue(String paramString) {
    for (VirtualMachineRecordReplayState virtualMachineRecordReplayState : values()) {
      if (virtualMachineRecordReplayState.value.equals(paramString))
        return virtualMachineRecordReplayState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
