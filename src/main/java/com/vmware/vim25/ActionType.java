package com.vmware.vim25;

import com.vmware.vim25.ActionType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ActionType")
@XmlEnum
public enum ActionType {
  MIGRATION_V_1("MigrationV1"),
  VM_POWER_V_1("VmPowerV1"),
  HOST_POWER_V_1("HostPowerV1"),
  HOST_MAINTENANCE_V_1("HostMaintenanceV1"),
  STORAGE_MIGRATION_V_1("StorageMigrationV1"),
  STORAGE_PLACEMENT_V_1("StoragePlacementV1"),
  PLACEMENT_V_1("PlacementV1"),
  HOST_INFRA_UPDATE_HA_V_1("HostInfraUpdateHaV1");
  
  private final String value;
  
  ActionType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ActionType fromValue(String paramString) {
    for (ActionType actionType : values()) {
      if (actionType.value.equals(paramString))
        return actionType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
