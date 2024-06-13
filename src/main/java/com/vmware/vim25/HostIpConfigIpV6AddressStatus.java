package com.vmware.vim25;

import com.vmware.vim25.HostIpConfigIpV6AddressStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostIpConfigIpV6AddressStatus")
@XmlEnum
public enum HostIpConfigIpV6AddressStatus {
  PREFERRED("preferred"),
  DEPRECATED("deprecated"),
  INVALID("invalid"),
  INACCESSIBLE("inaccessible"),
  UNKNOWN("unknown"),
  TENTATIVE("tentative"),
  DUPLICATE("duplicate");
  
  private final String value;
  
  HostIpConfigIpV6AddressStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostIpConfigIpV6AddressStatus fromValue(String paramString) {
    for (HostIpConfigIpV6AddressStatus hostIpConfigIpV6AddressStatus : values()) {
      if (hostIpConfigIpV6AddressStatus.value.equals(paramString))
        return hostIpConfigIpV6AddressStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
