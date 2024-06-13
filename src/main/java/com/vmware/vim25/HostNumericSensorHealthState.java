package com.vmware.vim25;

import com.vmware.vim25.HostNumericSensorHealthState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostNumericSensorHealthState")
@XmlEnum
public enum HostNumericSensorHealthState {
  UNKNOWN("unknown"),
  GREEN("green"),
  YELLOW("yellow"),
  RED("red");
  
  private final String value;
  
  HostNumericSensorHealthState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostNumericSensorHealthState fromValue(String paramString) {
    for (HostNumericSensorHealthState hostNumericSensorHealthState : values()) {
      if (hostNumericSensorHealthState.value.equals(paramString))
        return hostNumericSensorHealthState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
