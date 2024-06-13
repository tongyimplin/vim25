package com.vmware.vim25;

import com.vmware.vim25.HostHardwareElementStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostHardwareElementStatus")
@XmlEnum
public enum HostHardwareElementStatus {
  UNKNOWN("Unknown"),
  GREEN("Green"),
  YELLOW("Yellow"),
  RED("Red");
  
  private final String value;
  
  HostHardwareElementStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostHardwareElementStatus fromValue(String paramString) {
    for (HostHardwareElementStatus hostHardwareElementStatus : values()) {
      if (hostHardwareElementStatus.value.equals(paramString))
        return hostHardwareElementStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
