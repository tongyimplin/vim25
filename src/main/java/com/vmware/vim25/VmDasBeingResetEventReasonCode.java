package com.vmware.vim25;

import com.vmware.vim25.VmDasBeingResetEventReasonCode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VmDasBeingResetEventReasonCode")
@XmlEnum
public enum VmDasBeingResetEventReasonCode {
  VMTOOLS_HEARTBEAT_FAILURE("vmtoolsHeartbeatFailure"),
  APP_HEARTBEAT_FAILURE("appHeartbeatFailure"),
  APP_IMMEDIATE_RESET_REQUEST("appImmediateResetRequest"),
  VMCP_RESET_APD_CLEARED("vmcpResetApdCleared");
  
  private final String value;
  
  VmDasBeingResetEventReasonCode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VmDasBeingResetEventReasonCode fromValue(String paramString) {
    for (VmDasBeingResetEventReasonCode vmDasBeingResetEventReasonCode : values()) {
      if (vmDasBeingResetEventReasonCode.value.equals(paramString))
        return vmDasBeingResetEventReasonCode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
