package com.vmware.vim25;

import com.vmware.vim25.HostLowLevelProvisioningManagerFileType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostLowLevelProvisioningManagerFileType")
@XmlEnum
public enum HostLowLevelProvisioningManagerFileType {
  FILE("File"),
  VIRTUAL_DISK("VirtualDisk"),
  DIRECTORY("Directory");
  
  private final String value;
  
  HostLowLevelProvisioningManagerFileType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostLowLevelProvisioningManagerFileType fromValue(String paramString) {
    for (HostLowLevelProvisioningManagerFileType hostLowLevelProvisioningManagerFileType : values()) {
      if (hostLowLevelProvisioningManagerFileType.value.equals(paramString))
        return hostLowLevelProvisioningManagerFileType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
