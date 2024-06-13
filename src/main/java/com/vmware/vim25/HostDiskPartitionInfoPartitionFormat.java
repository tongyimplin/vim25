package com.vmware.vim25;

import com.vmware.vim25.HostDiskPartitionInfoPartitionFormat;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostDiskPartitionInfoPartitionFormat")
@XmlEnum
public enum HostDiskPartitionInfoPartitionFormat {
  GPT("gpt"),
  MBR("mbr"),
  UNKNOWN("unknown");
  
  private final String value;
  
  HostDiskPartitionInfoPartitionFormat(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostDiskPartitionInfoPartitionFormat fromValue(String paramString) {
    for (HostDiskPartitionInfoPartitionFormat hostDiskPartitionInfoPartitionFormat : values()) {
      if (hostDiskPartitionInfoPartitionFormat.value.equals(paramString))
        return hostDiskPartitionInfoPartitionFormat; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
