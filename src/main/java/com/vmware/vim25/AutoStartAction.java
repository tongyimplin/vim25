package com.vmware.vim25;

import com.vmware.vim25.AutoStartAction;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AutoStartAction")
@XmlEnum
public enum AutoStartAction {
  NONE("none"),
  SYSTEM_DEFAULT("systemDefault"),
  POWER_ON("powerOn"),
  POWER_OFF("powerOff"),
  GUEST_SHUTDOWN("guestShutdown"),
  SUSPEND("suspend");
  
  private final String value;
  
  AutoStartAction(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static AutoStartAction fromValue(String paramString) {
    for (AutoStartAction autoStartAction : values()) {
      if (autoStartAction.value.equals(paramString))
        return autoStartAction; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
