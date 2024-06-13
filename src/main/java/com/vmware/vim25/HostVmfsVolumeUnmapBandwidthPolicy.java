package com.vmware.vim25;

import com.vmware.vim25.HostVmfsVolumeUnmapBandwidthPolicy;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostVmfsVolumeUnmapBandwidthPolicy")
@XmlEnum
public enum HostVmfsVolumeUnmapBandwidthPolicy {
  FIXED("fixed"),
  DYNAMIC("dynamic");
  
  private final String value;
  
  HostVmfsVolumeUnmapBandwidthPolicy(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostVmfsVolumeUnmapBandwidthPolicy fromValue(String paramString) {
    for (HostVmfsVolumeUnmapBandwidthPolicy hostVmfsVolumeUnmapBandwidthPolicy : values()) {
      if (hostVmfsVolumeUnmapBandwidthPolicy.value.equals(paramString))
        return hostVmfsVolumeUnmapBandwidthPolicy; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
