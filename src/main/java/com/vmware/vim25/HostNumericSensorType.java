package com.vmware.vim25;

import com.vmware.vim25.HostNumericSensorType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostNumericSensorType")
@XmlEnum
public enum HostNumericSensorType {
  FAN("fan"),
  POWER("power"),
  TEMPERATURE("temperature"),
  VOLTAGE("voltage"),
  OTHER("other"),
  PROCESSOR("processor"),
  MEMORY("memory"),
  STORAGE("storage"),
  SYSTEM_BOARD("systemBoard"),
  BATTERY("battery"),
  BIOS("bios"),
  CABLE("cable"),
  WATCHDOG("watchdog");
  
  private final String value;
  
  HostNumericSensorType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostNumericSensorType fromValue(String paramString) {
    for (HostNumericSensorType hostNumericSensorType : values()) {
      if (hostNumericSensorType.value.equals(paramString))
        return hostNumericSensorType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
