package com.vmware.vim25;

import com.vmware.vim25.MultipathState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "MultipathState")
@XmlEnum
public enum MultipathState {
  STANDBY("standby"),
  ACTIVE("active"),
  DISABLED("disabled"),
  DEAD("dead"),
  UNKNOWN("unknown");
  
  private final String value;
  
  MultipathState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static MultipathState fromValue(String paramString) {
    for (MultipathState multipathState : values()) {
      if (multipathState.value.equals(paramString))
        return multipathState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
