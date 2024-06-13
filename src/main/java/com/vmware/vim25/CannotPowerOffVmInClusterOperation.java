package com.vmware.vim25;

import com.vmware.vim25.CannotPowerOffVmInClusterOperation;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CannotPowerOffVmInClusterOperation")
@XmlEnum
public enum CannotPowerOffVmInClusterOperation {
  SUSPEND("suspend"),
  POWER_OFF("powerOff"),
  GUEST_SHUTDOWN("guestShutdown"),
  GUEST_SUSPEND("guestSuspend");
  
  private final String value;
  
  CannotPowerOffVmInClusterOperation(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static CannotPowerOffVmInClusterOperation fromValue(String paramString) {
    for (CannotPowerOffVmInClusterOperation cannotPowerOffVmInClusterOperation : values()) {
      if (cannotPowerOffVmInClusterOperation.value.equals(paramString))
        return cannotPowerOffVmInClusterOperation; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
