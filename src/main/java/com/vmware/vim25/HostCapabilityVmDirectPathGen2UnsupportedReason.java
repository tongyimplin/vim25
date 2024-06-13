package com.vmware.vim25;

import com.vmware.vim25.HostCapabilityVmDirectPathGen2UnsupportedReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostCapabilityVmDirectPathGen2UnsupportedReason")
@XmlEnum
public enum HostCapabilityVmDirectPathGen2UnsupportedReason {
  HOST_NPT_INCOMPATIBLE_PRODUCT("hostNptIncompatibleProduct"),
  HOST_NPT_INCOMPATIBLE_HARDWARE("hostNptIncompatibleHardware"),
  HOST_NPT_DISABLED("hostNptDisabled");
  
  private final String value;
  
  HostCapabilityVmDirectPathGen2UnsupportedReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostCapabilityVmDirectPathGen2UnsupportedReason fromValue(String paramString) {
    for (HostCapabilityVmDirectPathGen2UnsupportedReason hostCapabilityVmDirectPathGen2UnsupportedReason : values()) {
      if (hostCapabilityVmDirectPathGen2UnsupportedReason.value.equals(paramString))
        return hostCapabilityVmDirectPathGen2UnsupportedReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
