package com.vmware.vim25;

import com.vmware.vim25.NvdimmRangeType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NvdimmRangeType")
@XmlEnum
public enum NvdimmRangeType {
  VOLATILE_RANGE("volatileRange"),
  PERSISTENT_RANGE("persistentRange"),
  CONTROL_RANGE("controlRange"),
  BLOCK_RANGE("blockRange"),
  VOLATILE_VIRTUAL_DISK_RANGE("volatileVirtualDiskRange"),
  VOLATILE_VIRTUAL_CD_RANGE("volatileVirtualCDRange"),
  PERSISTENT_VIRTUAL_DISK_RANGE("persistentVirtualDiskRange"),
  PERSISTENT_VIRTUAL_CD_RANGE("persistentVirtualCDRange");
  
  private final String value;
  
  NvdimmRangeType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NvdimmRangeType fromValue(String paramString) {
    for (NvdimmRangeType nvdimmRangeType : values()) {
      if (nvdimmRangeType.value.equals(paramString))
        return nvdimmRangeType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
