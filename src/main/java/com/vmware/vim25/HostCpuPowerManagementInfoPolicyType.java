package com.vmware.vim25;

import com.vmware.vim25.HostCpuPowerManagementInfoPolicyType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostCpuPowerManagementInfoPolicyType")
@XmlEnum
public enum HostCpuPowerManagementInfoPolicyType {
  OFF("off"),
  STATIC_POLICY("staticPolicy"),
  DYNAMIC_POLICY("dynamicPolicy");
  
  private final String value;
  
  HostCpuPowerManagementInfoPolicyType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostCpuPowerManagementInfoPolicyType fromValue(String paramString) {
    for (HostCpuPowerManagementInfoPolicyType hostCpuPowerManagementInfoPolicyType : values()) {
      if (hostCpuPowerManagementInfoPolicyType.value.equals(paramString))
        return hostCpuPowerManagementInfoPolicyType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
