package com.vmware.vim25;

import com.vmware.vim25.ScsiLunState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ScsiLunState")
@XmlEnum
public enum ScsiLunState {
  UNKNOWN_STATE("unknownState"),
  OK("ok"),
  ERROR("error"),
  OFF("off"),
  QUIESCED("quiesced"),
  DEGRADED("degraded"),
  LOST_COMMUNICATION("lostCommunication"),
  TIMEOUT("timeout");
  
  private final String value;
  
  ScsiLunState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ScsiLunState fromValue(String paramString) {
    for (ScsiLunState scsiLunState : values()) {
      if (scsiLunState.value.equals(paramString))
        return scsiLunState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
