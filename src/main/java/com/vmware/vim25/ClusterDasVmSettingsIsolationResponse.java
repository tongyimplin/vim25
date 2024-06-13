package com.vmware.vim25;

import com.vmware.vim25.ClusterDasVmSettingsIsolationResponse;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterDasVmSettingsIsolationResponse")
@XmlEnum
public enum ClusterDasVmSettingsIsolationResponse {
  NONE("none"),
  POWER_OFF("powerOff"),
  SHUTDOWN("shutdown"),
  CLUSTER_ISOLATION_RESPONSE("clusterIsolationResponse");
  
  private final String value;
  
  ClusterDasVmSettingsIsolationResponse(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterDasVmSettingsIsolationResponse fromValue(String paramString) {
    for (ClusterDasVmSettingsIsolationResponse clusterDasVmSettingsIsolationResponse : values()) {
      if (clusterDasVmSettingsIsolationResponse.value.equals(paramString))
        return clusterDasVmSettingsIsolationResponse; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
