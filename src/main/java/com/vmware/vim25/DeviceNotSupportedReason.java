package com.vmware.vim25;

import com.vmware.vim25.DeviceNotSupportedReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DeviceNotSupportedReason")
@XmlEnum
public enum DeviceNotSupportedReason {
  HOST("host"),
  GUEST("guest");
  
  private final String value;
  
  DeviceNotSupportedReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DeviceNotSupportedReason fromValue(String paramString) {
    for (DeviceNotSupportedReason deviceNotSupportedReason : values()) {
      if (deviceNotSupportedReason.value.equals(paramString))
        return deviceNotSupportedReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
