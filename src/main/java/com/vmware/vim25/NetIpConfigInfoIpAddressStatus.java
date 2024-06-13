package com.vmware.vim25;

import com.vmware.vim25.NetIpConfigInfoIpAddressStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NetIpConfigInfoIpAddressStatus")
@XmlEnum
public enum NetIpConfigInfoIpAddressStatus {
  PREFERRED("preferred"),
  DEPRECATED("deprecated"),
  INVALID("invalid"),
  INACCESSIBLE("inaccessible"),
  UNKNOWN("unknown"),
  TENTATIVE("tentative"),
  DUPLICATE("duplicate");
  
  private final String value;
  
  NetIpConfigInfoIpAddressStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NetIpConfigInfoIpAddressStatus fromValue(String paramString) {
    for (NetIpConfigInfoIpAddressStatus netIpConfigInfoIpAddressStatus : values()) {
      if (netIpConfigInfoIpAddressStatus.value.equals(paramString))
        return netIpConfigInfoIpAddressStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
