package com.vmware.vim25;

import com.vmware.vim25.EntityImportType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EntityImportType")
@XmlEnum
public enum EntityImportType {
  CREATE_ENTITY_WITH_NEW_IDENTIFIER("createEntityWithNewIdentifier"),
  CREATE_ENTITY_WITH_ORIGINAL_IDENTIFIER("createEntityWithOriginalIdentifier"),
  APPLY_TO_ENTITY_SPECIFIED("applyToEntitySpecified");
  
  private final String value;
  
  EntityImportType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static EntityImportType fromValue(String paramString) {
    for (EntityImportType entityImportType : values()) {
      if (entityImportType.value.equals(paramString))
        return entityImportType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
