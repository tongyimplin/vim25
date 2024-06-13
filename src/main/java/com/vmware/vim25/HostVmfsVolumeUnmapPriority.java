package com.vmware.vim25;

import com.vmware.vim25.HostVmfsVolumeUnmapPriority;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostVmfsVolumeUnmapPriority")
@XmlEnum
public enum HostVmfsVolumeUnmapPriority {
  NONE("none"),
  LOW("low");
  
  private final String value;
  
  HostVmfsVolumeUnmapPriority(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostVmfsVolumeUnmapPriority fromValue(String paramString) {
    for (HostVmfsVolumeUnmapPriority hostVmfsVolumeUnmapPriority : values()) {
      if (hostVmfsVolumeUnmapPriority.value.equals(paramString))
        return hostVmfsVolumeUnmapPriority; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
