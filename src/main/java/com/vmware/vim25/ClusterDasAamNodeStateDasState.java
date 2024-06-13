package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAamNodeStateDasState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterDasAamNodeStateDasState")
@XmlEnum
public enum ClusterDasAamNodeStateDasState {
  UNINITIALIZED("uninitialized"),
  INITIALIZED("initialized"),
  CONFIGURING("configuring"),
  UNCONFIGURING("unconfiguring"),
  RUNNING("running"),
  ERROR("error"),
  AGENT_SHUTDOWN("agentShutdown"),
  NODE_FAILED("nodeFailed");
  
  private final String value;
  
  ClusterDasAamNodeStateDasState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterDasAamNodeStateDasState fromValue(String paramString) {
    for (ClusterDasAamNodeStateDasState clusterDasAamNodeStateDasState : values()) {
      if (clusterDasAamNodeStateDasState.value.equals(paramString))
        return clusterDasAamNodeStateDasState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
