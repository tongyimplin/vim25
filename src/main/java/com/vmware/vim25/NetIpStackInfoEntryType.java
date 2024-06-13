package com.vmware.vim25;

import com.vmware.vim25.NetIpStackInfoEntryType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NetIpStackInfoEntryType")
@XmlEnum
public enum NetIpStackInfoEntryType {
  OTHER("other"),
  INVALID("invalid"),
  DYNAMIC("dynamic"),
  MANUAL("manual");
  
  private final String value;
  
  NetIpStackInfoEntryType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NetIpStackInfoEntryType fromValue(String paramString) {
    for (NetIpStackInfoEntryType netIpStackInfoEntryType : values()) {
      if (netIpStackInfoEntryType.value.equals(paramString))
        return netIpStackInfoEntryType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
