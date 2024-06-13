package com.vmware.vim25;

import com.vmware.vim25.ClusterVmReadinessReadyCondition;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterVmReadinessReadyCondition")
@XmlEnum
public enum ClusterVmReadinessReadyCondition {
  NONE("none"),
  POWERED_ON("poweredOn"),
  GUEST_HB_STATUS_GREEN("guestHbStatusGreen"),
  APP_HB_STATUS_GREEN("appHbStatusGreen"),
  USE_CLUSTER_DEFAULT("useClusterDefault");
  
  private final String value;
  
  ClusterVmReadinessReadyCondition(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterVmReadinessReadyCondition fromValue(String paramString) {
    for (ClusterVmReadinessReadyCondition clusterVmReadinessReadyCondition : values()) {
      if (clusterVmReadinessReadyCondition.value.equals(paramString))
        return clusterVmReadinessReadyCondition; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
