package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaIscsiIpv6AddressIPv6AddressOperation;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostInternetScsiHbaIscsiIpv6AddressIPv6AddressOperation")
@XmlEnum
public enum HostInternetScsiHbaIscsiIpv6AddressIPv6AddressOperation {
  ADD("add"),
  REMOVE("remove");
  
  private final String value;
  
  HostInternetScsiHbaIscsiIpv6AddressIPv6AddressOperation(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostInternetScsiHbaIscsiIpv6AddressIPv6AddressOperation fromValue(String paramString) {
    for (HostInternetScsiHbaIscsiIpv6AddressIPv6AddressOperation hostInternetScsiHbaIscsiIpv6AddressIPv6AddressOperation : values()) {
      if (hostInternetScsiHbaIscsiIpv6AddressIPv6AddressOperation.value.equals(paramString))
        return hostInternetScsiHbaIscsiIpv6AddressIPv6AddressOperation; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
