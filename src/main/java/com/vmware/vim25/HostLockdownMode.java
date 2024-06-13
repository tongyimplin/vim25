package com.vmware.vim25;

import com.vmware.vim25.HostLockdownMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostLockdownMode")
@XmlEnum
public enum HostLockdownMode {
  LOCKDOWN_DISABLED("lockdownDisabled"),
  LOCKDOWN_NORMAL("lockdownNormal"),
  LOCKDOWN_STRICT("lockdownStrict");
  
  private final String value;
  
  HostLockdownMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostLockdownMode fromValue(String paramString) {
    for (HostLockdownMode hostLockdownMode : values()) {
      if (hostLockdownMode.value.equals(paramString))
        return hostLockdownMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
