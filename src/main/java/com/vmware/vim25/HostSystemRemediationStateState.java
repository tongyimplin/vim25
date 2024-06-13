package com.vmware.vim25;

import com.vmware.vim25.HostSystemRemediationStateState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostSystemRemediationStateState")
@XmlEnum
public enum HostSystemRemediationStateState {
  REMEDIATION_READY("remediationReady"),
  PRECHECK_REMEDIATION_RUNNING("precheckRemediationRunning"),
  PRECHECK_REMEDIATION_COMPLETE("precheckRemediationComplete"),
  PRECHECK_REMEDIATION_FAILED("precheckRemediationFailed"),
  REMEDIATION_RUNNING("remediationRunning"),
  REMEDIATION_FAILED("remediationFailed");
  
  private final String value;
  
  HostSystemRemediationStateState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostSystemRemediationStateState fromValue(String paramString) {
    for (HostSystemRemediationStateState hostSystemRemediationStateState : values()) {
      if (hostSystemRemediationStateState.value.equals(paramString))
        return hostSystemRemediationStateState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
