package com.vmware.vim25;

import com.vmware.vim25.ScsiDiskType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ScsiDiskType")
@XmlEnum
public enum ScsiDiskType {
  NATIVE_512("native512"),
  EMULATED_512("emulated512"),
  NATIVE_4_K("native4k"),
  SOFTWARE_EMULATED_4_K("SoftwareEmulated4k"),
  UNKNOWN("unknown");
  
  private final String value;
  
  ScsiDiskType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ScsiDiskType fromValue(String paramString) {
    for (ScsiDiskType scsiDiskType : values()) {
      if (scsiDiskType.value.equals(paramString))
        return scsiDiskType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
