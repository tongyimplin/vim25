package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaNetworkBindingSupportType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostInternetScsiHbaNetworkBindingSupportType")
@XmlEnum
public enum HostInternetScsiHbaNetworkBindingSupportType {
  NOTSUPPORTED("notsupported"),
  OPTIONAL("optional"),
  REQUIRED("required");
  
  private final String value;
  
  HostInternetScsiHbaNetworkBindingSupportType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostInternetScsiHbaNetworkBindingSupportType fromValue(String paramString) {
    for (HostInternetScsiHbaNetworkBindingSupportType hostInternetScsiHbaNetworkBindingSupportType : values()) {
      if (hostInternetScsiHbaNetworkBindingSupportType.value.equals(paramString))
        return hostInternetScsiHbaNetworkBindingSupportType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
