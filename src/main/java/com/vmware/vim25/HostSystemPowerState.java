package com.vmware.vim25;

import com.vmware.vim25.HostSystemPowerState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostSystemPowerState")
@XmlEnum
public enum HostSystemPowerState {
  POWERED_ON("poweredOn"),
  POWERED_OFF("poweredOff"),
  STAND_BY("standBy"),
  UNKNOWN("unknown");
  
  private final String value;
  
  HostSystemPowerState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostSystemPowerState fromValue(String paramString) {
    for (HostSystemPowerState hostSystemPowerState : values()) {
      if (hostSystemPowerState.value.equals(paramString))
        return hostSystemPowerState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
