package com.vmware.vim25;

import com.vmware.vim25.CustomizationLicenseDataMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CustomizationLicenseDataMode")
@XmlEnum
public enum CustomizationLicenseDataMode {
  PER_SERVER("perServer"),
  PER_SEAT("perSeat");
  
  private final String value;
  
  CustomizationLicenseDataMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static CustomizationLicenseDataMode fromValue(String paramString) {
    for (CustomizationLicenseDataMode customizationLicenseDataMode : values()) {
      if (customizationLicenseDataMode.value.equals(paramString))
        return customizationLicenseDataMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
