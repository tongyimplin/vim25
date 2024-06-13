package com.vmware.vim25;

import com.vmware.vim25.StoragePlacementSpecPlacementType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "StoragePlacementSpecPlacementType")
@XmlEnum
public enum StoragePlacementSpecPlacementType {
  CREATE("create"),
  RECONFIGURE("reconfigure"),
  RELOCATE("relocate"),
  CLONE("clone");
  
  private final String value;
  
  StoragePlacementSpecPlacementType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static StoragePlacementSpecPlacementType fromValue(String paramString) {
    for (StoragePlacementSpecPlacementType storagePlacementSpecPlacementType : values()) {
      if (storagePlacementSpecPlacementType.value.equals(paramString))
        return storagePlacementSpecPlacementType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
