package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaDigestType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostInternetScsiHbaDigestType")
@XmlEnum
public enum HostInternetScsiHbaDigestType {
  DIGEST_PROHIBITED("digestProhibited"),
  DIGEST_DISCOURAGED("digestDiscouraged"),
  DIGEST_PREFERRED("digestPreferred"),
  DIGEST_REQUIRED("digestRequired");
  
  private final String value;
  
  HostInternetScsiHbaDigestType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostInternetScsiHbaDigestType fromValue(String paramString) {
    for (HostInternetScsiHbaDigestType hostInternetScsiHbaDigestType : values()) {
      if (hostInternetScsiHbaDigestType.value.equals(paramString))
        return hostInternetScsiHbaDigestType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
