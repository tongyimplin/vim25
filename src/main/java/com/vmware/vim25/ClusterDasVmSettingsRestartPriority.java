package com.vmware.vim25;

import com.vmware.vim25.ClusterDasVmSettingsRestartPriority;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterDasVmSettingsRestartPriority")
@XmlEnum
public enum ClusterDasVmSettingsRestartPriority {
  DISABLED("disabled"),
  LOWEST("lowest"),
  LOW("low"),
  MEDIUM("medium"),
  HIGH("high"),
  HIGHEST("highest"),
  CLUSTER_RESTART_PRIORITY("clusterRestartPriority");
  
  private final String value;
  
  ClusterDasVmSettingsRestartPriority(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterDasVmSettingsRestartPriority fromValue(String paramString) {
    for (ClusterDasVmSettingsRestartPriority clusterDasVmSettingsRestartPriority : values()) {
      if (clusterDasVmSettingsRestartPriority.value.equals(paramString))
        return clusterDasVmSettingsRestartPriority; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
