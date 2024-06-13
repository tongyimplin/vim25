package com.vmware.vim25;

import com.vmware.vim25.HostAccessMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostAccessMode")
@XmlEnum
public enum HostAccessMode {
  ACCESS_NONE("accessNone"),
  ACCESS_ADMIN("accessAdmin"),
  ACCESS_NO_ACCESS("accessNoAccess"),
  ACCESS_READ_ONLY("accessReadOnly"),
  ACCESS_OTHER("accessOther");
  
  private final String value;
  
  HostAccessMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostAccessMode fromValue(String paramString) {
    for (HostAccessMode hostAccessMode : values()) {
      if (hostAccessMode.value.equals(paramString))
        return hostAccessMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
