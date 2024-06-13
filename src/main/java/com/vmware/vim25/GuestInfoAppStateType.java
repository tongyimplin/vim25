package com.vmware.vim25;

import com.vmware.vim25.GuestInfoAppStateType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "GuestInfoAppStateType")
@XmlEnum
public enum GuestInfoAppStateType {
  NONE("none"),
  APP_STATE_OK("appStateOk"),
  APP_STATE_NEED_RESET("appStateNeedReset");
  
  private final String value;
  
  GuestInfoAppStateType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static GuestInfoAppStateType fromValue(String paramString) {
    for (GuestInfoAppStateType guestInfoAppStateType : values()) {
      if (guestInfoAppStateType.value.equals(paramString))
        return guestInfoAppStateType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
