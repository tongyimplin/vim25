package com.vmware.vim25;

import com.vmware.vim25.NetBIOSConfigInfoMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NetBIOSConfigInfoMode")
@XmlEnum
public enum NetBIOSConfigInfoMode {
  UNKNOWN("unknown"),
  ENABLED("enabled"),
  DISABLED("disabled"),
  ENABLED_VIA_DHCP("enabledViaDHCP");
  
  private final String value;
  
  NetBIOSConfigInfoMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NetBIOSConfigInfoMode fromValue(String paramString) {
    for (NetBIOSConfigInfoMode netBIOSConfigInfoMode : values()) {
      if (netBIOSConfigInfoMode.value.equals(paramString))
        return netBIOSConfigInfoMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
