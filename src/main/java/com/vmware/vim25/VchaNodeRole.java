package com.vmware.vim25;

import com.vmware.vim25.VchaNodeRole;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VchaNodeRole")
@XmlEnum
public enum VchaNodeRole {
  ACTIVE("active"),
  PASSIVE("passive"),
  WITNESS("witness");
  
  private final String value;
  
  VchaNodeRole(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VchaNodeRole fromValue(String paramString) {
    for (VchaNodeRole vchaNodeRole : values()) {
      if (vchaNodeRole.value.equals(paramString))
        return vchaNodeRole; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
