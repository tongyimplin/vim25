package com.vmware.vim25;

import com.vmware.vim25.HostDiskPartitionInfoType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostDiskPartitionInfoType")
@XmlEnum
public enum HostDiskPartitionInfoType {
  NONE("none"),
  VMFS("vmfs"),
  LINUX_NATIVE("linuxNative"),
  LINUX_SWAP("linuxSwap"),
  EXTENDED("extended"),
  NTFS("ntfs"),
  VMK_DIAGNOSTIC("vmkDiagnostic"),
  VFFS("vffs");
  
  private final String value;
  
  HostDiskPartitionInfoType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostDiskPartitionInfoType fromValue(String paramString) {
    for (HostDiskPartitionInfoType hostDiskPartitionInfoType : values()) {
      if (hostDiskPartitionInfoType.value.equals(paramString))
        return hostDiskPartitionInfoType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
