package com.vmware.vim25;

import com.vmware.vim25.HostIpConfigIpV6AddressConfigType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostIpConfigIpV6AddressConfigType")
@XmlEnum
public enum HostIpConfigIpV6AddressConfigType {
  OTHER("other"),
  MANUAL("manual"),
  DHCP("dhcp"),
  LINKLAYER("linklayer"),
  RANDOM("random");
  
  private final String value;
  
  HostIpConfigIpV6AddressConfigType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostIpConfigIpV6AddressConfigType fromValue(String paramString) {
    for (HostIpConfigIpV6AddressConfigType hostIpConfigIpV6AddressConfigType : values()) {
      if (hostIpConfigIpV6AddressConfigType.value.equals(paramString))
        return hostIpConfigIpV6AddressConfigType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
