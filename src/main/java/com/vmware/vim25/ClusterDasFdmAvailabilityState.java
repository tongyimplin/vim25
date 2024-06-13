package com.vmware.vim25;

import com.vmware.vim25.ClusterDasFdmAvailabilityState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterDasFdmAvailabilityState")
@XmlEnum
public enum ClusterDasFdmAvailabilityState {
  UNINITIALIZED("uninitialized"),
  ELECTION("election"),
  MASTER("master"),
  CONNECTED_TO_MASTER("connectedToMaster"),
  NETWORK_PARTITIONED_FROM_MASTER("networkPartitionedFromMaster"),
  NETWORK_ISOLATED("networkIsolated"),
  HOST_DOWN("hostDown"),
  INITIALIZATION_ERROR("initializationError"),
  UNINITIALIZATION_ERROR("uninitializationError"),
  FDM_UNREACHABLE("fdmUnreachable");
  
  private final String value;
  
  ClusterDasFdmAvailabilityState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterDasFdmAvailabilityState fromValue(String paramString) {
    for (ClusterDasFdmAvailabilityState clusterDasFdmAvailabilityState : values()) {
      if (clusterDasFdmAvailabilityState.value.equals(paramString))
        return clusterDasFdmAvailabilityState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
