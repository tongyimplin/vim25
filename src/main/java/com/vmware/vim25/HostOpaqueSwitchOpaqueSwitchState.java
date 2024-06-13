package com.vmware.vim25;

import com.vmware.vim25.HostOpaqueSwitchOpaqueSwitchState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostOpaqueSwitchOpaqueSwitchState")
@XmlEnum
public enum HostOpaqueSwitchOpaqueSwitchState {
  UP("up"),
  WARNING("warning"),
  DOWN("down"),
  MAINTENANCE("maintenance");
  
  private final String value;
  
  HostOpaqueSwitchOpaqueSwitchState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostOpaqueSwitchOpaqueSwitchState fromValue(String paramString) {
    for (HostOpaqueSwitchOpaqueSwitchState hostOpaqueSwitchOpaqueSwitchState : values()) {
      if (hostOpaqueSwitchOpaqueSwitchState.value.equals(paramString))
        return hostOpaqueSwitchOpaqueSwitchState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
