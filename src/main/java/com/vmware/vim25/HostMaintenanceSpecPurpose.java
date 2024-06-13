package com.vmware.vim25;

import com.vmware.vim25.HostMaintenanceSpecPurpose;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostMaintenanceSpecPurpose")
@XmlEnum
public enum HostMaintenanceSpecPurpose {
  HOST_UPGRADE("hostUpgrade");
  
  private final String value;
  
  HostMaintenanceSpecPurpose(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostMaintenanceSpecPurpose fromValue(String paramString) {
    for (HostMaintenanceSpecPurpose hostMaintenanceSpecPurpose : values()) {
      if (hostMaintenanceSpecPurpose.value.equals(paramString))
        return hostMaintenanceSpecPurpose; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
