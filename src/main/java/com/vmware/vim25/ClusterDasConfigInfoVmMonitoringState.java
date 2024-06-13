package com.vmware.vim25;

import com.vmware.vim25.ClusterDasConfigInfoVmMonitoringState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterDasConfigInfoVmMonitoringState")
@XmlEnum
public enum ClusterDasConfigInfoVmMonitoringState {
  VM_MONITORING_DISABLED("vmMonitoringDisabled"),
  VM_MONITORING_ONLY("vmMonitoringOnly"),
  VM_AND_APP_MONITORING("vmAndAppMonitoring");
  
  private final String value;
  
  ClusterDasConfigInfoVmMonitoringState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterDasConfigInfoVmMonitoringState fromValue(String paramString) {
    for (ClusterDasConfigInfoVmMonitoringState clusterDasConfigInfoVmMonitoringState : values()) {
      if (clusterDasConfigInfoVmMonitoringState.value.equals(paramString))
        return clusterDasConfigInfoVmMonitoringState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
