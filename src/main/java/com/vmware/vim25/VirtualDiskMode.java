package com.vmware.vim25;

import com.vmware.vim25.VirtualDiskMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDiskMode")
@XmlEnum
public enum VirtualDiskMode {
  PERSISTENT("persistent"),
  NONPERSISTENT("nonpersistent"),
  UNDOABLE("undoable"),
  INDEPENDENT_PERSISTENT("independent_persistent"),
  INDEPENDENT_NONPERSISTENT("independent_nonpersistent"),
  APPEND("append");
  
  private final String value;
  
  VirtualDiskMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDiskMode fromValue(String paramString) {
    for (VirtualDiskMode virtualDiskMode : values()) {
      if (virtualDiskMode.value.equals(paramString))
        return virtualDiskMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
