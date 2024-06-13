package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaChapAuthenticationType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostInternetScsiHbaChapAuthenticationType")
@XmlEnum
public enum HostInternetScsiHbaChapAuthenticationType {
  CHAP_PROHIBITED("chapProhibited"),
  CHAP_DISCOURAGED("chapDiscouraged"),
  CHAP_PREFERRED("chapPreferred"),
  CHAP_REQUIRED("chapRequired");
  
  private final String value;
  
  HostInternetScsiHbaChapAuthenticationType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostInternetScsiHbaChapAuthenticationType fromValue(String paramString) {
    for (HostInternetScsiHbaChapAuthenticationType hostInternetScsiHbaChapAuthenticationType : values()) {
      if (hostInternetScsiHbaChapAuthenticationType.value.equals(paramString))
        return hostInternetScsiHbaChapAuthenticationType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
