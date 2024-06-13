package com.vmware.vim25;

import com.vmware.vim25.VStorageObjectConsumptionType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VStorageObjectConsumptionType")
@XmlEnum
public enum VStorageObjectConsumptionType {
  DISK("disk");
  
  private final String value;
  
  VStorageObjectConsumptionType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VStorageObjectConsumptionType fromValue(String paramString) {
    for (VStorageObjectConsumptionType vStorageObjectConsumptionType : values()) {
      if (vStorageObjectConsumptionType.value.equals(paramString))
        return vStorageObjectConsumptionType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
