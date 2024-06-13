package com.vmware.vim25;

import com.vmware.vim25.VslmVStorageObjectControlFlag;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "vslmVStorageObjectControlFlag")
@XmlEnum
public enum VslmVStorageObjectControlFlag {
  KEEP_AFTER_DELETE_VM("keepAfterDeleteVm"),
  DISABLE_RELOCATION("disableRelocation"),
  ENABLE_CHANGED_BLOCK_TRACKING("enableChangedBlockTracking");
  
  private final String value;
  
  VslmVStorageObjectControlFlag(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VslmVStorageObjectControlFlag fromValue(String paramString) {
    for (VslmVStorageObjectControlFlag vslmVStorageObjectControlFlag : values()) {
      if (vslmVStorageObjectControlFlag.value.equals(paramString))
        return vslmVStorageObjectControlFlag; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
