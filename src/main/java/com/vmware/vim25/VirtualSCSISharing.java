package com.vmware.vim25;

import com.vmware.vim25.VirtualSCSISharing;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualSCSISharing")
@XmlEnum
public enum VirtualSCSISharing {
  NO_SHARING("noSharing"),
  VIRTUAL_SHARING("virtualSharing"),
  PHYSICAL_SHARING("physicalSharing");
  
  private final String value;
  
  VirtualSCSISharing(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualSCSISharing fromValue(String paramString) {
    for (VirtualSCSISharing virtualSCSISharing : values()) {
      if (virtualSCSISharing.value.equals(paramString))
        return virtualSCSISharing; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
