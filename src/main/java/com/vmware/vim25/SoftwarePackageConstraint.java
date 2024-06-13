package com.vmware.vim25;

import com.vmware.vim25.SoftwarePackageConstraint;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SoftwarePackageConstraint")
@XmlEnum
public enum SoftwarePackageConstraint {
  EQUALS("equals"),
  LESS_THAN("lessThan"),
  LESS_THAN_EQUAL("lessThanEqual"),
  GREATER_THAN_EQUAL("greaterThanEqual"),
  GREATER_THAN("greaterThan");
  
  private final String value;
  
  SoftwarePackageConstraint(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static SoftwarePackageConstraint fromValue(String paramString) {
    for (SoftwarePackageConstraint softwarePackageConstraint : values()) {
      if (softwarePackageConstraint.value.equals(paramString))
        return softwarePackageConstraint; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
