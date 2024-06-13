package com.vmware.vim25;

import com.vmware.vim25.VirtualDiskDeltaDiskFormat;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDiskDeltaDiskFormat")
@XmlEnum
public enum VirtualDiskDeltaDiskFormat {
  REDO_LOG_FORMAT("redoLogFormat"),
  NATIVE_FORMAT("nativeFormat"),
  SE_SPARSE_FORMAT("seSparseFormat");
  
  private final String value;
  
  VirtualDiskDeltaDiskFormat(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDiskDeltaDiskFormat fromValue(String paramString) {
    for (VirtualDiskDeltaDiskFormat virtualDiskDeltaDiskFormat : values()) {
      if (virtualDiskDeltaDiskFormat.value.equals(paramString))
        return virtualDiskDeltaDiskFormat; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
