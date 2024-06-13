package com.vmware.vim25;

import com.vmware.vim25.InternetScsiSnsDiscoveryMethod;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "InternetScsiSnsDiscoveryMethod")
@XmlEnum
public enum InternetScsiSnsDiscoveryMethod {
  ISNS_STATIC("isnsStatic"),
  ISNS_DHCP("isnsDhcp"),
  ISNS_SLP("isnsSlp");
  
  private final String value;
  
  InternetScsiSnsDiscoveryMethod(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static InternetScsiSnsDiscoveryMethod fromValue(String paramString) {
    for (InternetScsiSnsDiscoveryMethod internetScsiSnsDiscoveryMethod : values()) {
      if (internetScsiSnsDiscoveryMethod.value.equals(paramString))
        return internetScsiSnsDiscoveryMethod; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
