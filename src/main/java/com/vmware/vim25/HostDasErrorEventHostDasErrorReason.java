package com.vmware.vim25;

import com.vmware.vim25.HostDasErrorEventHostDasErrorReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostDasErrorEventHostDasErrorReason")
@XmlEnum
public enum HostDasErrorEventHostDasErrorReason {
  CONFIG_FAILED("configFailed"),
  TIMEOUT("timeout"),
  COMMUNICATION_INIT_FAILED("communicationInitFailed"),
  HEALTH_CHECK_SCRIPT_FAILED("healthCheckScriptFailed"),
  AGENT_FAILED("agentFailed"),
  AGENT_SHUTDOWN("agentShutdown"),
  ISOLATION_ADDRESS_UNPINGABLE("isolationAddressUnpingable"),
  OTHER("other");
  
  private final String value;
  
  HostDasErrorEventHostDasErrorReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostDasErrorEventHostDasErrorReason fromValue(String paramString) {
    for (HostDasErrorEventHostDasErrorReason hostDasErrorEventHostDasErrorReason : values()) {
      if (hostDasErrorEventHostDasErrorReason.value.equals(paramString))
        return hostDasErrorEventHostDasErrorReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
