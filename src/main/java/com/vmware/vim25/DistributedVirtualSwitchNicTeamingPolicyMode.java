package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchNicTeamingPolicyMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DistributedVirtualSwitchNicTeamingPolicyMode")
@XmlEnum
public enum DistributedVirtualSwitchNicTeamingPolicyMode {
  LOADBALANCE_IP("loadbalance_ip"),
  LOADBALANCE_SRCMAC("loadbalance_srcmac"),
  LOADBALANCE_SRCID("loadbalance_srcid"),
  FAILOVER_EXPLICIT("failover_explicit"),
  LOADBALANCE_LOADBASED("loadbalance_loadbased");
  
  private final String value;
  
  DistributedVirtualSwitchNicTeamingPolicyMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DistributedVirtualSwitchNicTeamingPolicyMode fromValue(String paramString) {
    for (DistributedVirtualSwitchNicTeamingPolicyMode distributedVirtualSwitchNicTeamingPolicyMode : values()) {
      if (distributedVirtualSwitchNicTeamingPolicyMode.value.equals(paramString))
        return distributedVirtualSwitchNicTeamingPolicyMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
