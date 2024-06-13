package com.vmware.vim25;

import com.vmware.vim25.HostSnmpAgentCapability;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostSnmpAgentCapability")
@XmlEnum
public enum HostSnmpAgentCapability {
  COMPLETE, DIAGNOSTICS, CONFIGURATION;
  
  public String value() {
    return name();
  }
  
  public static HostSnmpAgentCapability fromValue(String paramString) {
    return valueOf(paramString);
  }
}
