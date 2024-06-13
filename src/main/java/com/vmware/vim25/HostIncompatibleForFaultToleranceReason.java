package com.vmware.vim25;

import com.vmware.vim25.HostIncompatibleForFaultToleranceReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostIncompatibleForFaultToleranceReason")
@XmlEnum
public enum HostIncompatibleForFaultToleranceReason {
  PRODUCT("product"),
  PROCESSOR("processor");
  
  private final String value;
  
  HostIncompatibleForFaultToleranceReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostIncompatibleForFaultToleranceReason fromValue(String paramString) {
    for (HostIncompatibleForFaultToleranceReason hostIncompatibleForFaultToleranceReason : values()) {
      if (hostIncompatibleForFaultToleranceReason.value.equals(paramString))
        return hostIncompatibleForFaultToleranceReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
