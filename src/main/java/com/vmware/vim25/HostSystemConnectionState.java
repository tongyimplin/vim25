package com.vmware.vim25;

import com.vmware.vim25.HostSystemConnectionState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostSystemConnectionState")
@XmlEnum
public enum HostSystemConnectionState {
  CONNECTED("connected"),
  NOT_RESPONDING("notResponding"),
  DISCONNECTED("disconnected");
  
  private final String value;
  
  HostSystemConnectionState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostSystemConnectionState fromValue(String paramString) {
    for (HostSystemConnectionState hostSystemConnectionState : values()) {
      if (hostSystemConnectionState.value.equals(paramString))
        return hostSystemConnectionState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
