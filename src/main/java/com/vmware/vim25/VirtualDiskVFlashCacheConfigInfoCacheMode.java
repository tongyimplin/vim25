package com.vmware.vim25;

import com.vmware.vim25.VirtualDiskVFlashCacheConfigInfoCacheMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDiskVFlashCacheConfigInfoCacheMode")
@XmlEnum
public enum VirtualDiskVFlashCacheConfigInfoCacheMode {
  WRITE_THRU("write_thru"),
  WRITE_BACK("write_back");
  
  private final String value;
  
  VirtualDiskVFlashCacheConfigInfoCacheMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDiskVFlashCacheConfigInfoCacheMode fromValue(String paramString) {
    for (VirtualDiskVFlashCacheConfigInfoCacheMode virtualDiskVFlashCacheConfigInfoCacheMode : values()) {
      if (virtualDiskVFlashCacheConfigInfoCacheMode.value.equals(paramString))
        return virtualDiskVFlashCacheConfigInfoCacheMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
