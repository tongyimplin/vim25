package com.vmware.vim25;

import com.vmware.vim25.VirtualDiskCompatibilityMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDiskCompatibilityMode")
@XmlEnum
public enum VirtualDiskCompatibilityMode {
  VIRTUAL_MODE("virtualMode"),
  PHYSICAL_MODE("physicalMode");
  
  private final String value;
  
  VirtualDiskCompatibilityMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDiskCompatibilityMode fromValue(String paramString) {
    for (VirtualDiskCompatibilityMode virtualDiskCompatibilityMode : values()) {
      if (virtualDiskCompatibilityMode.value.equals(paramString))
        return virtualDiskCompatibilityMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
