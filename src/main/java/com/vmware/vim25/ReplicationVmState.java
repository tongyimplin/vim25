package com.vmware.vim25;

import com.vmware.vim25.ReplicationVmState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ReplicationVmState")
@XmlEnum
public enum ReplicationVmState {
  NONE("none"),
  PAUSED("paused"),
  SYNCING("syncing"),
  IDLE("idle"),
  ACTIVE("active"),
  ERROR("error");
  
  private final String value;
  
  ReplicationVmState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ReplicationVmState fromValue(String paramString) {
    for (ReplicationVmState replicationVmState : values()) {
      if (replicationVmState.value.equals(paramString))
        return replicationVmState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
