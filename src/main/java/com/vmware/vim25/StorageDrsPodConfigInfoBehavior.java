package com.vmware.vim25;

import com.vmware.vim25.StorageDrsPodConfigInfoBehavior;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "StorageDrsPodConfigInfoBehavior")
@XmlEnum
public enum StorageDrsPodConfigInfoBehavior {
  MANUAL("manual"),
  AUTOMATED("automated");
  
  private final String value;
  
  StorageDrsPodConfigInfoBehavior(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static StorageDrsPodConfigInfoBehavior fromValue(String paramString) {
    for (StorageDrsPodConfigInfoBehavior storageDrsPodConfigInfoBehavior : values()) {
      if (storageDrsPodConfigInfoBehavior.value.equals(paramString))
        return storageDrsPodConfigInfoBehavior; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
