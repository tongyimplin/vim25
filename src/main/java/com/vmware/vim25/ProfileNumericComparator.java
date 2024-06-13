package com.vmware.vim25;

import com.vmware.vim25.ProfileNumericComparator;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ProfileNumericComparator")
@XmlEnum
public enum ProfileNumericComparator {
  LESS_THAN("lessThan"),
  LESS_THAN_EQUAL("lessThanEqual"),
  EQUAL("equal"),
  NOT_EQUAL("notEqual"),
  GREATER_THAN_EQUAL("greaterThanEqual"),
  GREATER_THAN("greaterThan");
  
  private final String value;
  
  ProfileNumericComparator(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ProfileNumericComparator fromValue(String paramString) {
    for (ProfileNumericComparator profileNumericComparator : values()) {
      if (profileNumericComparator.value.equals(paramString))
        return profileNumericComparator; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
