package com.vmware.vim25;

import com.vmware.vim25.HostStandbyMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostStandbyMode")
@XmlEnum
public enum HostStandbyMode {
  ENTERING("entering"),
  EXITING("exiting"),
  IN("in"),
  NONE("none");
  
  private final String value;
  
  HostStandbyMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostStandbyMode fromValue(String paramString) {
    for (HostStandbyMode hostStandbyMode : values()) {
      if (hostStandbyMode.value.equals(paramString))
        return hostStandbyMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
