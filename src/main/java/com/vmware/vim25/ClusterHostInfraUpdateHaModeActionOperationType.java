package com.vmware.vim25;

import com.vmware.vim25.ClusterHostInfraUpdateHaModeActionOperationType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterHostInfraUpdateHaModeActionOperationType")
@XmlEnum
public enum ClusterHostInfraUpdateHaModeActionOperationType {
  ENTER_QUARANTINE("enterQuarantine"),
  EXIT_QUARANTINE("exitQuarantine"),
  ENTER_MAINTENANCE("enterMaintenance");
  
  private final String value;
  
  ClusterHostInfraUpdateHaModeActionOperationType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterHostInfraUpdateHaModeActionOperationType fromValue(String paramString) {
    for (ClusterHostInfraUpdateHaModeActionOperationType clusterHostInfraUpdateHaModeActionOperationType : values()) {
      if (clusterHostInfraUpdateHaModeActionOperationType.value.equals(paramString))
        return clusterHostInfraUpdateHaModeActionOperationType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
