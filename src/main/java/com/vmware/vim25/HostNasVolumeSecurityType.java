package com.vmware.vim25;

import com.vmware.vim25.HostNasVolumeSecurityType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostNasVolumeSecurityType")
@XmlEnum
public enum HostNasVolumeSecurityType {
  AUTH_SYS("AUTH_SYS"),
  SEC_KRB_5("SEC_KRB5"),
  SEC_KRB_5_I("SEC_KRB5I");
  
  private final String value;
  
  HostNasVolumeSecurityType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostNasVolumeSecurityType fromValue(String paramString) {
    for (HostNasVolumeSecurityType hostNasVolumeSecurityType : values()) {
      if (hostNasVolumeSecurityType.value.equals(paramString))
        return hostNasVolumeSecurityType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
