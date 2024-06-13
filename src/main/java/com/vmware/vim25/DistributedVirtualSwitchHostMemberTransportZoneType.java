package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostMemberTransportZoneType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DistributedVirtualSwitchHostMemberTransportZoneType")
@XmlEnum
public enum DistributedVirtualSwitchHostMemberTransportZoneType {
  VLAN("vlan"),
  OVERLAY("overlay");
  
  private final String value;
  
  DistributedVirtualSwitchHostMemberTransportZoneType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DistributedVirtualSwitchHostMemberTransportZoneType fromValue(String paramString) {
    for (DistributedVirtualSwitchHostMemberTransportZoneType distributedVirtualSwitchHostMemberTransportZoneType : values()) {
      if (distributedVirtualSwitchHostMemberTransportZoneType.value.equals(paramString))
        return distributedVirtualSwitchHostMemberTransportZoneType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
