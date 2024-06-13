package com.vmware.vim25;

import com.vmware.vim25.VirtualDiskAdapterType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDiskAdapterType")
@XmlEnum
public enum VirtualDiskAdapterType {
  IDE("ide"),
  BUS_LOGIC("busLogic"),
  LSI_LOGIC("lsiLogic");
  
  private final String value;
  
  VirtualDiskAdapterType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDiskAdapterType fromValue(String paramString) {
    for (VirtualDiskAdapterType virtualDiskAdapterType : values()) {
      if (virtualDiskAdapterType.value.equals(paramString))
        return virtualDiskAdapterType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
