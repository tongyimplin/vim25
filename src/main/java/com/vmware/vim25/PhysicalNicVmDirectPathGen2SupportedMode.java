package com.vmware.vim25;

import com.vmware.vim25.PhysicalNicVmDirectPathGen2SupportedMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PhysicalNicVmDirectPathGen2SupportedMode")
@XmlEnum
public enum PhysicalNicVmDirectPathGen2SupportedMode {
  UPT("upt");
  
  private final String value;
  
  PhysicalNicVmDirectPathGen2SupportedMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static PhysicalNicVmDirectPathGen2SupportedMode fromValue(String paramString) {
    for (PhysicalNicVmDirectPathGen2SupportedMode physicalNicVmDirectPathGen2SupportedMode : values()) {
      if (physicalNicVmDirectPathGen2SupportedMode.value.equals(paramString))
        return physicalNicVmDirectPathGen2SupportedMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
