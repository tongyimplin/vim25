package com.vmware.vim25;

import com.vmware.vim25.PlacementSpecPlacementType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PlacementSpecPlacementType")
@XmlEnum
public enum PlacementSpecPlacementType {
  CREATE("create"),
  RECONFIGURE("reconfigure"),
  RELOCATE("relocate"),
  CLONE("clone");
  
  private final String value;
  
  PlacementSpecPlacementType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static PlacementSpecPlacementType fromValue(String paramString) {
    for (PlacementSpecPlacementType placementSpecPlacementType : values()) {
      if (placementSpecPlacementType.value.equals(paramString))
        return placementSpecPlacementType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
