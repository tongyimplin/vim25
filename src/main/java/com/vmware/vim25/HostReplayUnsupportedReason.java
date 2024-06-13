package com.vmware.vim25;

import com.vmware.vim25.HostReplayUnsupportedReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostReplayUnsupportedReason")
@XmlEnum
public enum HostReplayUnsupportedReason {
  INCOMPATIBLE_PRODUCT("incompatibleProduct"),
  INCOMPATIBLE_CPU("incompatibleCpu"),
  HV_DISABLED("hvDisabled"),
  CPUID_LIMIT_SET("cpuidLimitSet"),
  OLD_BIOS("oldBIOS"),
  UNKNOWN("unknown");
  
  private final String value;
  
  HostReplayUnsupportedReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostReplayUnsupportedReason fromValue(String paramString) {
    for (HostReplayUnsupportedReason hostReplayUnsupportedReason : values()) {
      if (hostReplayUnsupportedReason.value.equals(paramString))
        return hostReplayUnsupportedReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
