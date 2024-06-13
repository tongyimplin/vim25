package com.vmware.vim25;

import com.vmware.vim25.HostLowLevelProvisioningManagerReloadTarget;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostLowLevelProvisioningManagerReloadTarget")
@XmlEnum
public enum HostLowLevelProvisioningManagerReloadTarget {
  CURRENT_CONFIG("currentConfig"),
  SNAPSHOT_CONFIG("snapshotConfig");
  
  private final String value;
  
  HostLowLevelProvisioningManagerReloadTarget(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostLowLevelProvisioningManagerReloadTarget fromValue(String paramString) {
    for (HostLowLevelProvisioningManagerReloadTarget hostLowLevelProvisioningManagerReloadTarget : values()) {
      if (hostLowLevelProvisioningManagerReloadTarget.value.equals(paramString))
        return hostLowLevelProvisioningManagerReloadTarget; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
