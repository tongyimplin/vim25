package com.vmware.vim25;

import com.vmware.vim25.StorageIORMThresholdMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "StorageIORMThresholdMode")
@XmlEnum
public enum StorageIORMThresholdMode {
  AUTOMATIC("automatic"),
  MANUAL("manual");
  
  private final String value;
  
  StorageIORMThresholdMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static StorageIORMThresholdMode fromValue(String paramString) {
    for (StorageIORMThresholdMode storageIORMThresholdMode : values()) {
      if (storageIORMThresholdMode.value.equals(paramString))
        return storageIORMThresholdMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
