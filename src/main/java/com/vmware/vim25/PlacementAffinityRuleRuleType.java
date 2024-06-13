package com.vmware.vim25;

import com.vmware.vim25.PlacementAffinityRuleRuleType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PlacementAffinityRuleRuleType")
@XmlEnum
public enum PlacementAffinityRuleRuleType {
  AFFINITY("affinity"),
  ANTI_AFFINITY("antiAffinity"),
  SOFT_AFFINITY("softAffinity"),
  SOFT_ANTI_AFFINITY("softAntiAffinity");
  
  private final String value;
  
  PlacementAffinityRuleRuleType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static PlacementAffinityRuleRuleType fromValue(String paramString) {
    for (PlacementAffinityRuleRuleType placementAffinityRuleRuleType : values()) {
      if (placementAffinityRuleRuleType.value.equals(paramString))
        return placementAffinityRuleRuleType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
