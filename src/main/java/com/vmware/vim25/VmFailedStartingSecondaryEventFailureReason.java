package com.vmware.vim25;

import com.vmware.vim25.VmFailedStartingSecondaryEventFailureReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VmFailedStartingSecondaryEventFailureReason")
@XmlEnum
public enum VmFailedStartingSecondaryEventFailureReason {
  INCOMPATIBLE_HOST("incompatibleHost"),
  LOGIN_FAILED("loginFailed"),
  REGISTER_VM_FAILED("registerVmFailed"),
  MIGRATE_FAILED("migrateFailed");
  
  private final String value;
  
  VmFailedStartingSecondaryEventFailureReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VmFailedStartingSecondaryEventFailureReason fromValue(String paramString) {
    for (VmFailedStartingSecondaryEventFailureReason vmFailedStartingSecondaryEventFailureReason : values()) {
      if (vmFailedStartingSecondaryEventFailureReason.value.equals(paramString))
        return vmFailedStartingSecondaryEventFailureReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
