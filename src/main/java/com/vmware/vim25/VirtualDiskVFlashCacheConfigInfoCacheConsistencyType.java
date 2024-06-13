package com.vmware.vim25;

import com.vmware.vim25.VirtualDiskVFlashCacheConfigInfoCacheConsistencyType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDiskVFlashCacheConfigInfoCacheConsistencyType")
@XmlEnum
public enum VirtualDiskVFlashCacheConfigInfoCacheConsistencyType {
  STRONG("strong"),
  WEAK("weak");
  
  private final String value;
  
  VirtualDiskVFlashCacheConfigInfoCacheConsistencyType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDiskVFlashCacheConfigInfoCacheConsistencyType fromValue(String paramString) {
    for (VirtualDiskVFlashCacheConfigInfoCacheConsistencyType virtualDiskVFlashCacheConfigInfoCacheConsistencyType : values()) {
      if (virtualDiskVFlashCacheConfigInfoCacheConsistencyType.value.equals(paramString))
        return virtualDiskVFlashCacheConfigInfoCacheConsistencyType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
