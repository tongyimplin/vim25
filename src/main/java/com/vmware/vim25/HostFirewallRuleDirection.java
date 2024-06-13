package com.vmware.vim25;

import com.vmware.vim25.HostFirewallRuleDirection;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostFirewallRuleDirection")
@XmlEnum
public enum HostFirewallRuleDirection {
  INBOUND("inbound"),
  OUTBOUND("outbound");
  
  private final String value;
  
  HostFirewallRuleDirection(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostFirewallRuleDirection fromValue(String paramString) {
    for (HostFirewallRuleDirection hostFirewallRuleDirection : values()) {
      if (hostFirewallRuleDirection.value.equals(paramString))
        return hostFirewallRuleDirection; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
