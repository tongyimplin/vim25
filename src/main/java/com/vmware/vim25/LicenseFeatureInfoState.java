package com.vmware.vim25;

import com.vmware.vim25.LicenseFeatureInfoState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "LicenseFeatureInfoState")
@XmlEnum
public enum LicenseFeatureInfoState {
  ENABLED("enabled"),
  DISABLED("disabled"),
  OPTIONAL("optional");
  
  private final String value;
  
  LicenseFeatureInfoState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static LicenseFeatureInfoState fromValue(String paramString) {
    for (LicenseFeatureInfoState licenseFeatureInfoState : values()) {
      if (licenseFeatureInfoState.value.equals(paramString))
        return licenseFeatureInfoState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
