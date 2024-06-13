package com.vmware.vim25;

import com.vmware.vim25.ValidateMigrationTestType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ValidateMigrationTestType")
@XmlEnum
public enum ValidateMigrationTestType {
  SOURCE_TESTS("sourceTests"),
  COMPATIBILITY_TESTS("compatibilityTests"),
  DISK_ACCESSIBILITY_TESTS("diskAccessibilityTests"),
  RESOURCE_TESTS("resourceTests");
  
  private final String value;
  
  ValidateMigrationTestType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ValidateMigrationTestType fromValue(String paramString) {
    for (ValidateMigrationTestType validateMigrationTestType : values()) {
      if (validateMigrationTestType.value.equals(paramString))
        return validateMigrationTestType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
