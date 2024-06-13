package com.vmware.vim25;

import com.vmware.vim25.ClusterInfraUpdateHaConfigInfoBehaviorType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterInfraUpdateHaConfigInfoBehaviorType")
@XmlEnum
public enum ClusterInfraUpdateHaConfigInfoBehaviorType {
  MANUAL("Manual"),
  AUTOMATED("Automated");
  
  private final String value;
  
  ClusterInfraUpdateHaConfigInfoBehaviorType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterInfraUpdateHaConfigInfoBehaviorType fromValue(String paramString) {
    for (ClusterInfraUpdateHaConfigInfoBehaviorType clusterInfraUpdateHaConfigInfoBehaviorType : values()) {
      if (clusterInfraUpdateHaConfigInfoBehaviorType.value.equals(paramString))
        return clusterInfraUpdateHaConfigInfoBehaviorType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
