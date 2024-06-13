package com.vmware.vim25;

import com.vmware.vim25.HostMountInfoInaccessibleReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostMountInfoInaccessibleReason")
@XmlEnum
public enum HostMountInfoInaccessibleReason {
  ALL_PATHS_DOWN_START("AllPathsDown_Start"),
  ALL_PATHS_DOWN_TIMEOUT("AllPathsDown_Timeout"),
  PERMANENT_DEVICE_LOSS("PermanentDeviceLoss");
  
  private final String value;
  
  HostMountInfoInaccessibleReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostMountInfoInaccessibleReason fromValue(String paramString) {
    for (HostMountInfoInaccessibleReason hostMountInfoInaccessibleReason : values()) {
      if (hostMountInfoInaccessibleReason.value.equals(paramString))
        return hostMountInfoInaccessibleReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
