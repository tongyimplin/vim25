package com.vmware.vim25;

import com.vmware.vim25.PlacementAffinityRuleRuleScope;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PlacementAffinityRuleRuleScope")
@XmlEnum
public enum PlacementAffinityRuleRuleScope {
  CLUSTER("cluster"),
  HOST("host"),
  STORAGE_POD("storagePod"),
  DATASTORE("datastore");
  
  private final String value;
  
  PlacementAffinityRuleRuleScope(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static PlacementAffinityRuleRuleScope fromValue(String paramString) {
    for (PlacementAffinityRuleRuleScope placementAffinityRuleRuleScope : values()) {
      if (placementAffinityRuleRuleScope.value.equals(paramString))
        return placementAffinityRuleRuleScope; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
