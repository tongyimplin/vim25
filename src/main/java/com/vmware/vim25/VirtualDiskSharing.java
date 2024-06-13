package com.vmware.vim25;

import com.vmware.vim25.VirtualDiskSharing;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDiskSharing")
@XmlEnum
public enum VirtualDiskSharing {
  SHARING_NONE("sharingNone"),
  SHARING_MULTI_WRITER("sharingMultiWriter");
  
  private final String value;
  
  VirtualDiskSharing(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDiskSharing fromValue(String paramString) {
    for (VirtualDiskSharing virtualDiskSharing : values()) {
      if (virtualDiskSharing.value.equals(paramString))
        return virtualDiskSharing; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
