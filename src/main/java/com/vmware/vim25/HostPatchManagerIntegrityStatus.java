package com.vmware.vim25;

import com.vmware.vim25.HostPatchManagerIntegrityStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostPatchManagerIntegrityStatus")
@XmlEnum
public enum HostPatchManagerIntegrityStatus {
  VALIDATED("validated"),
  KEY_NOT_FOUND("keyNotFound"),
  KEY_REVOKED("keyRevoked"),
  KEY_EXPIRED("keyExpired"),
  DIGEST_MISMATCH("digestMismatch"),
  NOT_ENOUGH_SIGNATURES("notEnoughSignatures"),
  VALIDATION_ERROR("validationError");
  
  private final String value;
  
  HostPatchManagerIntegrityStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostPatchManagerIntegrityStatus fromValue(String paramString) {
    for (HostPatchManagerIntegrityStatus hostPatchManagerIntegrityStatus : values()) {
      if (hostPatchManagerIntegrityStatus.value.equals(paramString))
        return hostPatchManagerIntegrityStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
