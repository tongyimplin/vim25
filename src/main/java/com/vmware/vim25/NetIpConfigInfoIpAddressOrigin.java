package com.vmware.vim25;

import com.vmware.vim25.NetIpConfigInfoIpAddressOrigin;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NetIpConfigInfoIpAddressOrigin")
@XmlEnum
public enum NetIpConfigInfoIpAddressOrigin {
  OTHER("other"),
  MANUAL("manual"),
  DHCP("dhcp"),
  LINKLAYER("linklayer"),
  RANDOM("random");
  
  private final String value;
  
  NetIpConfigInfoIpAddressOrigin(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NetIpConfigInfoIpAddressOrigin fromValue(String paramString) {
    for (NetIpConfigInfoIpAddressOrigin netIpConfigInfoIpAddressOrigin : values()) {
      if (netIpConfigInfoIpAddressOrigin.value.equals(paramString))
        return netIpConfigInfoIpAddressOrigin; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
