package com.vmware.vim25;

import com.vmware.vim25.VchaState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VchaState")
@XmlEnum
public enum VchaState {
  CONFIGURED("configured"),
  NOT_CONFIGURED("notConfigured"),
  INVALID("invalid"),
  PREPARED("prepared");
  
  private final String value;
  
  VchaState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VchaState fromValue(String paramString) {
    for (VchaState vchaState : values()) {
      if (vchaState.value.equals(paramString))
        return vchaState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
