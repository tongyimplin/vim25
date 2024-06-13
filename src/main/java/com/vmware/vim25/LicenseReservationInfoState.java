package com.vmware.vim25;

import com.vmware.vim25.LicenseReservationInfoState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "LicenseReservationInfoState")
@XmlEnum
public enum LicenseReservationInfoState {
  NOT_USED("notUsed"),
  NO_LICENSE("noLicense"),
  UNLICENSED_USE("unlicensedUse"),
  LICENSED("licensed");
  
  private final String value;
  
  LicenseReservationInfoState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static LicenseReservationInfoState fromValue(String paramString) {
    for (LicenseReservationInfoState licenseReservationInfoState : values()) {
      if (licenseReservationInfoState.value.equals(paramString))
        return licenseReservationInfoState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
