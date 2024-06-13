package com.vmware.vim25;

import com.vmware.vim25.HostCapabilityFtUnsupportedReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostCapabilityFtUnsupportedReason")
@XmlEnum
public enum HostCapabilityFtUnsupportedReason {
  V_MOTION_NOT_LICENSED("vMotionNotLicensed"),
  MISSING_V_MOTION_NIC("missingVMotionNic"),
  MISSING_FT_LOGGING_NIC("missingFTLoggingNic"),
  FT_NOT_LICENSED("ftNotLicensed"),
  HA_AGENT_ISSUE("haAgentIssue"),
  UNSUPPORTED_PRODUCT("unsupportedProduct"),
  CPU_HV_UNSUPPORTED("cpuHvUnsupported"),
  CPU_HWMMU_UNSUPPORTED("cpuHwmmuUnsupported"),
  CPU_HV_DISABLED("cpuHvDisabled");
  
  private final String value;
  
  HostCapabilityFtUnsupportedReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostCapabilityFtUnsupportedReason fromValue(String paramString) {
    for (HostCapabilityFtUnsupportedReason hostCapabilityFtUnsupportedReason : values()) {
      if (hostCapabilityFtUnsupportedReason.value.equals(paramString))
        return hostCapabilityFtUnsupportedReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
