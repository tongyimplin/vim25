package com.vmware.vim25;

import com.vmware.vim25.VAppAutoStartAction;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VAppAutoStartAction")
@XmlEnum
public enum VAppAutoStartAction {
  NONE("none"),
  POWER_ON("powerOn"),
  POWER_OFF("powerOff"),
  GUEST_SHUTDOWN("guestShutdown"),
  SUSPEND("suspend");
  
  private final String value;
  
  VAppAutoStartAction(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VAppAutoStartAction fromValue(String paramString) {
    for (VAppAutoStartAction vAppAutoStartAction : values()) {
      if (vAppAutoStartAction.value.equals(paramString))
        return vAppAutoStartAction; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
