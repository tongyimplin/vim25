package com.vmware.vim25;

import com.vmware.vim25.VirtualDiskDeltaDiskFormatVariant;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDiskDeltaDiskFormatVariant")
@XmlEnum
public enum VirtualDiskDeltaDiskFormatVariant {
  VMFS_SPARSE_VARIANT("vmfsSparseVariant"),
  VSAN_SPARSE_VARIANT("vsanSparseVariant");
  
  private final String value;
  
  VirtualDiskDeltaDiskFormatVariant(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDiskDeltaDiskFormatVariant fromValue(String paramString) {
    for (VirtualDiskDeltaDiskFormatVariant virtualDiskDeltaDiskFormatVariant : values()) {
      if (virtualDiskDeltaDiskFormatVariant.value.equals(paramString))
        return virtualDiskDeltaDiskFormatVariant; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
