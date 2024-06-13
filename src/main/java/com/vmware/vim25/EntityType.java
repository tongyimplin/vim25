package com.vmware.vim25;

import com.vmware.vim25.EntityType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EntityType")
@XmlEnum
public enum EntityType {
  DISTRIBUTED_VIRTUAL_SWITCH("distributedVirtualSwitch"),
  DISTRIBUTED_VIRTUAL_PORTGROUP("distributedVirtualPortgroup");
  
  private final String value;
  
  EntityType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static EntityType fromValue(String paramString) {
    for (EntityType entityType : values()) {
      if (entityType.value.equals(paramString))
        return entityType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
