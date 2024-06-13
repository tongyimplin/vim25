package com.vmware.vim25;

import com.vmware.vim25.VchaNodeState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VchaNodeState")
@XmlEnum
public enum VchaNodeState {
  UP("up"),
  DOWN("down");
  
  private final String value;
  
  VchaNodeState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VchaNodeState fromValue(String paramString) {
    for (VchaNodeState vchaNodeState : values()) {
      if (vchaNodeState.value.equals(paramString))
        return vchaNodeState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
