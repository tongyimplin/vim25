package com.vmware.vim25;

import com.vmware.vim25.ClusterDasConfigInfoServiceState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterDasConfigInfoServiceState")
@XmlEnum
public enum ClusterDasConfigInfoServiceState {
  DISABLED("disabled"),
  ENABLED("enabled");
  
  private final String value;
  
  ClusterDasConfigInfoServiceState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterDasConfigInfoServiceState fromValue(String paramString) {
    for (ClusterDasConfigInfoServiceState clusterDasConfigInfoServiceState : values()) {
      if (clusterDasConfigInfoServiceState.value.equals(paramString))
        return clusterDasConfigInfoServiceState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
