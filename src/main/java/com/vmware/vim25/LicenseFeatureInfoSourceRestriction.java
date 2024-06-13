package com.vmware.vim25;

import com.vmware.vim25.LicenseFeatureInfoSourceRestriction;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "LicenseFeatureInfoSourceRestriction")
@XmlEnum
public enum LicenseFeatureInfoSourceRestriction {
  UNRESTRICTED("unrestricted"),
  SERVED("served"),
  FILE("file");
  
  private final String value;
  
  LicenseFeatureInfoSourceRestriction(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static LicenseFeatureInfoSourceRestriction fromValue(String paramString) {
    for (LicenseFeatureInfoSourceRestriction licenseFeatureInfoSourceRestriction : values()) {
      if (licenseFeatureInfoSourceRestriction.value.equals(paramString))
        return licenseFeatureInfoSourceRestriction; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
