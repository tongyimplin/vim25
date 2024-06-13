package com.vmware.vim25;

import com.vmware.vim25.ScsiLunVStorageSupportStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ScsiLunVStorageSupportStatus")
@XmlEnum
public enum ScsiLunVStorageSupportStatus {
  V_STORAGE_SUPPORTED("vStorageSupported"),
  V_STORAGE_UNSUPPORTED("vStorageUnsupported"),
  V_STORAGE_UNKNOWN("vStorageUnknown");
  
  private final String value;
  
  ScsiLunVStorageSupportStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ScsiLunVStorageSupportStatus fromValue(String paramString) {
    for (ScsiLunVStorageSupportStatus scsiLunVStorageSupportStatus : values()) {
      if (scsiLunVStorageSupportStatus.value.equals(paramString))
        return scsiLunVStorageSupportStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
