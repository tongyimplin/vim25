package com.vmware.vim25;

import com.vmware.vim25.HostUnresolvedVmfsExtentUnresolvedReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostUnresolvedVmfsExtentUnresolvedReason")
@XmlEnum
public enum HostUnresolvedVmfsExtentUnresolvedReason {
  DISK_ID_MISMATCH("diskIdMismatch"),
  UUID_CONFLICT("uuidConflict");
  
  private final String value;
  
  HostUnresolvedVmfsExtentUnresolvedReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostUnresolvedVmfsExtentUnresolvedReason fromValue(String paramString) {
    for (HostUnresolvedVmfsExtentUnresolvedReason hostUnresolvedVmfsExtentUnresolvedReason : values()) {
      if (hostUnresolvedVmfsExtentUnresolvedReason.value.equals(paramString))
        return hostUnresolvedVmfsExtentUnresolvedReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
