package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineConfigInfoNpivWwnType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineConfigInfoNpivWwnType")
@XmlEnum
public enum VirtualMachineConfigInfoNpivWwnType {
  VC("vc"),
  HOST("host"),
  EXTERNAL("external");
  
  private final String value;
  
  VirtualMachineConfigInfoNpivWwnType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineConfigInfoNpivWwnType fromValue(String paramString) {
    for (VirtualMachineConfigInfoNpivWwnType virtualMachineConfigInfoNpivWwnType : values()) {
      if (virtualMachineConfigInfoNpivWwnType.value.equals(paramString))
        return virtualMachineConfigInfoNpivWwnType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
