package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaStaticTargetTargetDiscoveryMethod;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostInternetScsiHbaStaticTargetTargetDiscoveryMethod")
@XmlEnum
public enum HostInternetScsiHbaStaticTargetTargetDiscoveryMethod {
  STATIC_METHOD("staticMethod"),
  SEND_TARGET_METHOD("sendTargetMethod"),
  SLP_METHOD("slpMethod"),
  ISNS_METHOD("isnsMethod"),
  UNKNOWN_METHOD("unknownMethod");
  
  private final String value;
  
  HostInternetScsiHbaStaticTargetTargetDiscoveryMethod(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostInternetScsiHbaStaticTargetTargetDiscoveryMethod fromValue(String paramString) {
    for (HostInternetScsiHbaStaticTargetTargetDiscoveryMethod hostInternetScsiHbaStaticTargetTargetDiscoveryMethod : values()) {
      if (hostInternetScsiHbaStaticTargetTargetDiscoveryMethod.value.equals(paramString))
        return hostInternetScsiHbaStaticTargetTargetDiscoveryMethod; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
