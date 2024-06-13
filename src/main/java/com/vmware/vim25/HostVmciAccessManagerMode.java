package com.vmware.vim25;

import com.vmware.vim25.HostVmciAccessManagerMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostVmciAccessManagerMode")
@XmlEnum
public enum HostVmciAccessManagerMode {
  GRANT("grant"),
  REPLACE("replace"),
  REVOKE("revoke");
  
  private final String value;
  
  HostVmciAccessManagerMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostVmciAccessManagerMode fromValue(String paramString) {
    for (HostVmciAccessManagerMode hostVmciAccessManagerMode : values()) {
      if (hostVmciAccessManagerMode.value.equals(paramString))
        return hostVmciAccessManagerMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
