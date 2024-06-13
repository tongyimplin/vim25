package com.vmware.vim25;

import com.vmware.vim25.ClusterInfraUpdateHaConfigInfoRemediationType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterInfraUpdateHaConfigInfoRemediationType")
@XmlEnum
public enum ClusterInfraUpdateHaConfigInfoRemediationType {
  QUARANTINE_MODE("QuarantineMode"),
  MAINTENANCE_MODE("MaintenanceMode");
  
  private final String value;
  
  ClusterInfraUpdateHaConfigInfoRemediationType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterInfraUpdateHaConfigInfoRemediationType fromValue(String paramString) {
    for (ClusterInfraUpdateHaConfigInfoRemediationType clusterInfraUpdateHaConfigInfoRemediationType : values()) {
      if (clusterInfraUpdateHaConfigInfoRemediationType.value.equals(paramString))
        return clusterInfraUpdateHaConfigInfoRemediationType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
