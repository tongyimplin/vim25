package com.vmware.vim25;

import com.vmware.vim25.HostUnresolvedVmfsResolutionSpecVmfsUuidResolution;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostUnresolvedVmfsResolutionSpecVmfsUuidResolution")
@XmlEnum
public enum HostUnresolvedVmfsResolutionSpecVmfsUuidResolution {
  RESIGNATURE("resignature"),
  FORCE_MOUNT("forceMount");
  
  private final String value;
  
  HostUnresolvedVmfsResolutionSpecVmfsUuidResolution(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostUnresolvedVmfsResolutionSpecVmfsUuidResolution fromValue(String paramString) {
    for (HostUnresolvedVmfsResolutionSpecVmfsUuidResolution hostUnresolvedVmfsResolutionSpecVmfsUuidResolution : values()) {
      if (hostUnresolvedVmfsResolutionSpecVmfsUuidResolution.value.equals(paramString))
        return hostUnresolvedVmfsResolutionSpecVmfsUuidResolution; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
