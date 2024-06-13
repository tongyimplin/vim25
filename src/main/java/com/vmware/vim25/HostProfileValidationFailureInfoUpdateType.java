package com.vmware.vim25;

import com.vmware.vim25.HostProfileValidationFailureInfoUpdateType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostProfileValidationFailureInfoUpdateType")
@XmlEnum
public enum HostProfileValidationFailureInfoUpdateType {
  HOST_BASED("HostBased"),
  IMPORT("Import"),
  EDIT("Edit"),
  COMPOSE("Compose");
  
  private final String value;
  
  HostProfileValidationFailureInfoUpdateType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostProfileValidationFailureInfoUpdateType fromValue(String paramString) {
    for (HostProfileValidationFailureInfoUpdateType hostProfileValidationFailureInfoUpdateType : values()) {
      if (hostProfileValidationFailureInfoUpdateType.value.equals(paramString))
        return hostProfileValidationFailureInfoUpdateType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
