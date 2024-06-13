package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceHCIWorkflowState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterComputeResourceHCIWorkflowState")
@XmlEnum
public enum ClusterComputeResourceHCIWorkflowState {
  IN_PROGRESS("in_progress"),
  DONE("done"),
  INVALID("invalid");
  
  private final String value;
  
  ClusterComputeResourceHCIWorkflowState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterComputeResourceHCIWorkflowState fromValue(String paramString) {
    for (ClusterComputeResourceHCIWorkflowState clusterComputeResourceHCIWorkflowState : values()) {
      if (clusterComputeResourceHCIWorkflowState.value.equals(paramString))
        return clusterComputeResourceHCIWorkflowState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
