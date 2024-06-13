package com.vmware.vim25;

import com.vmware.vim25.DatastoreSummaryMaintenanceModeState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DatastoreSummaryMaintenanceModeState")
@XmlEnum
public enum DatastoreSummaryMaintenanceModeState {
  NORMAL("normal"),
  ENTERING_MAINTENANCE("enteringMaintenance"),
  IN_MAINTENANCE("inMaintenance");
  
  private final String value;
  
  DatastoreSummaryMaintenanceModeState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DatastoreSummaryMaintenanceModeState fromValue(String paramString) {
    for (DatastoreSummaryMaintenanceModeState datastoreSummaryMaintenanceModeState : values()) {
      if (datastoreSummaryMaintenanceModeState.value.equals(paramString))
        return datastoreSummaryMaintenanceModeState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
