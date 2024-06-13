package com.vmware.vim25;

import com.vmware.vim25.PhysicalNicResourcePoolSchedulerDisallowedReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PhysicalNicResourcePoolSchedulerDisallowedReason")
@XmlEnum
public enum PhysicalNicResourcePoolSchedulerDisallowedReason {
  USER_OPT_OUT("userOptOut"),
  HARDWARE_UNSUPPORTED("hardwareUnsupported");
  
  private final String value;
  
  PhysicalNicResourcePoolSchedulerDisallowedReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static PhysicalNicResourcePoolSchedulerDisallowedReason fromValue(String paramString) {
    for (PhysicalNicResourcePoolSchedulerDisallowedReason physicalNicResourcePoolSchedulerDisallowedReason : values()) {
      if (physicalNicResourcePoolSchedulerDisallowedReason.value.equals(paramString))
        return physicalNicResourcePoolSchedulerDisallowedReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
