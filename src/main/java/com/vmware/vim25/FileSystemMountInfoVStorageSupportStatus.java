package com.vmware.vim25;

import com.vmware.vim25.FileSystemMountInfoVStorageSupportStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FileSystemMountInfoVStorageSupportStatus")
@XmlEnum
public enum FileSystemMountInfoVStorageSupportStatus {
  V_STORAGE_SUPPORTED("vStorageSupported"),
  V_STORAGE_UNSUPPORTED("vStorageUnsupported"),
  V_STORAGE_UNKNOWN("vStorageUnknown");
  
  private final String value;
  
  FileSystemMountInfoVStorageSupportStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static FileSystemMountInfoVStorageSupportStatus fromValue(String paramString) {
    for (FileSystemMountInfoVStorageSupportStatus fileSystemMountInfoVStorageSupportStatus : values()) {
      if (fileSystemMountInfoVStorageSupportStatus.value.equals(paramString))
        return fileSystemMountInfoVStorageSupportStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
