package com.vmware.vim25;

import com.vmware.vim25.CannotEnableVmcpForClusterReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CannotEnableVmcpForClusterReason")
@XmlEnum
public enum CannotEnableVmcpForClusterReason {
  APD_TIMEOUT_DISABLED("APDTimeoutDisabled");
  
  private final String value;
  
  CannotEnableVmcpForClusterReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static CannotEnableVmcpForClusterReason fromValue(String paramString) {
    for (CannotEnableVmcpForClusterReason cannotEnableVmcpForClusterReason : values()) {
      if (cannotEnableVmcpForClusterReason.value.equals(paramString))
        return cannotEnableVmcpForClusterReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
