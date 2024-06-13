package com.vmware.vim25;

import com.vmware.vim25.VFlashModuleNotSupportedReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VFlashModuleNotSupportedReason")
@XmlEnum
public enum VFlashModuleNotSupportedReason {
  CACHE_MODE_NOT_SUPPORTED("CacheModeNotSupported"),
  CACHE_CONSISTENCY_TYPE_NOT_SUPPORTED("CacheConsistencyTypeNotSupported"),
  CACHE_BLOCK_SIZE_NOT_SUPPORTED("CacheBlockSizeNotSupported"),
  CACHE_RESERVATION_NOT_SUPPORTED("CacheReservationNotSupported"),
  DISK_SIZE_NOT_SUPPORTED("DiskSizeNotSupported");
  
  private final String value;
  
  VFlashModuleNotSupportedReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VFlashModuleNotSupportedReason fromValue(String paramString) {
    for (VFlashModuleNotSupportedReason vFlashModuleNotSupportedReason : values()) {
      if (vFlashModuleNotSupportedReason.value.equals(paramString))
        return vFlashModuleNotSupportedReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
