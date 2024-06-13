package com.vmware.vim25;

import com.vmware.vim25.HostFirewallRulePortType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostFirewallRulePortType")
@XmlEnum
public enum HostFirewallRulePortType {
  SRC("src"),
  DST("dst");
  
  private final String value;
  
  HostFirewallRulePortType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostFirewallRulePortType fromValue(String paramString) {
    for (HostFirewallRulePortType hostFirewallRulePortType : values()) {
      if (hostFirewallRulePortType.value.equals(paramString))
        return hostFirewallRulePortType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
