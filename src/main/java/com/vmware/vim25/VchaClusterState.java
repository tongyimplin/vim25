package com.vmware.vim25;

import com.vmware.vim25.VchaClusterState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VchaClusterState")
@XmlEnum
public enum VchaClusterState {
  HEALTHY("healthy"),
  DEGRADED("degraded"),
  ISOLATED("isolated");
  
  private final String value;
  
  VchaClusterState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VchaClusterState fromValue(String paramString) {
    for (VchaClusterState vchaClusterState : values()) {
      if (vchaClusterState.value.equals(paramString))
        return vchaClusterState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
