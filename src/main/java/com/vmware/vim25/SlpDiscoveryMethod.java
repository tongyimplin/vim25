package com.vmware.vim25;

import com.vmware.vim25.SlpDiscoveryMethod;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SlpDiscoveryMethod")
@XmlEnum
public enum SlpDiscoveryMethod {
  SLP_DHCP("slpDhcp"),
  SLP_AUTO_UNICAST("slpAutoUnicast"),
  SLP_AUTO_MULTICAST("slpAutoMulticast"),
  SLP_MANUAL("slpManual");
  
  private final String value;
  
  SlpDiscoveryMethod(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static SlpDiscoveryMethod fromValue(String paramString) {
    for (SlpDiscoveryMethod slpDiscoveryMethod : values()) {
      if (slpDiscoveryMethod.value.equals(paramString))
        return slpDiscoveryMethod; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
