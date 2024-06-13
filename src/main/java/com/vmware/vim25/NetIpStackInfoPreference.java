package com.vmware.vim25;

import com.vmware.vim25.NetIpStackInfoPreference;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NetIpStackInfoPreference")
@XmlEnum
public enum NetIpStackInfoPreference {
  RESERVED("reserved"),
  LOW("low"),
  MEDIUM("medium"),
  HIGH("high");
  
  private final String value;
  
  NetIpStackInfoPreference(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NetIpStackInfoPreference fromValue(String paramString) {
    for (NetIpStackInfoPreference netIpStackInfoPreference : values()) {
      if (netIpStackInfoPreference.value.equals(paramString))
        return netIpStackInfoPreference; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
