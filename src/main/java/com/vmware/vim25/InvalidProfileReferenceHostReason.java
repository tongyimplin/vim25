package com.vmware.vim25;

import com.vmware.vim25.InvalidProfileReferenceHostReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "InvalidProfileReferenceHostReason")
@XmlEnum
public enum InvalidProfileReferenceHostReason {
  INCOMPATIBLE_VERSION("incompatibleVersion"),
  MISSING_REFERENCE_HOST("missingReferenceHost");
  
  private final String value;
  
  InvalidProfileReferenceHostReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static InvalidProfileReferenceHostReason fromValue(String paramString) {
    for (InvalidProfileReferenceHostReason invalidProfileReferenceHostReason : values()) {
      if (invalidProfileReferenceHostReason.value.equals(paramString))
        return invalidProfileReferenceHostReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
