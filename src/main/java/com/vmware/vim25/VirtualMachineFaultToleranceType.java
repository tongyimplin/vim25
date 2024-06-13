package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineFaultToleranceType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineFaultToleranceType")
@XmlEnum
public enum VirtualMachineFaultToleranceType {
  UNSET("unset"),
  RECORD_REPLAY("recordReplay"),
  CHECKPOINTING("checkpointing");
  
  private final String value;
  
  VirtualMachineFaultToleranceType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineFaultToleranceType fromValue(String paramString) {
    for (VirtualMachineFaultToleranceType virtualMachineFaultToleranceType : values()) {
      if (virtualMachineFaultToleranceType.value.equals(paramString))
        return virtualMachineFaultToleranceType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
