package com.vmware.vim25;

import com.vmware.vim25.HostRdmaDeviceConnectionState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostRdmaDeviceConnectionState")
@XmlEnum
public enum HostRdmaDeviceConnectionState {
  UNKNOWN("unknown"),
  DOWN("down"),
  INIT("init"),
  ARMED("armed"),
  ACTIVE("active"),
  ACTIVE_DEFER("activeDefer");
  
  private final String value;
  
  HostRdmaDeviceConnectionState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostRdmaDeviceConnectionState fromValue(String paramString) {
    for (HostRdmaDeviceConnectionState hostRdmaDeviceConnectionState : values()) {
      if (hostRdmaDeviceConnectionState.value.equals(paramString))
        return hostRdmaDeviceConnectionState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
