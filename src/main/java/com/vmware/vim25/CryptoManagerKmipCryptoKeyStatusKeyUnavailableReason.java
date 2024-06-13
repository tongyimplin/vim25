package com.vmware.vim25;

import com.vmware.vim25.CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason")
@XmlEnum
public enum CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason {
  KEY_STATE_MISSING_IN_CACHE("KeyStateMissingInCache"),
  KEY_STATE_CLUSTER_INVALID("KeyStateClusterInvalid"),
  KEY_STATE_CLUSTER_UNREACHABLE("KeyStateClusterUnreachable"),
  KEY_STATE_MISSING_IN_KMS("KeyStateMissingInKMS"),
  KEY_STATE_NOT_ACTIVE_OR_ENABLED("KeyStateNotActiveOrEnabled"),
  KEY_STATE_MANAGED_BY_TRUST_AUTHORITY("KeyStateManagedByTrustAuthority");
  
  private final String value;
  
  CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason fromValue(String paramString) {
    for (CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason cryptoManagerKmipCryptoKeyStatusKeyUnavailableReason : values()) {
      if (cryptoManagerKmipCryptoKeyStatusKeyUnavailableReason.value.equals(paramString))
        return cryptoManagerKmipCryptoKeyStatusKeyUnavailableReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
