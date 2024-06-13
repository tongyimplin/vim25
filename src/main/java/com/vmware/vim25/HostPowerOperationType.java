package com.vmware.vim25;

import com.vmware.vim25.HostPowerOperationType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostPowerOperationType")
@XmlEnum
public enum HostPowerOperationType {
  POWER_ON("powerOn"),
  POWER_OFF("powerOff");
  
  private final String value;
  
  HostPowerOperationType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostPowerOperationType fromValue(String paramString) {
    for (HostPowerOperationType hostPowerOperationType : values()) {
      if (hostPowerOperationType.value.equals(paramString))
        return hostPowerOperationType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
