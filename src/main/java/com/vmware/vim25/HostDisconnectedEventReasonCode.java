package com.vmware.vim25;

import com.vmware.vim25.HostDisconnectedEventReasonCode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostDisconnectedEventReasonCode")
@XmlEnum
public enum HostDisconnectedEventReasonCode {
  SSL_THUMBPRINT_VERIFY_FAILED("sslThumbprintVerifyFailed"),
  LICENSE_EXPIRED("licenseExpired"),
  AGENT_UPGRADE("agentUpgrade"),
  USER_REQUEST("userRequest"),
  INSUFFICIENT_LICENSES("insufficientLicenses"),
  AGENT_OUT_OF_DATE("agentOutOfDate"),
  PASSWORD_DECRYPT_FAILURE("passwordDecryptFailure"),
  UNKNOWN("unknown"),
  VC_VRAM_CAPACITY_EXCEEDED("vcVRAMCapacityExceeded");
  
  private final String value;
  
  HostDisconnectedEventReasonCode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostDisconnectedEventReasonCode fromValue(String paramString) {
    for (HostDisconnectedEventReasonCode hostDisconnectedEventReasonCode : values()) {
      if (hostDisconnectedEventReasonCode.value.equals(paramString))
        return hostDisconnectedEventReasonCode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
