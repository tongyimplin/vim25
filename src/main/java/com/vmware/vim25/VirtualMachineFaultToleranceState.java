package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineFaultToleranceState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineFaultToleranceState")
@XmlEnum
public enum VirtualMachineFaultToleranceState {
  NOT_CONFIGURED("notConfigured"),
  DISABLED("disabled"),
  ENABLED("enabled"),
  NEED_SECONDARY("needSecondary"),
  STARTING("starting"),
  RUNNING("running");
  
  private final String value;
  
  VirtualMachineFaultToleranceState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineFaultToleranceState fromValue(String paramString) {
    for (VirtualMachineFaultToleranceState virtualMachineFaultToleranceState : values()) {
      if (virtualMachineFaultToleranceState.value.equals(paramString))
        return virtualMachineFaultToleranceState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
