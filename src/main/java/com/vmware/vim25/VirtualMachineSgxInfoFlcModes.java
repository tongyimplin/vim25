package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineSgxInfoFlcModes;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineSgxInfoFlcModes")
@XmlEnum
public enum VirtualMachineSgxInfoFlcModes {
  LOCKED("locked"),
  UNLOCKED("unlocked");
  
  private final String value;
  
  VirtualMachineSgxInfoFlcModes(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineSgxInfoFlcModes fromValue(String paramString) {
    for (VirtualMachineSgxInfoFlcModes virtualMachineSgxInfoFlcModes : values()) {
      if (virtualMachineSgxInfoFlcModes.value.equals(paramString))
        return virtualMachineSgxInfoFlcModes; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
