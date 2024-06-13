package com.vmware.vim25;

import com.vmware.vim25.HostRuntimeInfoNetStackInstanceRuntimeInfoState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostRuntimeInfoNetStackInstanceRuntimeInfoState")
@XmlEnum
public enum HostRuntimeInfoNetStackInstanceRuntimeInfoState {
  INACTIVE("inactive"),
  ACTIVE("active"),
  DEACTIVATING("deactivating"),
  ACTIVATING("activating");
  
  private final String value;
  
  HostRuntimeInfoNetStackInstanceRuntimeInfoState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostRuntimeInfoNetStackInstanceRuntimeInfoState fromValue(String paramString) {
    for (HostRuntimeInfoNetStackInstanceRuntimeInfoState hostRuntimeInfoNetStackInstanceRuntimeInfoState : values()) {
      if (hostRuntimeInfoNetStackInstanceRuntimeInfoState.value.equals(paramString))
        return hostRuntimeInfoNetStackInstanceRuntimeInfoState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
