package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineForkConfigInfoChildType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineForkConfigInfoChildType")
@XmlEnum
public enum VirtualMachineForkConfigInfoChildType {
  NONE("none"),
  PERSISTENT("persistent"),
  NONPERSISTENT("nonpersistent");
  
  private final String value;
  
  VirtualMachineForkConfigInfoChildType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineForkConfigInfoChildType fromValue(String paramString) {
    for (VirtualMachineForkConfigInfoChildType virtualMachineForkConfigInfoChildType : values()) {
      if (virtualMachineForkConfigInfoChildType.value.equals(paramString))
        return virtualMachineForkConfigInfoChildType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
