package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceConfigSpecFileOperation;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDeviceConfigSpecFileOperation")
@XmlEnum
public enum VirtualDeviceConfigSpecFileOperation {
  CREATE("create"),
  DESTROY("destroy"),
  REPLACE("replace");
  
  private final String value;
  
  VirtualDeviceConfigSpecFileOperation(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDeviceConfigSpecFileOperation fromValue(String paramString) {
    for (VirtualDeviceConfigSpecFileOperation virtualDeviceConfigSpecFileOperation : values()) {
      if (virtualDeviceConfigSpecFileOperation.value.equals(paramString))
        return virtualDeviceConfigSpecFileOperation; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
