package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceURIBackingOptionDirection;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDeviceURIBackingOptionDirection")
@XmlEnum
public enum VirtualDeviceURIBackingOptionDirection {
  SERVER("server"),
  CLIENT("client");
  
  private final String value;
  
  VirtualDeviceURIBackingOptionDirection(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDeviceURIBackingOptionDirection fromValue(String paramString) {
    for (VirtualDeviceURIBackingOptionDirection virtualDeviceURIBackingOptionDirection : values()) {
      if (virtualDeviceURIBackingOptionDirection.value.equals(paramString))
        return virtualDeviceURIBackingOptionDirection; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
