package com.vmware.vim25;

import com.vmware.vim25.ThirdPartyLicenseAssignmentFailedReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ThirdPartyLicenseAssignmentFailedReason")
@XmlEnum
public enum ThirdPartyLicenseAssignmentFailedReason {
  LICENSE_ASSIGNMENT_FAILED("licenseAssignmentFailed"),
  MODULE_NOT_INSTALLED("moduleNotInstalled");
  
  private final String value;
  
  ThirdPartyLicenseAssignmentFailedReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ThirdPartyLicenseAssignmentFailedReason fromValue(String paramString) {
    for (ThirdPartyLicenseAssignmentFailedReason thirdPartyLicenseAssignmentFailedReason : values()) {
      if (thirdPartyLicenseAssignmentFailedReason.value.equals(paramString))
        return thirdPartyLicenseAssignmentFailedReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
