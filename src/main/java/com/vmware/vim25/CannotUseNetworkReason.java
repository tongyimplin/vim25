package com.vmware.vim25;

import com.vmware.vim25.CannotUseNetworkReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CannotUseNetworkReason")
@XmlEnum
public enum CannotUseNetworkReason {
  NETWORK_RESERVATION_NOT_SUPPORTED("NetworkReservationNotSupported"),
  MISMATCHED_NETWORK_POLICIES("MismatchedNetworkPolicies"),
  MISMATCHED_DVS_VERSION_OR_VENDOR("MismatchedDvsVersionOrVendor"),
  V_MOTION_TO_UNSUPPORTED_NETWORK_TYPE("VMotionToUnsupportedNetworkType"),
  NETWORK_UNDER_MAINTENANCE("NetworkUnderMaintenance"),
  MISMATCHED_ENS_MODE("MismatchedEnsMode");
  
  private final String value;
  
  CannotUseNetworkReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static CannotUseNetworkReason fromValue(String paramString) {
    for (CannotUseNetworkReason cannotUseNetworkReason : values()) {
      if (cannotUseNetworkReason.value.equals(paramString))
        return cannotUseNetworkReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
