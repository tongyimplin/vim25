package com.vmware.vim25;

import com.vmware.vim25.ProfileParameterMetadataRelationType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ProfileParameterMetadataRelationType")
@XmlEnum
public enum ProfileParameterMetadataRelationType {
  DYNAMIC_RELATION("dynamic_relation"),
  EXTENSIBLE_RELATION("extensible_relation"),
  LOCALIZABLE_RELATION("localizable_relation"),
  STATIC_RELATION("static_relation"),
  VALIDATION_RELATION("validation_relation");
  
  private final String value;
  
  ProfileParameterMetadataRelationType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ProfileParameterMetadataRelationType fromValue(String paramString) {
    for (ProfileParameterMetadataRelationType profileParameterMetadataRelationType : values()) {
      if (profileParameterMetadataRelationType.value.equals(paramString))
        return profileParameterMetadataRelationType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
