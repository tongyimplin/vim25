package com.vmware.vim25;

import com.vmware.vim25.HostFileSystemVolumeFileSystemType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostFileSystemVolumeFileSystemType")
@XmlEnum
public enum HostFileSystemVolumeFileSystemType {
  VMFS("VMFS"),
  NFS("NFS"),
  NFS_41("NFS41"),
  CIFS("CIFS"),
  VSAN("vsan"),
  VFFS("VFFS"),
  VVOL("VVOL"),
  PMEM("PMEM"),
  OTHER("OTHER");
  
  private final String value;
  
  HostFileSystemVolumeFileSystemType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostFileSystemVolumeFileSystemType fromValue(String paramString) {
    for (HostFileSystemVolumeFileSystemType hostFileSystemVolumeFileSystemType : values()) {
      if (hostFileSystemVolumeFileSystemType.value.equals(paramString))
        return hostFileSystemVolumeFileSystemType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
