package com.vmware.vim25;

import com.vmware.vim25.VMwareUplinkLacpMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VMwareUplinkLacpMode")
@XmlEnum
public enum VMwareUplinkLacpMode {
  ACTIVE("active"),
  PASSIVE("passive");
  
  private final String value;
  
  VMwareUplinkLacpMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VMwareUplinkLacpMode fromValue(String paramString) {
    for (VMwareUplinkLacpMode vMwareUplinkLacpMode : values()) {
      if (vMwareUplinkLacpMode.value.equals(paramString))
        return vMwareUplinkLacpMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
