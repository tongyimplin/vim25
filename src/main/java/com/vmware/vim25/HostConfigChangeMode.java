package com.vmware.vim25;

import com.vmware.vim25.HostConfigChangeMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostConfigChangeMode")
@XmlEnum
public enum HostConfigChangeMode {
  MODIFY("modify"),
  REPLACE("replace");
  
  private final String value;
  
  HostConfigChangeMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostConfigChangeMode fromValue(String paramString) {
    for (HostConfigChangeMode hostConfigChangeMode : values()) {
      if (hostConfigChangeMode.value.equals(paramString))
        return hostConfigChangeMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
