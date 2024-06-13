package com.vmware.vim25;

import com.vmware.vim25.HostFirewallRuleProtocol;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostFirewallRuleProtocol")
@XmlEnum
public enum HostFirewallRuleProtocol {
  TCP("tcp"),
  UDP("udp");
  
  private final String value;
  
  HostFirewallRuleProtocol(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostFirewallRuleProtocol fromValue(String paramString) {
    for (HostFirewallRuleProtocol hostFirewallRuleProtocol : values()) {
      if (hostFirewallRuleProtocol.value.equals(paramString))
        return hostFirewallRuleProtocol; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
