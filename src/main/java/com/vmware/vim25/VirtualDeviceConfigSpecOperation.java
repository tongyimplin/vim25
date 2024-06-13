package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceConfigSpecOperation;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDeviceConfigSpecOperation")
@XmlEnum
public enum VirtualDeviceConfigSpecOperation {
  ADD("add"),
  REMOVE("remove"),
  EDIT("edit");
  
  private final String value;
  
  VirtualDeviceConfigSpecOperation(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDeviceConfigSpecOperation fromValue(String paramString) {
    for (VirtualDeviceConfigSpecOperation virtualDeviceConfigSpecOperation : values()) {
      if (virtualDeviceConfigSpecOperation.value.equals(paramString))
        return virtualDeviceConfigSpecOperation; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
