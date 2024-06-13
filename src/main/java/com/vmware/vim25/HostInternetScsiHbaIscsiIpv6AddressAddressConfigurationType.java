package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType")
@XmlEnum
public enum HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType {
  DHCP("DHCP"),
  AUTO_CONFIGURED("AutoConfigured"),
  STATIC("Static"),
  OTHER("Other");
  
  private final String value;
  
  HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType fromValue(String paramString) {
    for (HostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType hostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType : values()) {
      if (hostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType.value.equals(paramString))
        return hostInternetScsiHbaIscsiIpv6AddressAddressConfigurationType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
