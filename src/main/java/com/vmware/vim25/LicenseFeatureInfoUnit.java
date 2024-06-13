package com.vmware.vim25;

import com.vmware.vim25.LicenseFeatureInfoUnit;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "LicenseFeatureInfoUnit")
@XmlEnum
public enum LicenseFeatureInfoUnit {
  HOST("host"),
  CPU_CORE("cpuCore"),
  CPU_PACKAGE("cpuPackage"),
  SERVER("server"),
  VM("vm");
  
  private final String value;
  
  LicenseFeatureInfoUnit(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static LicenseFeatureInfoUnit fromValue(String paramString) {
    for (LicenseFeatureInfoUnit licenseFeatureInfoUnit : values()) {
      if (licenseFeatureInfoUnit.value.equals(paramString))
        return licenseFeatureInfoUnit; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
