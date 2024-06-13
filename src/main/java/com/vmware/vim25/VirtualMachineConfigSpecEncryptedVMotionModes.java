package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineConfigSpecEncryptedVMotionModes;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineConfigSpecEncryptedVMotionModes")
@XmlEnum
public enum VirtualMachineConfigSpecEncryptedVMotionModes {
  DISABLED("disabled"),
  OPPORTUNISTIC("opportunistic"),
  REQUIRED("required");
  
  private final String value;
  
  VirtualMachineConfigSpecEncryptedVMotionModes(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineConfigSpecEncryptedVMotionModes fromValue(String paramString) {
    for (VirtualMachineConfigSpecEncryptedVMotionModes virtualMachineConfigSpecEncryptedVMotionModes : values()) {
      if (virtualMachineConfigSpecEncryptedVMotionModes.value.equals(paramString))
        return virtualMachineConfigSpecEncryptedVMotionModes; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
