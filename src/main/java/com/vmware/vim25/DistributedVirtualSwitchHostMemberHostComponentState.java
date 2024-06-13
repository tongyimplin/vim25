package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostMemberHostComponentState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DistributedVirtualSwitchHostMemberHostComponentState")
@XmlEnum
public enum DistributedVirtualSwitchHostMemberHostComponentState {
  UP("up"),
  PENDING("pending"),
  OUT_OF_SYNC("outOfSync"),
  WARNING("warning"),
  DISCONNECTED("disconnected"),
  DOWN("down");
  
  private final String value;
  
  DistributedVirtualSwitchHostMemberHostComponentState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DistributedVirtualSwitchHostMemberHostComponentState fromValue(String paramString) {
    for (DistributedVirtualSwitchHostMemberHostComponentState distributedVirtualSwitchHostMemberHostComponentState : values()) {
      if (distributedVirtualSwitchHostMemberHostComponentState.value.equals(paramString))
        return distributedVirtualSwitchHostMemberHostComponentState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
