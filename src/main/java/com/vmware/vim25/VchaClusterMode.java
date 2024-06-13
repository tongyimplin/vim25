package com.vmware.vim25;

import com.vmware.vim25.VchaClusterMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VchaClusterMode")
@XmlEnum
public enum VchaClusterMode {
  ENABLED("enabled"),
  DISABLED("disabled"),
  MAINTENANCE("maintenance");
  
  private final String value;
  
  VchaClusterMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VchaClusterMode fromValue(String paramString) {
    for (VchaClusterMode vchaClusterMode : values()) {
      if (vchaClusterMode.value.equals(paramString))
        return vchaClusterMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
