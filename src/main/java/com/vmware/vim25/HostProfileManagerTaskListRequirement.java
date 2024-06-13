package com.vmware.vim25;

import com.vmware.vim25.HostProfileManagerTaskListRequirement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostProfileManagerTaskListRequirement")
@XmlEnum
public enum HostProfileManagerTaskListRequirement {
  MAINTENANCE_MODE_REQUIRED("maintenanceModeRequired"),
  REBOOT_REQUIRED("rebootRequired");
  
  private final String value;
  
  HostProfileManagerTaskListRequirement(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostProfileManagerTaskListRequirement fromValue(String paramString) {
    for (HostProfileManagerTaskListRequirement hostProfileManagerTaskListRequirement : values()) {
      if (hostProfileManagerTaskListRequirement.value.equals(paramString))
        return hostProfileManagerTaskListRequirement; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
