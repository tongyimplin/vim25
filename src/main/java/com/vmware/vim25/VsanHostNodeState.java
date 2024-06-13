package com.vmware.vim25;

import com.vmware.vim25.VsanHostNodeState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VsanHostNodeState")
@XmlEnum
public enum VsanHostNodeState {
  ERROR("error"),
  DISABLED("disabled"),
  AGENT("agent"),
  MASTER("master"),
  BACKUP("backup"),
  STARTING("starting"),
  STOPPING("stopping"),
  ENTERING_MAINTENANCE_MODE("enteringMaintenanceMode"),
  EXITING_MAINTENANCE_MODE("exitingMaintenanceMode"),
  DECOMMISSIONING("decommissioning");
  
  private final String value;
  
  VsanHostNodeState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VsanHostNodeState fromValue(String paramString) {
    for (VsanHostNodeState vsanHostNodeState : values()) {
      if (vsanHostNodeState.value.equals(paramString))
        return vsanHostNodeState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
