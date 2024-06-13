package com.vmware.vim25;

import com.vmware.vim25.HostPatchManagerInstallState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostPatchManagerInstallState")
@XmlEnum
public enum HostPatchManagerInstallState {
  HOST_RESTARTED("hostRestarted"),
  IMAGE_ACTIVE("imageActive");
  
  private final String value;
  
  HostPatchManagerInstallState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostPatchManagerInstallState fromValue(String paramString) {
    for (HostPatchManagerInstallState hostPatchManagerInstallState : values()) {
      if (hostPatchManagerInstallState.value.equals(paramString))
        return hostPatchManagerInstallState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
