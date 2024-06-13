package com.vmware.vim25;

import com.vmware.vim25.SoftwarePackageVibType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SoftwarePackageVibType")
@XmlEnum
public enum SoftwarePackageVibType {
  BOOTBANK("bootbank"),
  TOOLS("tools"),
  META("meta");
  
  private final String value;
  
  SoftwarePackageVibType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static SoftwarePackageVibType fromValue(String paramString) {
    for (SoftwarePackageVibType softwarePackageVibType : values()) {
      if (softwarePackageVibType.value.equals(paramString))
        return softwarePackageVibType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
